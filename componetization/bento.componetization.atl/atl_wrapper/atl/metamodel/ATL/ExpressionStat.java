
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface ExpressionStat extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Statement {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.OclExpression getExpression();

	public void setExpression(atl.metamodel.OCL.OclExpression v);

}
