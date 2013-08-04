/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.resource.gbind.ui;

public class GbindOutlinePageLinkWithEditorAction extends genericity.language.gbind.resource.gbind.ui.AbstractGbindOutlinePageAction {
	
	public GbindOutlinePageLinkWithEditorAction(genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
