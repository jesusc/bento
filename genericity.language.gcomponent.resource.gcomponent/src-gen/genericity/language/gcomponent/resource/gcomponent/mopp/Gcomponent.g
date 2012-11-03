grammar Gcomponent;

options {
	superClass = GcomponentANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package genericity.language.gcomponent.resource.gcomponent.mopp;
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
	package genericity.language.gcomponent.resource.gcomponent.mopp;
}

@members{
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolverFactory tokenResolverFactory = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenResolverFactory();
	
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
	private java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedElements = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal>();
	
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
		postParseCommands.add(new genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>() {
			public boolean execute(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem() {
					public genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity getSeverity() {
						return genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.ERROR;
					}
					public genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType getType() {
						return genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> getQuickFixes() {
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
		genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement terminal = genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINALS[terminalID];
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[] containmentFeatures = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.LINKS[ids[i]];
		}
		genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainmentTrace containmentTrace = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainmentTrace(eClass, containmentFeatures);
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElement = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>() {
			public boolean execute(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>() {
			public boolean execute(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>() {
			public boolean execute(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap locationMap = resource.getLocationMap();
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
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new GcomponentParser(new org.antlr.runtime3_4_0.CommonTokenStream(new GcomponentLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new GcomponentParser(new org.antlr.runtime3_4_0.CommonTokenStream(new GcomponentLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			new genericity.language.gcomponent.resource.gcomponent.util.GcomponentRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public GcomponentParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((GcomponentLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((GcomponentLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == genericity.language.gcomponent.dsl.DefinitionRoot.class) {
				return parse_genericity_language_gcomponent_dsl_DefinitionRoot();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.core.TransformationComponent.class) {
				return parse_genericity_language_gcomponent_core_TransformationComponent();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.core.Concept.class) {
				return parse_genericity_language_gcomponent_core_Concept();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.core.Tag.class) {
				return parse_genericity_language_gcomponent_core_Tag();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.core.AtlTemplate.class) {
				return parse_genericity_language_gcomponent_core_AtlTemplate();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.variants.SingleFeature.class) {
				return parse_genericity_language_gcomponent_variants_SingleFeature();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.variants.XorFeature.class) {
				return parse_genericity_language_gcomponent_variants_XorFeature();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.core.CompositeComponent.class) {
				return parse_genericity_language_gcomponent_core_CompositeComponent();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.Composition.class) {
				return parse_genericity_language_gcomponent_flowcontrol_Composition();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.Xor.class) {
				return parse_genericity_language_gcomponent_flowcontrol_Xor();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.XorCond.class) {
				return parse_genericity_language_gcomponent_flowcontrol_XorCond();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.Apply.class) {
				return parse_genericity_language_gcomponent_flowcontrol_Apply();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.ApplyParameter.class) {
				return parse_genericity_language_gcomponent_flowcontrol_ApplyParameter();
			}
			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.FeatureRef.class) {
				return parse_genericity_language_gcomponent_flowcontrol_FeatureRef();
			}
		}
		throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>>();
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentParseResult parseResult = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentParseResult();
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
	
	public java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		genericity.language.gcomponent.resource.gcomponent.IGcomponentParseResult result = parse();
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
			for (genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal>();
		java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> newFollowSet = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 85;
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
				for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<genericity.language.gcomponent.resource.gcomponent.util.GcomponentPair<genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (genericity.language.gcomponent.resource.gcomponent.util.GcomponentPair<genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContainedFeature[]> newFollowerPair : newFollowers) {
							genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
							genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainmentTrace containmentTrace = new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainmentTrace(null, newFollowerPair.getRight());
							genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal newFollowTerminal = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
		for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[1]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_genericity_language_gcomponent_dsl_DefinitionRoot{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_genericity_language_gcomponent_dsl_DefinitionRoot returns [genericity.language.gcomponent.dsl.DefinitionRoot element = null]
@init{
}
:
	(
		a0_0 = parse_genericity_language_gcomponent_core_Component		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.dsl.DslFactory.eINSTANCE.createDefinitionRoot();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.dsl.DslPackage.DEFINITION_ROOT__COMPONENT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
	}
	
;

parse_genericity_language_gcomponent_core_TransformationComponent returns [genericity.language.gcomponent.core.TransformationComponent element = null]
@init{
}
:
	a0 = 'transformation' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[2]);
	}
	
	a1 = 'component' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[3]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[4]);
	}
	
	a3 = '{' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[5]);
	}
	
	(
		(
			a4 = 'source' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[6]);
			}
			
			(
				a5_0 = parse_genericity_language_gcomponent_core_Concept				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[7]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[8]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[9]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[10]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[12]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[13]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[14]);
	}
	
	(
		(
			a6 = 'target' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[15]);
			}
			
			(
				a7_0 = parse_genericity_language_gcomponent_core_Concept				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							addObjectToList(element, genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_5_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[16]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[17]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[18]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[21]);
	}
	
	(
		(
			a8 = 'variants' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[22]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[23]);
			}
			
			(
				(
					(
						a9_0 = parse_genericity_language_gcomponent_variants_Parameter						{
							if (terminateParsing) {
								throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
							}
							if (element == null) {
								element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
								startIncompleteElement(element);
							}
							if (a9_0 != null) {
								if (a9_0 != null) {
									Object value = a9_0;
									addObjectToList(element, genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_6_0_0_1_0_0_0, a9_0, true);
								copyLocalizationInfos(a9_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[24]);
						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[25]);
						addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[26]);
					}
					
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[27]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[28]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[29]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[30]);
	}
	
	a10 = 'definition' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[31]);
	}
	
	(
		a11_0 = parse_genericity_language_gcomponent_core_Template		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
				startIncompleteElement(element);
			}
			if (a11_0 != null) {
				if (a11_0 != null) {
					Object value = a11_0;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_8, a11_0, true);
				copyLocalizationInfos(a11_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[32]);
	}
	
	a12 = '}' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_genericity_language_gcomponent_core_Concept returns [genericity.language.gcomponent.core.Concept element = null]
@init{
}
:
	a0 = 'concept' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[33]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[34]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[35]);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__URI), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__URI), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[36]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[37]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[38]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[39]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[40]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[44]);
	}
	
	(
		(
			a4 = 'tags' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[45]);
			}
			
			a5 = ':' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[46]);
			}
			
			(
				(
					a6_0 = parse_genericity_language_gcomponent_core_Tag					{
						if (terminateParsing) {
							throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
						}
						if (element == null) {
							element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
							startIncompleteElement(element);
						}
						if (a6_0 != null) {
							if (a6_0 != null) {
								Object value = a6_0;
								addObjectToList(element, genericity.language.gcomponent.core.CorePackage.CONCEPT__TAGS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_4_0_0_2, a6_0, true);
							copyLocalizationInfos(a6_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[47]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[48]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[49]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[50]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[51]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[52]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[53]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[54]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[55]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[56]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[57]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[58]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[59]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[60]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[61]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[63]);
	}
	
;

parse_genericity_language_gcomponent_core_Tag returns [genericity.language.gcomponent.core.Tag element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTag();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TAG__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TAG__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[66]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[67]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[68]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[69]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[70]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[71]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[72]);
	}
	
;

parse_genericity_language_gcomponent_core_AtlTemplate returns [genericity.language.gcomponent.core.AtlTemplate element = null]
@init{
}
:
	a0 = 'atl' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createAtlTemplate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[73]);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createAtlTemplate();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.ATL_TEMPLATE__TEMPLATE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.ATL_TEMPLATE__TEMPLATE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_4_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[74]);
	}
	
;

parse_genericity_language_gcomponent_variants_SingleFeature returns [genericity.language.gcomponent.variants.SingleFeature element = null]
@init{
}
:
	a0 = '-' {
		if (element == null) {
			element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createSingleFeature();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[75]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createSingleFeature();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.SINGLE_FEATURE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.SINGLE_FEATURE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_5_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[76]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[77]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[78]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[79]);
	}
	
;

parse_genericity_language_gcomponent_variants_XorFeature returns [genericity.language.gcomponent.variants.XorFeature element = null]
@init{
}
:
	a0 = '+' {
		if (element == null) {
			element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createXorFeature();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[80]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createXorFeature();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.XOR_FEATURE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.XOR_FEATURE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[81]);
	}
	
	a2 = 'xor' {
		if (element == null) {
			element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createXorFeature();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[82]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[83]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[84]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[85]);
	}
	
;

parse_genericity_language_gcomponent_core_CompositeComponent returns [genericity.language.gcomponent.core.CompositeComponent element = null]
@init{
}
:
	a0 = 'composite' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[86]);
	}
	
	a1 = 'component' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[87]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[88]);
	}
	
	a3 = '{' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[89]);
	}
	
	(
		(
			a4 = 'uses' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[90]);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					if (a5 != null) {
						genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__USES), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						genericity.language.gcomponent.core.Component proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
						collectHiddenTokens(element);
						registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.core.CompositeComponent, genericity.language.gcomponent.core.Component>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCompositeComponentUsesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__USES), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__USES, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_4_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[91]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[92]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[93]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[94]);
	}
	
	(
		(
			a6 = 'source' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[95]);
			}
			
			(
				a7_0 = parse_genericity_language_gcomponent_core_Concept				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__SOURCE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[96]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[97]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[98]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[99]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[100]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[101]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[102]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[103]);
	}
	
	(
		(
			a8 = 'target' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[104]);
			}
			
			(
				a9_0 = parse_genericity_language_gcomponent_core_Concept				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__TARGET, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_6_0_0_1, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[105]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[106]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[107]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[108]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[109]);
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[110]);
	}
	
	(
		(
			a10 = 'variants' {
				if (element == null) {
					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[111]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[112]);
			}
			
			(
				(
					(
						a11_0 = parse_genericity_language_gcomponent_variants_Parameter						{
							if (terminateParsing) {
								throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
							}
							if (element == null) {
								element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
								startIncompleteElement(element);
							}
							if (a11_0 != null) {
								if (a11_0 != null) {
									Object value = a11_0;
									addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__FORMAL_PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_7_0_0_1_0_0_0, a11_0, true);
								copyLocalizationInfos(a11_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[113]);
						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[114]);
						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[115]);
					}
					
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[116]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[117]);
				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[118]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[119]);
	}
	
	(
		a12_0 = parse_genericity_language_gcomponent_flowcontrol_Composition		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
				startIncompleteElement(element);
			}
			if (a12_0 != null) {
				if (a12_0 != null) {
					Object value = a12_0;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__COMPOSITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_8, a12_0, true);
				copyLocalizationInfos(a12_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[120]);
	}
	
	a13 = '}' {
		if (element == null) {
			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_genericity_language_gcomponent_flowcontrol_Composition returns [genericity.language.gcomponent.flowcontrol.Composition element = null]
@init{
}
:
	a0 = 'compose' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[121]);
		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[122]);
	}
	
	(
		a1_0 = parse_genericity_language_gcomponent_flowcontrol_CompositionStep		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.COMPOSITION__STEP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[123]);
	}
	
