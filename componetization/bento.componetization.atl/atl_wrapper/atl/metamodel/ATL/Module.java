
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Module extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Unit {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(List<java.lang.String> v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(List<java.lang.String> v);
	public List<atl.metamodel.ATL.LibraryRef> getLibraries();

	public void addLibraries(List<atl.metamodel.ATL.LibraryRef> v);
	public java.lang.String getName();

	public void setName(java.lang.String v);
	public Boolean getIsRefining();

	public void setIsRefining(Boolean v);
	public List<atl.metamodel.OCL.OclModel> getInModels();

	public void addInModels(List<atl.metamodel.OCL.OclModel> v);
	public List<atl.metamodel.OCL.OclModel> getOutModels();

	public void addOutModels(List<atl.metamodel.OCL.OclModel> v);
	public List<atl.metamodel.ATL.ModuleElement> getElements();

	public void addElements(List<atl.metamodel.ATL.ModuleElement> v);

}
