/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package bento.repository.importation.ui.importWizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import bento.repository.rest.RemoteRepositoryAccess;

public class ImportFromRepositoryWizard extends Wizard implements IImportWizard {
	
	// ImportWizardPage mainPage;
	protected SelectRepositoryWizardPage selectRepo;
	protected FindComponentWizardPage findComponent;

	public ImportFromRepositoryWizard() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		String url  = selectRepo.getURL();
		String name = findComponent.getSelectedComponent(); 
		
		return RemoteRepositoryAccess.downloadAndInstall(url, name);
	}
	 
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("File Import Wizard"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		// mainPage = new ImportWizardPage("Bento Component Import",selection); //NON-NLS-1
		
		selectRepo    = new SelectRepositoryWizardPage();
		findComponent = new FindComponentWizardPage(); 
	}
	
	/* (non-Javadoc)
     * @see org.eclipse.jface.wizard.IWizard#addPages()
     */
    public void addPages() {
        super.addPages(); 
        addPage(selectRepo);
        addPage(findComponent);
    }

    
}
