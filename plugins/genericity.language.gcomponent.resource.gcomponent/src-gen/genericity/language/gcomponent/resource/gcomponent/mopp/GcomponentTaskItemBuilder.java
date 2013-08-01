/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * The GcomponentTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class GcomponentTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItem> taskItems = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItem>();
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItemDetector taskItemDetector = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = genericity.language.gcomponent.resource.gcomponent.util.GcomponentStreamUtil.getContent(inputStream);
			genericity.language.gcomponent.resource.gcomponent.IGcomponentTextScanner lexer = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation().createLexer();
			lexer.setText(content);
			
			genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.logError("Exception while searching for task items", e);
		}
		
		for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
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
