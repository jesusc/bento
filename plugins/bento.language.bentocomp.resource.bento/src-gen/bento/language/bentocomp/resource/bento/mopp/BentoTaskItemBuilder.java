/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * The BentoTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class BentoTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new bento.language.bentocomp.resource.bento.mopp.BentoMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<bento.language.bentocomp.resource.bento.mopp.BentoTaskItem> taskItems = new java.util.ArrayList<bento.language.bentocomp.resource.bento.mopp.BentoTaskItem>();
		bento.language.bentocomp.resource.bento.mopp.BentoTaskItemDetector taskItemDetector = new bento.language.bentocomp.resource.bento.mopp.BentoTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = bento.language.bentocomp.resource.bento.util.BentoStreamUtil.getContent(inputStream);
			bento.language.bentocomp.resource.bento.IBentoTextScanner lexer = new bento.language.bentocomp.resource.bento.mopp.BentoMetaInformation().createLexer();
			lexer.setText(content);
			
			bento.language.bentocomp.resource.bento.IBentoTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			bento.language.bentocomp.resource.bento.mopp.BentoPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			bento.language.bentocomp.resource.bento.mopp.BentoPlugin.logError("Exception while searching for task items", e);
		}
		
		for (bento.language.bentocomp.resource.bento.mopp.BentoTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new bento.language.bentocomp.resource.bento.mopp.BentoMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
