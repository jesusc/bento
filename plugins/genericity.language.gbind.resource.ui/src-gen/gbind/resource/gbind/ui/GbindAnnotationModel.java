/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

public class GbindAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel {
	
	public GbindAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new gbind.resource.gbind.ui.GbindMarkerAnnotation(marker);
	}
	
}
