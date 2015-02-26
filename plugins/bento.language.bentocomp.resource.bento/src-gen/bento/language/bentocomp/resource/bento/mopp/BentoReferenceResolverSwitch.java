/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoReferenceResolverSwitch implements bento.language.bentocomp.resource.bento.IBentoReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected bento.language.bentocomp.resource.bento.analysis.ParameterModelTypeReferenceResolver parameterModelTypeReferenceResolver = new bento.language.bentocomp.resource.bento.analysis.ParameterModelTypeReferenceResolver();
	protected bento.language.bentocomp.resource.bento.analysis.CompositeComponentUsesReferenceResolver compositeComponentUsesReferenceResolver = new bento.language.bentocomp.resource.bento.analysis.CompositeComponentUsesReferenceResolver();
	protected bento.language.bentocomp.resource.bento.analysis.ApplyComponentReferenceResolver applyComponentReferenceResolver = new bento.language.bentocomp.resource.bento.analysis.ApplyComponentReferenceResolver();
	protected bento.language.bentocomp.resource.bento.analysis.ApplyParameterModelReferenceResolver applyParameterModelReferenceResolver = new bento.language.bentocomp.resource.bento.analysis.ApplyParameterModelReferenceResolver();
	protected bento.language.bentocomp.resource.bento.analysis.ApplyParameterBindingReferenceResolver applyParameterBindingReferenceResolver = new bento.language.bentocomp.resource.bento.analysis.ApplyParameterBindingReferenceResolver();
	protected bento.language.bentocomp.resource.bento.analysis.FeatureRefFeatureReferenceResolver featureRefFeatureReferenceResolver = new bento.language.bentocomp.resource.bento.analysis.FeatureRefFeatureReferenceResolver();
	protected bento.language.bentocomp.resource.bento.analysis.AtlParameterModelReferenceResolver atlParameterModelReferenceResolver = new bento.language.bentocomp.resource.bento.analysis.AtlParameterModelReferenceResolver();
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.core.ParameterModel, bento.language.bentocomp.core.Concept> getParameterModelTypeReferenceResolver() {
		return getResolverChain(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel_Type(), parameterModelTypeReferenceResolver);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.core.CompositeComponent, bento.language.bentocomp.core.Component> getCompositeComponentUsesReferenceResolver() {
		return getResolverChain(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent_Uses(), compositeComponentUsesReferenceResolver);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.Apply, bento.language.bentocomp.core.Component> getApplyComponentReferenceResolver() {
		return getResolverChain(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply_Component(), applyComponentReferenceResolver);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.Model> getApplyParameterModelReferenceResolver() {
		return getResolverChain(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Model(), applyParameterModelReferenceResolver);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.BindingDeclaration> getApplyParameterBindingReferenceResolver() {
		return getResolverChain(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Binding(), applyParameterBindingReferenceResolver);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.FeatureRef, bento.language.bentocomp.variants.Feature> getFeatureRefFeatureReferenceResolver() {
		return getResolverChain(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef_Feature(), featureRefFeatureReferenceResolver);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.technologies.AtlParameter, bento.language.bentocomp.core.Model> getAtlParameterModelReferenceResolver() {
		return getResolverChain(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter_Model(), atlParameterModelReferenceResolver);
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
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel().isInstance(container)) {
			BentoFuzzyResolveResult<bento.language.bentocomp.core.Concept> frr = new BentoFuzzyResolveResult<bento.language.bentocomp.core.Concept>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				parameterModelTypeReferenceResolver.resolve(identifier, (bento.language.bentocomp.core.ParameterModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent().isInstance(container)) {
			BentoFuzzyResolveResult<bento.language.bentocomp.core.Component> frr = new BentoFuzzyResolveResult<bento.language.bentocomp.core.Component>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("uses")) {
				compositeComponentUsesReferenceResolver.resolve(identifier, (bento.language.bentocomp.core.CompositeComponent) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply().isInstance(container)) {
			BentoFuzzyResolveResult<bento.language.bentocomp.core.Component> frr = new BentoFuzzyResolveResult<bento.language.bentocomp.core.Component>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("component")) {
				applyComponentReferenceResolver.resolve(identifier, (bento.language.bentocomp.flowcontrol.Apply) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter().isInstance(container)) {
			BentoFuzzyResolveResult<bento.language.bentocomp.core.Model> frr = new BentoFuzzyResolveResult<bento.language.bentocomp.core.Model>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				applyParameterModelReferenceResolver.resolve(identifier, (bento.language.bentocomp.flowcontrol.ApplyParameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter().isInstance(container)) {
			BentoFuzzyResolveResult<bento.language.bentocomp.core.BindingDeclaration> frr = new BentoFuzzyResolveResult<bento.language.bentocomp.core.BindingDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("binding")) {
				applyParameterBindingReferenceResolver.resolve(identifier, (bento.language.bentocomp.flowcontrol.ApplyParameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef().isInstance(container)) {
			BentoFuzzyResolveResult<bento.language.bentocomp.variants.Feature> frr = new BentoFuzzyResolveResult<bento.language.bentocomp.variants.Feature>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("feature")) {
				featureRefFeatureReferenceResolver.resolve(identifier, (bento.language.bentocomp.flowcontrol.FeatureRef) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter().isInstance(container)) {
			BentoFuzzyResolveResult<bento.language.bentocomp.core.Model> frr = new BentoFuzzyResolveResult<bento.language.bentocomp.core.Model>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				atlParameterModelReferenceResolver.resolve(identifier, (bento.language.bentocomp.technologies.AtlParameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel_Type()) {
			return getResolverChain(reference, parameterModelTypeReferenceResolver);
		}
		if (reference == bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent_Uses()) {
			return getResolverChain(reference, compositeComponentUsesReferenceResolver);
		}
		if (reference == bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply_Component()) {
			return getResolverChain(reference, applyComponentReferenceResolver);
		}
		if (reference == bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Model()) {
			return getResolverChain(reference, applyParameterModelReferenceResolver);
		}
		if (reference == bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter_Binding()) {
			return getResolverChain(reference, applyParameterBindingReferenceResolver);
		}
		if (reference == bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef_Feature()) {
			return getResolverChain(reference, featureRefFeatureReferenceResolver);
		}
		if (reference == bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter_Model()) {
			return getResolverChain(reference, atlParameterModelReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> bento.language.bentocomp.resource.bento.IBentoReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, bento.language.bentocomp.resource.bento.IBentoReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(bento.language.bentocomp.resource.bento.IBentoOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new bento.language.bentocomp.resource.bento.util.BentoRuntimeUtil().logWarning("Found value with invalid type for option " + bento.language.bentocomp.resource.bento.IBentoOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof bento.language.bentocomp.resource.bento.IBentoReferenceResolver) {
			bento.language.bentocomp.resource.bento.IBentoReferenceResolver replacingResolver = (bento.language.bentocomp.resource.bento.IBentoReferenceResolver) resolverValue;
			if (replacingResolver instanceof bento.language.bentocomp.resource.bento.IBentoDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((bento.language.bentocomp.resource.bento.IBentoDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			bento.language.bentocomp.resource.bento.IBentoReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof bento.language.bentocomp.resource.bento.IBentoReferenceCache) {
					bento.language.bentocomp.resource.bento.IBentoReferenceResolver nextResolver = (bento.language.bentocomp.resource.bento.IBentoReferenceResolver) next;
					if (nextResolver instanceof bento.language.bentocomp.resource.bento.IBentoDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((bento.language.bentocomp.resource.bento.IBentoDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new bento.language.bentocomp.resource.bento.util.BentoRuntimeUtil().logWarning("Found value with invalid type in value map for option " + bento.language.bentocomp.resource.bento.IBentoOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + bento.language.bentocomp.resource.bento.IBentoDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new bento.language.bentocomp.resource.bento.util.BentoRuntimeUtil().logWarning("Found value with invalid type in value map for option " + bento.language.bentocomp.resource.bento.IBentoOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + bento.language.bentocomp.resource.bento.IBentoDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
