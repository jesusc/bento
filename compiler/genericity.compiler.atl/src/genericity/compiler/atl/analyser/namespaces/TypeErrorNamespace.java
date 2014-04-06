package genericity.compiler.atl.analyser.namespaces;

import java.util.ArrayList;
import java.util.List;

import bento.analysis.atl_analysis.Problem;

import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.TypeError;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public class TypeErrorNamespace implements ITypeNamespace {

	private TypeError	typeError;
	private List<OclAction> actions = new ArrayList<OclAction>();
	private Problem	problem;
	
	public TypeErrorNamespace(Problem p, TypeError te) {
		this.problem   = p;
		this.typeError = te;
	}


	public Problem getProblem() {
		return problem;
	}
	
	@Override
	public Type getFeatureType(String featureName, LocatedElement node) {
		actions.add(new GetFeatureAction(featureName, node));
		return typeError;
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		actions.add(new GetOperationAction(operationName, arguments, node));
		return typeError;
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		return getOperationType(operatorSymbol, optionalArgument != null ? new Type[] { optionalArgument } : new Type[] {}, node );
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return true;
	}

	public Operation getAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}

	public boolean hasAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean hasFeature(String featureName) {
		return true;
	}

	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void extendType(String ruleName, Type returnType, Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type createType(boolean explicitOcurrence) {
		throw new UnsupportedOperationException();
	}

	public static class OclAction {
		protected LocatedElement	node;

		public OclAction(LocatedElement node) {
			this.node = node;
		}
	}
	
	public static class GetOperationAction extends OclAction {
		private Type[]	arguments;
		private String	operationName;

		public GetOperationAction(String operationName, Type[] arguments, LocatedElement node) {
			super(node);
			this.arguments = arguments;
			this.operationName = operationName;
		}
	}

	public static class GetFeatureAction extends OclAction {
		private String	featureName;

		public GetFeatureAction(String featureName, LocatedElement node) {
			super(node);
			this.featureName = featureName;
		}
	}
	
	
}
