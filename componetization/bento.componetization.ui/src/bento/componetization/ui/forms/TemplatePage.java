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
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;

public class TemplatePage extends FormPage {
	private DataBindingContext m_bindingContext;
	private Text txtAtlFile;
	
	private RevengModel revengModel;
	private AtlTransformation atlTransformation;

	boolean isDirtyPage = false;
	private RevengProcessManager manager;
	private Table table_1;
	public static final String ID = "TemplatePage";
	
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
		sctnTransformation.setText("Template");
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
				
				Section sctnProcess = managedForm.getToolkit().createSection(sashForm, Section.TWISTIE | Section.TITLE_BAR);
				managedForm.getToolkit().paintBordersFor(sctnProcess);
				sctnProcess.setText("Analysis result");
				sctnProcess.setExpanded(true);
				
				Composite composite_2 = managedForm.getToolkit().createComposite(sctnProcess, SWT.NONE);
				managedForm.getToolkit().paintBordersFor(composite_2);
				sctnProcess.setClient(composite_2);
				composite_2.setLayout(new GridLayout(1, false));
				
				TableViewer tableViewer = new TableViewer(composite_2, SWT.BORDER | SWT.FULL_SELECTION);
				table_1 = tableViewer.getTable();
				table_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
				managedForm.getToolkit().paintBordersFor(table_1);
				
				Hyperlink hprlnkApplyAnalysisAgain = managedForm.getToolkit().createHyperlink(composite_2, "Apply analysis again", SWT.NONE);
				managedForm.getToolkit().paintBordersFor(hprlnkApplyAnalysisAgain);
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
		isDirtyPage = true;
		getManagedForm().dirtyStateChanged();
	}

	
	//
	// Event handling
	//
	protected void changeTransformationText() {
		this.revengModel.getTransformation().setPath( txtAtlFile.getText() );
		
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
		txtAtlFile.setText( r.getFullPath().toPortableString() );
	}	
	
	
	
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
		IObservableValue observeTextTxtAtlFileObserveWidget_1 = WidgetProperties.text(SWT.Modify).observe(txtAtlFile);
		IObservableValue revengModelPathObserveValue = EMFProperties.value(FeaturePath.fromList(Literals.REVENG_MODEL__TEMPLATE, Literals.TRANSFORMATION__PATH)).observe(revengModel);
		bindingContext.bindValue(observeTextTxtAtlFileObserveWidget_1, revengModelPathObserveValue, null, null);
		//
		return bindingContext;
	}
}
