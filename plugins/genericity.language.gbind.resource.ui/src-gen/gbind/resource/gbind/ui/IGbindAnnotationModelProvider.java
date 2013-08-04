/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

/**
 * A provider for annotation models.
 */
public interface IGbindAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel();
	
}
