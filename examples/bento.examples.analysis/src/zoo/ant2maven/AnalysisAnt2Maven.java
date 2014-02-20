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

	private static final String XML2ANT	= "../bento.examples.analysis/third-party/zoo/ant2maven/transfo/XML2Ant.atl.xmi";

	public static final String MAVEN2XML = "../bento.examples.analysis/third-party/zoo/ant2maven/transfo/Maven2XML.atl.xmi";
	public static final String MAVEN_MAVEN = "../bento.examples.analysis/third-party/zoo/ant2maven/MM/MavenMaven.ecore";
	public static final String MAVEN_PROJECT = "../bento.examples.analysis/third-party/zoo/ant2maven/MM/MavenProject.ecore";
	public static final String XML_PROJECT = "../bento.examples.analysis/third-party/zoo/ant2maven/MM/XML.xmi";
	public static final String XML_MAVEN = "../bento.examples.analysis/third-party/zoo/ant2maven/MM/XML.xmi";
	private static final String	XML_ANT	= "../bento.examples.analysis/third-party/zoo/ant2maven/MM/XML.xmi";
		


	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new AnalysisAnt2Maven().run();
	}
	
	public void run() throws IOException {
		typing(XML2ANT, new Object[] { XML_ANT, SOURCE_METAMODEL }, 
				   new String[] { "XML", "Ant" });

		System.out.println("Finished typing of " + XML2ANT);

		typing(ATL_TRANSFORMATION, new Object[] { SOURCE_METAMODEL, TARGET_METAMODEL, TARGET_METAMODEL2 }, 
								   new String[] { "Ant", "MavenMaven", "MavenProject" });
		
		System.out.println("Finished typing of " + ATL_TRANSFORMATION);

		typing(MAVEN2XML, new Object[] { MAVEN_PROJECT, MAVEN_MAVEN, XML_PROJECT, XML_MAVEN }, 
				   new String[] { "MavenProject", "MavenMaven", "XMLProject", "XMLMaven" });

		System.out.println("Finished typing of " + MAVEN2XML);

	}

}
