package genericity.components.ui.popup.actions;

import genericity.language.gcomponent.dsl.DefinitionRoot;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.dsls.DSLResourceProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ExportGComponentXMI implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;
	

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {	
		IFile f = (IFile) ((IStructuredSelection) selection).getFirstElement();
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createPlatformResourceURI(f.getFullPath().toPortableString(), true), true);

		String dest = f.getFullPath().toPortableString() + ".xmi";
		Resource target = rs.createResource(URI.createPlatformResourceURI(dest, true));

		DefinitionRoot mainRoot = (DefinitionRoot) r.getContents().get(0);
		
		TreeIterator<Object> it = EcoreUtil.getAllContents(rs, true);
		while ( it.hasNext() ) {
			Object obj = it.next();
			// In addition to EObject, the iterator returns Resource's...
			if ( obj instanceof EObject ) {
				EObject o = (EObject) obj;
				if ( o.eContainer() instanceof DefinitionRoot && o.eContainer() != mainRoot ) {
					target.getContents().add(o);
				}
			}
		}

		target.getContents().add(mainRoot);

		System.out.println("------------> ");
		System.out.println(target.getContents());
		
		try {
			target.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}


}
