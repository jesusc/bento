package gbind.resource.gbind.ui.custom;

import gbind.dsl.ClassBinding;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslFactory;
import gbind.resource.gbind.ui.GbindEditor;
import genericity.language.gbind.IGbindTextResource;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
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
import org.eclipse.ui.texteditor.AbstractTextEditor;

public class InitBinding implements IObjectActionDelegate {
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

			/*
			if (editorPart instanceof genericity.language.gbind.resource.gbind.ui.GbindEditor) {
				// IDocument doc =
				// ((genericity.language.gbind.resource.gbind.ui.GbindEditor)
				// editorPart)
				// .getDocumentProvider().getDocument(null);
				// doc.replace(offset, length, text);

				genericity.language.gbind.resource.gbind.ui.GbindEditor editor = (genericity.language.gbind.resource.gbind.ui.GbindEditor) editorPart;
				gbind.dsl.BindingModel m = (gbind.dsl.BindingModel) editor
						.getResource().getContents().get(0);

				ClassBinding c = DslFactory.eINSTANCE.createClassBinding();
				ConceptMetaclass cm = DslFactory.eINSTANCE
						.createConceptMetaclass();
				cm.setName("pepito");
				ConcreteMetaclass cc = DslFactory.eINSTANCE
						.createConcreteMetaclass();
				cc.setName("juanito");
				c.setConcept(cm);
				c.getConcrete().add(cc);

				m.getBindings().add(c);

				editor.getResource().setModified(true);
			}
			*/

			if (editorPart instanceof genericity.language.gbind.resource.gbind.ui.GbindEditor) {
				int offset = 0;
				int length = 0;
				String selectedText = null;
				IEditorSite iEditorSite = editorPart.getEditorSite();

				IEditorInput input = editorPart.getEditorInput();

				if (iEditorSite != null) {
					// get selection provider
					ISelectionProvider selectionProvider = iEditorSite
							.getSelectionProvider();
					if (selectionProvider != null) {
						ISelection iSelection = selectionProvider
								.getSelection();
						// offset
						offset = ((ITextSelection) iSelection).getOffset();
						if (!iSelection.isEmpty()) {
							selectedText = ((ITextSelection) iSelection)
									.getText();
							// length
							length = ((ITextSelection) iSelection).getLength();
							
							//System.out.println("length: " + length);
							//MessageDialog.openInformation(shell,
							//		"Do Something Menu", "Length: " + length
							//				+ "    Offset: " + offset);
							

							// IDocument doc = ((genericity.language.gbind.resource.gbind.ui.GbindEditor) editorPart).getDocumentProvider().getDocument(null);
							// doc.replace(offset, length, text);

							computeNewElements(((GbindEditor) editorPart).getResource());	
							
						}
					}
				}

			}
		} catch (Exception e) {
		}
	}

	private void computeNewElements(IGbindTextResource resource) {
//		java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
//		getResource().save(output, null);
//		return output.toString();
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

}