/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentReferenceResolverSwitch implements genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected genericity.language.gcomponent.resource.gcomponent.analysis.ParameterModelTypeReferenceResolver parameterModelTypeReferenceResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.ParameterModelTypeReferenceResolver();
	protected genericity.language.gcomponent.resource.gcomponent.analysis.CompositeComponentUsesReferenceResolver compositeComponentUsesReferenceResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.CompositeComponentUsesReferenceResolver();
	protected genericity.language.gcomponent.resource.gcomponent.analysis.ApplyComponentReferenceResolver applyComponentReferenceResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.ApplyComponentReferenceResolver();
	protected genericity.language.gcomponent.resource.gcomponent.analysis.ApplyParameterModelReferenceResolver applyParameterModelReferenceResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.ApplyParameterModelReferenceResolver();
	protected genericity.language.gcomponent.resource.gcomponent.analysis.ApplyParameterBindingReferenceResolver applyParameterBindingReferenceResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.ApplyParameterBindingReferenceResolver();
	protected genericity.language.gcomponent.resource.gcomponent.analysis.FeatureRefFeatureReferenceResolver featureRefFeatureReferenceResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.FeatureRefFeatureReferenceResolver();
	protected genericity.language.gcomponent.resource.gcomponent.analysis.AtlParameterModelReferenceResolver atlParameterModelReferenceResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.AtlParameterModelReferenceResolver();
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.core.ParameterModel, genericity.language.gcomponent.core.Concept> getParameterModelTypeReferenceResolver() {
		return getResolverChain(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel_Type(), parameterModelTypeReferenceResolver);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.core.CompositeComponent, genericity.language.gcomponent.core.Component> getCompositeComponentUsesReferenceResolver() {
		return getResolverChain(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent_Uses(), compositeComponentUsesReferenceResolver);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.flowcontrol.Apply, genericity.language.gcomponent.core.Component> getApplyComponentReferenceResolver() {
		return getResolverChain(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply_Component(), applyComponentReferenceResolver);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Model> getApplyParameterModelReferenceResolver() {
		return getResolverChain(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Model(), applyParameterModelReferenceResolver);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.BindingDeclaration> getApplyParameterBindingReferenceResolver() {
		return getResolverChain(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Binding(), applyParameterBindingReferenceResolver);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.flowcontrol.FeatureRef, genericity.language.gcomponent.variants.Feature> getFeatureRefFeatureReferenceResolver() {
		return getResolverChain(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef_Feature(), featureRefFeatureReferenceResolver);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.technologies.AtlParameter, genericity.language.gcomponent.core.Model> getAtlParameterModelReferenceResolver() {
		return getResolverChain(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter_Model(), atlParameterModelReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		parameterModelTypeReferenceResolver.setOptions(options);
		compositeComponentUsesReferenceResolver.setOptions(options);
		applyComponentReferenceResolver.setOptions(options);
		applyParameterModelReferenceResolver.setOptions(options);
		applyParameterBindingReferenceResolver.setOptions(options);
		featureRefFeatureReferenceResolver.setOptions(options);
		atlParameterModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel().isInstance(container)) {
			GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Concept> frr = new GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Concept>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				parameterModelTypeReferenceResolver.resolve(identifier, (genericity.language.gcomponent.core.ParameterModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent().isInstance(container)) {
			GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Component> frr = new GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Component>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("uses")) {
				compositeComponentUsesReferenceResolver.resolve(identifier, (genericity.language.gcomponent.core.CompositeComponent) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply().isInstance(container)) {
			GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Component> frr = new GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Component>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("component")) {
				applyComponentReferenceResolver.resolve(identifier, (genericity.language.gcomponent.flowcontrol.Apply) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter().isInstance(container)) {
			GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Model> frr = new GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Model>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				applyParameterModelReferenceResolver.resolve(identifier, (genericity.language.gcomponent.flowcontrol.ApplyParameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter().isInstance(container)) {
			GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.BindingDeclaration> frr = new GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.BindingDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("binding")) {
				applyParameterBindingReferenceResolver.resolve(identifier, (genericity.language.gcomponent.flowcontrol.ApplyParameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef().isInstance(container)) {
			GcomponentFuzzyResolveResult<genericity.language.gcomponent.variants.Feature> frr = new GcomponentFuzzyResolveResult<genericity.language.gcomponent.variants.Feature>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("feature")) {
				featureRefFeatureReferenceResolver.resolve(identifier, (genericity.language.gcomponent.flowcontrol.FeatureRef) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter().isInstance(container)) {
			GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Model> frr = new GcomponentFuzzyResolveResult<genericity.language.gcomponent.core.Model>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				atlParameterModelReferenceResolver.resolve(identifier, (genericity.language.gcomponent.technologies.AtlParameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel_Type()) {
			return getResolverChain(reference, parameterModelTypeReferenceResolver);
		}
		if (reference == genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent_Uses()) {
			return getResolverChain(reference, compositeComponentUsesReferenceResolver);
		}
		if (reference == genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply_Component()) {
			return getResolverChain(reference, applyComponentReferenceResolver);
		}
		if (reference == genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Model()) {
			return getResolverChain(reference, applyParameterModelReferenceResolver);
		}
		if (reference == genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Binding()) {
			return getResolverChain(reference, applyParameterBindingReferenceResolver);
		}
		if (reference == genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef_Feature()) {
			return getResolverChain(reference, featureRefFeatureReferenceResolver);
		}
		if (reference == genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter_Model()) {
			return getResolverChain(reference, atlParameterModelReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new genericity.language.gcomponent.resource.gcomponent.util.GcomponentRuntimeUtil().logWarning("Found value with invalid type for option " + genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver) {
			genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver replacingResolver = (genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver) resolverValue;
			if (replacingResolver instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((genericity.language.gcomponent.resource.gcomponent.IGcomponentDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceCache) {
					genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver nextResolver = (genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver) next;
					if (nextResolver instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((genericity.language.gcomponent.resource.gcomponent.IGcomponentDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new genericity.language.gcomponent.resource.gcomponent.util.GcomponentRuntimeUtil().logWarning("Found value with invalid type in value map for option " + genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + genericity.language.gcomponent.resource.gcomponent.IGcomponentDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new genericity.language.gcomponent.resource.gcomponent.util.GcomponentRuntimeUtil().logWarning("Found value with invalid type in value map for option " + genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + genericity.language.gcomponent.resource.gcomponent.IGcomponentDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
