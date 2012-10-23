/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IGbindResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public genericity.language.gbind.IGbindTextResource getResource();
	
}
