/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class GcomponentRule extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public GcomponentRule(org.eclipse.emf.ecore.EClass metaclass, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice choice, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality) {
		super(cardinality, new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice getDefinition() {
		return (genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice) getChildren()[0];
	}
	
}

