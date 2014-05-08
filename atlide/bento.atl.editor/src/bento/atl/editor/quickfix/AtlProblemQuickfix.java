package bento.atl.editor.quickfix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public interface AtlProblemQuickfix extends ICompletionProposal {
	public void setErrorMarker(IMarker marker);
}
