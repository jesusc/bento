SYNTAXDEF gbind
FOR <http://genericity/language/gbind>
START BindingModel

// </be.ac.vub.simpleocl/metamodel/simpleocl.genmodel>
// /be.ac.vub.simpleocl/metamodel/simpleocl.cs
IMPORTS {
	ocl : <http://soft.vub.ac.be/simpleocl/2011/SimpleOCL> <platform:/resource/be.ac.vub.simpleocl/metamodel/simpleocl.genmodel>
		WITH SYNTAX simpleocl_imported.ecore <platform:/resource/be.ac.vub.simpleocl/metamodel/simpleocl.cs>  
}

OPTIONS {
	usePredefinedTokens = "false";
	disableTokenSorting = "true";
}
	
RULES {

	BindingModel ::= "binding" name[] (metamodelURI['[', ']'])? 
	                 "for" metamodel[] (componentURI['[', ']'])?  
		"{"
			bindings*
			helpers*
		"}";
	
	ClassBinding ::= "class" concept[] "to" concrete[] ("," concrete[])* ;

	OclFeatureBinding ::= "feature" conceptClass[] (qualifier['[', ']'])? "." conceptFeature[] "=" 
		concrete : ocl.OclExpression;

	RenamingFeatureBinding ::= "feature" conceptClass[] (qualifier['[', ']'])? "." conceptFeature[] "is" 
		concreteFeature[];
        
        //template OclFeatureBinding :    
        //        "feature" conceptClass{refersTo = name, lookIn = #all} 
        //                (isDefined(qualifier) ? "[" qualifier{refersTo = name, lookIn = #all} "]" ) 
        //                "." conceptFeature "=" concrete
        //;

	
	// BaseHelper ::= ConceptHelper | LocalHelper;
	
	ConceptHelper ::= "operation" contextClass[] (qualifier['[', ']'])? "." feature[] ":" type "=" body : ocl.OclExpression;
	LocalHelper ::= "helper" context[]  "." feature[] ":" type "=" body : ocl.OclExpression;

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