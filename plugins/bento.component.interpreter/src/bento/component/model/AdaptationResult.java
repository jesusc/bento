package bento.component.model;

import bento.language.bentocomp.core.CompositeComponent;
import bento.repository.local.FilePathResolver;

public interface AdaptationResult {

	/**
	 * Sets the component for which another component will be ultimately
	 * adapted.
	 * 
	 * @param topComposite
	 */
	void setAdapterFor(CompositeComponent topComposite);
	
	void exportToFileSystem(FilePathResolver resolver);

	String getAdaptedTemplateFileName();

}
