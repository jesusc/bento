
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ForStatImpl extends atl.metamodel.ATLModelBaseObject implements ForStat {
	
	public ForStatImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.OCL.Iterator getIterator() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("iterator");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.Iterator) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclExpression getCollection() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("collection");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public List<atl.metamodel.ATL.Statement> getStatements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("statements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.Statement>) result;
	}
	

	public Class<ForStat> getImplementedInterface() { return ForStat.class; }
}
