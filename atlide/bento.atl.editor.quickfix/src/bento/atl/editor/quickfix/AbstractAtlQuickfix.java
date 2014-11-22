package bento.atl.editor.quickfix;

import java.io.ByteArrayInputStream;

import javax.swing.text.Document;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.m2m.atl.common.AtlNbCharFile;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.CollectionOperationCallExp;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.atl.editor.builder.BentoATLBuilder;
import bento.atl.editor.builder.AnalyserExecutor.AnalyserData;

public abstract class AbstractAtlQuickfix implements AtlProblemQuickfix {

	protected IMarker marker;
	
	public void setErrorMarker(IMarker marker) {		
		this.marker = marker;
	}

	protected int getProblemStartOffset() throws CoreException {
		return (Integer) marker.getAttribute(IMarker.CHAR_START);
	}
	
	protected int getProblemEndOffset() throws CoreException {
		return (Integer) marker.getAttribute(IMarker.CHAR_END);
	}
	
	protected LocalProblem getProblem() throws CoreException {
		LocalProblem problem = (LocalProblem) marker.getAttribute(BentoATLBuilder.PROBLEM);
		return problem;
	}

	protected ATLModelBaseObject getWrapper(EObject atlElement) throws CoreException {
		AnalyserData analysisData = (AnalyserData) marker.getAttribute(BentoATLBuilder.ANALYSIS_DATA);
		return analysisData.getAnalyser().getATLModel().findWrapper(atlElement);
	}

	protected int[] getElementOffset(LocatedElement obj, IDocument document) {
		AtlNbCharFile help = new AtlNbCharFile(new ByteArrayInputStream(document.get().getBytes()));
		return help.getIndexChar(obj.getLocation());
	}
	
	
	public IFile getATLFile() {
		IWorkbenchWindow window= PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		IEditorInput input = editor.getEditorInput();
		if (!(input instanceof IFileEditorInput))
			throw new IllegalStateException();
		
		IFile file = ((IFileEditorInput)input).getFile();
		return file;
	}
	
	protected String getProjectPath() {
	    return getATLFile().getProject().getLocation().toOSString();
	}


}
