/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindReferenceResolverSwitch implements genericity.language.gbind.IGbindReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected genericity.language.gbind.analysis.OclInstanceModelMetamodelReferenceResolver oclInstanceModelMetamodelReferenceResolver = new genericity.language.gbind.analysis.OclInstanceModelMetamodelReferenceResolver();
	protected genericity.language.gbind.analysis.OclModelElementExpModelReferenceResolver oclModelElementExpModelReferenceResolver = new genericity.language.gbind.analysis.OclModelElementExpModelReferenceResolver();
	protected genericity.language.gbind.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new genericity.language.gbind.analysis.VariableExpReferredVariableReferenceResolver();
	protected genericity.language.gbind.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new genericity.language.gbind.analysis.OclModelElementModelReferenceResolver();
	protected genericity.language.gbind.analysis.ClassBindingConceptReferenceResolver classBindingConceptReferenceResolver = new genericity.language.gbind.analysis.ClassBindingConceptReferenceResolver();
	protected genericity.language.gbind.analysis.ClassBindingConcreteReferenceResolver classBindingConcreteReferenceResolver = new genericity.language.gbind.analysis.ClassBindingConcreteReferenceResolver();
	protected genericity.language.gbind.analysis.BaseFeatureBindingConceptClassReferenceResolver baseFeatureBindingConceptClassReferenceResolver = new genericity.language.gbind.analysis.BaseFeatureBindingConceptClassReferenceResolver();
	protected genericity.language.gbind.analysis.BaseFeatureBindingQualifierReferenceResolver baseFeatureBindingQualifierReferenceResolver = new genericity.language.gbind.analysis.BaseFeatureBindingQualifierReferenceResolver();
	protected genericity.language.gbind.analysis.ConceptHelperContextClassReferenceResolver conceptHelperContextClassReferenceResolver = new genericity.language.gbind.analysis.ConceptHelperContextClassReferenceResolver();
	protected genericity.language.gbind.analysis.ConceptHelperQualifierReferenceResolver conceptHelperQualifierReferenceResolver = new genericity.language.gbind.analysis.ConceptHelperQualifierReferenceResolver();
	protected genericity.language.gbind.analysis.LocalHelperContextReferenceResolver localHelperContextReferenceResolver = new genericity.language.gbind.analysis.LocalHelperContextReferenceResolver();
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.simpleocl.OclInstanceModel, gbind.simpleocl.OclMetamodel> getOclInstanceModelMetamodelReferenceResolver() {
		return getResolverChain(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel_Metamodel(), oclInstanceModelMetamodelReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.simpleocl.OclModelElementExp, gbind.simpleocl.OclModel> getOclModelElementExpModelReferenceResolver() {
		return getResolverChain(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp_Model(), oclModelElementExpModelReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.simpleocl.VariableExp, gbind.simpleocl.VariableDeclaration> getVariableExpReferredVariableReferenceResolver() {
		return getResolverChain(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp_ReferredVariable(), variableExpReferredVariableReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.simpleocl.OclModelElement, gbind.simpleocl.OclModel> getOclModelElementModelReferenceResolver() {
		return getResolverChain(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement_Model(), oclModelElementModelReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.ClassBinding, gbind.dsl.ConceptMetaclass> getClassBindingConceptReferenceResolver() {
		return getResolverChain(gbind.dsl.DslPackage.eINSTANCE.getClassBinding_Concept(), classBindingConceptReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.ClassBinding, gbind.dsl.ConcreteMetaclass> getClassBindingConcreteReferenceResolver() {
		return getResolverChain(gbind.dsl.DslPackage.eINSTANCE.getClassBinding_Concrete(), classBindingConcreteReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.BaseFeatureBinding, gbind.dsl.ConceptMetaclass> getBaseFeatureBindingConceptClassReferenceResolver() {
		return getResolverChain(gbind.dsl.DslPackage.eINSTANCE.getBaseFeatureBinding_ConceptClass(), baseFeatureBindingConceptClassReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.BaseFeatureBinding, gbind.dsl.ConcreteMetaclass> getBaseFeatureBindingQualifierReferenceResolver() {
		return getResolverChain(gbind.dsl.DslPackage.eINSTANCE.getBaseFeatureBinding_Qualifier(), baseFeatureBindingQualifierReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.ConceptHelper, gbind.dsl.ConceptMetaclass> getConceptHelperContextClassReferenceResolver() {
		return getResolverChain(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper_ContextClass(), conceptHelperContextClassReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.ConceptHelper, gbind.dsl.ConcreteMetaclass> getConceptHelperQualifierReferenceResolver() {
		return getResolverChain(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper_Qualifier(), conceptHelperQualifierReferenceResolver);
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.LocalHelper, gbind.dsl.ConcreteMetaclass> getLocalHelperContextReferenceResolver() {
		return getResolverChain(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper_Context(), localHelperContextReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		oclInstanceModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementExpModelReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
		classBindingConceptReferenceResolver.setOptions(options);
		classBindingConcreteReferenceResolver.setOptions(options);
		baseFeatureBindingConceptClassReferenceResolver.setOptions(options);
		baseFeatureBindingQualifierReferenceResolver.setOptions(options);
		conceptHelperContextClassReferenceResolver.setOptions(options);
		conceptHelperQualifierReferenceResolver.setOptions(options);
		localHelperContextReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, genericity.language.gbind.IGbindReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.simpleocl.OclMetamodel> frr = new GbindFuzzyResolveResult<gbind.simpleocl.OclMetamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclInstanceModelMetamodelReferenceResolver.resolve(identifier, (gbind.simpleocl.OclInstanceModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.simpleocl.OclModel> frr = new GbindFuzzyResolveResult<gbind.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementExpModelReferenceResolver.resolve(identifier, (gbind.simpleocl.OclModelElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.simpleocl.VariableDeclaration> frr = new GbindFuzzyResolveResult<gbind.simpleocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (gbind.simpleocl.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.simpleocl.OclModel> frr = new GbindFuzzyResolveResult<gbind.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (gbind.simpleocl.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.dsl.DslPackage.eINSTANCE.getClassBinding().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.dsl.ConceptMetaclass> frr = new GbindFuzzyResolveResult<gbind.dsl.ConceptMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("concept")) {
				classBindingConceptReferenceResolver.resolve(identifier, (gbind.dsl.ClassBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.dsl.DslPackage.eINSTANCE.getClassBinding().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("concrete")) {
				classBindingConcreteReferenceResolver.resolve(identifier, (gbind.dsl.ClassBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.dsl.DslPackage.eINSTANCE.getBaseFeatureBinding().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.dsl.ConceptMetaclass> frr = new GbindFuzzyResolveResult<gbind.dsl.ConceptMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("conceptClass")) {
				baseFeatureBindingConceptClassReferenceResolver.resolve(identifier, (gbind.dsl.BaseFeatureBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.dsl.DslPackage.eINSTANCE.getBaseFeatureBinding().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("qualifier")) {
				baseFeatureBindingQualifierReferenceResolver.resolve(identifier, (gbind.dsl.BaseFeatureBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.dsl.DslPackage.eINSTANCE.getConceptHelper().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.dsl.ConceptMetaclass> frr = new GbindFuzzyResolveResult<gbind.dsl.ConceptMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("contextClass")) {
				conceptHelperContextClassReferenceResolver.resolve(identifier, (gbind.dsl.ConceptHelper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.dsl.DslPackage.eINSTANCE.getConceptHelper().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("qualifier")) {
				conceptHelperQualifierReferenceResolver.resolve(identifier, (gbind.dsl.ConceptHelper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (gbind.dsl.DslPackage.eINSTANCE.getLocalHelper().isInstance(container)) {
			GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<gbind.dsl.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("context")) {
				localHelperContextReferenceResolver.resolve(identifier, (gbind.dsl.LocalHelper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public genericity.language.gbind.IGbindReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel_Metamodel()) {
			return getResolverChain(reference, oclInstanceModelMetamodelReferenceResolver);
		}
		if (reference == gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp_Model()) {
			return getResolverChain(reference, oclModelElementExpModelReferenceResolver);
		}
		if (reference == gbind.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return getResolverChain(reference, variableExpReferredVariableReferenceResolver);
		}
		if (reference == gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement_Model()) {
			return getResolverChain(reference, oclModelElementModelReferenceResolver);
		}
		if (reference == gbind.dsl.DslPackage.eINSTANCE.getClassBinding_Concept()) {
			return getResolverChain(reference, classBindingConceptReferenceResolver);
		}
		if (reference == gbind.dsl.DslPackage.eINSTANCE.getClassBinding_Concrete()) {
			return getResolverChain(reference, classBindingConcreteReferenceResolver);
		}
		if (reference == gbind.dsl.DslPackage.eINSTANCE.getBaseFeatureBinding_ConceptClass()) {
			return getResolverChain(reference, baseFeatureBindingConceptClassReferenceResolver);
		}
		if (reference == gbind.dsl.DslPackage.eINSTANCE.getBaseFeatureBinding_Qualifier()) {
			return getResolverChain(reference, baseFeatureBindingQualifierReferenceResolver);
		}
		if (reference == gbind.dsl.DslPackage.eINSTANCE.getConceptHelper_ContextClass()) {
			return getResolverChain(reference, conceptHelperContextClassReferenceResolver);
		}
		if (reference == gbind.dsl.DslPackage.eINSTANCE.getConceptHelper_Qualifier()) {
			return getResolverChain(reference, conceptHelperQualifierReferenceResolver);
		}
		if (reference == gbind.dsl.DslPackage.eINSTANCE.getLocalHelper_Context()) {
			return getResolverChain(reference, localHelperContextReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> genericity.language.gbind.IGbindReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, genericity.language.gbind.IGbindReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(genericity.language.gbind.IGbindOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new genericity.language.gbind.util.GbindRuntimeUtil().logWarning("Found value with invalid type for option " + genericity.language.gbind.IGbindOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof genericity.language.gbind.IGbindReferenceResolver) {
			genericity.language.gbind.IGbindReferenceResolver replacingResolver = (genericity.language.gbind.IGbindReferenceResolver) resolverValue;
			if (replacingResolver instanceof genericity.language.gbind.IGbindDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((genericity.language.gbind.IGbindDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			genericity.language.gbind.IGbindReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof genericity.language.gbind.IGbindReferenceCache) {
					genericity.language.gbind.IGbindReferenceResolver nextResolver = (genericity.language.gbind.IGbindReferenceResolver) next;
					if (nextResolver instanceof genericity.language.gbind.IGbindDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((genericity.language.gbind.IGbindDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new genericity.language.gbind.util.GbindRuntimeUtil().logWarning("Found value with invalid type in value map for option " + genericity.language.gbind.IGbindOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + genericity.language.gbind.IGbindDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new genericity.language.gbind.util.GbindRuntimeUtil().logWarning("Found value with invalid type in value map for option " + genericity.language.gbind.IGbindOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + genericity.language.gbind.IGbindDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
