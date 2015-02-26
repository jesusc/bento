/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.util;

/**
 * Class BentoTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * bento.language.bentocomp.resource.bento.util.BentoResourceUtil.
 */
public class BentoTextResourceUtil {
	
	/**
	 * Use
	 * bento.language.bentocomp.resource.bento.util.BentoResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static bento.language.bentocomp.resource.bento.mopp.BentoResource getResource(org.eclipse.core.resources.IFile file) {
		return new bento.language.bentocomp.resource.bento.util.BentoEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * bento.language.bentocomp.resource.bento.util.BentoResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static bento.language.bentocomp.resource.bento.mopp.BentoResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return bento.language.bentocomp.resource.bento.util.BentoResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * bento.language.bentocomp.resource.bento.util.BentoResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static bento.language.bentocomp.resource.bento.mopp.BentoResource getResource(org.eclipse.emf.common.util.URI uri) {
		return bento.language.bentocomp.resource.bento.util.BentoResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * bento.language.bentocomp.resource.bento.util.BentoResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static bento.language.bentocomp.resource.bento.mopp.BentoResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return bento.language.bentocomp.resource.bento.util.BentoResourceUtil.getResource(uri, options);
	}
	
}
