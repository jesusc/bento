package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.GenericExprAnn;

import java.util.List;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.BooleanType;
import atl.metamodel.OCL.CollectionExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.CollectionType;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IntegerType;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.MapElement;
import atl.metamodel.OCL.MapExp;
import atl.metamodel.OCL.MapType;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclAnyType;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.RealExp;
import atl.metamodel.OCL.RealType;
import atl.metamodel.OCL.SequenceExp;
import atl.metamodel.OCL.SequenceType;
import atl.metamodel.OCL.SetExp;
import atl.metamodel.OCL.SetType;
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
		} else if ( expr instanceof RealExp ) {
			return ((RealExp) expr).getRealSymbol().toString();
		} else if ( expr instanceof OclModelElement ) {
			OclModelElement ome = (OclModelElement) expr;
			// return ome.getModel().getName() + "!" + ome.getName();
			return ome.getName();
		} else if ( expr instanceof IfExp ) {
			IfExp ifexp = (IfExp) expr;
			return "if " + gen(ifexp.getCondition(), analyser) + 
					"\n\tthen " + gen(ifexp.getThenExpression(), analyser) + 
					"\n\telse " + gen(ifexp.getElseExpression(), analyser) + "\n\tendif";
		} else if ( expr instanceof LetExp ) {
			LetExp let = (LetExp) expr;
			String type = "";
			if ( let.getVariable().getType() != null) {
				type = gen(let.getVariable().getType(), analyser);
			}
			return "let " + let.getVariable().getVarName() + type + " = " + gen(let.getVariable().getInitExpression(), analyser) + " in\n\t" + gen(let.getIn_(), analyser);
		} else if ( expr instanceof CollectionExp ) {
			CollectionExp col = (CollectionExp) expr;
			String elems = "";
			for(int i = 0; i < col.getElements().size(); i++) {
				elems += OclGenerator.gen( col.getElements().get(i), analyser );
				if ( i + 1 < col.getElements().size() ) 
					elems += ",";
			}
			String type = null;
			if ( expr instanceof SequenceExp ) type = "Sequence";
			else if ( expr instanceof SetExp ) type = "Set";
			else throw new UnsupportedOperationException();
			
			return type + " { " + elems + " }";
		} else if ( expr instanceof MapExp ) {
			MapExp me = (MapExp) expr;
			String elems = "";
			for(int i = 0; i < me.getElements().size(); i++) {
				elems += "(" + OclGenerator.gen( me.getElements().get(i).getKey(), analyser ) + ";" + 
						OclGenerator.gen( me.getElements().get(i).getValue(), analyser ) + ")";
				if ( i + 1 < me.getElements().size() ) 
					elems += ",";
			}
			
			return "Map" + " { " + elems + " }";			
		} else if ( expr instanceof EnumLiteralExp ) {
			if ( analyser != null ) {
				EEnumLiteral literal = TypeUtils.getLiteralOf(expr, analyser.getTyping());
				return "" + literal.getValue();
			}
			
			EnumLiteralExp enuml = (EnumLiteralExp) expr;
			return "#" + enuml.getName();
		} else if ( expr instanceof OclUndefinedExp ) {
			return "oclUndefined(OclVoid)";
			// return "OclUndefined";			
		} else if ( expr instanceof StringType ) { 
			return "String";
		} else if ( expr instanceof IntegerType ) {
			return "Integer";
		} else if ( expr instanceof BooleanType ) {
			return "Boolean";
		} else if ( expr instanceof RealType ) {
			return "Real";
		} else if ( expr instanceof CollectionType ) {
			CollectionType ct = (CollectionType) expr;
			String str = gen(ct.getElementType(), analyser);
			// if ( expr instanceof SequenceType ) return "Sequence(" + str + ")";			
			if ( expr instanceof SequenceType ) return "Sequence(" + str + ")";			
			if ( expr instanceof SetType ) return "Set(" + str + ")";
			else throw new UnsupportedOperationException(expr.toString());
		} else if ( expr instanceof MapType ) {
			MapType mt = (MapType) expr;
			return "Map(" + gen(mt.getKeyType(), analyser) + ", " + gen(mt.getValueType(), analyser) + ")";
		} else if ( expr instanceof OclAnyType ) {
			return "OclAny";
		} else {
			throw new UnsupportedOperationException(expr.toString());
		}
	}

	private static String genPropertyCall(OclExpression expr, Analyser analyser) {
		String receptor = gen(((PropertyCallExp) expr).getSource(), analyser);
		String casting = "";
		if ( analyser != null ) {
			Type t = analyser.getTyping().getImplicitlyCasted(expr);
			if ( t != null && t instanceof Metaclass ) {
				casting = ".oclAsType(" + ((Metaclass) t).getName() + ")";
			}				
		}

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
					op = op + "(thisModule)";
			}
			return receptor + "." + op + casting;
		} else if (expr instanceof CollectionOperationCallExp) {
			CollectionOperationCallExp call = (CollectionOperationCallExp) expr;
			// TODO: Collection adaptation for USE, should be done better
			String prefix = "";
			String postfix = "->" + call.getOperationName();
			if ( call.getOperationName().equals("asSequence") && (
				  call.getSource() instanceof NavigationOrAttributeCallExp ||
				 (call.getSource() instanceof OperationCallExp && ((OperationCallExp) call.getSource()).getOperationName().equals("allInstances")) ) ) {
				// adaptation = "->asSequence()";
				prefix = "Sequence { ";
				postfix = "}->flatten";
			} else if ( call.getOperationName().equals("first") ) {
				return receptor + "->at(1)" + casting;
			}
			
			return prefix + receptor + postfix + "(" + genArgs(call.getArguments(), analyser )+ ")" + casting;
		} else if (expr instanceof OperationCallExp) {
			OperationCallExp call = (OperationCallExp) expr;
			if ( call.getOperationName().equals("allInstancesFrom") ) {
				return receptor + ".allInstances()"; 
			}
			
			String thisModuleArg = "";
			if ( analyser != null ) {
				CallExprAnn ann = (CallExprAnn) analyser.getTyping().getAnnotation(call.original_());
				if ( ann.getStaticResolver() != null ) {
					thisModuleArg = "thisModule";
					if ( call.getArguments().size() > 0 ) 
						thisModuleArg += ", ";
				}
			}
			
			return receptor + "." + translateName(call) + "(" + thisModuleArg + genArgs(call.getArguments(), analyser )+ ")" + casting;
		} else if ( expr instanceof IteratorExp ) {
			IteratorExp it = (IteratorExp) expr;
			// TODO: Include type if available??
			return receptor + "->" + it.getName() + "(" + it.getIterators().get(0).getVarName() + "|" +
					gen(it.getBody(), analyser) + ")";
		} else if ( expr instanceof IterateExp ) {
			IterateExp it = (IterateExp) expr;
			if ( it.getResult().getType() == null ) {
				throw new UnsupportedOperationException("Iterate should have type declaration, not using infered type yet: " + it.getLocation());
			}
			String typeName = gen(it.getResult().getType(), analyser);
			
			return receptor + "->" + "iterate" + "(" + it.getIterators().get(0).getVarName() + ";" + it.getResult().getVarName() + " : " + typeName + " = " + gen(it.getResult().getInitExpression(), analyser) + "|" +
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
