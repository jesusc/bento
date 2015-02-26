/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IBentoResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public bento.language.bentocomp.resource.bento.IBentoResourcePostProcessor getResourcePostProcessor();
	
}
