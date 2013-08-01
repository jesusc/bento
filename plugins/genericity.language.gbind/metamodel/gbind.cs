SYNTAXDEF gbind
FOR <http://genericity/language/gbind>
START Dsl.BindingModel

// </be.ac.vub.simpleocl/metamodel/simpleocl.genmodel>
// /be.ac.vub.simpleocl/metamodel/simpleocl.cs
//IMPORTS {
//	ocl : <http://soft.vub.ac.be/simpleocl/2011/SimpleOCL> <platform:/resource/be.ac.vub.simpleocl/metamodel/simpleocl.genmodel>
//		WITH SYNTAX simpleocl_imported.ecore <platform:/resource/be.ac.vub.simpleocl/metamodel/simpleocl.cs>  
//}

OPTIONS {
	usePredefinedTokens = "false";
	disableTokenSorting = "true";
	basePackage = "genericity.language.gbind";
	resourcePluginID   = "genericity.language.gbind.resource";
	resourceUIPluginID = "genericity.language.gbind.resource.ui";
	overrideReferenceResolvers="false";

	// BEGIN-OF OCL 
	usePredefinedTokens = "false";
	disableTokenSorting = "true";
	overrideResourceFactory = "false";
	overrideBuilder = "false";
	overrideBuilderAdapter = "false";
	//overrideManifest = "false";
	disableLaunchSupport = "true";
	overrideLineBreakpoint = "false";
	//overrideLineBreakpointAdapter = "false";
	//overrideUIManifest = "false";
	//overrideNewFileWizard = "false";
	//overrideNewFileWizardPage = "false";
	//overrideNewProjectWizard = "false";
	//overrideUIPluginXML = "false";
	//overrideProjectFile = "false";
	//overrideBuildProperties = "false";
	// END-OF OCL
}

TOKENS {
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	DEFINE FRAGMENT CHAR $('A'..'Z'|'a'..'z')$;
	DEFINE NOTOP $'not'$;
	DEFINE BOOLOP $('and'|'or'|'xor'|'implies')$;
	DEFINE INTOP $('div'|'mod')$;
	DEFINE RELOP $('>'|'<'|'>='|'<=')$;
	DEFINE EQ $'='$;
	DEFINE NEQ $'<>'$;
	DEFINE ADDOP $('-'|'+')$;
	DEFINE MULOP $('*'|'/')$;
	DEFINE COMMENT $'--'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE FLOAT INTEGER + $'.'($ + DIGIT + $)+$;
	DEFINE INTEGER $'-'?($ + DIGIT + $)+$;
	DEFINE STRINGTYPE $'String'$;
	DEFINE BOOLEANTYPE $'Boolean'$;
	DEFINE INTEGERTYPE $'Integer'$;
	DEFINE REALTYPE $'Real'$;
	DEFINE COLLECTIONTYPE $'Collection'$;
	DEFINE BAGTYPE $'Bag'$;
	DEFINE ORDEREDSETTYPE $'OrderedSet'$;
	DEFINE SEQUENCETYPE $'Sequence'$;
	DEFINE SETTYPE $'Set'$;
	DEFINE OCLANYTYPE $'OclAny'$;
	DEFINE OCLTYPE $'OclType'$;
	DEFINE TUPLETYPE $'TupleType'$;
	DEFINE TUPLE $'Tuple'$;
	DEFINE MAPTYPE $'Map'$;
	DEFINE LAMBDATYPE $'Lambda'$;
	DEFINE ENVTYPE $'Env'$;
	DEFINE TEXT CHAR + $($ + CHAR + $|$ + DIGIT + $|'_')*$;
	DEFINE LINEBREAK $('\r\n'|'\'r'|'\n')$;
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
}

