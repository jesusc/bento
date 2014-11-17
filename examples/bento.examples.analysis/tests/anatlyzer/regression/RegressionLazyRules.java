package anatlyzer.regression;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class RegressionLazyRules extends BaseTest {
	private final String UML_METAMODEL = testr("UML2_1_0.ecore");
	private final String KDM_METAMODEL = testr("kdm.ecore");
	
	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testLazyRuleFromImperative() throws IOException {
		String TRAFO = testr("KDMtoUML_possible_unresolved_binding_in_lazy_rule.atl.xmi");
		String selectedError = null; //"17:33-17:47";
		
		typing(TRAFO, new Object[] { UML_METAMODEL, KDM_METAMODEL }, 
				   new String[] { "uml", "kdm" }, true);
		
		generateGraphviz(selectedError);
		generateErrorSlice("uml", "tmp_/KDMtoUML_possible_unresolved_binding_in_lazy_rule.slice.ecore"); //, selectedError);
		generateEffectiveMetamodel("uml", "tmp_/KDMtoUML_possible_unresolved_binding_in_lazy_rule.effective.ecore");
		generateCSP(selectedError);
		
		printErrorsByType();
	}
	
	/*
	@Test
	public void testFeatureNofFound() throws IOException {
		String UML2PN_FEATURE_NOT_FOUND = "../bento.examples.analysis/tests/bento/tests/uml2pn_feature_not_found.atl.xmi";
		
		typing(UML2PN_FEATURE_NOT_FOUND, new Object[] { UML_METAMODEL, PN_METAMODEL}, 
				   new String[] { "UML", "PN" }, true);
	
		generateCSP();
	}
	*/
	


}
