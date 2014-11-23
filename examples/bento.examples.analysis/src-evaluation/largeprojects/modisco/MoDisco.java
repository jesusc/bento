package largeprojects.modisco;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class MoDisco extends BaseTest {
	public static final String Java2KDM_TRANSFORMATION = "../bento.examples.analysis/third-party/largeprojects/modisco/java2kdm/javaToKdm.atl.xmi";
	public static final String KDM2UML_TRANSFORMATION = "../bento.examples.analysis/third-party/largeprojects/modisco/kdm2uml/KDMtoUML.atl.xmi";

	public static final String JAVA_METAMODEL   = "../bento.examples.analysis/third-party/largeprojects/modisco/metamodels/java.ecore";
	public static final String KDM_METAMODEL   = "../bento.examples.analysis/third-party/largeprojects/modisco/metamodels/kdm.ecore";
	public static final String UML_METAMODEL   = "../bento.examples.analysis/third-party/largeprojects/modisco/metamodels/UML2_1_0.ecore";
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new MoDisco().run();
	}
	
	public void run() throws IOException {
		String selectedError = "625:3-625:21"; //"75:3-75:30";
		
		/*
		 */
		typing(Java2KDM_TRANSFORMATION, new Object[] { JAVA_METAMODEL, KDM_METAMODEL }, 
				   new String[] { "java", "kdm" }, true);
		
		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("java", "tmp_/Java2KDM.slice.ecore", selectedError);
		generateEffectiveMetamodel("java", "tmp_/Java2KDM.effective.ecore");

		if ( selectedError != null ) sliceTrafo(selectedError);
		
		generateCSP(selectedError);


		//
		/*
		selectedError = null; //"330:4-330:39"; 
		
		typing(KDM2UML_TRANSFORMATION, new Object[] { KDM_METAMODEL, UML_METAMODEL }, 
				   new String[] { "kdm", "uml" }, true);
		
		// new ErrorPathGenerator(getErrorModel(), getTypingModel(), getAtlTransformation()).generatePath(findProblem(selectedError, OperationNotFound.class));
		
		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("uml", "tmp_/KDM2UML.slice.ecore", selectedError);
		generateEffectiveMetamodel("uml", "tmp_/KDM2UML.effective.ecore");
		generateCSP(selectedError);
		
		if ( selectedError != null ) sliceTrafo(selectedError);
		*/
	}

	

	
}
