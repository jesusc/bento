/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentOutlinePageLexicalSortingAction extends genericity.language.gcomponent.resource.gcomponent.ui.AbstractGcomponentOutlinePageAction {
	
	public GcomponentOutlinePageLexicalSortingAction(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
