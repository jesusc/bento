
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class IfStat {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public IfStat(atl.metamodel.ATLModel manager, EObject o) {
		this.manager = manager;
		this.object  = o;
	}
	
	public java.lang.String getLocation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	public List<java.lang.String> getCommentsBefore() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	public List<java.lang.String> getCommentsAfter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	public atl.metamodel.OCL.OclExpression getCondition() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("condition");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	public List<atl.metamodel.ATL.Statement> getThenStatements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("thenStatements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.Statement>) result;
	}
	public List<atl.metamodel.ATL.Statement> getElseStatements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elseStatements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.Statement>) result;
	}


	public EObject original() { return object; }
}
