package usecases.sbvr2uml;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class SBVR2UML extends BaseTest {
	public static final String SBVR2UML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/sbvr2uml/SimpleSBVR2SimpleUML.atl.xmi";
	public static final String SYNTAX2SBVR_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/sbvr2uml/Syntax2SimpleSBVR.atl.xmi";
	
	
	public static final String SYNTAX_METAMODEL = "../bento.examples.analysis/third-party/usecases/sbvr2uml/Syntax/Syntax.ecore";
	public static final String SBVR_METAMODEL = "../bento.examples.analysis/third-party/usecases/sbvr2uml/SimpleSBVR/SimpleSBVR.ecore";
	public static final String UML_METAMODEL = "../bento.examples.analysis/third-party/usecases/sbvr2uml/SimpleUML/SimpleUML.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new SBVR2UML().run();
	}
	
	public void run() throws IOException {
		String selectedError = "167:9-167:31";
		
		typing(SBVR2UML_TRANSFORMATION, new Object[] { SBVR_METAMODEL, UML_METAMODEL }, 
				   new String[] { "SimpleSBVR", "SimpleUML" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("SimpleSBVR", "tmp_/SBVR2UML.slice.ecore", selectedError);
		generateEffectiveMetamodel("SimpleSBVR", "tmp_/SBVR2UML.effective.ecore");
		generateCSP(selectedError);

		//
		
		/*
		typing(SYNTAX2SBVR_TRANSFORMATION, new Object[] { SYNTAX_METAMODEL, SBVR_METAMODEL }, 
				   new String[] { "Syntax", "SimpleSBVR" }, false);
		*/
	}

}
