/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IGbindExpectedElement {
	
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
	public genericity.language.gbind.grammar.GbindSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(genericity.language.gbind.IGbindExpectedElement follower, genericity.language.gbind.mopp.GbindContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<genericity.language.gbind.util.GbindPair<genericity.language.gbind.IGbindExpectedElement, genericity.language.gbind.mopp.GbindContainedFeature[]>> getFollowers();
	
}
