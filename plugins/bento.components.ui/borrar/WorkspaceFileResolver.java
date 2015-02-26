package genericity.components.ui.popup.actions;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;

public class WorkspaceFileResolver implements FilePathResolver {

	private String initial;

	public WorkspaceFileResolver(String initial) {
		this.initial = initial;
	}

	@Override
	public String getInitialPath() {
		return initial;
	}

	@Override
	public String resolve(String file) {
		Path p = new Path(file);
		if ( file.startsWith("platform:/resource/") ) {
			Path p2 = new Path(file.replace("platform:/resource/", ""));
			IFile w = ResourcesPlugin.getWorkspace().getRoot().getFile(p2);
			System.out.println(p2);
			return w.getLocation().toOSString();			
		}
		return file;
		/*
		Path p = new Path(file.replace("platform:/resource/", ""));
		IFile w = ResourcesPlugin.getWorkspace().getRoot().getFile(p);
		System.out.println(p);
		return w.getFullPath().toOSString();
		*/
	}


	public String getParentDir() {
		return new File(initial).getParent();
	}
	
	@Override
	public String createFileNameFromInitial(String relativePath) {
		return resolve(getParentDir() + File.separator + relativePath);
	}
	

}
