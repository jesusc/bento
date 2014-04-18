package zoo.grafcet2petrinet;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Grafcet2Petrinet extends BaseTest {
	public static final String GRAFCET2PETRINET_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Transformations/Grafcet2PetriNet.atl.xmi";
	public static final String PETRINET2GRAFCET_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Transformations/PetriNet2Grafcet.atl.xmi";
	public static final String PETRINET2PNML_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Transformations/PetriNet2PNML.atl.xmi";
	public static final String PNML2PETRINET_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Transformations/PNML2PetriNet.atl.xmi";
	public static final String PNML2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Transformations/PNML2XML.atl.xmi";
	public static final String XML2PNML_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Transformations/XML2PNML.atl.xmi";
	
	
	public static final String GRAFCET_METAMODEL = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Metamodels/Grafcet.ecore";
	public static final String XML_METAMODEL = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Metamodels/XML.ecore";
	public static final String PN_METAMODEL = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Metamodels/PetriNet.ecore";
	public static final String PNML_METAMODEL = "../bento.examples.analysis/third-party/zoo/grafcet2petrinet/Metamodels/PNML_simplified.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Grafcet2Petrinet().run();
	}
	
	public void run() throws IOException {
		typing(GRAFCET2PETRINET_TRANSFORMATION, new Object[] { GRAFCET_METAMODEL, PN_METAMODEL }, 
				   new String[] { "Grafcet", "PetriNet" }, true);
		
		// generateCSP();
		generateGraphviz();
		
		//
		
		typing(PETRINET2GRAFCET_TRANSFORMATION, new Object[] { PN_METAMODEL, GRAFCET_METAMODEL }, 
				   new String[] { "PetriNet", "Grafcet" }, true);
		
		// generateCSP();
		generateGraphviz();
		
		//
		
		typing(PETRINET2PNML_TRANSFORMATION, new Object[] { PN_METAMODEL, PNML_METAMODEL }, 
				   new String[] { "PetriNet", "PNML" }, true);
		
		// generateCSP();
		generateGraphviz();
		
		// 
		
		typing(PNML2PETRINET_TRANSFORMATION, new Object[] { PNML_METAMODEL, PN_METAMODEL }, 
				   new String[] { "PNML", "PetriNet" }, true);
		
		// generateCSP();
		generateGraphviz();
		
		//
		
		typing(PNML2XML_TRANSFORMATION, new Object[] { PNML_METAMODEL, XML_METAMODEL }, 
				   new String[] { "PNML", "XML" }, true);
		
		// generateCSP();
		generateGraphviz();
		
		//

		typing(XML2PNML_TRANSFORMATION, new Object[] { XML_METAMODEL, PNML_METAMODEL }, 
				   new String[] { "XML", "PNML" }, true);
		
		// generateCSP();
		generateGraphviz();

	}

}
