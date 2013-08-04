/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

public class GbindOutlinePageAutoExpandAction extends gbind.resource.gbind.ui.AbstractGbindOutlinePageAction {
	
	public GbindOutlinePageAutoExpandAction(gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
