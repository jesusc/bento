package bento.tests.rules;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class RuleAnalysisTests extends BaseTest {
	private static final String UML_METAMODEL = "../bento.examples.analysis/tests/bento/tests/UML.ecore";
	private static final String PN_METAMODEL = "../bento.examples.analysis/tests/bento/tests/petri_nets.ecore";
	private static final String ABCD_METAMODEL = "../bento.examples.analysis/tests/bento/tests/ABCD.ecore";
	private static final String WXYZ_METAMODEL = "../bento.examples.analysis/tests/bento/tests/WXYZ.ecore";
	
	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testMissingRules() throws IOException {
		String UML2PN_MISSING_RULES = "../bento.examples.analysis/tests/bento/tests/uml2pn_missing_rules.atl.xmi";
		
		typing(UML2PN_MISSING_RULES, new Object[] { UML_METAMODEL, PN_METAMODEL}, 
				   new String[] { "UML", "PN" });
	}

	
	@Test
	public void testPossiblyMissingRule() throws IOException {
		String ABCD_POSSIBLY_MISSING_RULES = "../bento.examples.analysis/tests/bento/tests/abcd_possibly_missing_rule.atl.xmi";
		
		typing(ABCD_POSSIBLY_MISSING_RULES, new Object[] { ABCD_METAMODEL, ABCD_METAMODEL}, 
				   new String[] { "MM", "MM" });
	}

	@Test
	public void testNoUnresolvedBinding() throws IOException {
		String ABCD_POSSIBLY_MISSING_RULES = "../bento.examples.analysis/tests/bento/tests/abcd_no_unresolved_binding.atl.xmi";
		
		typing(ABCD_POSSIBLY_MISSING_RULES, new Object[] { ABCD_METAMODEL, WXYZ_METAMODEL}, 
				   new String[] { "ABCD", "WXYZ" });
	}

	@Test
	public void testMissingRulesForSubtype() throws IOException {
		String UML2PN_MISSING_RULE_FOR_SUBTYPE = "../bento.examples.analysis/tests/bento/tests/uml2pn_missing_rule_for_subtype.atl.xmi";
		
		typing(UML2PN_MISSING_RULE_FOR_SUBTYPE, new Object[] { UML_METAMODEL, PN_METAMODEL}, 
				   new String[] { "UML", "PN" });
	}

}
