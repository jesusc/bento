package genericity.compiler.atl.analyser;

import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.AtlAnnotation;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.HashMap;
import java.util.LinkedList;

import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.OclExpression;

public class ComputedAttributes {
	protected HashMap<ATLModelBaseObject, Type> typeAttr = new HashMap<ATLModelBaseObject, Type>();
	protected HashMap<ATLModelBaseObject, AtlAnnotation> annAttr = new HashMap<ATLModelBaseObject, AtlAnnotation>();

	private LinkedList<AbstractAnalyserVisitor>	visitors = new LinkedList<AbstractAnalyserVisitor>();

	private VariableScope varScope = new VariableScope();
	
	public VariableScope getVarScope() {
		return varScope;
	}
	
	public ComputedAttributes(AbstractAnalyserVisitor v) {
		visitors.add(v);
	}
	
	public ComputedAttributes pushVisitor(AbstractAnalyserVisitor v) {
		visitors.push(v);
		return this;
	}
	
	public void popVisitor(AbstractAnalyserVisitor v) {
		visitors.pop();
	}
	
	public void linkStructType(Type t) {
		if ( t == null )
			throw new IllegalArgumentException();

		typeAttr.put(visitors.peek().getCurrent(), t);	
	}
	
	public void linkExprType(Type t) {
		if ( t == null )
			throw new IllegalArgumentException();
		linkExprType(visitors.peek().getCurrent(), t);
	}


	public void linkExprType(ATLModelBaseObjectInterface node, Type t) {
		// if ( typeAttr.containsKey(node) ) 
		//	System.err.println(((LocatedElement) node).getLocation() + " " + node );
			// throw new IllegalStateException(((LocatedElement) node).getLocation() + " " + node );
		typeAttr.put((ATLModelBaseObject) node, t);	
	}
	
	public void linkAnnotation(ATLModelBaseObjectInterface node, AtlAnnotation ann) {		
		annAttr.put((ATLModelBaseObject) node, ann);
	}
	
	public Type typeOf(ATLModelBaseObjectInterface obj) {
		if ( ! getVarScope().isEmpty() && obj instanceof OclExpression ) {
			Type t = getVarScope().getKindOf((OclExpression) obj);
			if ( t != null )
				return t;
		}
		
		Type t = typeAttr.get(obj);
		if ( t == null ) throw new IllegalStateException("No type for " + obj);
		return t;
	}

	public boolean wasCasted(OclExpression expr) {
		Type t = null;
		if ( ! getVarScope().isEmpty() ) {
			t = getVarScope().getKindOf(expr);
		}	
		return t != null;
	}
	
	public <T extends AtlAnnotation> T annotationOf(ATLModelBaseObjectInterface node) {
		if ( node == null ) throw new IllegalArgumentException();
		@SuppressWarnings("unchecked")
		T ann = (T) annAttr.get(node);
		if ( ann == null ) throw new IllegalStateException("No annotation for " + node);		
		return ann;
	}


}
