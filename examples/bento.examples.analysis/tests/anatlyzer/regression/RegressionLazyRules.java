package anatlyzer.regression;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class RegressionLazyRules extends BaseTest {
	private final String UML_METAMODEL = testr("UML2_1_0.ecore");
	private final String KDM_METAMODEL = testr("kdm.ecore");
	private final String JAVA_METAMODEL = testr("java.ecore");
	
	
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

	@Test
	public void testPassingTargetElements() throws IOException {
		String TRAFO = testr("javaToKdm_passing_target_elements.atl.xmi");
		String selectedError = "84:4-84:22";
		
		typing(TRAFO, new Object[] { JAVA_METAMODEL, KDM_METAMODEL }, 
				   new String[] { "java", "kdm" }, true);
		
		generateGraphviz(selectedError);
		generateErrorSlice("java", "tmp_/javaToKdm_error.slice.ecore"); //, selectedError);
		generateEffectiveMetamodel("java", "tmp_/javaToKdm_error.effective.ecore");
		generateCSP(selectedError);
		
		printErrorsByType();
	}

	


}
