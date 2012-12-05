grammar Gbind;

options {
	superClass = GbindANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package genericity.language.gbind.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package genericity.language.gbind.mopp;
}

@members{
	private genericity.language.gbind.IGbindTokenResolverFactory tokenResolverFactory = new genericity.language.gbind.mopp.GbindTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<genericity.language.gbind.mopp.GbindExpectedTerminal> expectedElements = new java.util.ArrayList<genericity.language.gbind.mopp.GbindExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>() {
			public boolean execute(genericity.language.gbind.IGbindTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new genericity.language.gbind.IGbindProblem() {
					public genericity.language.gbind.GbindEProblemSeverity getSeverity() {
						return genericity.language.gbind.GbindEProblemSeverity.ERROR;
					}
					public genericity.language.gbind.GbindEProblemType getType() {
						return genericity.language.gbind.GbindEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<genericity.language.gbind.IGbindQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		genericity.language.gbind.IGbindExpectedElement terminal = genericity.language.gbind.grammar.GbindFollowSetProvider.TERMINALS[terminalID];
		genericity.language.gbind.mopp.GbindContainedFeature[] containmentFeatures = new genericity.language.gbind.mopp.GbindContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = genericity.language.gbind.grammar.GbindFollowSetProvider.LINKS[ids[i]];
		}
		genericity.language.gbind.grammar.GbindContainmentTrace containmentTrace = new genericity.language.gbind.grammar.GbindContainmentTrace(eClass, containmentFeatures);
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		genericity.language.gbind.mopp.GbindExpectedTerminal expectedElement = new genericity.language.gbind.mopp.GbindExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
			this.expectedElementsIndexOfLastCompleteElement = 0;
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>() {
			public boolean execute(genericity.language.gbind.IGbindTextResource resource) {
				genericity.language.gbind.IGbindLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>() {
			public boolean execute(genericity.language.gbind.IGbindTextResource resource) {
				genericity.language.gbind.IGbindLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(java.util.Collection<genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>() {
			public boolean execute(genericity.language.gbind.IGbindTextResource resource) {
				genericity.language.gbind.IGbindLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public genericity.language.gbind.IGbindTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new GbindParser(new org.antlr.runtime3_4_0.CommonTokenStream(new GbindLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new GbindParser(new org.antlr.runtime3_4_0.CommonTokenStream(new GbindLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			new genericity.language.gbind.util.GbindRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public GbindParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((GbindLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((GbindLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == gbind.simpleocl.Module.class) {
				return parse_gbind_simpleocl_Module();
			}
			if (type.getInstanceClass() == gbind.simpleocl.Import.class) {
				return parse_gbind_simpleocl_Import();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OclFeatureDefinition.class) {
				return parse_gbind_simpleocl_OclFeatureDefinition();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OclContextDefinition.class) {
				return parse_gbind_simpleocl_OclContextDefinition();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OclMetamodel.class) {
				return parse_gbind_simpleocl_OclMetamodel();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OclInstanceModel.class) {
				return parse_gbind_simpleocl_OclInstanceModel();
			}
			if (type.getInstanceClass() == gbind.simpleocl.LocalVariable.class) {
				return parse_gbind_simpleocl_LocalVariable();
			}
			if (type.getInstanceClass() == gbind.simpleocl.Attribute.class) {
				return parse_gbind_simpleocl_Attribute();
			}
			if (type.getInstanceClass() == gbind.simpleocl.Operation.class) {
				return parse_gbind_simpleocl_Operation();
			}
			if (type.getInstanceClass() == gbind.simpleocl.Parameter.class) {
				return parse_gbind_simpleocl_Parameter();
			}
			if (type.getInstanceClass() == gbind.simpleocl.TuplePart.class) {
				return parse_gbind_simpleocl_TuplePart();
			}
			if (type.getInstanceClass() == gbind.simpleocl.MapElement.class) {
				return parse_gbind_simpleocl_MapElement();
			}
			if (type.getInstanceClass() == gbind.simpleocl.StaticOperationCall.class) {
				return parse_gbind_simpleocl_StaticOperationCall();
			}
			if (type.getInstanceClass() == gbind.simpleocl.StaticNavigationOrAttributeCall.class) {
				return parse_gbind_simpleocl_StaticNavigationOrAttributeCall();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OperationCall.class) {
				return parse_gbind_simpleocl_OperationCall();
			}
			if (type.getInstanceClass() == gbind.simpleocl.NavigationOrAttributeCall.class) {
				return parse_gbind_simpleocl_NavigationOrAttributeCall();
			}
			if (type.getInstanceClass() == gbind.simpleocl.IterateExp.class) {
				return parse_gbind_simpleocl_IterateExp();
			}
			if (type.getInstanceClass() == gbind.simpleocl.IteratorExp.class) {
				return parse_gbind_simpleocl_IteratorExp();
			}
			if (type.getInstanceClass() == gbind.simpleocl.Iterator.class) {
				return parse_gbind_simpleocl_Iterator();
			}
			if (type.getInstanceClass() == gbind.simpleocl.CollectionOperationCall.class) {
				return parse_gbind_simpleocl_CollectionOperationCall();
			}
			if (type.getInstanceClass() == gbind.simpleocl.CollectionType.class) {
				return parse_gbind_simpleocl_CollectionType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.StringType.class) {
				return parse_gbind_simpleocl_StringType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.BooleanType.class) {
				return parse_gbind_simpleocl_BooleanType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.IntegerType.class) {
				return parse_gbind_simpleocl_IntegerType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.RealType.class) {
				return parse_gbind_simpleocl_RealType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.BagType.class) {
				return parse_gbind_simpleocl_BagType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OrderedSetType.class) {
				return parse_gbind_simpleocl_OrderedSetType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.SequenceType.class) {
				return parse_gbind_simpleocl_SequenceType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.SetType.class) {
				return parse_gbind_simpleocl_SetType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OclAnyType.class) {
				return parse_gbind_simpleocl_OclAnyType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OclType.class) {
				return parse_gbind_simpleocl_OclType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.TupleType.class) {
				return parse_gbind_simpleocl_TupleType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.TupleTypeAttribute.class) {
				return parse_gbind_simpleocl_TupleTypeAttribute();
			}
			if (type.getInstanceClass() == gbind.simpleocl.OclModelElement.class) {
				return parse_gbind_simpleocl_OclModelElement();
			}
			if (type.getInstanceClass() == gbind.simpleocl.MapType.class) {
				return parse_gbind_simpleocl_MapType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.LambdaType.class) {
				return parse_gbind_simpleocl_LambdaType();
			}
			if (type.getInstanceClass() == gbind.simpleocl.EnvType.class) {
				return parse_gbind_simpleocl_EnvType();
			}
			if (type.getInstanceClass() == gbind.dsl.BindingModel.class) {
				return parse_gbind_dsl_BindingModel();
			}
			if (type.getInstanceClass() == gbind.dsl.MetamodelDeclaration.class) {
				return parse_gbind_dsl_MetamodelDeclaration();
			}
			if (type.getInstanceClass() == gbind.dsl.ClassBinding.class) {
				return parse_gbind_dsl_ClassBinding();
			}
			if (type.getInstanceClass() == gbind.dsl.OclFeatureBinding.class) {
				return parse_gbind_dsl_OclFeatureBinding();
			}
			if (type.getInstanceClass() == gbind.dsl.RenamingFeatureBinding.class) {
				return parse_gbind_dsl_RenamingFeatureBinding();
			}
			if (type.getInstanceClass() == gbind.dsl.ConceptHelper.class) {
				return parse_gbind_dsl_ConceptHelper();
			}
			if (type.getInstanceClass() == gbind.dsl.LocalHelper.class) {
				return parse_gbind_dsl_LocalHelper();
			}
		}
		throw new genericity.language.gbind.mopp.GbindUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(genericity.language.gbind.IGbindOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public genericity.language.gbind.IGbindParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>>();
		genericity.language.gbind.mopp.GbindParseResult parseResult = new genericity.language.gbind.mopp.GbindParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<genericity.language.gbind.mopp.GbindExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, genericity.language.gbind.IGbindTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		genericity.language.gbind.IGbindParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<genericity.language.gbind.mopp.GbindExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<genericity.language.gbind.mopp.GbindExpectedTerminal>();
		java.util.List<genericity.language.gbind.mopp.GbindExpectedTerminal> newFollowSet = new java.util.ArrayList<genericity.language.gbind.mopp.GbindExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			genericity.language.gbind.mopp.GbindExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 375;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (genericity.language.gbind.mopp.GbindExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (genericity.language.gbind.mopp.GbindExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<genericity.language.gbind.util.GbindPair<genericity.language.gbind.IGbindExpectedElement, genericity.language.gbind.mopp.GbindContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (genericity.language.gbind.util.GbindPair<genericity.language.gbind.IGbindExpectedElement, genericity.language.gbind.mopp.GbindContainedFeature[]> newFollowerPair : newFollowers) {
							genericity.language.gbind.IGbindExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
							genericity.language.gbind.grammar.GbindContainmentTrace containmentTrace = new genericity.language.gbind.grammar.GbindContainmentTrace(null, newFollowerPair.getRight());
							genericity.language.gbind.mopp.GbindExpectedTerminal newFollowTerminal = new genericity.language.gbind.mopp.GbindExpectedTerminal(container, newFollower, followSetID, containmentTrace);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (genericity.language.gbind.mopp.GbindExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(genericity.language.gbind.mopp.GbindExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parser is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			boolean exists = this.incompleteObjects.remove(object);
			if (!exists) {
			}
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_gbind_dsl_BindingModel{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_gbind_simpleocl_Module returns [gbind.simpleocl.Module element = null]
@init{
}
:
	a0 = 'module' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createModule();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createModule();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_0_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createModule();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_0_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[5]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createModule();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_0_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[7]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[9]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[10]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[11]);
	}
	
	(
		(
			(
				(
					a4_0 = parse_gbind_simpleocl_OclMetamodel					{
						if (terminateParsing) {
							throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
						}
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createModule();
							startIncompleteElement(element);
						}
						if (a4_0 != null) {
							if (a4_0 != null) {
								Object value = a4_0;
								addObjectToList(element, gbind.simpleocl.SimpleoclPackage.MODULE__METAMODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_0_0_0_3_0_0_1, a4_0, true);
							copyLocalizationInfos(a4_0, element);
						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[12]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[13]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[14]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[15]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[16]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[17]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[21]);
	}
	
	(
		(
			(
				(
					a5_0 = parse_gbind_simpleocl_Import					{
						if (terminateParsing) {
							throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
						}
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createModule();
							startIncompleteElement(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, gbind.simpleocl.SimpleoclPackage.MODULE__IMPORTS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_0_0_0_4_0_0_1, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[22]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[23]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[24]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[25]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[27]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[28]);
	}
	
	(
		(
			(
				(
					a6_0 = parse_gbind_simpleocl_ModuleElement					{
						if (terminateParsing) {
							throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
						}
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createModule();
							startIncompleteElement(element);
						}
						if (a6_0 != null) {
							if (a6_0 != null) {
								Object value = a6_0;
								addObjectToList(element, gbind.simpleocl.SimpleoclPackage.MODULE__ELEMENTS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_0_0_0_5_0_0_1, a6_0, true);
							copyLocalizationInfos(a6_0, element);
						}
					}
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[29]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[30]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[31]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
	}
	
;

parse_gbind_simpleocl_Import returns [gbind.simpleocl.Import element = null]
@init{
}
:
	a0 = 'import' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createImport();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[32]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[33]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createImport();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_1_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[34]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createImport();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_1_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[35]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[36]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createImport();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_1_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[37]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[38]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[39]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[40]);
	}
	
;

parse_gbind_simpleocl_OclFeatureDefinition returns [gbind.simpleocl.OclFeatureDefinition element = null]
@init{
}
:
	(
		(
			a0_0 = parse_gbind_simpleocl_OclContextDefinition			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclFeatureDefinition();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC), value);
					}
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__CONTEXT_), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_2_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[42]);
	}
	
	(
		(
			a1 = 'static' {
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclFeatureDefinition();
					startIncompleteElement(element);
					// initialize boolean attribute
					{
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_2_0_0_1, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC), value);
				completedElement(value, false);
			}
		)?	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[43]);
	}
	
	a4 = 'def' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclFeatureDefinition();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[44]);
	}
	
	a5 = ':' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclFeatureDefinition();
			startIncompleteElement(element);
			// initialize boolean attribute
			{
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_2_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[46]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[47]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[48]);
	}
	
	(
		a6_0 = parse_gbind_simpleocl_OclFeature		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclFeatureDefinition();
				startIncompleteElement(element);
				// initialize boolean attribute
				{
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC), value);
				}
			}
			if (a6_0 != null) {
				if (a6_0 != null) {
					Object value = a6_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__FEATURE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_2_0_0_4, a6_0, true);
				copyLocalizationInfos(a6_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[49]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[50]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[51]);
	}
	
;

parse_gbind_simpleocl_OclContextDefinition returns [gbind.simpleocl.OclContextDefinition element = null]
@init{
}
:
	a0 = 'context' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclContextDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[53]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[54]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[55]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[56]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[57]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[58]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[59]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[60]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[61]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[63]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[66]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[67]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[68]);
	}
	
	(
		a1_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclContextDefinition();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_3_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[69]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[70]);
	}
	
;

parse_gbind_simpleocl_OclMetamodel returns [gbind.simpleocl.OclMetamodel element = null]
@init{
}
:
	a0 = 'metamodel' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[71]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[72]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_4_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[73]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[74]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_4_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[75]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[76]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[77]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[78]);
	}
	
	(
		(
			a3 = ':' {
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_4_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[79]);
			}
			
			(
				a4 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
						startIncompleteElement(element);
					}
					if (a4 != null) {
						genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_4_0_0_2_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[80]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[81]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_4_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[82]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[83]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[84]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[85]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[86]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[87]);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_gbind_dsl_MetamodelDeclaration{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_gbind_simpleocl_OclInstanceModel returns [gbind.simpleocl.OclInstanceModel element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclInstanceModel();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_5_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[88]);
		}
		
		
		|		(
			a1 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclInstanceModel();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_5_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[89]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[90]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclInstanceModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[91]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclInstanceModel();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.simpleocl.OclMetamodel proxy = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.simpleocl.OclInstanceModel, gbind.simpleocl.OclMetamodel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclInstanceModelMetamodelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_5_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
	}
	
;

parse_gbind_simpleocl_LocalVariable returns [gbind.simpleocl.LocalVariable element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLocalVariable();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_6_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[92]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[93]);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLocalVariable();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_6_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[94]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[95]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[96]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[97]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[98]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[99]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[100]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[101]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[102]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[103]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[104]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[105]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[106]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[107]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[108]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[109]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[110]);
			}
			
			(
				a2_0 = parse_gbind_simpleocl_OclType				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLocalVariable();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_6_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[111]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[112]);
	}
	
	(
		a3 = EQ		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLocalVariable();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("EQ");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_6_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[113]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[114]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[115]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[116]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[117]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[118]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[119]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[120]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[121]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[122]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[123]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[124]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[125]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[126]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[127]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[128]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[129]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[130]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[131]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[132]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[134]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[135]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[136]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[137]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[138]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[139]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[140]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[141]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[142]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[144]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[145]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[146]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[147]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[148]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[149]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[150]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[151]);
	}
	
	(
		a4_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLocalVariable();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__INIT_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_6_0_0_3, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[152]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[153]);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_gbind_simpleocl_TuplePart{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_gbind_simpleocl_Attribute returns [gbind.simpleocl.Attribute element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAttribute();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_7_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[154]);
		}
		
		
		|		(
			a1 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAttribute();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_7_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[155]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[156]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAttribute();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[157]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[158]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[159]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[160]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[161]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[162]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[163]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[164]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[165]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[166]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[167]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[168]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[169]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[170]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[171]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[172]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[173]);
	}
	
	(
		a3_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAttribute();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_7_0_0_2, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[174]);
	}
	
	(
		a4 = EQ		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAttribute();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("EQ");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_7_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[175]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[176]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[177]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[178]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[179]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[180]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[181]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[183]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[184]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[185]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[186]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[187]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[188]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[189]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[190]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[191]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[192]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[193]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[194]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[195]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[196]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[197]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[198]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[199]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[200]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[201]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[202]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[203]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[204]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[205]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[206]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[207]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[208]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[209]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[210]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[211]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[212]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[213]);
	}
	
	(
		a5_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAttribute();
				startIncompleteElement(element);
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					Object value = a5_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__INIT_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_7_0_0_5, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[214]);
	}
	
	a6 = ';' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAttribute();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_7_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[215]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[216]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[217]);
	}
	
;

parse_gbind_simpleocl_Operation returns [gbind.simpleocl.Operation element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[218]);
		}
		
		
		|		(
			a1 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[219]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[220]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[221]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[222]);
	}
	
	(
		(
			(
				a3_0 = parse_gbind_simpleocl_Parameter				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_2_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[223]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[224]);
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[225]);
					}
					
					(
						a5_0 = parse_gbind_simpleocl_Parameter						{
							if (terminateParsing) {
								throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
							}
							if (element == null) {
								element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
								startIncompleteElement(element);
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									Object value = a5_0;
									addObjectToList(element, gbind.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_2_0_0_1_0_0_1, a5_0, true);
								copyLocalizationInfos(a5_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[226]);
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[227]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[228]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[229]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[230]);
	}
	
	a6 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[231]);
	}
	
	a7 = ':' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[232]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[233]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[234]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[235]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[236]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[237]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[238]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[239]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[240]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[241]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[242]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[243]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[244]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[245]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[246]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[247]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[248]);
	}
	
	(
		a8_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
				startIncompleteElement(element);
			}
			if (a8_0 != null) {
				if (a8_0 != null) {
					Object value = a8_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__RETURN_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_5, a8_0, true);
				copyLocalizationInfos(a8_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[249]);
	}
	
	(
		a9 = EQ		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
				startIncompleteElement(element);
			}
			if (a9 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("EQ");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__EQ), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a9).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a9).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__EQ), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_6, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a9, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[250]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[251]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[252]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[253]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[254]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[255]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[256]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[257]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[258]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[259]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[260]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[261]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[262]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[263]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[264]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[265]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[266]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[267]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[268]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[269]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[270]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[271]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[272]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[273]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[274]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[275]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[276]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[277]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[278]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[279]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[280]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[281]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[282]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[283]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[284]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[285]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[286]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[287]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[288]);
	}
	
	(
		a10_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
				startIncompleteElement(element);
			}
			if (a10_0 != null) {
				if (a10_0 != null) {
					Object value = a10_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__BODY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_8, a10_0, true);
				copyLocalizationInfos(a10_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[289]);
	}
	
	a11 = ';' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperation();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_8_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[290]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[291]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[292]);
	}
	
