
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Query extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Unit {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public List<atl.metamodel.ATL.LibraryRef> getLibraries();
	public java.lang.String getName();
	public atl.metamodel.OCL.OclExpression getBody();
	public List<atl.metamodel.ATL.Helper> getHelpers();

}
