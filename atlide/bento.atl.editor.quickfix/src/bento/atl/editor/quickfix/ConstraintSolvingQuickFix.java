package bento.atl.editor.quickfix;

import genericity.compiler.atl.csp.CSPGenerator;
import genericity.compiler.atl.graph.ErrorPathGenerator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import witness.generator.WitnessGeneratorMemory;
import bento.analysis.atl_analysis.Problem;
import bento.atl.editor.AtlEclipseLoader;
import bento.atl.editor.builder.AnalyserExecutor.AnalyserData;
import bento.atl.editor.builder.BentoATLBuilder;

public class ConstraintSolvingQuickFix implements AtlProblemQuickfix {

	private IMarker errorMarker;

	public void setErrorMarker(IMarker marker) {		
		this.errorMarker = marker;
	}
	
	@Override
	public void apply(IDocument document) {

		try {
			Problem problem = (Problem) errorMarker.getAttribute(BentoATLBuilder.PROBLEM);
			AnalyserData analysisData = (AnalyserData) errorMarker.getAttribute(BentoATLBuilder.ANALYSIS_DATA);
			
			analysisData.computeProblemGraph(problem);

			EPackage errorSlice = analysisData.generateErrorSlice(problem);
			EPackage effective  = analysisData.generateEffectiveMetamodel(problem);
			EPackage language   = analysisData.getSourceMetamodel();
			
			String projectPath = getProjectPath();
			
			String constraint = new CSPGenerator(null, null, new AtlEclipseLoader()).generateCSP(analysisData.getPath());
			
			WitnessGeneratorMemory generator = new WitnessGeneratorMemory(errorSlice, effective, language, constraint);
			generator.setTempDirectoryPath(projectPath);
			if ( ! generator.generate() ) {
				MessageDialog.openInformation(null, "Constraint solving", "Not witness model could be found");
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	private String getProjectPath() {
		IWorkbenchWindow window= PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
	    IEditorInput input = editor.getEditorInput();
	    if (!(input instanceof IFileEditorInput))
	    	throw new IllegalStateException();
	    
	    IFile file = ((IFileEditorInput)input).getFile();
	    return file.getProject().getLocation().toOSString();
	}



	@Override
	public Point getSelection(IDocument document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAdditionalProposalInfo() {
		return "Generate witness with USE";
	}

	@Override
	public String getDisplayString() {
		return "Generate witness";
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContextInformation getContextInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
