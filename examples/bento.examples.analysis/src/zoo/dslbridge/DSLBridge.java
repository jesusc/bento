package zoo.dslbridge;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class DSLBridge extends BaseTest {
	public static final String DSL2KM3_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/dslbridge/MetamodelBridge/Transfo/DSL2KM3.atl.xmi";
	public static final String DSL2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/dslbridge/MetamodelBridge/Transfo/DSL2XML.atl.xmi";
	
	
	public static final String DSL_METAMODEL = "../bento.examples.analysis/third-party/zoo/dslbridge/MetaModels/DSL.ecore";
	public static final String KM3_METAMODEL = "../bento.examples.analysis/third-party/zoo/dslbridge/MetaModels/KM3.ecore";
	public static final String XML_METAMODEL = "../bento.examples.analysis/third-party/zoo/dslbridge/MetaModels/XML.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new DSLBridge().run();
	}
	
	public void run() throws IOException {
		typing(DSL2KM3_TRANSFORMATION, new Object[] { DSL_METAMODEL, KM3_METAMODEL}, 
				   new String[] { "DSL", "KM3" });
		
		System.out.println("Finished typing of " + DSL2KM3_TRANSFORMATION);

		typing(DSL2XML_TRANSFORMATION, new Object[] { DSL_METAMODEL, XML_METAMODEL}, 
				   new String[] { "DSL", "XML" });
		
		System.out.println("Finished typing of " + DSL2KM3_TRANSFORMATION);

	}

}
