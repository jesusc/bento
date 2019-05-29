package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.utils.BindingUtils;

public class SiriusAdapter extends AbstractSiriusAdapter implements PendingTaskExecutor {

	private Result result;
	private List<Change<?>> changesToPerform;
	private List<EObject> toRemove;

	private SiriusModel siriusModel;
	private Trace<DiagramElementMapping, DiagramElementMapping> mappings = new Trace<>();
	
	
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
		this.siriusModel = this.result.getSiriusModel();
		this.changesToPerform = new ArrayList<>();
		this.toRemove = new ArrayList<>();
	}
	
	private String getAdaptedViewpointName() {
		return info.getComponentName() + "GraphicalView";
	}
	
	public Resource getSiriusResource() {
		return result.getSiriusResource();
	}
	
	@Override
	public Trace<DiagramElementMapping, DiagramElementMapping> getMappings() {
		return mappings;
	}
	
	public Result perform() {
		// TreeIterator<EObject> iterator = result.getSiriusResource().getAllContents();		
		
		List<? extends Viewpoint> viewpoints = siriusModel.allInstancesOf(Viewpoint.class);
		viewpoints.forEach(this::transformViewpoint);
		
		// The transformation of diagram descriptions also allows us to to all the meta-model information
		List<? extends DiagramDescription> descriptions = siriusModel.allInstancesOf(DiagramDescription.class);
		descriptions.forEach(this::handleDiagramDescription);
		
		// Node and Container mappings. As a side effect we generate an explicit mapping so that it is possible
		// to properly link node mappings later
		List<? extends AbstractNodeMapping> mappings = siriusModel.allInstancesOf(AbstractNodeMapping.class);
		mappings.forEach(this::handleAbstractNodeMapping);

		// Now edges
		List<? extends EdgeMapping> edges = siriusModel.allInstancesOf(EdgeMapping.class);
		edges.forEach(this::handleEdgeMapping);
		
		// Tool section
		List<? extends NodeCreationDescription> nodeTools = siriusModel.allInstancesOf(NodeCreationDescription.class);
		nodeTools.forEach(desc -> new SiriusPaletteAdapter(bindingSpec, info, result, this).applyTo(desc));

		List<? extends ContainerCreationDescription> containerTools = siriusModel.allInstancesOf(ContainerCreationDescription.class);
		containerTools.forEach(desc -> new SiriusPaletteAdapter(bindingSpec, info, result, this).applyTo(desc));

		List<? extends EdgeCreationDescription> edgeTools = siriusModel.allInstancesOf(EdgeCreationDescription.class);
		edgeTools.forEach(desc -> new SiriusPaletteAdapter(bindingSpec, info, result, this).applyTo(desc));
		
		changesToPerform.forEach(Change::apply);
		changesToPerform.clear();
		
		for(EObject o : toRemove) {
			EcoreUtil.delete(o);
		}
				
			/*
			 * 			// Styles
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
					
					final EClass domainClass; 
					if (node.isUseDomainElement()) {
						domainClass = getDomainClassAsEClass(node.getDomainClass());
					} else {
						// Relation based edge
						domainClass = SiriusUtils.getCommonDomainClass(node.getSourceMapping(), this::getDomainClassAsEClass);
					}
					final String labelExpr = label_.getLabelExpression();
					
					add(label_, notEmpty(labelExpr), (label) -> {
						String expression = adaptExpression(domainClass, labelExpr);
						label.setLabelExpression(expression);
					});				
				}
			}
*/

		return result;
	}


	private void handleEdgeMapping(EdgeMapping edgeMapping_) {
		final List<DiagramElementMapping> sourceMappings = new ArrayList<>(edgeMapping_.getSourceMapping());
		final List<DiagramElementMapping> targetMappings = new ArrayList<>(edgeMapping_.getTargetMapping());

		if (edgeMapping_.isUseDomainElement()) {
			// Element-based edge
			final EClass domainClass = getDomainClassAsEClass(edgeMapping_.getDomainClass());
			final String targetDomainClass = getTargetDomainClass1(edgeMapping_.getDomainClass());
			
			EdgeMapping edgeMappingToBeModified = EcoreUtil.copy(edgeMapping_);
			this.mappings.add(edgeMapping_, edgeMappingToBeModified);
			this.removeElement(edgeMapping_);
			
			add(edgeMappingToBeModified, (x) -> {
				edgeMappingToBeModified.setLabel(getLabelValue(edgeMappingToBeModified.getDomainClass()));

				// Add the created element
					EObject container = edgeMapping_.eContainer();
					((List<Object>) container.eGet(edgeMapping_.eContainingFeature())).add(edgeMappingToBeModified);
	
				edgeMappingToBeModified.setDomainClass(toSiriusClassName(targetDomainClass));
				
				List<DiagramElementMapping> mappedSources = mappings.getTargets(sourceMappings);
				List<DiagramElementMapping> mappedTargets = mappings.getTargets(targetMappings);
				
				edgeMappingToBeModified.getSourceMapping().clear();
				edgeMappingToBeModified.getTargetMapping().clear();

				edgeMappingToBeModified.getSourceMapping().addAll(mappedSources);
				edgeMappingToBeModified.getTargetMapping().addAll(mappedTargets);
				
				// sourceFinder
				// targetFinder
				// sourceMapping and targetMapping are references, which have already been changed
				
				String sourceFinderAdapted = adaptExpression(domainClass, edgeMappingToBeModified.getSourceFinderExpression());
				String targetFinderAdapted = adaptExpression(domainClass, edgeMappingToBeModified.getTargetFinderExpression());
			
				edgeMappingToBeModified.setSourceFinderExpression(sourceFinderAdapted);
				edgeMappingToBeModified.setTargetFinderExpression(targetFinderAdapted);
			});
		} else {
			// Relation-based edge
			EClass type = SiriusUtils.getCommonDomainClass(edgeMapping_.getSourceMapping(), this::getDomainClassAsEClass);
			// final String targetDomainClass = getTargetDomainClass1(type.getName());

			if ( isNotMappedToNone(type) ) {
				List<String> domainClasses = getTargetDomainClassN(type.getName());
				int i = 0;
				
				final String sourceFinderExpression = edgeMapping_.getSourceFinderExpression();
				final String targetFinderExpression = edgeMapping_.getTargetFinderExpression();
				
				for(String domainClass : domainClasses) {

					EdgeMapping edgeMappingToBeModified = EcoreUtil.copy(edgeMapping_);
					edgeMappingToBeModified.setName(edgeMapping_.getName() + "_" + domainClass);
					
					mappings.add(edgeMapping_, edgeMappingToBeModified);
					
					add(edgeMapping_, (edgeMapping) -> {
						// Add the created element
						EObject container = edgeMapping.eContainer();
						((List<Object>) container.eGet(edgeMapping.eContainingFeature())).add(edgeMappingToBeModified);
					});
						
					List<DiagramElementMapping> mappedSources = mappings.getTargets(sourceMappings);
					List<DiagramElementMapping> mappedTargets = mappings.getTargets(targetMappings);

					// We need to filter the mapped sources to get only those that has as source the
					// current mapping. 
					List<DiagramElementMapping> filteredSources = mappedSources.stream().filter(m -> getRawDomainClassName(SiriusUtils.getDomainClass(m)).equals(domainClass)).collect(Collectors.toList());
					if (filteredSources.size() != 1) 
						throw new IllegalStateException();
					
					
					edgeMappingToBeModified.getSourceMapping().clear();
					edgeMappingToBeModified.getTargetMapping().clear();

					edgeMappingToBeModified.getSourceMapping().addAll(filteredSources);
					edgeMappingToBeModified.getTargetMapping().addAll(mappedTargets);

			
					edgeMappingToBeModified.setLabel(getLabelValue(domainClass));
					
					edgeMappingToBeModified.setDomainClass(toSiriusClassName(domainClass));
	
					String sourceFinderAdapted = adaptExpression(type, sourceFinderExpression);
					String targetFinderAdapted = adaptExpression(type, targetFinderExpression);
				
					edgeMapping_.setSourceFinderExpression(sourceFinderAdapted);
					edgeMapping_.setTargetFinderExpression(targetFinderAdapted);
				
					i++;
				}
				
				this.removeElement(edgeMapping_);				
			} else {
				this.removeElement(edgeMapping_);			
			}
		}
		
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
		
		if (! isMappedToNone(originalDomainClass)) {		
			int i = 0;
			List<String> domainClasses = getTargetDomainClassN(nm_.getDomainClass());
			
			String name = nm_.getName();
			for(String domainClass : domainClasses) {
				String siriusClassName = toSiriusClassName(domainClass);
				
				AbstractNodeMapping nmMapped = EcoreUtil.copy(nm_);
				mappings.add(nm_, nmMapped);
				
				//if ( domainClasses.size() > 1 ) {
					nmMapped.setName(name + "_" + getRawDomainClassName(siriusClassName)); // + (i + 1));
					// nmMapped.setLabel(nmMapped.getLabel() + (i + 1));
					
					nmMapped.setLabel(name + "_" + getLabelValue(siriusClassName));
					
					// Add to the container in a more or less generic way
					add(nm_, (x) -> {
						EObject container = nm_.eContainer();
						((List<Object>) container.eGet(nm_.eContainingFeature())).add(nmMapped);
					});
					
				//} else {
					// TOOD: We need to be smart here: the original editor may have used the same name as the domain class
					//       or a custom one
					// nmMapped.setLabel(getLabelValue(nm.getDomainClass()));
				//}
				
				nmMapped.setDomainClass(siriusClassName);
				
				nmMapped.setPreconditionExpression(adaptExpression(originalDomainClass, preconditionExpression, domainClass));
	
				nmMapped.setSemanticCandidatesExpression(adaptExpression(containerDomainClass_, semanticCandidates, domainClass));


				// Map the styles
				TreeIterator<EObject> it = nmMapped.eAllContents();
				while (it.hasNext()) {
					EObject obj = it.next();
					if (obj instanceof BasicLabelStyleDescription) {
						BasicLabelStyleDescription label_ = (BasicLabelStyleDescription) obj;
			
						add(label_, (x) -> {
							String expression = adaptExpression(originalDomainClass, label_.getLabelExpression(), domainClass);
							label_.setLabelExpression(expression);
						});
					}
				}
				
				i++;
			}

			// Remove the object... I'm not sure that this is correct. Even more, if we have edges pointing to this mapping
			// we need to re-structure them properly (in particular if we N-plicate this!)
			removeElement(nm_);			
		} else {
			removeElement(nm_);
		}
	
			
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

	protected void removeElement(EObject o) {
		toRemove.add(o);
	}

}
