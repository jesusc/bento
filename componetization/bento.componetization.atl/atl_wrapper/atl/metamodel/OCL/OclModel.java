
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface OclModel extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public java.lang.String getName();
	public atl.metamodel.OCL.OclModel getMetamodel();
	public List<atl.metamodel.OCL.OclModelElement> getElements();
	public List<atl.metamodel.OCL.OclModel> getModel();

}
