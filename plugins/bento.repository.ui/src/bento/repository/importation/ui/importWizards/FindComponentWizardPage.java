package bento.repository.importation.ui.importWizards;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

import bento.repository.ComponentMetadata;
import bento.repository.rest.RemoteRepositoryAccess;

public class FindComponentWizardPage extends WizardPage {
	private Text txtTags;
	private Text txtComponentName;
	private Text txtMetamodels;
	private TreeViewer treeViewer;
	private Tree tree;

	/**
	 * Create the wizard.
	 */
	public FindComponentWizardPage() {
		super("wizardPage");
		setTitle("Find components");
		setDescription("Use tags or possible component names to search the repository.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		SashForm sashForm = new SashForm(container, SWT.NONE);
		
		Group grpSearch = new Group(sashForm, SWT.NONE);
		grpSearch.setText(" Search ");
		grpSearch.setLayout(new GridLayout(2, false));
		new Label(grpSearch, SWT.NONE);
		new Label(grpSearch, SWT.NONE);
		
		Label lblNewLabel = new Label(grpSearch, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Name:");
		
		txtComponentName = new Text(grpSearch, SWT.BORDER);
		txtComponentName.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		
		Label lblTags = new Label(grpSearch, SWT.NONE);
		lblTags.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTags.setText("Tags:");
		
		txtTags = new Text(grpSearch, SWT.BORDER);
		txtTags.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblMetamodels = new Label(grpSearch, SWT.NONE);
		lblMetamodels.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMetamodels.setText("Metamodels:");
		
		txtMetamodels = new Text(grpSearch, SWT.BORDER);
		txtMetamodels.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(grpSearch, SWT.NONE);
		
		Composite composite = new Composite(grpSearch, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		RowLayout rl_composite = new RowLayout(SWT.HORIZONTAL);
		composite.setLayout(rl_composite);
		
		Button btnGetAll = new Button(composite, SWT.NONE);
		btnGetAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getAllComponents();
			}
		});
		btnGetAll.setText("Get all");
		
		Button btnSearch = new Button(composite, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				searchComponents();
			}
		});
		btnSearch.setText("Search");
		
		Group grpResult = new Group(sashForm, SWT.NONE);
		grpResult.setText(" Result ");
		grpResult.setLayout(new GridLayout(1, false));
		
		treeViewer = new TreeViewer(grpResult, SWT.BORDER);
		tree = treeViewer.getTree();
		GridData gd_tree = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_tree.widthHint = 279;
		tree.setLayoutData(gd_tree);
		sashForm.setWeights(new int[] {1, 1});
	}

	protected void searchComponents() {
		ImportFromRepositoryWizard wizard = (ImportFromRepositoryWizard) getWizard();
		String url = wizard.selectRepo.getURL();
		
		String componentName = this.txtComponentName.getText();
		String tags = this.txtTags.getText();
		
		if ( componentName != null && componentName.trim().isEmpty() ) {
			componentName = null;
		}
		
		if ( tags != null && tags.trim().isEmpty() ) {
			tags = null;
		}
		
		final List<ComponentMetadata> components = RemoteRepositoryAccess.searchComponents(url, componentName, tags);
		fillTreeViewer(components);
	}

	protected void getAllComponents() {
		ImportFromRepositoryWizard wizard = (ImportFromRepositoryWizard) getWizard();
		String url = wizard.selectRepo.getURL();
		
		
		final List<ComponentMetadata> components = RemoteRepositoryAccess.getAllComponents(url);
		
		fillTreeViewer(components);
		
	}

	private void fillTreeViewer(final List<ComponentMetadata> components) {
		treeViewer.setContentProvider(new ITreeContentProvider() {
			
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }
			
			@Override
			public void dispose() { }
			
			@Override
			public Object[] getElements(Object inputElement) {
				return getChildren(inputElement);			}

			@Override
			public Object[] getChildren(Object parentElement) {
				if ( parentElement instanceof List ) {
					return ((List<Object>) parentElement).toArray();
				} else if ( parentElement instanceof ComponentMetadata ) {
					ComponentMetadata c = (ComponentMetadata) parentElement;
					
					return new String[] {
						"version: " + c.getVersion(),
						"tags: " + c.getTags().stream().collect(Collectors.joining(","))
					};
 				}
				return null;

			}

			@Override
			public Object getParent(Object element) {
				return components;
			}

			@Override
			public boolean hasChildren(Object element) {
				Object[] children = getChildren(element);
				return children != null && children.length > 0;
			}
		});
		
		treeViewer.setLabelProvider(new ILabelProvider() {

			@Override
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub
				
			}

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
			public Image getImage(Object element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getText(Object element) {
				if ( element instanceof ComponentMetadata ) {
					return ((ComponentMetadata) element).getName();
				}
				return element.toString();
			}
			
		});
		
		treeViewer.setInput(components);
		treeViewer.refresh();
	}
	
	// API
	
	public String getSelectedComponent() {
		TreeSelection s = (TreeSelection) treeViewer.getSelection();
		return ((ComponentMetadata) s.getFirstElement()).getName();
	}
}
