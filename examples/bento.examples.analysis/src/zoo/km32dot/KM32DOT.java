package zoo.km32dot;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class KM32DOT extends BaseTest {
	public static final String KM32DOT_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/km32dot/Transformations/KM32DOT.atl.xmi";
	
	
	public static final String KM3_METAMODEL = "../bento.examples.analysis/third-party/zoo/km32dot/Metamodels/KM3.ecore";
	public static final String DOT_METAMODEL = "../bento.examples.analysis/third-party/zoo/km32dot/Metamodels/DOT.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new KM32DOT().run();
	}
	
	public void run() throws IOException {
		typing(KM32DOT_TRANSFORMATION, new Object[] { KM3_METAMODEL, DOT_METAMODEL}, 
				   new String[] { "KM3", "DOT" });
		
		
	}

}
