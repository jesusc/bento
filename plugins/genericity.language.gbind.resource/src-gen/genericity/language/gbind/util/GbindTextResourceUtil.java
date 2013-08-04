/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.util;

/**
 * Class GbindTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * genericity.language.gbind.util.GbindResourceUtil.
 */
public class GbindTextResourceUtil {
	
	/**
	 * Use genericity.language.gbind.util.GbindResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gbind.mopp.GbindResource getResource(org.eclipse.core.resources.IFile file) {
		return new genericity.language.gbind.util.GbindEclipseProxy().getResource(file);
	}
	
	/**
	 * Use genericity.language.gbind.util.GbindResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gbind.mopp.GbindResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return genericity.language.gbind.util.GbindResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use genericity.language.gbind.util.GbindResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gbind.mopp.GbindResource getResource(org.eclipse.emf.common.util.URI uri) {
		return genericity.language.gbind.util.GbindResourceUtil.getResource(uri);
	}
	
	/**
	 * Use genericity.language.gbind.util.GbindResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gbind.mopp.GbindResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return genericity.language.gbind.util.GbindResourceUtil.getResource(uri, options);
	}
	
}
