package genericity.compiler.atl.csp;

import java.util.HashSet;

import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclipse.emf.ecore.EStructuralFeature;

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
