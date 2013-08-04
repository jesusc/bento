package genericity.components.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class ImportAtlXMI implements IObjectActionDelegate {

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
		ModelFactory modelFactory = new EMFModelFactory();

		try {
			IReferenceModel atlMetamodel = modelFactory
					.getBuiltInResource("ATL.ecore"); //$NON-NLS-1$
			IModel atlModel = modelFactory.newModel(atlMetamodel);

			String srcXmiFile = "file:/" + f.getLocation().toPortableString();
			EMFInjector injector = new EMFInjector();
			injector.inject(atlModel, srcXmiFile);
			
			// String injectedFile = "file:/" + srcXmiFile + ".xmi";
			String extractedFile = srcXmiFile.replace(".xmi", "");
			if (!extractedFile.endsWith(".atl"))
				extractedFile = extractedFile + ".atl";

			// String extractedFile = outputPath + File.separator + file + ".atl";
			AtlParser atlParser = new AtlParser();
			atlParser.extract(atlModel, extractedFile);
		} catch (ATLCoreException e) {
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
