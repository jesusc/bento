
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface BindingStat extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Statement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.OclExpression getSource();

	public void setSource(atl.metamodel.OCL.OclExpression v);
	public java.lang.String getPropertyName();

	public void setPropertyName(java.lang.String v);
	public Boolean getIsAssignment();

	public void setIsAssignment(Boolean v);
	public atl.metamodel.OCL.OclExpression getValue();

	public void setValue(atl.metamodel.OCL.OclExpression v);

}
