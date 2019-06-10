package bento.sirius.tests;

import static org.junit.Assert.assertEquals;
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
public class GeneratorTest {

	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { "sequence/sequence-simple.odesign", "sequence/sequence-model-1.xmi"  },
	                 { "graph/graph-simple.odesign", "graph/graph-model-1.xmi" }  
	           });
	    }
	
	
//{ "graph-simple.odesign", "graph-model-1.xmi" }


	private String odesignURI;
	private String modelURI;

	public GeneratorTest(String odesign, String model) {
		this.odesignURI = odesign;
		this.modelURI = model;
	}

	@Test
	public void test() throws FileNotFoundException, IOException {
		File testOutputs = new File("/home/souhaila/git/sirius-bento/tests/bento.sirius.tests/test-outputs");
		if (! testOutputs.exists()) {
			testOutputs.mkdirs();
		}
		String PATH = "resources/components/";
		String sourceOdesignURI = PATH + odesignURI;
		String sourceModelURI = PATH + modelURI;
		String outputURI   = PATH+"outputs";

		
		Generate generate=new Generate();
		generate.GenerateOdesignMM(sourceOdesignURI,testOutputs);
	
		
		
		EPackage ep = generate.getEpack();
		EPackage originalep = generate.getOriginaleEPakage();	
		
		ResourceSet rs = new ResourceSetImpl();
		Resource mm = rs.getResource(URI.createFileURI(generate.getMetamodelGeneratedFile().getAbsolutePath()), true);
		
		assertEquals(1, mm.getContents().size());
		Diagnostic result = Diagnostician.INSTANCE.validate(mm.getContents().get(0));
		assertEquals(Diagnostic.OK, result.getCode());		
		
		File modelOutputs = testOutputs.toPath().resolve("models-" + originalep.getName()).toFile();
		if (! modelOutputs.exists()) {
			modelOutputs.mkdirs();
		}
		ModelGenerator generator=new ModelGenerator(sourceModelURI,modelOutputs ,originalep,ep);
		
		Resource originalModel = rs.getResource(URI.createFileURI(sourceModelURI), true);
		Resource generatedModel = generator.getGeneratedModel();
		List<EObject> originalObjects = TestUtils.getAllElements(originalModel);
		List<EObject> generatedObjects = TestUtils.getAllElements(generatedModel);
		
		
		// At least we put all objects in the target model
				assertTrue("Generated objects " + generatedObjects.size() + " is less than the original " + originalObjects.size(), 
						generatedObjects.size() >= originalObjects.size());		
			}
	

}