package bento.componetization.ui.forms;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
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
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import bento.componetization.atl.refactorings.IMatch;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.RevengPackage.Literals;
import bento.componetization.ui.Activator;
import bento.componetization.ui.MatchInfo;
import bento.componetization.ui.RevengProcessManager;
import bento.componetization.ui.viewers.MetamodelVisualization;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.custom.CTabItem;

public class ConceptRefactoringPage extends FormPage {
	private DataBindingContext m_bindingContext;
	private Text txtConceptMetamodelFile;
	
	private RevengProcessManager manager;
	private Metamodel metamodel;

	boolean isDirtyPage = false;
	private Table table_1;
	private CheckboxTableViewer listRefactorings;
	private TreeViewer conceptTreeViewer;
	private Text text;
	private Text txtConcepturi;
	private Text txtConceptname;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public ConceptRefactoringPage(String id, RevengProcessManager m, Metamodel metamodel) {
		super(id, metamodel.getName());
		this.manager = m;
		this.metamodel = metamodel;
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
	public ConceptRefactoringPage(FormEditor editor, String id, RevengProcessManager m, Metamodel metamodel) {
		super(editor, id, metamodel.getName());
		this.manager = m;
		this.metamodel   = metamodel;
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
		form.setText("Create concept");
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
		
		SashForm sashForm_1 = new SashForm(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(sashForm_1);
		managedForm.getToolkit().paintBordersFor(sashForm_1);
		
		SashForm sashForm = new SashForm(sashForm_1, SWT.VERTICAL);
		managedForm.getToolkit().adapt(sashForm);
		managedForm.getToolkit().paintBordersFor(sashForm);
		
		Section secRefactoring = managedForm.getToolkit().createSection(sashForm, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(secRefactoring);
		secRefactoring.setText("Refactorings");
		secRefactoring.setExpanded(true);
		
		Composite composite = managedForm.getToolkit().createComposite(secRefactoring, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		managedForm.getToolkit().paintBordersFor(composite);
		secRefactoring.setClient(composite);
		composite.setLayout(new GridLayout(1, false));
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(5, false));
		
		Label lblRefactorings = new Label(composite_1, SWT.NONE);
		lblRefactorings.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 5, 1));
		managedForm.getToolkit().adapt(lblRefactorings, true, true);
		lblRefactorings.setText("Applicable refactorings");
				new Label(composite_1, SWT.NONE);
				
				listRefactorings = CheckboxTableViewer.newCheckList(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
				table_1 = listRefactorings.getTable();
				table_1.setHeaderVisible(true);
				GridData gd_table_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3);
				gd_table_1.heightHint = 150;
				table_1.setLayoutData(gd_table_1);
				managedForm.getToolkit().paintBordersFor(table_1);
				
				TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(listRefactorings, SWT.NONE);
				TableColumn tblclmnSelected = tableViewerColumn_3.getColumn();
				tblclmnSelected.setWidth(20);
				
				TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(listRefactorings, SWT.NONE);
				TableColumn tblclmnName_1 = tableViewerColumn_4.getColumn();
				tblclmnName_1.setWidth(100);
				tblclmnName_1.setText("Name");
				
				TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(listRefactorings, SWT.NONE);
				TableColumn tblclmnExplanation_1 = tableViewerColumn_5.getColumn();
				tblclmnExplanation_1.setWidth(100);
				tblclmnExplanation_1.setText("Explanation");
				listRefactorings.setContentProvider(new RefactoringListProvider());
				listRefactorings.setLabelProvider(new RefactoringListProvider());
				new Label(composite_1, SWT.NONE);
				
				Button btnApplySelected = managedForm.getToolkit().createButton(composite_1, "Apply selected", SWT.NONE);
				btnApplySelected.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						applySelectedRefactorings();
					}
				});
				new Label(composite_1, SWT.NONE);
				new Label(composite_1, SWT.NONE);
				new Label(composite_1, SWT.NONE);
				
				Button btnApplyAll = managedForm.getToolkit().createButton(composite_1, "Apply all", SWT.NONE);
				btnApplyAll.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
				new Label(composite_1, SWT.NONE);
				new Label(composite_1, SWT.NONE);
				new Label(composite_1, SWT.NONE);
				new Label(composite_1, SWT.NONE);
				new Label(composite_1, SWT.NONE);
				
				Hyperlink hprlnkFindAgainRefactorings = managedForm.getToolkit().createHyperlink(composite, "Find new refactorings", SWT.NONE);
				hprlnkFindAgainRefactorings.addHyperlinkListener(new IHyperlinkListener() {
					public void linkActivated(HyperlinkEvent e) {
						findNewRefactorings();
					}
					public void linkEntered(HyperlinkEvent e) {
					}
					public void linkExited(HyperlinkEvent e) {
					}
				});
				managedForm.getToolkit().paintBordersFor(hprlnkFindAgainRefactorings);
				
				Section sctnConceptInformation = managedForm.getToolkit().createSection(sashForm, Section.TWISTIE | Section.TITLE_BAR);
				managedForm.getToolkit().paintBordersFor(sctnConceptInformation);
				sctnConceptInformation.setText("Concept information");
				sctnConceptInformation.setExpanded(true);
				
				Composite composite_2 = managedForm.getToolkit().createComposite(sctnConceptInformation, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_2);
				sctnConceptInformation.setClient(composite_2);
				composite_2.setLayout(new GridLayout(1, false));
				
				Composite compAtlFile = new Composite(composite_2, SWT.NONE);
				compAtlFile.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
				compAtlFile.setSize(572, 39);
				managedForm.getToolkit().adapt(compAtlFile);
				managedForm.getToolkit().paintBordersFor(compAtlFile);
				GridLayout gl_compAtlFile = new GridLayout(3, false);
				compAtlFile.setLayout(gl_compAtlFile);
				
				Label lblName = new Label(compAtlFile, SWT.NONE);
				lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				managedForm.getToolkit().adapt(lblName, true, true);
				lblName.setText("Name:");
				
				txtConceptname = managedForm.getToolkit().createText(compAtlFile, "New Text", SWT.NONE);
				txtConceptname.setText("");
				txtConceptname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				new Label(compAtlFile, SWT.NONE);
				
				Label lblConceptMetamodelFile = managedForm.getToolkit().createLabel(compAtlFile, "Metamodel file: ", SWT.NONE);
				
				txtConceptMetamodelFile = managedForm.getToolkit().createText(compAtlFile, "", SWT.NONE);
				GridData gd_txtConceptMetamodelFile = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				gd_txtConceptMetamodelFile.minimumWidth = 200;
				gd_txtConceptMetamodelFile.heightHint = 19;
				gd_txtConceptMetamodelFile.widthHint = 0;
				txtConceptMetamodelFile.setLayoutData(gd_txtConceptMetamodelFile);
				
				Button btnBrowse = managedForm.getToolkit().createButton(compAtlFile, "Browse...", SWT.NONE);
				
				Label lblUri = new Label(compAtlFile, SWT.NONE);
				lblUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
				managedForm.getToolkit().adapt(lblUri, true, true);
				lblUri.setText("URI:");
				
				txtConcepturi = managedForm.getToolkit().createText(compAtlFile, "New Text", SWT.NONE);
				txtConcepturi.setText("");
				txtConcepturi.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				new Label(compAtlFile, SWT.NONE);
				btnBrowse.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						showBrowseAtlFileDialog();
					}
				});
				sashForm.setWeights(new int[] {3, 1});
				
				Section sctnConcept = managedForm.getToolkit().createSection(sashForm_1, Section.TWISTIE | Section.TITLE_BAR);
				managedForm.getToolkit().paintBordersFor(sctnConcept);
				sctnConcept.setText("Concept");
				sctnConcept.setExpanded(true);
				
				Composite composite_3 = managedForm.getToolkit().createComposite(sctnConcept, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_3);
				sctnConcept.setClient(composite_3);
				composite_3.setLayout(new GridLayout(2, false));
				
				CTabFolder tabFolder = new CTabFolder(composite_3, SWT.BORDER);
				tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
				managedForm.getToolkit().adapt(tabFolder);
				managedForm.getToolkit().paintBordersFor(tabFolder);
				tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
				
				CTabItem tbtmMetamodel = new CTabItem(tabFolder, SWT.NONE);
				tbtmMetamodel.setText("Metamodel");
				
				conceptTreeViewer = new TreeViewer(tabFolder, SWT.BORDER);
				Tree conceptTree = conceptTreeViewer.getTree();
				tbtmMetamodel.setControl(conceptTree);
				managedForm.getToolkit().paintBordersFor(conceptTree);
				
				CTabItem tbtmMetrics = new CTabItem(tabFolder, SWT.NONE);
				tbtmMetrics.setText("Metrics");
				
				text = new Text(tabFolder, SWT.BORDER);
				text.setText("");
				tbtmMetrics.setControl(text);
				conceptTreeViewer.setLabelProvider(new MetamodelVisualization());
				conceptTreeViewer.setContentProvider(new MetamodelVisualization());
				conceptTreeViewer.refresh();
				
				Hyperlink hprlnkComputeMetrics = managedForm.getToolkit().createHyperlink(composite_3, "Compute metrics", SWT.NONE);
				managedForm.getToolkit().paintBordersFor(hprlnkComputeMetrics);
				
				Button btnComputeMetrics = new Button(composite_3, SWT.CHECK);
				btnComputeMetrics.setSelection(true);
				managedForm.getToolkit().adapt(btnComputeMetrics, true, true);
				btnComputeMetrics.setText("Inline in tree");
		sashForm_1.setWeights(new int[] {1, 1});
		toolkit.decorateFormHeading(form.getForm());
		m_bindingContext = initDataBindings();
		

		// Manually modified
		// Set input for the tree editor
		myInitializations();
	}


	private void myInitializations() {
		Resource metamodelResource = this.manager.getConcept(this.metamodel);
		conceptTreeViewer.setInput(metamodelResource);
		
		
		// Get Dirty flag...
		IObservableValue revengModelTransformationObserveValue = EMFObservables.observeValue(manager.getModel(), Literals.REVENG_MODEL__TRANSFORMATION);
		revengModelTransformationObserveValue.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				markAsDirty();
			}
		});		
	}

	private void markAsDirty() {
		isDirtyPage = true;
		getManagedForm().dirtyStateChanged();
	}

	//
	// Event handlers
	//
	
	protected void findNewRefactorings() {
		List<MatchInfo> matches = manager.findRefactorings(this.metamodel);
		listRefactorings.setInput(matches);
		listRefactorings.setAllChecked(true);
	}


	protected void applySelectedRefactorings() {
		Activator.log("Applying refactorings");
		
		List<IMatch> matches = new ArrayList<IMatch>();
		List<IMatch> uncheckedMatches = new ArrayList<IMatch>((List<IMatch>) listRefactorings.getInput());
		for(Object o : listRefactorings.getCheckedElements()) {
			MatchInfo mi = ((MatchInfo) o);
			Activator.log("  - Refactoring " + mi.getRefactoringHumanName() + " will be applied: " + mi.getText());

			
			matches.add( mi.getMatch() );
			uncheckedMatches.remove(o);
		}
		
		manager.applyRefactorings(this.metamodel, matches);
		listRefactorings.setInput(uncheckedMatches);
		listRefactorings.refresh();
		
		conceptTreeViewer.refresh();
		
		markAsDirty();
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
		txtConceptMetamodelFile.setText( r.getFullPath().toPortableString() );
	}	
	
	/*
	public class SelectRefactoringEditingSupport extends EditingSupport {
		public SelectRefactoringEditingSupport(ColumnViewer viewer) {
			super(viewer);
		}

		private CheckboxCellEditor editor = new CheckboxCellEditor() {
			protected org.eclipse.swt.widgets.Control createControl(Composite parent) {
				return new Button(parent, SWT.CHECK);
			};
		};
		
		//new CheckboxCellEditor(null, SWT.CHECK);
		
		@Override
		protected CellEditor getCellEditor(Object element) {
			return editor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			MatchInfo info = (MatchInfo) element;
			return info.isSelected();
		}

		@Override
		protected void setValue(Object element, Object value) {
			MatchInfo info = (MatchInfo) element;
			info.setSelected((Boolean) value);
		}
		
	}
	*/

	/**
	 * 
	 * @author jesus
	 *
	 */
	public class RefactoringListProvider implements ITableLabelProvider, IStructuredContentProvider {

		private List<MatchInfo> input = new ArrayList<MatchInfo>();

		@Override
		public void addListener(ILabelProviderListener listener) { }

		@Override
		public void dispose() { }

		@Override
		public boolean isLabelProperty(Object element, String property) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			this.input = (List<MatchInfo>) newInput;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return input.toArray();
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			MatchInfo info = (MatchInfo) element;
			switch (columnIndex) {
			case 1:
				return info.getRefactoringHumanName();
			case 2:
				return info.getText();
			default:
				break;
			}
			return "";
		}
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtConceptMetamodelFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtConceptMetamodelFile);
		IObservableValue metamodelPathObserveValue = EMFProperties.value(FeaturePath.fromList(Literals.METAMODEL__EXTRACTED_CONCEPT, Literals.RESOURCE__PATH)).observe(metamodel);
		bindingContext.bindValue(observeTextTxtConceptMetamodelFileObserveWidget, metamodelPathObserveValue, null, null);
		//
		IObservableValue observeTextTxtConceptnameObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtConceptname);
		IObservableValue metamodelNameObserveValue = EMFProperties.value(FeaturePath.fromList(Literals.METAMODEL__EXTRACTED_CONCEPT, Literals.CONCEPT__NAME)).observe(metamodel);
		bindingContext.bindValue(observeTextTxtConceptnameObserveWidget, metamodelNameObserveValue, null, null);
		//
		IObservableValue observeTextTxtConcepturiObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtConcepturi);
		IObservableValue metamodelNsURIObserveValue = EMFProperties.value(FeaturePath.fromList(Literals.METAMODEL__EXTRACTED_CONCEPT, Literals.CONCEPT__NS_URI)).observe(metamodel);
		bindingContext.bindValue(observeTextTxtConcepturiObserveWidget, metamodelNsURIObserveValue, null, null);
		//
		return bindingContext;
	}
}
