package bento.sirius.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import bento.component.interpreter.ComponentInterpreter;
import bento.component.interpreter.TechnologyConfiguration;
import bento.component.model.ComponentModel;
import bento.component.model.MyComponentError;
import bento.component.utils.ComponentUtils;
import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.technologies.TechnologiesPackage;
import bento.repository.local.FilePathResolver;
import bento.sirius.adapter.SiriusTemplateHandler;
import bento.sirius.tests.model.SiriusSpecificationModel;

@RunWith(Parameterized.class)
public class TestSiriusAdapter {

    @Parameters(name="{0}")
    public static Collection<Object> data() {
        return Arrays.asList(new Object[] {    
                "resources/reuse/network/network.bento",
                "resources/reuse/linkedlist/linkedlist.bento"
           });
    }

    @BeforeClass
    public static void setUpWorskpace() throws CoreException {
    	importProject(new File("."), "bento.sirius.tests");
    	importProject(new File("../bento.sirius.tests.metamodels"), "bento.sirius.tests.metamodels");

    	// For some reason bento.sirius.Adapter#Activator.earlyStartup is not working on the testing environment
    	// If this the case, we register manually
    	if (TechnologyConfiguration.INSTANCE.getHandler(TechnologiesPackage.Literals.SIRIUS_TEMPLATE) == null) 
    		TechnologyConfiguration.INSTANCE.addHandler(TechnologiesPackage.Literals.SIRIUS_TEMPLATE, new SiriusTemplateHandler());
    }
    
	private static void importProject(final File baseDirectory, final String projectName) throws CoreException {
		IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(
				new Path(baseDirectory.getAbsolutePath() + "/.project"));
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
		project.create(description, null);
		project.open(null);
	}
    
	private File bentoFile;	
	
    public TestSiriusAdapter(String bentoFilename) {
    	this.bentoFile = new File(bentoFilename);
    }
    
	@Test
	public void test() throws MyComponentError {
		File folder = bentoFile.getParentFile();
		File specFile = new File(folder.getAbsoluteFile() + File.separator + "spec.yaml");
		SiriusSpecificationModel spec = null;
		if (specFile.exists()) {
			spec = TestUtils.loadRequirementsAsYaml(specFile.getAbsolutePath());
		}
				
		ComponentModel m = ComponentUtils.readComponentDescription(bentoFile);
		
		TestBentoFileResolver resolver = new TestBentoFileResolver();		
		ComponentInterpreter interpreter = new ComponentInterpreter(m, resolver);
		interpreter.apply();
		
		List<? extends String> artifacts = interpreter.getGeneratedArtifacts();
		for (String fileName : artifacts) {
			assertTrue(fileName.endsWith(".odesign"));
			
			File f = new File(fileName);
			Resource r = TestSiriusValidity.assertOdesignValidity(f);
			
			spec.assertExpectations(r);
		}
	}

	
	public static class TestBentoFileResolver implements FilePathResolver {

		@Override
		public String resolveTransformation(Component context, String file) {
			throw new UnsupportedOperationException(file);
		}

		@Override
		public String createPlaceForAdaptation(Component context, Component adapted) {
			File output = new File("test-outputs");
			if (! output.exists()) {
				output.mkdirs();
			}
			
			return output.getAbsolutePath() + File.separator + context.getName();
		}
		
	}
	
	// We can also validate bindings with something like
	/*
	 			BindingModel root = (BindingModel) r.getContents().get(0);
				BindingUtils.loadMetamodels(root);				
				
				List<BindingValidationProblem> problems = new BindingValidator(root).perform();
				// Get the corresponding quickfix new ResolveBentoQuickfix("Resolve component", null, m, m.getUri())
				
				for (BindingValidationProblem problem : problems) {
					GbindProblem p = new GbindProblem(problem.getMessage(), 
							GbindEProblemType.ANALYSIS_PROBLEM, 
							GbindEProblemSeverity.ERROR);
					r.addProblem(p, root);
				}

	 */
	
}
