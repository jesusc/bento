package genericity.compiler.atl.csp;

import java.util.HashSet;

import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.OCL.CollectionExp;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.PropertyCallExp;

public class OclSlice {

	private static HashSet<Class<?>> ignore = new HashSet<Class<?>>();
	
	// In development mode only...
	static {
		ignore.add(atl.metamodel.OCL.VariableExpImpl.class);
		ignore.add(atl.metamodel.OCL.OperatorCallExpImpl.class);
		ignore.add(atl.metamodel.OCL.OclModelElementImpl.class);

		
		ignore.add(atl.metamodel.OCL.StringExpImpl.class);
		ignore.add(atl.metamodel.OCL.IntegerExpImpl.class);
		ignore.add(atl.metamodel.OCL.BooleanExpImpl.class);
		ignore.add(atl.metamodel.OCL.OclUndefinedExpImpl.class);
		
	}

	public static void slice(ErrorSlice slice, OclExpression expr) {
		slice(slice, expr, false);
	}
	
	public static void slice(ErrorSlice slice, OclExpression expr, boolean isExternalDependency) {
		ExpressionAnnotation exprAnn = addExprType(slice, expr); 

		if ( expr instanceof PropertyCallExp ) {
			PropertyCallExp pc = (PropertyCallExp) expr;
			slice(slice, pc.getSource(), isExternalDependency);
		}
		
		if ( expr instanceof IteratorExp ) {
			IteratorExp it = (IteratorExp) expr; 
			slice(slice, it.getBody(), isExternalDependency);

		} else if ( expr instanceof IterateExp ) {
			IterateExp it = (IterateExp) expr; 
			slice(slice, it.getBody(), isExternalDependency);
			slice(slice, it.getResult().getInitExpression());
		} else if ( expr instanceof OperationCallExp || expr instanceof NavigationOrAttributeCallExp ) {	
			PropertyCallExp pce = null;
			if ( expr instanceof NavigationOrAttributeCallExp ) {
				EStructuralFeature f = (EStructuralFeature) exprAnn.getUsedFeature();
				if ( f != null )
					slice.addExplicitFeature(f);
				
				pce = (PropertyCallExp) expr;
			} else if ( expr instanceof OperationCallExp ) {			
				OperationCallExp op = (OperationCallExp) expr;
				for(OclExpression arg : op.getArguments()) {
					slice(slice, arg, isExternalDependency);
				}
				
				pce = op;
			}

			CallExprAnn ann = (CallExprAnn) slice.getTypingModel().getAnnotation(pce.original_());
			if ( ! ann.isIsStaticCall() ) {
				EList<ContextHelperAnn> resolvers = ann.getDynamicResolvers();
				for (ContextHelperAnn contextHelperAnn : resolvers) {
					if ( slice.addHelper(contextHelperAnn) ) {
						OclExpression body = (OclExpression) slice.getATLModel().findWrapper(contextHelperAnn.getExpr().getExpr());
						slice(slice, body, true);
					}
				}	
			} else {
				// System.out.println("OclSlice - OperationCall not generating static call");
			}
			
		} else if ( expr instanceof CollectionExp ) {
			for(OclExpression arg : ((CollectionExp) expr).getElements()) {
				slice(slice, arg, isExternalDependency);
			}			
		} else if ( expr instanceof IfExp ) {
			IfExp ifExp = (IfExp) expr;
			slice(slice, ifExp.getCondition(), isExternalDependency);
			
			if ( isExternalDependency ) {
				slice(slice, ifExp.getThenExpression(), isExternalDependency);
				slice(slice, ifExp.getElseExpression(), isExternalDependency);
			} else {				
				// Not the branches!!! because the corresponding branch should be done by the
				// corresponding node in the condition graph
				// Well... I'm doing the branches to make this easier. Spourious helpers may be generated...
				slice(slice, ifExp.getThenExpression(), true);
				slice(slice, ifExp.getElseExpression(), true);				
			}
			// slice(slice, ifExp)
		} else if ( expr instanceof LetExp ) {
			LetExp let = (LetExp) expr;
			slice(slice, let.getVariable().getInitExpression(), isExternalDependency);
			slice(slice, let.getIn_(), isExternalDependency);
		} else if ( expr instanceof EnumLiteralExp ) {
			// TODO: NOT SURE IF ENUMLITERAL SHOULD BE PART OF THE SLICE!
		} else if ( ignore.contains(expr.getClass()) ) {
			// Ignore
		} else {
			throw new UnsupportedOperationException(expr.getClass().getName());
		}
	}

	private static ExpressionAnnotation addExprType(ErrorSlice slice, OclExpression expr) {
		ExpressionAnnotation exprAnn = (ExpressionAnnotation) slice.getTypingModel().getAnnotation(expr.original_());
		if ( exprAnn.getType() instanceof Metaclass ) {
			slice.addExplicitMetaclass((Metaclass) exprAnn.getType());
		}
		return exprAnn;
	}

}
