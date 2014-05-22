package usecases.ocl2swrl;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class OCL2SWRL extends BaseTest {
	public static final String OCL2R2ML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/ocl2swrl/transformations/OCL2R2ML/OCL2R2ML.atl.xmi";
	public static final String R2ML2RDM_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/ocl2swrl/transformations/R2ML2RDM/R2ML2RDM.atl.xmi";
	public static final String R2ML2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/ocl2swrl/transformations/R2ML2XML/R2ML2XML.atl.xmi";
	public static final String RDM2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/ocl2swrl/transformations/RDM2XML/RDM2XML.atl.xmi";
	
	public static final String OCL_METAMODEL = "../bento.examples.analysis/third-party/usecases/ocl2swrl/metamodels/ocl/OCL.ecore";
	public static final String R2ML_METAMODEL  = "../bento.examples.analysis/third-party/usecases/ocl2swrl/metamodels/r2ml/r2ml.ecore";
	public static final String RDM_METAMODEL  = "../bento.examples.analysis/third-party/usecases/ocl2swrl/metamodels/rdm/rdm.ecore";
	public static final String XML_METAMODEL  = "../bento.examples.analysis/third-party/usecases/ocl2swrl/metamodels/xml/XML.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new OCL2SWRL().run();
	}
	
	public void run() throws IOException {
		typing(OCL2R2ML_TRANSFORMATION, new Object[] { OCL_METAMODEL, R2ML_METAMODEL}, 
				   new String[] { "OCL", "R2ML" }, true);

		printStatistics();
		printErrorsByType();

		String selectedError = "203:7-203:29";
		generateGraphviz(selectedError);
		generateErrorSlice("OCL", "tmp_/ocl2rml.slice.ecore", selectedError);
		generateEffectiveMetamodel("OCL", "tmp_/ocl2rml.effective.ecore");
		generateCSP(selectedError);
		
		// 
		
//		typing(R2ML2RDM_TRANSFORMATION, new Object[] { R2ML_METAMODEL, RDM_METAMODEL }, 
//				   new String[] { "R2ML", "RDM" }, false);

		//
		
//		typing(R2ML2XML_TRANSFORMATION, new Object[] { R2ML_METAMODEL, XML_METAMODEL }, 
//				   new String[] { "R2ML", "XML" }, false);

		//
		
//		typing(RDM2XML_TRANSFORMATION, new Object[] { RDM_METAMODEL, XML_METAMODEL }, 
//				   new String[] { "RDM", "XML" }, false);

	
	}

}
