/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

public class BentoOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new bento.language.bentocomp.resource.bento.ui.BentoOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new bento.language.bentocomp.resource.bento.ui.BentoOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new bento.language.bentocomp.resource.bento.ui.BentoOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new bento.language.bentocomp.resource.bento.ui.BentoOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new bento.language.bentocomp.resource.bento.ui.BentoOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
