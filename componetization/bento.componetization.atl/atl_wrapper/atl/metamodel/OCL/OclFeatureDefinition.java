
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface OclFeatureDefinition extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.OclFeature getFeature();

	public void setFeature(atl.metamodel.OCL.OclFeature v);
	public atl.metamodel.OCL.OclContextDefinition getContext_();

	public void setContext_(atl.metamodel.OCL.OclContextDefinition v);

}