TOKENSTYLES {
	"NOTOP" COLOR #800040, BOLD;
	"BOOLOP" COLOR #800040, BOLD;
	"INTOP" COLOR #800040, BOLD;
	"static" COLOR #800040, BOLD;
	"COMMENT" COLOR #53876D;
	"FLOAT" COLOR #2A00FF;
	"INTEGER" COLOR #2A00FF;
	"STRINGTYPE" COLOR #00C000;
	"BOOLEANTYPE" COLOR #00C000;
	"INTEGERTYPE" COLOR #00C000;
	"REALTYPE" COLOR #00C000;
	"COLLECTIONTYPE" COLOR #00C000;
	"BAGTYPE" COLOR #00C000;
	"ORDEREDSETTYPE" COLOR #00C000;
	"SEQUENCETYPE" COLOR #00C000;
	"SETTYPE" COLOR #00C000;
	"OCLANYTYPE" COLOR #00C000;
	"OCLTYPE" COLOR #00C000;
	"TUPLE" COLOR #00C000;
	"TUPLETYPE" COLOR #00C000;
	"MAPTYPE" COLOR #00C000;
	"LAMBDATYPE" COLOR #00C000;
	"ENVTYPE" COLOR #00C000;
	"true" COLOR #00D0FF;
	"false" COLOR #00D0FF;
	"iterate" COLOR #000000;
}

