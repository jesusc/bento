
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class InPatternElementImpl extends atl.metamodel.ATLModelBaseObject implements InPatternElement {
	
	public InPatternElementImpl(atl.metamodel.ATLModel manager, EObject object) {
		super(manager, object);
	}
	
	@Override
	public java.lang.String getLocation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public void setLocation(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<java.lang.String> getCommentsBefore() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public void addCommentsBefore(List<java.lang.String> v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<java.lang.String> getCommentsAfter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public void addCommentsAfter(List<java.lang.String> v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public java.lang.String getId() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("id");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public void setId(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("id");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public java.lang.String getVarName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("varName");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public void setVarName(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("varName");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclType getType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclType) result;
	}
	
	@Override
	public void setType(atl.metamodel.OCL.OclType v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclExpression getInitExpression() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initExpression");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public void setInitExpression(atl.metamodel.OCL.OclExpression v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initExpression");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.LetExp getLetExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("letExp");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.OCL.LetExp) result;
	}
	
	@Override
	public void setLetExp(atl.metamodel.OCL.LetExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("letExp");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.IterateExp getBaseExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("baseExp");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.OCL.IterateExp) result;
	}
	
	@Override
	public void setBaseExp(atl.metamodel.OCL.IterateExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("baseExp");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<atl.metamodel.OCL.VariableExp> getVariableExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variableExp");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (List<atl.metamodel.OCL.VariableExp>) result;
	}
	
	@Override
	public void addVariableExp(List<atl.metamodel.OCL.VariableExp> v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variableExp");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.ATL.OutPatternElement getMapsTo() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("mapsTo");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.ATL.OutPatternElement) result;
	}
	
	@Override
	public void setMapsTo(atl.metamodel.ATL.OutPatternElement v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("mapsTo");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.ATL.InPattern getInPattern() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("inPattern");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.ATL.InPattern) result;
	}
	
	@Override
	public void setInPattern(atl.metamodel.ATL.InPattern v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("inPattern");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<atl.metamodel.OCL.OclModel> getModels() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("models");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (List<atl.metamodel.OCL.OclModel>) result;
	}
	
	@Override
	public void addModels(List<atl.metamodel.OCL.OclModel> v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("models");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<InPatternElement> getImplementedInterface() { return InPatternElement.class; }
}
