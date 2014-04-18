package zoo.ieee1471_to_modaf;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class IEEE1417_to_MoDAF extends BaseTest {
	public static final String IEEE1471_TO_MODAF_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/IEEE1471toMoDAF/transformation/IEEE1471_2_MoDAF.atl.xmi";
	
	public static final String IEEE1471_METAMODEL = "../bento.examples.analysis/third-party/zoo/IEEE1471toMoDAF/metamodel/IEEE1471ConceptualModel.ecore";
	public static final String MODAF_METAMODEL = "../bento.examples.analysis/third-party/zoo/IEEE1471toMoDAF/metamodel/MoDAF-AV.ecore";
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new IEEE1417_to_MoDAF().run();
	}
	
	public void run() throws IOException {
		typing(IEEE1471_TO_MODAF_TRANSFORMATION, new Object[] { IEEE1471_METAMODEL, MODAF_METAMODEL }, 
				   new String[] { "IEEE1471", "MoDAF" }, true);
		
		// generateCSP();
		generateGraphviz();
		
		
	}

}
