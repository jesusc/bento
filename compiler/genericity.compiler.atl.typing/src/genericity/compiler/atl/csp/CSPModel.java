package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.csp.OclGeneratorAST.LazyRuleCallTransformationStrategy;
import genericity.typing.atl_types.Metaclass;

import java.nio.channels.IllegalSelectorException;
import java.util.HashMap;
import java.util.Stack;

import atl.metamodel.ATLModel;
import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclModel;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;
import bento.analyser.util.AtlLoader;

public class CSPModel {

	private ATLModel atlModel;
	private OclGeneratorAST generator;
	private Analyser analyser;

	public CSPModel(AtlLoader loader, Analyser analyser) {
		atlModel = loader.create("problem");
		generator = new OclGeneratorAST(atlModel, analyser.getTyping());
	}

	public <T> T create(Class<T> clazz) {
		return atlModel.create(clazz);		
	}

	public OperationCallExp createAllInstances(Metaclass metaclass) {
		OclModelElement classRef = atlModel.create(OclModelElement.class);
		classRef.setName(metaclass.getName());

		OperationCallExp allInstancesCall = atlModel.create(OperationCallExp.class);
		allInstancesCall.setOperationName("allInstances");
		allInstancesCall.setSource(classRef);
		
		return allInstancesCall;
	}

	public IteratorExp createExists(OclExpression source, String iteratorVarName) {
		IteratorExp exists = atlModel.create(IteratorExp.class);
		exists.setName("exists");
		exists.setSource(source);
		Iterator it = atlModel.create(Iterator.class);
		it.setVarName(iteratorVarName);
		exists.addIterators(it);
		
		return exists;
	}


	public IteratorExp createIterator(OclExpression source, String iteratorName) {
		String iteratorVarName = "i" + genId();
		IteratorExp iterator = atlModel.create(IteratorExp.class);
		iterator.setName(iteratorName);
		iterator.setSource(source);
		Iterator it = atlModel.create(Iterator.class);
		it.setVarName(iteratorVarName);
		iterator.addIterators(it);
		
		return iterator;		
	}
	
	public BooleanExp createBooleanLiteral(boolean b) {
		BooleanExp exp = atlModel.create(BooleanExp.class);
		exp.setBooleanSymbol(b);
		return exp;
	}

	public IfExp createIfExpression(OclExpression condition, OclExpression trueBranch, OclExpression falseBranch) {
		IfExp exp = atlModel.create(IfExp.class);
		if ( trueBranch != null )
			exp.setThenExpression(trueBranch);
		if ( falseBranch != null )
			exp.setElseExpression(falseBranch);
		exp.setCondition(condition);
		return exp;
	}


	public OperationCallExp createOperationCall(OclExpression source, String opName) {
		OperationCallExp exp = atlModel.create(OperationCallExp.class);
		exp.setOperationName(opName);
		exp.setSource(source);
		return exp;
	}
	
	public OperatorCallExp negateExpression(OclExpression source) {
		OperatorCallExp exp = atlModel.create(OperatorCallExp.class);
		exp.setOperationName("not");
		exp.setSource(source);
		return exp;
	}

	public CollectionOperationCallExp createCollectionOperationCall(OclExpression source, String opName) {
		CollectionOperationCallExp exp = atlModel.create(CollectionOperationCallExp.class);
		exp.setOperationName(opName);
		exp.setSource(source);
		return exp;
	}
	
	private int nextId = 1;
	public LetExp createLetScope(OclExpression newVarExpr, OclExpression result, String varName) {
		LetExp let = atlModel.create(LetExp.class);
		VariableDeclaration vd = atlModel.create(VariableDeclaration.class);
		// No type : vd.setType(?)
		vd.setVarName(varName + genId());
		vd.setInitExpression(newVarExpr);
		let.setVariable(vd);
		if ( result != null )
			let.setIn_(result);
		        
		return let;
	}

	private int genId() {
		return nextId++;
	}

	public OperatorCallExp createBinaryOperator(OclExpression expr1, OclExpression expr2, String opName) {
		OperatorCallExp exp = atlModel.create(OperatorCallExp.class);
		exp.setOperationName(opName);
		exp.setSource(expr1);
		exp.addArguments(expr2);
		return exp;		
	}
	
	public OperationCallExp createKindOf(OclExpression receptor, String modelName, String className) {
		OperationCallExp op = create(OperationCallExp.class);
		op.setOperationName("oclIsKindOf");
		op.setSource(receptor);
		
		OclModelElement m = create(OclModelElement.class);
		m.setName(className);
		op.addArguments(m);
		
		if ( modelName != null ) {
			OclModel model = create(OclModel.class);
			model.setName(modelName);
			m.setModel(model);
		}
		
		return op;
	}

