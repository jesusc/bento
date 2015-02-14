package genericity.compiler.atl.api;

import genericity.language.gcomponent.core.CompositeComponent;

public interface AdaptationResult {

	/**
	 * Sets the component for which another component will be ultimately
	 * adapted.
	 * 
	 * @param topComposite
	 */
	void setAdapterFor(CompositeComponent topComposite);
	
	void exportToFileSystem(FilePathResolver resolver);

}
