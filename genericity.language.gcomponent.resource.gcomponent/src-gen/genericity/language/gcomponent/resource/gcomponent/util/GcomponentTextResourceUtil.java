/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.util;

/**
 * Class GcomponentTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.
 */
public class GcomponentTextResourceUtil {
	
	/**
	 * Use
	 * genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResource getResource(org.eclipse.core.resources.IFile file) {
		return new genericity.language.gcomponent.resource.gcomponent.util.GcomponentEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResource getResource(org.eclipse.emf.common.util.URI uri) {
		return genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.g
	 * etResource() instead.
	 */
	@Deprecated	
	public static genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return genericity.language.gcomponent.resource.gcomponent.util.GcomponentResourceUtil.getResource(uri, options);
	}
	
}
