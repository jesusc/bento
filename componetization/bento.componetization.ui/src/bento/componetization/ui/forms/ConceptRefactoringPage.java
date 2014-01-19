package bento.componetization.ui.forms;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
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
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
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
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
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

import bento.componetization.reveng.AtlTransformation;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;
import bento.componetization.reveng.RevengPackage.Literals;
import bento.componetization.ui.Activator;
import bento.componetization.ui.MatchInfo;
import bento.componetization.ui.RevengProcessManager;

import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.swt.widgets.Table;

public class ConceptRefactoringPage extends FormPage {
	private DataBindingContext m_bindingContext;
	private Text txtConceptMetamodelFile;
	
	private RevengProcessManager manager;
	private Metamodel metamodel;

	boolean isDirtyPage = false;
	private TableViewer listRefactorings;

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
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(3, false));
		
		Label lblRefactorings = new Label(composite_1, SWT.NONE);
		lblRefactorings.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		managedForm.getToolkit().adapt(lblRefactorings, true, true);
		lblRefactorings.setText("Applicable refactorings");
		
		listRefactorings = new TableViewer(composite_1, SWT.BORDER);
		Table table = listRefactorings.getTable();
		table.setHeaderVisible(true);
		listRefactorings.setColumnProperties(new String[] {"Name", "URI"});
		GridData gd_listMetamodels = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
		gd_listMetamodels.heightHint = 150;
		gd_listMetamodels.widthHint = 0;
		listRefactorings.getTable().setLayoutData(gd_listMetamodels);
		managedForm.getToolkit().adapt(listRefactorings.getTable(), true, true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(listRefactorings, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(listRefactorings, SWT.NONE);
		TableColumn tblclmnExplanation = tableViewerColumn_1.getColumn();
		tblclmnExplanation.setWidth(100);
		tblclmnExplanation.setText("Explanation");
		listRefactorings.setLabelProvider(new RefactoringListProvider());
		listRefactorings.setContentProvider(new RefactoringListProvider());
				
				Button btnApplySelected = managedForm.getToolkit().createButton(composite_1, "Apply selected", SWT.NONE);
				new Label(composite_1, SWT.NONE);
				
				Button btnApplyAll = managedForm.getToolkit().createButton(composite_1, "Apply all", SWT.NONE);
				btnApplyAll.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
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
				
				Label lblConceptMetamodelFile = managedForm.getToolkit().createLabel(compAtlFile, "Metamodel file: ", SWT.NONE);
				
				txtConceptMetamodelFile = managedForm.getToolkit().createText(compAtlFile, "", SWT.NONE);
				GridData gd_txtConceptMetamodelFile = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				gd_txtConceptMetamodelFile.minimumWidth = 200;
				gd_txtConceptMetamodelFile.heightHint = 19;
				gd_txtConceptMetamodelFile.widthHint = 0;
				txtConceptMetamodelFile.setLayoutData(gd_txtConceptMetamodelFile);
				
				Button btnBrowse = managedForm.getToolkit().createButton(compAtlFile, "Browse...", SWT.NONE);
				btnBrowse.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						showBrowseAtlFileDialog();
					}
				});
				sashForm.setWeights(new int[] {1, 1});
				
				Section sctnConcept = managedForm.getToolkit().createSection(sashForm_1, Section.TWISTIE | Section.TITLE_BAR);
				managedForm.getToolkit().paintBordersFor(sctnConcept);
				sctnConcept.setText("Concept");
				sctnConcept.setExpanded(true);
				
				Composite composite_3 = managedForm.getToolkit().createComposite(sctnConcept, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_3);
				sctnConcept.setClient(composite_3);
				composite_3.setLayout(new GridLayout(1, false));
				
				TreeViewer treeViewer = new TreeViewer(composite_3, SWT.BORDER);
				Tree tree = treeViewer.getTree();
				GridData gd_tree = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
				gd_tree.heightHint = 100;
				tree.setLayoutData(gd_tree);
				managedForm.getToolkit().paintBordersFor(tree);
		sashForm_1.setWeights(new int[] {1, 1});
		toolkit.decorateFormHeading(form.getForm());
		m_bindingContext = initDataBindings();
		

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
		getManagedForm().dirtyStateChanged();
		isDirtyPage = true;
	}

	//
	// Event handlers
	//
	
	protected void findNewRefactorings() {
		List<MatchInfo> matches = manager.findRefactorings(this.metamodel);
		listRefactorings.setInput(matches);
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
		
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtConceptMetamodelFileObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtConceptMetamodelFile);
		IObservableValue metamodelPathObserveValue = EMFProperties.value(FeaturePath.fromList(Literals.METAMODEL__EXTRACTED_CONCEPT, Literals.RESOURCE__PATH)).observe(metamodel);
		bindingContext.bindValue(observeTextTxtConceptMetamodelFileObserveWidget, metamodelPathObserveValue, null, null);
		//
		return bindingContext;
	}
	
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
				return info.getRefactoring();
			default:
				break;
			}
			return "";
		}
	}
}