;

parse_gbind_simpleocl_Parameter returns [gbind.simpleocl.Parameter element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createParameter();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_9_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[293]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[294]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[295]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[297]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[298]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[299]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[300]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[301]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[302]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[303]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[304]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[305]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[306]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[307]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[308]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[309]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[310]);
	}
	
	(
		a2_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createParameter();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_9_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[311]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[312]);
	}
	
;

parse_gbind_simpleocl_TuplePart returns [gbind.simpleocl.TuplePart element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTuplePart();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_25_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[313]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[314]);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTuplePart();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_25_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[315]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[316]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[317]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[318]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[319]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[320]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[321]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[322]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[323]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[324]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[325]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[326]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[327]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[328]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[329]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[330]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[331]);
			}
			
			(
				a2_0 = parse_gbind_simpleocl_OclType				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTuplePart();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_25_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[332]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[333]);
	}
	
	(
		a3 = EQ		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTuplePart();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("EQ");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__EQ), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__EQ), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_25_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[334]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[335]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[336]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[337]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[338]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[339]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[340]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[341]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[342]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[343]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[344]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[345]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[346]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[347]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[348]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[349]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[350]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[351]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[352]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[353]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[354]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[355]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[356]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[357]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[358]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[359]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[360]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[361]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[362]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[363]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[364]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[365]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[366]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[367]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[368]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[369]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[370]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[371]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[372]);
	}
	
	(
		a4_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTuplePart();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__INIT_EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_25_0_0_3, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[373]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[374]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[375]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[376]);
	}
	
;

parse_gbind_simpleocl_MapElement returns [gbind.simpleocl.MapElement element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_27_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[377]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[378]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[379]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[380]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[381]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[382]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[383]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[384]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[385]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[386]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[387]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[388]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[389]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[390]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[391]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[392]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[393]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[394]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[395]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[396]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[397]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[398]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[399]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[400]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[401]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[402]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[403]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[404]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[405]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[406]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[407]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[408]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[409]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[410]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[411]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[412]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[413]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[414]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[415]);
	}
	
	(
		a1_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapElement();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_ELEMENT__KEY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_27_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[416]);
	}
	
	a2 = ',' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_27_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[417]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[418]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[419]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[420]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[421]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[422]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[423]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[424]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[425]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[426]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[427]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[428]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[429]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[430]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[431]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[432]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[433]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[434]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[435]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[436]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[437]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[438]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[439]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[440]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[441]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[442]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[443]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[444]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[445]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[446]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[447]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[448]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[449]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[450]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[451]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[452]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[453]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[454]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[455]);
	}
	
	(
		a3_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapElement();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_ELEMENT__VALUE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_27_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[456]);
	}
	
	a4 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_27_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[457]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[458]);
	}
	
;

parse_gbind_simpleocl_StaticOperationCall returns [gbind.simpleocl.StaticOperationCall element = null]
@init{
}
:
	a0 = '::' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[459]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[460]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[461]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[462]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[463]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[464]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[465]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[466]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[467]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[468]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[469]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[470]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[471]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[472]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[473]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[474]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[475]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[476]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[477]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[478]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[479]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[480]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[481]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[482]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[483]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[484]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[485]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[486]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[487]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[488]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[489]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[490]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[491]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[492]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[493]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[494]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[495]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[496]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[497]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[498]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[499]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[500]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[501]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[502]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[503]);
	}
	
	(
		(
			(
				a4_0 = parse_gbind_simpleocl_OclExpression				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
						startIncompleteElement(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_3_0_0_0, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[504]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[505]);
			}
			
			(
				(
					a5 = ',' {
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_3_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[506]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[507]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[508]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[509]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[510]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[511]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[512]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[513]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[514]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[515]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[516]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[517]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[518]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[519]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[520]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[521]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[522]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[523]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[524]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[525]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[526]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[527]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[528]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[529]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[530]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[531]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[532]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[533]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[534]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[535]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[536]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[537]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[538]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[539]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[540]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[541]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[542]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[543]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[544]);
					}
					
					(
						a6_0 = parse_gbind_simpleocl_OclExpression						{
							if (terminateParsing) {
								throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
							}
							if (element == null) {
								element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
								startIncompleteElement(element);
							}
							if (a6_0 != null) {
								if (a6_0 != null) {
									Object value = a6_0;
									addObjectToList(element, gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_3_0_0_1_0_0_1, a6_0, true);
								copyLocalizationInfos(a6_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[545]);
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[546]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[547]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[548]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[549]);
	}
	
	a7 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_41_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[550]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[551]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[552]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[553]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[554]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[555]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[556]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[557]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[558]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[559]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[560]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[561]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[562]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[563]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[564]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[565]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[566]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[567]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[568]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[569]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[570]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[571]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[572]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[573]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[574]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[575]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[576]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[577]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[578]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[579]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[580]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[581]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[582]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[583]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[584]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[585]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[586]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[587]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[588]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[589]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[590]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[591]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[592]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[593]);
	}
	
;

parse_gbind_simpleocl_StaticNavigationOrAttributeCall returns [gbind.simpleocl.StaticNavigationOrAttributeCall element = null]
@init{
}
:
	a0 = '::' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticNavigationOrAttributeCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_42_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[594]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[595]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticNavigationOrAttributeCall();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_42_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[596]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[597]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[598]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[599]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[600]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[601]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[602]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[603]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[604]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[605]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[606]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[607]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[608]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[609]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[610]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[611]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[612]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[613]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[614]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[615]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[616]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[617]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[618]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[619]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[620]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[621]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[622]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[623]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[624]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[625]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[626]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[627]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[628]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[629]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[630]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[631]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[632]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[633]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[634]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[635]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[636]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[637]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[638]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[639]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticNavigationOrAttributeCall();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_42_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[640]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[641]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[642]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[643]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[644]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[645]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[646]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[647]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[648]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[649]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[650]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[651]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[652]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[653]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[654]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[655]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[656]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[657]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[658]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[659]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[660]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[661]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[662]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[663]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[664]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[665]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[666]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[667]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[668]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[669]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[670]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[671]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[672]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[673]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[674]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[675]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[676]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[677]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[678]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[679]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[680]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[681]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[682]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[683]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[684]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[685]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[686]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[687]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[688]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[689]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[690]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[691]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[692]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[693]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[694]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[695]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[696]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[697]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[698]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[699]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[700]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[701]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[702]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[703]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[704]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[705]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[706]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[707]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[708]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[709]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[710]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[711]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[712]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[713]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[714]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[715]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[716]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[717]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[718]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[719]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[720]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[721]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[722]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[723]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[724]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[725]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[726]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[727]);
	}
	
;

parse_gbind_simpleocl_OperationCall returns [gbind.simpleocl.OperationCall element = null]
@init{
}
:
	a0 = '.' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[728]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[729]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[730]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[731]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[732]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[733]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[734]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[735]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[736]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[737]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[738]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[739]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[740]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[741]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[742]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[743]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[744]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[745]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[746]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[747]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[748]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[749]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[750]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[751]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[752]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[753]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[754]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[755]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[756]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[757]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[758]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[759]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[760]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[761]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[762]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[763]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[764]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[765]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[766]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[767]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[768]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[769]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[770]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[771]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[772]);
	}
	
	(
		(
			(
				a4_0 = parse_gbind_simpleocl_OclExpression				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
						startIncompleteElement(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_3_0_0_0, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[773]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[774]);
			}
			
			(
				(
					a5 = ',' {
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_3_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[775]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[776]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[777]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[778]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[779]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[780]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[781]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[782]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[783]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[784]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[785]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[786]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[787]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[788]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[789]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[790]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[791]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[792]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[793]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[794]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[795]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[796]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[797]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[798]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[799]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[800]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[801]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[802]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[803]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[804]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[805]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[806]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[807]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[808]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[809]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[810]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[811]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[812]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[813]);
					}
					
					(
						a6_0 = parse_gbind_simpleocl_OclExpression						{
							if (terminateParsing) {
								throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
							}
							if (element == null) {
								element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
								startIncompleteElement(element);
							}
							if (a6_0 != null) {
								if (a6_0 != null) {
									Object value = a6_0;
									addObjectToList(element, gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_3_0_0_1_0_0_1, a6_0, true);
								copyLocalizationInfos(a6_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[814]);
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[815]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[816]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[817]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[818]);
	}
	
	a7 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_44_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[819]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[820]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[821]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[822]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[823]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[824]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[825]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[826]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[827]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[828]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[829]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[830]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[831]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[832]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[833]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[834]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[835]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[836]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[837]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[838]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[839]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[840]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[841]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[842]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[843]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[844]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[845]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[846]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[847]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[848]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[849]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[850]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[851]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[852]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[853]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[854]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[855]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[856]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[857]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[858]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[859]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[860]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[861]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[862]);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_gbind_simpleocl_CollectionOperationCall{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_gbind_simpleocl_NavigationOrAttributeCall returns [gbind.simpleocl.NavigationOrAttributeCall element = null]
@init{
}
:
	a0 = '.' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createNavigationOrAttributeCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_45_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[863]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[864]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createNavigationOrAttributeCall();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_45_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[865]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[866]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[867]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[868]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[869]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[870]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[871]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[872]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[873]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[874]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[875]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[876]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[877]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[878]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[879]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[880]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[881]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[882]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[883]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[884]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[885]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[886]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[887]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[888]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[889]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[890]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[891]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[892]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[893]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[894]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[895]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[896]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[897]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[898]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[899]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[900]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[901]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[902]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[903]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[904]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[905]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[906]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[907]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[908]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createNavigationOrAttributeCall();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_45_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[909]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[910]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[911]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[912]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[913]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[914]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[915]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[916]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[917]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[918]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[919]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[920]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[921]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[922]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[923]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[924]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[925]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[926]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[927]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[928]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[929]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[930]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[931]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[932]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[933]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[934]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[935]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[936]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[937]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[938]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[939]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[940]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[941]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[942]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[943]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[944]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[945]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[946]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[947]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[948]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[949]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[950]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[951]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[952]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[953]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[954]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[955]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[956]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[957]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[958]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[959]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[960]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[961]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[962]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[963]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[964]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[965]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[966]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[967]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[968]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[969]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[970]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[971]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[972]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[973]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[974]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[975]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[976]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[977]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[978]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[979]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[980]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[981]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[982]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[983]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[984]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[985]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[986]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[987]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[988]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[989]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[990]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[991]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[992]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[993]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[994]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[995]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[996]);
	}
	
;

parse_gbind_simpleocl_IterateExp returns [gbind.simpleocl.IterateExp element = null]
@init{
}
:
	a0 = '->' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[997]);
	}
	
	a1 = 'iterate' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[998]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[999]);
	}
	
	(
		a3_0 = parse_gbind_simpleocl_Iterator		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					addObjectToList(element, gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1000]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1001]);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1002]);
			}
			
			(
				a5_0 = parse_gbind_simpleocl_Iterator				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_4_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1003]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1004]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1005]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1006]);
	}
	
	a6 = ';' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1007]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1008]);
	}
	
	(
		a7_0 = parse_gbind_simpleocl_LocalVariable		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__RESULT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_6, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1009]);
	}
	
	a8 = '|' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1010]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1011]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1012]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1013]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1014]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1015]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1016]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1017]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1018]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1019]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1020]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1021]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1022]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1023]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1024]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1025]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1026]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1027]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1028]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1029]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1030]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1031]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1032]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1033]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1034]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1035]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1036]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1037]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1038]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1039]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1040]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1041]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1042]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1043]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1044]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1045]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1046]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1047]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1048]);
	}
	
	(
		a9_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
				startIncompleteElement(element);
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					Object value = a9_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__BODY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_8, a9_0, true);
				copyLocalizationInfos(a9_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1049]);
	}
	
	a10 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterateExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_46_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1050]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1051]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1052]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1053]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1054]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1055]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1056]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1057]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1058]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1059]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1060]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1061]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1062]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1063]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1064]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1065]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1066]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1067]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1068]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1069]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1070]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1071]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1072]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1073]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1074]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1075]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1076]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1077]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1078]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1079]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1080]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1081]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1082]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1083]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1084]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1085]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1086]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1087]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1088]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1089]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1090]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1091]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1092]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1093]);
	}
	
