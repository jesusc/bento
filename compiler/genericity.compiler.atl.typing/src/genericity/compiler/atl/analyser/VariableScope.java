package genericity.compiler.atl.analyser;

import java.util.HashMap;

import org.eclipse.emf.ecore.util.EcoreUtil;

import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.Type;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;

public class VariableScope {

	private Scope current = new Scope();
	
	public static VariableExp findStartingVarExp(OclExpression src) {
		// find the start of the expression
		while ( ! (src instanceof VariableExp )) {
			src = ((PropertyCallExp) src).getSource();
		}
		VariableExp ve = (VariableExp) src;
		return ve;
	}
	
	public void putKindOf(VariableDeclaration vd, OclExpression source, Type exprType) {
		OclKindOfApplication app = new OclKindOfApplication(vd, source, exprType);
		current.applications.put(OclGenerator.gen(source), app);
	}

	public Type getKindOf(OclExpression expr) {
		OclKindOfApplication r = current.applications.get(OclGenerator.gen(expr));
		if ( r != null && findStartingVarExp(expr).getReferredVariable() == r.vd ) {
			/*
			if ( findStartingVarExp(expr) != r.vd) {
				System.out.println("Additional! " + expr.getLocation() + OclGenerator.gen(expr)+ " : " + r.exprType);
			}
			*/
			return r.exprType;
		}
		return null;
	}

	public void openScope() {
		current = new Scope(current); 
	}
	
	public void closeScope() {
		current = current.parent;
		if ( current == null )
			new IllegalStateException();
	}
	
	public boolean isEmpty() {
		return current.applications.isEmpty();
	}
	
	private class Scope {
		private HashMap<String, OclKindOfApplication> applications;
		private Scope parent;
		
		public Scope() {
			this.applications = new HashMap<String, VariableScope.OclKindOfApplication>();
		}
		
		public Scope(Scope parent) {
			this.parent = parent;
			this.applications = new HashMap<String, VariableScope.OclKindOfApplication>(parent.applications);
		}
		
	}
	
	private class OclKindOfApplication {
		private Type exprType;
		private OclExpression source;
		private VariableDeclaration vd;

		public OclKindOfApplication(VariableDeclaration vd, OclExpression source, Type exprType) {
			this.vd = vd;
			this.source = source;
			this.exprType = exprType;
		}
	}

	
}
