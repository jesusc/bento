package bento.sirius.tests;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

public abstract class AbstractSiriusTest {


	protected static TestData t(String odesign, String... models) {
		return new TestData(odesign, models);
	}

	protected static String catalogue(String file) {
		return "../../../sirius-reusable-dsml-editors/"  + file;
	}
	
	protected static String concrete(String file) {
		return "../../../sirius-reusable-dsml-editors/concrete-metamodels-examples/"  + file;
	}
	
	protected static void importProject(final File baseDirectory, final String projectName) throws CoreException {
		IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(
				new Path(baseDirectory.getAbsolutePath() + "/.project"));
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
		project.create(description, null);
		project.open(null);
	}
    
	
	protected static class TestData {
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

	
}
