/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static GcomponentGrammarInformationProvider INSTANCE = new GcomponentGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_0_0_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("transformation", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_0_0_0_1 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("component", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder GCOMPONENT_0_0_0_2 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__NAME), "TEXT", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, 0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_0_0_0_3 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("{", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_0_0_0_4_0_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("source", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainment GCOMPONENT_0_0_0_4_0_0_1 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainment(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__SOURCE), genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, 0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence GCOMPONENT_0_0_0_4_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_0_0_0_4_0_0_0, GCOMPONENT_0_0_0_4_0_0_1);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice GCOMPONENT_0_0_0_4_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_0_0_0_4_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCompound GCOMPONENT_0_0_0_4 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCompound(GCOMPONENT_0_0_0_4_0, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.PLUS);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_0_0_0_5_0_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("target", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainment GCOMPONENT_0_0_0_5_0_0_1 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainment(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__TARGET), genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, 0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence GCOMPONENT_0_0_0_5_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_0_0_0_5_0_0_0, GCOMPONENT_0_0_0_5_0_0_1);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice GCOMPONENT_0_0_0_5_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_0_0_0_5_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCompound GCOMPONENT_0_0_0_5 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCompound(GCOMPONENT_0_0_0_5_0, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.STAR);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_0_0_0_6 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("}", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence GCOMPONENT_0_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_0_0_0_0, GCOMPONENT_0_0_0_1, GCOMPONENT_0_0_0_2, GCOMPONENT_0_0_0_3, GCOMPONENT_0_0_0_4, GCOMPONENT_0_0_0_5, GCOMPONENT_0_0_0_6);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice GCOMPONENT_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_0_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule GCOMPONENT_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent(), GCOMPONENT_0_0, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_1_0_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("concept", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder GCOMPONENT_1_0_0_1 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getConcept().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.CONCEPT__NAME), "TEXT", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, 0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_1_0_0_2 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword(":", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder GCOMPONENT_1_0_0_3 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getConcept().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.CONCEPT__URI), "QUOTED_34_34", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, 0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_1_0_0_4_0_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword("tags", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword GCOMPONENT_1_0_0_4_0_0_1 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword(":", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainment GCOMPONENT_1_0_0_4_0_0_2 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainment(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getConcept().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.CONCEPT__TAGS), genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.PLUS, 0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence GCOMPONENT_1_0_0_4_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_1_0_0_4_0_0_0, GCOMPONENT_1_0_0_4_0_0_1, GCOMPONENT_1_0_0_4_0_0_2);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice GCOMPONENT_1_0_0_4_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_1_0_0_4_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCompound GCOMPONENT_1_0_0_4 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCompound(GCOMPONENT_1_0_0_4_0, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.QUESTIONMARK);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence GCOMPONENT_1_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_1_0_0_0, GCOMPONENT_1_0_0_1, GCOMPONENT_1_0_0_2, GCOMPONENT_1_0_0_3, GCOMPONENT_1_0_0_4);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice GCOMPONENT_1_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_1_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule GCOMPONENT_1 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getConcept(), GCOMPONENT_1_0, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder GCOMPONENT_2_0_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTag().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TAG__VALUE), "TEXT", genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, 0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence GCOMPONENT_2_0_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSequence(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_2_0_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice GCOMPONENT_2_0 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE, GCOMPONENT_2_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule GCOMPONENT_2 = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule(genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTag(), GCOMPONENT_2_0, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality.ONE);
	
	public final static genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule[] RULES = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule[] {
		GCOMPONENT_0,
		GCOMPONENT_1,
		GCOMPONENT_2,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword) {
			keywords.add(((genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword) element).getValue());
		} else if (element instanceof genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentBooleanTerminal) {
			keywords.add(((genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentBooleanTerminal) element).getTrueLiteral());
			keywords.add(((genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentEnumerationTerminal) {
			genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentEnumerationTerminal terminal = (genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
