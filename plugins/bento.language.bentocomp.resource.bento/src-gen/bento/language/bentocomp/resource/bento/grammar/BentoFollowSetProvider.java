/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class BentoFollowSetProvider {
	
	public final static bento.language.bentocomp.resource.bento.IBentoExpectedElement TERMINALS[] = new bento.language.bentocomp.resource.bento.IBentoExpectedElement[89];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[18];
	
	public final static bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] LINKS = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[92];
	
	public final static bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] EMPTY_LINK_ARRAY = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_0);
		TERMINALS[1] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_0);
		TERMINALS[2] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_1);
		TERMINALS[3] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_2);
		TERMINALS[4] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_3);
		TERMINALS[5] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_0_0_0_0);
		TERMINALS[6] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_0);
		TERMINALS[7] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_1_0_0_0);
		TERMINALS[8] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_2_0_0_0);
		TERMINALS[9] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_0);
		TERMINALS[10] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_3_0_0_0);
		TERMINALS[11] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_5_0_0_0);
		TERMINALS[12] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_6);
		TERMINALS[13] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_0_0);
		TERMINALS[14] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_0);
		TERMINALS[15] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_0);
		TERMINALS[16] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_0);
		TERMINALS[17] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_8_0_0_0);
		TERMINALS[18] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_0);
		TERMINALS[19] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_0);
		TERMINALS[20] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_11);
		TERMINALS[21] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_8_0_0_1);
		TERMINALS[22] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_1_0_0_0);
		TERMINALS[23] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_1_0_1_0);
		TERMINALS[24] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_2_0_0_0);
		TERMINALS[25] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_2_0_0_1_0_0_0);
		TERMINALS[26] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_2_0_0_1_0_1_0);
		TERMINALS[27] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_0);
		TERMINALS[28] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_1_0);
		TERMINALS[29] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_2_0_0_0);
		TERMINALS[30] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_1);
		TERMINALS[31] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_2);
		TERMINALS[32] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_3);
		TERMINALS[33] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_0);
		TERMINALS[34] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_1_0_0_0);
		TERMINALS[35] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_2_0_0_0);
		TERMINALS[36] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_1);
		TERMINALS[37] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_2);
		TERMINALS[38] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_3);
		TERMINALS[39] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_0);
		TERMINALS[40] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_3_0_0_0);
		TERMINALS[41] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_1);
		TERMINALS[42] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_0_1);
		TERMINALS[43] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_0);
		TERMINALS[44] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_1);
		TERMINALS[45] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_2);
		TERMINALS[46] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_1);
		TERMINALS[47] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_2);
		TERMINALS[48] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_3);
		TERMINALS[49] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_4_0_0_0);
		TERMINALS[50] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_4_0_0_1);
		TERMINALS[51] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_0);
		TERMINALS[52] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_0_0_0_0);
		TERMINALS[53] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_2_0_0_0);
		TERMINALS[54] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_7_0_0_0);
		TERMINALS[55] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_9_0_0_0);
		TERMINALS[56] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_10);
		TERMINALS[57] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_9_0_0_2_0_0_0);
		TERMINALS[58] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_1);
		TERMINALS[59] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_2);
		TERMINALS[60] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_3);
		TERMINALS[61] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_0);
		TERMINALS[62] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_0);
		TERMINALS[63] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0);
		TERMINALS[64] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_1_0_0_0);
		TERMINALS[65] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0);
		TERMINALS[66] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_1);
		TERMINALS[67] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_1);
		TERMINALS[68] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_2);
		TERMINALS[69] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_0_0);
		TERMINALS[70] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_0);
		TERMINALS[71] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_4_0_0_0);
		TERMINALS[72] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_5);
		TERMINALS[73] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_6);
		TERMINALS[74] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_7);
		TERMINALS[75] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_9_0_0_0);
		TERMINALS[76] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_10);
		TERMINALS[77] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_1);
		TERMINALS[78] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_2);
		TERMINALS[79] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_3);
		TERMINALS[80] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_1);
		TERMINALS[81] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_2);
		TERMINALS[82] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_0);
		TERMINALS[83] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_4_0_0_0);
		TERMINALS[84] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_1_0_0_0);
		TERMINALS[85] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_2);
		TERMINALS[86] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_1_0_0_1);
		TERMINALS[87] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_3);
		TERMINALS[88] = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedStructuralFeature(bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_1);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPONENT__SOURCE);
		FEATURES[1] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPONENT__TARGET);
		FEATURES[2] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPONENT__SOURCE_MODELS);
		FEATURES[3] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPONENT__TARGET_MODELS);
		FEATURES[4] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPONENT__FORMAL_PARAMETERS);
		FEATURES[5] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE);
		FEATURES[6] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getTagged().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TAGGED__TAGS);
		FEATURES[7] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__COMPOSITION);
		FEATURES[8] = bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__BINDINGS);
		FEATURES[9] = bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.COMPOSITION__STEP);
		FEATURES[10] = bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.XOR_COND__VALUE);
		FEATURES[11] = bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.XOR__CONDITIONS);
		FEATURES[12] = bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.XOR_COND__STEP);
		FEATURES[13] = bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS);
		FEATURES[14] = bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS);
		FEATURES[15] = bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.SEQ__STEPS);
		FEATURES[16] = bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS);
		FEATURES[17] = bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot().getEStructuralFeature(bento.language.bentocomp.dsl.DslPackage.DEFINITION_ROOT__COMPONENT);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), FEATURES[17]);
		LINKS[1] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), FEATURES[17]);
		LINKS[2] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]);
		LINKS[3] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]);
		LINKS[4] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]);
		LINKS[5] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]);
		LINKS[6] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[7] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[8] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[9] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[10] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[11] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[12] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), FEATURES[5]);
		LINKS[13] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getJavaTemplate(), FEATURES[5]);
		LINKS[14] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[15] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[16] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[17] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[18] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[19] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[20] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[21] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[22] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[23] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[24] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[25] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[26] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[27] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[28] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[8]);
		LINKS[29] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[8]);
		LINKS[30] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[8]);
		LINKS[31] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[8]);
		LINKS[32] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]);
		LINKS[33] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]);
		LINKS[34] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]);
		LINKS[35] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]);
		LINKS[36] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[37] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[38] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[39] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[40] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[41] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[42] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[43] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[44] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]);
		LINKS[45] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]);
		LINKS[46] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[47] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]);
		LINKS[48] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[49] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[50] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[51] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]);
		LINKS[52] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[8]);
		LINKS[53] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[9]);
		LINKS[54] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[9]);
		LINKS[55] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[9]);
		LINKS[56] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef(), FEATURES[10]);
		LINKS[57] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), FEATURES[11]);
		LINKS[58] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]);
		LINKS[59] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]);
		LINKS[60] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]);
		LINKS[61] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]);
		LINKS[62] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]);
		LINKS[63] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]);
		LINKS[64] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[12]);
		LINKS[65] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[12]);
		LINKS[66] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[12]);
		LINKS[67] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]);
		LINKS[68] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]);
		LINKS[69] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]);
		LINKS[70] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]);
		LINKS[71] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]);
		LINKS[72] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]);
		LINKS[73] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]);
		LINKS[74] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]);
		LINKS[75] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]);
		LINKS[76] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]);
		LINKS[77] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]);
		LINKS[78] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]);
		LINKS[79] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]);
		LINKS[80] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]);
		LINKS[81] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]);
		LINKS[82] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]);
		LINKS[83] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]);
		LINKS[84] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]);
		LINKS[85] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]);
		LINKS[86] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]);
		LINKS[87] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]);
		LINKS[88] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]);
		LINKS[89] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]);
		LINKS[90] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[16]);
		LINKS[91] = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[16]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[2], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[3], EMPTY_LINK_ARRAY);
		TERMINALS[3].addFollower(TERMINALS[4], EMPTY_LINK_ARRAY);
		TERMINALS[4].addFollower(TERMINALS[5], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[6], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]), });
		TERMINALS[7].addFollower(TERMINALS[6], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]), });
		TERMINALS[8].addFollower(TERMINALS[9], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]), });
		TERMINALS[10].addFollower(TERMINALS[9], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]), });
		TERMINALS[11].addFollower(TERMINALS[13], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[11].addFollower(TERMINALS[14], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[12].addFollower(TERMINALS[15], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), FEATURES[5]), });
		TERMINALS[12].addFollower(TERMINALS[16], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getJavaTemplate(), FEATURES[5]), });
		TERMINALS[17].addFollower(TERMINALS[21], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[22], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[25], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[26], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[19].addFollower(TERMINALS[27], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[19].addFollower(TERMINALS[28], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[29].addFollower(TERMINALS[27], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[29].addFollower(TERMINALS[28], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[6].addFollower(TERMINALS[30], EMPTY_LINK_ARRAY);
		TERMINALS[30].addFollower(TERMINALS[31], EMPTY_LINK_ARRAY);
		TERMINALS[31].addFollower(TERMINALS[32], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[33], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[7], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[34], EMPTY_LINK_ARRAY);
		TERMINALS[33].addFollower(TERMINALS[27], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[33].addFollower(TERMINALS[28], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[35].addFollower(TERMINALS[27], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[35].addFollower(TERMINALS[28], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[9].addFollower(TERMINALS[36], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[37], EMPTY_LINK_ARRAY);
		TERMINALS[37].addFollower(TERMINALS[38], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[39].addFollower(TERMINALS[41], EMPTY_LINK_ARRAY);
		TERMINALS[41].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[41].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[34], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[34], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[42], EMPTY_LINK_ARRAY);
		TERMINALS[42].addFollower(TERMINALS[13], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[42].addFollower(TERMINALS[14], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[42].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[42].addFollower(TERMINALS[43], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]), });
		TERMINALS[14].addFollower(TERMINALS[44], EMPTY_LINK_ARRAY);
		TERMINALS[44].addFollower(TERMINALS[45], EMPTY_LINK_ARRAY);
		TERMINALS[45].addFollower(TERMINALS[13], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[45].addFollower(TERMINALS[14], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[45].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[45].addFollower(TERMINALS[43], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), FEATURES[7]), });
		TERMINALS[1].addFollower(TERMINALS[46], EMPTY_LINK_ARRAY);
		TERMINALS[46].addFollower(TERMINALS[47], EMPTY_LINK_ARRAY);
		TERMINALS[47].addFollower(TERMINALS[48], EMPTY_LINK_ARRAY);
		TERMINALS[48].addFollower(TERMINALS[49], EMPTY_LINK_ARRAY);
		TERMINALS[49].addFollower(TERMINALS[50], EMPTY_LINK_ARRAY);
		TERMINALS[50].addFollower(TERMINALS[49], EMPTY_LINK_ARRAY);
		TERMINALS[50].addFollower(TERMINALS[51], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[8]), });
		TERMINALS[50].addFollower(TERMINALS[52], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[6], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[0]), });
		TERMINALS[34].addFollower(TERMINALS[6], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), FEATURES[1]), });
		TERMINALS[53].addFollower(TERMINALS[9], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[2]), });
		TERMINALS[40].addFollower(TERMINALS[9], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(), FEATURES[3]), });
		TERMINALS[54].addFollower(TERMINALS[13], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(), FEATURES[4]), });
		TERMINALS[54].addFollower(TERMINALS[14], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(), FEATURES[4]), });
		TERMINALS[55].addFollower(TERMINALS[27], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[55].addFollower(TERMINALS[28], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[57].addFollower(TERMINALS[27], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[57].addFollower(TERMINALS[28], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(), FEATURES[6]), });
		TERMINALS[51].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[58].addFollower(TERMINALS[59], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[60], EMPTY_LINK_ARRAY);
		TERMINALS[60].addFollower(TERMINALS[51], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(), FEATURES[8]), });
		TERMINALS[60].addFollower(TERMINALS[52], EMPTY_LINK_ARRAY);
		TERMINALS[43].addFollower(TERMINALS[61], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[9]), });
		TERMINALS[43].addFollower(TERMINALS[62], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[9]), });
		TERMINALS[43].addFollower(TERMINALS[63], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[9]), });
		TERMINALS[61].addFollower(TERMINALS[64], EMPTY_LINK_ARRAY);
		TERMINALS[64].addFollower(TERMINALS[65], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef(), FEATURES[10]), new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), FEATURES[11]), });
		TERMINALS[66].addFollower(TERMINALS[61], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[12]), });
		TERMINALS[66].addFollower(TERMINALS[62], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[12]), });
		TERMINALS[66].addFollower(TERMINALS[63], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[12]), });
		TERMINALS[62].addFollower(TERMINALS[67], EMPTY_LINK_ARRAY);
		TERMINALS[67].addFollower(TERMINALS[68], EMPTY_LINK_ARRAY);
		TERMINALS[68].addFollower(TERMINALS[69], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]), });
		TERMINALS[68].addFollower(TERMINALS[70], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]), });
		TERMINALS[71].addFollower(TERMINALS[69], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]), });
		TERMINALS[71].addFollower(TERMINALS[70], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[13]), });
		TERMINALS[72].addFollower(TERMINALS[73], EMPTY_LINK_ARRAY);
		TERMINALS[73].addFollower(TERMINALS[74], EMPTY_LINK_ARRAY);
		TERMINALS[74].addFollower(TERMINALS[69], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]), });
		TERMINALS[74].addFollower(TERMINALS[70], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]), });
		TERMINALS[74].addFollower(TERMINALS[75], EMPTY_LINK_ARRAY);
		TERMINALS[74].addFollower(TERMINALS[76], EMPTY_LINK_ARRAY);
		TERMINALS[75].addFollower(TERMINALS[69], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]), });
		TERMINALS[75].addFollower(TERMINALS[70], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(), FEATURES[14]), });
		TERMINALS[76].addFollower(TERMINALS[55], EMPTY_LINK_ARRAY);
		TERMINALS[76].addFollower(TERMINALS[56], EMPTY_LINK_ARRAY);
		TERMINALS[76].addFollower(TERMINALS[64], EMPTY_LINK_ARRAY);
		TERMINALS[76].addFollower(TERMINALS[61], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]), });
		TERMINALS[76].addFollower(TERMINALS[62], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]), });
		TERMINALS[76].addFollower(TERMINALS[63], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]), });
		TERMINALS[69].addFollower(TERMINALS[71], EMPTY_LINK_ARRAY);
		TERMINALS[69].addFollower(TERMINALS[72], EMPTY_LINK_ARRAY);
		TERMINALS[70].addFollower(TERMINALS[77], EMPTY_LINK_ARRAY);
		TERMINALS[77].addFollower(TERMINALS[78], EMPTY_LINK_ARRAY);
		TERMINALS[78].addFollower(TERMINALS[79], EMPTY_LINK_ARRAY);
		TERMINALS[79].addFollower(TERMINALS[71], EMPTY_LINK_ARRAY);
		TERMINALS[79].addFollower(TERMINALS[72], EMPTY_LINK_ARRAY);
		TERMINALS[63].addFollower(TERMINALS[61], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), FEATURES[15]), });
		TERMINALS[63].addFollower(TERMINALS[62], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), FEATURES[15]), });
		TERMINALS[63].addFollower(TERMINALS[63], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), FEATURES[15]), });
		TERMINALS[65].addFollower(TERMINALS[66], EMPTY_LINK_ARRAY);
		TERMINALS[15].addFollower(TERMINALS[80], EMPTY_LINK_ARRAY);
		TERMINALS[80].addFollower(TERMINALS[81], EMPTY_LINK_ARRAY);
		TERMINALS[81].addFollower(TERMINALS[82], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[16]), });
		TERMINALS[83].addFollower(TERMINALS[82], new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] {new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(), FEATURES[16]), });
		TERMINALS[82].addFollower(TERMINALS[84], EMPTY_LINK_ARRAY);
		TERMINALS[82].addFollower(TERMINALS[85], EMPTY_LINK_ARRAY);
		TERMINALS[84].addFollower(TERMINALS[86], EMPTY_LINK_ARRAY);
		TERMINALS[86].addFollower(TERMINALS[85], EMPTY_LINK_ARRAY);
		TERMINALS[85].addFollower(TERMINALS[87], EMPTY_LINK_ARRAY);
		TERMINALS[87].addFollower(TERMINALS[83], EMPTY_LINK_ARRAY);
		TERMINALS[87].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[87].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[87].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[87].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[88], EMPTY_LINK_ARRAY);
		TERMINALS[88].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[88].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[88].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[88].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
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
