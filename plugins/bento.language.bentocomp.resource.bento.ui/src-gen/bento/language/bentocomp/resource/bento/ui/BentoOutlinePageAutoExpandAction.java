/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

public class BentoOutlinePageAutoExpandAction extends bento.language.bentocomp.resource.bento.ui.AbstractBentoOutlinePageAction {
	
	public BentoOutlinePageAutoExpandAction(bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
