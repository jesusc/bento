/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.analysis;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.gbind.BindingModel;
import org.emftext.language.gbind.ConceptMetaclass;
import org.emftext.language.gbind.ConcreteMetaclass;

public class ClassBindingConceptReferenceResolver implements org.emftext.language.gbind.resource.gbind.IGbindReferenceResolver<org.emftext.language.gbind.ClassBinding, org.emftext.language.gbind.ConceptMetaclass> {
	
	@SuppressWarnings("unused")
	private org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.ClassBinding, org.emftext.language.gbind.ConceptMetaclass> delegate = new org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.ClassBinding, org.emftext.language.gbind.ConceptMetaclass>();
	
	public void resolve(String identifier, org.emftext.language.gbind.ClassBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.gbind.resource.gbind.IGbindReferenceResolveResult<org.emftext.language.gbind.ConceptMetaclass> result) {
		BindingModel bindingModel = (BindingModel) EcoreUtil.getRootContainer(container);
		// bindingModel.g
		for (ConceptMetaclass m : bindingModel.getConceptMetaclasses()) {
			if ( m.getName().equals(identifier) ) {
				result.addMapping(identifier, m);
				return;
			}
		}
		
		ConceptMetaclass metaclass = org.emftext.language.gbind.GbindFactory.eINSTANCE.createConceptMetaclass();
		metaclass.setName(identifier);
		bindingModel.getConceptMetaclasses().add(metaclass);
		result.addMapping(identifier, metaclass);
		// delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.gbind.ConceptMetaclass element, org.emftext.language.gbind.ClassBinding container, org.eclipse.emf.ecore.EReference reference) {
		return element.getName();
		// return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
