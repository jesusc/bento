package genericity.components.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import bento.component.interpreter.ComponentInterpreter;
import bento.component.model.ComponentModel;
import bento.component.model.MyComponentError;
import bento.component.utils.ComponentUtils;
import bento.repository.local.LocalRepository;

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

		ComponentModel m = ComponentUtils.readComponentDescription(f);
		
		try {
			new ComponentInterpreter(m, new LocalRepository()).apply();
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
