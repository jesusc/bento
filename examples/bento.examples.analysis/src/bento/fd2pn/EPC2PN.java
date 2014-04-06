package bento.fd2pn;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class EPC2PN extends BaseTest {
	public static final String EPC2PN_TRANSFORMATION = 
			"../../examples/bento.examples.flow_diagrams.petrinets/bindings/epc2pn/epc2pn.atl.xmi";
		
	public static final String EPC_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/bindings/epc2pn/epc.ecore";
	public static final String PN_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/metamodels/petri_nets.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new EPC2PN().run();
	}
	
	public void run() throws IOException {
		typing(EPC2PN_TRANSFORMATION, new Object[] { EPC_METAMODEL, PN_METAMODEL}, 
				   new String[] { "EPC", "PN" }, false);
		
		System.out.println("Finished typing of " + EPC2PN_TRANSFORMATION);
	}

}
