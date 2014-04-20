package googlecode.bpm;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class TransformacaoBPM extends BaseTest {
	public static final String BPMN2UML_TRANSFORMATION = "../bento.examples.analysis/third-party/googlecode/transformacao-bpm/RegrasTransformacao/BPMN_para_Atividades.atl.xmi";
	
	
	public static final String UML_METAMODEL = "../bento.examples.analysis/third-party/googlecode/transformacao-bpm/UML2_3_0_0.ecore";
	public static final String BPMN_METAMODEL = "../bento.examples.analysis/third-party/googlecode/transformacao-bpm/bpmn.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new TransformacaoBPM().run();
	}
	
	public void run() throws IOException {
		typing(BPMN2UML_TRANSFORMATION, new Object[] { UML_METAMODEL, BPMN_METAMODEL}, 
				   new String[] { "MetaModeloUML", "MetaModeloBPMN" });
		
		
	}

}
