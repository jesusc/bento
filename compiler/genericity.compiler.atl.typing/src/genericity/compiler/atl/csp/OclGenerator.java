package genericity.compiler.atl.csp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.SequenceExp;
import atl.metamodel.OCL.SetExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.VariableExp;

public class OclGenerator {

	public static String gen(OclExpression expr) {
		return gen(expr, null, new HashMap<String, String>());
	}
	
	public static String gen(OclExpression expr, Map<String, String> vars) {
		return gen(expr, null, vars);
	}
	
	public static String gen(OclExpression expr, OclExpression end, Map<String, String> vars) {
		if (expr instanceof PropertyCallExp) {
			return genPropertyCall(expr, end, vars);
		} else if (expr instanceof VariableExp) {
			String varName = ((VariableExp) expr).getReferredVariable().getVarName();
			if ( vars.containsKey(varName) ) {
				varName = vars.get(varName);
			}
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
			return "let " + let.getVariable().getVarName() + type + " = " + gen(let.getVariable().getInitExpression(), vars) + " in\n\t" + gen(let.getIn_(), vars);
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
		} else {
			throw new UnsupportedOperationException(expr.toString());
		}
	}

	private static String genPropertyCall(OclExpression expr, OclExpression end, Map<String, String> vars) {
		String receptor = gen(((PropertyCallExp) expr).getSource(), end, vars);
		if (expr instanceof OperatorCallExp) {
			OperatorCallExp op = (OperatorCallExp) expr;
			if (op.getArguments().isEmpty()) {
				return op.getOperationName() + " (" + receptor + ")";
			} else {
				return receptor + " " + op.getOperationName() + " " + gen(op.getArguments().get(0), end, vars);
			}
		} else if (expr instanceof NavigationOrAttributeCallExp) {
			NavigationOrAttributeCallExp nav = (NavigationOrAttributeCallExp) expr;
			return receptor + "." + nav.getName();
		} else if (expr instanceof CollectionOperationCallExp) {
			CollectionOperationCallExp call = (CollectionOperationCallExp) expr;
			return receptor + "->" + call.getOperationName() + "(" + genArgs(call.getArguments(), vars )+ ")";
		} else if (expr instanceof OperationCallExp) {
			OperationCallExp call = (OperationCallExp) expr;
			return receptor + "." + translateName(call) + "(" + genArgs(call.getArguments(), vars )+ ")";
		} else if ( expr instanceof IteratorExp ) {
			IteratorExp it = (IteratorExp) expr;
			// TODO: Include type if available??
			return receptor + "->" + it.getName() + "(" + it.getIterators().get(0).getVarName() + "|" +
					gen(it.getBody()) + ")";
		} else if ( expr instanceof IterateExp ) {
			IterateExp it = (IterateExp) expr;
			return receptor + "->" + "iterate" + "(" + it.getIterators().get(0).getVarName() + "," + it.getResult().getVarName() + " = " + gen(it.getResult().getInitExpression()) + "|" +
			gen(it.getBody()) + ")";			
		} else {
			throw new UnsupportedOperationException(expr.toString());
		}
	}

	private static String translateName(OperationCallExp call) {
		String name = call.getOperationName();
		if ( name.equals("oclIsUndefined") ) return "isUndefined";
		return name;
	}

	private static String genArgs(List<OclExpression> arguments, Map<String, String> vars) {
		String s = "";
		for(int i = 0; i < arguments.size(); i++) {
			s += gen(arguments.get(i), null, vars);
			if ( i < arguments.size() - 1 ) {
				s += ",";
			}
		}
		return s;
	}

}