;

parse_gbind_simpleocl_IteratorExp returns [gbind.simpleocl.IteratorExp element = null]
@init{
}
:
	a0 = '->' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1094]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1095]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1096]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1097]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1098]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1099]);
	}
	
	(
		a4_0 = parse_gbind_simpleocl_Iterator		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					addObjectToList(element, gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_3, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1100]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1101]);
	}
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1102]);
			}
			
			(
				a6_0 = parse_gbind_simpleocl_Iterator				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
						startIncompleteElement(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_4_0_0_1, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1103]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1104]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1105]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1106]);
	}
	
	a7 = '|' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1107]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1108]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1109]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1110]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1111]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1112]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1113]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1114]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1115]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1116]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1117]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1118]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1119]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1120]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1121]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1122]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1123]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1124]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1125]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1126]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1127]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1128]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1129]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1130]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1131]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1132]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1133]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1134]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1135]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1136]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1137]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1138]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1139]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1140]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1141]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1142]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1143]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1144]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1145]);
	}
	
	(
		a8_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
				startIncompleteElement(element);
			}
			if (a8_0 != null) {
				if (a8_0 != null) {
					Object value = a8_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__BODY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_6, a8_0, true);
				copyLocalizationInfos(a8_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1146]);
	}
	
	a9 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIteratorExp();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_47_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1147]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1148]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1149]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1150]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1151]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1152]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1153]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1154]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1155]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1156]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1157]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1158]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1159]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1160]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1161]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1162]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1163]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1164]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1165]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1166]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1167]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1168]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1169]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1170]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1171]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1172]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1173]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1174]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1175]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1176]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1177]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1178]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1179]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1180]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1181]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1182]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1183]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1184]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1185]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1186]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1187]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1188]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1189]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1190]);
	}
	
;

parse_gbind_simpleocl_Iterator returns [gbind.simpleocl.Iterator element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterator();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_48_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1191]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1192]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1193]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1194]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1195]);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterator();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_48_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1196]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1197]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1198]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1199]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1200]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1201]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1202]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1203]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1204]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1205]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1206]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1207]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1208]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1209]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1210]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1211]);
				addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1212]);
			}
			
			(
				a2_0 = parse_gbind_simpleocl_OclType				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIterator();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__TYPE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_48_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1213]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1214]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1215]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1216]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1217]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1218]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1219]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1220]);
	}
	
;

parse_gbind_simpleocl_CollectionOperationCall returns [gbind.simpleocl.CollectionOperationCall element = null]
@init{
}
:
	a0 = '->' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1221]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1222]);
	}
	
	(
		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1223]);
		}
		
		
		|		(
			a2 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1224]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1225]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1226]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1227]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1228]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1229]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1230]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1231]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1232]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1233]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1234]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1235]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1236]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1237]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1238]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1239]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1240]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1241]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1242]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1243]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1244]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1245]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1246]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1247]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1248]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1249]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1250]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1251]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1252]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1253]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1254]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1255]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1256]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1257]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1258]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1259]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1260]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1261]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1262]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1263]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1264]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1265]);
	}
	
	(
		(
			(
				a4_0 = parse_gbind_simpleocl_OclExpression				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
						startIncompleteElement(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_3_0_0_0, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1266]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1267]);
			}
			
			(
				(
					a5 = ',' {
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_3_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1268]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1269]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1270]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1271]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1272]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1273]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1274]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1275]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1276]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1277]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1278]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1279]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1280]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1281]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1282]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1283]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1284]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1285]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1286]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1287]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1288]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1289]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1290]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1291]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1292]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1293]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1294]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1295]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1296]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1297]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1298]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1299]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1300]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1301]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1302]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1303]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1304]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1305]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1306]);
					}
					
					(
						a6_0 = parse_gbind_simpleocl_OclExpression						{
							if (terminateParsing) {
								throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
							}
							if (element == null) {
								element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
								startIncompleteElement(element);
							}
							if (a6_0 != null) {
								if (a6_0 != null) {
									Object value = a6_0;
									addObjectToList(element, gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_3_0_0_1_0_0_1, a6_0, true);
								copyLocalizationInfos(a6_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1307]);
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1308]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1309]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1310]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1311]);
	}
	
	a7 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionOperationCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_49_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1312]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1313]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1314]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1315]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1316]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1317]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1318]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1319]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1320]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1321]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1322]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1323]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1324]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1325]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1326]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1327]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1328]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1329]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1330]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1331]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1332]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1333]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1334]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1335]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1336]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1337]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1338]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1339]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1340]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1341]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1342]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1343]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1344]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1345]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1346]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1347]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1348]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1349]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1350]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1351]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1352]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1353]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1354]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1355]);
	}
	
;

parse_gbind_simpleocl_CollectionType returns [gbind.simpleocl.CollectionType element = null]
@init{
}
:
	(
		a0 = COLLECTIONTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("COLLECTIONTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_50_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1356]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_50_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1357]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1358]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1359]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1360]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1361]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1362]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1363]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1364]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1365]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1366]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1367]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1368]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1369]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1370]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1371]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1372]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1373]);
	}
	
	(
		a2_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionType();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_50_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1374]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createCollectionType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_50_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1375]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1376]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1377]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1378]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1379]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1380]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1381]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1382]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1383]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1384]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1385]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1386]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1387]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1388]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1389]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1390]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1391]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1392]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1393]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1394]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1395]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1396]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1397]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1398]);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_gbind_simpleocl_BagType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_gbind_simpleocl_OrderedSetType{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_gbind_simpleocl_SequenceType{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_gbind_simpleocl_SetType{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_gbind_simpleocl_StringType returns [gbind.simpleocl.StringType element = null]
@init{
}
:
	(
		a0 = STRINGTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStringType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRINGTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_51_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1399]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1400]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1401]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1402]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1403]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1404]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1405]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1406]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1407]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1408]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1409]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1410]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1411]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1412]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1413]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1414]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1415]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1416]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1417]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1418]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1419]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1420]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1421]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1422]);
	}
	
;

parse_gbind_simpleocl_BooleanType returns [gbind.simpleocl.BooleanType element = null]
@init{
}
:
	(
		a0 = BOOLEANTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBooleanType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLEANTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_52_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1423]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1424]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1425]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1426]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1427]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1428]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1429]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1430]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1431]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1432]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1433]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1434]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1435]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1436]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1437]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1438]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1439]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1440]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1441]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1442]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1443]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1444]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1445]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1446]);
	}
	
;

parse_gbind_simpleocl_IntegerType returns [gbind.simpleocl.IntegerType element = null]
@init{
}
:
	(
		a0 = INTEGERTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIntegerType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGERTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_53_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1447]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1448]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1449]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1450]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1451]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1452]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1453]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1454]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1455]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1456]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1457]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1458]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1459]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1460]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1461]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1462]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1463]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1464]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1465]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1466]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1467]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1468]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1469]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1470]);
	}
	
;

parse_gbind_simpleocl_RealType returns [gbind.simpleocl.RealType element = null]
@init{
}
:
	(
		a0 = REALTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createRealType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("REALTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_54_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1471]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1472]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1473]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1474]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1475]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1476]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1477]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1478]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1479]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1480]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1481]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1482]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1483]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1484]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1485]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1486]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1487]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1488]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1489]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1490]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1491]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1492]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1493]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1494]);
	}
	
;

parse_gbind_simpleocl_BagType returns [gbind.simpleocl.BagType element = null]
@init{
}
:
	(
		a0 = BAGTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BAGTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_55_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1495]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_55_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1496]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1497]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1498]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1499]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1500]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1501]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1502]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1503]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1504]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1505]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1506]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1507]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1508]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1509]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1510]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1511]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1512]);
	}
	
	(
		a2_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagType();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_55_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1513]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_55_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1514]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1515]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1516]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1517]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1518]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1519]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1520]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1521]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1522]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1523]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1524]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1525]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1526]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1527]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1528]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1529]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1530]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1531]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1532]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1533]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1534]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1535]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1536]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1537]);
	}
	
;

parse_gbind_simpleocl_OrderedSetType returns [gbind.simpleocl.OrderedSetType element = null]
@init{
}
:
	(
		a0 = ORDEREDSETTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ORDEREDSETTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_56_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1538]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_56_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1539]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1540]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1541]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1542]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1543]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1544]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1545]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1546]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1547]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1548]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1549]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1550]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1551]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1552]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1553]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1554]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1555]);
	}
	
	(
		a2_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetType();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_56_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1556]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_56_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1557]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1558]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1559]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1560]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1561]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1562]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1563]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1564]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1565]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1566]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1567]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1568]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1569]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1570]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1571]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1572]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1573]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1574]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1575]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1576]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1577]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1578]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1579]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1580]);
	}
	
;

parse_gbind_simpleocl_SequenceType returns [gbind.simpleocl.SequenceType element = null]
@init{
}
:
	(
		a0 = SEQUENCETYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SEQUENCETYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_57_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1581]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_57_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1582]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1583]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1584]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1585]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1586]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1587]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1588]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1589]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1590]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1591]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1592]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1593]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1594]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1595]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1596]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1597]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1598]);
	}
	
	(
		a2_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceType();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_57_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1599]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_57_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1600]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1601]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1602]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1603]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1604]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1605]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1606]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1607]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1608]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1609]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1610]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1611]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1612]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1613]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1614]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1615]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1616]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1617]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1618]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1619]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1620]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1621]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1622]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1623]);
	}
	
;

parse_gbind_simpleocl_SetType returns [gbind.simpleocl.SetType element = null]
@init{
}
:
	(
		a0 = SETTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SETTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_58_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1624]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_58_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1625]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1626]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1627]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1628]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1629]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1630]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1631]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1632]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1633]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1634]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1635]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1636]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1637]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1638]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1639]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1640]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1641]);
	}
	
	(
		a2_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetType();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__ELEMENT_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_58_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1642]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_58_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1643]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1644]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1645]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1646]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1647]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1648]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1649]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1650]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1651]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1652]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1653]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1654]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1655]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1656]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1657]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1658]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1659]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1660]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1661]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1662]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1663]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1664]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1665]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1666]);
	}
	
;

