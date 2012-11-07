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

TOKENSTYLES {
	"->" COLOR #800040, BOLD;
}

RULES {
    Dsl.DefinitionRoot ::= 
    	component;   	

	Core.TransformationComponent ::= 
		"transformation" "component" name[] "{"
			(
			("source" source)
			("target" target)
			("source" sourceModels)
			("target" targetModels)
			)+
			
			("variants" (formalParameters)+ )?
			"definition" template
		"}";
	
	Core.Concept ::= "concept" name[] ":" uri['"', '"']
		("tags" ":" tags+)?
		// TODO: constraints	
	;

	Core.ParameterModel ::= "model" name[] ":" type[]
	;
	
	Core.Tag ::= value[];
		
	Technologies.AtlTemplate ::= "atl" template['"', '"'];
	Technologies.JavaTemplate ::= "java" qualifiedClassname['"', '"'];

    // Begin-of variantes (parameters, feature models)
    Variants.SingleFeature ::= "-" name[];
    Variants.XorFeature ::= "+" name[] "xor" ;
    // End-of variants

	// Begin-of composite components
	
	Core.CompositeComponent ::= 
		"composite" "component" name[] "{"
			("uses" uses['"', '"'])+
		
			(
			("source" source)
			("target" target)
			("source" sourceModels)
			("target" targetModels)
			)+

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
	
//	Flowcontrol.ApplyParameter ::= calledModelName[] ":" bindingName[] "(" calleeModelName[] ")"
//		;
	Flowcontrol.ApplyParameter ::= model[] 
		(":" (boundConceptQualifier[] "::" boundConcept[] "[" bindingName[] "]" | boundConcept[] "[" bindingName[] "]" ) )?
		;


	Flowcontrol.Seq ::= "seq"
		steps steps+
	;

			
	Flowcontrol.FeatureRef ::= feature[];
	// End-of composite components
}	