/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class GbindAbstractExpectedElement implements genericity.language.gbind.IGbindExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<genericity.language.gbind.util.GbindPair<genericity.language.gbind.IGbindExpectedElement, genericity.language.gbind.mopp.GbindContainedFeature[]>> followers = new java.util.LinkedHashSet<genericity.language.gbind.util.GbindPair<genericity.language.gbind.IGbindExpectedElement, genericity.language.gbind.mopp.GbindContainedFeature[]>>();
	
	public GbindAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(genericity.language.gbind.IGbindExpectedElement follower, genericity.language.gbind.mopp.GbindContainedFeature[] path) {
		followers.add(new genericity.language.gbind.util.GbindPair<genericity.language.gbind.IGbindExpectedElement, genericity.language.gbind.mopp.GbindContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<genericity.language.gbind.util.GbindPair<genericity.language.gbind.IGbindExpectedElement, genericity.language.gbind.mopp.GbindContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
