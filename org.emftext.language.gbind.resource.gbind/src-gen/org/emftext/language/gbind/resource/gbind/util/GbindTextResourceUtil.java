/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.util;

/**
 * Class GbindTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.emftext.language.gbind.resource.gbind.util.GbindResourceUtil.
 */
public class GbindTextResourceUtil {
	
	@Deprecated	
	public static org.emftext.language.gbind.resource.gbind.mopp.GbindResource getResource(org.eclipse.core.resources.IFile file) {
		return org.emftext.language.gbind.resource.gbind.util.GbindResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static org.emftext.language.gbind.resource.gbind.mopp.GbindResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.emftext.language.gbind.resource.gbind.util.GbindResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static org.emftext.language.gbind.resource.gbind.mopp.GbindResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.emftext.language.gbind.resource.gbind.util.GbindResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static org.emftext.language.gbind.resource.gbind.mopp.GbindResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.emftext.language.gbind.resource.gbind.util.GbindResourceUtil.getResource(uri, options);
	}
	
}
