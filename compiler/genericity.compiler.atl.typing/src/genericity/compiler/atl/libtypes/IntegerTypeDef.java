package genericity.compiler.atl.libtypes;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.typing.atl_types.Type;

public class IntegerTypeDef extends AtlTypeDef {
	
	@Override
	protected Type getAnalyserType() {
		return AnalyserContext.getTypingModel().newIntegerType();
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}
	
}
