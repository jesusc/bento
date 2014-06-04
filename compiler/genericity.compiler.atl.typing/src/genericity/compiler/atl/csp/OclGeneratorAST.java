package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.compiler.atl.csp.CSPModel.CSPModelScope;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ImperativeRuleAnn;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EEnumLiteral;

import atl.metamodel.ATLModel;
import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.CollectionType;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IntegerType;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclModel;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclType;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.SequenceType;
import atl.metamodel.OCL.SetType;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.StringType;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;

public class OclGeneratorAST {

	private ATLModel atlModel;
	private TypingModel typ;
	private LazyRuleCallTransformationStrategy lazyRuleStrategy = new LazyRuleNotSupported();
	
	public OclGeneratorAST(ATLModel atlModel, TypingModel typingModel) {
		this.atlModel = atlModel;
		this.typ = typingModel;
	}

	/*
	public OclExpression gen(OclExpression expr) {
		return gen(expr, null, new CSPModel.CSPModelScope());
	}
	*/
	
	public OclExpression gen(OclExpression expr, CSPModel.CSPModelScope vars) {
		return gen(expr, null, vars);
	}
	
	public OclExpression gen(OclExpression expr, OclExpression end, CSPModel.CSPModelScope vars) {
		if (expr instanceof PropertyCallExp) {
			return genPropertyCall(expr, end, vars);
		} else if (expr instanceof VariableExp) {
			VariableExp varT = atlModel.create(VariableExp.class);
			
			varT.setReferredVariable( vars.getVar((VariableExp) expr) );
			
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
		} else if ( expr instanceof IfExp ) {
			IfExp ifexp = (IfExp) expr;
			IfExp tgt   = atlModel.create(IfExp.class);
			tgt.setCondition(gen(ifexp.getCondition(), vars));
			tgt.setThenExpression(gen(ifexp.getThenExpression(), vars));
			tgt.setElseExpression(gen(ifexp.getElseExpression(), vars));
			
			return tgt;

		} else if ( expr instanceof LetExp ) {
			LetExp src = (LetExp) expr;
			LetExp tgt = atlModel.create(LetExp.class);

			VariableDeclaration vd = atlModel.create(VariableDeclaration.class);
			vd.setVarName(src.getVariable().getVarName());
			vd.setInitExpression(gen(src.getVariable().getInitExpression(), vars));

			tgt.setVariable(vd);

			// TODO: This is a very nasty side effect, but it is needed to make it visible
			// to subsequent calls of gen that need this variable mapped!
			vars.put(src.getVariable(), tgt.getVariable());
			
			tgt.setIn_( gen(src.getIn_(), vars) );
			
			return tgt;			
		} else if ( expr instanceof CollectionExp ) {
			CollectionExp col = (CollectionExp) expr;
			CollectionExp tgt = atlModel.create(col.getClass());
			
			for(int i = 0; i < col.getElements().size(); i++) {
				tgt.addElements(gen( col.getElements().get(i), vars));
			}
			
			return tgt;
		} else if ( expr instanceof EnumLiteralExp ) {
			// Enumerations are converted to integers
			EEnumLiteral literal = TypeUtils.getLiteralOf(expr, this.typ);
			IntegerExp tgt = atlModel.create(IntegerExp.class);
			tgt.setIntegerSymbol(literal.getValue());

			/*
			EnumLiteralExp enuml = (EnumLiteralExp) expr;
			EnumLiteralExp tgt = atlModel.create(EnumLiteralExp.class);
			tgt.setName(enuml.getName());
			*/
			return tgt;
		} else if ( expr instanceof OclUndefinedExp ) {
			return atlModel.create(OclUndefinedExp.class);
		} else if ( expr instanceof OclType ) {
			return genType((OclType) expr, vars);
		} else {
			throw new UnsupportedOperationException(expr.toString());
		}
	}


