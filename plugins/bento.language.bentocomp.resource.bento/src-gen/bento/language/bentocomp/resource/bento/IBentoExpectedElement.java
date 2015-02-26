/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IBentoExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(bento.language.bentocomp.resource.bento.IBentoExpectedElement follower, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<bento.language.bentocomp.resource.bento.util.BentoPair<bento.language.bentocomp.resource.bento.IBentoExpectedElement, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[]>> getFollowers();
	
}
