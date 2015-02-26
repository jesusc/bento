/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

public class BentoOutlinePageCollapseAllAction extends bento.language.bentocomp.resource.bento.ui.AbstractBentoOutlinePageAction {
	
	public BentoOutlinePageCollapseAllAction(bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
