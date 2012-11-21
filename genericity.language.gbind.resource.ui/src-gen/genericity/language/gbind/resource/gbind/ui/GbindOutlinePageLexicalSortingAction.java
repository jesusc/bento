/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.resource.gbind.ui;

public class GbindOutlinePageLexicalSortingAction extends genericity.language.gbind.resource.gbind.ui.AbstractGbindOutlinePageAction {
	
	public GbindOutlinePageLexicalSortingAction(genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
