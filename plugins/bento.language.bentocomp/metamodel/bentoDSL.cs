SYNTAXDEF bento
FOR <http://www.miso.es/bento/bentocomp>
START Dsl.DefinitionRoot


OPTIONS {


	// defaultTokenName="TEXT";
//	basePackage = "genericity.language.gbind";
//	resourcePluginID   = "genericity.language.gbind.resource";
//	resourceUIPluginID = "genericity.language.gbind.resource.ui";
	overrideReferenceResolvers="false";
	overrideChangeReferenceQuickFix="false";

	usePredefinedTokens = "false";
	disableTokenSorting = "true";
	
}

TOKENS {
	// DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;

	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	DEFINE FRAGMENT CHAR $('A'..'Z'|'a'..'z')$;
	
	DEFINE FRAGMENT NAME CHAR + $($ + CHAR + $|$ + DIGIT + $)*$;
	DEFINE QNAME NAME + $('.'$ + NAME +$)+$;
	
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;

	DEFINE TEXT CHAR + $($ + CHAR + $|$ + DIGIT + $|'_')*$;
	DEFINE LINEBREAK $('\r\n'|'\'r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

TOKENSTYLES {
	"->" COLOR #800040, BOLD;
}

RULES {
    Dsl.DefinitionRoot ::= 
    	component;   	

	Core.TransformationComponent ::= 
		"transformation" "component" name[QNAME] "{"
			(
			("source" source)
			("target" target)
			("source" sourceModels)
			("target" targetModels)
			)+
			
			("variants" (formalParameters)+ )?
			"definition" template

			("version" version['"','"'])?			
			("contributos" (contributors[]|contributors['"', '"']) ("," (contributors[]|contributors['"', '"']))*)?
			("tags" tags ("," tags)*)?
		"}";
	
	Core.Concept ::= "concept" name[] ":" uri['"', '"']
		("tags" tags ("," tags)*)?
		// TODO: constraints	
	;

	Core.ParameterModel ::= "model" name[] ":" type[] ("=" resourceName['"','"'])?
	;
	
	Core.Tag ::= value[]|value['"','"'];
		
    // Begin-of variantes (parameters, feature models)
    Variants.SingleFeature ::= "-" name[];
    Variants.XorFeature ::= "+" name[] "xor" ;
    // End-of variants

	// Begin-of composite components
	
	Core.CompositeComponent ::= 
		"composite" "component" name[] "{"
			("uses" uses['"', '"'])+ 
			(bindings)*		
		
			(
			("source" source)
			("target" target)
			("source" sourceModels)
			("target" targetModels)
			)+

			("variants" (formalParameters)+ )?
			
			composition
			
			("tags" tags ("," tags)*)?
		"}";


	Core.BindingDeclaration ::= "binding" name[] "=" fileName['"', '"']
	;
		
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
	
	
	//Flowcontrol.ApplyParameter ::= model[] 
	//	(":" (boundConceptQualifier[] "::" boundConcept[] "[" binding[] "]" | boundConcept[] "[" binding[] "]" ) )?
	//	;

	Flowcontrol.ApplyParameter ::= 
		( model[]
		|  binding[] "(" model [] ")" )	
		;

	Flowcontrol.Seq ::= "seq"
		steps steps+
	;

			
	Flowcontrol.FeatureRef ::= feature[];
	// End-of composite components

	// Begin-of technologies
	Technologies.AtlTemplate ::= "atl" template['"', '"'] 
		"with" parameters ("," parameters)* ;
	Technologies.AtlParameter ::= atlModelName[] ( ":" atlMetamodelName[] )? "=" model[];
	//Technologies.AtlModelParameter ::= atlModelName[] "=" model[];
	//Technologies.AtlMetamodelParameter ::= atlModelName[] "=" concept[];
	Technologies.JavaTemplate ::= "java" qualifiedClassname['"', '"'];
	
	// End-of technologies
}	