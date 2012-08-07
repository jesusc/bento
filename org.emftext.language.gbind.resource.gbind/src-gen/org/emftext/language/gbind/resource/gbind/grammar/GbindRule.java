/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class GbindRule extends org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public GbindRule(org.eclipse.emf.ecore.EClass metaclass, org.emftext.language.gbind.resource.gbind.grammar.GbindChoice choice, org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality) {
		super(cardinality, new org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.emftext.language.gbind.resource.gbind.grammar.GbindChoice getDefinition() {
		return (org.emftext.language.gbind.resource.gbind.grammar.GbindChoice) getChildren()[0];
	}
	
}

