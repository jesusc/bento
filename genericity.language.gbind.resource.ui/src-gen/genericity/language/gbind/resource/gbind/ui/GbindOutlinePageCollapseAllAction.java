/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.resource.gbind.ui;

public class GbindOutlinePageCollapseAllAction extends genericity.language.gbind.resource.gbind.ui.AbstractGbindOutlinePageAction {
	
	public GbindOutlinePageCollapseAllAction(genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer) {
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
