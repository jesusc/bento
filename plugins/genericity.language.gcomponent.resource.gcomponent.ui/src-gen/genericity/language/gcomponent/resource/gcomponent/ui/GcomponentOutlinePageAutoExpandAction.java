/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentOutlinePageAutoExpandAction extends genericity.language.gcomponent.resource.gcomponent.ui.AbstractGcomponentOutlinePageAction {
	
	public GcomponentOutlinePageAutoExpandAction(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
