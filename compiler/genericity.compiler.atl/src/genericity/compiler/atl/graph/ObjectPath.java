package genericity.compiler.atl.graph;

import atl.metamodel.OCL.VariableDeclaration;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

public class ObjectPath {

	private Metaclass	metaclass;
	private VariableDeclaration	variable;
	private ExpressionAnnotation	filter;

	public ObjectPath(Metaclass c, VariableDeclaration variable) {
		this.metaclass = c;
		this.variable = variable;
	}

	public void addConstraint(ExpressionAnnotation filter) {
		// TODO: Check that only the declared variable is used in the expression
		this.filter = filter;
	}
	
	
}
