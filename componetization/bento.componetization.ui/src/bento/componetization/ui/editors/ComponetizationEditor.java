package bento.componetization.ui.editors;


import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.ui.*;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.ide.IDE;

import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;
import bento.componetization.reveng.RevengPackage;
import bento.componetization.ui.RevengProcessManager;
import bento.componetization.ui.WorkspaceLogger;
import bento.componetization.ui.forms.TransformationConfigurationPage;

/**
 * An example showing how to create a multi-page editor.
 * This example has 3 pages:
 * <ul>
 * <li>page 0 contains a nested text editor.
 * <li>page 1 allows you to change the font used in page 2
 * <li>page 2 shows the words in page 0 in sorted order
 * </ul>
 */
public class ComponetizationEditor extends FormEditor {

	private TransformationConfigurationPage configurationPage;
	private RevengProcessManager manager;
	
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		FileEditorInput fei = (FileEditorInput) input;

		ResourceSetImpl rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(RevengPackage.eINSTANCE.getNsURI(), RevengFactory.eINSTANCE);
		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(fei.getFile().getFullPath().toString(), true);
		Resource resource;
		try {
			resource = rs.getResource(uri, true);
		} catch ( Exception e ) {
			resource = rs.createResource(uri);
			RevengModel m = RevengFactory.eINSTANCE.createRevengModel();
			resource.getContents().add(m);
		}
		
		manager = new RevengProcessManager(resource, fei.getPath());
	}
	
	@Override
	protected void addPages() {
		try {	
			configurationPage = new TransformationConfigurationPage(this, "conf", manager);
			addPage(configurationPage);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			manager.save();
			configurationPage.saved();
		} catch (IOException e) {
			WorkspaceLogger.generateLogEntry(IStatus.ERROR, e);
		}
	}

	@Override
	public void doSaveAs() {
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
}
