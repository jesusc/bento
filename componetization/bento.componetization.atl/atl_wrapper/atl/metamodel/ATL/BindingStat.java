
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface BindingStat extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Statement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.OCL.OclExpression getSource();
	public java.lang.String getPropertyName();
	public Boolean getIsAssignment();
	public atl.metamodel.OCL.OclExpression getValue();

}
