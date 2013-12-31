package bento.componetization.ui.forms;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.ui.forms.widgets.ColumnLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;

public class TransformationConfigurationPage extends FormPage {
	private Text txtAtlFile;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TransformationConfigurationPage(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public TransformationConfigurationPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Configure transformation");
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Section sctnTransformation = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnTransformation);
		sctnTransformation.setText("Transformation");
		sctnTransformation.setExpanded(true);
		
		Composite composite = managedForm.getToolkit().createComposite(sctnTransformation, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite);
		sctnTransformation.setClient(composite);
		composite.setLayout(new FormLayout());
		
		Label lblAtlFile = managedForm.getToolkit().createLabel(composite, "ATL File: ", SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.bottom = new FormAttachment(100, -372);
		fd_lblNewLabel.top = new FormAttachment(0, 25);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblAtlFile.setLayoutData(fd_lblNewLabel);
		
		txtAtlFile = managedForm.getToolkit().createText(composite, "New Text", SWT.NONE);
		FormData fd_txtNewText = new FormData();
		fd_txtNewText.left = new FormAttachment(lblAtlFile, 6);
		fd_txtNewText.bottom = new FormAttachment(0, 46);
		fd_txtNewText.top = new FormAttachment(0, 25);
		txtAtlFile.setLayoutData(fd_txtNewText);
		
		Button btnBrowse = managedForm.getToolkit().createButton(composite, "Browse...", SWT.NONE);
		fd_txtNewText.right = new FormAttachment(btnBrowse, -8);
		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		FormData fd_btnBrowse = new FormData();
		fd_btnBrowse.bottom = new FormAttachment(0, 50);
		fd_btnBrowse.left = new FormAttachment(0, 409);
		fd_btnBrowse.top = new FormAttachment(0, 20);
		btnBrowse.setLayoutData(fd_btnBrowse);
		
		List listMetamodels = new List(composite, SWT.BORDER);
		FormData fd_listMetamodels = new FormData();
		fd_listMetamodels.left = new FormAttachment(0, 10);
		fd_listMetamodels.bottom = new FormAttachment(100, -137);
		listMetamodels.setLayoutData(fd_listMetamodels);
		managedForm.getToolkit().adapt(listMetamodels, true, true);
		
		Label lblMetamodels = new Label(composite, SWT.NONE);
		fd_listMetamodels.top = new FormAttachment(lblMetamodels, 6);
		FormData fd_lblMetamodels = new FormData();
		fd_lblMetamodels.bottom = new FormAttachment(100, -332);
		fd_lblMetamodels.left = new FormAttachment(lblAtlFile, 0, SWT.LEFT);
		lblMetamodels.setLayoutData(fd_lblMetamodels);
		managedForm.getToolkit().adapt(lblMetamodels, true, true);
		lblMetamodels.setText("Metamodels");
		
		Button btnAdd = managedForm.getToolkit().createButton(composite, "Add...", SWT.NONE);
		fd_listMetamodels.right = new FormAttachment(btnAdd, -6);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addMetamodel();
			}
		});
		FormData fd_btnAdd = new FormData();
		fd_btnAdd.right = new FormAttachment(0, 313);
		fd_btnAdd.left = new FormAttachment(0, 248);
		fd_btnAdd.top = new FormAttachment(txtAtlFile, 43);
		btnAdd.setLayoutData(fd_btnAdd);
		
		Button btnEdit = managedForm.getToolkit().createButton(composite, "Edit...", SWT.NONE);
		btnEdit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		FormData fd_btnEdit = new FormData();
		fd_btnEdit.right = new FormAttachment(0, 313);
		fd_btnEdit.left = new FormAttachment(0, 248);
		fd_btnEdit.top = new FormAttachment(txtAtlFile, 78);
		btnEdit.setLayoutData(fd_btnEdit);
		
		Button btnRemove = managedForm.getToolkit().createButton(composite, "Remove", SWT.NONE);
		FormData fd_btnRemove = new FormData();
		fd_btnRemove.left = new FormAttachment(0, 248);
		fd_btnRemove.top = new FormAttachment(txtAtlFile, 115);
		btnRemove.setLayoutData(fd_btnRemove);
		toolkit.decorateFormHeading(form.getForm());
	}

	
	//
	// Event handling
	//
	
	protected void addMetamodel() {
		// TODO Auto-generated method stub
		
	}
}
