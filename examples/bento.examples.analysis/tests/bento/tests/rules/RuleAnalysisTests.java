package bento.tests.rules;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class RuleAnalysisTests extends BaseTest {
	
	private static final String UML2PN_INVALID_RULES = "../bento.examples.analysis/tests/bento/tests/uml2pn.atl.xmi";
	private static final String UML_METAMODEL = "../bento.examples.analysis/tests/bento/tests/UML.ecore";
	private static final String PN_METAMODEL = "../bento.examples.analysis/tests/bento/tests/petri_nets.ecore";
	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void test() throws IOException {
		typing(UML2PN_INVALID_RULES, new Object[] { UML_METAMODEL, PN_METAMODEL}, 
				   new String[] { "UML", "PN" });
	}

}
