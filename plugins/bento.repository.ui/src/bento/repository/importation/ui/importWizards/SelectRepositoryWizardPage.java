package bento.repository.importation.ui.importWizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class SelectRepositoryWizardPage extends WizardPage {
	private Text txtURL;

	/**
	 * Create the wizard.
	 */
	public SelectRepositoryWizardPage() {
		super("wizardPage");
		setTitle("Select repository");
		setDescription("Write the URL of the repository");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblUrl = new Label(container, SWT.NONE);
		lblUrl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUrl.setText("URL:");
		
		txtURL = new Text(container, SWT.BORDER);
		txtURL.setText("http://localhost:4567");
		txtURL.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
	}

	
	// API
	
	public String getURL() {
		return txtURL.getText();
	}

}
