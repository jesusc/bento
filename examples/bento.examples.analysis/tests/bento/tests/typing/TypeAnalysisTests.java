package bento.tests.typing;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import analysis.BaseTest;

public class TypeAnalysisTests extends BaseTest {
	private static final String UML_METAMODEL = "../bento.examples.analysis/tests/bento/tests/UML.ecore";
	private static final String PN_METAMODEL = "../bento.examples.analysis/tests/bento/tests/petri_nets.ecore";
	
	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testSelectKindOf() throws IOException {
		String UML2PN_SELECT_KINDOF = "../bento.examples.analysis/tests/bento/tests/typing/select_kind_of.atl.xmi";
		
		typing(UML2PN_SELECT_KINDOF, new Object[] { UML_METAMODEL, PN_METAMODEL}, 
				   new String[] { "UML", "PN" }, true);

	}
	
	


}
