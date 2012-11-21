package genericity.components.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;

import genericity.compiler.atl.api.FilePathResolver;

public class WorkspaceFileResolver implements FilePathResolver {

	@Override
	public String resolve(String file) {
		Path p = new Path(file.replace("platform:/resource/", ""));
		IFile w = ResourcesPlugin.getWorkspace().getRoot().getFile(p);
		System.out.println(p);
		return w.getFullPath().toOSString();
		
		/*
		URI uri = URI.createPlatformResourceURI(file, true);
		  System.out.println(uri);
		  System.out.println(CommonPlugin.resolve(uri));
		  return CommonPlugin.resolve(uri).toString();
		//IWorkspace w = ResourcesPlugin.getWorkspace().getRoot();
		  */
		
	}

}
