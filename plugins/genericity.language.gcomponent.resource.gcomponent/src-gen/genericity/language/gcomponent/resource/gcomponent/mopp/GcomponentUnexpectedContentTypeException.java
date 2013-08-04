/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.RESOURCE_C
 * ONTENT_TYPE
 */
public class GcomponentUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  GcomponentUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
