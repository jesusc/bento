package genericity.compiler.atl.csp;

import java.util.HashSet;

import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.OCL.CollectionExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IteratorExp;
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
		
	}
	
	public static void slice(ErrorSlice slice, OclExpression expr) {
		ExpressionAnnotation exprAnn = addExprType(slice, expr); 

		if ( expr instanceof PropertyCallExp ) {
			PropertyCallExp pc = (PropertyCallExp) expr;
			slice(slice, pc.getSource());
		}
		
		if ( expr instanceof NavigationOrAttributeCallExp ) {
			slice.addExplicitFeature((EStructuralFeature) exprAnn.getUsedFeature());
		} else if ( expr instanceof IteratorExp ) {
			IteratorExp it = (IteratorExp) expr; 
			slice(slice, it.getBody());
		} else if ( expr instanceof OperationCallExp ) {
			OperationCallExp op = (OperationCallExp) expr;
			for(OclExpression arg : op.getArguments()) {
				slice(slice, arg);
			}

			CallExprAnn ann = (CallExprAnn) slice.getTypingModel().getAnnotation(op.original_());
			if ( ! ann.isIsStaticCall() ) {
				EList<ContextHelperAnn> resolvers = ann.getDynamicResolvers();
				for (ContextHelperAnn contextHelperAnn : resolvers) {
					slice.addHelper(contextHelperAnn);
				}
				
			} else {
				System.out.println("OclSlice - OperationCall not generating static call");
			}
			
		} else if ( expr instanceof CollectionExp ) {
			for(OclExpression arg : ((CollectionExp) expr).getElements()) {
				slice(slice, arg);
			}			
		} else if ( expr instanceof IfExp ) {
			IfExp ifExp = (IfExp) expr;
			slice(slice, ifExp.getCondition());
			// Not the branches!!! because the corresponding branch should be done by the
			// corresponding node in the condition graph
			// slice(slice, ifExp)
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
