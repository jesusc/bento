package gbind.resource.gbind.ui.custom;

import java.util.List;

import gbind.dsl.BindingModel;
import gbind.resource.gbind.ui.GbindEditor;
import genericity.language.gbind.GbindEProblemSeverity;
import genericity.language.gbind.GbindEProblemType;
import genericity.language.gbind.IGbindTextResource;
import genericity.language.gbind.mopp.GbindProblem;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.WorkbenchPlugin;

import bento.language.bentocomp.resource.bento.ResolveBentoQuickfix;
import bento.utils.BindingUtils;
import bento.validators.BindingValidationProblem;
import bento.validators.BindingValidator;

public class ValidateBinding implements IObjectActionDelegate {
	private Shell shell;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	@Override
	public void run(IAction action) {
		try {
			// get editor
			IEditorPart editorPart = WorkbenchPlugin.getDefault()
					.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor();

			if (editorPart instanceof genericity.language.gbind.resource.gbind.ui.GbindEditor) {
				genericity.language.gbind.resource.gbind.ui.GbindEditor editor = (genericity.language.gbind.resource.gbind.ui.GbindEditor) editorPart;
				IGbindTextResource r = editor.getResource();
				
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
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

}