parse_gbind_simpleocl_OclAnyType returns [gbind.simpleocl.OclAnyType element = null]
@init{
}
:
	(
		a0 = OCLANYTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclAnyType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("OCLANYTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_59_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1667]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1668]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1669]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1670]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1671]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1672]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1673]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1674]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1675]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1676]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1677]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1678]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1679]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1680]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1681]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1682]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1683]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1684]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1685]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1686]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1687]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1688]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1689]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1690]);
	}
	
;

parse_gbind_simpleocl_OclType returns [gbind.simpleocl.OclType element = null]
@init{
}
:
	(
		a0 = OCLTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("OCLTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_60_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1691]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1692]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1693]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1694]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1695]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1696]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1697]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1698]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1699]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1700]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1701]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1702]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1703]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1704]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1705]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1706]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1707]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1708]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1709]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1710]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1711]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1712]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1713]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1714]);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_gbind_simpleocl_CollectionType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_gbind_simpleocl_StringType{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_gbind_simpleocl_BooleanType{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_gbind_simpleocl_IntegerType{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_gbind_simpleocl_RealType{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_gbind_simpleocl_BagType{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_gbind_simpleocl_OrderedSetType{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_gbind_simpleocl_SequenceType{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_gbind_simpleocl_SetType{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_gbind_simpleocl_OclAnyType{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_gbind_simpleocl_TupleType{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_gbind_simpleocl_OclModelElement{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_gbind_simpleocl_MapType{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_gbind_simpleocl_LambdaType{ element = c13; /* this is a subclass or primitive expression choice */ }
	|	c14 = parse_gbind_simpleocl_EnvType{ element = c14; /* this is a subclass or primitive expression choice */ }
	
;

parse_gbind_simpleocl_TupleType returns [gbind.simpleocl.TupleType element = null]
@init{
}
:
	(
		(
			a0 = TUPLETYPE			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleType();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TUPLETYPE");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_61_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1715]);
		}
		
		
		|		(
			a1 = TUPLE			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleType();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TUPLE");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_61_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1716]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1717]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_61_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1718]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1719]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1720]);
	}
	
	(
		(
			(
				a3_0 = parse_gbind_simpleocl_TupleTypeAttribute				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleType();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_61_0_0_2_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1721]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1722]);
			}
			
			(
				(
					a4 = ',' {
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleType();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_61_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1723]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1724]);
					}
					
					(
						a5_0 = parse_gbind_simpleocl_TupleTypeAttribute						{
							if (terminateParsing) {
								throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
							}
							if (element == null) {
								element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleType();
								startIncompleteElement(element);
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									Object value = a5_0;
									addObjectToList(element, gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_61_0_0_2_0_0_1_0_0_1, a5_0, true);
								copyLocalizationInfos(a5_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1725]);
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1726]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1727]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1728]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1729]);
	}
	
	a6 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_61_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1730]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1731]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1732]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1733]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1734]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1735]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1736]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1737]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1738]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1739]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1740]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1741]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1742]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1743]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1744]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1745]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1746]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1747]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1748]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1749]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1750]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1751]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1752]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1753]);
	}
	
;

parse_gbind_simpleocl_TupleTypeAttribute returns [gbind.simpleocl.TupleTypeAttribute element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleTypeAttribute();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_62_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1754]);
		}
		
		
		|		(
			a1 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleTypeAttribute();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_62_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1755]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1756]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleTypeAttribute();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_62_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1757]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1758]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1759]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1760]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1761]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1762]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1763]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1764]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1765]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1766]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1767]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1768]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1769]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1770]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1771]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1772]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1773]);
	}
	
	(
		a3_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleTypeAttribute();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_62_0_0_2, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1774]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1775]);
	}
	
;

parse_gbind_simpleocl_OclModelElement returns [gbind.simpleocl.OclModelElement element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElement();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.simpleocl.OclModel proxy = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.simpleocl.OclModelElement, gbind.simpleocl.OclModel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_63_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1776]);
	}
	
	a1 = '!' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_63_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1777]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1778]);
	}
	
	(
		(
			a2 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElement();
					startIncompleteElement(element);
				}
				if (a2 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_63_0_0_2_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1779]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1780]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1781]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1782]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1783]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1784]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1785]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1786]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1787]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1788]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1789]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1790]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1791]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1792]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1793]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1794]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1795]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1796]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1797]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1798]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1799]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1800]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1801]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1802]);
		}
		
		
		|		(
			a3 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElement();
					startIncompleteElement(element);
				}
				if (a3 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_63_0_0_2_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1803]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1804]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1805]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1806]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1807]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1808]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1809]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1810]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1811]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1812]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1813]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1814]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1815]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1816]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1817]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1818]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1819]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1820]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1821]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1822]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1823]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1824]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1825]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1826]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1827]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1828]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1829]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1830]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1831]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1832]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1833]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1834]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1835]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1836]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1837]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1838]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1839]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1840]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1841]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1842]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1843]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1844]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1845]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1846]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1847]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1848]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1849]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1850]);
	}
	
;

parse_gbind_simpleocl_MapType returns [gbind.simpleocl.MapType element = null]
@init{
}
:
	(
		a0 = MAPTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MAPTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_64_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1851]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_64_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1852]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1853]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1854]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1855]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1856]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1857]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1858]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1859]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1860]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1861]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1862]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1863]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1864]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1865]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1866]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1867]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1868]);
	}
	
	(
		a2_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapType();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__KEY_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_64_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1869]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_64_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1870]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1871]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1872]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1873]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1874]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1875]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1876]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1877]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1878]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1879]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1880]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1881]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1882]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1883]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1884]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1885]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1886]);
	}
	
	(
		a4_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapType();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__VALUE_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_64_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1887]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_64_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1888]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1889]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1890]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1891]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1892]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1893]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1894]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1895]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1896]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1897]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1898]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1899]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1900]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1901]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1902]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1903]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1904]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1905]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1906]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1907]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1908]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1909]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1910]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1911]);
	}
	
;

parse_gbind_simpleocl_LambdaType returns [gbind.simpleocl.LambdaType element = null]
@init{
}
:
	(
		a0 = LAMBDATYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("LAMBDATYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1912]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1913]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1914]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1915]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1916]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1917]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1918]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1919]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1920]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1921]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1922]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1923]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1924]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1925]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1926]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1927]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1928]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1929]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1930]);
	}
	
	(
		(
			(
				a2_0 = parse_gbind_simpleocl_OclType				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1931]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1932]);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_2_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1933]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1934]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1935]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1936]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1937]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1938]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1939]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1940]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1941]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1942]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1943]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1944]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1945]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1946]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1947]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1948]);
						addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1949]);
					}
					
					(
						a4_0 = parse_gbind_simpleocl_OclType						{
							if (terminateParsing) {
								throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
							}
							if (element == null) {
								element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
								startIncompleteElement(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_2_0_0_1_0_0_1, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1950]);
						addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1951]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1952]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1953]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1954]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1955]);
	}
	
	a6 = ':' {
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1956]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1957]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1958]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1959]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1960]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1961]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1962]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1963]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1964]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1965]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1966]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1967]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1968]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1969]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1970]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1971]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1972]);
	}
	
	(
		a7_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaType();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__RETURN_TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_65_0_0_5, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1973]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1974]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1975]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1976]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1977]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1978]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1979]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1980]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1981]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1982]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1983]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1984]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1985]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1986]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1987]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1988]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1989]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1990]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1991]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1992]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1993]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1994]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1995]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1996]);
	}
	
;

parse_gbind_simpleocl_EnvType returns [gbind.simpleocl.EnvType element = null]
@init{
}
:
	(
		a0 = ENVTYPE		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEnvType();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ENVTYPE");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_66_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1997]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1998]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[1999]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2000]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2001]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2002]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2003]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2004]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2005]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2006]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2007]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2008]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2009]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2010]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2011]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2012]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2013]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2014]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2015]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2016]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2017]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2018]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2019]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2020]);
	}
	
;

parse_gbind_dsl_BindingModel returns [gbind.dsl.BindingModel element = null]
@init{
}
:
	a0 = 'binding' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2021]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2022]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2023]);
	}
	
	a3 = 'concept' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2024]);
	}
	
	(
		a4_0 = parse_gbind_dsl_MetamodelDeclaration		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BOUND_CONCEPT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2025]);
	}
	
	a5 = 'metamodel' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2026]);
	}
	
	(
		a6_0 = parse_gbind_dsl_MetamodelDeclaration		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
				startIncompleteElement(element);
			}
			if (a6_0 != null) {
				if (a6_0 != null) {
					Object value = a6_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BOUND_METAMODEL), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_6, a6_0, true);
				copyLocalizationInfos(a6_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2027]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2028]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2029]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2030]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2031]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2032]);
	}
	
	(
		(
			a7_0 = parse_gbind_dsl_ConceptBinding			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
					startIncompleteElement(element);
				}
				if (a7_0 != null) {
					if (a7_0 != null) {
						Object value = a7_0;
						addObjectToList(element, gbind.dsl.DslPackage.BINDING_MODEL__BINDINGS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_7, a7_0, true);
					copyLocalizationInfos(a7_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2033]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2034]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2035]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2036]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2037]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2038]);
	}
	
	(
		(
			a8_0 = parse_gbind_dsl_BaseHelper			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
					startIncompleteElement(element);
				}
				if (a8_0 != null) {
					if (a8_0 != null) {
						Object value = a8_0;
						addObjectToList(element, gbind.dsl.DslPackage.BINDING_MODEL__HELPERS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_8, a8_0, true);
					copyLocalizationInfos(a8_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2039]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2040]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2041]);
	}
	
	a9 = '}' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createBindingModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_67_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_gbind_dsl_MetamodelDeclaration returns [gbind.dsl.MetamodelDeclaration element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createMetamodelDeclaration();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_68_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2042]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createMetamodelDeclaration();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_68_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2043]);
	}
	
	(
		a2 = QUOTED_34_34_92		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createMetamodelDeclaration();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__METAMODEL_URI), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__METAMODEL_URI), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_68_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2044]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2045]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2046]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2047]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2048]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2049]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2050]);
	}
	
;

parse_gbind_dsl_ClassBinding returns [gbind.dsl.ClassBinding element = null]
@init{
}
:
	a0 = 'class' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2051]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCEPT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.dsl.ConceptMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConceptMetaclass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.ClassBinding, gbind.dsl.ConceptMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassBindingConceptReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCEPT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCEPT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2052]);
	}
	
	a2 = 'to' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2053]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.dsl.ConcreteMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConcreteMetaclass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.ClassBinding, gbind.dsl.ConcreteMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassBindingConcreteReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2054]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2055]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2056]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2057]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2058]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2059]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2060]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2061]);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2062]);
			}
			
			(
				a5 = TEXT				
				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
						startIncompleteElement(element);
					}
					if (a5 != null) {
						genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						gbind.dsl.ConcreteMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConcreteMetaclass();
						collectHiddenTokens(element);
						registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.ClassBinding, gbind.dsl.ConcreteMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassBindingConcreteReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							addObjectToList(element, gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_4_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2063]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2064]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2065]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2066]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2067]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2068]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2069]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2070]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2071]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2072]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2073]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2074]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2075]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2076]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2077]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2078]);
	}
	
	(
		(
			a6 = 'when' {
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2079]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2080]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2081]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2082]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2083]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2084]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2085]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2086]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2087]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2088]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2089]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2090]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2091]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2092]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2093]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2094]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2095]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2096]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2097]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2098]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2099]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2100]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2101]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2102]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2103]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2104]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2105]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2106]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2107]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2108]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2109]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2110]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2111]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2112]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2113]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2114]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2115]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2116]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getClassBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2117]);
			}
			
			(
				a7_0 = parse_gbind_simpleocl_OclExpression				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.dsl.DslFactory.eINSTANCE.createClassBinding();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__WHEN_CLAUSE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_69_0_0_5_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2118]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2119]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2120]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2121]);
				addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2122]);
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2123]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2124]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2125]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2126]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2127]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2128]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2129]);
	}
	
;

parse_gbind_dsl_OclFeatureBinding returns [gbind.dsl.OclFeatureBinding element = null]
@init{
}
:
	a0 = 'feature' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2130]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_CLASS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.dsl.ConceptMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConceptMetaclass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.BaseFeatureBinding, gbind.dsl.ConceptMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingConceptClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_CLASS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_CLASS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2131]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2132]);
	}
	
	(
		(
			(
				a2 = QUOTED_91_93				
				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
						tokenResolver.setOptions(getOptions());
						genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__QUALIFIER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						gbind.dsl.ConcreteMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConcreteMetaclass();
						collectHiddenTokens(element);
						registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.BaseFeatureBinding, gbind.dsl.ConcreteMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingQualifierReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__QUALIFIER), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__QUALIFIER), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_2_0_0_0, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2133]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2134]);
	}
	
	a3 = '.' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2135]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2136]);
	}
	
	(
		(
			a4 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
					startIncompleteElement(element);
				}
				if (a4 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_4_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2137]);
		}
		
		
		|		(
			a5 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
					startIncompleteElement(element);
				}
				if (a5 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_4_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2138]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2139]);
	}
	
	a6 = '=' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2140]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2141]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2142]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2143]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2144]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2145]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2146]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2147]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2148]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2149]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2150]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2151]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2152]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2153]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2154]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2155]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2156]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2157]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2158]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2159]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2160]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2161]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2162]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2163]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2164]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2165]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2166]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2167]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2168]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2169]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2170]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2171]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2172]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2173]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2174]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2175]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2176]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2177]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2178]);
	}
	
	(
		a7_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createOclFeatureBinding();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCRETE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_70_0_0_6, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2179]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2180]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2181]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2182]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2183]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2184]);
	}
	
;

parse_gbind_dsl_RenamingFeatureBinding returns [gbind.dsl.RenamingFeatureBinding element = null]
@init{
}
:
	a0 = 'feature' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2185]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_CLASS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.dsl.ConceptMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConceptMetaclass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.BaseFeatureBinding, gbind.dsl.ConceptMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingConceptClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_CLASS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_CLASS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2186]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2187]);
	}
	
	(
		(
			(
				a2 = QUOTED_91_93				
				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
						tokenResolver.setOptions(getOptions());
						genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__QUALIFIER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						gbind.dsl.ConcreteMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConcreteMetaclass();
						collectHiddenTokens(element);
						registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.BaseFeatureBinding, gbind.dsl.ConcreteMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingQualifierReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__QUALIFIER), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__QUALIFIER), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_2_0_0_0, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2188]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2189]);
	}
	
	a3 = '.' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2190]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2191]);
	}
	
	(
		(
			a4 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
					startIncompleteElement(element);
				}
				if (a4 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_4_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2192]);
		}
		
		
		|		(
			a5 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
					startIncompleteElement(element);
				}
				if (a5 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_4_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2193]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2194]);
	}
	
	a6 = 'is' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2195]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2196]);
	}
	
	(
		(
			a7 = TEXT			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
					startIncompleteElement(element);
				}
				if (a7 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a7).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_6_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a7, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2197]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2198]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2199]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2200]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2201]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2202]);
		}
		
		
		|		(
			a8 = QUOTED_34_34_92			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.dsl.DslFactory.eINSTANCE.createRenamingFeatureBinding();
					startIncompleteElement(element);
				}
				if (a8 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_71_0_0_6_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2203]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2204]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2205]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2206]);
			addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2207]);
			addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2208]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2209]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2210]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2211]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2212]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2213]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2214]);
	}
	
