/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

public class BentoOutlinePageLexicalSortingAction extends bento.language.bentocomp.resource.bento.ui.AbstractBentoOutlinePageAction {
	
	public BentoOutlinePageLexicalSortingAction(bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
