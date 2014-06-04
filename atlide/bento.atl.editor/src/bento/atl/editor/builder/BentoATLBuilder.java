package bento.atl.editor.builder;

import genericity.compiler.atl.analyser.ErrorUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2m.atl.common.AtlNbCharFile;
import org.eclipse.m2m.atl.engine.Messages;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.atl.editor.builder.AnalyserExecutor.AnalyserData;
import bento.atl.editor.problems.MarkerResolutionGenerator;

public class BentoATLBuilder extends IncrementalProjectBuilder {

	class SampleDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkATL(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				checkATL(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkATL(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	public static final String BUILDER_ID = "bento.atl.editor.bentoATLBuilder";

	public static final String MARKER_TYPE = "bento.atl.editor.bentoATLProblem";

	public static final String PROBLEM = "BENTO_PROBLEM";

	public static final String ANALYSIS_DATA = "BENTO_ANALYSIS_DATA";

	/*
	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}
	*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	void checkATL(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".atl")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);
			
			try {
				AnalyserData data = new AnalyserExecutor().exec(resource);
				
				AtlNbCharFile help = new AtlNbCharFile(file.getContents());
				for (Problem problem : data.getNonIgnoredProblems()) {
					addMarker(file, help, data, problem);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// BentoATLBuilder.this.addMarker(file, "An error", 2, IMarker.SEVERITY_ERROR);
			
			
			/*
			XMLErrorHandler reporter = new XMLErrorHandler(file);
			try {
				getParser().parse(file.getContents(), reporter);
			} catch (Exception e1) {
			}
			*/
		}
	}

	private void addMarker(IFile file, AtlNbCharFile help, AnalyserData data, Problem problem) throws CoreException {
		LocalProblem lp = (LocalProblem) problem;
		
		int tabWidth = -1;
		int severity = -1;
		
		severity = IMarker.SEVERITY_ERROR;
		/* UNTIL I HAVE INLINE QUICKFIXES, IT IS EASIER TO ACCESS TO ERRORS THAN WARNINGS
		switch ( problem.getSeverity() ) {
		case ERROR:
			severity = IMarker.SEVERITY_ERROR;
			break;
		case WARNING:
			severity = IMarker.SEVERITY_WARNING;
			break;
		case PERFORMANCE_SUGGESTION:
			severity = IMarker.SEVERITY_INFO;
			break;
		case STYLE_SUGGESTION:
			severity = IMarker.SEVERITY_INFO;
			break;
		}
		*/
		
		
		String description = ErrorUtils.getShortError(lp);
		String location = lp.getLocation();
		String[] parts = location.split("-")[0].split(":"); //$NON-NLS-1$ //$NON-NLS-2$

		int lineNumber = Integer.parseInt(parts[0]);
		int columnNumber = Integer.parseInt(parts[1]);
		int charStart = 0;
		int charEnd = 0;
		try {
			if (location.indexOf('-') == -1) {
				location += '-' + location;
			}
			int[] pos = help.getIndexChar(location, tabWidth);
			charStart = pos[0];
			charEnd = pos[1];

			IMarker pbmMarker = file.createMarker(MARKER_TYPE);
			pbmMarker.setAttribute(PROBLEM, problem);
			pbmMarker.setAttribute(ANALYSIS_DATA, data);
			
			
			// pbmMarker.setAttribute(IMarker.SEVERITY, eclipseSeverity);
			pbmMarker.setAttribute(IMarker.SEVERITY, severity); 
			pbmMarker.setAttribute(IMarker.MESSAGE, description);
			pbmMarker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			pbmMarker.setAttribute(IMarker.LOCATION, Messages.getString("MarkerMaker.LINECOLUMN", //$NON-NLS-1$
					new Object[] {new Integer(lineNumber), new Integer(columnNumber)}));
			pbmMarker.setAttribute(IMarker.CHAR_START, charStart);
			pbmMarker.setAttribute(IMarker.CHAR_END, (charEnd > charStart) ? charEnd : charStart + 1);

			// pbmMarker.setAttribute(MarkerResolutionGenerator.ORIGINAL_PROBLEM, lp);
			
		} catch (Exception e) {
			// description += " [location \"" + location + "\" incorrectly reported because of error]"; //$NON-NLS-1$ //$NON-NLS-2$
			throw new RuntimeException(e);
			//$NON-NLS-1$//$NON-NLS-2$
		}

		// TODO Auto-generated method stub
	
		/*		EPackage pkProblem = null;
		EClass clProblem = null;
		EStructuralFeature sfSeverity = null;
		EStructuralFeature sfLocation = null;
		EStructuralFeature sfDescription = null;

		pkProblem = problem.eClass().getEPackage();
		clProblem = (EClass)pkProblem.getEClassifier("Problem"); //$NON-NLS-1$
		sfSeverity = clProblem.getEStructuralFeature("severity"); //$NON-NLS-1$
		sfLocation = clProblem.getEStructuralFeature("location"); //$NON-NLS-1$
		sfDescription = clProblem.getEStructuralFeature("description"); //$NON-NLS-1$

		String description = (String)problem.eGet(sfDescription);

		String location = (String)problem.eGet(sfLocation);
		String[] parts = location.split("-")[0].split(":"); //$NON-NLS-1$ //$NON-NLS-2$
		int lineNumber = Integer.parseInt(parts[0]);
		int columnNumber = Integer.parseInt(parts[1]);
		int charStart = 0;
		int charEnd = 0;
		try {
			if (location.indexOf('-') == -1) {
				location += '-' + location;
			}
			int[] pos = help.getIndexChar(location, tabWidth);
			charStart = pos[0];
			charEnd = pos[1];
		} catch (Exception e) {
			description += " [location \"" + location + "\" incorrectly reported because of error]"; //$NON-NLS-1$ //$NON-NLS-2$
			//$NON-NLS-1$//$NON-NLS-2$
		}

		String severity = ((EEnumLiteral)problem.eGet(sfSeverity)).getName();
		int eclipseSeverity = ((Integer)severities.get(severity)).intValue();

		try {
			IMarker pbmMarker = res.createMarker(PROBLEM_MARKER);
			pbmMarker.setAttribute(IMarker.SEVERITY, eclipseSeverity);
			pbmMarker.setAttribute(IMarker.MESSAGE, description);
			pbmMarker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			pbmMarker.setAttribute(IMarker.LOCATION, Messages.getString("MarkerMaker.LINECOLUMN", //$NON-NLS-1$
					new Object[] {new Integer(lineNumber), new Integer(columnNumber)}));
			pbmMarker.setAttribute(IMarker.CHAR_START, charStart);
			pbmMarker.setAttribute(IMarker.CHAR_END, (charEnd > charStart) ? charEnd : charStart + 1);
			*/
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor());
		} catch (CoreException e) {
		}
	}

	/*
	private SAXParser getParser() throws ParserConfigurationException,
			SAXException {
		if (parserFactory == null) {
			parserFactory = SAXParserFactory.newInstance();
		}
		return parserFactory.newSAXParser();
	}
	*/

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor());
	}
}
