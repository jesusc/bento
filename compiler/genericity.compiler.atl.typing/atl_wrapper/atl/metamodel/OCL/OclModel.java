
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface OclModel extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public java.lang.String getName();

	public void setName(java.lang.String v);
	public atl.metamodel.OCL.OclModel getMetamodel();

	public void setMetamodel(atl.metamodel.OCL.OclModel v);
	public List<atl.metamodel.OCL.OclModelElement> getElements();

	public void addElements(atl.metamodel.OCL.OclModelElement v);
	public List<atl.metamodel.OCL.OclModel> getModel();

	public void addModel(atl.metamodel.OCL.OclModel v);

}
