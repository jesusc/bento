SYNTAXDEF gcomponent
FOR <http://genericity/language/gcomponent>
START Dsl.DefinitionRoot

OPTIONS {

//	usePredefinedTokens = "false";
//	disableTokenSorting = "true";
//	basePackage = "genericity.language.gbind";
//	resourcePluginID   = "genericity.language.gbind.resource";
//	resourceUIPluginID = "genericity.language.gbind.resource.ui";
	overrideReferenceResolvers="false";
}

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
}

RULES {
    Dsl.DefinitionRoot ::= 
    	component;   	

	Core.TransformationComponent ::= 
		"transformation" "component" name[] "{"
			("source" source)+
			("target" target)*
			
			("variants" (formalParameters)+ )?
			"definition" template
		"}";
	
	Core.Concept ::= "concept" name[] ":" uri['"', '"']
		("tags" ":" tags+)?
		// TODO: constraints	
	;
	
	Core.Tag ::= value[];
		
	Core.AtlTemplate ::= "atl" template['"', '"'];

    // Begin-of variantes (parameters, feature models)
    Variants.SingleFeature ::= "-" name[];
    Variants.XorFeature ::= "+" name[] "xor" ;
    // End-of variants

	// Begin-of composite components
	
	Core.CompositeComponent ::= 
		"composite" "component" name[] "{"
			("uses" uses['"', '"'])+
		
			("source" source)+
			("target" target)*
			("variants" (formalParameters)+ )?
			
			composition
		"}";
		
	Flowcontrol.Composition ::= 
		"compose" step
	;
	
	Flowcontrol.Xor ::= "xor"
		("when" conditions)+
	;

	Flowcontrol.XorCond ::= value "->" step ;
	
	Flowcontrol.Apply ::= "apply" component[] 
		"(" inputModels ("," inputModels)* ")"
		"->" "(" outputModels? ("," outputModels)* ")"
		;
	
	Flowcontrol.ApplyParameter ::= calledModelName[] ":" bindingName[] "(" calleeModelName[] ")"
		;
			
	Flowcontrol.FeatureRef ::= feature[];
	// End-of composite components
}	