package bento.repository.local;

import bento.language.bentocomp.core.Component;

public interface FilePathResolver {

//	public String getInitialPath();
//	public String createFileNameFromInitial(String relativePath);

	/** 
	 * Given a filename or a uri, returns a proper path according to the
	 * implementation technology. For instance, for plain Java would be
	 * absolute path and for Eclipse would be a project relative path (e.g., platform:/resource/...)
	 * 
	 * @param file
	 * @return
	 */
	public String resolveTransformation(Component context, String file);

	/**
	 * Returns the path where the adaptation of "adapted" will be serialized.
	 * The context in which the adaptation happens is another component that
	 * is using "adapted"
	 * 
	 * @param context
	 * @param adapted
	 * @return
	 */
	public String createPlaceForAdaptation(Component context, Component adapted);

}
