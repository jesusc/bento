package genericity.compiler.atl.graph;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;

public class DelimitedExpressionNode extends AbstractDependencyNode {

	private OclExpression	start;
	// private OclExpression	end;
	private ExpressionAnnotation	ann;

	public DelimitedExpressionNode(OclExpression start, ExpressionAnnotation ann) {
		this.start = start;
		this.ann   = ann;
		// this.end   = end;
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, start);
		generatedDependencies(slice);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(start), leadsToExecution);
	}


	@Override
	public OclExpression genCSP(CSPModel model) {
		OclExpression expr = model.gen(start);
		OclExpression check = null;
		
		if ( TypeUtils.isReference(ann.getType()) ) {
			// => not expr.oclIsUndefined()
			OperationCallExp isUndefined  = model.createOperationCall(expr, "oclIsUndefined");
			OperatorCallExp  notUndefined = model.negateExpression(isUndefined);
			
			check =  notUndefined;
		} else if ( TypeUtils.isCollection(ann.getType()) ) {
			// => not expr->notEmpty()
			CollectionOperationCallExp notEmpty = model.createCollectionOperationCall(expr, "notEmpty");
			
			check = notEmpty;
		} else if ( ann.getType() instanceof PrimitiveType ) {
			// => not expr.oclIsUndefined()
			OperationCallExp isUndefined  = model.createOperationCall(expr, "oclIsUndefined");
			OperatorCallExp  notUndefined = model.negateExpression(isUndefined);
			
			check = notUndefined;
		} else { 
			throw new UnsupportedOperationException(ann.getType().getClass().toString());
		}
		
		// Optimization
		if ( getDepending() instanceof ProblemNode && ((ProblemNode) getDepending()).isStraightforward() ) {
			return check;
		}
		return model.createIfExpression(check, getDepending().genCSP(model), model.createBooleanLiteral(false));
	}

	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		throw new UnsupportedOperationException();
	}
	
}
