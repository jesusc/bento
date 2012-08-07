/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class GbindSyntaxElement {
	
	private GbindSyntaxElement[] children;
	private GbindSyntaxElement parent;
	private org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality;
	
	public GbindSyntaxElement(org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality, GbindSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (GbindSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(GbindSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
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
	
	public org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality getCardinality() {
		return cardinality;
	}
	
}
