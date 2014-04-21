package usecases.ocl2swrl;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class OCL2SWRL extends BaseTest {
	public static final String OCL2R2ML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/ocl2swrl/transformations/OCL2R2ML/OCL2R2ML.atl.xmi";
	
	
	public static final String OCL_METAMODEL = "../bento.examples.analysis/third-party/usecases/ocl2swrl/metamodels/ocl/OCL.ecore";
	public static final String R2ML_METAMODEL  = "../bento.examples.analysis/third-party/usecases/ocl2swrl/metamodels/r2ml/r2ml.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new OCL2SWRL().run();
	}
	
	public void run() throws IOException {
		typing(OCL2R2ML_TRANSFORMATION, new Object[] { OCL_METAMODEL, R2ML_METAMODEL}, 
				   new String[] { "OCL", "R2ML" }, true);
		
	}

}
