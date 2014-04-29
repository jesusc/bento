package bento.tests.path;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class PathTests extends BaseTest {
	private static final String UML_METAMODEL = "../bento.examples.analysis/tests/ase/running/UML2_3_0_0.ecore";
	private static final String BPMN_METAMODEL = "../bento.examples.analysis/tests/ase/running/bpmn.ecore";
	
	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testUML2BPMN() throws IOException {
		String UML2Intalio_nested_iterator = "../bento.examples.analysis/tests/bento/tests/path/UML2Intalio_nested_iterator.atl.xmi";
		
		typing(UML2Intalio_nested_iterator, new Object[] { UML_METAMODEL, BPMN_METAMODEL }, 
				   new String[] { "UML", "Intalio" }, true);
		
		generateGraphviz();
		generateErrorSlice("UML", "tmp_/uml2intalio_nested_iterator.slice.ecore");
		generateEffectiveMetamodel("UML", "tmp_/uml2intalio_nested_iterator.effective.ecore");
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
