package bento.sirius.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.odesign.generator.Generate;

@RunWith(Parameterized.class)
public class TestGraphicalBindingGenerator {

    @Parameters(name="{0}")
    public static Collection<Object> data() {
        return Arrays.asList(new Object[] {    
                "resources/components/sequence/sequence-simple.odesign",
                "resources/components/graph/graph-simple.odesign",
                
           });
    }
    


	private File odesign;	
	
    public TestGraphicalBindingGenerator(String odesign) {
    	this.odesign = new File(odesign);
    }
    
	@Test
	public void test() throws IOException {
		System.out.println("Testing: " + odesign.getAbsolutePath());
		
		Generate generate = new Generate();
		generate.GenerateOdesignMM(this.odesign.getAbsolutePath(), new File("test-outputs"));
		
		ResourceSet rs = new ResourceSetImpl();
		Resource mm = rs.getResource(URI.createFileURI(generate.getMetamodelGeneratedFile().getAbsolutePath()), true);
		
		assertEquals(1, mm.getContents().size());
		Diagnostic result = Diagnostician.INSTANCE.validate(mm.getContents().get(0));
		assertEquals(Diagnostic.OK, result.getCode());		
		
		// Uncomment and fix
		// TestSiriusValidity.assertOdesignValidity(generate.getOdesignGeneratedFile());
	}
	
}
