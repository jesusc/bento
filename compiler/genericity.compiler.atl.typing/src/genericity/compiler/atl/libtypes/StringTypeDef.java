package genericity.compiler.atl.libtypes;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.typing.atl_types.Type;

public class StringTypeDef extends AtlTypeDef {
	
	protected void init() {
		operation("size").returnType(AtlTypes.integer());
		operation("indexOf").returnType(AtlTypes.integer());
		
		operation("toInteger").returnType(AtlTypes.string());
		operation("toReal").returnType(AtlTypes.float_());

		operation("substring").returnType(AtlTypes.string());
		operation("firstToLower").returnType(AtlTypes.string());
		operation("toLower").returnType(AtlTypes.string());
		operation("toUpper").returnType(AtlTypes.string());
		operation("concat").returnType(AtlTypes.string());

		operation("regexReplaceAll").returnType(AtlTypes.string());

		operation("startsWith").returnType(AtlTypes.boolean_());
		operation("endsWith").returnType(AtlTypes.boolean_());

		
	}

	@Override
	protected Type getAnalyserType() {
		return AnalyserContext.getTypingModel().newStringType();
	}

}
