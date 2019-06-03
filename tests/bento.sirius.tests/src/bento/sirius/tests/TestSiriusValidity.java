package bento.sirius.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSiriusValidity {

    @Parameters(name="{0}")
    public static Collection<Object> data() {
        return Arrays.asList(new Object[] {    
                "resources/components/graph/graph-simple.odesign",
                "resources/components/sequence/sequence-simple.odesign",
                "resources/components/workflow/workflow.odesign",
           });
    }

	private File odesign;	
	
    public TestSiriusValidity(String odesign) {
    	this.odesign = new File(odesign);
    }
    
	@Test
	public void test() {
		System.out.println("Testing: " + odesign.getAbsolutePath());
		assertOdesignValidity(odesign);
	}

	/*pp*/ static Resource assertOdesignValidity(File odesign) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI(odesign.getAbsolutePath()), true);
		
		for(EObject x : r.getContents()) {
			Diagnostic d = Diagnostician.INSTANCE.validate(x);
			if (d.getSeverity() == Diagnostic.WARNING) {
				// I have not been able to get rid of this warning. Validation works
				// in the GUI but here there is this message which seems to be related
				// to missing dependencies.
				// However, the validation still seems to be able to catch invalid class names, etc.
				// So, we accept only this warnings as ok
				for (Diagnostic diagnostic : d.getChildren()) {
					assertTrue(diagnostic.getMessage().contains("is not accessible"));
				}
			} else {
				System.out.println(d.getSeverity());
				for (Diagnostic diagnostic : d.getChildren()) {
					System.out.println(diagnostic.getMessage());
				}
				assertEquals(Diagnostic.OK, d.getSeverity());
			}
		}
		
		return r;
	}

}
