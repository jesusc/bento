
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IfStat extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Statement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.OCL.OclExpression getCondition();
	public List<atl.metamodel.ATL.Statement> getThenStatements();
	public List<atl.metamodel.ATL.Statement> getElseStatements();

}
