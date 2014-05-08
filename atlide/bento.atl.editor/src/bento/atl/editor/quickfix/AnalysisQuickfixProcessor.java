package bento.atl.editor.quickfix;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.quickassist.IQuickAssistProcessor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.texteditor.MarkerAnnotation;

import bento.atl.editor.builder.BentoATLBuilder;


public class AnalysisQuickfixProcessor implements IQuickAssistProcessor {

	private MarkerAnnotation annotation;

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canFix(Annotation annotation) {
		if ( annotation.isMarkedDeleted() )
			return false;
		
		boolean canFix = false;
		MarkerAnnotation markerAnnotation = (MarkerAnnotation) annotation;
		try {
			 canFix = markerAnnotation.getMarker().getType().equals(BentoATLBuilder.MARKER_TYPE);
			 this.annotation = markerAnnotation;
		} catch (CoreException e) { }
		
		return canFix;
	}

	@Override
	public boolean canAssist(IQuickAssistInvocationContext invocationContext) {
		System.out.println(invocationContext);
		
		// TODO Auto-generated method stub
		return false;
	}

	/** See: XtextQuickAssistProcessor */
	@Override
	public ICompletionProposal[] computeQuickAssistProposals(
			IQuickAssistInvocationContext invocationContext) {
		
		ISourceViewer sourceViewer = invocationContext.getSourceViewer();
		if (sourceViewer == null || annotation == null)
			return new ICompletionProposal[0]; 
	
		final IDocument document = sourceViewer.getDocument();
		return getQuickfixes();
		/*
		ICompletionProposal
		
		ConstraintSolvingQuickFix qf = new ConstraintSolvingQuickFix(annotation.getMarker());
		*/
		
		// Reset 
		// annotation = null;
		
		// return new ICompletionProposal[] { qf };
	}
	
	private final String ATL_QUICKFIX_EXTENSION_POINT = "bento.atl.editor.quickfix"; 
	
	private ICompletionProposal[] getQuickfixes() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = registry.getConfigurationElementsFor(ATL_QUICKFIX_EXTENSION_POINT);
		ArrayList<ICompletionProposal> quickfixes = new ArrayList<ICompletionProposal>();
		
		for (IConfigurationElement ce : extensions) {
			AtlProblemQuickfix qf;
			try {
				qf = (AtlProblemQuickfix) ce.createExecutableExtension("apply");
				qf.setErrorMarker(this.annotation.getMarker());
				quickfixes.add(qf);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return (ICompletionProposal[]) quickfixes.toArray(new ICompletionProposal[quickfixes.size()]);
	}

	public class TestCompletion implements ICompletionProposal {

		@Override
		public void apply(IDocument document) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Point getSelection(IDocument document) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getAdditionalProposalInfo() {
			// TODO Auto-generated method stub
			return "testadd";
		}

		@Override
		public String getDisplayString() {
			// TODO Auto-generated method stub
			return "test";
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

}
