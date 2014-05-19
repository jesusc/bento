package genericity.compiler.atl.graph;

import atl.metamodel.ATL.Binding;
import atl.metamodel.OCL.OclExpression;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.annotations.BindingAnn;

public class RuleResolutionNode extends AbstractDependencyNode implements ConstraintNode {

	private BindingAnn	bindingAnn;
	private Binding	atlBinding;

	public RuleResolutionNode(Binding atlBinding, BindingAnn bindingAnn) {
		this.atlBinding = atlBinding;
		this.bindingAnn = bindingAnn;
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}				
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(atlBinding.getValue()) + 
				": " + TypeUtils.typeToString(bindingAnn.getSourceType()) +"\\nresolvedBy", leadsToExecution);
	}

	@Override
	public void getCSPText(CSPBuffer buf) {
		String s = "";
		int i = 0;
		int n = getDependencies().size();
		for (DependencyNode d : getDependencies()) {
			CSPBuffer buf2 = new CSPBuffer();
			d.getCSPText(buf2);
			
			s += buf2.getText();
			if ( i + 1 < n ) {
				s += " or \n\t";
			}			
			i++;
		}
		
		buf.generateExpression(null, s, "");
		
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		throw new UnsupportedOperationException();
	}
	
}
