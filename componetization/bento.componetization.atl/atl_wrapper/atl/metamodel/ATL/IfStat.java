
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IfStat extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Statement {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.OclExpression getCondition();

	public void setCondition(atl.metamodel.OCL.OclExpression v);
	public List<atl.metamodel.ATL.Statement> getThenStatements();

	public void addThenStatements(atl.metamodel.ATL.Statement v);
	public List<atl.metamodel.ATL.Statement> getElseStatements();

	public void addElseStatements(atl.metamodel.ATL.Statement v);

}
