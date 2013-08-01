package genericity.components.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ExportAtlXMI  implements IObjectActionDelegate {

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
		//ResourceSet rs = new ResourceSetImpl();
		//Resource r = rs.getResource(URI.createPlatformResourceURI(f.getFullPath().toPortableString(), true), true);

		ModelFactory modelFactory = new EMFModelFactory();
		
		IReferenceModel atlMetamodel;
		try {
			atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
			IModel atlModel = modelFactory.newModel(atlMetamodel);
			AtlParser atlParser = new AtlParser();
			
			String srcFile = f.getLocation().toPortableString();
			atlParser.inject(atlModel, srcFile);
			
			atlModel.setIsTarget(true);
			
			String injectedFile = "file:/" + srcFile + ".xmi";
			IExtractor extractor = new EMFExtractor();
			extractor.extract(atlModel, injectedFile);
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //$NON-NLS-1$

		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
			this.selection = selection;
	}


}
