/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.util;

/**
 * Utility class that provides a method to cast objects to type parameterized
 * classes without a warning.
 */
public class BentoCastUtil {
	
	@SuppressWarnings("unchecked")	
	public static <T> T cast(Object temp) {
		return (T) temp;
	}
}
