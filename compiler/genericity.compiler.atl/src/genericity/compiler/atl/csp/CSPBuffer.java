package genericity.compiler.atl.csp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import genericity.compiler.atl.csp.CSPBuffer.GenerationCommand;
import genericity.compiler.atl.csp.CSPBuffer.IfCommand;
import genericity.compiler.atl.graph.DependencyNode;
import genericity.typing.atl_types.annotations.ModuleCallableAnn;

public class CSPBuffer {


	//public static final String	OR	= "or";
	//public static final String	NESTED	= "nested";
	
	//private String concatMode = NESTED;
	
	private GenerationCommand initial     = new NullCommand();
	private GenerationCommand lastCommand = initial;
	
	/** 
	 * Generates an if context.
	 * 
	 * @param condition
	 * @param b
	 */
	public void generateIf(OclExpression condition, boolean branch) {
		generateIf(condition, "", branch);
	}
	
	public void generateIf(OclExpression condition, String postfix, boolean branch) {
		IfCommand command = new IfCommand(condition, postfix, branch);
		setLastCommand(command);
	}
	
	protected void setLastCommand(GenerationCommand newCommand) {
		lastCommand.setNested(newCommand); //, concatMode);
		lastCommand = newCommand;		
	}

	public void generateLoop(OclExpression receptor, String selector, String varName) {
		LoopCommand command = new LoopCommand(receptor, selector, varName);
		setLastCommand(command);
	}

	public void generateLoop(String receptorText, String selector, String varName) {
		LoopCommandText command = new LoopCommandText(receptorText, selector, varName);
		setLastCommand(command);
	}

	public void generateCallContext(PropertyCallExp call, boolean isThisModuleCall, ModuleCallableAnn moduleCallableAnn) {
		CallContext command = new CallContext(call, isThisModuleCall, moduleCallableAnn);
		setLastCommand(command);
	}

	public void generateExpression(String exprText) {
		Expression command = new Expression(exprText);
		setLastCommand(command);
	}
	
	public void generateOr() {
		GenOr command = new GenOr();
		setLastCommand(command);
	}
	
	// Commands
	
	public static abstract class GenerationCommand {
		protected GenerationCommand	nested;
		private String	subSelfVar;

		protected void setNested(GenerationCommand command) {
			this.nested = command;
		}

		protected String getNestedText(int tab) {
			return this.nested == null ? t(tab) + "true" : nested.getText(tab); 
		}
		
		public abstract String getText(int tab);
		
		public String t(int tab) {
			String s = "";
			for(int i = 0; i < tab; i++) s += "   "; //"\t";
			return s;
		}

		protected void prepareSelf(String var) {
			this.subSelfVar = var;
		}
		
		protected String genOcl(OclExpression expr) {
			Map<String, String> vars = new HashMap<String, String>();
			if ( subSelfVar != null )
				vars.put("self", subSelfVar);
			return OclGenerator.gen(expr, vars);	
		}

	}	

	public static class NullCommand extends GenerationCommand {

		@Override
		public String getText(int tab) {
			if ( nested == null ) return "TODO: Expected nested in NullCommand";
			return nested.getText(tab);
		}
		
	}
	
	public static class IfCommand extends GenerationCommand {
		private boolean	branch;
		private OclExpression	condition;
		private String	postfix;

		public IfCommand(OclExpression condition, String postfix, boolean branch) {
			this.condition = condition;
			this.branch    = branch;
			this.postfix   = postfix;
		}
		
		@Override
		public String getText(int tab) {
			// Optimization
			if ( nested == null ) {
				 return t(tab) + (!branch ? "not" : "") + genOcl(condition) + postfix;
			}
			
			String t = branch ? getNestedText(tab + 1) : t(tab + 1) + "false";
			String f = branch ? t(tab + 1) + "false" : getNestedText(tab + 1);
			String s = t(tab) + "if " + genOcl(condition) + postfix + " then\n" + t + "\n" + t(tab) + "else\n" + f + "\n" + t(tab) + "endif"; 
			return s;
		}		
	}

	public static class LoopCommand extends GenerationCommand {
		private String	selector;
		private OclExpression	receptor;
		private String	varName;

		public LoopCommand(OclExpression receptor, String selector, String varName) {
			this.receptor = receptor;
			this.selector = selector;
			this.varName  = varName;
		}
		

		@Override
		public String getText(int tab) {
			return t(tab) + OclGenerator.gen(receptor) + "->" + selector + "(" + varName + "|\n" +
						nested.getText(tab + 1) + 
					t(tab) + ")";
		}
		
	}

	public static class LoopCommandText extends GenerationCommand {
		private String selector;
		private String receptor;
		private String	varName;

		public LoopCommandText(String receptor, String selector, String varName) {
			this.receptor = receptor;
			this.selector = selector;
			this.varName  = varName;
		}

		@Override
		public String getText(int tab) {
			return t(tab) + receptor + "->" + selector + "(" + varName + "|\n" +
						getNestedText(tab + 1) +
						// nested.getText(tab + 1) + 
					t(tab) + ")";
		}

	}

	public static class CallContext extends GenerationCommand {
		private OclExpression receptor;
		private boolean	isThisModuleCall;
		private ModuleCallableAnn	moduleCallableAnn;
		private PropertyCallExp	call;

		public CallContext(PropertyCallExp call, boolean isThisModuleCall, ModuleCallableAnn moduleCallableAnn) {
			this.call = call;
			this.receptor = call.getSource();
			this.isThisModuleCall = isThisModuleCall;
			this.moduleCallableAnn = moduleCallableAnn;
		}
		
		@Override
		public String getText(int tab) {
			if ( isThisModuleCall ) {
				String argBinding = "";
				for(int i = 0; i < moduleCallableAnn.getArguments().size(); i++) {
					String varName = moduleCallableAnn.getNames().get(i);
					OclExpression formalParameter = ((OperationCallExp) call).getArguments().get(i);
					argBinding += t(tab) + "let " + varName + " = " + OclGenerator.gen(formalParameter) + " in\n";
				}
				return argBinding + nested.getText(tab + 1);
			} else {
				String genVar = "_x_";
				nested.prepareSelf(genVar);
				return t(tab) + "let " + genVar + " = " + OclGenerator.gen(receptor) + " in\n" +
						nested.getText(tab + 1);
			}
		}		
	}
	
	public static class Expression extends GenerationCommand {
		private String exprText;

		public Expression(String exprText) {
			this.exprText = exprText;
		}
		
		@Override
		protected void setNested(GenerationCommand command) {
			throw new IllegalStateException("No nested allowd in expression node");
		}
		
		@Override
		public String getText(int tab) {
			return t(tab) + exprText;
		}
		
	}

	public static class GenOr extends GenerationCommand {
				
		@Override
		public String getText(int tab) {
			return "or" + getNestedText(tab);
		}
		
	}

	public String getText() {
		return initial.getText(0);
	}

	

	

	

	
}
