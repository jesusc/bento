package usecases.cpl2spl;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class CPL2SPL extends BaseTest {
	public static final String CPL2SPL_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/cpl2spl/CPL2SPL.atl.xmi";
	
	
	public static final String CPL_METAMODEL = "../bento.examples.analysis/third-party/usecases/cpl2spl/CPL/CPL.ecore";
	public static final String SPL_METAMODEL = "../bento.examples.analysis/third-party/usecases/cpl2spl/SPL/SPL.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new CPL2SPL().run();
	}
	
	public void run() throws IOException {
		typing(CPL2SPL_TRANSFORMATION, new Object[] { CPL_METAMODEL, SPL_METAMODEL}, 
				   new String[] { "CPL", "SPL" });
		
		System.out.println("Finished typing of " + CPL2SPL_TRANSFORMATION);
	}

}