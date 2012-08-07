/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

public class GbindReferenceResolverSwitch implements org.emftext.language.gbind.resource.gbind.IGbindReferenceResolverSwitch {
	
	protected org.emftext.language.gbind.resource.gbind.analysis.ClassBindingConceptReferenceResolver classBindingConceptReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.ClassBindingConceptReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.ClassBindingConcreteReferenceResolver classBindingConcreteReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.ClassBindingConcreteReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.BaseFeatureBindingConceptClassReferenceResolver baseFeatureBindingConceptClassReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.BaseFeatureBindingConceptClassReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.BaseFeatureBindingQualifierReferenceResolver baseFeatureBindingQualifierReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.BaseFeatureBindingQualifierReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.ConceptHelperContextClassReferenceResolver conceptHelperContextClassReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.ConceptHelperContextClassReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.ConceptHelperQualifierReferenceResolver conceptHelperQualifierReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.ConceptHelperQualifierReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.LocalHelperContextReferenceResolver localHelperContextReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.LocalHelperContextReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.OclInstanceModelMetamodelReferenceResolver oclInstanceModelMetamodelReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.OclInstanceModelMetamodelReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.OclModelElementExpModelReferenceResolver oclModelElementExpModelReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.OclModelElementExpModelReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.VariableExpReferredVariableReferenceResolver();
	protected org.emftext.language.gbind.resource.gbind.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new org.emftext.language.gbind.resource.gbind.analysis.OclModelElementModelReferenceResolver();
	
