
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface ForStat extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Statement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.OCL.Iterator getIterator();
	public atl.metamodel.OCL.OclExpression getCollection();
	public List<atl.metamodel.ATL.Statement> getStatements();

}
