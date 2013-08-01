/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentOutlinePageLinkWithEditorAction extends genericity.language.gcomponent.resource.gcomponent.ui.AbstractGcomponentOutlinePageAction {
	
	public GcomponentOutlinePageLinkWithEditorAction(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