;

parse_gbind_dsl_ConceptHelper returns [gbind.dsl.ConceptHelper element = null]
@init{
}
:
	a0 = 'operation' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2215]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__CONTEXT_CLASS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.dsl.ConceptMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConceptMetaclass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.ConceptHelper, gbind.dsl.ConceptMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getConceptHelperContextClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__CONTEXT_CLASS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__CONTEXT_CLASS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2216]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2217]);
	}
	
	(
		(
			(
				a2 = QUOTED_91_93				
				{
					if (terminateParsing) {
						throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
					}
					if (element == null) {
						element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
						tokenResolver.setOptions(getOptions());
						genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__QUALIFIER), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						gbind.dsl.ConcreteMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConcreteMetaclass();
						collectHiddenTokens(element);
						registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.ConceptHelper, gbind.dsl.ConcreteMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getConceptHelperQualifierReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__QUALIFIER), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__QUALIFIER), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_2_0_0_0, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2218]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2219]);
	}
	
	a3 = '.' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2220]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__FEATURE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__FEATURE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2221]);
	}
	
	a5 = ':' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2222]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2223]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2224]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2225]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2226]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2227]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2228]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2229]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2230]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2231]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2232]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2233]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2234]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2235]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2236]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2237]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2238]);
	}
	
	(
		a6_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
				startIncompleteElement(element);
			}
			if (a6_0 != null) {
				if (a6_0 != null) {
					Object value = a6_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_6, a6_0, true);
				copyLocalizationInfos(a6_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2239]);
	}
	
	a7 = '=' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2240]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2241]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2242]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2243]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2244]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2245]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2246]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2247]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2248]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2249]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2250]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2251]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2252]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2253]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2254]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2255]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2256]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2257]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2258]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2259]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2260]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2261]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2262]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2263]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2264]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2265]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2266]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2267]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2268]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2269]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2270]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2271]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2272]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2273]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2274]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2275]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2276]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2277]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2278]);
	}
	
	(
		a8_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createConceptHelper();
				startIncompleteElement(element);
			}
			if (a8_0 != null) {
				if (a8_0 != null) {
					Object value = a8_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__BODY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_72_0_0_8, a8_0, true);
				copyLocalizationInfos(a8_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2279]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2280]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2281]);
	}
	
;

parse_gbind_dsl_LocalHelper returns [gbind.dsl.LocalHelper element = null]
@init{
}
:
	a0 = 'helper' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2282]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				gbind.dsl.ConcreteMetaclass proxy = gbind.dsl.DslFactory.eINSTANCE.createConcreteMetaclass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.dsl.LocalHelper, gbind.dsl.ConcreteMetaclass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getLocalHelperContextReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2283]);
	}
	
	a2 = '.' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2284]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__FEATURE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__FEATURE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2285]);
	}
	
	a4 = ':' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2286]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2287]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2288]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2289]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2290]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2291]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2292]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2293]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2294]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2295]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2296]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2297]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2298]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2299]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2300]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2301]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2302]);
	}
	
	(
		a5_0 = parse_gbind_simpleocl_OclType		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
				startIncompleteElement(element);
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					Object value = a5_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__TYPE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_5, a5_0, true);
				copyLocalizationInfos(a5_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2303]);
	}
	
	a6 = '=' {
		if (element == null) {
			element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2304]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2305]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2306]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2307]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2308]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2309]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2310]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2311]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2312]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2313]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2314]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2315]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2316]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2317]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2318]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2319]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2320]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2321]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2322]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2323]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2324]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2325]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2326]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2327]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2328]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2329]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2330]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2331]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2332]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2333]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2334]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2335]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2336]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2337]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2338]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2339]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2340]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2341]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2342]);
	}
	
	(
		a7_0 = parse_gbind_simpleocl_OclExpression		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.dsl.DslFactory.eINSTANCE.createLocalHelper();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__BODY), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_73_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2343]);
		addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2344]);
		addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2345]);
	}
	
;

parseop_OclExpression_level_1 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
	leftArg = parseop_OclExpression_level_2	((
		()
		{ element = null; }
		(
			a0 = BOOLOP			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperatorCallExp();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLOP");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_33_0_0_1, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2346]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2347]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2348]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2349]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2350]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2351]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2352]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2353]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2354]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2355]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2356]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2357]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2358]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2359]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2360]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2361]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2362]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2363]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2364]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2365]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2366]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2367]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2368]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2369]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2370]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2371]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2372]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2373]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2374]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2375]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2376]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2377]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2378]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2379]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2380]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2381]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2382]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2383]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2384]);
		}
		
		rightArg = parseop_OclExpression_level_2		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperatorCallExp();
				startIncompleteElement(element);
			}
			if (leftArg != null) {
				if (leftArg != null) {
					Object value = leftArg;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_33_0_0_0, leftArg, true);
				copyLocalizationInfos(leftArg, element);
			}
		}
		{
			if (terminateParsing) {
				throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
			}
			if (element == null) {
				element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOperatorCallExp();
				startIncompleteElement(element);
			}
			if (rightArg != null) {
				if (rightArg != null) {
					Object value = rightArg;
					element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__ARGUMENT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_33_0_0_2, rightArg, true);
				copyLocalizationInfos(rightArg, element);
			}
		}
		{ leftArg = element; /* this may become an argument in the next iteration */ }
	)+ | /* epsilon */ { element = leftArg; }
	
)
;

parseop_OclExpression_level_2 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_3((
	()
	{ element = null; }
	(
		(
			a0 = EQ			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEqOpCallExp();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("EQ");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_34_0_0_1_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2385]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2386]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2387]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2388]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2389]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2390]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2391]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2392]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2393]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2394]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2395]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2396]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2397]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2398]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2399]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2400]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2401]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2402]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2403]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2404]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2405]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2406]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2407]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2408]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2409]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2410]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2411]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2412]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2413]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2414]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2415]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2416]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2417]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2418]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2419]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2420]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2421]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2422]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2423]);
		}
		
		
		|		(
			a1 = NEQ			
			{
				if (terminateParsing) {
					throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
				}
				if (element == null) {
					element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEqOpCallExp();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NEQ");
					tokenResolver.setOptions(getOptions());
					genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_34_0_0_1_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2424]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2425]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2426]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2427]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2428]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2429]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2430]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2431]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2432]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2433]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2434]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2435]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2436]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2437]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2438]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2439]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2440]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2441]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2442]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2443]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2444]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2445]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2446]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2447]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2448]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2449]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2450]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2451]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2452]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2453]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2454]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2455]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2456]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2457]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2458]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2459]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2460]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2461]);
			addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2462]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2463]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2464]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2465]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2466]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2467]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2468]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2469]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2470]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2471]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2472]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2473]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2474]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2475]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2476]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2477]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2478]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2479]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2480]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2481]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2482]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2483]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2484]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2485]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2486]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2487]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2488]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2489]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2490]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2491]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2492]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2493]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2494]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2495]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2496]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2497]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2498]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2499]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2500]);
		addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2501]);
	}
	
	rightArg = parseop_OclExpression_level_3	{
		if (terminateParsing) {
			throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
		}
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEqOpCallExp();
			startIncompleteElement(element);
		}
		if (leftArg != null) {
			if (leftArg != null) {
				Object value = leftArg;
				element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__SOURCE), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_34_0_0_0, leftArg, true);
			copyLocalizationInfos(leftArg, element);
		}
	}
	{
		if (terminateParsing) {
			throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
		}
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEqOpCallExp();
			startIncompleteElement(element);
		}
		if (rightArg != null) {
			if (rightArg != null) {
				Object value = rightArg;
				element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__ARGUMENT), value);
				completedElement(value, true);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_34_0_0_2, rightArg, true);
			copyLocalizationInfos(rightArg, element);
		}
	}
	{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_3 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_4((
()
{ element = null; }
(
	a0 = RELOP	
	{
		if (terminateParsing) {
			throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
		}
		if (element == null) {
			element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createRelOpCallExp();
			startIncompleteElement(element);
		}
		if (a0 != null) {
			genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("RELOP");
			tokenResolver.setOptions(getOptions());
			genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
			tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME), result);
			Object resolvedObject = result.getResolvedToken();
			if (resolvedObject == null) {
				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
			}
			java.lang.String resolved = (java.lang.String) resolvedObject;
			if (resolved != null) {
				Object value = resolved;
				element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME), value);
				completedElement(value, false);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_35_0_0_1, resolved, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
		}
	}
)
{
	// expected elements (follow set)
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2502]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2503]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2504]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2505]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2506]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2507]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2508]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2509]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2510]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2511]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2512]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2513]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2514]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2515]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2516]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2517]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2518]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2519]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2520]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2521]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2522]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2523]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2524]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2525]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2526]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2527]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2528]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2529]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2530]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2531]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2532]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2533]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2534]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2535]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2536]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2537]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2538]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2539]);
	addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2540]);
}

rightArg = parseop_OclExpression_level_4{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createRelOpCallExp();
		startIncompleteElement(element);
	}
	if (leftArg != null) {
		if (leftArg != null) {
			Object value = leftArg;
			element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__SOURCE), value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_35_0_0_0, leftArg, true);
		copyLocalizationInfos(leftArg, element);
	}
}
{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createRelOpCallExp();
		startIncompleteElement(element);
	}
	if (rightArg != null) {
		if (rightArg != null) {
			Object value = rightArg;
			element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__ARGUMENT), value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_35_0_0_2, rightArg, true);
		copyLocalizationInfos(rightArg, element);
	}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_4 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_5((
()
{ element = null; }
(
a0 = ADDOP
{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAddOpCallExp();
		startIncompleteElement(element);
	}
	if (a0 != null) {
		genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ADDOP");
		tokenResolver.setOptions(getOptions());
		genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
		tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME), result);
		Object resolvedObject = result.getResolvedToken();
		if (resolvedObject == null) {
			addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
		}
		java.lang.String resolved = (java.lang.String) resolvedObject;
		if (resolved != null) {
			Object value = resolved;
			element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME), value);
			completedElement(value, false);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_36_0_0_1, resolved, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2541]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2542]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2543]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2544]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2545]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2546]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2547]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2548]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2549]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2550]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2551]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2552]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2553]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2554]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2555]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2556]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2557]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2558]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2559]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2560]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2561]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2562]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2563]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2564]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2565]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2566]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2567]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2568]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2569]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2570]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2571]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2572]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2573]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2574]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2575]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2576]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2577]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2578]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2579]);
}

rightArg = parseop_OclExpression_level_5{
if (terminateParsing) {
	throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAddOpCallExp();
	startIncompleteElement(element);
}
if (leftArg != null) {
	if (leftArg != null) {
		Object value = leftArg;
		element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__SOURCE), value);
		completedElement(value, true);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_36_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
if (terminateParsing) {
	throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createAddOpCallExp();
	startIncompleteElement(element);
}
if (rightArg != null) {
	if (rightArg != null) {
		Object value = rightArg;
		element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__ARGUMENT), value);
		completedElement(value, true);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_36_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_5 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_6((
()
{ element = null; }
(
a0 = INTOP
{
if (terminateParsing) {
	throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIntOpCallExp();
	startIncompleteElement(element);
}
if (a0 != null) {
	genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTOP");
	tokenResolver.setOptions(getOptions());
	genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
	tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME), result);
	Object resolvedObject = result.getResolvedToken();
	if (resolvedObject == null) {
		addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
	}
	java.lang.String resolved = (java.lang.String) resolvedObject;
	if (resolved != null) {
		Object value = resolved;
		element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME), value);
		completedElement(value, false);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_37_0_0_1, resolved, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2580]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2581]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2582]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2583]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2584]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2585]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2586]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2587]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2588]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2589]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2590]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2591]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2592]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2593]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2594]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2595]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2596]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2597]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2598]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2599]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2600]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2601]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2602]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2603]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2604]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2605]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2606]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2607]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2608]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2609]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2610]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2611]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2612]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2613]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2614]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2615]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2616]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2617]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2618]);
}

rightArg = parseop_OclExpression_level_6{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIntOpCallExp();
startIncompleteElement(element);
}
if (leftArg != null) {
if (leftArg != null) {
	Object value = leftArg;
	element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__SOURCE), value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_37_0_0_0, leftArg, true);
copyLocalizationInfos(leftArg, element);
}
}
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIntOpCallExp();
startIncompleteElement(element);
}
if (rightArg != null) {
if (rightArg != null) {
	Object value = rightArg;
	element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__ARGUMENT), value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_37_0_0_2, rightArg, true);
copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_6 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
leftArg = parseop_OclExpression_level_7((
()
{ element = null; }
(
a0 = MULOP
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMulOpCallExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("MULOP");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
	addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
	Object value = resolved;
	element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME), value);
	completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_38_0_0_1, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2619]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2620]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2621]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2622]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2623]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2624]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2625]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2626]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2627]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2628]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2629]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2630]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2631]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2632]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2633]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2634]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2635]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2636]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2637]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2638]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2639]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2640]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2641]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2642]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2643]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2644]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2645]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2646]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2647]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2648]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2649]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2650]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2651]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2652]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2653]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2654]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2655]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2656]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2657]);
}

rightArg = parseop_OclExpression_level_7{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMulOpCallExp();
startIncompleteElement(element);
}
if (leftArg != null) {
if (leftArg != null) {
Object value = leftArg;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__SOURCE), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_38_0_0_0, leftArg, true);
copyLocalizationInfos(leftArg, element);
}
}
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMulOpCallExp();
startIncompleteElement(element);
}
if (rightArg != null) {
if (rightArg != null) {
Object value = rightArg;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__ARGUMENT), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_38_0_0_2, rightArg, true);
copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_OclExpression_level_7 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
(
a0 = NOTOP
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createNotOpCallExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NOTOP");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_39_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2658]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2659]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2660]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2661]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2662]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2663]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2664]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2665]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2666]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2667]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2668]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2669]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2670]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2671]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2672]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2673]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2674]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2675]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2676]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2677]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2678]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2679]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2680]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2681]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2682]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2683]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2684]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2685]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2686]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2687]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2688]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2689]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2690]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2691]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2692]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2693]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2694]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2695]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2696]);
}

