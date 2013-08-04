package genericity.components.ui.popup.actions;

import genericity.compiler.atl.api.ComponentExecutor;
import genericity.compiler.atl.api.FilePathResolver;
import genericity.compiler.atl.api.MyComponentError;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ApplyComponent  implements IObjectActionDelegate {

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
		IFile f = (IFile) ((IStructuredSelection) selection).getFirstElement();

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createPlatformResourceURI(f.getFullPath().toPortableString(), true), true);
		
		try {
			new ComponentExecutor(r, new WorkspaceFileResolver(f.getLocation().toPortableString())).execute();
		} catch (MyComponentError e) {
			MessageDialog.openError(shell, "Component execution", e.getMessage());;
		} catch (Exception e2) { // Capturing this because silent errors appears when trying to load unexisting files...
			e2.printStackTrace();
			MessageDialog.openError(shell, "Component execution", e2.getMessage());;			
		}
	}
	
	/*
	 * 
	 */

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
			this.selection = selection;
	}


}
