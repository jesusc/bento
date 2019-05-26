package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationVariable;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;

import bento.binding.utils.BindingModel;
import bento.common.adapter.AdapterTypeUtils;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.sirius.adapter.SiriusAdapter.Result;
import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;

public class SiriusPaletteAdapter extends AbstractSiriusAdapter {

	private PendingTaskExecutor pending;
	private Result result;

	public SiriusPaletteAdapter(BindingModel bindingSpec, SiriusComponentInfo info, Result result, PendingTaskExecutor pending) {
		super(bindingSpec, info);
		this.pending = pending;
		this.result = result;
	}
	
	public static class Context {
		private String contextType = null;
		private MappingBasedToolDescription toolElement;
		private Map<String, EClass> variables = new HashMap<String, EClass>();
		
		public void setContextType(String contextType) {
			this.contextType = contextType;
		}
		
		public String getContextType() {
			return contextType;
		}

		public void setToolElement(MappingBasedToolDescription desc) {
			if ( this.toolElement != null ) throw new IllegalStateException("Parent operation shouldn't be rewritten");
			this.toolElement = desc;
		}
		
		public MappingBasedToolDescription getToolElement() {
			return toolElement;
		}

		public void addVariable(String name, EClass type) {
			variables.put(name, type);
		}
		
		public EClass getVariableType(String name) {
			if ( ! variables.containsKey(name) ) 
				throw new IllegalStateException();
			return variables.get(name);
		}
	}
	
	public void applyTo(NodeCreationDescription desc) {	
		InitialNodeCreationOperation operation = desc.getInitialOperation();
		
		List<CreateInstance> instances = findChildren(operation, (o) -> o instanceof CreateInstance);
		if ( instances.size() == 0 ) {
			// ok, we do nothing but this is probably wrong
		} else if ( instances.size() == 1 ) {
			// CreateInstance instance = instances.get(0);
			Context ctx = new Context();
			ctx.setToolElement(desc);
			dispatch(operation.getFirstModelOperations(), ctx);
		} else {
			throw new UnsupportedOperationException("No support for this yet");
		}		
	}
	
	public void applyTo(EdgeCreationDescription desc) {
		InitEdgeCreationOperation operation = desc.getInitialOperation();
		
		// Make the assumption that all edge mapping maps to the same meta-model element, or at least there
		// is a compatible superclass that allows us to get the source and target features
		EdgeMapping mapping = desc.getEdgeMappings().get(0);
		EClass contextType = getDomainClassAsEClass(mapping.getDomainClass());
		Context ctx = new Context();
		// I could use source finder expression/target finder expression and type check
		// The easy way, and not sure if fully correct
		DiagramElementMapping src = mapping.getSourceMapping().get(0);
		DiagramElementMapping tgt = mapping.getTargetMapping().get(0);
		
		
		if ( desc.getSourceVariable() != null ) {
			String name = desc.getSourceVariable().getName();
			String domainClass = SiriusUtils.getDomainClass(src);
			EClass type = getDomainClassAsEClass(domainClass);
			ctx.addVariable(name, type);
		} 
		
		if ( desc.getTargetVariable() != null ) {
			String name = desc.getTargetVariable().getName();
			String domainClass = SiriusUtils.getDomainClass(tgt);
			EClass type = getDomainClassAsEClass(domainClass);
			ctx.addVariable(name, type);
		} 
		
		
		List<CreateInstance> instances = findChildren(operation, (o) -> o instanceof CreateInstance);
		if ( instances.size() == 0 ) {
			// ok, we do nothing but this is probably wrong
		} else if ( instances.size() == 1 ) {
			// CreateInstance instance = instances.get(0);
			ctx.setToolElement(desc);
			dispatch(operation.getFirstModelOperations(), ctx);
		} else {
			throw new UnsupportedOperationException("No support for this yet");
		}
	}