	public OperationCallExp createCastTo(VariableDeclaration varToBeCasted, String className) {
		VariableExp refToVarDcl = create(VariableExp.class);
		refToVarDcl.setReferredVariable(varToBeCasted);	
				
		OperationCallExp opCall = createOperationCall(refToVarDcl, "oclAsType");
		
		OclModelElement m = create(OclModelElement.class);
		m.setName(className);
		
		opCall.addArguments(m);
		return opCall;
	}
	
	public IteratorExp createThisModuleContext() {
		OclModelElement m = create(OclModelElement.class);
		m.setName(Analyser.USE_THIS_MODULE_CLASS);

		OperationCallExp op = create(OperationCallExp.class);
		op.setOperationName("allInstances");
		op.setSource(m);
		
		return createExists(op, "thisModule");
	}
	
	
	public OclExpression createKindOf_AllInstancesStyle(OclExpression receptor, String modelName, String className) {
		OclModelElement m = create(OclModelElement.class);
		m.setName(className);

		OperationCallExp op = create(OperationCallExp.class);
		op.setOperationName("allInstances");
		op.setSource(m);
		
		CollectionOperationCallExp colOp = create(CollectionOperationCallExp.class);
		colOp.setOperationName("includes");
		colOp.setSource(op);
		colOp.addArguments(receptor);
		
		if ( modelName != null ) {
			OclModel model = create(OclModel.class);
			model.setName(modelName);
			m.setModel(model);
		}
		
		return colOp;
	}
	
	public OclExpression gen(OclExpression expr) {
		return generator.gen(expr, scope);
	}
	

	public OclExpression gen(OclExpression expr, OclGeneratorAST.LazyRuleCallTransformationStrategy strategy) {
		LazyRuleCallTransformationStrategy oldStrategy = generator.getLazyRuleStrategy();
		generator.setLazyRuleStrategy(strategy);
		OclExpression value = generator.gen(expr, scope);		
		generator.setLazyRuleStrategy(oldStrategy);
		return value;
	}


	private CSPModelScope scope = null; //new CSPModelScope();
	private Stack<CSPModelScope> previousScopes = new Stack<CSPModelScope>();

	public void addToScope(VariableDeclaration varDcl, VariableDeclaration newVar) {
		if ( scope.containsKey(varDcl) ) 
			throw new IllegalArgumentException("Variable already bound: " + varDcl.getVarName() + " - " + varDcl.getLocation());
		
		scope.put(varDcl, newVar);
	}
	
	public void resetScope() {
		scope.clear();
	}
	
	public void openEmptyScope() {
		previousScopes.push(scope);
		scope = new CSPModelScope(scope.getThisModuleVar());
		// scope.setThisModuleVariable(scope.getThisModuleVar());
	}

	public void closeScope() {
		scope = previousScopes.pop();
	}

	public void setThisModuleVariable(VariableDeclaration thisModule) {
		if ( scope != null )
			throw new IllegalSelectorException();
		scope = new CSPModelScope(thisModule);
		// scope.setThisModuleVariable(thisModule);
	}

	public static class CSPModelScope extends HashMap<VariableDeclaration, VariableDeclaration> {
		
		private VariableDeclaration thisModule;

		public CSPModelScope(VariableDeclaration thisModule) {
			this.thisModule = thisModule;			
		}
		
		/*
		public void setThisModuleVariable(VariableDeclaration thisModule) {
			this.thisModule = thisModule;
		}
		*/

		public CSPModelScope derive() {
			CSPModelScope r = new CSPModel.CSPModelScope(thisModule);
			r.putAll(this);
			// r.setThisModuleVariable(thisModule);
			return r;
		}
		
		public VariableDeclaration getVar(VariableExp expr) {
			VariableDeclaration vd = get( expr.getReferredVariable());
			if ( vd == null ) {
				if ( expr.getReferredVariable().getVarName().equals("thisModule") && thisModule != null )
					return thisModule;
				
				throw new IllegalStateException("Expected mapping for var " + expr.getReferredVariable().getVarName() + " => " + expr.getLocation());
			}
			return vd;
		}

		public VariableDeclaration getThisModuleVar() {
			if ( thisModule == null ) throw new IllegalStateException();
			return thisModule;
		}

	}

	
}