arg = parseop_OclExpression_level_10{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createNotOpCallExp();
startIncompleteElement(element);
}
if (arg != null) {
if (arg != null) {
Object value = arg;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__SOURCE), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_39_0_0_1, arg, true);
copyLocalizationInfos(arg, element);
}
}
|

arg = parseop_OclExpression_level_10{ element = arg; }
;

parseop_OclExpression_level_10 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
arg = parseop_OclExpression_level_20(
(
(
a0_0 = parse_gbind_simpleocl_PropertyCall{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createPropertyCallExp();
startIncompleteElement(element);
}
if (a0_0 != null) {
if (a0_0 != null) {
	Object value = a0_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__CALLS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_43_0_0_1, a0_0, true);
copyLocalizationInfos(a0_0, element);
}
}
)

)+{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2697]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2698]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2699]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2700]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2701]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2702]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2703]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2704]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2705]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2706]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2707]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2708]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2709]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2710]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2711]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2712]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2713]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2714]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2715]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2716]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2717]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2718]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2719]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2720]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2721]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2722]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2723]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2724]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2725]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2726]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2727]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2728]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2729]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2730]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2731]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2732]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2733]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2734]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2735]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2736]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2737]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2738]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2739]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2740]);
}

{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createPropertyCallExp();
startIncompleteElement(element);
}
if (arg != null) {
if (arg != null) {
Object value = arg;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__SOURCE), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_43_0_0_0, arg, true);
copyLocalizationInfos(arg, element);
}
}
|
/* epsilon */ { element = arg; } 
)
;

parseop_OclExpression_level_20 returns [gbind.simpleocl.OclExpression element = null]
@init{
}
:
c0 = parse_gbind_simpleocl_OclModelElementExp{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_gbind_simpleocl_LambdaCallExp{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_gbind_simpleocl_VariableExp{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_gbind_simpleocl_SuperExp{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_gbind_simpleocl_SelfExp{ element = c4; /* this is a subclass or primitive expression choice */ }
|c5 = parse_gbind_simpleocl_EnvExp{ element = c5; /* this is a subclass or primitive expression choice */ }
|c6 = parse_gbind_simpleocl_StringExp{ element = c6; /* this is a subclass or primitive expression choice */ }
|c7 = parse_gbind_simpleocl_BooleanExp{ element = c7; /* this is a subclass or primitive expression choice */ }
|c8 = parse_gbind_simpleocl_RealExp{ element = c8; /* this is a subclass or primitive expression choice */ }
|c9 = parse_gbind_simpleocl_IntegerExp{ element = c9; /* this is a subclass or primitive expression choice */ }
|c10 = parse_gbind_simpleocl_BagExp{ element = c10; /* this is a subclass or primitive expression choice */ }
|c11 = parse_gbind_simpleocl_OrderedSetExp{ element = c11; /* this is a subclass or primitive expression choice */ }
|c12 = parse_gbind_simpleocl_SequenceExp{ element = c12; /* this is a subclass or primitive expression choice */ }
|c13 = parse_gbind_simpleocl_SetExp{ element = c13; /* this is a subclass or primitive expression choice */ }
|c14 = parse_gbind_simpleocl_TupleExp{ element = c14; /* this is a subclass or primitive expression choice */ }
|c15 = parse_gbind_simpleocl_MapExp{ element = c15; /* this is a subclass or primitive expression choice */ }
|c16 = parse_gbind_simpleocl_EnumLiteralExp{ element = c16; /* this is a subclass or primitive expression choice */ }
|c17 = parse_gbind_simpleocl_OclUndefinedExp{ element = c17; /* this is a subclass or primitive expression choice */ }
|c18 = parse_gbind_simpleocl_LetExp{ element = c18; /* this is a subclass or primitive expression choice */ }
|c19 = parse_gbind_simpleocl_IfExp{ element = c19; /* this is a subclass or primitive expression choice */ }
|c20 = parse_gbind_simpleocl_BraceExp{ element = c20; /* this is a subclass or primitive expression choice */ }
|c21 = parse_gbind_simpleocl_StaticPropertyCallExp{ element = c21; /* this is a subclass or primitive expression choice */ }
;

parse_gbind_simpleocl_OclModelElementExp returns [gbind.simpleocl.OclModelElementExp element = null]
@init{
}
:
(
a0 = TEXT
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElementExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
String resolved = (String) resolvedObject;
gbind.simpleocl.OclModel proxy = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclMetamodel();
collectHiddenTokens(element);
registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.simpleocl.OclModelElementExp, gbind.simpleocl.OclModel>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementExpModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), resolved, proxy);
if (proxy != null) {
Object value = proxy;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_10_0_0_0, proxy, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2741]);
}

a1 = '!' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElementExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_10_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2742]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2743]);
}

(
(
a2 = TEXT
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElementExp();
startIncompleteElement(element);
}
if (a2 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_10_0_0_2_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2744]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2745]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2746]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2747]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2748]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2749]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2750]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2751]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2752]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2753]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2754]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2755]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2756]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2757]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2758]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2759]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2760]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2761]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2762]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2763]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2764]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2765]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2766]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2767]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2768]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2769]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2770]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2771]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2772]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2773]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2774]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2775]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2776]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2777]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2778]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2779]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2780]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2781]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2782]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2783]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2784]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2785]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2786]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2787]);
}


|(
a3 = QUOTED_34_34_92
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclModelElementExp();
startIncompleteElement(element);
}
if (a3 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_10_0_0_2_0_1_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2788]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2789]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2790]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2791]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2792]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2793]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2794]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2795]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2796]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2797]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2798]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2799]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2800]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2801]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2802]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2803]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2804]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2805]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2806]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2807]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2808]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2809]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2810]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2811]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2812]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2813]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2814]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2815]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2816]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2817]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2818]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2819]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2820]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2821]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2822]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2823]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2824]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2825]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2826]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2827]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2828]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2829]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2830]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2831]);
}

)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2832]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2833]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2834]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2835]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2836]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2837]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2838]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2839]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2840]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2841]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2842]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2843]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2844]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2845]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2846]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2847]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2848]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2849]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2850]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2851]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2852]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2853]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2854]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2855]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2856]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2857]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2858]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2859]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2860]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2861]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2862]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2863]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2864]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2865]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2866]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2867]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2868]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2869]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2870]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2871]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2872]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2873]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2874]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2875]);
}

;

parse_gbind_simpleocl_LambdaCallExp returns [gbind.simpleocl.LambdaCallExp element = null]
@init{
}
:
(
a0 = TEXT
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaCallExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
String resolved = (String) resolvedObject;
gbind.simpleocl.VariableDeclaration proxy = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTuplePart();
collectHiddenTokens(element);
registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.simpleocl.VariableExp, gbind.simpleocl.VariableDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE), resolved, proxy);
if (proxy != null) {
Object value = proxy;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_11_0_0_0, proxy, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2876]);
}

a1 = '(' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaCallExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_11_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2877]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2878]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2879]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2880]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2881]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2882]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2883]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2884]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2885]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2886]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2887]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2888]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2889]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2890]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2891]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2892]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2893]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2894]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2895]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2896]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2897]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2898]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2899]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2900]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2901]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2902]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2903]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2904]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2905]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2906]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2907]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2908]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2909]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2910]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2911]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2912]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2913]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2914]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2915]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2916]);
}

(
(
(
a2_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaCallExp();
startIncompleteElement(element);
}
if (a2_0 != null) {
if (a2_0 != null) {
	Object value = a2_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_11_0_0_2_0_0_0, a2_0, true);
copyLocalizationInfos(a2_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2917]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2918]);
}

(
(
a3 = ',' {
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaCallExp();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_11_0_0_2_0_0_1_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2919]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2920]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2921]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2922]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2923]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2924]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2925]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2926]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2927]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2928]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2929]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2930]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2931]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2932]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2933]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2934]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2935]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2936]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2937]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2938]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2939]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2940]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2941]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2942]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2943]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2944]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2945]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2946]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2947]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2948]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2949]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2950]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2951]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2952]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2953]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2954]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2955]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2956]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2957]);
}

(
a4_0 = parse_gbind_simpleocl_OclExpression{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaCallExp();
		startIncompleteElement(element);
	}
	if (a4_0 != null) {
		if (a4_0 != null) {
			Object value = a4_0;
			addObjectToList(element, gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_11_0_0_2_0_0_1_0_0_1, a4_0, true);
		copyLocalizationInfos(a4_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2958]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2959]);
}

)

)*{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2960]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2961]);
}

)

)?{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2962]);
}

a5 = ')' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLambdaCallExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_11_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2963]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2964]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2965]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2966]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2967]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2968]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2969]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2970]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2971]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2972]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2973]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2974]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2975]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2976]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2977]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2978]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2979]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2980]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2981]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2982]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2983]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2984]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2985]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2986]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2987]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2988]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2989]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2990]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2991]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2992]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2993]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2994]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2995]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2996]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2997]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2998]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[2999]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3000]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3001]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3002]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3003]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3004]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3005]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3006]);
}

;

parse_gbind_simpleocl_VariableExp returns [gbind.simpleocl.VariableExp element = null]
@init{
}
:
(
a0 = TEXT
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createVariableExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
String resolved = (String) resolvedObject;
gbind.simpleocl.VariableDeclaration proxy = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTuplePart();
collectHiddenTokens(element);
registerContextDependentProxy(new genericity.language.gbind.mopp.GbindContextDependentURIFragmentFactory<gbind.simpleocl.VariableExp, gbind.simpleocl.VariableDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE), resolved, proxy);
if (proxy != null) {
Object value = proxy;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_12_0_0_0, proxy, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3007]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3008]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3009]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3010]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3011]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3012]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3013]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3014]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3015]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3016]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3017]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3018]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3019]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3020]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3021]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3022]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3023]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3024]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3025]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3026]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3027]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3028]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3029]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3030]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3031]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3032]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3033]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3034]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3035]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3036]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3037]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3038]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3039]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3040]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3041]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3042]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3043]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3044]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3045]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3046]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3047]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3048]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3049]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3050]);
}

;

parse_gbind_simpleocl_SuperExp returns [gbind.simpleocl.SuperExp element = null]
@init{
}
:
a0 = 'super' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSuperExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_13_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3051]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3052]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3053]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3054]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3055]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3056]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3057]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3058]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3059]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3060]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3061]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3062]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3063]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3064]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3065]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3066]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3067]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3068]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3069]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3070]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3071]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3072]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3073]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3074]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3075]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3076]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3077]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3078]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3079]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3080]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3081]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3082]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3083]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3084]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3085]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3086]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3087]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3088]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3089]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3090]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3091]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3092]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3093]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3094]);
}

;

parse_gbind_simpleocl_SelfExp returns [gbind.simpleocl.SelfExp element = null]
@init{
}
:
a0 = 'self' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSelfExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_14_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3095]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3096]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3097]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3098]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3099]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3100]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3101]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3102]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3103]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3104]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3105]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3106]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3107]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3108]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3109]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3110]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3111]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3112]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3113]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3114]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3115]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3116]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3117]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3118]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3119]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3120]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3121]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3122]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3123]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3124]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3125]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3126]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3127]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3128]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3129]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3130]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3131]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3132]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3133]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3134]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3135]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3136]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3137]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3138]);
}

;

parse_gbind_simpleocl_EnvExp returns [gbind.simpleocl.EnvExp element = null]
@init{
}
:
a0 = 'env' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEnvExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_15_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3139]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3140]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3141]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3142]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3143]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3144]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3145]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3146]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3147]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3148]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3149]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3150]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3151]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3152]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3153]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3154]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3155]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3156]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3157]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3158]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3159]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3160]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3161]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3162]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3163]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3164]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3165]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3166]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3167]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3168]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3169]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3170]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3171]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3172]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3173]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3174]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3175]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3176]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3177]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3178]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3179]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3180]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3181]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3182]);
}

;

parse_gbind_simpleocl_StringExp returns [gbind.simpleocl.StringExp element = null]
@init{
}
:
(
a0 = QUOTED_39_39_92
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStringExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_16_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3183]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3184]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3185]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3186]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3187]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3188]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3189]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3190]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3191]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3192]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3193]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3194]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3195]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3196]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3197]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3198]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3199]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3200]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3201]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3202]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3203]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3204]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3205]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3206]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3207]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3208]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3209]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3210]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3211]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3212]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3213]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3214]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3215]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3216]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3217]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3218]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3219]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3220]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3221]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3222]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3223]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3224]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3225]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3226]);
}

;

parse_gbind_simpleocl_BooleanExp returns [gbind.simpleocl.BooleanExp element = null]
@init{
}
:
(
(
a0 = 'true' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBooleanExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_17_0_0_0, true, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
// set value of boolean attribute
Object value = true;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL), value);
completedElement(value, false);
}
|a1 = 'false' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBooleanExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_17_0_0_0, false, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
// set value of boolean attribute
Object value = false;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL), value);
completedElement(value, false);
}
)
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3227]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3228]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3229]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3230]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3231]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3232]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3233]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3234]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3235]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3236]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3237]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3238]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3239]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3240]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3241]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3242]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3243]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3244]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3245]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3246]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3247]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3248]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3249]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3250]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3251]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3252]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3253]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3254]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3255]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3256]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3257]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3258]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3259]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3260]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3261]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3262]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3263]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3264]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3265]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3266]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3267]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3268]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3269]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3270]);
}

;

parse_gbind_simpleocl_RealExp returns [gbind.simpleocl.RealExp element = null]
@init{
}
:
(
a0 = FLOAT
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createRealExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
java.lang.Double resolved = (java.lang.Double) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_18_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3271]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3272]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3273]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3274]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3275]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3276]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3277]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3278]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3279]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3280]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3281]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3282]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3283]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3284]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3285]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3286]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3287]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3288]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3289]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3290]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3291]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3292]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3293]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3294]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3295]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3296]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3297]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3298]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3299]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3300]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3301]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3302]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3303]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3304]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3305]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3306]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3307]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3308]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3309]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3310]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3311]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3312]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3313]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3314]);
}

