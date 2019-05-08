package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
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
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;

import anatlyzer.atlext.OCL.OclExpression;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.utils.BindingUtils;
import esolver.aql.AQL2ATL;
import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.RenamingFeatureBinding;

public class SiriusAdapter {

	private Result result;
	private BindingModel bindingSpec;
	private IComponentInfoForBinding info;
	private List<Change<?>> changesToPerform;
	private Map<String, EPackage> targetMetamodelNameToPackage;
	private Map<String, EPackage> siriusMetamodelNameToPackage;
	
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
				BindingUtils.readBindingDescription(bindingFile), conceptName);
	}
	
	public SiriusAdapter(Resource siriusResource, BindingModel bindingSpec, String conceptName) {
		this.result = new Result(siriusResource);
		this.bindingSpec = bindingSpec;
		this.info = new SiriusComponentInfo(conceptName, bindingSpec);
		this.changesToPerform = new ArrayList<>();
		this.targetMetamodelNameToPackage = new HashMap<>();
		this.siriusMetamodelNameToPackage = new HashMap<>();
	}
	
	// TODO: Generate a proper view point name from component info
	private String getAdaptedViewpointName() {
		return "viewpoint adapted";
	}
	
	public Resource getSiriusResource() {
		return result.getSiriusResource();
	}
	
	public Result perform() {
		TreeIterator<EObject> iterator = result.getSiriusResource().getAllContents();
		
		// Load the meta-models, we need them later
		for (IBoundMetamodelInfo mmInfo : info.getBoundMetamodels()) {
			EPackage pkg = loadPackage(mmInfo.getBoundMetamodelURI());
			targetMetamodelNameToPackage.put(mmInfo.getBoundMetamodelName(), pkg);
		}
		
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
	
					add(label_, ignoreIfMappedToNone(domainClass), (label) -> {
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


			// Actions
			
			if (obj instanceof CreateInstance) {
				CreateInstance instance_ = (CreateInstance) obj;
				handleCreateInstance(instance_);				
			}			

			
			if (obj instanceof NodeCreationDescription) {
				NodeCreationDescription desc = (NodeCreationDescription) obj;
				// setLabel, setName
			}

		}

		for (Change<?> change : changesToPerform) {
			change.apply();
		}
		
		
		return result;
	}

	private void handleCreateInstance(CreateInstance instance_) {
		final EClass domainClass = getDomainClassAsEClass(instance_.getTypeName());
		
		if ( ignoreIfMappedToNone(domainClass) ) {
			// This may not work in all cases, let's see
			EcoreUtil.delete(instance_, true);
		}
		
		// final String targetDomainClass = getTargetDomainClassN(instance_.getTypeName());
		
		for(String targetDomainClass: getTargetDomainClassN(instance_.getTypeName())) {
			add(instance_, (instance) -> {
				instance.setTypeName(toSiriusClassName(targetDomainClass));
				instance.setReferenceName(targetDomainClass.toLowerCase());
			
				// It is way better to handle SetValue because we have the context of the instance
				for (ModelOperation modelOperation : instance.getSubModelOperations()) {
					if ( modelOperation instanceof SetValue ) {
						SetValue sv = (SetValue) modelOperation;
						
						BaseFeatureBinding featureBinding = getFeature(domainClass, sv.getFeatureName());
						if ( featureBinding instanceof RenamingFeatureBinding ) {
							sv.setFeatureName(((RenamingFeatureBinding) featureBinding).getConcreteFeature());
						} else {
							// This is handled in a separate loop, see below
							continue;
						}
						
						String expression = adaptExpression(domainClass, sv.getValueExpression());
						sv.setValueExpression(expression);							
					}
				}
				
			});
	
			// Handle things that we don't support
			for (ModelOperation modelOperation : instance_.getSubModelOperations()) {
				if ( modelOperation instanceof SetValue ) {
					SetValue sv = (SetValue) modelOperation;
					
					BaseFeatureBinding featureBinding = getFeature(domainClass, sv.getFeatureName());
					if (! (featureBinding instanceof RenamingFeatureBinding) ) {
						result.addNotMapped(modelOperation);
						add(modelOperation, (mo) -> EcoreUtil.remove(mo));
					}
				}
			}
		}
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
		if ( semanticCandidates != null && ignoreIfMappedToNone(originalDomainClass) ) {
			// find the closest container element
			EObject container = nm_.eContainer();
			String containerClass = null;
			while ( container != null ) {
				if ( container instanceof DiagramDescription ) {
					containerClass = ((DiagramDescription) container).getDomainClass();
					break;
				} else if ( container instanceof AbstractNodeMapping ) {
					containerClass = ((AbstractNodeMapping) container).getDomainClass();
					break;
				}
				container = container.eContainer();
			}
			
			if ( containerClass == null )
				throw new AdapterError("Can't find proper container for " + nm_);
			
			containerDomainClass = getDomainClassAsEClass(containerClass);
		}
		
		final EClass containerDomainClass_ = containerDomainClass;
		final String preconditionExpression = nm_.getPreconditionExpression();
		
		add(nm_, ignoreIfMappedToNone(originalDomainClass), (nm) -> {
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
			siriusMetamodelNameToPackage.put(ePackage.getName(), ePackage);
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
			EPackage pkg = targetMetamodelNameToPackage.get(mmInfo.getBoundMetamodelName());
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


	private boolean notEmpty(String s) {
		return s != null && s.trim().length() > 0;
	}

	private boolean ignoreIfMappedToNone(EClass originalDomainClass) {
		return ignoreIfMappedToNone(originalDomainClass.getName());
	}
	
	private boolean ignoreIfMappedToNone(String originalDomainClass) {
		ClassBinding classBinding = bindingSpec.findClassBindingForConcept(originalDomainClass)
				.orElseThrow(() -> new AdapterError("Can't find " + originalDomainClass));
		
		for(ConcreteMetaclass c : classBinding.getConcrete()) {
			 if ( c.getName().toLowerCase().equals("none") ) 
				 return false;
		}
		return true;
	}

	private void removeElement(EObject o) {
		// This needs to be smart and remove every reference...
		EcoreUtil.delete(o);
	}
	
	private <T> T getContainer(Class<T> klass, EObject obj) {
		if ( obj == null ) {
			return null;
		} else if ( klass.isInstance(obj) ) {
			return klass.cast(obj);
		} else {
			return getContainer(klass, obj.eContainer());
		}
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
	
	private <T extends EObject> void add(T obj, Consumer<T> consumer) {
		Change<T> change = new Change<T>(obj, consumer);
		this.changesToPerform.add(change);
	}

	private String adaptExpression(@NonNull EClass contextClass, @NonNull String expression) {
		return adaptExpression(contextClass, expression, null);
	}
	
	/**
	 * 
	 * 
	 * @param contextClass
	 * @param expression
	 * @param boundClass The concrete class which is mapped to the context class. If null, we assume that there this no N mapping for the context class.
	 * @return
	 */
	private String adaptExpression(@NonNull EClass contextClass, @NonNull String expression, @Nullable String boundClass) {
		if ( expression == null || expression.trim().isEmpty() )
			return expression;
		
		// TODO: Get the actual EClass, and do the translation using actual OCL if needed
		if ( expression.startsWith("[") ) {
			String acceleoExpression = expression.substring(1, expression.length() - 2);
			// TODO: We really need to this adaptation properly at the AST level, 
			// but just to make this work, let's use this hack
			if ( acceleoExpression.startsWith("'") ) {
				return expression;
			}
			
			// It is Acceleo syntax
			// Assume for now it is a single name
			BaseFeatureBinding feature = getFeature(contextClass, acceleoExpression);
			if ( feature instanceof RenamingFeatureBinding ) {
				return "[" + ((RenamingFeatureBinding) feature).getConcreteFeature() + "/]";
			} else {
				throw new UnsupportedOperationException("Don't know yet how to handle adapter expressions: " + acceleoExpression);				
			}
			
		} else if ( expression.startsWith("aql:") ) {
			String aql = expression.replaceFirst("aql:", "");
			ATLBasedExpressionAdapter adapter = new ATLBasedExpressionAdapter(contextClass, aql, boundClass, bindingSpec, siriusMetamodelNameToPackage, info, targetMetamodelNameToPackage);
			String s = adapter.getResult();
			
			if ( s != null )
				return "aql: " + s;
			
			if ( aql.matches("^self\\.\\w+$") ) {
				aql = aql.replaceAll("self.", "");
			}
			
			BaseFeatureBinding feature = getFeature(contextClass, aql);
			if ( feature instanceof RenamingFeatureBinding ) {
				return "aql:self." + ((RenamingFeatureBinding) feature).getConcreteFeature();
			} else {
				throw new UnsupportedOperationException("Don't know yet how to handle adapter expressions: " + aql);
			}
		} else if ( expression.startsWith("feature:") ) {
			String featureName = expression.replaceFirst("feature:", "");
			BaseFeatureBinding feature = getFeature(contextClass, featureName);
			if ( feature == null ) {
				throw new AdapterError("Feature " + featureName + " not found.");
			}
			
			if ( feature instanceof RenamingFeatureBinding ) {
				return "feature:" + ((RenamingFeatureBinding) feature).getConcreteFeature();
			} else {
				throw new UnsupportedOperationException("Don't know yet how to handle adapter expressions: " + expression);
			}
		} else if ( expression.startsWith("var:") ) {
			return expression;
		} else {
			throw new UnsupportedOperationException("Can't handle " + expression);			
		}
	}

	/**
	 * @param contextClass Name of a metaclass in the concept
	 * @param featureName Name of a feature in the concept
	 * @return A binding element for the Metaclass.feature
	 */
	private BaseFeatureBinding getFeature(String contextClass, String featureName) {
		Optional<BaseFeatureBinding> opt = bindingSpec.findFeatureFinding(contextClass, featureName);
		if ( !opt.isPresent() ) {
			throw new IllegalStateException("Can't find binding for '" + contextClass + "." + featureName + "'");
		}
		return opt.get();
	}

	private BaseFeatureBinding getFeature(EClass contextClass, String featureName) {
		return getFeature(contextClass.getName(), featureName);
	}
	
	private EPackage loadPackage(String uri) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(uri), true);
		EPackage pkg = (EPackage) resource.getContents().get(0);		
		return pkg;
	}

	private EClass getDomainClassAsEClass(String domainClassName) {
		String[] parts = domainClassName.split("::");
		String mm = parts[0].trim();
		String className = parts[1].trim();
		
		EPackage pkg = siriusMetamodelNameToPackage.get(mm);
		if ( pkg == null ) {
			throw new AdapterError("Can't find metamodel " + mm);
		}
		EClassifier c = pkg.getEClassifier(className);
		if ( c == null ) {
			throw new AdapterError("Can't find class " + domainClassName);
		}
		
		return (EClass) c;
	}
	
	private String getRawDomainClassName(String domainClassName) {
		return domainClassName.substring(domainClassName.lastIndexOf(":") + 1);
	}
	
	private List<String> getTargetDomainClassN(String domainClassName) {
		String realClassName = getRawDomainClassName(domainClassName);
		ClassBinding classBinding = bindingSpec.findClassBindingForConcept(realClassName).orElseThrow(() -> new RuntimeException("Can't find " + realClassName));
		return classBinding.getConcrete().stream().map(cb -> cb.getName()).collect(Collectors.toList());
	}
	
//	private List<String> getTargetDomainClass_emptyIfNone(String domainClassName) {
//		if (ignoreIfMappedToNone(domainClassName))
//			return Collections.emptyList();
//		return getTargetDomainClassN(domainClassName);
//	}
	
	private String getTargetDomainClass1(String domainClassName) {
		String realClassName = getRawDomainClassName(domainClassName);
		ClassBinding classBinding = bindingSpec.findClassBindingForConcept(realClassName).orElseThrow(() -> new RuntimeException("Can't find " + realClassName));
		List<ConcreteMetaclass> concreteClasses = classBinding.getConcrete();
		if ( concreteClasses.size() > 1 ) {
			throw new UnsupportedOperationException("Not implemented yet");
		}
		
		return concreteClasses.get(0).getName();
	}
	
	private String toSiriusClassName(String className) {
		if ( info.getBoundMetamodels().size() > 1 )
			throw new UnsupportedOperationException("To support this we need to find the  class in the meta-model");
		
		String boundMetamodelName = info.getBoundMetamodels().get(0).getBoundMetamodelName();
		EPackage metamodel = targetMetamodelNameToPackage.get(boundMetamodelName);
		
		return metamodel.getName() + "::" + className;
	}

	private String getLabelValue(String domainClassName) {
		String realClassName = domainClassName.substring(domainClassName.lastIndexOf(":") + 1);
		return realClassName;
	}

	private static class Change<T extends EObject> {
		private T element;
		private Consumer<T> consumer;

		public Change(T element, Consumer<T> consumer) {
			this.element = element;
			this.consumer = consumer;
		}
		
		public void apply() {
			this.consumer.accept(element);
		}
	}

	@SuppressWarnings("serial")
	private static class AdapterError extends RuntimeException {
		public AdapterError(String message) {
			super(message);
		}
	}
	
}
