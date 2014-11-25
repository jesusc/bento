package anatlyzer.regression;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class RegressionRuleResolution extends BaseTest {
	private final String UML_METAMODEL = testr("UML2_1_0.ecore");
	private final String KDM_METAMODEL = testr("kdm.ecore");

	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testRuleResolution() throws IOException {
		String TRAFO = testr("KDMtoUML_rule_resolution.atl.xmi");
		String selectedError = "16:4-16:39";
		
		typing(TRAFO, new Object[] { UML_METAMODEL, KDM_METAMODEL }, 
				   new String[] { "uml", "kdm" }, true);
		
		generateGraphviz(selectedError);
		generateErrorSlice("uml", "tmp_/KDMtoUML_rule_resolution.slice.ecore"); //, selectedError);
		generateEffectiveMetamodel("uml", "tmp_/KDMtoUML_rule_resolution.effective.ecore");
		generateCSP(selectedError);
		
		printErrorsByType();
	}
	


}
