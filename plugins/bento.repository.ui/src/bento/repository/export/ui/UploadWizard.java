package bento.repository.export.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import bento.component.model.ComponentModel;
import bento.component.utils.ComponentUtils;
import bento.repository.importation.ui.importWizards.SelectRepositoryWizardPage;
import bento.repository.rest.RemoteRepositoryAccess;

public class UploadWizard extends Wizard implements IExportWizard {

	private SelectRepositoryWizardPage page2;
	private SelectComponentWizardPage page1;

	public UploadWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("File Import Wizard"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		page1 = new SelectComponentWizardPage("Select component", selection);
		page2 = new SelectRepositoryWizardPage(); 

	}

	@Override
	public boolean performFinish() {
		IFile f = page1.getComponentFile();
		if ( f == null ) {
			return false;
		}
	
		String url = page2.getURL();
		ComponentModel c = ComponentUtils.readComponentDescription(f);
		
		IProject project = f.getProject();
		
		
		RemoteRepositoryAccess.uploadComponent(url, c, project);
		
		
		// Create ComponentUtiles in .api in order to have things like "openComponentFile";
		
		System.out.println("Uploaded!");
		return true;
	}

	
	@Override
	public void addPages() {
		super.addPages();
		addPage(page1);
		addPage(page2);
	}

}