	@SuppressWarnings("unchecked")
	private <T> List<T> findChildren(EObject container, Predicate<EObject> predicate) {
		List<T> result = new ArrayList<T>();
		TreeIterator<EObject> it = container.eAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (predicate.test(obj)) {
				result.add((T) obj);
			}
		}
		return result;
	}
	
	private void dispatch(ModelOperation op, Context context) {
		if (op instanceof ChangeContext) {
			handleChangeContext((ChangeContext) op, context);
		} else if (op instanceof CreateInstance) {
			handleCreateInstance((CreateInstance) op, context);			
		}
	}

	private void handleChangeContext(ChangeContext op, Context context) {
		String contextType;
		String newContext = op.getBrowseExpression();
		if (newContext.equals("var:container")) {
			// Generalize this adding this variable to the context above
			contextType = getRawDomainClassName(SiriusUtils.getClosestContainerClass(op));
		} else if (newContext.startsWith("var:") ) {
			String varname = newContext.replace("var:", "");
			contextType = context.getVariableType(varname).getName();
		} else if (newContext.startsWith("aql:")) {
			String expr = newContext.replace("aql:", "");
			// This requires a compiler... we can map to ATL as we do for adapters or we can use the default Sirius checker?
			// Meanwhile:
			Pattern pat = Pattern.compile("(.+)\\.eContainer\\(\\)");
			Matcher matcher = pat.matcher(expr);			
			if ( matcher.matches() ) {
				String featureName = matcher.group(1);
				EClass eclass = context.getVariableType(featureName);
				// AnATLyzer is able to do this analysis... but let's do it in poor's man way
				
				contextType = null;
				
				CHECK_ALL:
				for(EClass c : getAllSourceClasses()) {
					for (EReference eReference : c.getEAllReferences()) {
						if (eReference.isContainment() && 
								AdapterTypeUtils.isAssignable(eReference.getEReferenceType(), eclass) ) {
							// This is suboptimal because we don't check further...
							contextType = eReference.getEContainingClass().getName();
							break CHECK_ALL;
						}
					}
				}	

				if (contextType == null)
					throw new IllegalStateException("No container found for: " + newContext);

				// contextType = container;
			} else {
				throw new UnsupportedOperationException("Browse operation not supported: " + newContext);
			}
		} else {
			throw new UnsupportedOperationException("Browse operation not supported: " + newContext);
		}
		
		context.setContextType(contextType);
		
		for (ModelOperation modelOperation : op.getSubModelOperations()) {
			dispatch(modelOperation, context);
		}		
	}

	private void handleCreateInstance(CreateInstance instance_, Context context) {
		/* Either a node-based or an edge-based tool description */
		MappingBasedToolDescription toolElement_ = context.getToolElement();
		
		final EClass domainClass = getDomainClassAsEClass(instance_.getTypeName());
		String containerType = context.getContextType();
		String referenceName = instance_.getReferenceName();
		
		
		if ( isMappedToNone(domainClass) ) {
			// This may not work in all cases, let's see
			EcoreUtil.delete(toolElement_, true);
		}
			
		// switch for / pending.add
		pending.add(toolElement_, (toolElementElem) -> {
			int i = 0;
			for(String targetDomainClass: mapToNonAbstract(getTargetDomainClassN(instance_.getTypeName())) ) {
				MappingBasedToolDescription toolElement;
				CreateInstance instance;
				
				if (i == 0) {
					// This is not the best strategy, probably safer to copy all except the last one!
					toolElement = toolElementElem;
					instance = instance_;
				} else {
					toolElement = EcoreUtil.copy(toolElementElem);
					toolElement.setName(toolElementElem.getName() + (i + 1));
					List<CreateInstance> copiedInstances = findChildren(toolElement, (o) -> o instanceof CreateInstance);
					instance = copiedInstances.get(0); // size() == 1
					
					addToContainer(toolElement, toolElementElem.eContainingFeature(), toolElementElem.eContainer());
				}

				// TODO: I put here "Create X" but this is something that can't be known generally
				// we need optional binding specific info here (tool-level binding)
				toolElement.setLabel("Create " + targetDomainClass);
				
				instance.setTypeName(toSiriusClassName(targetDomainClass));
				
				System.out.println("Processing feature: " + containerType + "::" + referenceName);
				BaseFeatureBinding b = bindingSpec.findFeatureFinding(containerType, referenceName, targetDomainClass).get();
				if ( ! (b instanceof RenamingFeatureBinding) ) {
					throw new UnsupportedOperationException("No support for non-renaming binding for " + domainClass.getName() + "::" + referenceName);
				}
				
				RenamingFeatureBinding rb = (RenamingFeatureBinding) b;
				
				instance.setReferenceName(rb.getConcreteFeature());
			
				List<ModelOperation> unsupported = new ArrayList<>();
				
				// It is way better to handle SetValue because we have the context of the instance
				for (ModelOperation modelOperation : instance.getSubModelOperations()) {
					if ( modelOperation instanceof SetValue ) {
						SetValue sv = (SetValue) modelOperation;
						
						BaseFeatureBinding featureBinding = getFeature(domainClass, sv.getFeatureName());
						if ( featureBinding instanceof RenamingFeatureBinding ) {
							sv.setFeatureName(((RenamingFeatureBinding) featureBinding).getConcreteFeature());
						} else {
							// This is handled in a separate loop, see below
							unsupported.add(modelOperation);
							continue;
						}
						
						String expression = adaptExpression(domainClass, sv.getValueExpression());
						sv.setValueExpression(expression);							
					}
				}					


				// Handle things that we don't support
				for (ModelOperation modelOperation : unsupported) {
					if ( modelOperation instanceof SetValue ) {
						SetValue sv = (SetValue) modelOperation;
						
						BaseFeatureBinding featureBinding = getFeature(domainClass, sv.getFeatureName());
						if (! (featureBinding instanceof RenamingFeatureBinding) ) {
							result.addNotMapped(modelOperation);
							// pending.add(modelOperation, (mo) -> EcoreUtil.remove(mo));
							EcoreUtil.remove(modelOperation);
						}						
					}
				}
				
				i++;
			}
		});
			
	}

	/**
	 * Takes a list of classes of the concrete meta-model. For each of them
	 * that is abstract, the concrete subclasses are returned.
	 */
	private List<String> mapToNonAbstract(List<String> classes) {
		List<EClass> result = new ArrayList<EClass>();
		for (String c : classes) {
			EClass k = findTargetClass(c);
			if (k.isAbstract()) {
				result.addAll( allConcreteSubclasses(k) );
			} else {
				result.add(k);
			}
		}
		
		return result.stream().map(c -> c.getName()).collect(Collectors.toList());
	}

	private List<EClass> getAllSourceClasses() {
		List<EClass> result = new ArrayList<EClass>();
		for (EPackage pkg : info.getSiriusPackages().values()) {
			for (EClassifier c : pkg.getEClassifiers()) {
				if (c instanceof EClass) {
					result.add((EClass) c);
				}
			}
		}
		return result;
	}
	
	/**
	 * Get the list of "more direct" concrete subclasses covering k.
	 * @param k
	 * @return
	 */
	private List<EClass> allConcreteSubclasses(EClass k) {
		List<EClass> result = new ArrayList<EClass>();
		
		Map<EClass, Set<EClass>> sub = getSubclassesMap();
		Set<EClass> subclasses = sub.get(k);
		for (EClass eClass : subclasses) {
			if (eClass.isAbstract()) {
				List<EClass> subs = allConcreteSubclasses(eClass);
				result.addAll(subs);
			} else {
				result.add(eClass);
			}
		}
		
		return result;
	}

	private Map<EClass, Set<EClass>> subclassesMap = null;

	private Map<EClass, Set<EClass>> getSubclassesMap() {
		if (subclassesMap != null)
			return subclassesMap;
		
		Map<EClass, Set<EClass>> subclasses = new HashMap<>();
		
		for (IBoundMetamodelInfo b : info.getBoundMetamodels()) {
			EPackage pkg = info.getTargetMetamodelPackage(b.getBoundMetamodelName());
			for(EClassifier c : pkg.getEClassifiers()) {
				if ( c instanceof EClass ) {
					EClass k = (EClass) c;
					for (EClass eClass : ((EClass) c).getESuperTypes()) {
						subclasses.computeIfAbsent(eClass, (key) -> new HashSet<EClass>());
						subclasses.get(eClass).add(k);
					}
				}
			}			
		}
		
		return subclasses;
	}
	
	private EClass findTargetClass(String c) {
		for (IBoundMetamodelInfo b : info.getBoundMetamodels()) {
			EPackage pkg = info.getTargetMetamodelPackage(b.getBoundMetamodelName());
			EClassifier k = pkg.getEClassifier(c);
			if ( k instanceof EClass )
				return (EClass) k;
		}
		throw new IllegalStateException();
	}

}
