SYNTAXDEF gcomponent
FOR <http://genericity/language/gcomponent>
START TransformationComponent


RULES {
	TransformationComponent ::= 
		"transformation" "component" name[] "{"
			("source" source)+
			("target" target)*
			"definition" template
		"}";
	
	Concept ::= "concept" name[] ":" uri['"', '"']
		("tags" ":" tags+)?
		// TODO: constraints	
	;
	
	Tag ::= value[];
		
	AtlTemplate ::= "atl" template['"', '"'];
}	