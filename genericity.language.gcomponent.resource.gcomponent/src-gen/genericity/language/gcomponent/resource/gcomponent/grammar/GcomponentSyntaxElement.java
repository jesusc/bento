/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class GcomponentSyntaxElement {
	
	private GcomponentSyntaxElement[] children;
	private GcomponentSyntaxElement parent;
	private genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality;
	
	public GcomponentSyntaxElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality, GcomponentSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (GcomponentSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(GcomponentSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public GcomponentSyntaxElement[] getChildren() {
		if (children == null) {
			return new GcomponentSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality getCardinality() {
		return cardinality;
	}
	
}
