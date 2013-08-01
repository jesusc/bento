/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IGcomponentResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessor getResourcePostProcessor();
	
}