;

parse_gbind_simpleocl_IntegerExp returns [gbind.simpleocl.IntegerExp element = null]
@init{
}
:
(
a0 = INTEGER
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIntegerExp();
startIncompleteElement(element);
}
if (a0 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_19_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3315]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3316]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3317]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3318]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3319]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3320]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3321]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3322]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3323]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3324]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3325]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3326]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3327]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3328]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3329]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3330]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3331]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3332]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3333]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3334]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3335]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3336]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3337]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3338]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3339]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3340]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3341]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3342]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3343]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3344]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3345]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3346]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3347]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3348]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3349]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3350]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3351]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3352]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3353]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3354]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3355]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3356]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3357]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3358]);
}

;

parse_gbind_simpleocl_BagExp returns [gbind.simpleocl.BagExp element = null]
@init{
}
:
a0 = 'Bag' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_20_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3359]);
}

a1 = '{' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_20_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3360]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3361]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3362]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3363]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3364]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3365]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3366]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3367]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3368]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3369]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3370]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3371]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3372]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3373]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3374]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3375]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3376]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3377]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3378]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3379]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3380]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3381]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3382]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3383]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3384]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3385]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3386]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3387]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3388]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3389]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3390]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3391]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3392]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3393]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3394]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3395]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3396]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3397]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3398]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3399]);
}

(
(
(
a2_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagExp();
startIncompleteElement(element);
}
if (a2_0 != null) {
if (a2_0 != null) {
	Object value = a2_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.BAG_EXP__ELEMENTS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_20_0_0_2_0_0_0, a2_0, true);
copyLocalizationInfos(a2_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3400]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3401]);
}

(
(
a3 = ',' {
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagExp();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_20_0_0_2_0_0_1_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3402]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3403]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3404]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3405]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3406]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3407]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3408]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3409]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3410]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3411]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3412]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3413]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3414]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3415]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3416]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3417]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3418]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3419]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3420]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3421]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3422]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3423]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3424]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3425]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3426]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3427]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3428]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3429]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3430]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3431]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3432]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3433]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3434]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3435]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3436]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3437]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3438]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3439]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3440]);
}

(
a4_0 = parse_gbind_simpleocl_OclExpression{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagExp();
		startIncompleteElement(element);
	}
	if (a4_0 != null) {
		if (a4_0 != null) {
			Object value = a4_0;
			addObjectToList(element, gbind.simpleocl.SimpleoclPackage.BAG_EXP__ELEMENTS, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_20_0_0_2_0_0_1_0_0_1, a4_0, true);
		copyLocalizationInfos(a4_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3441]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3442]);
}

)

)*{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3443]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3444]);
}

)

)?{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3445]);
}

a5 = '}' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBagExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_20_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3446]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3447]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3448]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3449]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3450]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3451]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3452]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3453]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3454]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3455]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3456]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3457]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3458]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3459]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3460]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3461]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3462]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3463]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3464]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3465]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3466]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3467]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3468]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3469]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3470]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3471]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3472]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3473]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3474]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3475]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3476]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3477]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3478]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3479]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3480]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3481]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3482]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3483]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3484]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3485]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3486]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3487]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3488]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3489]);
}

;

parse_gbind_simpleocl_OrderedSetExp returns [gbind.simpleocl.OrderedSetExp element = null]
@init{
}
:
a0 = 'OrderedSet' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_21_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3490]);
}

a1 = '{' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_21_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3491]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3492]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3493]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3494]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3495]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3496]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3497]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3498]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3499]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3500]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3501]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3502]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3503]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3504]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3505]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3506]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3507]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3508]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3509]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3510]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3511]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3512]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3513]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3514]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3515]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3516]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3517]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3518]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3519]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3520]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3521]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3522]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3523]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3524]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3525]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3526]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3527]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3528]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3529]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3530]);
}

(
(
(
a2_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetExp();
startIncompleteElement(element);
}
if (a2_0 != null) {
if (a2_0 != null) {
	Object value = a2_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__ELEMENTS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_21_0_0_2_0_0_0, a2_0, true);
copyLocalizationInfos(a2_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3531]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3532]);
}

(
(
a3 = ',' {
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetExp();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_21_0_0_2_0_0_1_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3533]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3534]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3535]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3536]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3537]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3538]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3539]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3540]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3541]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3542]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3543]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3544]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3545]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3546]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3547]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3548]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3549]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3550]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3551]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3552]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3553]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3554]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3555]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3556]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3557]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3558]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3559]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3560]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3561]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3562]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3563]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3564]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3565]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3566]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3567]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3568]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3569]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3570]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3571]);
}

(
a4_0 = parse_gbind_simpleocl_OclExpression{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetExp();
		startIncompleteElement(element);
	}
	if (a4_0 != null) {
		if (a4_0 != null) {
			Object value = a4_0;
			addObjectToList(element, gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__ELEMENTS, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_21_0_0_2_0_0_1_0_0_1, a4_0, true);
		copyLocalizationInfos(a4_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3572]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3573]);
}

)

)*{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3574]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3575]);
}

)

)?{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3576]);
}

a5 = '}' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOrderedSetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_21_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3577]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3578]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3579]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3580]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3581]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3582]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3583]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3584]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3585]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3586]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3587]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3588]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3589]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3590]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3591]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3592]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3593]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3594]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3595]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3596]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3597]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3598]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3599]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3600]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3601]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3602]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3603]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3604]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3605]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3606]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3607]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3608]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3609]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3610]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3611]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3612]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3613]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3614]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3615]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3616]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3617]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3618]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3619]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3620]);
}

;

parse_gbind_simpleocl_SequenceExp returns [gbind.simpleocl.SequenceExp element = null]
@init{
}
:
a0 = 'Sequence' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_22_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3621]);
}

a1 = '{' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_22_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3622]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3623]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3624]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3625]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3626]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3627]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3628]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3629]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3630]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3631]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3632]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3633]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3634]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3635]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3636]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3637]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3638]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3639]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3640]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3641]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3642]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3643]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3644]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3645]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3646]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3647]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3648]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3649]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3650]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3651]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3652]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3653]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3654]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3655]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3656]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3657]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3658]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3659]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3660]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3661]);
}

(
(
(
a2_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceExp();
startIncompleteElement(element);
}
if (a2_0 != null) {
if (a2_0 != null) {
	Object value = a2_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__ELEMENTS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_22_0_0_2_0_0_0, a2_0, true);
copyLocalizationInfos(a2_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3662]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3663]);
}

(
(
a3 = ',' {
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceExp();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_22_0_0_2_0_0_1_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3664]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3665]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3666]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3667]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3668]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3669]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3670]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3671]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3672]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3673]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3674]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3675]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3676]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3677]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3678]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3679]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3680]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3681]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3682]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3683]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3684]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3685]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3686]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3687]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3688]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3689]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3690]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3691]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3692]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3693]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3694]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3695]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3696]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3697]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3698]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3699]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3700]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3701]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3702]);
}

(
a4_0 = parse_gbind_simpleocl_OclExpression{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceExp();
		startIncompleteElement(element);
	}
	if (a4_0 != null) {
		if (a4_0 != null) {
			Object value = a4_0;
			addObjectToList(element, gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__ELEMENTS, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_22_0_0_2_0_0_1_0_0_1, a4_0, true);
		copyLocalizationInfos(a4_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3703]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3704]);
}

)

)*{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3705]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3706]);
}

)

)?{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3707]);
}

a5 = '}' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSequenceExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_22_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3708]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3709]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3710]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3711]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3712]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3713]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3714]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3715]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3716]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3717]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3718]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3719]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3720]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3721]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3722]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3723]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3724]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3725]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3726]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3727]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3728]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3729]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3730]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3731]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3732]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3733]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3734]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3735]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3736]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3737]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3738]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3739]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3740]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3741]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3742]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3743]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3744]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3745]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3746]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3747]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3748]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3749]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3750]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3751]);
}

;

parse_gbind_simpleocl_SetExp returns [gbind.simpleocl.SetExp element = null]
@init{
}
:
a0 = 'Set' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_23_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3752]);
}

a1 = '{' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_23_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3753]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3754]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3755]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3756]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3757]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3758]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3759]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3760]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3761]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3762]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3763]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3764]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3765]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3766]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3767]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3768]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3769]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3770]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3771]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3772]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3773]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3774]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3775]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3776]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3777]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3778]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3779]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3780]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3781]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3782]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3783]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3784]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3785]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3786]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3787]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3788]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3789]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3790]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3791]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3792]);
}

(
(
(
a2_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetExp();
startIncompleteElement(element);
}
if (a2_0 != null) {
if (a2_0 != null) {
	Object value = a2_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.SET_EXP__ELEMENTS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_23_0_0_2_0_0_0, a2_0, true);
copyLocalizationInfos(a2_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3793]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3794]);
}

(
(
a3 = ',' {
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetExp();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_23_0_0_2_0_0_1_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3795]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3796]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3797]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3798]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3799]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3800]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3801]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3802]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3803]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3804]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3805]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3806]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3807]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3808]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3809]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3810]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3811]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3812]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3813]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3814]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3815]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3816]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3817]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3818]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3819]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3820]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3821]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3822]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3823]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3824]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3825]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3826]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3827]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3828]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3829]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3830]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3831]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3832]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3833]);
}

(
a4_0 = parse_gbind_simpleocl_OclExpression{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetExp();
		startIncompleteElement(element);
	}
	if (a4_0 != null) {
		if (a4_0 != null) {
			Object value = a4_0;
			addObjectToList(element, gbind.simpleocl.SimpleoclPackage.SET_EXP__ELEMENTS, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_23_0_0_2_0_0_1_0_0_1, a4_0, true);
		copyLocalizationInfos(a4_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3834]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3835]);
}

)

)*{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3836]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3837]);
}

)

)?{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3838]);
}

a5 = '}' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createSetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_23_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3839]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3840]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3841]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3842]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3843]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3844]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3845]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3846]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3847]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3848]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3849]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3850]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3851]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3852]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3853]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3854]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3855]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3856]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3857]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3858]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3859]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3860]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3861]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3862]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3863]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3864]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3865]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3866]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3867]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3868]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3869]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3870]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3871]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3872]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3873]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3874]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3875]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3876]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3877]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3878]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3879]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3880]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3881]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3882]);
}

;

parse_gbind_simpleocl_TupleExp returns [gbind.simpleocl.TupleExp element = null]
@init{
}
:
a0 = 'Tuple' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_24_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3883]);
}

a1 = '{' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_24_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3884]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3885]);
}

(
(
(
a2_0 = parse_gbind_simpleocl_TuplePart{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleExp();
startIncompleteElement(element);
}
if (a2_0 != null) {
if (a2_0 != null) {
	Object value = a2_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_24_0_0_2_0_0_0, a2_0, true);
copyLocalizationInfos(a2_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3886]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3887]);
}

(
(
a3 = ',' {
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleExp();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_24_0_0_2_0_0_1_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3888]);
}

(
a4_0 = parse_gbind_simpleocl_TuplePart{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleExp();
		startIncompleteElement(element);
	}
	if (a4_0 != null) {
		if (a4_0 != null) {
			Object value = a4_0;
			addObjectToList(element, gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_24_0_0_2_0_0_1_0_0_1, a4_0, true);
		copyLocalizationInfos(a4_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3889]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3890]);
}

)

)*{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3891]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3892]);
}

)

)?{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3893]);
}

a5 = '}' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createTupleExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_24_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3894]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3895]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3896]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3897]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3898]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3899]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3900]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3901]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3902]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3903]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3904]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3905]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3906]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3907]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3908]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3909]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3910]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3911]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3912]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3913]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3914]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3915]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3916]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3917]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3918]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3919]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3920]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3921]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3922]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3923]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3924]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3925]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3926]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3927]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3928]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3929]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3930]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3931]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3932]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3933]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3934]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3935]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3936]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3937]);
}

;

parse_gbind_simpleocl_MapExp returns [gbind.simpleocl.MapExp element = null]
@init{
}
:
a0 = 'Map' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_26_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3938]);
}

a1 = '{' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_26_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3939]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3940]);
}

(
(
(
a2_0 = parse_gbind_simpleocl_MapElement{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapExp();
startIncompleteElement(element);
}
if (a2_0 != null) {
if (a2_0 != null) {
	Object value = a2_0;
	addObjectToList(element, gbind.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS, value);
	completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_26_0_0_2_0_0_0, a2_0, true);
copyLocalizationInfos(a2_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3941]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3942]);
}

(
(
a3 = ',' {
if (element == null) {
	element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapExp();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_26_0_0_2_0_0_1_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3943]);
}

(
a4_0 = parse_gbind_simpleocl_MapElement{
	if (terminateParsing) {
		throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
	}
	if (element == null) {
		element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapExp();
		startIncompleteElement(element);
	}
	if (a4_0 != null) {
		if (a4_0 != null) {
			Object value = a4_0;
			addObjectToList(element, gbind.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS, value);
			completedElement(value, true);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_26_0_0_2_0_0_1_0_0_1, a4_0, true);
		copyLocalizationInfos(a4_0, element);
	}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3944]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3945]);
}

)

)*{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3946]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3947]);
}

)

)?{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3948]);
}

a5 = '}' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createMapExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_26_0_0_3, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3949]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3950]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3951]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3952]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3953]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3954]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3955]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3956]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3957]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3958]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3959]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3960]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3961]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3962]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3963]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3964]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3965]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3966]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3967]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3968]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3969]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3970]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3971]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3972]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3973]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3974]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3975]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3976]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3977]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3978]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3979]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3980]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3981]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3982]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3983]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3984]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3985]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3986]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3987]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3988]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3989]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3990]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3991]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3992]);
}

;

parse_gbind_simpleocl_EnumLiteralExp returns [gbind.simpleocl.EnumLiteralExp element = null]
@init{
}
:
a0 = '#' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEnumLiteralExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_28_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3993]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3994]);
}