	private OclExpression genPropertyCall(OclExpression expr, OclExpression end, CSPModel.CSPModelScope vars) {
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
			PropertyCallExp navT = null;
			
			CallExprAnn ann = (CallExprAnn) typ.getAnnotation(navS.original_());
			if ( ann.getUsedFeature() == null ) {
				navT = atlModel.create(OperationCallExp.class);
				((OperationCallExp) navT).setOperationName(navS.getName());
			
				// Pass thisModule
				if ( ann.getUsedFeature() == null ) {
					VariableExp thisModuleRef = atlModel.create(VariableExp.class);
					thisModuleRef.setReferredVariable(vars.getThisModuleVar());
					((OperationCallExp) navT).addArguments(thisModuleRef);
				}

			} else {
				navT = atlModel.create(NavigationOrAttributeCallExp.class);
				((NavigationOrAttributeCallExp) navT).setName(navS.getName());
			}
			
			navT.setSource(receptor);
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

			CallExprAnn ann = (CallExprAnn) typ.getAnnotation(navS.original_());
			if ( ann.getStaticResolver() instanceof ImperativeRuleAnn ) {
				return lazyRuleStrategy.gen(atlModel, navS);
			} 
			
			OperationCallExp navT = atlModel.create(OperationCallExp.class);

			if ( ann.getStaticResolver() != null ) { // It is not a built-in function
				VariableExp thisModuleRef = atlModel.create(VariableExp.class);
				
				thisModuleRef.setReferredVariable(vars.getThisModuleVar());
				navT.addArguments(thisModuleRef);
			}
			
			
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
				itTgt.setType( genType(src.getIterators().get(0).getType(), vars) );
			
			tgt.addIterators( itTgt );

			// Create a new var for the body
			vars = vars.derive();
			vars.put(src.getIterators().get(0), itTgt);
			tgt.setBody( gen(src.getBody(), vars));
			
			return tgt;
		} else if ( expr instanceof IterateExp ) {
			IterateExp src = (IterateExp) expr;
			IterateExp tgt = atlModel.create(IterateExp.class);
						
			tgt.setSource( gen(src.getSource(), vars) );
			
			Iterator itTgt = atlModel.create(Iterator.class);
			itTgt.setVarName( src.getIterators().get(0).getVarName() );
			if ( src.getIterators().get(0).getType() != null )
				itTgt.setType( genType(src.getIterators().get(0).getType(), vars) );
			
			tgt.addIterators( itTgt );
			
			// Create a new var for the body
			VariableDeclaration result = atlModel.create(VariableDeclaration.class);
			result.setVarName(src.getResult().getVarName());
			result.setInitExpression( gen(src.getResult().getInitExpression(), vars) );			
			result.setType((OclType) gen(src.getResult().getType(), vars));
			tgt.setResult( result );

			vars = vars.derive();
			vars.put(src.getIterators().get(0), itTgt);
			vars.put(src.getResult(), result);
			tgt.setBody( gen(src.getBody(), vars));
			
			return tgt;			
		}

		throw new UnsupportedOperationException(expr.toString());
	}

	private OclType genType(OclType src, CSPModelScope vars) {
		if ( src instanceof SetType ) {
			SetType tgt = atlModel.create(SetType.class);
			tgt.setElementType((OclType) gen(((CollectionType) src).getElementType(), vars));
			return tgt;
		} else if ( src instanceof SequenceType ) {
			SequenceType tgt = atlModel.create(SequenceType.class);
			tgt.setElementType((OclType) gen(((CollectionType) src).getElementType(), vars));
			return tgt;			
		} else if ( src instanceof IntegerType ) {
			return atlModel.create(IntegerType.class);
		} else if ( src instanceof StringType ) {
			return atlModel.create(StringType.class);
		}
		
		throw new UnsupportedOperationException(src.getClass().getName());
	}

	private String translateName(OperationCallExp call) {
		/*
		String name = call.getOperationName();
		if ( name.equals("oclIsUndefined") ) return "isUndefined";
		return name;
		*/
		throw new UnsupportedOperationException();
	}

	private List<? extends OclExpression> genArgs(List<OclExpression> arguments, CSPModel.CSPModelScope vars) {
		ArrayList<OclExpression> result = new ArrayList<OclExpression>();
		for(int i = 0; i < arguments.size(); i++) {
			result.add( gen(arguments.get(i), null, vars) );
		}
		return result;
	}


	public static class LazyRuleNotSupported extends LazyRuleCallTransformationStrategy {
		@Override
		public OclExpression gen(ATLModel model, OperationCallExp opCall) {
			throw new UnsupportedOperationException(opCall.getLocation());
		}
	}

	public static abstract class LazyRuleCallTransformationStrategy {
		public abstract OclExpression gen(ATLModel model, OperationCallExp opCall);
	}

	public static class LazyRuleToOclUndefined extends LazyRuleCallTransformationStrategy {
		@Override
		public OclExpression gen(ATLModel model, OperationCallExp opCall) {
			return model.create(OclUndefinedExp.class);
		}
	}

	public LazyRuleCallTransformationStrategy getLazyRuleStrategy() {
		return lazyRuleStrategy;
	}
	
	public void setLazyRuleStrategy(
			LazyRuleCallTransformationStrategy lazyRuleStrategy) {
		this.lazyRuleStrategy = lazyRuleStrategy;
	}

	

}
