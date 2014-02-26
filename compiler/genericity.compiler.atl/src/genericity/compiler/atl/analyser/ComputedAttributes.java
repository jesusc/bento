package genericity.compiler.atl.analyser;

import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.HashMap;
import java.util.LinkedList;

import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.OCL.Iterator;

public class ComputedAttributes {
	protected HashMap<ATLModelBaseObject, Type> typeAttr = new HashMap<ATLModelBaseObject, Type>();
	protected HashMap<ATLModelBaseObject, ExpressionAnnotation> exprAttr = new HashMap<ATLModelBaseObject, ExpressionAnnotation>();

	private LinkedList<AbstractAnalyserVisitor>	visitors = new LinkedList<AbstractAnalyserVisitor>();

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
		ExpressionAnnotation ann = visitors.peek().typ.createExpressionAnnotation();
		
		ann.setExpr(node.original_());
		ann.setType(t);
	
		typeAttr.put((ATLModelBaseObject) node, t);	
		exprAttr.put((ATLModelBaseObject) node, ann);
	}
	
	public Type typeOf(ATLModelBaseObjectInterface obj) {
		Type t = typeAttr.get(obj);
		if ( t == null ) throw new IllegalStateException("No type for " + obj);
		return t;
	}


}