	public org.emftext.language.gbind.resource.gbind.analysis.ClassBindingConceptReferenceResolver getClassBindingConceptReferenceResolver() {
		return classBindingConceptReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.ClassBindingConcreteReferenceResolver getClassBindingConcreteReferenceResolver() {
		return classBindingConcreteReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.BaseFeatureBindingConceptClassReferenceResolver getBaseFeatureBindingConceptClassReferenceResolver() {
		return baseFeatureBindingConceptClassReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.BaseFeatureBindingQualifierReferenceResolver getBaseFeatureBindingQualifierReferenceResolver() {
		return baseFeatureBindingQualifierReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.ConceptHelperContextClassReferenceResolver getConceptHelperContextClassReferenceResolver() {
		return conceptHelperContextClassReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.ConceptHelperQualifierReferenceResolver getConceptHelperQualifierReferenceResolver() {
		return conceptHelperQualifierReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.LocalHelperContextReferenceResolver getLocalHelperContextReferenceResolver() {
		return localHelperContextReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.OclInstanceModelMetamodelReferenceResolver getOclInstanceModelMetamodelReferenceResolver() {
		return oclInstanceModelMetamodelReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.OclModelElementExpModelReferenceResolver getOclModelElementExpModelReferenceResolver() {
		return oclModelElementExpModelReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.VariableExpReferredVariableReferenceResolver getVariableExpReferredVariableReferenceResolver() {
		return variableExpReferredVariableReferenceResolver;
	}
	
	public org.emftext.language.gbind.resource.gbind.analysis.OclModelElementModelReferenceResolver getOclModelElementModelReferenceResolver() {
		return oclModelElementModelReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		classBindingConceptReferenceResolver.setOptions(options);
		classBindingConcreteReferenceResolver.setOptions(options);
		baseFeatureBindingConceptClassReferenceResolver.setOptions(options);
		baseFeatureBindingQualifierReferenceResolver.setOptions(options);
		conceptHelperContextClassReferenceResolver.setOptions(options);
		conceptHelperQualifierReferenceResolver.setOptions(options);
		localHelperContextReferenceResolver.setOptions(options);
		oclInstanceModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementExpModelReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.emftext.language.gbind.resource.gbind.IGbindReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.emftext.language.gbind.GbindPackage.eINSTANCE.getClassBinding().isInstance(container)) {
			GbindFuzzyResolveResult<org.emftext.language.gbind.ConceptMetaclass> frr = new GbindFuzzyResolveResult<org.emftext.language.gbind.ConceptMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("concept")) {
				classBindingConceptReferenceResolver.resolve(identifier, (org.emftext.language.gbind.ClassBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.gbind.GbindPackage.eINSTANCE.getClassBinding().isInstance(container)) {
			GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("concrete")) {
				classBindingConcreteReferenceResolver.resolve(identifier, (org.emftext.language.gbind.ClassBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.gbind.GbindPackage.eINSTANCE.getBaseFeatureBinding().isInstance(container)) {
			GbindFuzzyResolveResult<org.emftext.language.gbind.ConceptMetaclass> frr = new GbindFuzzyResolveResult<org.emftext.language.gbind.ConceptMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("conceptClass")) {
				baseFeatureBindingConceptClassReferenceResolver.resolve(identifier, (org.emftext.language.gbind.BaseFeatureBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.gbind.GbindPackage.eINSTANCE.getBaseFeatureBinding().isInstance(container)) {
			GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("qualifier")) {
				baseFeatureBindingQualifierReferenceResolver.resolve(identifier, (org.emftext.language.gbind.BaseFeatureBinding) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.gbind.GbindPackage.eINSTANCE.getConceptHelper().isInstance(container)) {
			GbindFuzzyResolveResult<org.emftext.language.gbind.ConceptMetaclass> frr = new GbindFuzzyResolveResult<org.emftext.language.gbind.ConceptMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("contextClass")) {
				conceptHelperContextClassReferenceResolver.resolve(identifier, (org.emftext.language.gbind.ConceptHelper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.gbind.GbindPackage.eINSTANCE.getConceptHelper().isInstance(container)) {
			GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("qualifier")) {
				conceptHelperQualifierReferenceResolver.resolve(identifier, (org.emftext.language.gbind.ConceptHelper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.gbind.GbindPackage.eINSTANCE.getLocalHelper().isInstance(container)) {
			GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass> frr = new GbindFuzzyResolveResult<org.emftext.language.gbind.ConcreteMetaclass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("context")) {
				localHelperContextReferenceResolver.resolve(identifier, (org.emftext.language.gbind.LocalHelper) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel().isInstance(container)) {
			GbindFuzzyResolveResult<be.ac.vub.simpleocl.OclMetamodel> frr = new GbindFuzzyResolveResult<be.ac.vub.simpleocl.OclMetamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclInstanceModelMetamodelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclInstanceModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp().isInstance(container)) {
			GbindFuzzyResolveResult<be.ac.vub.simpleocl.OclModel> frr = new GbindFuzzyResolveResult<be.ac.vub.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementExpModelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclModelElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			GbindFuzzyResolveResult<be.ac.vub.simpleocl.VariableDeclaration> frr = new GbindFuzzyResolveResult<be.ac.vub.simpleocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			GbindFuzzyResolveResult<be.ac.vub.simpleocl.OclModel> frr = new GbindFuzzyResolveResult<be.ac.vub.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.emftext.language.gbind.GbindPackage.eINSTANCE.getClassBinding_Concept()) {
			return classBindingConceptReferenceResolver;
		}
		if (reference == org.emftext.language.gbind.GbindPackage.eINSTANCE.getClassBinding_Concrete()) {
			return classBindingConcreteReferenceResolver;
		}
		if (reference == org.emftext.language.gbind.GbindPackage.eINSTANCE.getBaseFeatureBinding_ConceptClass()) {
			return baseFeatureBindingConceptClassReferenceResolver;
		}
		if (reference == org.emftext.language.gbind.GbindPackage.eINSTANCE.getBaseFeatureBinding_Qualifier()) {
			return baseFeatureBindingQualifierReferenceResolver;
		}
		if (reference == org.emftext.language.gbind.GbindPackage.eINSTANCE.getConceptHelper_ContextClass()) {
			return conceptHelperContextClassReferenceResolver;
		}
		if (reference == org.emftext.language.gbind.GbindPackage.eINSTANCE.getConceptHelper_Qualifier()) {
			return conceptHelperQualifierReferenceResolver;
		}
		if (reference == org.emftext.language.gbind.GbindPackage.eINSTANCE.getLocalHelper_Context()) {
			return localHelperContextReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel_Metamodel()) {
			return oclInstanceModelMetamodelReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp_Model()) {
			return oclModelElementExpModelReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return variableExpReferredVariableReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement_Model()) {
			return oclModelElementModelReferenceResolver;
		}
		return null;
	}
	
}
