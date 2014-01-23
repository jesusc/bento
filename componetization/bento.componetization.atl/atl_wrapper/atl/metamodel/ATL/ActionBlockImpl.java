
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ActionBlockImpl extends atl.metamodel.ATLModelBaseObject implements ActionBlock {
	
	public ActionBlockImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.ATL.Rule getRule() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("rule");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Rule) result;
	}
	
	@Override
	public List<atl.metamodel.ATL.Statement> getStatements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("statements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.Statement>) result;
	}
	

	public Class<ActionBlock> getImplementedInterface() { return ActionBlock.class; }
}
