/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IGbindResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public genericity.language.gbind.IGbindResourcePostProcessor getResourcePostProcessor();
	
}