(
(
a1 = TEXT
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEnumLiteralExp();
startIncompleteElement(element);
}
if (a1 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_28_0_0_1_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3995]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3996]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3997]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3998]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[3999]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4000]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4001]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4002]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4003]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4004]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4005]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4006]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4007]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4008]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4009]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4010]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4011]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4012]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4013]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4014]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4015]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4016]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4017]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4018]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4019]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4020]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4021]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4022]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4023]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4024]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4025]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4026]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4027]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4028]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4029]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4030]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4031]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4032]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4033]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4034]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4035]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4036]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4037]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4038]);
}


|(
a2 = QUOTED_34_34_92
{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createEnumLiteralExp();
startIncompleteElement(element);
}
if (a2 != null) {
genericity.language.gbind.IGbindTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
tokenResolver.setOptions(getOptions());
genericity.language.gbind.IGbindTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
}
java.lang.String resolved = (java.lang.String) resolvedObject;
if (resolved != null) {
Object value = resolved;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), value);
completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_28_0_0_1_0_1_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4039]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4040]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4041]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4042]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4043]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4044]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4045]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4046]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4047]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4048]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4049]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4050]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4051]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4052]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4053]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4054]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4055]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4056]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4057]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4058]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4059]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4060]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4061]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4062]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4063]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4064]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4065]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4066]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4067]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4068]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4069]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4070]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4071]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4072]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4073]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4074]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4075]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4076]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4077]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4078]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4079]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4080]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4081]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4082]);
}

)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4083]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4084]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4085]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4086]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4087]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4088]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4089]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4090]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4091]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4092]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4093]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4094]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4095]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4096]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4097]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4098]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4099]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4100]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4101]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4102]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4103]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4104]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4105]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4106]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4107]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4108]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4109]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4110]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4111]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4112]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4113]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4114]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4115]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4116]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4117]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4118]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4119]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4120]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4121]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4122]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4123]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4124]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4125]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4126]);
}

;

parse_gbind_simpleocl_OclUndefinedExp returns [gbind.simpleocl.OclUndefinedExp element = null]
@init{
}
:
a0 = 'OclUndefined' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createOclUndefinedExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_29_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4127]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4128]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4129]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4130]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4131]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4132]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4133]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4134]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4135]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4136]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4137]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4138]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4139]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4140]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4141]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4142]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4143]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4144]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4145]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4146]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4147]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4148]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4149]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4150]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4151]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4152]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4153]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4154]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4155]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4156]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4157]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4158]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4159]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4160]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4161]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4162]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4163]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4164]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4165]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4166]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4167]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4168]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4169]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4170]);
}

;

parse_gbind_simpleocl_LetExp returns [gbind.simpleocl.LetExp element = null]
@init{
}
:
a0 = 'let' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_30_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4171]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4172]);
}

(
a1_0 = parse_gbind_simpleocl_LocalVariable{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLetExp();
startIncompleteElement(element);
}
if (a1_0 != null) {
if (a1_0 != null) {
Object value = a1_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__VARIABLE), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_30_0_0_1, a1_0, true);
copyLocalizationInfos(a1_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4173]);
}

a2 = 'in' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLetExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_30_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4174]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4175]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4176]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4177]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4178]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4179]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4180]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4181]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4182]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4183]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4184]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4185]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4186]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4187]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4188]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4189]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4190]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4191]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4192]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4193]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4194]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4195]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4196]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4197]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4198]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4199]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4200]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4201]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4202]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4203]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4204]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4205]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4206]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4207]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4208]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4209]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4210]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4211]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4212]);
}

(
a3_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createLetExp();
startIncompleteElement(element);
}
if (a3_0 != null) {
if (a3_0 != null) {
Object value = a3_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__IN_), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_30_0_0_3, a3_0, true);
copyLocalizationInfos(a3_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4213]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4214]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4215]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4216]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4217]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4218]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4219]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4220]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4221]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4222]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4223]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4224]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4225]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4226]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4227]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4228]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4229]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4230]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4231]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4232]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4233]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4234]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4235]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4236]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4237]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4238]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4239]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4240]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4241]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4242]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4243]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4244]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4245]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4246]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4247]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4248]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4249]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4250]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4251]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4252]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4253]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4254]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4255]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4256]);
}

;

parse_gbind_simpleocl_IfExp returns [gbind.simpleocl.IfExp element = null]
@init{
}
:
a0 = 'if' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIfExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_31_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4257]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4258]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4259]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4260]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4261]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4262]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4263]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4264]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4265]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4266]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4267]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4268]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4269]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4270]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4271]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4272]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4273]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4274]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4275]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4276]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4277]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4278]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4279]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4280]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4281]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4282]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4283]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4284]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4285]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4286]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4287]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4288]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4289]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4290]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4291]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4292]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4293]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4294]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4295]);
}

(
a1_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIfExp();
startIncompleteElement(element);
}
if (a1_0 != null) {
if (a1_0 != null) {
Object value = a1_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__CONDITION), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_31_0_0_1, a1_0, true);
copyLocalizationInfos(a1_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4296]);
}

a2 = 'then' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIfExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_31_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4297]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4298]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4299]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4300]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4301]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4302]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4303]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4304]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4305]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4306]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4307]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4308]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4309]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4310]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4311]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4312]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4313]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4314]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4315]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4316]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4317]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4318]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4319]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4320]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4321]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4322]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4323]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4324]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4325]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4326]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4327]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4328]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4329]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4330]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4331]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4332]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4333]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4334]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4335]);
}

(
a3_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIfExp();
startIncompleteElement(element);
}
if (a3_0 != null) {
if (a3_0 != null) {
Object value = a3_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__THEN_EXPRESSION), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_31_0_0_3, a3_0, true);
copyLocalizationInfos(a3_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4336]);
}

a4 = 'else' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIfExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_31_0_0_4, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4337]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4338]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4339]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4340]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4341]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4342]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4343]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4344]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4345]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4346]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4347]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4348]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4349]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4350]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4351]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4352]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4353]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4354]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4355]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4356]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4357]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4358]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4359]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4360]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4361]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4362]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4363]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4364]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4365]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4366]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4367]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4368]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4369]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4370]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4371]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4372]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4373]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4374]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4375]);
}

(
a5_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIfExp();
startIncompleteElement(element);
}
if (a5_0 != null) {
if (a5_0 != null) {
Object value = a5_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__ELSE_EXPRESSION), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_31_0_0_5, a5_0, true);
copyLocalizationInfos(a5_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4376]);
}

a6 = 'endif' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createIfExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_31_0_0_6, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4377]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4378]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4379]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4380]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4381]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4382]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4383]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4384]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4385]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4386]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4387]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4388]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4389]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4390]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4391]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4392]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4393]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4394]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4395]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4396]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4397]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4398]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4399]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4400]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4401]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4402]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4403]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4404]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4405]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4406]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4407]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4408]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4409]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4410]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4411]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4412]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4413]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4414]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4415]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4416]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4417]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4418]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4419]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4420]);
}

;

parse_gbind_simpleocl_BraceExp returns [gbind.simpleocl.BraceExp element = null]
@init{
}
:
a0 = '(' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBraceExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_32_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4421]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4422]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4423]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4424]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4425]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4426]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4427]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4428]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4429]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4430]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4431]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4432]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4433]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4434]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4435]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4436]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4437]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4438]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4439]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4440]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4441]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4442]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4443]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4444]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4445]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4446]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4447]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4448]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4449]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4450]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4451]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4452]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4453]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4454]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4455]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4456]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4457]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4458]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4459]);
}

(
a1_0 = parse_gbind_simpleocl_OclExpression{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBraceExp();
startIncompleteElement(element);
}
if (a1_0 != null) {
if (a1_0 != null) {
Object value = a1_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__EXP), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_32_0_0_1, a1_0, true);
copyLocalizationInfos(a1_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4460]);
}

a2 = ')' {
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createBraceExp();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_32_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4461]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4462]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4463]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4464]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4465]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4466]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4467]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4468]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4469]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4470]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4471]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4472]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4473]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4474]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4475]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4476]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4477]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4478]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4479]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4480]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4481]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4482]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4483]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4484]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4485]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4486]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4487]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4488]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4489]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4490]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4491]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4492]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4493]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4494]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4495]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4496]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4497]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4498]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4499]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4500]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4501]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4502]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4503]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4504]);
}

;

parse_gbind_simpleocl_StaticPropertyCallExp returns [gbind.simpleocl.StaticPropertyCallExp element = null]
@init{
}
:
(
a0_0 = parse_gbind_simpleocl_OclType{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticPropertyCallExp();
startIncompleteElement(element);
}
if (a0_0 != null) {
if (a0_0 != null) {
Object value = a0_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__SOURCE), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_40_0_0_0, a0_0, true);
copyLocalizationInfos(a0_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4505]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4506]);
}

(
a1_0 = parse_gbind_simpleocl_StaticPropertyCall{
if (terminateParsing) {
throw new genericity.language.gbind.mopp.GbindTerminateParsingException();
}
if (element == null) {
element = gbind.simpleocl.SimpleoclFactory.eINSTANCE.createStaticPropertyCallExp();
startIncompleteElement(element);
}
if (a1_0 != null) {
if (a1_0 != null) {
Object value = a1_0;
element.eSet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL), value);
completedElement(value, true);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, genericity.language.gbind.grammar.GbindGrammarInformationProvider.GBIND_40_0_0_1, a1_0, true);
copyLocalizationInfos(a1_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4507]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4508]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4509]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4510]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4511]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4512]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4513]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4514]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4515]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4516]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4517]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4518]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4519]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4520]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4521]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4522]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4523]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4524]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4525]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4526]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4527]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4528]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4529]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4530]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4531]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4532]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4533]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4534]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4535]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4536]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4537]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4538]);
addExpectedElement(gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4539]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4540]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4541]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4542]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4543]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4544]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4545]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4546]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4547]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4548]);
addExpectedElement(gbind.dsl.DslPackage.eINSTANCE.getBindingModel(), genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4549]);
addExpectedElement(null, genericity.language.gbind.mopp.GbindExpectationConstants.EXPECTATIONS[4550]);
}

;

parse_gbind_simpleocl_ModuleElement returns [gbind.simpleocl.ModuleElement element = null]
:
c0 = parse_gbind_simpleocl_OclFeatureDefinition{ element = c0; /* this is a subclass or primitive expression choice */ }

;

parse_gbind_simpleocl_OclFeature returns [gbind.simpleocl.OclFeature element = null]
:
c0 = parse_gbind_simpleocl_Attribute{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_gbind_simpleocl_Operation{ element = c1; /* this is a subclass or primitive expression choice */ }

;

parse_gbind_simpleocl_OclExpression returns [gbind.simpleocl.OclExpression element = null]
:
c = parseop_OclExpression_level_1{ element = c; /* this rule is an expression root */ }

;

parse_gbind_dsl_ConceptBinding returns [gbind.dsl.ConceptBinding element = null]
:
c0 = parse_gbind_dsl_ClassBinding{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_gbind_dsl_OclFeatureBinding{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_gbind_dsl_RenamingFeatureBinding{ element = c2; /* this is a subclass or primitive expression choice */ }

;

parse_gbind_dsl_BaseHelper returns [gbind.dsl.BaseHelper element = null]
:
c0 = parse_gbind_dsl_ConceptHelper{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_gbind_dsl_LocalHelper{ element = c1; /* this is a subclass or primitive expression choice */ }

;

parse_gbind_simpleocl_PropertyCall returns [gbind.simpleocl.PropertyCall element = null]
:
c0 = parse_gbind_simpleocl_OperationCall{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_gbind_simpleocl_NavigationOrAttributeCall{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_gbind_simpleocl_IterateExp{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_gbind_simpleocl_IteratorExp{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_gbind_simpleocl_CollectionOperationCall{ element = c4; /* this is a subclass or primitive expression choice */ }

;

parse_gbind_simpleocl_StaticPropertyCall returns [gbind.simpleocl.StaticPropertyCall element = null]
:
c0 = parse_gbind_simpleocl_StaticOperationCall{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_gbind_simpleocl_StaticNavigationOrAttributeCall{ element = c1; /* this is a subclass or primitive expression choice */ }

;

NOTOP:
('not')
;
BOOLOP:
(('and'|'or'|'xor'|'implies'))
;
INTOP:
(('div'|'mod'))
;
RELOP:
(('>'|'<'|'>='|'<='))
;
EQ:
'=';
NEQ:
('<>')
;
ADDOP:
(('-'|'+'))
;
MULOP:
(('*'|'/'))
;
COMMENT:
('--'(~('\n'|'\r'|'\uffff'))*)
{ _channel = 99; }
;
FLOAT:
('-'?(('0'..'9'))+'.'(('0'..'9'))+)
;
INTEGER:
('-'?(('0'..'9'))+)
;
STRINGTYPE:
('String')
;
BOOLEANTYPE:
('Boolean')
;
INTEGERTYPE:
('Integer')
;
REALTYPE:
('Real')
;
COLLECTIONTYPE:
('Collection')
;
BAGTYPE:
'Bag';
ORDEREDSETTYPE:
'OrderedSet';
SEQUENCETYPE:
'Sequence';
SETTYPE:
'Set';
OCLANYTYPE:
('OclAny')
;
OCLTYPE:
('OclType')
;
TUPLETYPE:
('TupleType')
;
TUPLE:
'Tuple';
MAPTYPE:
'Map';
LAMBDATYPE:
('Lambda')
;
ENVTYPE:
('Env')
;
TEXT:
(('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9')|'_')*)
;
LINEBREAK:
(('\r\n'|'\'r'|'\n'))
{ _channel = 99; }
;
WHITESPACE:
((' '|'\t'|'\f'))
{ _channel = 99; }
;
QUOTED_34_34_92:
(('"')(('\\''"')|('\\''\\')|(~('"'|'\\')))*('"'))
;
QUOTED_39_39_92:
(('\'')(('\\''\'')|('\\''\\')|(~('\''|'\\')))*('\''))
;
QUOTED_91_93:
(('[')(~(']'))*(']'))
;

