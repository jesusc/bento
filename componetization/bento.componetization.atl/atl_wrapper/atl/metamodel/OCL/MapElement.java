
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface MapElement extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.MapExp getMap();

	public void setMap(atl.metamodel.OCL.MapExp v);
	public atl.metamodel.OCL.OclExpression getKey();

	public void setKey(atl.metamodel.OCL.OclExpression v);
	public atl.metamodel.OCL.OclExpression getValue();

	public void setValue(atl.metamodel.OCL.OclExpression v);

}
