package usecases.modelsmeasurement;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class ModelsMeasurement extends BaseTest {
	public static final String KM32MEASURE_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/KM32Measure_all.atl.xmi";
	public static final String UML2MEASURE_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/UML22Measure_all.atl.xmi";
	public static final String HTML2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/HTML2XML.atl.xmi";
	public static final String Measure2Table_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/Measure2Table_all.atl.xmi";
	public static final String Measure2XHTML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/Measure2XHTML_all.atl.xmi";
	public static final String SVG2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/SVG2XML.atl.xmi";
	public static final String Table2SVGBarChart_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/Table2SVGBarChart_all.atl.xmi";
	public static final String Table2SVGPieChart_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/Table2SVGPieChart_all.atl.xmi";
	public static final String Table2TabularHTML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/Table2TabularHTML_all.atl.xmi";
	public static final String XHTML2XML_TRANSFORMATION = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/transformations/XHTML2XML_fix.atl.xmi";
	
	public static final String KM3_METAMODEL = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/extra/KM3.ecore";
	public static final String MEASURE_METAMODEL = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/metamodels/Measure.ecore";
	public static final String UML_METAMODEL  = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/extra/UML2_3_0_0.ecore";
	public static final String HTML_METAMODEL  = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/metamodels/HTML.ecore";
	public static final String XHTML_METAMODEL  = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/metamodels/XHTML.ecore";
	public static final String XML_METAMODEL  = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/metamodels/XML.ecore";
	public static final String TABLE_METAMODEL  = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/metamodels/Table.ecore";
	public static final String SVG_METAMODEL  = "../bento.examples.analysis/third-party/usecases/modelsmeasurement/metamodels/SVG.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new ModelsMeasurement().run();
	}
	
	public void run() throws IOException {
		typing(KM32MEASURE_TRANSFORMATION, new Object[] { KM3_METAMODEL, MEASURE_METAMODEL}, 
				   new String[] { "KM3", "Measure" }, true);

		generateGraphviz("100:29-100:44");
		generateErrorSlice("KM3", "tmp_/km32measure.slice.ecore");
		generateEffectiveMetamodel("KM3", "tmp_/km32measure.effective.ecore");
		generateCSP("100:29-100:44");


		// 
		
//		typing(UML2MEASURE_TRANSFORMATION, new Object[] { UML_METAMODEL, MEASURE_METAMODEL}, 
//				   new String[] { "UML2", "Measure" }, false);

		//
		
//		typing(HTML2XML_TRANSFORMATION, new Object[] { HTML_METAMODEL, XML_METAMODEL }, 
//				   new String[] { "HTML", "XML" }, false);

		//
		
//		typing(Measure2Table_TRANSFORMATION, new Object[] { MEASURE_METAMODEL, TABLE_METAMODEL }, 
//				   new String[] { "Measure", "Table" }, false);

		//
		
//		typing(Measure2XHTML_TRANSFORMATION, new Object[] { MEASURE_METAMODEL, XHTML_METAMODEL }, 
//				   new String[] { "Measure", "XHTML" }, false);

		// 
		
//		typing(SVG2XML_TRANSFORMATION, new Object[] { SVG_METAMODEL, XML_METAMODEL }, 
//				   new String[] { "SVG", "XML" }, false);

		//
		
//		typing(Table2SVGBarChart_TRANSFORMATION, new Object[] { TABLE_METAMODEL, SVG_METAMODEL }, 
//				   new String[] { "Table", "SVG" }, false);

		//

//		typing(XHTML2XML_TRANSFORMATION, new Object[] { XHTML_METAMODEL, XML_METAMODEL }, 
//				   new String[] { "XHTML", "XML" }, false);

	}

}
