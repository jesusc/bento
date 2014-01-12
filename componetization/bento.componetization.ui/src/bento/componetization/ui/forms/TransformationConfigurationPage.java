package bento.componetization.ui.forms;

import java.util.ArrayList;

import org.eclipse.core.internal.resources.Resource;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
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
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import swing2swt.layout.FlowLayout;
import org.eclipse.wb.swt.SWTResourceManager;

import bento.componetization.reveng.AtlTransformation;
import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;
import bento.componetization.ui.Activator;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.emf.databinding.EMFObservables;
import bento.componetization.reveng.RevengPackage.Literals;

public class TransformationConfigurationPage extends FormPage {
	private DataBindingContext m_bindingContext;
	private Text txtAtlFile;
	
	private RevengModel revengModel;
	private AtlTransformation atlTransformation;

	boolean isDirtyPage = false;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TransformationConfigurationPage(String id, RevengModel m) {
		super(id, "Transformation configuration");
		this.revengModel = m;

/*
		EMFObservables.observeValue(m, Literals.REVENG_MODEL__TRANSFORMATION).addChangeListener(new IChangeListener() {			
			@Override
			public void handleChange(ChangeEvent event) {
				getManagedForm().dirtyStateChanged();
				isDirtyPage = true;
				System.out.println("----------> CHANGE EVENT");
			}
		});


		EMFObservables.observeValue(m, Literals.REVENG_MODEL__TRANSFORMATION).addChangeListener(new IChangeListener() {			
			@Override
			public void handleChange(ChangeEvent event) {
				getManagedForm().dirtyStateChanged();
				isDirtyPage = true;
				System.out.println("----------> CHANGE value");

			}
		});
*/		
		// getManagedForm().dirtyStateChanged();
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
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public TransformationConfigurationPage(FormEditor editor, String id, RevengModel m) {
		super(editor, id, "Transformation configuration");
		this.revengModel = m;
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
		
		Section sctnTransformation = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
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
		
		List listMetamodels = new List(composite_1, SWT.BORDER);
		GridData gd_listMetamodels = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3);
		gd_listMetamodels.heightHint = 150;
		gd_listMetamodels.widthHint = 0;
		listMetamodels.setLayoutData(gd_listMetamodels);
		managedForm.getToolkit().adapt(listMetamodels, true, true);
		
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
		btnRemove.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		toolkit.decorateFormHeading(form.getForm());
		m_bindingContext = initDataBindings();
	}

	
	//
	// Event handling
	//
	
	protected void addMetamodel() {
		MetamodelInfoDialog dialog = new MetamodelInfoDialog(this.getSite().getShell());
		dialog.open();
		System.out.println(dialog.getFirstName());
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
	public void setIsModifiedForm() {
		 getManagedForm().dirtyStateChanged();
	}
	*/
	
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
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new TextToTransformationConverter());
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new TransformationToTextConverter());
		bindingContext.bindValue(observeTextTxtAtlFileObserveWidget, revengModelTransformationObserveValue, strategy, strategy_1);
		//
		
		revengModelTransformationObserveValue.addValueChangeListener(new IValueChangeListener() {
			
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				getManagedForm().dirtyStateChanged();
				isDirtyPage = true;
			}
		});
		
		return bindingContext;
	}

}
