package zoo.codeclonetools;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class CodeCloneTools extends BaseTest {
	public static final String CloneDr2CodeClone_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Transformations/CloneDr2CodeClone.atl.xmi";
	public static final String Simian2CodeClone_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Transformations/Simian2CodeClone.atl.xmi";
	public static final String SimScan2CodeClone_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Transformations/SimScan2CodeClone.atl.xmi";
	
	public static final String CodeClone2SVG_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Transformations/CodeClone2SVG.atl.xmi";
	public static final String CodeClone2SVG2_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Transformations/CodeClone2SVG2.atl.xmi";
	
	public static final String SVG2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Transformations/SVG2XML.atl.xmi";
	
	public static final String CODECLONE_METAMODEL = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Metamodels/CodeClone/CodeClone.ecore";
	public static final String CLONEDR_METAMODEL   = "../bento.examples.analysis/third-party/zoo/codeclonetools/CloneDr/Metamodel/CloneDr.ecore";
	public static final String SIMSCAN_METAMODEL   = "../bento.examples.analysis/third-party/zoo/codeclonetools/SimScan/Metamodel/SimScan.ecore";

	public static final String SIMIAN_METAMODEL   = "../bento.examples.analysis/third-party/zoo/codeclonetools/Simian/Metamodel/Simian.ecore";
	public static final String FILEINFO_METAMODEL  = "../bento.examples.analysis/third-party/zoo/codeclonetools/FileInfo/Metamodel/FileInfo.ecore";
	public static final String SVG_METAMODEL = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Metamodels/SVG/SVG.ecore";

	public static final String XML_METAMODEL = "../bento.examples.analysis/third-party/zoo/codeclonetools/CodeClone/Metamodels/XML/XML.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new CodeCloneTools().run();
	}
	
	public void run() throws IOException {
		typing(CloneDr2CodeClone_TRANSFORMATION, new Object[] { CLONEDR_METAMODEL, FILEINFO_METAMODEL, CODECLONE_METAMODEL }, 
				   new String[] { "CloneDr", "FileInfo", "CodeClone" });
		
		System.out.println("Finished typing of " + CloneDr2CodeClone_TRANSFORMATION);

		typing(Simian2CodeClone_TRANSFORMATION, new Object[] { SIMIAN_METAMODEL, FILEINFO_METAMODEL, CODECLONE_METAMODEL }, 
				   new String[] { "Simian", "FileInfo", "CodeClone" });
		
		System.out.println("Finished typing of " + CloneDr2CodeClone_TRANSFORMATION);

		typing(SimScan2CodeClone_TRANSFORMATION, new Object[] { SIMSCAN_METAMODEL, FILEINFO_METAMODEL, CODECLONE_METAMODEL }, 
				   new String[] { "SimScan", "FileInfo", "CodeClone" });
		
		System.out.println("Finished typing of " + SimScan2CodeClone_TRANSFORMATION);

		typing(SVG2XML_TRANSFORMATION, new Object[] { SVG_METAMODEL, XML_METAMODEL}, 
				   new String[] { "SVG", "XML" });
		
		System.out.println("Finished typing of " + SVG2XML_TRANSFORMATION);

		// WITH TYPE ERRORS!
		typing(CodeClone2SVG_TRANSFORMATION, new Object[] { CODECLONE_METAMODEL, SVG_METAMODEL }, 
				   new String[] { "CodeClone", "SVG" });
		
		System.out.println("Finished typing of " + CodeClone2SVG_TRANSFORMATION);
		
		typing(CodeClone2SVG2_TRANSFORMATION, new Object[] { CODECLONE_METAMODEL, SVG_METAMODEL }, 
				   new String[] { "CodeClone", "SVG" });
		
		System.out.println("Finished typing of " + CodeClone2SVG2_TRANSFORMATION);
	}

}
