package bento.fd2pn;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class BPMN2PN extends BaseTest {
	public static final String BPMN2PN_TRANSFORMATION = 
			"../../examples/bento.examples.flow_diagrams.petrinets/bindings/bpmn2pn/bpmn2pn.atl.xmi";
		
	public static final String BPMN_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/bindings/bpmn2pn/bpmn.ecore";
	public static final String PN_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/metamodels/petri_nets.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new BPMN2PN().run();
	}
	
	public void run() throws IOException {
		typing(BPMN2PN_TRANSFORMATION, new Object[] { BPMN_METAMODEL, PN_METAMODEL}, 
				   new String[] { "BPMN", "PN" }, false);
		
		System.out.println("Finished typing of " + BPMN2PN_TRANSFORMATION);
	}

}
