package zoo.ant2maven;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class AnalysisAnt2Maven extends BaseTest {
	public static final String ATL_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/ant2maven/transfo/Ant2Maven.atl.xmi";
	public static final String TARGET_METAMODEL_NAME = "OUTMaven";
	public static final String TARGET_METAMODEL_NAME2 = "OUTProject";
	
	private static final String SOURCE_METAMODEL_NAME = "IN";

	public static final String SOURCE_METAMODEL = "../bento.examples.analysis/third-party/zoo/ant2maven/MM/Ant.ecore";
	public static final String TARGET_METAMODEL = "../bento.examples.analysis/third-party/zoo/ant2maven/MM/MavenMaven.ecore";
	public static final String TARGET_METAMODEL2 = "../bento.examples.analysis/third-party/zoo/ant2maven/MM/MavenProject.ecore";


	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new AnalysisAnt2Maven().run();
	}
	
	public void run() throws IOException {
		// typing
		typing(ATL_TRANSFORMATION, new Object[] { SOURCE_METAMODEL, TARGET_METAMODEL, TARGET_METAMODEL2 }, 
								   new String[] { "Ant", "MavenMaven", "MavenProject" });
		
		// getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Finished typing of " + AnalysisAnt2Maven.class.getSimpleName());
	}

}
