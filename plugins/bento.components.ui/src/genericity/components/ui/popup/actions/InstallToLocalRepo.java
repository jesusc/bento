package genericity.components.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import bento.language.bentocomp.core.Component;

public class InstallToLocalRepo  implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {	
		IProject p = createLocalRepoIfNeeded();
		
		IFile f = (IFile) ((IStructuredSelection) selection).getFirstElement();

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createPlatformResourceURI(f.getFullPath().toPortableString(), true), true);
		
		Component c = (Component) r.getContents().get(0);
		
	}
	
	private IProject createLocalRepoIfNeeded() {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject("bento.local.repo");
		if ( ! p.exists() ) {
			throw new UnsupportedOperationException("Create bento.local.repo (Java Project) manually");
		}
		return p;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
			this.selection = selection;
	}


}
