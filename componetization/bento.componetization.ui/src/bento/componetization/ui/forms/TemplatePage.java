package bento.componetization.ui.forms;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.wb.swt.SWTResourceManager;

import anatlyzer.atl.errors.Problem;
import anatlyzer.atl.errors.SeverityKind;
import anatlyzer.atl.errors.atl_error.LocalProblem;
import bento.componetization.reveng.AtlTransformation;
import bento.componetization.reveng.RevengModel;
import bento.componetization.ui.RevengProcessManager;
import bento.componetization.ui.TypingInfo;

public class TemplatePage extends FormPage {
	private DataBindingContext m_bindingContext;
	
	private RevengModel revengModel;
	private AtlTransformation atlTransformation;

	boolean isDirtyPage = false;
	private RevengProcessManager manager;
	public static final String ID = "TemplatePage";
	private TableViewer analysisTableViewer;
	private TypingInfo typingInfo;
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TemplatePage(FormEditor editor, RevengProcessManager manager) {
		super(editor, ID, "Template");
		this.manager     = manager;
		this.revengModel = manager.getModel();
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
		form.setText("Transformation template");
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.VERTICAL));
		
		SashForm sashForm = new SashForm(managedForm.getForm().getBody(), SWT.NONE);
		managedForm.getToolkit().adapt(sashForm);
		managedForm.getToolkit().paintBordersFor(sashForm);
		
		Section sctnTransformation = managedForm.getToolkit().createSection(sashForm, Section.TWISTIE | Section.TITLE_BAR);
		managedForm.getToolkit().paintBordersFor(sctnTransformation);
		sctnTransformation.setText("Analysis result");
		sctnTransformation.setExpanded(true);
		
		Composite composite = managedForm.getToolkit().createComposite(sctnTransformation, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		managedForm.getToolkit().paintBordersFor(composite);
		sctnTransformation.setClient(composite);
		composite.setLayout(new GridLayout(2, false));
		sashForm.setWeights(new int[] {1});
		toolkit.decorateFormHeading(form.getForm());
		m_bindingContext = initDataBindings();
		
		analysisTableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		Table analysisMessagesTable = analysisTableViewer.getTable();
		analysisMessagesTable.setHeaderVisible(true);
		analysisMessagesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 2, 1));
		managedForm.getToolkit().paintBordersFor(analysisMessagesTable);
		
		TableColumn tblclmnType = new TableColumn(analysisMessagesTable, SWT.NONE);
		tblclmnType.setWidth(42);
		tblclmnType.setText("Type");
		
		TableColumn tblclmnMessage = new TableColumn(analysisMessagesTable, SWT.NONE);
		tblclmnMessage.setWidth(243);
		tblclmnMessage.setText("Message");
		
		TableColumn tblclmnLocation = new TableColumn(analysisMessagesTable, SWT.NONE);
		tblclmnLocation.setWidth(50);
		tblclmnLocation.setText("Location");
		analysisTableViewer.setLabelProvider(new AnalysisListProvider());
		analysisTableViewer.setContentProvider(new AnalysisListProvider());
		if ( typingInfo != null )
			analysisTableViewer.setInput(typingInfo);
		
		Hyperlink hprlnkApplyTyping = managedForm.getToolkit().createHyperlink(composite, "Apply analysis", SWT.NONE);
		managedForm.getToolkit().paintBordersFor(hprlnkApplyTyping);
		
		Hyperlink hprlnkOpenTemplate = managedForm.getToolkit().createHyperlink(composite, "Open template", SWT.NONE);
		hprlnkOpenTemplate.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				openAtlEditor();
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		hprlnkOpenTemplate.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().paintBordersFor(hprlnkOpenTemplate);
		
		
		// My initializations
		myInitializations();
	}

	private void myInitializations() {
	}

	private void markAsDirty() {
		isDirtyPage = true;
		getManagedForm().dirtyStateChanged();
	}

	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		return bindingContext;
	}

	
	public void setTypingInfo(TypingInfo info) {
		if ( analysisTableViewer != null ) {
			analysisTableViewer.setInput(info);
			analysisTableViewer.refresh();
		}

		this.typingInfo = info;
	}

	///
	/// Handlers
	///

	protected void openAtlEditor() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();;
		IFile file = manager.getTemplateFile();
		IEditorDescriptor desc = PlatformUI.getWorkbench().
		        getEditorRegistry().getDefaultEditor(file.getName());
		try {
			page.openEditor(new FileEditorInput(file), desc.getId());
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
	/**
	 * 
	 * @author jesus
	 *
	 */
	public class AnalysisListProvider implements ITableLabelProvider, IStructuredContentProvider {
		
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if ( typingInfo == null )
				return new Object[] { };

			return typingInfo.getMessages().toArray();
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
			Problem err = (Problem) element;
			switch (columnIndex) {
			case 0:
				return err.getSeverity() == SeverityKind.ERROR ? "Error" : "Warning";
			case 1:
				return err.getDescription();
			case 2:
				return err instanceof LocalProblem ? ((LocalProblem) err).getLocation() : "-";
			}
			return null;
		}		
	}
	
	
}
