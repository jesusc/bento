package genericity.compiler.atl.graph;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.annotations.CallExprAnn;
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
	
	/*
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
	*/
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, start);
		generatedDependencies(slice);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(start));
	}

	@Override
	public void getCSPText(CSPBuffer buf) {
		this.getDependency().getCSPText(buf);
		
		//String s = "";
		//String g = OclGenerator.gen(start);
		String prefix = "";
		String postfix = "";
		
		
		if ( TypeUtils.isReference(ann.getType()) ) {
			// g = " not " + g + ".oclIsUndefined()";
			prefix = " not ";
			postfix = ".isUndefined()";
		} else if ( TypeUtils.isCollection(ann.getType()) ) {
			// g = g + "->size() > 0";
			postfix = "->size() > 0";
		} else if ( ann.getType() instanceof PrimitiveType ) {
			// The alternative is to strip the parts that refers to primitive types...
			prefix = " not ";
			postfix = ".isUndefined()";
	
			// throw new UnsupportedOperationException(ann.getType().getClass().toString());
			// g = g + "STRING_NOT_SUPPORTED";
		} else { 
			throw new UnsupportedOperationException(ann.getType().getClass().toString());
		}
		
		buf.generateExpression(start, prefix, postfix);
	}
	
}