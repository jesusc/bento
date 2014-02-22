package zoo.class2relational;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Class2Relational extends BaseTest {
	public static final String ATL_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/class2relational/ATLFile/Class2Relational.atl.xmi";
	public static final String ECORE_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/class2relational/ATLFile/ECore2Class.atl.xmi";
	
	public static final String TARGET_METAMODEL_NAME = "Relational";

	private static final String SOURCE_METAMODEL_NAME = "Class";

	public static final String SOURCE_METAMODEL = "../bento.examples.analysis/third-party/zoo/class2relational/Class/Class.xmi";
	public static final String TARGET_METAMODEL = "../bento.examples.analysis/third-party/zoo/class2relational/Relational/Relational.xmi";
	public static final String ECORE_METAMODEL = "../bento.examples.analysis/third-party/zoo/class2relational/Ecore/Ecore.ecore";


	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Class2Relational().run();
	}
	
	public void run() throws IOException {
		typing(ATL_TRANSFORMATION, new Object[] { SOURCE_METAMODEL, TARGET_METAMODEL }, 
				   new String[] { SOURCE_METAMODEL_NAME, TARGET_METAMODEL_NAME });

		System.out.println("Finished typing of " + ATL_TRANSFORMATION);

		typing(ECORE_TRANSFORMATION, new Object[] { ECORE_METAMODEL, SOURCE_METAMODEL }, 
				   new String[] { "MOF", SOURCE_METAMODEL_NAME });

		System.out.println("Finished typing of " + ECORE_TRANSFORMATION);
		
	}

}
