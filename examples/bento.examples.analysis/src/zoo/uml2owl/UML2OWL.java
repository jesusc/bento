package zoo.uml2owl;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class UML2OWL extends BaseTest {
	public static final String UML2OWL_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/uml2owl/UML2OWL.atl.xmi";
	
	
	public static final String UML_METAMODEL = "../bento.examples.analysis/third-party/zoo/uml2owl/UML2_3_0_0.ecore";
	public static final String OWL_METAMODEL = "../bento.examples.analysis/third-party/zoo/uml2owl/OWL/OWL.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new UML2OWL().run();
	}
	
	public void run() throws IOException {
		typing(UML2OWL_TRANSFORMATION, new Object[] { UML_METAMODEL, OWL_METAMODEL}, 
				   new String[] { "UML", "OWL" });
		
		
	}

}
