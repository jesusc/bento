package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.sirius.adapter.AbstractSiriusAdapter.Change;
import bento.utils.BindingUtils;
import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.RenamingFeatureBinding;

public class SiriusAdapter extends AbstractSiriusAdapter implements PendingTaskExecutor {

	private Result result;
	private List<Change<?>> changesToPerform;
	
	public static class Result {
		private Resource siriusResource;
		private List<EObject> notMapped = new ArrayList<EObject>();
		
		public Result(Resource siriusResource) {
			this.siriusResource = siriusResource;
		}
		
		public Resource getSiriusResource() {
			return siriusResource;
		}
		
		public SiriusModel getSiriusModel() {
			return new SiriusModel(this.siriusResource);
		}

		public List<? extends EObject> getNotMapped() {
			return notMapped;
		}
		
		public void addNotMapped(EObject obj) {
			this.notMapped.add(obj);
		}
		
	}
	
	public SiriusAdapter(String odesignFile, String bindingFile, String conceptName) {
		this(new ResourceSetImpl().getResource(URI.createURI(odesignFile), true),
				BindingUtils.readBindingDescription(bindingFile), conceptName, "generated");
	}
	
	public SiriusAdapter(Resource siriusResource, BindingModel bindingSpec, String conceptName, String componentName) {
		super(bindingSpec, new SiriusComponentInfo(conceptName, bindingSpec, componentName));
		this.result = new Result(siriusResource);
		this.changesToPerform = new ArrayList<>();
		
	}
	
	private String getAdaptedViewpointName() {
		return info.getComponentName() + "GraphicalView";
	}
	
	public Resource getSiriusResource() {
		return result.getSiriusResource();
	}
	
	public Result perform() {
		TreeIterator<EObject> iterator = result.getSiriusResource().getAllContents();		
		
		while (iterator.hasNext()) {
			EObject obj = iterator.next();

			if (obj instanceof Viewpoint) {
				transformViewpoint((Viewpoint) obj);
				
			// Mappings	
			} else if (obj instanceof DiagramDescription) {
				handleDiagramDescription((DiagramDescription) obj);				
			} else if (obj instanceof AbstractNodeMapping) {
				// Handles both NodeMapping and ContainerMapping
				handleAbstractNodeMapping((AbstractNodeMapping ) obj);
			} else if (obj instanceof EdgeMapping) {
				handleEdgeMapping((EdgeMapping) obj);
			
			// Styles
			} else if (obj instanceof BasicLabelStyleDescription) {
				BasicLabelStyleDescription label_ = (BasicLabelStyleDescription) obj;
				DiagramElementMapping mapping = getContainer(DiagramElementMapping.class, label_);
				
				// This is not the best idea. It would be better to go from each NodeMapping or EdgeMapping to the
				// corresponding styling objects
				if ( mapping instanceof NodeMapping ) {
					NodeMapping node = (NodeMapping) mapping;
					final EClass domainClass = getDomainClassAsEClass(node.getDomainClass());
	
					add(label_, isNotMappedToNone(domainClass), (label) -> {
						String expression = adaptExpression(domainClass, label.getLabelExpression());
						label.setLabelExpression(expression);
					});
				} else if ( mapping instanceof EdgeMapping ) {
					EdgeMapping node = (EdgeMapping) mapping;
					final EClass domainClass = getDomainClassAsEClass(node.getDomainClass());
					final String labelExpr = label_.getLabelExpression();
					
					add(label_, notEmpty(labelExpr), (label) -> {
						String expression = adaptExpression(domainClass, labelExpr);
						label.setLabelExpression(expression);
					});				
				}
			}


			// Actions - Palette
//			if (obj instanceof CreateInstance) {
//				CreateInstance instance_ = (CreateInstance) obj;
//				handleCreateInstance(instance_);				
//			}			

			
			if (obj instanceof NodeCreationDescription) {
				// Create node tool
				NodeCreationDescription desc = (NodeCreationDescription) obj;
				new SiriusPaletteAdapter(bindingSpec, info, result, this).applyTo(desc);
			} else if (obj instanceof EdgeCreationDescription ) {
				// Create edge tool
				EdgeCreationDescription desc = (EdgeCreationDescription) obj;
				new SiriusPaletteAdapter(bindingSpec, info, result, this).applyTo(desc);				
			}

		}

		for (Change<?> change : changesToPerform) {
			change.apply();
		}
				
		return result;
	}


	private void handleEdgeMapping(EdgeMapping edgeMapping_) {
		final EClass domainClass = getDomainClassAsEClass(edgeMapping_.getDomainClass());
		final String targetDomainClass = getTargetDomainClass1(edgeMapping_.getDomainClass());
		
		add(edgeMapping_, (edgeMapping) -> {
			edgeMapping.setLabel(getLabelValue(edgeMapping.getDomainClass()));

			edgeMapping.setDomainClass(toSiriusClassName(targetDomainClass));
			
			// sourceFinder
			// targetFinder
			// sourceMapping and targetMapping are references, which have already been changed
			
			String sourceFinderAdapted = adaptExpression(domainClass, edgeMapping.getSourceFinderExpression());
			String targetFinderAdapted = adaptExpression(domainClass, edgeMapping.getTargetFinderExpression());
		
			edgeMapping.setSourceFinderExpression(sourceFinderAdapted);
			edgeMapping.setTargetFinderExpression(targetFinderAdapted);
		});
	}

