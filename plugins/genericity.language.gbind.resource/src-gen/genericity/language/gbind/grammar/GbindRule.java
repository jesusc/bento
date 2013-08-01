/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class GbindRule extends genericity.language.gbind.grammar.GbindSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public GbindRule(org.eclipse.emf.ecore.EClass metaclass, genericity.language.gbind.grammar.GbindChoice choice, genericity.language.gbind.grammar.GbindCardinality cardinality) {
		super(cardinality, new genericity.language.gbind.grammar.GbindSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public genericity.language.gbind.grammar.GbindChoice getDefinition() {
		return (genericity.language.gbind.grammar.GbindChoice) getChildren()[0];
	}
	
}

