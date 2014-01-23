
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface OclFeatureDefinition extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.OCL.OclFeature getFeature();
	public atl.metamodel.OCL.OclContextDefinition getContext_();

}
