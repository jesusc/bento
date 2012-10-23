/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class GbindSyntaxElement {
	
	private GbindSyntaxElement[] children;
	private GbindSyntaxElement parent;
	private genericity.language.gbind.grammar.GbindCardinality cardinality;
	
	public GbindSyntaxElement(genericity.language.gbind.grammar.GbindCardinality cardinality, GbindSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (GbindSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(GbindSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public GbindSyntaxElement getParent() {
		return parent;
	}
	
	public GbindSyntaxElement[] getChildren() {
		if (children == null) {
			return new GbindSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public genericity.language.gbind.grammar.GbindCardinality getCardinality() {
		return cardinality;
	}
	
}
