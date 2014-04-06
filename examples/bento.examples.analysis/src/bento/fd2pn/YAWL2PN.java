package bento.fd2pn;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class YAWL2PN extends BaseTest {
	public static final String YAWL2PN_TRANSFORMATION = 
			"../../examples/bento.examples.flow_diagrams.petrinets/bindings/yawl2pn/yawl2pn.atl.xmi";
		
	public static final String YAWL_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/bindings/yawl2pn/yawl.ecore";
	public static final String PN_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/metamodels/petri_nets.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new YAWL2PN().run();
	}
	
	public void run() throws IOException {
		typing(YAWL2PN_TRANSFORMATION, new Object[] { YAWL_METAMODEL, PN_METAMODEL}, 
				   new String[] { "YAWL", "PN" }, false);
		
		System.out.println("Finished typing of " + YAWL2PN_TRANSFORMATION);
	}

}
