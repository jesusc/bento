/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
