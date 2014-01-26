package bento.componetization.ui.dialogs;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

import bento.componetization.ui.Activator;

public class FindFileDialog extends ElementListSelectionDialog {
	private String extension;

	public FindFileDialog(Shell parent, String extension) {
		super(parent, new FileLabelProvider());
		this.extension = extension;
		init();
	}
	
	private void init() {
		FindFileDialog listDialog = this;

		// ElementListSelectionDialog listDialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), labelProvider);	    
		listDialog.setStatusLineAboveButtons(true);
		
		listDialog.setValidator(new ISelectionStatusValidator() {
			@Override
			public IStatus validate(Object[] selection) {
				IResource r = (IResource) selection[0];
				return new Status(IStatus.INFO, Activator.PLUGIN_ID, r.getProjectRelativePath().toPortableString());
			}
		});
		
		listDialog.setMultipleSelection(false);
		listDialog.setTitle("ATL files in the workspace");
		listDialog.setMessage("");
		// listDialog.setElements(list.toArray());
		// listDialog.open();						
	}
	
	@Override
	public int open() {
		final ArrayList<IResource> resources = new ArrayList<IResource>();

		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					// if ( resource instanceof IFile && ((IFile) resource).
					if ( resource.getLocation() != null && resource.getLocation().getFileExtension() != null && 
						 resource.getLocation().getFileExtension().equals( extension ) ) {
						resources.add(resource);
					}
					return true;
				}
			});
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		this.setElements(resources.toArray());

		return super.open();
	}
	

	static class FileLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			IResource r = (IResource) element;
			return r.getName();
		}
	};
}
