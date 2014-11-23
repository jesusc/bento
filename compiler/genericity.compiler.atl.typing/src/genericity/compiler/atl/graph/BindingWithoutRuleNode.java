package genericity.compiler.atl.graph;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import genericity.typing.atl_types.annotations.BindingAnn;
import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Binding;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperatorCallExp;
import bento.analysis.atl_analysis.atl_error.BindingWithoutRule;

public class BindingWithoutRuleNode extends AbstractBindingAssignmentNode<BindingWithoutRule> implements ProblemNode {

	private Binding	binding;
	private BindingAnn bindingAnn;
	private ATLModel atlModel;

	public BindingWithoutRuleNode(BindingWithoutRule p, Binding binding, BindingAnn bindingAnn, ATLModel model) {
		super(p);
		this.binding = binding;
		this.bindingAnn = bindingAnn;
		this.atlModel   = model;
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}		
		
		for(ConstraintNode n : constraints) {
			n.genErrorSlice(slice);
		}		
		
		OclSlice.slice(slice, binding.getValue());
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "Problem with binding:\\n" + binding.getPropertyName() + " - no resolving rule" + "\\n" + binding.getLocation(), leadsToExecution);
	}


	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genTransformationSlice(slice);
		}		
		
		// throw new UnsupportedOperationException();
	}
	
	@Override
	public OclExpression genCSP(CSPModel model) {
		OclExpression result = null;
		
		OclExpression value = genBindingRightPart(model, binding, bindingAnn);
		if ( TypeUtils.isReference(bindingAnn.getSourceType()) ) {
			result = createReferenceConstraint(model, value);
		} else if ( TypeUtils.isCollection(bindingAnn.getSourceType()) ) {
			result = model.createCollectionOperationCall(value, "notEmpty");
		} else if ( TypeUtils.isUnionWithReferences(bindingAnn.getSourceType())) {
			result = createReferenceConstraint(model, value);
		} else {
			// TODO: For union types with mixed collections and mono-valued elements, Sequence { value }->flatten()
			throw new IllegalStateException(this.binding.getLocation() + " " + TypeUtils.typeToString(bindingAnn.getSourceType()));
		}
		
		return result;
	}

	private OperatorCallExp createReferenceConstraint(CSPModel model, OclExpression value) {
		return model.negateExpression(model.createOperationCall(value, "oclIsUndefined"));
	}

	@Override
	public boolean isStraightforward() {
		return false;
	}
	
	

}
