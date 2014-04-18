package bento.tests.rules;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class OclErrorsTests extends BaseTest {
	private static final String CD_METAMODEL = "../bento.examples.analysis/tests/bento/tests/ClassCD.ecore";
	private static final String UML_METAMODEL = "../bento.examples.analysis/tests/bento/tests/UML.ecore";
	private static final String PN_METAMODEL = "../bento.examples.analysis/tests/bento/tests/petri_nets.ecore";
	
	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testOperationNofFound() throws IOException {
		String CD2UML_OPERATION_NOT_FOUND = "../bento.examples.analysis/tests/bento/tests/class2uml_operation_not_found.atl.xmi";
		
		typing(CD2UML_OPERATION_NOT_FOUND, new Object[] { CD_METAMODEL, UML_METAMODEL }, 
				   new String[] { "CD", "UML" }, true);
		
		generateGraphviz();
		generateErrorSlice("CD", "tmp_/operation_not_found.slice.ecore");
		generateEffectiveMetamodel("CD", "tmp_/operation_not_found.effective.ecore");
		generateCSP();
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
