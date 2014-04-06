package bento.fd2pn;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class BENDER2PN extends BaseTest {
	public static final String BENDER2PN_TRANSFORMATION = 
			"../../examples/bento.examples.flow_diagrams.petrinets/bindings/bender2pn/bender2pn.atl.xmi";
		
	public static final String BENDER_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/bindings/bender2pn/StateMachine.ecore";
	public static final String PN_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/metamodels/petri_nets.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new BENDER2PN().run();
	}
	
	public void run() throws IOException {
		typing(BENDER2PN_TRANSFORMATION, new Object[] { BENDER_METAMODEL, PN_METAMODEL}, 
				   new String[] { "BENDER", "PN" }, false);
		
		System.out.println("Finished typing of " + BENDER2PN_TRANSFORMATION);
	}

}
