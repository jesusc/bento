grammar genericity_ocl_ANTLR3;options {
    backtrack = true;

}@header {package org.eclipse.gmt.tcs.injector;}@lexer::header {package org.eclipse.gmt.tcs.injector;}@lexer::members {

	private void newline() {}

	public org.eclipse.gmt.tcs.injector.TCSRuntime ei = null;

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		ei.reportError((Exception)e);
	}

	public Token emit() {
		org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken ret = null;

		ret = new org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken(input, type, channel, tokenStartCharIndex, getCharIndex()-1);
		ret.setLine(tokenStartLine);
		ret.setText(text);
	  	ret.setCharPositionInLine(tokenStartCharPositionInLine);
		ret.setEndLine(getLine());
		ret.setEndColumn(getCharPositionInLine());
		emit(ret);

		return ret;
	}

} @members {
    public org.eclipse.gmt.tcs.injector.TCSRuntime ei = null;
    
//	public void reportError(RecognitionException ex) {
//		ei.reportError((Exception)ex);
//	}
	
//	public void emitErrorMessage(String s) {
//		ei.reportError(s);
//	}

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		ei.reportError((Exception)e);
	}

	//TODO: what about warnings?
//	public void reportWarning(String s) {
//		ei.reportWarning(s);
//	}
	
    public static void main(String[] args) throws Exception {
						CharStream input = new ANTLRFileStream(args[0]);
    genericity_ocl_ANTLR3Lexer lex = new 
    genericity_ocl_ANTLR3Lexer(input);
						CommonTokenStream tokens = new CommonTokenStream(lex);
						tokens.discardTokenType(WS);
						tokens.discardTokenType(COMMENT);
						tokens.discardTokenType(NL);
						
    genericity_ocl_ANTLR3Parser parser = new 
    genericity_ocl_ANTLR3Parser(tokens);
						parser.main();
					}
}

main returns[Object ret2] @init {}
	:	((ret=oclConstraintsModel) EOF)
        {
            ret2=ret;
        }

	;

