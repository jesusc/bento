package bento.repository.export.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;


public class SelectComponentWizardPage extends WizardPage {
	
	protected FileFieldEditor editor;
	private IStructuredSelection currentSelection;

	public SelectComponentWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		this.currentSelection = selection;
		setTitle(pageName); //NON-NLS-1
		setDescription("Select a component file to upload"); //NON-NLS-1
	}

	@Override
	public void createControl(Composite parent) {
		Composite fileSelectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.FILL_HORIZONTAL);
		fileSelectionArea.setLayoutData(fileSelectionData);

		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 3;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 0;
		fileSelectionLayout.marginHeight = 0;
		fileSelectionArea.setLayout(fileSelectionLayout);
		
		editor = new FileFieldEditor("fileSelect","Select File: ",fileSelectionArea); //NON-NLS-1 //NON-NLS-2
		editor.getTextControl(fileSelectionArea).addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent e) {
				IPath path = new Path(SelectComponentWizardPage.this.editor.getStringValue());
				setFileName(path.lastSegment());
			}
		});
		String[] extensions = new String[] { "*.gcomponent" }; //NON-NLS-1
		editor.setFileExtensions(extensions);
		fileSelectionArea.moveAbove(null);
		
		initialPopulateContainerNameField();
		
		setControl(fileSelectionArea);
	}
	
	protected void setFileName(String lastSegment) {
		// TODO Auto-generated method stub
		System.out.println(lastSegment);
	}

	protected void initialPopulateContainerNameField() {
		Iterator it = currentSelection.iterator();
		if (it.hasNext()) {
			Object object = it.next();
			IResource selectedResource = null;
			if (object instanceof IResource) {
				selectedResource = (IResource) object;
			} else if (object instanceof IAdaptable) {
				selectedResource = (IResource) ((IAdaptable) object)
						.getAdapter(IResource.class);
			}
			if (selectedResource != null) {
				if (selectedResource.getType() == IResource.FILE) {
					//selectedResource = selectedResource.getParent();
								
					if ( selectedResource.isAccessible()) {
						editor.setStringValue(selectedResource.getFullPath().toPortableString());
					}
				}
				/*
				if (selectedResource.isAccessible()) {
					resourceGroup.setContainerFullPath(selectedResource
							.getFullPath());
				}
				*/
			}
		}

	}

	// API
	
	public IFile getComponentFile() {
		String path = this.editor.getStringValue();
		
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
		if (! f.exists() ) {
			return null;
		}
		return f;
	}
}
