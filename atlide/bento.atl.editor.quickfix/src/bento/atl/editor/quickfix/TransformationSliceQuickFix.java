package bento.atl.editor.quickfix;

import java.io.ByteArrayInputStream;

import genericity.compiler.atl.csp.CSPGenerator;
import genericity.compiler.atl.csp.TransformationSlicer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

import bento.analysis.atl_analysis.Problem;
import bento.atl.editor.AtlEclipseLoader;
import bento.atl.editor.builder.BentoATLBuilder;
import bento.atl.editor.builder.AnalyserExecutor.AnalyserData;

public class TransformationSliceQuickFix extends AbstractAtlQuickfix {


	@Override
	public void apply(IDocument document) {
		try {
			Problem problem = (Problem) marker.getAttribute(BentoATLBuilder.PROBLEM);
			AnalyserData analysisData = (AnalyserData) marker.getAttribute(BentoATLBuilder.ANALYSIS_DATA);

			analysisData.computeProblemGraph(problem);
			
			String trafo = new TransformationSlicer(null, new AtlEclipseLoader()).generateSlice(analysisData.getPath(), analysisData.getAnalyser());
		
			IFile f = getATLFile().getProject().getFile(getATLFile().getProjectRelativePath().removeFileExtension().addFileExtension("slice.atl"));
			if ( f.exists() ) {
				f.setContents(new ByteArrayInputStream(trafo.getBytes()), true, false, null);
			} else {
				f.create(new ByteArrayInputStream(trafo.getBytes()), true, null);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Point getSelection(IDocument document) {
		return null;
	}

	@Override
	public String getAdditionalProposalInfo() {
		return "Slice transformation at error";
	}

	@Override
	public String getDisplayString() {
		return "Slice transformation";
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

	@Override
	public boolean isApplicable(IMarker marker) {
		return true;
	}



}