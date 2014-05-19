package genericity.compiler.atl.csp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import atl.metamodel.ATLModel;
import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclModel;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclType;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.SequenceExp;
import atl.metamodel.OCL.SetExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;

public class OclGeneratorAST {

	private ATLModel atlModel;

	public OclGeneratorAST(ATLModel atlModel) {
		this.atlModel = atlModel;
	}

	public OclExpression gen(OclExpression expr) {
		return gen(expr, null, new HashMap<VariableDeclaration, VariableDeclaration>());
	}
	
	public OclExpression gen(OclExpression expr, Map<VariableDeclaration, VariableDeclaration> vars) {
		return gen(expr, null, vars);
	}
	
	public OclExpression gen(OclExpression expr, OclExpression end, Map<VariableDeclaration, VariableDeclaration> vars) {
		if (expr instanceof PropertyCallExp) {
			return genPropertyCall(expr, end, vars);
		} else if (expr instanceof VariableExp) {
			VariableExp varT = atlModel.create(VariableExp.class);
			
			varT.setReferredVariable( getVar((VariableExp) expr, vars) );
			
			return varT;
		
		} else if (expr instanceof IntegerExp) {
			IntegerExp lit = atlModel.create(IntegerExp.class);
			lit.setIntegerSymbol(((IntegerExp) expr).getIntegerSymbol());
			return lit;
		} else if (expr instanceof StringExp) {
			StringExp lit = atlModel.create(StringExp.class);
			lit.setStringSymbol(((StringExp) expr).getStringSymbol());
			return lit;
		} else if ( expr instanceof BooleanExp ) {
			BooleanExp lit = atlModel.create(BooleanExp.class);
			lit.setBooleanSymbol(((BooleanExp) expr).getBooleanSymbol());
			return lit;
		} else if ( expr instanceof OclModelElement ) {
			OclModelElement src = (OclModelElement) expr;
			OclModelElement tgt = atlModel.create(OclModelElement.class);

			// Probably it should not always be copied... but for the moment...
			OclModel tgtModel = atlModel.create(OclModel.class);
			tgtModel.setName( src.getModel().getName() );
			
			tgt.setName( src.getName() );
			tgt.setModel( tgtModel );
			
			return tgt;
		} /* else if ( expr instanceof IfExp ) {
			IfExp ifexp = (IfExp) expr;
			return "if " + gen(ifexp.getCondition()) + "\n\tthen " + gen(ifexp.getThenExpression()) + "\n\telse " + gen(ifexp.getElseExpression()) + "\n\tendif";
		} else if ( expr instanceof CollectionExp ) {
			CollectionExp col = (CollectionExp) expr;
			String elems = "";
			for(int i = 0; i < col.getElements().size(); i++) {
				elems += OclGeneratorAST.gen( col.getElements().get(i) );
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
		*/
		throw new UnsupportedOperationException(expr.getClass().getSimpleName());
	}


	private OclExpression genPropertyCall(OclExpression expr, OclExpression end, Map<VariableDeclaration, VariableDeclaration> vars) {
		OclExpression receptor = gen(((PropertyCallExp) expr).getSource(), end, vars);
		if (expr instanceof OperatorCallExp) {
			OperatorCallExp opS  = (OperatorCallExp) expr;
			OperatorCallExp opT = atlModel.create(OperatorCallExp.class);
			
			opT.setSource(receptor);
			opT.setOperationName( opS.getOperationName() );
			for(OclExpression arg: genArgs(opS.getArguments(), vars )) opT.addArguments(arg);
		
			return opT;
		} else if (expr instanceof NavigationOrAttributeCallExp) {
			NavigationOrAttributeCallExp navS = (NavigationOrAttributeCallExp) expr;
			NavigationOrAttributeCallExp navT = atlModel.create(NavigationOrAttributeCallExp.class);
			
			navT.setSource(receptor);
			navT.setName(navS.getName());

			return navT;
		} else if (expr instanceof CollectionOperationCallExp) {
			CollectionOperationCallExp navS = (CollectionOperationCallExp) expr;
			CollectionOperationCallExp navT = atlModel.create(CollectionOperationCallExp.class);

			navT.setSource(receptor);
			navT.setOperationName(navS.getOperationName());
			for(OclExpression arg: genArgs(navS.getArguments(), vars )) navT.addArguments(arg);
		
			return navT;
		} else if (expr instanceof OperationCallExp) {
			OperationCallExp navS = (OperationCallExp) expr;
			OperationCallExp navT = atlModel.create(OperationCallExp.class);

			navT.setSource(receptor);
			navT.setOperationName(navS.getOperationName());
			for(OclExpression arg: genArgs(navS.getArguments(), vars )) navT.addArguments(arg);
			
			return navT;			
		} else if ( expr instanceof IteratorExp ) {
			IteratorExp src = (IteratorExp) expr;
			IteratorExp tgt = atlModel.create(IteratorExp.class);
			
			tgt.setSource( gen(src.getSource(), vars) );
			tgt.setName(src.getName());
			Iterator itTgt = atlModel.create(Iterator.class);
			itTgt.setVarName( src.getIterators().get(0).getVarName() );
			if ( src.getIterators().get(0).getType() != null )
				itTgt.setType( genType(src.getIterators().get(0).getType()) );
			
			tgt.addIterators( itTgt );

			// Create a new var for the body
			vars = new HashMap<VariableDeclaration, VariableDeclaration>(vars);
			vars.put(src.getIterators().get(0), itTgt);
			tgt.setBody( gen(src.getBody(), vars));
			
			return tgt;
		} /* else if ( expr instanceof IterateExp ) {
			IterateExp it = (IterateExp) expr;
			return receptor + "->" + "iterate" + "(" + it.getIterators().get(0).getVarName() + "," + it.getResult().getVarName() + " = " + gen(it.getResult().getInitExpression()) + "|" +
			gen(it.getBody()) + ")";			
		} else {
			throw new UnsupportedOperationException(expr.toString());
		}
		*/

		throw new UnsupportedOperationException(expr.toString());
	}

	private OclType genType(OclType type) {
		throw new UnsupportedOperationException();
	}

	private String translateName(OperationCallExp call) {
		/*
		String name = call.getOperationName();
		if ( name.equals("oclIsUndefined") ) return "isUndefined";
		return name;
		*/
		throw new UnsupportedOperationException();
	}

	private List<? extends OclExpression> genArgs(List<OclExpression> arguments, Map<VariableDeclaration, VariableDeclaration> vars) {
		ArrayList<OclExpression> result = new ArrayList<OclExpression>();
		for(int i = 0; i < arguments.size(); i++) {
			result.add( gen(arguments.get(i), null, vars) );
		}
		return result;
	}

	private VariableDeclaration getVar(VariableExp expr, Map<VariableDeclaration, VariableDeclaration> vars) {
		VariableDeclaration vd = vars.get( expr.getReferredVariable());
		if ( vd == null ) 
			throw new IllegalStateException("Expected mapping for var " + expr.getReferredVariable().getVarName());
		return vd;
	}

}
