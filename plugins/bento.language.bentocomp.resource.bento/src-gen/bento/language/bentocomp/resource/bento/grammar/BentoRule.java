/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class BentoRule extends bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public BentoRule(org.eclipse.emf.ecore.EClass metaclass, bento.language.bentocomp.resource.bento.grammar.BentoChoice choice, bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality) {
		super(cardinality, new bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public bento.language.bentocomp.resource.bento.grammar.BentoChoice getDefinition() {
		return (bento.language.bentocomp.resource.bento.grammar.BentoChoice) getChildren()[0];
	}
	
}

