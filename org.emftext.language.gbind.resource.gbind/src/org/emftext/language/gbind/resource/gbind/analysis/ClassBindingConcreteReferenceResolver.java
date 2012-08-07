/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.analysis;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.gbind.BindingModel;
import org.emftext.language.gbind.ConcreteMetaclass;

public class ClassBindingConcreteReferenceResolver implements org.emftext.language.gbind.resource.gbind.IGbindReferenceResolver<org.emftext.language.gbind.ClassBinding, org.emftext.language.gbind.ConcreteMetaclass> {
	
	@SuppressWarnings("unused")
	private org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.ClassBinding, org.emftext.language.gbind.ConcreteMetaclass> delegate = new org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.ClassBinding, org.emftext.language.gbind.ConcreteMetaclass>();
	
	public void resolve(String identifier, org.emftext.language.gbind.ClassBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.gbind.resource.gbind.IGbindReferenceResolveResult<org.emftext.language.gbind.ConcreteMetaclass> result) {
		BindingModel bindingModel = (BindingModel) EcoreUtil.getRootContainer(container);
		for (ConcreteMetaclass m : bindingModel.getConcreteMetaclasses()) {
			if ( m.getName().equals(identifier) ) {
				result.addMapping(identifier, m);	
				return;
			}
		}
		
		ConcreteMetaclass metaclass = org.emftext.language.gbind.GbindFactory.eINSTANCE.createConcreteMetaclass();
		metaclass.setName(identifier);
		bindingModel.getConcreteMetaclasses().add(metaclass);
		result.addMapping(identifier, metaclass);
		
		// delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.gbind.ConcreteMetaclass element, org.emftext.language.gbind.ClassBinding container, org.eclipse.emf.ecore.EReference reference) {
		return element.getName();
		// return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
