
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SimpleInPatternElement {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public SimpleInPatternElement(atl.metamodel.ATLModel manager, EObject o) {
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
	public java.lang.String getId() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("id");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	public java.lang.String getVarName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("varName");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	public atl.metamodel.OCL.OclType getType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclType) result;
	}
	public atl.metamodel.OCL.OclExpression getInitExpression() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initExpression");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	public atl.metamodel.OCL.LetExp getLetExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("letExp");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.LetExp) result;
	}
	public atl.metamodel.OCL.IterateExp getBaseExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("baseExp");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.IterateExp) result;
	}
	public List<atl.metamodel.OCL.VariableExp> getVariableExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variableExp");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.VariableExp>) result;
	}
	public atl.metamodel.ATL.OutPatternElement getMapsTo() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("mapsTo");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.OutPatternElement) result;
	}
	public atl.metamodel.ATL.InPattern getInPattern() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("inPattern");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.InPattern) result;
	}
	public List<atl.metamodel.OCL.OclModel> getModels() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("models");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.OclModel>) result;
	}


	public EObject original() { return object; }
}
