package bento.tests.rules;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class TargetMetamodelAnalysisTests extends BaseTest {
	private static final String UML_METAMODEL = "../bento.examples.analysis/tests/bento/tests/UML.ecore";
	private static final String PN_METAMODEL = "../bento.examples.analysis/tests/bento/tests/petri_nets.ecore";
	
	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testMissingRules() throws IOException {
		String UML2PN_MISSING_BINDING = "../bento.examples.analysis/tests/bento/tests/uml2pn_missing_binding.atl.xmi";
		
		typing(UML2PN_MISSING_BINDING, new Object[] { UML_METAMODEL, PN_METAMODEL}, 
				   new String[] { "UML", "PN" }, true);
	
		generateCSP();
	}
	
	


}
