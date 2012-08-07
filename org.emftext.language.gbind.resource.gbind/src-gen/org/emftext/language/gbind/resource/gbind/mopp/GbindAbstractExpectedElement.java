/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class GbindAbstractExpectedElement implements org.emftext.language.gbind.resource.gbind.IGbindExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.emftext.language.gbind.resource.gbind.util.GbindPair<org.emftext.language.gbind.resource.gbind.IGbindExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.emftext.language.gbind.resource.gbind.util.GbindPair<org.emftext.language.gbind.resource.gbind.IGbindExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public GbindAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.emftext.language.gbind.resource.gbind.IGbindExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.emftext.language.gbind.resource.gbind.util.GbindPair<org.emftext.language.gbind.resource.gbind.IGbindExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.emftext.language.gbind.resource.gbind.util.GbindPair<org.emftext.language.gbind.resource.gbind.IGbindExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