RULES {
	Simpleocl.Module ::= "module" (name[]|name['"','"','\\']) ";" (!0 metamodels*)? (!0 imports*)? (!0 elements*)?;
	Simpleocl.Import ::= "import" (name[]|name['"','"','\\']) ";";
	@Foldable
	Simpleocl.OclFeatureDefinition ::= context_? static["static" : ""] "def" ":" feature;
	Simpleocl.OclContextDefinition ::= "context" context_;
	Simpleocl.OclMetamodel ::= "metamodel" (name[]|name['"','"','\\']) (":" uri['\'','\'','\\'])? ";";
	Simpleocl.OclInstanceModel ::= (name[]|name['"','"','\\']) ":" metamodel[];
	Simpleocl.LocalVariable ::= varName[] (":" type)? eq[EQ] initExpression;
	Simpleocl.Attribute ::= (name[]|name['"','"','\\']) ":" type eq[EQ] !1 initExpression ";";
	Simpleocl.Operation ::= (name[]|name['"','"','\\']) "(" (parameters ("," parameters)*)? ")" ":" returnType eq[EQ] !1 body ";";
	Simpleocl.Parameter ::= varName[] ":" type;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.OclModelElementExp ::= model[] "!" (name[]|name['"','"','\\']);

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.LambdaCallExp ::= referredVariable[] "(" (arguments ("," arguments)*)? ")";
	
	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.VariableExp ::= referredVariable[];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.SuperExp ::= "super";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.SelfExp ::= "self";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.EnvExp ::= "env";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.StringExp ::= stringSymbol['\'', '\'', '\\'];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.BooleanExp ::= booleanSymbol["true" : "false"];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.RealExp ::= realSymbol[FLOAT];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.IntegerExp ::= integerSymbol[INTEGER];

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.BagExp ::= "Bag" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.OrderedSetExp ::= "OrderedSet" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.SequenceExp ::= "Sequence" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.SetExp ::= "Set" "{" (elements ("," elements)*)? "}";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.TupleExp ::= "Tuple" "{" (tuplePart ("," tuplePart)*)? "}";

	Simpleocl.TuplePart ::= (varName[]|varName['"','"','\\']) (":" type)? eq[EQ] initExpression;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.MapExp ::= "Map" "{" (elements ("," elements)*)? "}";

	Simpleocl.MapElement ::= "(" key "," value ")";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.EnumLiteralExp ::= "#" (name[]|name['"','"','\\']);

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.OclUndefinedExp ::= "OclUndefined";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.LetExp ::= "let" variable "in" in_;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.IfExp ::= "if" condition "then" thenExpression "else" elseExpression "endif";

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.BraceExp ::= "(" exp ")";

	@Operator(type="binary_left_associative", weight="1", superclass="OclExpression")
	Simpleocl.OperatorCallExp ::= source operationName[BOOLOP] argument;

	@Operator(type="binary_left_associative", weight="2", superclass="OclExpression")
	Simpleocl.EqOpCallExp ::= source (operationName[EQ]|operationName[NEQ]) argument;

	@Operator(type="binary_left_associative", weight="3", superclass="OclExpression")
	Simpleocl.RelOpCallExp ::= source operationName[RELOP] argument;

	@Operator(type="binary_left_associative", weight="4", superclass="OclExpression")
	Simpleocl.AddOpCallExp ::= source operationName[ADDOP] argument;

	@Operator(type="binary_left_associative", weight="5", superclass="OclExpression")
	Simpleocl.IntOpCallExp ::= source operationName[INTOP] argument;

	@Operator(type="binary_left_associative", weight="6", superclass="OclExpression")
	Simpleocl.MulOpCallExp ::= source operationName[MULOP] argument;

	@Operator(type="unary_prefix", weight="7", superclass="OclExpression")
	Simpleocl.NotOpCallExp ::= operationName[NOTOP] source;

	@Operator(type="primitive", weight="20", superclass="OclExpression")
	Simpleocl.StaticPropertyCallExp ::= source staticCall;
	
	Simpleocl.StaticOperationCall ::= "::" (operationName[]|operationName['"','"','\\']) "(" (arguments ("," arguments)*)? ")";
	Simpleocl.StaticNavigationOrAttributeCall ::= "::" (name[]|name['"','"','\\']);

	@Operator(type="unary_postfix", weight="10", superclass="OclExpression")
	Simpleocl.PropertyCallExp ::= source calls+;

	Simpleocl.OperationCall ::= "." (operationName[]|operationName['"','"','\\']) "(" (arguments ("," arguments)*)? ")";
	Simpleocl.NavigationOrAttributeCall ::= "." (name[]|name['"','"','\\']);
	Simpleocl.IterateExp ::= "->" "iterate" "(" iterators ("," iterators)* ";" result "|" body ")";
	Simpleocl.IteratorExp ::= "->" (name[]|name['"','"','\\']) "(" iterators ("," iterators)* "|" body ")";
	Simpleocl.Iterator ::= varName[] (":" type)?;
	Simpleocl.CollectionOperationCall ::= "->" (operationName[]|operationName['"','"','\\']) "(" (arguments ("," arguments)*)? ")";

	Simpleocl.CollectionType ::= name[COLLECTIONTYPE] "(" elementType ")";
	Simpleocl.StringType ::= name[STRINGTYPE];
	Simpleocl.BooleanType ::= name[BOOLEANTYPE];
	Simpleocl.IntegerType ::= name[INTEGERTYPE];
	Simpleocl.RealType ::= name[REALTYPE];
	Simpleocl.BagType ::= name[BAGTYPE] "(" elementType ")";
	Simpleocl.OrderedSetType ::= name[ORDEREDSETTYPE] "(" elementType ")";
	Simpleocl.SequenceType ::= name[SEQUENCETYPE] "(" elementType ")";
	Simpleocl.SetType ::= name[SETTYPE] "(" elementType ")";
	Simpleocl.OclAnyType ::= name[OCLANYTYPE];
	Simpleocl.OclType ::= name[OCLTYPE];
	Simpleocl.TupleType ::= (name[TUPLETYPE]|name[TUPLE]) "(" (attributes ("," attributes)*)? ")";
	Simpleocl.TupleTypeAttribute ::= (name[]|name['"','"','\\']) ":" type;
	Simpleocl.OclModelElement ::= model[] "!" (name[]|name['"','"','\\']);
	Simpleocl.MapType ::= name[MAPTYPE] "(" keyType "," valueType ")";
	Simpleocl.LambdaType ::= name[LAMBDATYPE] "(" (argumentTypes ("," argumentTypes)*)? ")" ":" returnType;
	Simpleocl.EnvType ::= name[ENVTYPE];
	// END-OF OclRules

	Dsl.BindingModel ::= "binding" name[] 
		"{"
			(options)?

			"concept" boundConcept
			"metamodel" boundMetamodel
			(virtualMetaclasses)?
			bindings*
			helpers*
			
		"}";
	
	Dsl.BindingOptions ::= enableClassMerge["enable-class-merge": ""];
	
	Dsl.MetamodelDeclaration ::= name[] ":" metamodelURI['"','"','\\'];
	
	Dsl.ClassBinding ::= "class" concept[] "to" concrete[] ("," concrete[])* 
		( "when" whenClause )?;

//	Dsl.IntermediateClassBinding ::= "class" concept[] "to" concreteSource[] "." (concreteReferenceSource[]|concreteReferenceSource['"','"','\\']) ":" concreteTarget[] "." (concreteReferenceSource[]|concreteReferenceSource['"','"','\\'])  
//		;
	
	
	Dsl.IntermediateClassBinding ::= "class" concept[] "to" concreteClass[] "." concreteReference "/" conceptContext[] "." (conceptReferenceName[]|conceptReferenceName['"','"','\\'])	
	
		"{" featureBindings+ "}";

	Dsl.ConcreteReferencDeclaringVar ::= (varName[]|varName['"','"','\\']);
	
//-- class FlowEdge to Node.outgoing
//--      where FlowEdge.in = outgoing
//--            FlowEdge.out = self
//--            FlowEdge.isLiteral = 'xxx'

	Dsl.VirtualMetaclass ::= "class" name[] "{"
		(references|attributes)*
	"}" "init" "=" init;
	
	Dsl.VirtualReference ::= "ref" (name[]|name['"','"','\\']) ":" (type_[]|type_['"','"','\\'])
	;

	Dsl.VirtualAttribute ::= "att" (name[]|name['"','"','\\']) ":" (type_)
	;

	Dsl.VirtualClassBinding ::= "class" concept[] "to" "virtual" virtual[]
		("in" refFeatures ("," refFeatures)* )?
	;
	
	Dsl.ConceptFeatureRef ::= conceptClass[] "." (featureName[]|featureName['"','"','\\']);

	Dsl.OclFeatureBinding ::= "feature" conceptClass[] (qualifier['[', ']'])? "." (conceptFeature[]|conceptFeature['"','"','\\']) "=" 
		concrete : Simpleocl.OclExpression; //ocl.OclExpression;

	Dsl.RenamingFeatureBinding ::= "feature" conceptClass[] (qualifier['[', ']'])? "." (conceptFeature[]|conceptFeature['"','"','\\']) "is" 
		(concreteFeature[]|concreteFeature['"','"','\\']);
        
        //template OclFeatureBinding :    
        //        "feature" conceptClass{refersTo = name, lookIn = #all} 
        //                (isDefined(qualifier) ? "[" qualifier{refersTo = name, lookIn = #all} "]" ) 
        //                "." conceptFeature "=" concrete
        //;

	
	// BaseHelper ::= ConceptHelper | LocalHelper;
	
	Dsl.ConceptHelper ::= "operation" contextClass[] (qualifier['[', ']'])? "." feature[] ":" type "=" body : Simpleocl.OclExpression; ////ocl.OclExpression;
	Dsl.LocalHelper ::= "helper" (context[]|context['"','"','\\'])  "." (feature[]|feature['"','"','\\']) ( "(" (parameters ("," parameters)*)? ")" )? ":" type "=" body : Simpleocl.OclExpression; //ocl.OclExpression;
	Dsl.HelperParameter ::= varName[] ":" type;
	

		//template BHelper :	
		//	"helper" contextClass{refersTo = name, lookIn = #all, autoCreate = ifmissing} 			
		//		"." feature ":" type "=" body

//	EntityModel ::= "model" types*;
//	Entity ::= abstract["abstract" : ""] "entity" name[] "{" features* "}";
//	DataType ::= "datatype" name[] ";";
//	Feature ::= kind[attribute:"att", reference:"ref", containment:"cont"] type[] name[] ";";


	// removed rules from SimpleOcl parser
	//@Override(remove="true")
	//ocl.Module ::= "removed";
	
	// MetaClass ::= "does not matter";
	
}