
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Attribute extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.OCL.OclFeature {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition();

	public void setDefinition(atl.metamodel.OCL.OclFeatureDefinition v);
	public java.lang.String getName();

	public void setName(java.lang.String v);
	public atl.metamodel.OCL.OclExpression getInitExpression();

	public void setInitExpression(atl.metamodel.OCL.OclExpression v);
	public atl.metamodel.OCL.OclType getType();

	public void setType(atl.metamodel.OCL.OclType v);

}
