package bento.componetization.ui.forms;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class MetamodelInfoDialog extends TitleAreaDialog {

	private String metamodelName;
	private String metamodelURI;
	private Text txtMetamodelName;
	private Text txtMetamodelURI;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public MetamodelInfoDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Transformation metamodels");
		setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Enter the metamodel name, as used by the ATL transformation, and its URI or path in the filesystem.");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(3, false);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);

		createFirstName(container);
		createLastName(container);
				new Label(container, SWT.NONE);
				Label lbtLastName = new Label(container, SWT.NONE);
				lbtLastName.setAlignment(SWT.RIGHT);
				lbtLastName.setText("Metamodel URI:");
		
				GridData dataLastName = new GridData();
				dataLastName.grabExcessHorizontalSpace = true;
				dataLastName.horizontalAlignment = GridData.FILL;
				txtMetamodelURI = new Text(container, SWT.BORDER);
				txtMetamodelURI.setLayoutData(dataLastName);
				
				Button btnBrowse = new Button(container, SWT.NONE);
				btnBrowse.setText("Browse...");

		return area;
	}

	private void createFirstName(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Metamodel name:");

		GridData dataFirstName = new GridData();
		dataFirstName.grabExcessHorizontalSpace = true;
		dataFirstName.horizontalAlignment = GridData.FILL;

		txtMetamodelName = new Text(container, SWT.BORDER);
		txtMetamodelName.setLayoutData(dataFirstName);
	}

	private void createLastName(Composite container) {
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// save content of the Text fields because they get disposed
	// as soon as the Dialog closes
	private void saveInput() {
		metamodelName = txtMetamodelName.getText();
		metamodelURI = txtMetamodelURI.getText();

	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getMetamodelName() {
		return metamodelName;
	}

	public String getMetamodelURI() {
		return metamodelURI;
	}

}
