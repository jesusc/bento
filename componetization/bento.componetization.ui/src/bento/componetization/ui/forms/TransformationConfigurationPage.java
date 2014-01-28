package bento.componetization.ui.forms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import bento.componetization.reveng.AtlTransformation;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.ModelKind;
import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;
import bento.componetization.reveng.RevengPackage.Literals;
import bento.componetization.ui.ITask;
import bento.componetization.ui.RevengProcessManager;
import bento.componetization.ui.TypingInfo;
import bento.componetization.ui.WorkspaceLogger;
import bento.componetization.ui.dialogs.FindFileDialog;

public class TransformationConfigurationPage extends FormPage {
	private DataBindingContext m_bindingContext;
	private Text txtAtlFile;
	private Text txtTemplatePath;

	private RevengModel revengModel;
	private AtlTransformation atlTransformation;

	boolean isDirtyPage = false;
	private TableViewer listMetamodels;
	private RevengProcessManager manager;
	private Text txtComponentFile;

	/**
	 * Create the form page.
	 * 
	 * @param id
	 * @param title
	 */
	public TransformationConfigurationPage(String id, RevengProcessManager manager) {
		super(id, "Transformation configuration");
		this.manager = manager;
		this.revengModel = manager.getModel();
	}

	/**
	 * Create the form page.
	 * 
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public TransformationConfigurationPage(FormEditor editor, String id, RevengProcessManager manager) {
		super(editor, id, "Transformation configuration");

		this.manager = manager;
		this.revengModel = manager.getModel();
		this.atlTransformation = (AtlTransformation) revengModel.getTransformation();
	}

	@Override
	public boolean isDirty() {
		// System.out.println("TransformationConfigurationPage.isDirty()");
		return isDirtyPage;
	}

	public void saved() {
		isDirtyPage = false;
		getManagedForm().dirtyStateChanged();
	}

	/**
	 * Create contents of the form.
	 * 
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Configure transformation");
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));

		SashForm sashForm = new SashForm(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(sashForm);
		managedForm.getToolkit().paintBordersFor(sashForm);

		Section sctnTransformation = managedForm.getToolkit().createSection(sashForm,
				Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnTransformation);
		sctnTransformation.setText("Transformation");
		sctnTransformation.setExpanded(true);

		Composite composite = managedForm.getToolkit().createComposite(sctnTransformation, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		managedForm.getToolkit().paintBordersFor(composite);
		sctnTransformation.setClient(composite);
		composite.setLayout(new GridLayout(1, false));

		Composite compAtlFile = new Composite(composite, SWT.NONE);
		compAtlFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(compAtlFile);
		managedForm.getToolkit().paintBordersFor(compAtlFile);
		GridLayout gl_compAtlFile = new GridLayout(3, false);
		compAtlFile.setLayout(gl_compAtlFile);

		Label lblAtlFile = managedForm.getToolkit().createLabel(compAtlFile, "ATL File: ", SWT.NONE);

		txtAtlFile = managedForm.getToolkit().createText(compAtlFile, "", SWT.NONE);
		GridData gd_txtAtlFile = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtAtlFile.minimumWidth = 200;
		gd_txtAtlFile.heightHint = 19;
		gd_txtAtlFile.widthHint = 0;
		txtAtlFile.setLayoutData(gd_txtAtlFile);

		Button btnBrowse = managedForm.getToolkit().createButton(compAtlFile, "Browse...", SWT.NONE);
		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showBrowseAtlFileDialog();
			}
		});

		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(2, false));

		Label lblMetamodels = new Label(composite_1, SWT.NONE);
		lblMetamodels.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		managedForm.getToolkit().adapt(lblMetamodels, true, true);
		lblMetamodels.setText("Metamodels");

		listMetamodels = new TableViewer(composite_1, SWT.BORDER);
		Table table = listMetamodels.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		listMetamodels.setColumnProperties(new String[] { "Name", "URI", "Concept" });
		GridData gd_listMetamodels = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
		gd_listMetamodels.heightHint = 150;
		gd_listMetamodels.widthHint = 0;
		listMetamodels.getTable().setLayoutData(gd_listMetamodels);
		managedForm.getToolkit().adapt(listMetamodels.getTable(), true, true);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(listMetamodels, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(listMetamodels, SWT.NONE);
		TableColumn tblclmnUri = tableViewerColumn_1.getColumn();
		tblclmnUri.setWidth(300);
		tblclmnUri.setText("URI");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(listMetamodels, SWT.NONE);
		TableColumn tblclmnNewColumn_1 = tableViewerColumn_2.getColumn();
		tblclmnNewColumn_1.setAlignment(SWT.CENTER);
		tblclmnNewColumn_1.setWidth(20);
		tblclmnNewColumn_1.setText("Concept");

		listMetamodels.setContentProvider(new MetamodelListProvider());
		listMetamodels.setLabelProvider(new MetamodelListProvider());
		listMetamodels.setInput(revengModel);

		Button btnAdd = managedForm.getToolkit().createButton(composite_1, "Add...", SWT.NONE);
		btnAdd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addMetamodel();
			}
		});

		Button btnEdit = managedForm.getToolkit().createButton(composite_1, "Edit...", SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEdit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				editMetamodel();
			}
		});

		Button btnRemove = managedForm.getToolkit().createButton(composite_1, "Remove", SWT.NONE);
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeMetamodel();
			}
		});
		btnRemove.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));

		Section sctnProcess = managedForm.getToolkit().createSection(sashForm, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnProcess);
		sctnProcess.setText("Process");
		sctnProcess.setExpanded(true);

		Composite composite_2 = managedForm.getToolkit().createComposite(sctnProcess, SWT.NONE);
		managedForm.getToolkit().paintBordersFor(composite_2);
		sctnProcess.setClient(composite_2);
		composite_2.setLayout(new GridLayout(2, false));

		Label lblApplyTheProcess = managedForm.getToolkit().createLabel(composite_2, "Apply the process iteratively.",
				SWT.NONE);
		lblApplyTheProcess.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));

		Label label_2 = new Label(composite_2, SWT.NONE);
		managedForm.getToolkit().adapt(label_2, true, true);
		label_2.setText("0.");

		Hyperlink hprlnkCreateTemplate = managedForm.getToolkit().createHyperlink(composite_2, "Create template",
				SWT.NONE);
		hprlnkCreateTemplate.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				createTemplateFile();
			}

			public void linkEntered(HyperlinkEvent e) {
			}

			public void linkExited(HyperlinkEvent e) {
			}
		});
		managedForm.getToolkit().paintBordersFor(hprlnkCreateTemplate);

		Label label_1 = managedForm.getToolkit().createLabel(composite_2, "1.", SWT.NONE);

		Hyperlink hprlnkAnalysis = managedForm.getToolkit().createHyperlink(composite_2, "Analysis", SWT.NONE);
		hprlnkAnalysis.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				doAnalysis();
			}

			public void linkEntered(HyperlinkEvent e) {
			}

			public void linkExited(HyperlinkEvent e) {
			}
		});
		managedForm.getToolkit().paintBordersFor(hprlnkAnalysis);

		Label label = managedForm.getToolkit().createLabel(composite_2, "2.", SWT.NONE);

		Hyperlink hprlnkExtractConcepts = managedForm.getToolkit().createHyperlink(composite_2, "Extract concepts",
				SWT.NONE);
		hprlnkExtractConcepts.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				createConceptPages();
			}

			public void linkEntered(HyperlinkEvent e) {
			}

			public void linkExited(HyperlinkEvent e) {
			}
		});
		managedForm.getToolkit().paintBordersFor(hprlnkExtractConcepts);
		
		Label label_3 = new Label(composite_2, SWT.NONE);
		managedForm.getToolkit().adapt(label_3, true, true);
		label_3.setText("3.");
		
		Label lblDocumentnotIntegrated = managedForm.getToolkit().createLabel(composite_2, "Document (not integrated yet)", SWT.NONE);
		
		Label label_4 = new Label(composite_2, SWT.NONE);
		managedForm.getToolkit().adapt(label_4, true, true);
		label_4.setText("4.");
		
		Hyperlink hprlnkPackageComponent = managedForm.getToolkit().createHyperlink(composite_2, "Package component", SWT.NONE);
		hprlnkPackageComponent.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				packageComponent();
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		managedForm.getToolkit().paintBordersFor(hprlnkPackageComponent);
		sashForm.setWeights(new int[] { 1, 1 });
		toolkit.decorateFormHeading(form.getForm());

		Label lblTemplate = new Label(compAtlFile, SWT.NONE);
		lblTemplate.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblTemplate, true, true);
		lblTemplate.setText("Template:");

		txtTemplatePath = new Text(compAtlFile, SWT.BORDER);
		txtTemplatePath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(txtTemplatePath, true, true);

		Button btnBrowse_1 = new Button(compAtlFile, SWT.NONE);
		managedForm.getToolkit().adapt(btnBrowse_1, true, true);
		btnBrowse_1.setText("Browse...");
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(composite_3);
		managedForm.getToolkit().paintBordersFor(composite_3);
		composite_3.setLayout(new GridLayout(3, false));
		
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Component:");
		
		txtComponentFile = new Text(composite_3, SWT.BORDER);
		txtComponentFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(txtComponentFile, true, true);
		
		Button btnBrowse_2 = new Button(composite_3, SWT.NONE);
		managedForm.getToolkit().adapt(btnBrowse_2, true, true);
		btnBrowse_2.setText("Browse...");

		m_bindingContext = initDataBindings();
		myDataBindings();
		// ///////////
	}



	protected void createTemplateFile() {
		String path = txtTemplatePath.getText().trim();
		if (path.isEmpty())
			return;

		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
		if (file.exists()) {
			if (!MessageDialog.openConfirm(null, "Template exists", "Do you want to replace the template file?"))
				return;
		}

		manager.createTemplateFile(file);
	}

	private void markAsDirty() {
		isDirtyPage = true;
		getManagedForm().dirtyStateChanged();
	}

	//
	// Event handling
	//
	protected void changeTransformationText() {
		this.revengModel.getTransformation().setPath(txtAtlFile.getText());
		this.revengModel.getTemplate().setPath( txtTemplatePath.getText() );
		markAsDirty();
	}

	protected void doAnalysis() {
		ITask.Runner.run(new ITask() {
			TypingInfo info = null;

			@Override
			public void run(IProgressMonitor monitor) throws Exception {
				info = manager.applyTyping();
			}

			@Override
			public void guiAction() throws Exception {
				TemplatePage page = (TemplatePage) getEditor().findPage(TemplatePage.ID);
				if (page == null) {
					page = new TemplatePage(getEditor(), manager);
					getEditor().addPage(1, page);
				}

				page.setTypingInfo(info);
			}
		});
	}

	protected void addMetamodel() {
		MetamodelInfoDialog dialog = new MetamodelInfoDialog(this.getSite().getShell());
		if (dialog.open() == MetamodelInfoDialog.OK) {

			Metamodel mm = RevengFactory.eINSTANCE.createMetamodel();
			mm.setName(dialog.getMetamodelName());
			mm.setPath(dialog.getMetamodelURI());
			mm.setBecomeConcept(dialog.isConcept());

			this.atlTransformation.getMetamodels().add(mm);

			markAsDirty();

			listMetamodels.refresh();
		}
	}

	protected void editMetamodel() {
		if (listMetamodels.getSelection() == null)
			return;

		Metamodel mm = (Metamodel) ((IStructuredSelection) listMetamodels.getSelection()).getFirstElement();

		MetamodelInfoDialog dialog = new MetamodelInfoDialog(this.getSite().getShell());
		dialog.create();
		dialog.setData(mm.getName(), mm.getPath(), mm.getModelName(), mm.isBecomeConcept(), mm.getKind() == ModelKind.IN);

		if (dialog.open() == MetamodelInfoDialog.OK) {
			mm.setName(dialog.getMetamodelName());
			mm.setPath(dialog.getMetamodelURI());
			mm.setBecomeConcept(dialog.isConcept());
			if ( dialog.isSource() ) {
				mm.setKind(ModelKind.IN);
			} else {
				mm.setKind(ModelKind.OUT);				
			}
			mm.setModelName(dialog.getModelName());
			
			markAsDirty();
			listMetamodels.refresh();
		}
	}

	protected void removeMetamodel() {
		if (listMetamodels.getSelection() instanceof IStructuredSelection) {
			Iterator it = ((IStructuredSelection) listMetamodels.getSelection()).iterator();
			while (it.hasNext()) {
				Metamodel mm = (Metamodel) it.next();
				if (atlTransformation.getMetamodels().remove(mm)) {
					IFormPage p = this.getEditor().findPage(mm.getName());
					if (p != null)
						this.getEditor().removePage(p.getIndex());
				}
			}

			markAsDirty();
			listMetamodels.refresh();
		}
	}

	protected void packageComponent() {
		manager.packageComponent();
	}

	protected void createConceptPages() {
		if (getEditor().isDirty()) {
			MessageDialog.openError(getSite().getShell(), "Cannot execute command",
					"The form needs to be saved before creating the pages");
			return;
		}

		ITask.Runner.run(new ITask() {
			private HashMap<String, Metamodel> pages = new HashMap<String, Metamodel>();

			@Override
			public void run(IProgressMonitor monitor) throws Exception {
				EList<Metamodel> metamodels = atlTransformation.getMetamodels();
				boolean retypingNeeded = false;
				for (Metamodel metamodel : metamodels) {
					if (metamodel.isBecomeConcept()) {
						String pageId = metamodel.getName();

						if (getEditor().findPage(pageId) != null) {
							continue;
						}

						retypingNeeded = retypingNeeded || manager.pruneMetamodel(metamodel);

						pages.put(pageId, metamodel);
					}
				}

				if (retypingNeeded)
					manager.applyTyping();
			}

			@Override
			public void guiAction() throws Exception {
				try {
					for (Entry<String, Metamodel> entry : pages.entrySet()) {
						String pageId = entry.getKey();
						Metamodel metamodel = entry.getValue();

						getEditor().addPage(new ConceptRefactoringPage(getEditor(), pageId, manager, metamodel));
					}

				} catch (PartInitException e) {
					WorkspaceLogger.generateLogEntry(Status.ERROR, e);
				}
			}
		});

	}

	private void showBrowseAtlFileDialog() {

		FindFileDialog listDialog = new FindFileDialog(null, "atl");
		listDialog.open();
		IResource r = (IResource) listDialog.getResult()[0];
		String path = r.getFullPath().toPortableString();
		txtAtlFile.setText(path);

		if (txtTemplatePath.getText().trim().isEmpty()) {
			String fileName = new Path(path).lastSegment();
			IFolder folder = manager.getDefaultTemplateFolder();
			IFile file = folder.getFile(fileName);

			txtTemplatePath.setText(file.getFullPath().toPortableString());
		}
		
		if ( txtComponentFile.getText().trim().isEmpty()) {
			String fileName = new Path(path).lastSegment();
			IFolder folder = manager.getDefaultComponentFolder();
			IFile file = folder.getFile(fileName);

			txtComponentFile.setText(file.getFullPath().removeFileExtension().addFileExtension("gcomponent").toPortableString());
		} 

	}

	/*
	 * public static class TextToTransformationConverter extends Converter {
	 * public TextToTransformationConverter() { super(String.class,
	 * AtlTransformation.class); }
	 * 
	 * @Override public Object convert(Object fromObject) { String text =
	 * (String) fromObject; AtlTransformation atl =
	 * RevengFactory.eINSTANCE.createAtlTransformation(); atl.setPath(text);
	 * return atl; } }
	 */

