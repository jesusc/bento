package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelVisitor;
import atl.metamodel.ATL.Unit;

public abstract class AbstractAnalyserVisitor extends ATLModelVisitor  {
	protected ComputedAttributes attr;
	
	protected Unit	root;
	protected TypingModel	typ;
	protected GlobalNamespace	mm;
	protected ErrorModel	errors;

	protected ATLModel	model;
	
	public AbstractAnalyserVisitor(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		this.model = model;
		this.root = root;
		this.typ  = typ;
		this.mm   = mm;
		this.errors = errors;
		// _debug = true;
	}
	
	
	protected void notImplementedYet() {
		throw new UnsupportedOperationException();
	}

	

}
