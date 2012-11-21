/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.resource.gbind.ui;

public abstract class AbstractGbindOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer;
	
	public AbstractGbindOutlinePageAction(genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = genericity.language.gbind.resource.gbind.ui.GbindImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = genericity.language.gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
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
			genericity.language.gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (genericity.language.gbind.resource.gbind.ui.GbindOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
