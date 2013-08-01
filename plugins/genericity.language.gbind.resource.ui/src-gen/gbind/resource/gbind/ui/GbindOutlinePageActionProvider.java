/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

public class GbindOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new gbind.resource.gbind.ui.GbindOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new gbind.resource.gbind.ui.GbindOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new gbind.resource.gbind.ui.GbindOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new gbind.resource.gbind.ui.GbindOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new gbind.resource.gbind.ui.GbindOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new gbind.resource.gbind.ui.GbindOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
