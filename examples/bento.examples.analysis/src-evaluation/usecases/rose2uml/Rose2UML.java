package usecases.rose2uml;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Rose2UML extends BaseTest {
	public static final String MDL2UML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/rose2uml/MDL2UML21.atl.xmi";
	public static final String MDL2GMF_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/rose2uml/MDL2GMF.atl.xmi";
	
	/*
	public static final String UML_METAMODEL = "../bento.examples.analysis/third-party/usecases/sbvr2uml/Syntax/Syntax.ecore";
	public static final String _METAMODEL = "../bento.examples.analysis/third-party/usecases/sbvr2uml/SimpleSBVR/SimpleSBVR.ecore";
	public static final String UML_METAMODEL = "../bento.examples.analysis/third-party/usecases/sbvr2uml/SimpleUML/SimpleUML.ecore";
	*/
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Rose2UML().run();
	}
	
	public void run() throws IOException {
//		typing(SBVR2UML_TRANSFORMATION, new Object[] { SBVR_METAMODEL, UML_METAMODEL }, 
//				   new String[] { "SimpleSBVR", "SimpleUML" }, false);
		
		
	}

}