	public static class TransformationToTextConverter extends Converter {
		public TransformationToTextConverter() {
			super(AtlTransformation.class, String.class);
		}

		@Override
		public Object convert(Object fromObject) {
			AtlTransformation t = (AtlTransformation) fromObject;
			return t.getPath();
		}
	}

	/**
	 * 
	 * @author jesus
	 * 
	 */
	public class MetamodelListProvider implements ITableLabelProvider, IStructuredContentProvider {
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// System.out.println(oldInput + " - " + newInput);
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if (atlTransformation != null && atlTransformation.getMetamodels().size() > 0)
				return atlTransformation.getMetamodels().toArray();

			return new Object[] {};
		}

		@Override
		public void addListener(ILabelProviderListener listener) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			Metamodel mm = (Metamodel) element;
			switch (columnIndex) {
			case 0:
				return mm.getName();
			case 1:
				return mm.getPath();
			case 2:
				return mm.isBecomeConcept() ? "C" : "-";
			}
			return null;
		}

	}

	private void myDataBindings() {
		// Get Dirty flag...
		IObservableValue observeTextTxtAtlFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtAtlFile);
		observeTextTxtAtlFileObserveWidget.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changeTransformationText();
			}
		});

		// Get Dirty flag...
		IObservableValue observeTextTxtTemplateFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtAtlFile);
		observeTextTxtTemplateFileObserveWidget.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changeTransformationText();
			}
		});
		
		IObservableValue observeTextTxtComponentFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtComponentFile);
		observeTextTxtComponentFileObserveWidget.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				markAsDirty();
			}
		});
		
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtAtlFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtAtlFile);
		IObservableValue revengModelTransformationObserveValue = EMFObservables.observeValue(revengModel, Literals.REVENG_MODEL__TRANSFORMATION);
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new TransformationToTextConverter());
		bindingContext.bindValue(observeTextTxtAtlFileObserveWidget, revengModelTransformationObserveValue, null, strategy_1);
		//
		IObservableValue observeTextTxtTemplatePathObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtTemplatePath);
		IObservableValue revengModelTemplateObserveValue = EMFObservables.observeValue(revengModel, Literals.REVENG_MODEL__TEMPLATE);
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new TransformationToTextConverter());
		bindingContext.bindValue(observeTextTxtTemplatePathObserveWidget, revengModelTemplateObserveValue, null, strategy_2);
		//
		IObservableValue observeTextTxtComponentNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtComponentFile);
		IObservableValue revengModelComponentPathObserveValue = EMFObservables.observeValue(revengModel, Literals.REVENG_MODEL__COMPONENT_PATH);
		bindingContext.bindValue(observeTextTxtComponentNameObserveWidget, revengModelComponentPathObserveValue, null, null);
		//
		return bindingContext;
	}
}
