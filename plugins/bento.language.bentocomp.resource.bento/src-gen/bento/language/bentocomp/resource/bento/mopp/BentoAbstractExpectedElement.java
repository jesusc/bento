/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class BentoAbstractExpectedElement implements bento.language.bentocomp.resource.bento.IBentoExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<bento.language.bentocomp.resource.bento.util.BentoPair<bento.language.bentocomp.resource.bento.IBentoExpectedElement, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[]>> followers = new java.util.LinkedHashSet<bento.language.bentocomp.resource.bento.util.BentoPair<bento.language.bentocomp.resource.bento.IBentoExpectedElement, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[]>>();
	
	public BentoAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(bento.language.bentocomp.resource.bento.IBentoExpectedElement follower, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] path) {
		followers.add(new bento.language.bentocomp.resource.bento.util.BentoPair<bento.language.bentocomp.resource.bento.IBentoExpectedElement, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.util.BentoPair<bento.language.bentocomp.resource.bento.IBentoExpectedElement, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
