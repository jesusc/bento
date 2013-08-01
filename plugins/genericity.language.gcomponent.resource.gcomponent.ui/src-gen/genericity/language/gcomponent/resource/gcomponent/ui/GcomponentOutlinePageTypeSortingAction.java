/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentOutlinePageTypeSortingAction extends genericity.language.gcomponent.resource.gcomponent.ui.AbstractGcomponentOutlinePageAction {
	
	public GcomponentOutlinePageTypeSortingAction(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