identifier returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=NAME {ret = ast.getText(); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

identifierOrKeyword returns[Object ret2] @init {java.lang.Object ret=null;}
	:	(ast=NAME {ret = ast.getText(); ei.setToken((Object)ast);}| 'constraints' {ret = "constraints";}| 'for' {ret = "for";}| 'context' {ret = "context";}| 'inv' {ret = "inv";}| 'description' {ret = "description";}| 'iterate' {ret = "iterate";}| 'OclUndefined' {ret = "OclUndefined";}| 'true' {ret = "true";}| 'false' {ret = "false";}| 'if' {ret = "if";}| 'then' {ret = "then";}| 'else' {ret = "else";}| 'endif' {ret = "endif";}| 'super' {ret = "super";}| 'let' {ret = "let";}| 'in' {ret = "in";}| 'Bag' {ret = "Bag";}| 'Set' {ret = "Set";}| 'OrderedSet' {ret = "OrderedSet";}| 'Sequence' {ret = "Sequence";}| 'Map' {ret = "Map";}| 'Tuple' {ret = "Tuple";}| 'OclType' {ret = "OclType";}| 'OclAny' {ret = "OclAny";}| 'TupleType' {ret = "TupleType";}| 'Integer' {ret = "Integer";}| 'Real' {ret = "Real";}| 'Boolean' {ret = "Boolean";}| 'String' {ret = "String";}| 'Collection' {ret = "Collection";}| 'not' {ret = "not";}| 'div' {ret = "div";}| 'mod' {ret = "mod";}| 'and' {ret = "and";}| 'or' {ret = "or";}| 'xor' {ret = "xor";}| 'implies' {ret = "implies";})
        {
            ret2=ret;
        }

	;

stringSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=STRING {ret = ei.unescapeString(ast.getText(), 1); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

integerSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=INT {ret = Integer.valueOf(ast.getText()); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

floatSymbol returns[Object ret2] @init {java.lang.Object ret=null;}
	:	ast=FLOAT {ret = Double.valueOf(ast.getText()); ei.setToken((Object)ast);}
        {
            ret2=ret;
        }

	;

oclConstraintsModel returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OclConstraintsModel", true, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('constraints' 'for' temp=identifier {ei.set(ret, "metamodel", temp);} LCURLY ((((temp=context {ei.set(ret, "contexts", temp);} ((temp=context {ei.set(ret, "contexts", temp);}))*))?)) RCURLY)
        {
            ei.leaveContext(true);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

context returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Context", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('context' temp=identifier {ei.setRef(ret, "metaclass_", "ConceptMetaclass", "name", temp, "#all", "ifmissing", null, false, null);} temp=oclInvariant {ei.set(ret, "invariant", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

metaclass returns[Object ret2] @init {}
	:	(ret=conceptMetaclass)
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

conceptMetaclass returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("ConceptMetaclass", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.set(ret, "name", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

oclInvariant returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OclInvariant", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('inv' ((temp=identifier {ei.set(ret, "name", temp);}) {}| () {}) COLON temp=oclExpression {ei.set(ret, "expr", temp);} (('description' COLON temp=identifier {ei.set(ret, "description", temp);}) {}| () {}))
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

oclModel returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OclModel", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.set(ret, "name", temp);} COLON temp=identifier {ei.setRef(ret, "metamodel", "OclModel", "name", temp, "#all", "ifmissing", null, false, null);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

oclModelElement returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OclModelElement", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.setRef(ret, "model", "OclModel", "name", temp, "#all", "ifmissing", null, false, null);} EXCL temp=identifier {ei.set(ret, "name", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

oclExpression returns[Object ret2] @init {}
	:	(ret=priority_5| ret=letExp)
        {
            ret2=ret;
        }

	;

iteratorExp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("IteratorExp", true, false) : null;}
	:	(temp=identifier {ei.set(ret, "name", temp);} LPAREN ((temp=iterator {ei.set(ret, "iterators", temp);} (((COMA) temp=iterator {ei.set(ret, "iterators", temp);}))*)) PIPE ((temp=oclExpression {ei.set(ret, "body", temp);})) RPAREN)
        {
            // discard operator name
            ei.set(ret, "source", left);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ei.leaveContext(true);
            ret2=ret;
        }

	;

iterateExp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("IterateExp", true, false) : null;}
	:	('iterate' LPAREN ((temp=iterator {ei.set(ret, "iterators", temp);} (((COMA) temp=iterator {ei.set(ret, "iterators", temp);}))*)) SEMI temp=variableDeclaration {ei.set(ret, "result", temp);} PIPE ((temp=oclExpression {ei.set(ret, "body", temp);})) RPAREN)
        {
            // discard operator name
            ei.set(ret, "source", left);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ei.leaveContext(true);
            ret2=ret;
        }

	;

collectionOperationCallExp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("CollectionOperationCallExp", false, false) : null;}
	:	(temp=identifier {ei.set(ret, "operationName", temp);} LPAREN ((temp=oclExpression {ei.set(ret, "arguments", temp);} (((COMA) temp=oclExpression {ei.set(ret, "arguments", temp);}))*))? RPAREN)
        {
            // discard operator name
            ei.set(ret, "source", left);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ei.leaveContext(false);
            ret2=ret;
        }

	;

operationCallExp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OperationCallExp", false, false) : null;}
	:	(temp=identifierOrKeyword {ei.set(ret, "operationName", temp);} LPAREN ((temp=oclExpression {ei.set(ret, "arguments", temp);} (((COMA) temp=oclExpression {ei.set(ret, "arguments", temp);}))*))? RPAREN)
        {
            // discard operator name
            ei.set(ret, "source", left);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ei.leaveContext(false);
            ret2=ret;
        }

	;

navigationOrAttributeCallExp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("NavigationOrAttributeCallExp", false, false) : null;}
	:	(temp=identifierOrKeyword {ei.set(ret, "name", temp);})
        {
            // discard operator name
            ei.set(ret, "source", left);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ei.leaveContext(false);
            ret2=ret;
        }

	;

operatorCallExp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OperatorCallExp", false, false) : null;}
	:
        {
            ei.set(ret, "operationName", opName);
            ei.set(ret, "source", left);
            // post actions performed in calling rule (i.e., priority_<n>)
            ei.leaveContext(false);
            ret2=ret;
        }

	;

iterator returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("Iterator", false, true) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.set(ret, "varName", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

oclUndefinedExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OclUndefinedExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('OclUndefined')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

primitiveExp returns[Object ret2] @init {}
	:	((ret=numericExp| ret=booleanExp| ret=stringExp))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

numericExp returns[Object ret2] @init {}
	:	((ret=integerExp| ret=realExp))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

booleanExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("BooleanExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	((('true') {ei.set(ret, "booleanSymbol", java.lang.Boolean.TRUE);}| ('false') {ei.set(ret, "booleanSymbol", java.lang.Boolean.FALSE);}))
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

integerExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("IntegerExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=integerSymbol {ei.set(ret, "integerSymbol", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

realExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("RealExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=floatSymbol {ei.set(ret, "realSymbol", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

stringExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("StringExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=stringSymbol {ei.set(ret, "stringSymbol", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

ifExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("IfExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('if' temp=oclExpression {ei.set(ret, "condition", temp);} 'then' ((temp=oclExpression {ei.set(ret, "thenExpression", temp);})) 'else' ((temp=oclExpression {ei.set(ret, "elseExpression", temp);})) 'endif')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

variableExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("VariableExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.setRef(ret, "referredVariable", "VariableDeclaration", "varName", temp, null, "ifmissing", null, false, null);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

superExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("SuperExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('super')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

letExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("LetExp", true, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('let' temp=variableDeclaration {ei.set(ret, "variable", temp);} 'in' ((temp=oclExpression {ei.set(ret, "in_", temp);})))
        {
            ei.leaveContext(true);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

variableDeclaration returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("VariableDeclaration", false, true) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.set(ret, "varName", temp);} COLON temp=oclType {ei.set(ret, "type", temp);} EQ temp=oclExpression {ei.set(ret, "initExpression", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

enumLiteralExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("EnumLiteralExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(SHARP temp=identifier {ei.set(ret, "name", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

collectionExp returns[Object ret2] @init {}
	:	((ret=bagExp| ret=setExp| ret=orderedSetExp| ret=sequenceExp))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

bagExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("BagExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Bag' LCURLY ((temp=oclExpression {ei.set(ret, "elements", temp);} (((COMA) temp=oclExpression {ei.set(ret, "elements", temp);}))*))? RCURLY)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

setExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("SetExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Set' LCURLY ((temp=oclExpression {ei.set(ret, "elements", temp);} (((COMA) temp=oclExpression {ei.set(ret, "elements", temp);}))*))? RCURLY)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

orderedSetExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OrderedSetExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('OrderedSet' LCURLY ((temp=oclExpression {ei.set(ret, "elements", temp);} (((COMA) temp=oclExpression {ei.set(ret, "elements", temp);}))*))? RCURLY)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

sequenceExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("SequenceExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Sequence' LCURLY ((temp=oclExpression {ei.set(ret, "elements", temp);} (((COMA) temp=oclExpression {ei.set(ret, "elements", temp);}))*))? RCURLY)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

mapExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("MapExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Map' LCURLY ((temp=mapElement {ei.set(ret, "elements", temp);} (((COMA) temp=mapElement {ei.set(ret, "elements", temp);}))*))? RCURLY)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

mapElement returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("MapElement", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(LPAREN temp=oclExpression {ei.set(ret, "key", temp);} COMA temp=oclExpression {ei.set(ret, "value", temp);} RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

tupleExp returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("TupleExp", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Tuple' LCURLY ((temp=tuplePart {ei.set(ret, "tuplePart", temp);} (((COMA) temp=tuplePart {ei.set(ret, "tuplePart", temp);}))*))? RCURLY)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

tuplePart returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("TuplePart", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifierOrKeyword {ei.set(ret, "varName", temp);} ((COLON temp=oclType {ei.set(ret, "type", temp);}) {}| () {}) EQ temp=oclExpression {ei.set(ret, "initExpression", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

oclType returns[Object ret2] @init {}
	:	((ret=oclModelElement| ret=oclAnyType| ret=tupleType| ret=mapType| ret=primitive| ret=collectionType| ret=oclType_abstractContents))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

oclAnyType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OclAnyType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('OclAny')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

tupleType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("TupleType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('TupleType' LPAREN ((temp=tupleTypeAttribute {ei.set(ret, "attributes", temp);} (((COMA) temp=tupleTypeAttribute {ei.set(ret, "attributes", temp);}))*))? RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

tupleTypeAttribute returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("TupleTypeAttribute", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(temp=identifier {ei.set(ret, "name", temp);} COLON temp=oclType {ei.set(ret, "type", temp);})
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

mapType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("MapType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Map' LPAREN temp=oclType {ei.set(ret, "keyType", temp);} COMA temp=oclType {ei.set(ret, "valueType", temp);} RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

primitive returns[Object ret2] @init {}
	:	((ret=numericType| ret=booleanType| ret=stringType))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

numericType returns[Object ret2] @init {}
	:	((ret=integerType| ret=realType))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

integerType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("IntegerType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Integer')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

realType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("RealType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Real')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

booleanType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("BooleanType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Boolean')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

stringType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("StringType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('String')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

collectionType returns[Object ret2] @init {}
	:	((ret=bagType| ret=setType| ret=orderedSetType| ret=sequenceType| ret=collectionType_abstractContents))
        {
            ei.addToContext(ret, false);
            ret2=ret;
        }

	;

bagType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("BagType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Bag' LPAREN temp=oclType {ei.set(ret, "elementType", temp);} RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

setType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("SetType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Set' LPAREN temp=oclType {ei.set(ret, "elementType", temp);} RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

orderedSetType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OrderedSetType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('OrderedSet' LPAREN temp=oclType {ei.set(ret, "elementType", temp);} RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

sequenceType returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("SequenceType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Sequence' LPAREN temp=oclType {ei.set(ret, "elementType", temp);} RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

priority_0 returns[Object ret2] @init {java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(ret=primary_oclExpression (((POINT {opName = ".";} (ret=operationCallExp[opName, ret, firstToken] | ret=navigationOrAttributeCallExp[opName, ret, firstToken] ))| (RARROW {opName = "->";} (ret=iteratorExp[opName, ret, firstToken] | ret=iterateExp[opName, ret, firstToken] | ret=collectionOperationCallExp[opName, ret, firstToken] ))))*)
        {
            ret2=ret;
        }

	;

priority_1 returns[Object ret2] @init {java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(('not' {opName = "not";} (ret=operatorCallExp[opName, right, firstToken] right=priority_0 {ei.set(ret, "source", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (MINUS {opName = "-";} (ret=operatorCallExp[opName, right, firstToken] right=priority_0 {ei.set(ret, "source", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (ret=priority_0))
        {
            ret2=ret;
        }

	;

priority_2 returns[Object ret2] @init {java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(ret=priority_1 (((STAR {opName = "*";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_1 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (SLASH {opName = "/";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_1 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| ('div' {opName = "div";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_1 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| ('mod' {opName = "mod";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_1 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))))*)
        {
            ret2=ret;
        }

	;

priority_3 returns[Object ret2] @init {java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(ret=priority_2 (((PLUS {opName = "+";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_2 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (MINUS {opName = "-";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_2 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))))*)
        {
            ret2=ret;
        }

	;

priority_4 returns[Object ret2] @init {java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(ret=priority_3 (((EQ {opName = "=";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_3 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (GT {opName = ">";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_3 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (LT {opName = "<";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_3 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (GE {opName = ">=";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_3 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (LE {opName = "<=";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_3 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| (NE {opName = "<>";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_3 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))))*)
        {
            ret2=ret;
        }

	;

priority_5 returns[Object ret2] @init {java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);}
	:	(ret=priority_4 ((('and' {opName = "and";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_4 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| ('or' {opName = "or";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_4 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| ('xor' {opName = "xor";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_4 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))| ('implies' {opName = "implies";} (ret=operatorCallExp[opName, ret, firstToken] right=priority_4 {ei.set(ret, "arguments", right);if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});}))))*)
        {
            ret2=ret;
        }

	;

oclType_abstractContents returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("OclType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('OclType')
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

collectionType_abstractContents returns[Object ret2] @init {Object ret=(backtracking==0) ? ei.create("CollectionType", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);}
	:	('Collection' LPAREN temp=oclType {ei.set(ret, "elementType", temp);} RPAREN)
        {
            ei.leaveContext(false);
            if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndLine() + ":" + (((org.eclipse.gmt.tcs.injector.wrappers.antlr3.ANTLR3LocationToken)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
            ret2=ret;
        }

	;

primary_oclExpression returns[Object ret2] @init {}
	:	((LPAREN ret=oclExpression RPAREN)| ret=variableExp| ret=oclUndefinedExp| ret=primitiveExp| ret=ifExp| ret=superExp| ret=enumLiteralExp| ret=collectionExp| ret=mapExp| ret=tupleExp| ret=oclType)
        {
            ret2=ret;
        }

	;

	
// testLiterals = false;
NL
	:	(	'\r' '\n'
		|	'\n' '\r'	//Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;

WS
	:	(	' '
		|	'\t'
		)
	;

fragment
DIGIT
	:	'0'..'9'
	;

fragment
ALPHA
	:	'a'..'z'
	|	'A'..'Z'
	|	'_'
	//For Unicode compatibility (from 0000 to 00ff)
	|	'\u00C0' .. '\u00D6'
	|	'\u00D8' .. '\u00F6'
	|	'\u00F8' .. '\u00FF'
	;

fragment
SNAME
//	options {
//		testLiterals = true;
//	}
//	:	(ALPHA) (ALPHA | DIGIT | {LA(2) == ':'}?':' ':')*
//TODO:	:	(ALPHA) (ALPHA | DIGIT | {input.LA(2) == ':'}?':' ':')*
	:	(ALPHA) (ALPHA | DIGIT)*
;

NAME
	:	(
			SNAME
//			s:SNAME {if(s.getType() != SNAME) $setType(s.getType());}
		|	'"'!
			(	ESC
			|	'\n' {newline();}
			|	~('\\'|'\"'|'\n')
			)*
			'"'!
			{setText(ei.unescapeString(getText(), 1));}
		)
	;

INT
       :       (DIGIT)+
       			// cannot accept DIGIT '.' because it would conflict with Navigation
//             (('.' DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
             (|{ ((input.LA(2) >= '0') && (input.LA(2) <= '9')) }? => '.' DIGIT+ {$type = FLOAT;})
       ;
 fragment FLOAT:;

fragment
ESC
	:	'\\'!
		(	'n' //{setText("\n");}
		|	'r' //{setText("\r");}
		|	't' //{setText("\t");}
		|	'b' //{setText("\b");}
		|	'f' //{setText("\f");}
		|	'"' //{setText("\"");}
		|	'\'' //{setText("\'");}
		|	'\\' //{setText("\\");}
		|	(
				('0'..'3')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
					(
//						options {
//							warnWhenFollowAmbig = false;
//						}
					:	'0'..'7'
					)?
				)?
			|	('4'..'7')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
				)?
			)
				{
//					String s = getText();
//					int i;
//					int ret = 0;
//					String ans;
//					for (i=0; i<s.length(); ++i)
//						ret = ret*8 + s.charAt(i) - '0';
//					ans = String.valueOf((char) ret);
//					setText(ans);
				}
		)
	;
	

LSQUARE @init {}
	:	'['
        {
            
        }

	;

RSQUARE @init {}
	:	']'
        {
            
        }

	;

EXCL @init {}
	:	'!'
        {
            
        }

	;

COMA @init {}
	:	','
        {
            
        }

	;

LPAREN @init {}
	:	'('
        {
            
        }

	;

RPAREN @init {}
	:	')'
        {
            
        }

	;

LCURLY @init {}
	:	'{'
        {
            
        }

	;

RCURLY @init {}
	:	'}'
        {
            
        }

	;

SEMI @init {}
	:	';'
        {
            
        }

	;

COLON @init {}
	:	':'
        {
            
        }

	;

PIPE @init {}
	:	'|'
        {
            
        }

	;

SHARP @init {}
	:	'#'
        {
            
        }

	;

QMARK @init {}
	:	'?'
        {
            
        }

	;

AROBAS @init {}
	:	'@'
        {
            
        }

	;

POINT @init {}
	:	'.'
        {
            
        }

	;

RARROW @init {}
	:	'->'
        {
            
        }

	;

MINUS @init {}
	:	'-'
        {
            
        }

	;

STAR @init {}
	:	'*'
        {
            
        }

	;

SLASH @init {}
	:	'/'
        {
            
        }

	;

PLUS @init {}
	:	'+'
        {
            
        }

	;

EQ @init {}
	:	'='
        {
            
        }

	;

GT @init {}
	:	'>'
        {
            
        }

	;

LT @init {}
	:	'<'
        {
            
        }

	;

GE @init {}
	:	'>='
        {
            
        }

	;

LE @init {}
	:	'<='
        {
            
        }

	;

NE @init {}
	:	'<>'
        {
            
        }

	;

LARROW @init {}
	:	'<-'
        {
            
        }

	;

ASSIGNARROW @init {}
	:	'<:='
        {
            
        }

	;

COMMENT @init {}
	:	(('--' (~('\r'| '\n'))*))
        {
            
        }

	;

STRING @init {}
	:	(('\'' (options {greedy = false;} : (('\\'! ~ '\n')| '\n'| ~('\\'| '\n')))* '\''))
        {
            
        }

	;
