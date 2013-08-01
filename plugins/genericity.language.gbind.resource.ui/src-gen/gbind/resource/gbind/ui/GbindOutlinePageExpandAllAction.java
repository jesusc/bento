/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

public class GbindOutlinePageExpandAllAction extends gbind.resource.gbind.ui.AbstractGbindOutlinePageAction {
	
	public GbindOutlinePageExpandAllAction(gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer) {
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
