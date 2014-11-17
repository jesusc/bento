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
		String selectedError = null;
		
		/*
		 */
		/*
		typing(Java2KDM_TRANSFORMATION, new Object[] { JAVA_METAMODEL, KDM_METAMODEL }, 
				   new String[] { "java", "kdm" }, true);
		
		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("java", "tmp_/Java2KDM.slice.ecore", selectedError);
		generateEffectiveMetamodel("java", "tmp_/Java2KDM.effective.ecore");
		generateCSP(selectedError);
		*/
		
		//
	
		selectedError = "736:3-736:18";
		
		typing(KDM2UML_TRANSFORMATION, new Object[] { KDM_METAMODEL, UML_METAMODEL }, 
				   new String[] { "kdm", "uml" }, true);
		
		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("uml", "tmp_/KDM2UML.slice.ecore", selectedError);
		generateEffectiveMetamodel("uml", "tmp_/KDM2UML.effective.ecore");
		generateCSP(selectedError);
	}

}
