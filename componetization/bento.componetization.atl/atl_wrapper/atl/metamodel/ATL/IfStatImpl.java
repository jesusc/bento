
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class IfStatImpl extends atl.metamodel.ATLModelBaseObject implements IfStat {
	
	public IfStatImpl(atl.metamodel.ATLModel manager, EObject object) {
		super(manager, object);
	}
	
	@Override
	public java.lang.String getLocation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public List<java.lang.String> getCommentsBefore() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public List<java.lang.String> getCommentsAfter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclExpression getCondition() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("condition");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public List<atl.metamodel.ATL.Statement> getThenStatements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("thenStatements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.Statement>) result;
	}
	
	@Override
	public List<atl.metamodel.ATL.Statement> getElseStatements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elseStatements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.Statement>) result;
	}
	

	public Class<IfStat> getImplementedInterface() { return IfStat.class; }
}
