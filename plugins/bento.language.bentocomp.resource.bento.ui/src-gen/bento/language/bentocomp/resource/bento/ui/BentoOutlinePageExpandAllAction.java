/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

public class BentoOutlinePageExpandAllAction extends bento.language.bentocomp.resource.bento.ui.AbstractBentoOutlinePageAction {
	
	public BentoOutlinePageExpandAllAction(bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
