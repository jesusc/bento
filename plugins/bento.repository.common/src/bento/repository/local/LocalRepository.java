package bento.repository.local;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import bento.language.bentocomp.core.Component;
import bento.repository.common.BentoURIResolver;

public class LocalRepository implements FilePathResolver {
	public static IProject getLocalProject() {
		IProject local = ResourcesPlugin.getWorkspace().getRoot().getProject("bento.local.repo");
		if (!local.exists()) {
			try {
				local.create(null);
				local.open(null);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}
		}
		return local;
	}
	
	public static IFolder getAdaptationsFolder() {
		IProject local = getLocalProject();
		if ( local == null )
			return null;
		
		IFolder adaptations = createFolder(local, "adaptations");
		
		return adaptations;
	}
	
	private static IFolder createFolder(IContainer parent, String name) {
		IFolder newFolder = parent.getFolder(new Path(name));
		if (!newFolder.exists()) {
			try {
				newFolder.create(true, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}
		}
		return newFolder;
	}
	
	public static IFolder makeComponentFolder(String name) throws CoreException {
		IProject local = getLocalProject();
		if ( local == null )
			return null;
		
		IFolder download = local.getFolder("download");
		if (!download.exists()) {
			try {
				download.create(true, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}
		}

		IFolder componentFolder = download.getFolder(name);
		if (!componentFolder.exists()) {
			componentFolder.create(true, true, null);
		}

		return componentFolder;
	}

	@Override
	public String resolveTransformation(Component context, String file) {
		if ( ! file.startsWith("platform:/resource/") ) {
			file = "bento:/" + context.getName() + "/" + file;
		}
		
		file = BentoURIResolver.tryResolveTransformation(file, context.eResource());
		
		if (file.startsWith("platform:/resource/")) {
			Path p2 = new Path(file.replace("platform:/resource/", ""));
			IFile w = ResourcesPlugin.getWorkspace().getRoot().getFile(p2);
			return w.getLocation().toOSString();
		} else {
			return file;
		}
	}

	private AdaptationFolderStrategy adaptationFolderStrategy = AdaptationFolderStrategy.COMPONENT_PROJECT;
	enum AdaptationFolderStrategy {
		LOCAL_REPO,
		COMPONENT_PROJECT
	};
	
	@Override
	public String createPlaceForAdaptation(Component context, Component adapted) {
		IFolder folderFor;
		if ( adaptationFolderStrategy == AdaptationFolderStrategy.COMPONENT_PROJECT ) {
			IProject p = BentoURIResolver.getProject(context.eResource());
			folderFor = createFolder(p, "adaptations");
		} else {
			IFolder adaptations = getAdaptationsFolder();
			if ( adaptations == null )
				throw new RuntimeException("Cannot create folder for adaptations");
			
			folderFor = createFolder(adaptations, context.getName());
			if ( folderFor == null )
				throw new RuntimeException("Cannot create folder " + adaptations.getLocation().toPortableString());
		}
		return folderFor.getFile(adapted.getName()).getLocation().toPortableString();			
	}
	
}
