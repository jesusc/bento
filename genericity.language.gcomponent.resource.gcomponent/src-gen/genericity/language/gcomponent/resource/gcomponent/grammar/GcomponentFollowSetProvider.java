/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class GcomponentFollowSetProvider {
	
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_0 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_1 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_1);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_2 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_2);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_3 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_3);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_4 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_4_0_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_5 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_6 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_5_0_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_7 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_6);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_8 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_1);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_9 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_2);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_10 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_3);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_11 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_0);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_12 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_1);
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINAL_13 = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_0);
	
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_0 = genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__SOURCE);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_1 = genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__TARGET);
	public final static org.eclipse.emf.ecore.EStructuralFeature FEATURE_2 = genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTagged().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TAGGED__TAGS);
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] EMPTY_FEATURE_ARRAY = new org.eclipse.emf.ecore.EStructuralFeature[0];
	
	public static void wire0() {
		TERMINAL_0.addFollower(TERMINAL_1, EMPTY_FEATURE_ARRAY);
		TERMINAL_1.addFollower(TERMINAL_2, EMPTY_FEATURE_ARRAY);
		TERMINAL_2.addFollower(TERMINAL_3, EMPTY_FEATURE_ARRAY);
		TERMINAL_3.addFollower(TERMINAL_4, EMPTY_FEATURE_ARRAY);
		TERMINAL_4.addFollower(TERMINAL_5, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_0, });
		TERMINAL_6.addFollower(TERMINAL_5, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_1, });
		TERMINAL_5.addFollower(TERMINAL_8, EMPTY_FEATURE_ARRAY);
		TERMINAL_8.addFollower(TERMINAL_9, EMPTY_FEATURE_ARRAY);
		TERMINAL_9.addFollower(TERMINAL_10, EMPTY_FEATURE_ARRAY);
		TERMINAL_10.addFollower(TERMINAL_11, EMPTY_FEATURE_ARRAY);
		TERMINAL_10.addFollower(TERMINAL_4, EMPTY_FEATURE_ARRAY);
		TERMINAL_10.addFollower(TERMINAL_6, EMPTY_FEATURE_ARRAY);
		TERMINAL_10.addFollower(TERMINAL_7, EMPTY_FEATURE_ARRAY);
		TERMINAL_11.addFollower(TERMINAL_12, EMPTY_FEATURE_ARRAY);
		TERMINAL_12.addFollower(TERMINAL_13, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_13.addFollower(TERMINAL_13, new org.eclipse.emf.ecore.EStructuralFeature[] {FEATURE_2, });
		TERMINAL_13.addFollower(TERMINAL_4, EMPTY_FEATURE_ARRAY);
		TERMINAL_13.addFollower(TERMINAL_6, EMPTY_FEATURE_ARRAY);
		TERMINAL_13.addFollower(TERMINAL_7, EMPTY_FEATURE_ARRAY);
	}
	// wire the terminals
	static {
		wire0();
	}
}