;

parse_genericity_language_gcomponent_flowcontrol_Xor returns [genericity.language.gcomponent.flowcontrol.Xor element = null]
@init{
}
:
	a0 = 'xor' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[124]);
	}
	
	(
		(
			a1 = 'when' {
				if (element == null) {
					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[125]);
			}
			
			(
				a2_0 = parse_genericity_language_gcomponent_flowcontrol_XorCond				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR__CONDITIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[126]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[127]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[128]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[129]);
	}
	
;

parse_genericity_language_gcomponent_flowcontrol_XorCond returns [genericity.language.gcomponent.flowcontrol.XorCond element = null]
@init{
}
:
	(
		a0_0 = parse_genericity_language_gcomponent_flowcontrol_BooleanValue		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__VALUE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[130]);
	}
	
	a1 = '->' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[131]);
		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[132]);
	}
	
	(
		a2_0 = parse_genericity_language_gcomponent_flowcontrol_CompositionStep		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__STEP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[134]);
	}
	
;

parse_genericity_language_gcomponent_flowcontrol_Apply returns [genericity.language.gcomponent.flowcontrol.Apply element = null]
@init{
}
:
	a0 = 'apply' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[135]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				genericity.language.gcomponent.core.Component proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.Apply, genericity.language.gcomponent.core.Component>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[136]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[137]);
	}
	
	(
		a3_0 = parse_genericity_language_gcomponent_flowcontrol_ApplyParameter		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					addObjectToList(element, genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[138]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[139]);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[140]);
			}
			
			(
				a5_0 = parse_genericity_language_gcomponent_flowcontrol_ApplyParameter				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_4_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[141]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[142]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[144]);
	}
	
	a6 = ')' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[145]);
	}
	
	a7 = '->' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[146]);
	}
	
	a8 = '(' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[147]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[148]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[149]);
	}
	
	(
		(
			a9_0 = parse_genericity_language_gcomponent_flowcontrol_ApplyParameter			{
				if (terminateParsing) {
					throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
				}
				if (element == null) {
					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
					startIncompleteElement(element);
				}
				if (a9_0 != null) {
					if (a9_0 != null) {
						Object value = a9_0;
						addObjectToList(element, genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_8, a9_0, true);
					copyLocalizationInfos(a9_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[150]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[151]);
	}
	
	(
		(
			a10 = ',' {
				if (element == null) {
					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[152]);
			}
			
			(
				a11_0 = parse_genericity_language_gcomponent_flowcontrol_ApplyParameter				{
					if (terminateParsing) {
						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
					}
					if (element == null) {
						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
						startIncompleteElement(element);
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							Object value = a11_0;
							addObjectToList(element, genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_9_0_0_1, a11_0, true);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[153]);
				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[154]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[155]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[156]);
	}
	
	a12 = ')' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[157]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[158]);
	}
	
;

parse_genericity_language_gcomponent_flowcontrol_ApplyParameter returns [genericity.language.gcomponent.flowcontrol.ApplyParameter element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__CALLED_MODEL_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__CALLED_MODEL_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[159]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[160]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[161]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[162]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__CALLEE_MODEL_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__CALLEE_MODEL_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[163]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[164]);
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[165]);
	}
	
;

parse_genericity_language_gcomponent_flowcontrol_FeatureRef returns [genericity.language.gcomponent.flowcontrol.FeatureRef element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
			}
			if (element == null) {
				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createFeatureRef();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				genericity.language.gcomponent.variants.Feature proxy = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createSingleFeature();
				collectHiddenTokens(element);
				registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.FeatureRef, genericity.language.gcomponent.variants.Feature>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFeatureRefFeatureReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[166]);
	}
	
;

parse_genericity_language_gcomponent_core_Component returns [genericity.language.gcomponent.core.Component element = null]
:
	c0 = parse_genericity_language_gcomponent_core_TransformationComponent{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_genericity_language_gcomponent_core_CompositeComponent{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_genericity_language_gcomponent_variants_Parameter returns [genericity.language.gcomponent.variants.Parameter element = null]
:
	c0 = parse_genericity_language_gcomponent_variants_SingleFeature{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_genericity_language_gcomponent_variants_XorFeature{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_genericity_language_gcomponent_core_Template returns [genericity.language.gcomponent.core.Template element = null]
:
	c0 = parse_genericity_language_gcomponent_core_AtlTemplate{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_genericity_language_gcomponent_flowcontrol_CompositionStep returns [genericity.language.gcomponent.flowcontrol.CompositionStep element = null]
:
	c0 = parse_genericity_language_gcomponent_flowcontrol_Xor{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_genericity_language_gcomponent_flowcontrol_Apply{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_genericity_language_gcomponent_flowcontrol_BooleanValue returns [genericity.language.gcomponent.flowcontrol.BooleanValue element = null]
:
	c0 = parse_genericity_language_gcomponent_flowcontrol_FeatureRef{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

