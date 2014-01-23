
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Module extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Unit {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public List<atl.metamodel.ATL.LibraryRef> getLibraries();
	public java.lang.String getName();
	public Boolean getIsRefining();
	public List<atl.metamodel.OCL.OclModel> getInModels();
	public List<atl.metamodel.OCL.OclModel> getOutModels();
	public List<atl.metamodel.ATL.ModuleElement> getElements();

}
