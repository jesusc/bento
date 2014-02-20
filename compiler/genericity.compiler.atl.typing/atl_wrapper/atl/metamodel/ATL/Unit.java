
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Unit extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public List<atl.metamodel.ATL.LibraryRef> getLibraries();

	public void addLibraries(atl.metamodel.ATL.LibraryRef v);
	public java.lang.String getName();

	public void setName(java.lang.String v);

}