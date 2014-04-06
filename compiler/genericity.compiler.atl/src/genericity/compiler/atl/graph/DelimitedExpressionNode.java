package genericity.compiler.atl.graph;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import atl.metamodel.OCL.OclExpression;

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
	public String genCSP(String dependent) {
		// I could factorize in a let... somehow? Not the common case I guess
		String s = "";
		String g = OclGenerator.gen(start, null);
		
		if ( TypeUtils.isReference(ann.getType()) ) {
			g = " not " + g + ".oclIsUndefined()";					
		} else if ( TypeUtils.isCollection(ann.getType()) ) {
			g = g + ".size() > 0";					
		} else if ( ann.getType() instanceof StringType ) {
			g = g + "STRING_NOT_SUPPORTED";
		} else { 
			throw new UnsupportedOperationException(ann.getType().getClass().toString());
		}
		
		for(DependencyNode node : getDependencies()) {
			s += node.genCSP(g) + "\n";
		}
		return s;
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(start));
	}
	
}
