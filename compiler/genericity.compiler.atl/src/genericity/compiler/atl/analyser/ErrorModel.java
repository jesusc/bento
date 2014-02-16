package genericity.compiler.atl.analyser;

import atl.metamodel.ATL.LocatedElement;

public class ErrorModel {
	
	public void signalNoModel(String name, LocatedElement element) {
		signalNoRecoverableError("No model: " + name);
	}

	private Exception signalNoRecoverableError(String msg) {
		throw new RuntimeException(msg);
	}
}
