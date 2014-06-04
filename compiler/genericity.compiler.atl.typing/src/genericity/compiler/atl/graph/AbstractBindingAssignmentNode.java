package genericity.compiler.atl.graph;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.OclGeneratorAST;
import genericity.typing.atl_types.annotations.BindingAnn;
import atl.metamodel.ATL.Binding;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;
import bento.analysis.atl_analysis.Problem;

public abstract class AbstractBindingAssignmentNode<P extends Problem> extends AbstractProblemNode<P> {

	public AbstractBindingAssignmentNode(P p) {
		super(p);
	}
	
	protected OclExpression genBindingRightPart(CSPModel model, Binding binding, BindingAnn bindingAnn) {
		// Could I check if there are lazy rule calls to avoid this??
		OclExpression value = model.gen(binding.getValue(), new OclGeneratorAST.LazyRuleToOclUndefined());
		if ( TypeUtils.isCollection(bindingAnn.getSourceType()) ) {
			IteratorExp select = model.createIterator(value, "select");
			VariableDeclaration vd = select.getIterators().get(0);

			VariableExp varRef = model.create(VariableExp.class);
			varRef.setReferredVariable(vd);
			OperatorCallExp notUndefined = model.negateExpression(model.createOperationCall(varRef, "oclIsUndefined"));

			select.setBody(notUndefined);
			
			value = select;
		}
				
		return value;
	}

}
