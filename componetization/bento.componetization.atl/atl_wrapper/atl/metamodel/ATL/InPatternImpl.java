
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class InPatternImpl extends atl.metamodel.ATLModelBaseObject implements InPattern {
	
	public InPatternImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public List<atl.metamodel.ATL.InPatternElement> getElements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.InPatternElement>) result;
	}
	
	@Override
	public atl.metamodel.ATL.MatchedRule getRule() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("rule");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.MatchedRule) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclExpression getFilter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("filter");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	

	public Class<InPattern> getImplementedInterface() { return InPattern.class; }
}
