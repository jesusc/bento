package bento.componetization.ui.forms;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import bento.componetization.atl.MetamodelPrunner;
import bento.componetization.reveng.AtlTransformation;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;
import bento.componetization.reveng.RevengPackage.Literals;
import bento.componetization.ui.Activator;
import bento.componetization.ui.ITask;
import bento.componetization.ui.RevengProcessManager;
import bento.componetization.ui.WorkspaceLogger;

import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.internal.dialogs.DialogUtil;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.ui.forms.widgets.FormText;

public class TransformationConfigurationPage extends FormPage {
	private DataBindingContext m_bindingContext;
	private Text txtAtlFile;
	
	private RevengModel revengModel;
	private AtlTransformation atlTransformation;

	boolean isDirtyPage = false;
	private TableViewer listMetamodels;
	private RevengProcessManager manager;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TransformationConfigurationPage(String id, RevengProcessManager manager) {
		super(id, "Transformation configuration");
		this.manager     = manager;
		this.revengModel = manager.getModel();
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
	public TransformationConfigurationPage(FormEditor editor, String id, RevengProcessManager manager) {
		super(editor, id, "Transformation configuration");
		
		this.manager     = manager;
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
		
		Section sctnTransformation = managedForm.getToolkit().createSection(sashForm, Section.TWISTIE | Section.TITLE_BAR);
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
		listMetamodels.setColumnProperties(new String[] {"Name", "URI", "Concept"});
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
				
				Hyperlink hprlnkCreateConceptPages = managedForm.getToolkit().createHyperlink(composite, "Create concept pages", SWT.NONE);
				hprlnkCreateConceptPages.addHyperlinkListener(new IHyperlinkListener() {
					public void linkActivated(HyperlinkEvent e) {
						createConceptPages();
					}
					public void linkEntered(HyperlinkEvent e) {
					}
					public void linkExited(HyperlinkEvent e) {
					}
				});
				managedForm.getToolkit().paintBordersFor(hprlnkCreateConceptPages);
				
				Section sctnProcess = managedForm.getToolkit().createSection(sashForm, Section.TWISTIE | Section.TITLE_BAR);
				managedForm.getToolkit().paintBordersFor(sctnProcess);
				sctnProcess.setText("Process");
				sctnProcess.setExpanded(true);
				
				Composite composite_2 = managedForm.getToolkit().createComposite(sctnProcess, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_2);
				sctnProcess.setClient(composite_2);
				composite_2.setLayout(new GridLayout(2, false));
				
				Label lblApplyTheProcess = managedForm.getToolkit().createLabel(composite_2, "Apply the process iteratively.", SWT.NONE);
				lblApplyTheProcess.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
				
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
				
				Hyperlink hprlnkExtractConcepts = managedForm.getToolkit().createHyperlink(composite_2, "Extract concepts", SWT.NONE);
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
		sashForm.setWeights(new int[] {1, 1});
		toolkit.decorateFormHeading(form.getForm());
		m_bindingContext = initDataBindings();
		

		// Get Dirty flag...
		IObservableValue observeTextTxtAtlFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtAtlFile);
		
		// IObservableValue revengModelTransformationObserveValue = EMFObservables.observeValue(revengModel, Literals.REVENG_MODEL__TRANSFORMATION);
		observeTextTxtAtlFileObserveWidget.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changeTransformationText();
			}
		});

	}

	private void markAsDirty() {
		getManagedForm().dirtyStateChanged();
		isDirtyPage = true;
	}

	
	//
	// Event handling
	//
	protected void changeTransformationText() {
		this.revengModel.getTransformation().setPath( txtAtlFile.getText() );
		
		markAsDirty();		
	}

	protected void doAnalysis() {
		ITask.Runner.run(new ITask() {
			@Override
			public void run(IProgressMonitor monitor) throws Exception {
				manager.applyTyping();				
			}

			@Override
			public void guiAction() throws Exception { }
		});
	}

	protected void addMetamodel() {
		MetamodelInfoDialog dialog = new MetamodelInfoDialog(this.getSite().getShell());
		if ( dialog.open() == MetamodelInfoDialog.OK ) {
			
			Metamodel mm = RevengFactory.eINSTANCE.createMetamodel();
			mm.setName( dialog.getMetamodelName() );
			mm.setPath( dialog.getMetamodelURI() );
			mm.setBecomeConcept(true);
			
			this.atlTransformation.getMetamodels().add(mm);
			
			markAsDirty();
			
			listMetamodels.refresh();
		}
	}


	protected void removeMetamodel() {
		if ( listMetamodels.getSelection() instanceof IStructuredSelection ) {
			Iterator it = ((IStructuredSelection) listMetamodels.getSelection()).iterator();
			while ( it.hasNext() ) {
				Metamodel mm = (Metamodel) it.next();
				if ( atlTransformation.getMetamodels().remove(mm) ) {
					IFormPage p = this.getEditor().findPage(mm.getName());
					if ( p != null )
						this.getEditor().removePage(p.getIndex());
				}
			}
			
			markAsDirty();
			listMetamodels.refresh();
		}
		
	}
	
	protected void createConceptPages() {
		if ( getEditor().isDirty() ) {
			MessageDialog.openError(getSite().getShell(), "Cannot execute command", "The form needs to be saved before creating the pages");
			return;
		}
		
		ITask.Runner.run(new ITask() {
			private HashMap<String, Metamodel> pages = new HashMap<String, Metamodel>();

			@Override
			public void run(IProgressMonitor monitor) throws Exception {
				EList<Metamodel> metamodels = atlTransformation.getMetamodels();
				for (Metamodel metamodel : metamodels) {
					if (metamodel.isBecomeConcept()) {
						String pageId = metamodel.getName();
						
						if (getEditor().findPage(pageId) != null) {
							continue;
						}

						manager.pruneMetamodel(metamodel);						
						
						pages.put(pageId, metamodel);
					}
				}

			}

			@Override
			public void guiAction() throws Exception {
				try {
					for (Entry<String, Metamodel> entry : pages.entrySet()) {
						String 		 pageId = entry.getKey();
						Metamodel metamodel = entry.getValue();
						
						getEditor().addPage(
								new ConceptRefactoringPage(
										getEditor(), pageId,
										manager, metamodel));						
					}
					
				} catch (PartInitException e) {
					WorkspaceLogger.generateLogEntry(Status.ERROR, e);
				}				
			}
		});

	}

	private void showBrowseAtlFileDialog() {
		final ArrayList<IResource> resources = new ArrayList<IResource>();
		
		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					// if ( resource instanceof IFile && ((IFile) resource).
					if ( resource.getLocation() != null && resource.getLocation().getFileExtension() != null && 
						 resource.getLocation().getFileExtension().equals("atl") ) {
						resources.add(resource);
					}
					return true;
				}
			});
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		LabelProvider labelProvider = new LabelProvider() {
			@Override
			public String getText(Object element) {
				IResource r = (IResource) element;
				return r.getName();
			}
		};
		
		ElementListSelectionDialog listDialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), labelProvider);	    
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
		listDialog.setElements(resources.toArray());
		// listDialog.setElements(list.toArray());
		listDialog.open();				
		
		IResource r = (IResource) listDialog.getResult()[0];
		txtAtlFile.setText( r.getFullPath().toPortableString() );
	}	
	
	
	/*
	public static class TextToTransformationConverter extends Converter {
		public TextToTransformationConverter() { super(String.class, AtlTransformation.class); }
		
		@Override
		public Object convert(Object fromObject) {
			String text = (String) fromObject;
			AtlTransformation atl = RevengFactory.eINSTANCE.createAtlTransformation();
			atl.setPath(text);
			return atl;
		}		
	}
	*/
	
	public static class TransformationToTextConverter extends Converter {
		public TransformationToTextConverter() { super(AtlTransformation.class, String.class); }

		@Override
		public Object convert(Object fromObject) {
			AtlTransformation t = (AtlTransformation) fromObject;
			return t.getPath();
		}		
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtAtlFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtAtlFile);
		IObservableValue revengModelTransformationObserveValue = EMFObservables.observeValue(revengModel, Literals.REVENG_MODEL__TRANSFORMATION);
		// UpdateValueStrategy strategy = new UpdateValueStrategy();
		// strategy.setConverter(new TextToTransformationConverter());
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new TransformationToTextConverter());
		bindingContext.bindValue(observeTextTxtAtlFileObserveWidget, revengModelTransformationObserveValue, null, strategy_1);
		//
		return bindingContext;
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
			if ( atlTransformation != null && atlTransformation.getMetamodels().size() > 0 ) 
				return atlTransformation.getMetamodels().toArray();
			
			return new Object[] { };
		}
		
		
		@Override
		public void addListener(ILabelProviderListener listener) { }

		@Override
		public void dispose() { }

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) { }

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
	
}
