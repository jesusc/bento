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
	
	public final static genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement TERMINALS[] = new genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement[81];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[18];
	
	public final static genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] LINKS = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[79];
	
	public final static genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] EMPTY_LINK_ARRAY = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_0);
		TERMINALS[1] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_0);
		TERMINALS[2] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_1);
		TERMINALS[3] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_2);
		TERMINALS[4] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_3);
		TERMINALS[5] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_0_0_0_0);
		TERMINALS[6] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_0);
		TERMINALS[7] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_1_0_0_0);
		TERMINALS[8] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_2_0_0_0);
		TERMINALS[9] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_0);
		TERMINALS[10] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_3_0_0_0);
		TERMINALS[11] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_5_0_0_0);
		TERMINALS[12] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_6);
		TERMINALS[13] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_5_0_0_0);
		TERMINALS[14] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_0);
		TERMINALS[15] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_0);
		TERMINALS[16] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_18_0_0_0);
		TERMINALS[17] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_8);
		TERMINALS[18] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_1);
		TERMINALS[19] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_2);
		TERMINALS[20] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_3);
		TERMINALS[21] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_4_0_0_0);
		TERMINALS[22] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_1_0_0_0);
		TERMINALS[23] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_4_0_0_1);
		TERMINALS[24] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_4_0_0_0);
		TERMINALS[25] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_1);
		TERMINALS[26] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_2);
		TERMINALS[27] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_3);
		TERMINALS[28] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_4_0_0_0);
		TERMINALS[29] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_3_0_0_0);
		TERMINALS[30] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_4_0_0_1);
		TERMINALS[31] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_5_0_0_1);
		TERMINALS[32] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_0);
		TERMINALS[33] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_1);
		TERMINALS[34] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_2);
		TERMINALS[35] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_1);
		TERMINALS[36] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_2);
		TERMINALS[37] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_3);
		TERMINALS[38] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_4_0_0_0);
		TERMINALS[39] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_4_0_0_1);
		TERMINALS[40] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_0_0_0_0);
		TERMINALS[41] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_2_0_0_0);
		TERMINALS[42] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_0);
		TERMINALS[43] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_6_0_0_0);
		TERMINALS[44] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_8);
		TERMINALS[45] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_1);
		TERMINALS[46] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_2);
		TERMINALS[47] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_3);
		TERMINALS[48] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_0);
		TERMINALS[49] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_0);
		TERMINALS[50] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_14_0_0_0);
		TERMINALS[51] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_1_0_0_0);
		TERMINALS[52] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_15_0_0_0);
		TERMINALS[53] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_1);
		TERMINALS[54] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_1);
		TERMINALS[55] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_2);
		TERMINALS[56] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_0);
		TERMINALS[57] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_4_0_0_0);
		TERMINALS[58] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_5);
		TERMINALS[59] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_6);
		TERMINALS[60] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_7);
		TERMINALS[61] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_9_0_0_0);
		TERMINALS[62] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_10);
		TERMINALS[63] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_0);
		TERMINALS[64] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_0);
		TERMINALS[65] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_0);
		TERMINALS[66] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_1);
		TERMINALS[67] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_2);
		TERMINALS[68] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_3);
		TERMINALS[69] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_4);
		TERMINALS[70] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_5);
		TERMINALS[71] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_1);
		TERMINALS[72] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_2);
		TERMINALS[73] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_3);
		TERMINALS[74] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_1);
		TERMINALS[75] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_2);
		TERMINALS[76] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_17_0_0_0);
		TERMINALS[77] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_4_0_0_0);
		TERMINALS[78] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_17_0_0_1);
		TERMINALS[79] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_17_0_0_2);
		TERMINALS[80] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_18_0_0_1);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPONENT__SOURCE);
		FEATURES[1] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPONENT__TARGET);
		FEATURES[2] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPONENT__SOURCE_MODELS);
		FEATURES[3] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPONENT__TARGET_MODELS);
		FEATURES[4] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPONENT__FORMAL_PARAMETERS);
		FEATURES[5] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE);
		FEATURES[6] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTagged().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TAGGED__TAGS);
		FEATURES[7] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__COMPOSITION);
		FEATURES[8] = genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.COMPOSITION__STEP);
		FEATURES[9] = genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__VALUE);
		FEATURES[10] = genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR__CONDITIONS);
		FEATURES[11] = genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__STEP);
		FEATURES[12] = genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS);
		FEATURES[13] = genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS);
		FEATURES[14] = genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.SEQ__STEPS);
		FEATURES[15] = genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS);
		FEATURES[16] = genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot().getEStructuralFeature(genericity.language.gcomponent.dsl.DslPackage.DEFINITION_ROOT__COMPONENT);
		FEATURES[17] = genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__BINDINGS);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), FEATURES[16]);
		LINKS[1] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), FEATURES[16]);
		LINKS[2] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]);
		LINKS[3] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]);
		LINKS[4] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]);
		LINKS[5] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]);
		LINKS[6] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[7] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[8] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[9] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[10] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[11] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[12] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), FEATURES[5]);
		LINKS[13] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getJavaTemplate(), FEATURES[5]);
		LINKS[14] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[15] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[16] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[17] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[18] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[19] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[20] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[21] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[22] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[23] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]);
		LINKS[24] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]);
		LINKS[25] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]);
		LINKS[26] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]);
		LINKS[27] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[17]);
		LINKS[28] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[29] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[17]);
		LINKS[30] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[31] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[32] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[33] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[34] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[35] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[36] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[37] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[38] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[39] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[40] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[41] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[42] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[43] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[44] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[8]);
		LINKS[45] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[8]);
		LINKS[46] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[8]);
		LINKS[47] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef(), FEATURES[9]);
		LINKS[48] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), FEATURES[10]);
		LINKS[49] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]);
		LINKS[50] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]);
		LINKS[51] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]);
		LINKS[52] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]);
		LINKS[53] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]);
		LINKS[54] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]);
		LINKS[55] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[11]);
		LINKS[56] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[11]);
		LINKS[57] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[11]);
		LINKS[58] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]);
		LINKS[59] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]);
		LINKS[60] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]);
		LINKS[61] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[12]);
		LINKS[62] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[12]);
		LINKS[63] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]);
		LINKS[64] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]);
		LINKS[65] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]);
		LINKS[66] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]);
		LINKS[67] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]);
		LINKS[68] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]);
		LINKS[69] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]);
		LINKS[70] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]);
		LINKS[71] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]);
		LINKS[72] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]);
		LINKS[73] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]);
		LINKS[74] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]);
		LINKS[75] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]);
		LINKS[76] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]);
		LINKS[77] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[15]);
		LINKS[78] = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[15]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[2], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[3], EMPTY_LINK_ARRAY);
		TERMINALS[3].addFollower(TERMINALS[4], EMPTY_LINK_ARRAY);
		TERMINALS[4].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[6], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]), });
		TERMINALS[7].addFollower(TERMINALS[6], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]), });
		TERMINALS[8].addFollower(TERMINALS[9], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]), });
		TERMINALS[10].addFollower(TERMINALS[9], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]), });
		TERMINALS[11].addFollower(TERMINALS[13], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[11].addFollower(TERMINALS[14], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[12].addFollower(TERMINALS[15], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), FEATURES[5]), });
		TERMINALS[12].addFollower(TERMINALS[16], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getJavaTemplate(), FEATURES[5]), });
		TERMINALS[6].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[19].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[21], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[7], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[22], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[24], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[9].addFollower(TERMINALS[25], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[26], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[27], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[28], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[30], EMPTY_LINK_ARRAY);
		TERMINALS[30].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[30].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[24], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[24].addFollower(TERMINALS[7], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[22], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[31], EMPTY_LINK_ARRAY);
		TERMINALS[31].addFollower(TERMINALS[13], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[31].addFollower(TERMINALS[14], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[31].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[31].addFollower(TERMINALS[32], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]), });
		TERMINALS[14].addFollower(TERMINALS[33], EMPTY_LINK_ARRAY);
		TERMINALS[33].addFollower(TERMINALS[34], EMPTY_LINK_ARRAY);
		TERMINALS[34].addFollower(TERMINALS[13], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[34].addFollower(TERMINALS[14], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[34].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[34].addFollower(TERMINALS[32], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]), });
		TERMINALS[1].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[35].addFollower(TERMINALS[36], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[37], EMPTY_LINK_ARRAY);
		TERMINALS[37].addFollower(TERMINALS[38], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[39].addFollower(TERMINALS[38], EMPTY_LINK_ARRAY);
		TERMINALS[39].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[40].addFollower(TERMINALS[6], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]), });
		TERMINALS[22].addFollower(TERMINALS[6], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]), });
		TERMINALS[41].addFollower(TERMINALS[9], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]), });
		TERMINALS[29].addFollower(TERMINALS[9], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]), });
		TERMINALS[43].addFollower(TERMINALS[13], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[43].addFollower(TERMINALS[14], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[42].addFollower(TERMINALS[45], EMPTY_LINK_ARRAY);
		TERMINALS[45].addFollower(TERMINALS[46], EMPTY_LINK_ARRAY);
		TERMINALS[46].addFollower(TERMINALS[47], EMPTY_LINK_ARRAY);
		TERMINALS[47].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[47].addFollower(TERMINALS[43], EMPTY_LINK_ARRAY);
		TERMINALS[47].addFollower(TERMINALS[32], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]), });
		TERMINALS[32].addFollower(TERMINALS[48], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[8]), });
		TERMINALS[32].addFollower(TERMINALS[49], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[8]), });
		TERMINALS[32].addFollower(TERMINALS[50], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[8]), });
		TERMINALS[48].addFollower(TERMINALS[51], EMPTY_LINK_ARRAY);
		TERMINALS[51].addFollower(TERMINALS[52], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef(), FEATURES[9]), new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), FEATURES[10]), });
		TERMINALS[53].addFollower(TERMINALS[48], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[11]), });
		TERMINALS[53].addFollower(TERMINALS[49], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[11]), });
		TERMINALS[53].addFollower(TERMINALS[50], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[11]), });
		TERMINALS[49].addFollower(TERMINALS[54], EMPTY_LINK_ARRAY);
		TERMINALS[54].addFollower(TERMINALS[55], EMPTY_LINK_ARRAY);
		TERMINALS[55].addFollower(TERMINALS[56], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[12]), });
		TERMINALS[57].addFollower(TERMINALS[56], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[12]), });
		TERMINALS[58].addFollower(TERMINALS[59], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[60], EMPTY_LINK_ARRAY);
		TERMINALS[60].addFollower(TERMINALS[56], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]), });
		TERMINALS[60].addFollower(TERMINALS[61], EMPTY_LINK_ARRAY);
		TERMINALS[60].addFollower(TERMINALS[62], EMPTY_LINK_ARRAY);
		TERMINALS[61].addFollower(TERMINALS[56], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]), });
		TERMINALS[62].addFollower(TERMINALS[44], EMPTY_LINK_ARRAY);
		TERMINALS[62].addFollower(TERMINALS[51], EMPTY_LINK_ARRAY);
		TERMINALS[62].addFollower(TERMINALS[48], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]), });
		TERMINALS[62].addFollower(TERMINALS[49], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]), });
		TERMINALS[62].addFollower(TERMINALS[50], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]), });
		TERMINALS[56].addFollower(TERMINALS[63], EMPTY_LINK_ARRAY);
		TERMINALS[56].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[56].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[63].addFollower(TERMINALS[64], EMPTY_LINK_ARRAY);
		TERMINALS[63].addFollower(TERMINALS[65], EMPTY_LINK_ARRAY);
		TERMINALS[64].addFollower(TERMINALS[66], EMPTY_LINK_ARRAY);
		TERMINALS[66].addFollower(TERMINALS[67], EMPTY_LINK_ARRAY);
		TERMINALS[67].addFollower(TERMINALS[68], EMPTY_LINK_ARRAY);
		TERMINALS[68].addFollower(TERMINALS[69], EMPTY_LINK_ARRAY);
		TERMINALS[69].addFollower(TERMINALS[70], EMPTY_LINK_ARRAY);
		TERMINALS[70].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[70].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[65].addFollower(TERMINALS[71], EMPTY_LINK_ARRAY);
		TERMINALS[71].addFollower(TERMINALS[72], EMPTY_LINK_ARRAY);
		TERMINALS[72].addFollower(TERMINALS[73], EMPTY_LINK_ARRAY);
		TERMINALS[73].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[73].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[50].addFollower(TERMINALS[48], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[14]), });
		TERMINALS[50].addFollower(TERMINALS[49], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[14]), });
		TERMINALS[50].addFollower(TERMINALS[50], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[14]), });
		TERMINALS[52].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[15].addFollower(TERMINALS[74], EMPTY_LINK_ARRAY);
		TERMINALS[74].addFollower(TERMINALS[75], EMPTY_LINK_ARRAY);
		TERMINALS[75].addFollower(TERMINALS[76], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[15]), });
		TERMINALS[77].addFollower(TERMINALS[76], new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] {new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[15]), });
		TERMINALS[76].addFollower(TERMINALS[78], EMPTY_LINK_ARRAY);
		TERMINALS[78].addFollower(TERMINALS[79], EMPTY_LINK_ARRAY);
		TERMINALS[79].addFollower(TERMINALS[77], EMPTY_LINK_ARRAY);
		TERMINALS[79].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[80], EMPTY_LINK_ARRAY);
		TERMINALS[80].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
