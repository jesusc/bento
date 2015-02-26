/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IBentoResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public bento.language.bentocomp.resource.bento.IBentoTextResource getResource();
	
}
