package zoo.emf2km3;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class EMF2KM3 extends BaseTest {
	public static final String EMF2KM3_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/emf2km3/EMF2KM3.atl.xmi";
	
	
	public static final String KM3_METAMODEL = "../bento.examples.analysis/third-party/zoo/emf2km3/KM3.ecore";
	public static final String Ecore_METAMODEL = "../bento.examples.analysis/third-party/zoo/emf2km3/Ecore.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new EMF2KM3().run();
	}
	
	public void run() throws IOException {
		typing(EMF2KM3_TRANSFORMATION, new Object[] { Ecore_METAMODEL, KM3_METAMODEL}, 
				   new String[] { "MOF", "KM3" });
		
		System.out.println("Finished typing of " + EMF2KM3_TRANSFORMATION);
	}

}
