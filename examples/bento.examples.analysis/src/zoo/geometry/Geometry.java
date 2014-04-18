package zoo.geometry;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Geometry extends BaseTest {
	public static final String XML2DXF_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/geometry/ATLFile/XML2DXF.atl.xmi";
	public static final String XML2GeoTrans_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/geometry/ATLFile/XML2GeoTrans.atl.xmi";
	public static final String GEOMETRICAL_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/geometry/ATLFile/GeometricalTransformations_all.atl.xmi";
	
	
	public static final String DXF_METAMODEL = "../bento.examples.analysis/third-party/zoo/geometry/DXF/DXF.xmi";
	public static final String XML_METAMODEL = "../bento.examples.analysis/third-party/zoo/geometry/XML.xmi";
	public static final String GEOTRANS_METAMODEL = "../bento.examples.analysis/third-party/zoo/geometry/GeoTrans/GeoTrans.xmi";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Geometry().run();
	}
	
	public void run() throws IOException {
		typing(XML2DXF_TRANSFORMATION, new Object[] { XML_METAMODEL, DXF_METAMODEL}, 
				   new String[] { "XML", "DXF" }, true);
		
		generateCSP();
		generateGraphviz();
		
		//
		
		typing(XML2GeoTrans_TRANSFORMATION, new Object[] { XML_METAMODEL, GEOTRANS_METAMODEL}, 
				   new String[] { "XML", "GeoTrans" }, true);
		
		generateCSP();
		generateGraphviz();
		
		//
		
		typing(GEOMETRICAL_TRANSFORMATION, new Object[] { DXF_METAMODEL, GEOTRANS_METAMODEL, DXF_METAMODEL}, 
				   new String[] { "DXF1", "GeoTrans", "DXF2" }, true);
		
		generateCSP();
		generateGraphviz();
		
	}

}
