package bento.tests.style;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.junit.BeforeClass;
import org.junit.Test;

import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import analysis.BaseTest;

public class StyleTests extends BaseTest {

	private static final String ABCD_METAMODEL = "../bento.examples.analysis/tests/bento/tests/ABCD.ecore";
	private static final String WXYZ_METAMODEL = "../bento.examples.analysis/tests/bento/tests/WXYZ.ecore";

	
	@BeforeClass
	public static void setupEMF() {
		Util.registerResourceFactory();
	}
	
	@Test
	public void testReadingTargetFeature() throws IOException {
		String READING_TARGET = "../bento.examples.analysis/tests/bento/tests/style/reading_target_feature.atl.xmi";
		
		typing(READING_TARGET, new Object[] { ABCD_METAMODEL, WXYZ_METAMODEL}, 
				   new String[] { "ABCD", "WXYZ" }, true);

	}

}
