package bento.sirius.tests;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.odesign.generator.GbindGenerator;





public class TestGbindGenerator {


	    
		@Test
		public void test() throws IOException {
			
//			String source="/home/souhaila/git/sirius-bento-repository2/tests/bento.sirius.tests.metamodels/resources/concepts/sequence.ecore";
//			String target="/home/souhaila/git/sirius-bento-repository2/tests/bento.sirius.tests.metamodels/resources/concepts/graph.ecore";
//			String output="/home/souhaila/git/sirius-bento-repository2/plugins-sirius/bento.sirius.odesign.generator";
//			String model="/home/souhaila/git/sirius-bento-repository2/tests/bento.sirius.tests/test-outputs/models-sequence/SequenceModel.xmi";
//			String bindinMetamodel="/home/souhaila/git/sirius-bento-repository2/tests/test-outputs/bento.sirius.tests.metamodels.output/models/sequence_bdsl.ecore";
			
			String source="/home/souhaila/git/SiriusDSLexample-scenesDSL/wakame.test.ScenesDSL/scenes.ecore";
			String target="/home/souhaila/Documents/ObeoProjects-WorkSpace2/test.scenes/model/tasksflow.ecore";
			String output="/home/souhaila/git/sirius-bento-repository2/plugins-sirius/bento.sirius.odesign.generator";
			String model="/home/souhaila/Documents/ObeoProjects-WorkSpace2/test.scenes/model/History1.xmi";
			String bindinMetamodel="/home/souhaila/Documents/ObeoProjects-WorkSpace2/test.scenes/model/scenes_bdsl.ecore";
			
		
			GbindGenerator gbin=new GbindGenerator(bindinMetamodel,model,target, source, output);

		}

	
}
