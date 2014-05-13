package usecases.codeclonetools;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class CodeCloneTools extends BaseTest {
	public static final String CloneDr2CodeClone_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Transformations/CloneDr2CodeClone.atl.xmi";
	public static final String Simian2CodeClone_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Transformations/Simian2CodeClone.atl.xmi";
	public static final String SimScan2CodeClone_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Transformations/SimScan2CodeClone.atl.xmi";
	
	public static final String CodeClone2SVG_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Transformations/CodeClone2SVG.atl.xmi";
	public static final String CodeClone2SVG2_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Transformations/CodeClone2SVG2.atl.xmi";
	
	public static final String SVG2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Transformations/SVG2XML.atl.xmi";
	
	public static final String CODECLONE_METAMODEL = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Metamodels/CodeClone/CodeClone.ecore";
	public static final String CLONEDR_METAMODEL   = "../bento.examples.analysis/third-party/usecases/codeclonetools/CloneDr/Metamodel/CloneDr.ecore";
	public static final String SIMSCAN_METAMODEL   = "../bento.examples.analysis/third-party/usecases/codeclonetools/SimScan/Metamodel/SimScan.ecore";

	public static final String SIMIAN_METAMODEL   = "../bento.examples.analysis/third-party/usecases/codeclonetools/Simian/Metamodel/Simian.ecore";
	public static final String FILEINFO_METAMODEL  = "../bento.examples.analysis/third-party/usecases/codeclonetools/FileInfo/Metamodel/FileInfo.ecore";
	public static final String SVG_METAMODEL = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Metamodels/SVG/SVG.ecore";

	public static final String XML_METAMODEL = "../bento.examples.analysis/third-party/usecases/codeclonetools/CodeClone/Metamodels/XML/XML.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new CodeCloneTools().run();
	}
	
	public void run() throws IOException {
		typing(CloneDr2CodeClone_TRANSFORMATION, new Object[] { CLONEDR_METAMODEL, FILEINFO_METAMODEL, CODECLONE_METAMODEL }, 
				   new String[] { "CloneDr", "FileInfo", "CodeClone" }, true);
		
		generateGraphviz();
		generateCSP();
		
		//
		
		typing(Simian2CodeClone_TRANSFORMATION, new Object[] { SIMIAN_METAMODEL, FILEINFO_METAMODEL, CODECLONE_METAMODEL }, 
				   new String[] { "Simian", "FileInfo", "CodeClone" }, true);
		
		generateCSP();

		//
		
		typing(SimScan2CodeClone_TRANSFORMATION, new Object[] { SIMSCAN_METAMODEL, FILEINFO_METAMODEL, CODECLONE_METAMODEL }, 
				   new String[] { "SimScan", "FileInfo", "CodeClone" }, true);
		
		generateCSP();

		typing(SVG2XML_TRANSFORMATION, new Object[] { SVG_METAMODEL, XML_METAMODEL}, 
				   new String[] { "SVG", "XML" }, true);
		
		generateCSP();
				
		// WITH TYPE ERRORS!
		typing(CodeClone2SVG_TRANSFORMATION, new Object[] { CODECLONE_METAMODEL, SVG_METAMODEL }, 
				   new String[] { "CodeClone", "SVG" }, true);
		
		generateCSP();
		
		typing(CodeClone2SVG2_TRANSFORMATION, new Object[] { CODECLONE_METAMODEL, SVG_METAMODEL }, 
				   new String[] { "CodeClone", "SVG" }, true);
		
		generateCSP();

	}

}