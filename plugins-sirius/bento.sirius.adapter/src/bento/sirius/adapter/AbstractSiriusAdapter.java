package bento.sirius.adapter;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;

import bento.binding.utils.BindingModel;
import bento.sirius.adapter.AbstractSiriusAdapter.Change;
import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.RenamingFeatureBinding;

public abstract class AbstractSiriusAdapter {

	protected BindingModel bindingSpec;
	protected SiriusComponentInfo info;

	public AbstractSiriusAdapter(BindingModel bindingSpec, SiriusComponentInfo info) {
		this.bindingSpec = bindingSpec;	
		this.info = info;
	}

	protected EPackage getSiriusPackageFromMetamodelName(String mm) {
		return info.getSiriusPackageFromMetamodelName(mm);
	}
	
	protected EPackage getTargetMetamodelPackage(String boundMetamodelName) {
		return info.getTargetMetamodelPackage(boundMetamodelName);
	}
	
	protected EClass getDomainClassAsEClass(String domainClassName) {
		String[] parts = domainClassName.split("::");
		String mm = parts[0].trim();
		String className = parts[1].trim();
		
		EPackage pkg = getSiriusPackageFromMetamodelName(mm);
		if ( pkg == null ) {
			throw new AdapterError("Can't find metamodel " + mm);
		}
		EClassifier c = pkg.getEClassifier(className);
		if ( c == null ) {
			throw new AdapterError("Can't find class " + domainClassName);
		}
		
		return (EClass) c;
	}
	
	protected String getRawDomainClassName(String domainClassName) {
		return SiriusUtils.getRawClassName(domainClassName);
	}
	
	protected List<String> getTargetDomainClassN(String domainClassName) {
		String realClassName = getRawDomainClassName(domainClassName);
		ClassBinding classBinding = bindingSpec.findClassBindingForConcept(realClassName).orElseThrow(() -> new RuntimeException("Can't find " + realClassName));
		return classBinding.getConcrete().stream().map(cb -> cb.getName()).collect(Collectors.toList());
	}
	
//	private List<String> getTargetDomainClass_emptyIfNone(String domainClassName) {
//		if (ignoreIfMappedToNone(domainClassName))
//			return Collections.emptyList();
//		return getTargetDomainClassN(domainClassName);
//	}
	
	protected String getTargetDomainClass1(String domainClassName) {
		String realClassName = getRawDomainClassName(domainClassName);
		ClassBinding classBinding = bindingSpec.findClassBindingForConcept(realClassName).orElseThrow(() -> new RuntimeException("Can't find " + realClassName));
		List<ConcreteMetaclass> concreteClasses = classBinding.getConcrete();
		if ( concreteClasses.size() > 1 ) {
			throw new UnsupportedOperationException("Not implemented yet");
		}
		
		return concreteClasses.get(0).getName();
	}
	
	protected  String toSiriusClassName(String className) {
		if ( info.getBoundMetamodels().size() > 1 )
			throw new UnsupportedOperationException("To support this we need to find the  class in the meta-model");
		
		String boundMetamodelName = info.getBoundMetamodels().get(0).getBoundMetamodelName();
		EPackage metamodel = getTargetMetamodelPackage(boundMetamodelName);
		
		return metamodel.getName() + "::" + className;
	}


	protected String getLabelValue(String domainClassName) {
		String realClassName = domainClassName.substring(domainClassName.lastIndexOf(":") + 1);
		return realClassName;
	}

	protected static class Change<T extends EObject> {
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


	protected boolean notEmpty(String s) {
		return s != null && s.trim().length() > 0;
	}

	protected boolean isMappedToNone(EClass originalDomainClass) {
		return ! isNotMappedToNone(originalDomainClass.getName());
	}
	
	protected boolean isNotMappedToNone(EClass originalDomainClass) {
		return isNotMappedToNone(originalDomainClass.getName());
	}
	
	protected boolean isNotMappedToNone(String originalDomainClass) {
		ClassBinding classBinding = bindingSpec.findClassBindingForConcept(originalDomainClass)
				.orElseThrow(() -> new AdapterError("Can't find " + originalDomainClass));
		
		for(ConcreteMetaclass c : classBinding.getConcrete()) {
			 if ( c.getName().toLowerCase().equals("none") ) 
				 return false;
		}
		return true;
	}

	protected void removeElement(EObject o) {
		// This needs to be smart and remove every reference...
		EcoreUtil.delete(o);
	}
	
	protected <T> T getContainer(Class<T> klass, EObject obj) {
		if ( obj == null ) {
			return null;
		} else if ( klass.isInstance(obj) ) {
			return klass.cast(obj);
		} else {
			return getContainer(klass, obj.eContainer());
		}
	}

	protected String adaptExpression(@NonNull EClass contextClass, @NonNull String expression) {
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
	protected String adaptExpression(@NonNull EClass contextClass, @NonNull String expression, @Nullable String boundClass) {
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
			ATLBasedExpressionAdapter adapter = new ATLBasedExpressionAdapter(contextClass, aql, boundClass, bindingSpec, info);
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

	protected BaseFeatureBinding getFeature(EClass contextClass, String featureName) {
		return getFeature(contextClass.getName(), featureName);
	}


	@SuppressWarnings("unchecked")
	protected void addToContainer(EObject toBeAdded, EStructuralFeature eContainingFeature, EObject eContainer) {
		if (eContainingFeature.isMany()) {
			((Collection<EObject>) eContainer.eGet(eContainingFeature)).add(toBeAdded);
		} else {
			eContainer.eSet(eContainingFeature, toBeAdded);
		}
		
	}
}
