package usecases.fiacre2lotos;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Fiacre2Lotos extends BaseTest {
	public static final String Fiacre2Lotos_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/fiacre2lotos/Compiler/FIACRE2LOTOS.atl.xmi";
	
	
	public static final String FIACRE_METAMODEL = "../bento.examples.analysis/third-party/usecases/fiacre2lotos/Metamodel/FIACRE.ecore";
	public static final String LOTOS_METAMODEL = "../bento.examples.analysis/third-party/usecases/fiacre2lotos/Metamodel/LOTOS.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Fiacre2Lotos().run();
	}
	
	public void run() throws IOException {
		typing(Fiacre2Lotos_TRANSFORMATION, new Object[] { FIACRE_METAMODEL, LOTOS_METAMODEL}, 
				   new String[] { "FIACRE", "LOTOS" });
		
		
	}

}
