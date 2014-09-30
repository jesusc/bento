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
		String selectedError = "833:2-833:12";
		
		typing(KM32MEASURE_TRANSFORMATION, new Object[] { KM3_METAMODEL, MEASURE_METAMODEL}, 
				   new String[] { "KM3", "Measure" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("KM3", "tmp_/KM32MEASURE.slice.ecore", selectedError);
		generateEffectiveMetamodel("KM3", "tmp_/KM32MEASURE.effective.ecore");
		generateCSP(selectedError);

/*		

		// 

		typing(UML2MEASURE_TRANSFORMATION, new Object[] { UML_METAMODEL, MEASURE_METAMODEL}, 
				   new String[] { "UML2", "Measure" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("UML2", "tmp_/UML2MEASURE.slice.ecore", selectedError);
		generateEffectiveMetamodel("UML2", "tmp_/UML2MEASURE.effective.ecore");
		generateCSP(selectedError);

		//
		
		typing(HTML2XML_TRANSFORMATION, new Object[] { HTML_METAMODEL, XML_METAMODEL }, 
				   new String[] { "HTML", "XML" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("HTML", "tmp_/HTML2XML.slice.ecore", selectedError);
		generateEffectiveMetamodel("HTML", "tmp_/HTML2XML.effective.ecore");
		generateCSP(selectedError);

		//
		
		typing(Measure2Table_TRANSFORMATION, new Object[] { MEASURE_METAMODEL, TABLE_METAMODEL }, 
				   new String[] { "Measure", "Table" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("Measure", "tmp_/Measure2Table.slice.ecore", selectedError);
		generateEffectiveMetamodel("Measure", "tmp_/HTML2XML.effective.ecore");
		generateCSP(selectedError);


		//
		
		typing(Measure2XHTML_TRANSFORMATION, new Object[] { MEASURE_METAMODEL, XHTML_METAMODEL }, 
				   new String[] { "Measure", "XHTML" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("Measure", "tmp_/Measure2XHTML.slice.ecore", selectedError);
		generateEffectiveMetamodel("Measure", "tmp_/Measure2XHTML.effective.ecore");
		generateCSP(selectedError);

		// 
		
		typing(SVG2XML_TRANSFORMATION, new Object[] { SVG_METAMODEL, XML_METAMODEL }, 
				   new String[] { "SVG", "XML" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("SVG", "tmp_/SVG2XML.slice.ecore", selectedError);
		generateEffectiveMetamodel("SVG", "tmp_/SVG2XML.effective.ecore");
		generateCSP(selectedError);

		//
		
		typing(Table2SVGBarChart_TRANSFORMATION, new Object[] { TABLE_METAMODEL, SVG_METAMODEL }, 
				   new String[] { "Table", "SVG" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("Table", "tmp_/Table2SVGBarChart.slice.ecore", selectedError);
		generateEffectiveMetamodel("Table", "tmp_/Table2SVGBarChart.effective.ecore");
		generateCSP(selectedError);

		//

		selectedError = "69:13-69:39";
		
		typing(XHTML2XML_TRANSFORMATION, new Object[] { XHTML_METAMODEL, XML_METAMODEL }, 
				   new String[] { "XHTML", "XML" }, true);

		printStatistics();
		printErrorsByType();
		
		generateGraphviz(selectedError);
		generateErrorSlice("XHTML", "tmp_/XHTML2XML.slice.ecore", selectedError);
		generateEffectiveMetamodel("XHTML", "tmp_/XHTML2XML.effective.ecore");
		generateCSP(selectedError);
*/
	}

}
