
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Statement extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(List<java.lang.String> v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(List<java.lang.String> v);

}
