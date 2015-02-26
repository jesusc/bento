/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class BentoSyntaxElement {
	
	private BentoSyntaxElement[] children;
	private BentoSyntaxElement parent;
	private bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality;
	
	public BentoSyntaxElement(bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality, BentoSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (BentoSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(BentoSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public BentoSyntaxElement getParent() {
		return parent;
	}
	
	public BentoSyntaxElement[] getChildren() {
		if (children == null) {
			return new BentoSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public bento.language.bentocomp.resource.bento.grammar.BentoCardinality getCardinality() {
		return cardinality;
	}
	
}
