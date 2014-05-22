package usecases.simplepdl2tina;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class SimplePDL2Tina extends BaseTest {
	public static final String SimplePDL2Tina_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/simplepdl2tina/SimplePDL2PetriNet.atl.xmi";
	
	
	public static final String PDL_METAMODEL = "../bento.examples.analysis/third-party/usecases/simplepdl2tina/pdl.ecore";
	public static final String PN_METAMODEL  = "../bento.examples.analysis/third-party/usecases/simplepdl2tina/PetriNet.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new SimplePDL2Tina().run();
	}
	
	public void run() throws IOException {
		typing(SimplePDL2Tina_TRANSFORMATION, new Object[] { PDL_METAMODEL, PN_METAMODEL}, 
				   new String[] { "pdl", "PetriNet" }, true);
		
		printStatistics();
		printErrorsByType();
	}

}