	private void handleAbstractNodeMapping(AbstractNodeMapping nm_) {
		final EClass originalDomainClass = getDomainClassAsEClass(nm_.getDomainClass());

		// Needed for semantic candidates
		EClass containerDomainClass = null;
		
		// Handling semanticCandidates is more delicate because "self" refers to a container element
		// which is implicit (I guess) in the DiagramDescription or if there is a parte node mapping.
		String semanticCandidates = nm_.getSemanticCandidatesExpression();
		if ( semanticCandidates != null && isNotMappedToNone(originalDomainClass) ) {
			// find the closest container element
			String containerClass = SiriusUtils.getClosestContainerClass(nm_);
			containerDomainClass = getDomainClassAsEClass(containerClass);
		}
		
		final EClass containerDomainClass_ = containerDomainClass;
		final String preconditionExpression = nm_.getPreconditionExpression();
		
		add(nm_, isNotMappedToNone(originalDomainClass), (nm) -> {
			int i = 0;
			List<String> domainClasses = getTargetDomainClassN(nm_.getDomainClass());
			
			String name = nm.getName();
			for(String domainClass : domainClasses) {
				AbstractNodeMapping nmMapped = nm_;
				String siriusClassName = toSiriusClassName(domainClass);
				
				if (i > 0) {
					nmMapped = EcoreUtil.copy(nm_);
				}
				
				if ( domainClasses.size() > 1 ) {
					nmMapped.setName(name + "_" + getRawDomainClassName(siriusClassName)); // + (i + 1));
					// nmMapped.setLabel(nmMapped.getLabel() + (i + 1));
					nmMapped.setLabel(name + "_" + getLabelValue(siriusClassName));
					
					// Add to the container in a more or less generic way
					EObject container = nm_.eContainer();
					((List<Object>) container.eGet(nm_.eContainingFeature())).add(nmMapped);					
				} else {
					// TOOD: We need to be smart here: the original editor may have used the same name as the domain class
					//       or a custom one
					nmMapped.setLabel(getLabelValue(nm.getDomainClass()));
				}
				
				nmMapped.setDomainClass(siriusClassName);
				
				nmMapped.setPreconditionExpression(adaptExpression(originalDomainClass, preconditionExpression, domainClass));
	
				nmMapped.setSemanticCandidatesExpression(adaptExpression(containerDomainClass_, semanticCandidates, domainClass));
			
				i++;
			}

		}, this::removeElement);

	
			
	}

	private void handleDiagramDescription(DiagramDescription dd_) {
		// This relies on the traversal order of the iterator, hoping that this is set before 
		// visiting the elements that uses the meta-model. Not the best idea ever...
		for (EPackage ePackage : dd_.getMetamodel()) {
			info.addSiriusMetamodel(ePackage.getName(), ePackage);
		}
		
		add(dd_, this::transformDiagramDescription);
	}

	private void transformDiagramDescription(DiagramDescription dd) {
		String domainClass = getTargetDomainClass1(dd.getDomainClass());
		dd.setDomainClass(toSiriusClassName(domainClass));
		
		// TODO: Find a way for the user to specify this values properly
		// For the moment, let's use the name of the root class
		dd.setName(domainClass.toLowerCase());
		dd.setLabel(domainClass.toLowerCase());
		
		// setName, setLabel using some given value
	
		// Change the underlying meta-model of the editor
		dd.getMetamodel().clear();
		for (IBoundMetamodelInfo mmInfo : info.getBoundMetamodels()) {
			EPackage pkg = getTargetMetamodelPackage(mmInfo.getBoundMetamodelName());
			dd.getMetamodel().add(pkg);
		}
	}

	private void transformViewpoint(Viewpoint vp) {
		// TODO: Set modelFileExtension				
		// setName, setLabel using some given value

		add(vp, vp_ -> {
			vp_.setName(getAdaptedViewpointName());					
		});
	}


	private <T extends EObject> void add(T obj, boolean filterResult, Consumer<T> consumer) {
		add(obj, filterResult, consumer, null);
	}
	
	private <T extends EObject> void add(T obj, boolean filterResult, Consumer<T> consumer, Consumer<T> remover) {
		if ( filterResult ) {
			add(obj, consumer);
		} else {
			if ( remover != null ) {
				add(obj, remover);
			}
		}
	}

	@Override
	public <T extends EObject> void add(T obj, Consumer<T> consumer) {
		Change<T> change = new Change<T>(obj, consumer);
		this.changesToPerform.add(change);
	}

	

}
