package bento.components.ui.nature;

import java.io.ByteArrayInputStream;
import java.util.function.Consumer;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class BentoNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "bento.components.ui.bentoNature";

	private IProject project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		addProjectStructure(project);
		
		
		// Add the builder
		/*
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(AnATLyzerBuilder.BUILDER_ID)) {
				return;
			}
		}

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = desc.newCommand();
		command.setBuilderName(AnATLyzerBuilder.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		*/
		project.setDescription(desc, null);
	}

	private void addProjectStructure(IProject project) {
		Consumer<String> createIfNeeded = (String name) -> {
			IFolder folder = project.getFolder(name);
			if ( ! folder.exists() ) {
				try {
					folder.create(true, true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		};
		
		createIfNeeded.accept("bindings");
		createIfNeeded.accept("metamodels");
		createIfNeeded.accept("transformation");
		createIfNeeded.accept("META-INF");			
	
		IFile readme = project.getFile("README.md");
		if ( ! readme.exists() ) {
			String text = "# " + project.getName() + "\n\n" + "Document your component!";
			try {
				readme.create(new ByteArrayInputStream(text.getBytes()), true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		// Remove builder
		/*
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(AnATLyzerBuilder.BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);			
				return;
			}
		}
		*/
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}



}
