package bento.componetization.ui.forms;

import org.eclipse.core.resources.IResource;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.ModelKind;
import bento.componetization.ui.dialogs.FindFileDialog;

import org.eclipse.swt.layout.RowLayout;

public class MetamodelInfoDialog extends TitleAreaDialog {

	private String metamodelName;
	private String metamodelURI;
	private boolean isBecomeConcept;
	
	private Text txtMetamodelName;
	private Text txtMetamodelURI;
	private Button btnConceptualize;
	private Button btnSource;
	private Button btnTarget;
	private Text txtModelname;
	private String modelName;
	private boolean isSource;
	private Text txtTargetmetamodel;
	private Text txtTargeturi;
	private String conceptName;
	private String conceptNsURI;

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
		setTitle("Metamodel configuration");
		setMessage("Configure a meta-model of the component", IMessageProvider.INFORMATION);
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
				lbtLastName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				lbtLastName.setAlignment(SWT.RIGHT);
				lbtLastName.setText("Metamodel path:");
		
				GridData dataLastName = new GridData();
				dataLastName.grabExcessHorizontalSpace = true;
				dataLastName.horizontalAlignment = GridData.FILL;
				txtMetamodelURI = new Text(container, SWT.BORDER);
				txtMetamodelURI.setLayoutData(dataLastName);
				
				Button btnBrowse = new Button(container, SWT.NONE);
				btnBrowse.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						browseEcoreFiles();
					}
				});
				btnBrowse.setText("Browse...");
				
				Label lblModelName = new Label(container, SWT.NONE);
				lblModelName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				lblModelName.setText("Model name:");
				
				txtModelname = new Text(container, SWT.BORDER);
				txtModelname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				new Label(container, SWT.NONE);
				new Label(container, SWT.NONE);
				
				Composite composite = new Composite(container, SWT.NONE);
				composite.setLayout(new RowLayout(SWT.HORIZONTAL));
				
				btnSource = new Button(composite, SWT.RADIO);
				btnSource.setSelection(true);
				btnSource.setText("Source");
				
				btnTarget = new Button(composite, SWT.RADIO);
				btnTarget.setText("Target");
				new Label(container, SWT.NONE);
				new Label(container, SWT.NONE);
				
				btnConceptualize = new Button(container, SWT.CHECK);
				btnConceptualize.setSelection(true);
				btnConceptualize.setText("Conceptualize");
				new Label(container, SWT.NONE);
				
				Label lblTat = new Label(container, SWT.NONE);
				lblTat.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				lblTat.setText("Concept name:");
				
				txtTargetmetamodel = new Text(container, SWT.BORDER);
				txtTargetmetamodel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				new Label(container, SWT.NONE);
				
				Label lblTargetUri = new Label(container, SWT.NONE);
				lblTargetUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				lblTargetUri.setText("Concept URI:");
				
				txtTargeturi = new Text(container, SWT.BORDER);
				txtTargeturi.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				new Label(container, SWT.NONE);

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
		isBecomeConcept = btnConceptualize.getSelection();
		isSource = btnSource.getSelection();
		modelName = txtModelname.getText();
		conceptName = txtTargetmetamodel.getText();
		conceptNsURI = txtTargeturi.getText();
	}

	//
	// Event handlers
	//
	protected void browseEcoreFiles() {
		FindFileDialog listDialog = new FindFileDialog(null, "ecore");		
		listDialog.open();
		IResource r = (IResource) listDialog.getResult()[0];
		txtMetamodelURI.setText( r.getFullPath().toPortableString() );
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getMetamodelName() {
		return metamodelName;
	}

	public String getModelName() {
		return modelName;
	}
	
	public void setData(Metamodel mm) {
		txtMetamodelName.setText(mm.getName());
		if ( mm.getPath() != null )
			txtMetamodelURI.setText(mm.getPath());
		txtModelname.setText(mm.getModelName());
		btnConceptualize.setSelection( mm.isBecomeConcept() );
		
		if ( mm.getKind() == ModelKind.IN ) {
			btnSource.setSelection(true);
			btnTarget.setSelection(false);
		} else {
			btnSource.setSelection(false);
			btnTarget.setSelection(true);
		}
		
		if ( mm.getExtractedConcept() != null ) {
			txtTargetmetamodel.setText( mm.getExtractedConcept().getName() );
			txtTargeturi.setText( mm.getExtractedConcept().getNsURI() );
		}
	}	
	
	public boolean isSource() {
		return isSource;
	}

	public String getMetamodelURI() {
		return metamodelURI;
	}

	public boolean isConcept() {
		return isBecomeConcept;
	}

	public String getConceptName() {
		return conceptName;
	}
	
	public String getNsURI() {
		return conceptNsURI;
	}



}
