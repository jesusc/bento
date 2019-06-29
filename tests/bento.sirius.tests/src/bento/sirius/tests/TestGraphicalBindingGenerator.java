package bento.sirius.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.odesign.generator.Generate;
import com.odesign.generator.ModelGenerator;

@RunWith(Parameterized.class)
public class TestGraphicalBindingGenerator {

    @Parameters(name="{0}")
    public static Collection<Object> data() {
        return Arrays.asList(new Object[] {    
                t("resources/components/sequence/sequence-simple.odesign", 
                		"resources/components/sequence/sequence-model-1.xmi"),
                t("resources/components/scenes/ScenesDSL.odesign", 
                		"resources/components/scenes/ScenesDSL-model-1.scenes"),
                t("resources/components/graph/graph-simple.odesign",    
                		 "resources/components/graph/graph-model-1.xmi"),
                t("resources/components/[From -Sirius-Gallery]SimQRi/simqri.odesign",    
               		 "resources/components/[From -Sirius-Gallery]SimQRi/simqri-model-1.xmi")
           });
    }
    


	private static Object t(String odesign, String... models) {
		return new TestData(odesign, models);
	}

	private static class TestData {
		private String odesign;
		private String[] models;

		public TestData(String odesign, String... models) {
			this.odesign = odesign;
			this.models = models;
		}
		
		public String getOdesign() {
			return odesign;
		}
		
		public String[] getModels() {
			return models;
		}
		
		@Override
		public String toString() {
			return odesign;
		}
	}
	
	private File odesign;
	private String[] models;	
	
    public TestGraphicalBindingGenerator(TestData data) {
    	this.odesign = new File(data.getOdesign());
    	this.models = data.getModels();
    }
    
	@Test
	public void test() throws IOException {
		File testOutputs = new File("test-outputs");
		File metamodelOutputs = new File("../test-outputs/bento.sirius.tests.metamodels.output/models");
		System.out.println("Testing: " + odesign.getAbsolutePath());
		
		Generate generate = new Generate();
		generate.GenerateOdesignMM(this.odesign.getAbsolutePath(), testOutputs, metamodelOutputs);
		
		// ResourceSet rs = new ResourceSetImpl();
		// Resource mm = rs.getResource(URI.createFileURI(generate.getMetamodelGeneratedFile().getAbsolutePath()), true);
		EPackage originalPackage = generate.getOriginaleEPakage();
		EPackage generatedPackage = generate.getEpack();
		
		assertNotNull(generatedPackage);
		Diagnostic result = Diagnostician.INSTANCE.validate(generatedPackage);
		assertEquals(Diagnostic.OK, result.getCode());		
		
		// Uncomment and fix
		// TestSiriusValidity.assertOdesignValidity(generate.getOdesignGeneratedFile());
		
		
		File modelOutputs = testOutputs.toPath().resolve("models-" + originalPackage.getName()).toFile();
		if (! modelOutputs.exists()) {
			modelOutputs.mkdirs();
		}
		
		for (String model : models) {			
			testModel(new File(model), originalPackage, generatedPackage, modelOutputs);
		}
	}

	private void testModel(File model, EPackage originalPackage, EPackage generatedPackage, File modelOutputs) throws FileNotFoundException, IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource originalModel = rs.getResource(URI.createFileURI(model.getAbsolutePath()), true);
		
		String filename  = model.getName();
		File outputFile = new File(modelOutputs.getAbsolutePath() + File.separator + "bdsl-" + filename);
		
		ModelGenerator generator = new ModelGenerator(model.getAbsolutePath(), outputFile, originalPackage, generatedPackage);
		Resource generatedModel = generator.getGeneratedModel();
		
		List<EObject> originalObjects = TestUtils.getAllElements(originalModel);
		List<EObject> generatedObjects = TestUtils.getAllElements(generatedModel);
		
		// At least we put all objects in the target model
		assertTrue("Generated objects " + generatedObjects.size() + " is less than the original " + originalObjects.size(), 
				generatedObjects.size() >= originalObjects.size());		
	}

	
}

