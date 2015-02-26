/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

public abstract class AbstractBentoOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer treeViewer;
	
	public AbstractBentoOutlinePageAction(bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = bento.language.bentocomp.resource.bento.ui.BentoImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = bento.language.bentocomp.resource.bento.ui.BentoUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			bento.language.bentocomp.resource.bento.ui.BentoUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (bento.language.bentocomp.resource.bento.ui.BentoOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
