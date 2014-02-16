
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface ForStat extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Statement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.Iterator getIterator();

	public void setIterator(atl.metamodel.OCL.Iterator v);
	public atl.metamodel.OCL.OclExpression getCollection();

	public void setCollection(atl.metamodel.OCL.OclExpression v);
	public List<atl.metamodel.ATL.Statement> getStatements();

	public void addStatements(atl.metamodel.ATL.Statement v);

}
