package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationVariable;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;

import bento.binding.utils.BindingModel;
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
		
		public void setContextType(String contextType) {
			this.contextType = contextType;
		}
		
		public String getContextType() {
			return contextType;
		}
	}
	
	public void applyTo(NodeCreationDescription desc) {
		NodeCreationVariable variable = desc.getVariable();
		if ( "container".equals(variable.getName()) ) {
			// this is context
		}
		//  <viewVariable name="containerView"/> ??? what does this means?
		
		InitialNodeCreationOperation operation = desc.getInitialOperation();
		ModelOperation firstModelOperations = operation.getFirstModelOperations();
		
		dispatch(firstModelOperations, new Context());		
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
			contextType = getRawDomainClassName(SiriusUtils.getClosestContainerClass(op));
		} else {
			throw new UnsupportedOperationException("Browse operation not supported: " + newContext);
		}
		
		context.setContextType(contextType);
		
		for (ModelOperation modelOperation : op.getSubModelOperations()) {
			dispatch(modelOperation, context);
		}		
	}

	private void handleCreateInstance(CreateInstance instance_, Context context) {
		final EClass domainClass = getDomainClassAsEClass(instance_.getTypeName());
		String containerType = context.getContextType();
		String referenceName = instance_.getReferenceName();
		
		
		if ( isMappedToNone(domainClass) ) {
			// This may not work in all cases, let's see
			EcoreUtil.delete(instance_, true);
		}
			
		// switch for / pending.add
		pending.add(instance_, (instanceElem) -> {
			int i = 0;
			for(String targetDomainClass: mapToNonAbstract(getTargetDomainClassN(instance_.getTypeName())) ) {
				CreateInstance instance;
				if (i == 0) {
					// This is not the best strategy, probably safer to copy all except the last one!
					instance = instanceElem;
				} else {
					instance = EcoreUtil.copy(instanceElem);
					addToContainer(instance, instanceElem.eContainingFeature(), instanceElem.eContainer());
				}
				
				instance.setTypeName(toSiriusClassName(targetDomainClass));
				
				System.out.println("Processing feature: " + containerType + "::" + referenceName);
				BaseFeatureBinding b = bindingSpec.findFeatureFinding(containerType, referenceName, targetDomainClass).get();
				if ( ! (b instanceof RenamingFeatureBinding) ) {
					throw new UnsupportedOperationException("No support for non-renaming binding for " + domainClass.getName() + "::" + referenceName);
				}
				
				RenamingFeatureBinding rb = (RenamingFeatureBinding) b;
				
				instance.setReferenceName(rb.getConcreteFeature());
			
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


				// Handle things that we don't support
				for (ModelOperation modelOperation : instance.getSubModelOperations()) {
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
