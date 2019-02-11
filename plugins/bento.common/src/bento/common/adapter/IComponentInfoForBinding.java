package bento.common.adapter;

import java.util.List;

/**
 * This interface represents the information that a component must
 * provide to the binding adaptation process.
 * 
 * @author jesus
 *
 */
public interface IComponentInfoForBinding {
	
	/**
	 * @return the logical name of the meta-model in the ATL template.
	 */
	public String getConceptMetamodelName();
	
	/**
	 * @return The set of bound meta-models.
	 */
	public List<IBoundMetamodelInfo> getBoundMetamodels();	
	
	public static interface IBoundMetamodelInfo {

		/**
		 * @return the logical name of the bound meta-model, that will be replace
		 *         the concept metamodel name.
		 */
		public String getBoundMetamodelName();
		
		/**
		 * @return the URI of the bound meta-model, in the style of ATL (e.g., without platform:/resource)
		 */
		public String getBoundMetamodelURI();		
	}
	
}
