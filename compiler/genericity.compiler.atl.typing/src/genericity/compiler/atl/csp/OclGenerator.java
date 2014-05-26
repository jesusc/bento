package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.Analyser;
import genericity.typing.atl_types.annotations.CallExprAnn;

import java.util.List;

import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.CollectionType;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.SequenceExp;
import atl.metamodel.OCL.SequenceType;
import atl.metamodel.OCL.SetExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.StringType;
import atl.metamodel.OCL.VariableExp;

public class OclGenerator {

	public static String gen(OclExpression receptor) {
		return gen(receptor, null);
	}
	
	public static String gen(OclExpression expr, Analyser analyser) {
		if (expr instanceof PropertyCallExp) {
			return genPropertyCall(expr, analyser);
		} else if (expr instanceof VariableExp) {
			String varName = ((VariableExp) expr).getReferredVariable().getVarName();
			return varName;
		} else if (expr instanceof IntegerExp) {
			return ((IntegerExp) expr).getIntegerSymbol().toString();
		} else if (expr instanceof StringExp) {
			return "'" + ((StringExp) expr).getStringSymbol() + "'";
		} else if ( expr instanceof BooleanExp ) {
			return ((BooleanExp) expr).getBooleanSymbol().toString();
		} else if ( expr instanceof OclModelElement ) {
			OclModelElement ome = (OclModelElement) expr;
			// return ome.getModel().getName() + "!" + ome.getName();
			return ome.getName();
		} else if ( expr instanceof IfExp ) {
			IfExp ifexp = (IfExp) expr;
			return "if " + gen(ifexp.getCondition()) + "\n\tthen " + gen(ifexp.getThenExpression()) + "\n\telse " + gen(ifexp.getElseExpression()) + "\n\tendif";
		} else if ( expr instanceof LetExp ) {
			LetExp let = (LetExp) expr;
			String type = "";
			if ( let.getVariable().getType() != null) {
				type = gen(let.getVariable().getType());
			}
			return "let " + let.getVariable().getVarName() + type + " = " + gen(let.getVariable().getInitExpression(), analyser) + " in\n\t" + gen(let.getIn_(), analyser);
		} else if ( expr instanceof CollectionExp ) {
			CollectionExp col = (CollectionExp) expr;
			String elems = "";
			for(int i = 0; i < col.getElements().size(); i++) {
				elems += OclGenerator.gen( col.getElements().get(i) );
				if ( i + 1 < col.getElements().size() ) 
					elems += ",";
			}
			String type = null;
			if ( expr instanceof SequenceExp ) type = "Sequence";
			else if ( expr instanceof SetExp ) type = "Set";
			else throw new UnsupportedOperationException();
			
			return type + " { " + elems + " }";
		} else if ( expr instanceof EnumLiteralExp ) {
			EnumLiteralExp enuml = (EnumLiteralExp) expr;
			return "#" + enuml.getName();
		} else if ( expr instanceof OclUndefinedExp ) {
			return "OclUndefined";			
		} else if ( expr instanceof StringType ) { 
			return "String";
		} else if ( expr instanceof CollectionType ) {
			CollectionType ct = (CollectionType) expr;
			String str = gen(ct.getElementType());
			if ( expr instanceof SequenceType ) return "Sequence(" + str + ")";			
			else throw new UnsupportedOperationException(expr.toString());
		} else {
			throw new UnsupportedOperationException(expr.toString());
		}
	}

	private static String genPropertyCall(OclExpression expr, Analyser analyser) {
		String receptor = gen(((PropertyCallExp) expr).getSource(), analyser);
		if (expr instanceof OperatorCallExp) {
			OperatorCallExp op = (OperatorCallExp) expr;
			if (op.getArguments().isEmpty()) {
				return op.getOperationName() + " (" + receptor + ")";
			} else {
				return "(" + receptor + ") " + op.getOperationName() + " (" + gen(op.getArguments().get(0), analyser) + ")";
			}
		} else if (expr instanceof NavigationOrAttributeCallExp) {
			NavigationOrAttributeCallExp nav = (NavigationOrAttributeCallExp) expr;
			String op = nav.getName();
			if ( analyser != null ) {
				CallExprAnn ann = (CallExprAnn) analyser.getTyping().getAnnotation(nav.original_());
				if ( ann.getUsedFeature() == null )
					op = op + "()";
			}
			return receptor + "." + op;
		} else if (expr instanceof CollectionOperationCallExp) {
			CollectionOperationCallExp call = (CollectionOperationCallExp) expr;
			return receptor + "->" + call.getOperationName() + "(" + genArgs(call.getArguments(), analyser )+ ")";
		} else if (expr instanceof OperationCallExp) {
			OperationCallExp call = (OperationCallExp) expr;
			if ( call.getOperationName().equals("allInstancesFrom") ) {
				return receptor + ".allInstances()"; 
			}
			
			return receptor + "." + translateName(call) + "(" + genArgs(call.getArguments(), analyser )+ ")";
		} else if ( expr instanceof IteratorExp ) {
			IteratorExp it = (IteratorExp) expr;
			// TODO: Include type if available??
			return receptor + "->" + it.getName() + "(" + it.getIterators().get(0).getVarName() + "|" +
					gen(it.getBody(), analyser) + ")";
		} else if ( expr instanceof IterateExp ) {
			IterateExp it = (IterateExp) expr;
			return receptor + "->" + "iterate" + "(" + it.getIterators().get(0).getVarName() + "," + it.getResult().getVarName() + " = " + gen(it.getResult().getInitExpression()) + "|" +
			gen(it.getBody(), analyser) + ")";			
		} else {
			throw new UnsupportedOperationException(expr.toString());
		}
	}

	private static String translateName(OperationCallExp call) {
		String name = call.getOperationName();
		if ( name.equals("oclIsUndefined") ) return "isUndefined";
		return name;
	}

	private static String genArgs(List<OclExpression> arguments, Analyser analyser) {
		String s = "";
		for(int i = 0; i < arguments.size(); i++) {
			s += gen(arguments.get(i), analyser);
			if ( i < arguments.size() - 1 ) {
				s += ",";
			}
		}
		return s;
	}

	

	

}
