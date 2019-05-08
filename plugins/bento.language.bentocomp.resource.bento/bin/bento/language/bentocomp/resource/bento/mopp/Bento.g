grammar Bento;

options {
	superClass = BentoANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package bento.language.bentocomp.resource.bento.mopp;
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
	package bento.language.bentocomp.resource.bento.mopp;
}

@members{
	private bento.language.bentocomp.resource.bento.IBentoTokenResolverFactory tokenResolverFactory = new bento.language.bentocomp.resource.bento.mopp.BentoTokenResolverFactory();
	
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
	private java.util.List<bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal> expectedElements = new java.util.ArrayList<bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal>();
	
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
		postParseCommands.add(new bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>() {
			public boolean execute(bento.language.bentocomp.resource.bento.IBentoTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new bento.language.bentocomp.resource.bento.IBentoProblem() {
					public bento.language.bentocomp.resource.bento.BentoEProblemSeverity getSeverity() {
						return bento.language.bentocomp.resource.bento.BentoEProblemSeverity.ERROR;
					}
					public bento.language.bentocomp.resource.bento.BentoEProblemType getType() {
						return bento.language.bentocomp.resource.bento.BentoEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoQuickFix> getQuickFixes() {
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
		bento.language.bentocomp.resource.bento.IBentoExpectedElement terminal = bento.language.bentocomp.resource.bento.grammar.BentoFollowSetProvider.TERMINALS[terminalID];
		bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[] containmentFeatures = new bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = bento.language.bentocomp.resource.bento.grammar.BentoFollowSetProvider.LINKS[ids[i]];
		}
		bento.language.bentocomp.resource.bento.grammar.BentoContainmentTrace containmentTrace = new bento.language.bentocomp.resource.bento.grammar.BentoContainmentTrace(eClass, containmentFeatures);
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal expectedElement = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>() {
			public boolean execute(bento.language.bentocomp.resource.bento.IBentoTextResource resource) {
				bento.language.bentocomp.resource.bento.IBentoLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>() {
			public boolean execute(bento.language.bentocomp.resource.bento.IBentoTextResource resource) {
				bento.language.bentocomp.resource.bento.IBentoLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>() {
			public boolean execute(bento.language.bentocomp.resource.bento.IBentoTextResource resource) {
				bento.language.bentocomp.resource.bento.IBentoLocationMap locationMap = resource.getLocationMap();
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
	
	public bento.language.bentocomp.resource.bento.IBentoTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new BentoParser(new org.antlr.runtime3_4_0.CommonTokenStream(new BentoLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new BentoParser(new org.antlr.runtime3_4_0.CommonTokenStream(new BentoLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			new bento.language.bentocomp.resource.bento.util.BentoRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public BentoParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((BentoLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((BentoLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == bento.language.bentocomp.dsl.DefinitionRoot.class) {
				return parse_bento_language_bentocomp_dsl_DefinitionRoot();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.core.TransformationComponent.class) {
				return parse_bento_language_bentocomp_core_TransformationComponent();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.core.GraphicalEditorComponent.class) {
				return parse_bento_language_bentocomp_core_GraphicalEditorComponent();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.core.Concept.class) {
				return parse_bento_language_bentocomp_core_Concept();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.core.ParameterModel.class) {
				return parse_bento_language_bentocomp_core_ParameterModel();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.core.Tag.class) {
				return parse_bento_language_bentocomp_core_Tag();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.variants.SingleFeature.class) {
				return parse_bento_language_bentocomp_variants_SingleFeature();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.variants.XorFeature.class) {
				return parse_bento_language_bentocomp_variants_XorFeature();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.dsl.ComponentExecution.class) {
				return parse_bento_language_bentocomp_dsl_ComponentExecution();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.core.CompositeComponent.class) {
				return parse_bento_language_bentocomp_core_CompositeComponent();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.core.BindingDeclaration.class) {
				return parse_bento_language_bentocomp_core_BindingDeclaration();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.flowcontrol.Composition.class) {
				return parse_bento_language_bentocomp_flowcontrol_Composition();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.flowcontrol.Xor.class) {
				return parse_bento_language_bentocomp_flowcontrol_Xor();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.flowcontrol.XorCond.class) {
				return parse_bento_language_bentocomp_flowcontrol_XorCond();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.flowcontrol.Apply.class) {
				return parse_bento_language_bentocomp_flowcontrol_Apply();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.flowcontrol.ApplyParameter.class) {
				return parse_bento_language_bentocomp_flowcontrol_ApplyParameter();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.flowcontrol.Seq.class) {
				return parse_bento_language_bentocomp_flowcontrol_Seq();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.flowcontrol.FeatureRef.class) {
				return parse_bento_language_bentocomp_flowcontrol_FeatureRef();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.technologies.AtlTemplate.class) {
				return parse_bento_language_bentocomp_technologies_AtlTemplate();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.technologies.AtlParameter.class) {
				return parse_bento_language_bentocomp_technologies_AtlParameter();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.technologies.JavaTemplate.class) {
				return parse_bento_language_bentocomp_technologies_JavaTemplate();
			}
			if (type.getInstanceClass() == bento.language.bentocomp.technologies.SiriusTemplate.class) {
				return parse_bento_language_bentocomp_technologies_SiriusTemplate();
			}
		}
		throw new bento.language.bentocomp.resource.bento.mopp.BentoUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(bento.language.bentocomp.resource.bento.IBentoOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public bento.language.bentocomp.resource.bento.IBentoParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>>();
		bento.language.bentocomp.resource.bento.mopp.BentoParseResult parseResult = new bento.language.bentocomp.resource.bento.mopp.BentoParseResult();
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
	
	public java.util.List<bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, bento.language.bentocomp.resource.bento.IBentoTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		bento.language.bentocomp.resource.bento.IBentoParseResult result = parse();
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
			for (bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal>();
		java.util.List<bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal> newFollowSet = new java.util.ArrayList<bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 219;
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
				for (bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<bento.language.bentocomp.resource.bento.util.BentoPair<bento.language.bentocomp.resource.bento.IBentoExpectedElement, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (bento.language.bentocomp.resource.bento.util.BentoPair<bento.language.bentocomp.resource.bento.IBentoExpectedElement, bento.language.bentocomp.resource.bento.mopp.BentoContainedFeature[]> newFollowerPair : newFollowers) {
							bento.language.bentocomp.resource.bento.IBentoExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
							bento.language.bentocomp.resource.bento.grammar.BentoContainmentTrace containmentTrace = new bento.language.bentocomp.resource.bento.grammar.BentoContainmentTrace(null, newFollowerPair.getRight());
							bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal newFollowTerminal = new bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
		for (bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(bento.language.bentocomp.resource.bento.mopp.BentoExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[3]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_bento_language_bentocomp_dsl_DefinitionRoot{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_bento_language_bentocomp_dsl_DefinitionRoot returns [bento.language.bentocomp.dsl.DefinitionRoot element = null]
@init{
}
:
	(
		a0_0 = parse_bento_language_bentocomp_core_Component		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createDefinitionRoot();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.dsl.DslPackage.DEFINITION_ROOT__COMPONENT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_0_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
	}
	
;

parse_bento_language_bentocomp_core_TransformationComponent returns [bento.language.bentocomp.core.TransformationComponent element = null]
@init{
}
:
	a0 = 'transformation' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[4]);
	}
	
	a1 = 'component' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[5]);
	}
	
	(
		a2 = QNAME		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[6]);
	}
	
	a3 = '{' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[7]);
	}
	
	(
		(
			(
				a4 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[8]);
				}
				
				(
					a5_0 = parse_bento_language_bentocomp_core_Concept					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_0_0_0_1, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[9]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[10]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[11]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[12]);
		}
		
		(
			(
				a6 = 'target' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[13]);
				}
				
				(
					a7_0 = parse_bento_language_bentocomp_core_Concept					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						if (a7_0 != null) {
							if (a7_0 != null) {
								Object value = a7_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_1_0_0_1, a7_0, true);
							copyLocalizationInfos(a7_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[14]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[15]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[16]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[17]);
		}
		
		(
			(
				a8 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_2_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[18]);
				}
				
				(
					a9_0 = parse_bento_language_bentocomp_core_ParameterModel					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						if (a9_0 != null) {
							if (a9_0 != null) {
								Object value = a9_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE_MODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_2_0_0_1, a9_0, true);
							copyLocalizationInfos(a9_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[19]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[20]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[21]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[22]);
		}
		
		(
			(
				a10 = 'target' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_3_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[23]);
				}
				
				(
					a11_0 = parse_bento_language_bentocomp_core_ParameterModel					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						if (a11_0 != null) {
							if (a11_0 != null) {
								Object value = a11_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET_MODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_3_0_0_1, a11_0, true);
							copyLocalizationInfos(a11_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[24]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[25]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[26]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[27]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[28]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[29]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[30]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[31]);
	}
	
	(
		(
			a12 = 'variants' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[32]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[33]);
			}
			
			(
				(
					(
						a13_0 = parse_bento_language_bentocomp_variants_Parameter						{
							if (terminateParsing) {
								throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
							}
							if (element == null) {
								element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
								startIncompleteElement(element);
							}
							if (a13_0 != null) {
								if (a13_0 != null) {
									Object value = a13_0;
									addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_5_0_0_1_0_0_0, a13_0, true);
								copyLocalizationInfos(a13_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[34]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[35]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[36]);
					}
					
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[37]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[38]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[39]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[40]);
	}
	
	a14 = 'definition' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[43]);
	}
	
	(
		a15_0 = parse_bento_language_bentocomp_core_Template		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
				startIncompleteElement(element);
			}
			if (a15_0 != null) {
				if (a15_0 != null) {
					Object value = a15_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_7, a15_0, true);
				copyLocalizationInfos(a15_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[44]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[46]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[47]);
	}
	
	(
		(
			a16 = 'version' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[48]);
			}
			
			(
				a17 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					if (a17 != null) {
						bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__VERSION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__VERSION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_8_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a17, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[49]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[50]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[51]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[53]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[54]);
	}
	
	(
		(
			a18 = 'contributos' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[55]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[56]);
			}
			
			(
				(
					a19 = TEXT					
					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						if (a19 != null) {
							bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
							tokenResolver.setOptions(getOptions());
							bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
							}
							java.lang.String resolved = (java.lang.String) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS, value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_1_0_0_0, resolved, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[57]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[58]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[59]);
				}
				
				
				|				(
					a20 = QUOTED_34_34					
					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						if (a20 != null) {
							bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
							tokenResolver.setOptions(getOptions());
							bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a20).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a20).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a20).getStopIndex());
							}
							java.lang.String resolved = (java.lang.String) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS, value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_1_0_1_0, resolved, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a20, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[60]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[61]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[62]);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[63]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[64]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[65]);
			}
			
			(
				(
					a21 = ',' {
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[66]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[67]);
					}
					
					(
						(
							a22 = TEXT							
							{
								if (terminateParsing) {
									throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
								}
								if (element == null) {
									element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
									startIncompleteElement(element);
								}
								if (a22 != null) {
									bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
									tokenResolver.setOptions(getOptions());
									bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
									tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS), result);
									Object resolvedObject = result.getResolvedToken();
									if (resolvedObject == null) {
										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
									}
									java.lang.String resolved = (java.lang.String) resolvedObject;
									if (resolved != null) {
										Object value = resolved;
										addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS, value);
										completedElement(value, false);
									}
									collectHiddenTokens(element);
									retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_2_0_0_1_0_0_0, resolved, true);
									copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
								}
							}
						)
						{
							// expected elements (follow set)
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[68]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[69]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[70]);
						}
						
						
						|						(
							a23 = QUOTED_34_34							
							{
								if (terminateParsing) {
									throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
								}
								if (element == null) {
									element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
									startIncompleteElement(element);
								}
								if (a23 != null) {
									bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
									tokenResolver.setOptions(getOptions());
									bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
									tokenResolver.resolve(a23.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS), result);
									Object resolvedObject = result.getResolvedToken();
									if (resolvedObject == null) {
										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a23).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a23).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a23).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a23).getStopIndex());
									}
									java.lang.String resolved = (java.lang.String) resolvedObject;
									if (resolved != null) {
										Object value = resolved;
										addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__CONTRIBUTORS, value);
										completedElement(value, false);
									}
									collectHiddenTokens(element);
									retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_2_0_0_1_0_1_0, resolved, true);
									copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a23, element);
								}
							}
						)
						{
							// expected elements (follow set)
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[71]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[72]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[73]);
						}
						
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[74]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[75]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[76]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[77]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[78]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[79]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[80]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[81]);
	}
	
	(
		(
			a24 = 'tags' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[82]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[83]);
			}
			
			(
				a25_0 = parse_bento_language_bentocomp_core_Tag				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						startIncompleteElement(element);
					}
					if (a25_0 != null) {
						if (a25_0 != null) {
							Object value = a25_0;
							addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__TAGS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_1, a25_0, true);
						copyLocalizationInfos(a25_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[84]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[85]);
			}
			
			(
				(
					a26 = ',' {
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[86]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[87]);
					}
					
					(
						a27_0 = parse_bento_language_bentocomp_core_Tag						{
							if (terminateParsing) {
								throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
							}
							if (element == null) {
								element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
								startIncompleteElement(element);
							}
							if (a27_0 != null) {
								if (a27_0 != null) {
									Object value = a27_0;
									addObjectToList(element, bento.language.bentocomp.core.CorePackage.TRANSFORMATION_COMPONENT__TAGS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_2_0_0_1, a27_0, true);
								copyLocalizationInfos(a27_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[88]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[89]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[90]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[91]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[92]);
	}
	
	a28 = '}' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a28, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_bento_language_bentocomp_core_GraphicalEditorComponent returns [bento.language.bentocomp.core.GraphicalEditorComponent element = null]
@init{
}
:
	a0 = 'graphical' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[93]);
	}
	
	a1 = 'component' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[94]);
	}
	
	(
		a2 = QNAME		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[95]);
	}
	
	a3 = '{' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[96]);
	}
	
	(
		(
			(
				a4 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[97]);
				}
				
				(
					a5_0 = parse_bento_language_bentocomp_core_Concept					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
							startIncompleteElement(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__SOURCE, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_0_0_0_1, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[98]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[99]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[100]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[101]);
		}
		
		(
			(
				a6 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[102]);
				}
				
				(
					a7_0 = parse_bento_language_bentocomp_core_ParameterModel					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
							startIncompleteElement(element);
						}
						if (a7_0 != null) {
							if (a7_0 != null) {
								Object value = a7_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__SOURCE_MODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_1_0_0_1, a7_0, true);
							copyLocalizationInfos(a7_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[103]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[104]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[105]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[106]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[107]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[108]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[109]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[110]);
	}
	
	(
		(
			a8 = 'variants' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[111]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[112]);
			}
			
			(
				(
					(
						a9_0 = parse_bento_language_bentocomp_variants_Parameter						{
							if (terminateParsing) {
								throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
							}
							if (element == null) {
								element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
								startIncompleteElement(element);
							}
							if (a9_0 != null) {
								if (a9_0 != null) {
									Object value = a9_0;
									addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__FORMAL_PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_5_0_0_1_0_0_0, a9_0, true);
								copyLocalizationInfos(a9_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[113]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[114]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[115]);
					}
					
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[116]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[117]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[118]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[119]);
	}
	
	a10 = 'definition' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[120]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[121]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[122]);
	}
	
	(
		a11_0 = parse_bento_language_bentocomp_core_Template		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
				startIncompleteElement(element);
			}
			if (a11_0 != null) {
				if (a11_0 != null) {
					Object value = a11_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__TEMPLATE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_7, a11_0, true);
				copyLocalizationInfos(a11_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[123]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[124]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[125]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[126]);
	}
	
	(
		(
			a12 = 'version' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[127]);
			}
			
			(
				a13 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
						startIncompleteElement(element);
					}
					if (a13 != null) {
						bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__VERSION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__VERSION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_8_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[128]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[129]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[130]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[131]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[132]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[133]);
	}
	
	(
		(
			a14 = 'contributos' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[134]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[135]);
			}
			
			(
				(
					a15 = TEXT					
					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
							startIncompleteElement(element);
						}
						if (a15 != null) {
							bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
							tokenResolver.setOptions(getOptions());
							bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a15.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a15).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a15).getStopIndex());
							}
							java.lang.String resolved = (java.lang.String) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS, value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_1_0_0_0, resolved, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a15, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[136]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[137]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[138]);
				}
				
				
				|				(
					a16 = QUOTED_34_34					
					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
							startIncompleteElement(element);
						}
						if (a16 != null) {
							bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
							tokenResolver.setOptions(getOptions());
							bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
							}
							java.lang.String resolved = (java.lang.String) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS, value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_1_0_1_0, resolved, true);
							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[139]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[140]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[141]);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[142]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[143]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[144]);
			}
			
			(
				(
					a17 = ',' {
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[145]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[146]);
					}
					
					(
						(
							a18 = TEXT							
							{
								if (terminateParsing) {
									throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
								}
								if (element == null) {
									element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
									startIncompleteElement(element);
								}
								if (a18 != null) {
									bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
									tokenResolver.setOptions(getOptions());
									bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
									tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS), result);
									Object resolvedObject = result.getResolvedToken();
									if (resolvedObject == null) {
										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a18).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a18).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a18).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a18).getStopIndex());
									}
									java.lang.String resolved = (java.lang.String) resolvedObject;
									if (resolved != null) {
										Object value = resolved;
										addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS, value);
										completedElement(value, false);
									}
									collectHiddenTokens(element);
									retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_2_0_0_1_0_0_0, resolved, true);
									copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a18, element);
								}
							}
						)
						{
							// expected elements (follow set)
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[147]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[148]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[149]);
						}
						
						
						|						(
							a19 = QUOTED_34_34							
							{
								if (terminateParsing) {
									throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
								}
								if (element == null) {
									element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
									startIncompleteElement(element);
								}
								if (a19 != null) {
									bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
									tokenResolver.setOptions(getOptions());
									bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
									tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS), result);
									Object resolvedObject = result.getResolvedToken();
									if (resolvedObject == null) {
										addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
									}
									java.lang.String resolved = (java.lang.String) resolvedObject;
									if (resolved != null) {
										Object value = resolved;
										addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS, value);
										completedElement(value, false);
									}
									collectHiddenTokens(element);
									retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_2_0_0_1_0_1_0, resolved, true);
									copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
								}
							}
						)
						{
							// expected elements (follow set)
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[150]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[151]);
							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[152]);
						}
						
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[153]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[154]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[155]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[156]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[157]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[158]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[159]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[160]);
	}
	
	(
		(
			a20 = 'tags' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[161]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[162]);
			}
			
			(
				a21_0 = parse_bento_language_bentocomp_core_Tag				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
						startIncompleteElement(element);
					}
					if (a21_0 != null) {
						if (a21_0 != null) {
							Object value = a21_0;
							addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__TAGS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_10_0_0_1, a21_0, true);
						copyLocalizationInfos(a21_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[163]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[164]);
			}
			
			(
				(
					a22 = ',' {
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_10_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[165]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[166]);
					}
					
					(
						a23_0 = parse_bento_language_bentocomp_core_Tag						{
							if (terminateParsing) {
								throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
							}
							if (element == null) {
								element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
								startIncompleteElement(element);
							}
							if (a23_0 != null) {
								if (a23_0 != null) {
									Object value = a23_0;
									addObjectToList(element, bento.language.bentocomp.core.CorePackage.GRAPHICAL_EDITOR_COMPONENT__TAGS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_10_0_0_2_0_0_1, a23_0, true);
								copyLocalizationInfos(a23_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[167]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[168]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[169]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[170]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[171]);
	}
	
	a24 = '}' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_bento_language_bentocomp_core_Concept returns [bento.language.bentocomp.core.Concept element = null]
@init{
}
:
	a0 = 'concept' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[172]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.CONCEPT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.CONCEPT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[173]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[174]);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.CONCEPT__URI), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.CONCEPT__URI), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[175]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[176]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[177]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[178]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[179]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[180]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[181]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[183]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[184]);
	}
	
	(
		(
			a4 = 'tags' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[185]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[186]);
			}
			
			(
				a5_0 = parse_bento_language_bentocomp_core_Tag				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, bento.language.bentocomp.core.CorePackage.CONCEPT__TAGS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[187]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[188]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[189]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[190]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[191]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[192]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[193]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[194]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[195]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[196]);
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[197]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[198]);
					}
					
					(
						a7_0 = parse_bento_language_bentocomp_core_Tag						{
							if (terminateParsing) {
								throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
							}
							if (element == null) {
								element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
								startIncompleteElement(element);
							}
							if (a7_0 != null) {
								if (a7_0 != null) {
									Object value = a7_0;
									addObjectToList(element, bento.language.bentocomp.core.CorePackage.CONCEPT__TAGS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_2_0_0_1, a7_0, true);
								copyLocalizationInfos(a7_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[199]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[200]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[201]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[202]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[203]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[204]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[205]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[206]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[207]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[208]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[209]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[210]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[211]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[212]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[213]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[214]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[215]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[216]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[217]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[218]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[219]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[220]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[221]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[222]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[223]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[224]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[225]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[226]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[227]);
	}
	
;

parse_bento_language_bentocomp_core_ParameterModel returns [bento.language.bentocomp.core.ParameterModel element = null]
@init{
}
:
	a0 = 'model' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[228]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.PARAMETER_MODEL__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.PARAMETER_MODEL__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[229]);
	}
	
	a2 = ':' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[230]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.PARAMETER_MODEL__TYPE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				bento.language.bentocomp.core.Concept proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
				collectHiddenTokens(element);
				registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.core.ParameterModel, bento.language.bentocomp.core.Concept>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterModelTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.PARAMETER_MODEL__TYPE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.PARAMETER_MODEL__TYPE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[231]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[232]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[233]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[234]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[235]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[236]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[237]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[238]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[239]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[240]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[241]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[242]);
	}
	
	(
		(
			a4 = '=' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[243]);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
						startIncompleteElement(element);
					}
					if (a5 != null) {
						bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.PARAMETER_MODEL__RESOURCE_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.PARAMETER_MODEL__RESOURCE_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_4_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[244]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[245]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[246]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[247]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[248]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[249]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[250]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[251]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[252]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[253]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[254]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[255]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[256]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[257]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[258]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[259]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[260]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[261]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[262]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[263]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[264]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[265]);
	}
	
;

parse_bento_language_bentocomp_core_Tag returns [bento.language.bentocomp.core.Tag element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTag();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TAG__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TAG__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[266]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[267]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[268]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[269]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[270]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[271]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[272]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[273]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[274]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[275]);
	}
	
	
	|	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTag();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TAG__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.TAG__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_1_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[276]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[277]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[278]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[279]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[280]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[281]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[282]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[283]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[284]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[285]);
	}
	
;

parse_bento_language_bentocomp_variants_SingleFeature returns [bento.language.bentocomp.variants.SingleFeature element = null]
@init{
}
:
	a0 = '-' {
		if (element == null) {
			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createSingleFeature();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[286]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createSingleFeature();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.variants.VariantsPackage.SINGLE_FEATURE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.variants.VariantsPackage.SINGLE_FEATURE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[287]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[288]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[289]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[290]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[291]);
	}
	
;

parse_bento_language_bentocomp_variants_XorFeature returns [bento.language.bentocomp.variants.XorFeature element = null]
@init{
}
:
	a0 = '+' {
		if (element == null) {
			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createXorFeature();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[292]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createXorFeature();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.variants.VariantsPackage.XOR_FEATURE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.variants.VariantsPackage.XOR_FEATURE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[293]);
	}
	
	a2 = 'xor' {
		if (element == null) {
			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createXorFeature();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[294]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[295]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[297]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[298]);
	}
	
;

parse_bento_language_bentocomp_dsl_ComponentExecution returns [bento.language.bentocomp.dsl.ComponentExecution element = null]
@init{
}
:
	a0 = 'component' {
		if (element == null) {
			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[299]);
	}
	
	a1 = 'execution' {
		if (element == null) {
			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[300]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[301]);
	}
	
	a3 = '{' {
		if (element == null) {
			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[302]);
	}
	
	(
		(
			a4 = 'uses' {
				if (element == null) {
					element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[303]);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
						startIncompleteElement(element);
					}
					if (a5 != null) {
						bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__USES), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						bento.language.bentocomp.core.Component proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						collectHiddenTokens(element);
						registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.core.CompositeComponent, bento.language.bentocomp.core.Component>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCompositeComponentUsesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__USES), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							addObjectToList(element, bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__USES, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_4_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[304]);
				addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[305]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[306]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[307]);
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[308]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[309]);
	}
	
	(
		(
			(
				a6_0 = parse_bento_language_bentocomp_core_BindingDeclaration				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
						startIncompleteElement(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							addObjectToList(element, bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__BINDINGS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_5_0_0_0, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[310]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[311]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[312]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[313]);
	}
	
	(
		(
			(
				a7 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[314]);
				}
				
				(
					a8_0 = parse_bento_language_bentocomp_core_Concept					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
							startIncompleteElement(element);
						}
						if (a8_0 != null) {
							if (a8_0 != null) {
								Object value = a8_0;
								addObjectToList(element, bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__SOURCE, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_0_0_0_1, a8_0, true);
							copyLocalizationInfos(a8_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[315]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[316]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[317]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[318]);
		}
		
		(
			(
				a9 = 'target' {
					if (element == null) {
						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[319]);
				}
				
				(
					a10_0 = parse_bento_language_bentocomp_core_Concept					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
							startIncompleteElement(element);
						}
						if (a10_0 != null) {
							if (a10_0 != null) {
								Object value = a10_0;
								addObjectToList(element, bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__TARGET, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_1_0_0_1, a10_0, true);
							copyLocalizationInfos(a10_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[320]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[321]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[322]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[323]);
		}
		
		(
			(
				a11 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_2_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[324]);
				}
				
				(
					a12_0 = parse_bento_language_bentocomp_core_ParameterModel					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
							startIncompleteElement(element);
						}
						if (a12_0 != null) {
							if (a12_0 != null) {
								Object value = a12_0;
								addObjectToList(element, bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__SOURCE_MODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_2_0_0_1, a12_0, true);
							copyLocalizationInfos(a12_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[325]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[326]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[327]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[328]);
		}
		
		(
			(
				a13 = 'target' {
					if (element == null) {
						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_3_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[329]);
				}
				
				(
					a14_0 = parse_bento_language_bentocomp_core_ParameterModel					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
							startIncompleteElement(element);
						}
						if (a14_0 != null) {
							if (a14_0 != null) {
								Object value = a14_0;
								addObjectToList(element, bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__TARGET_MODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_3_0_0_1, a14_0, true);
							copyLocalizationInfos(a14_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[330]);
					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[331]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[332]);
			addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[333]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[334]);
	}
	
	(
		a15_0 = parse_bento_language_bentocomp_flowcontrol_Composition		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
				startIncompleteElement(element);
			}
			if (a15_0 != null) {
				if (a15_0 != null) {
					Object value = a15_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.dsl.DslPackage.COMPONENT_EXECUTION__COMPOSITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_7, a15_0, true);
				copyLocalizationInfos(a15_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[335]);
	}
	
	a16 = '}' {
		if (element == null) {
			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_bento_language_bentocomp_core_CompositeComponent returns [bento.language.bentocomp.core.CompositeComponent element = null]
@init{
}
:
	a0 = 'composite' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[336]);
	}
	
	a1 = 'component' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[337]);
	}
	
	(
		a2 = QNAME		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QNAME");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[338]);
	}
	
	a3 = '{' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[339]);
	}
	
	(
		(
			a4 = 'uses' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[340]);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					if (a5 != null) {
						bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__USES), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						bento.language.bentocomp.core.Component proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
						collectHiddenTokens(element);
						registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.core.CompositeComponent, bento.language.bentocomp.core.Component>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCompositeComponentUsesReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__USES), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__USES, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_4_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[341]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[342]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[343]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[344]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[345]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[346]);
	}
	
	(
		(
			(
				a6_0 = parse_bento_language_bentocomp_core_BindingDeclaration				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__BINDINGS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_5_0_0_0, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[347]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[348]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[349]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[350]);
	}
	
	(
		(
			(
				a7 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_0_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[351]);
				}
				
				(
					a8_0 = parse_bento_language_bentocomp_core_Concept					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
							startIncompleteElement(element);
						}
						if (a8_0 != null) {
							if (a8_0 != null) {
								Object value = a8_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__SOURCE, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_0_0_0_1, a8_0, true);
							copyLocalizationInfos(a8_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[352]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[353]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[354]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[355]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[356]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[357]);
		}
		
		(
			(
				a9 = 'target' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[358]);
				}
				
				(
					a10_0 = parse_bento_language_bentocomp_core_Concept					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
							startIncompleteElement(element);
						}
						if (a10_0 != null) {
							if (a10_0 != null) {
								Object value = a10_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__TARGET, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_1_0_0_1, a10_0, true);
							copyLocalizationInfos(a10_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[359]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[360]);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[361]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[362]);
		}
		
		(
			(
				a11 = 'source' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_2_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[363]);
				}
				
				(
					a12_0 = parse_bento_language_bentocomp_core_ParameterModel					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
							startIncompleteElement(element);
						}
						if (a12_0 != null) {
							if (a12_0 != null) {
								Object value = a12_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__SOURCE_MODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_2_0_0_1, a12_0, true);
							copyLocalizationInfos(a12_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[364]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[365]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[366]);
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[367]);
				}
				
			)
			
		)+		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[368]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[369]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[370]);
			addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[371]);
		}
		
		(
			(
				a13 = 'target' {
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_3_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[372]);
				}
				
				(
					a14_0 = parse_bento_language_bentocomp_core_ParameterModel					{
						if (terminateParsing) {
							throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
						}
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
							startIncompleteElement(element);
						}
						if (a14_0 != null) {
							if (a14_0 != null) {
								Object value = a14_0;
								addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__TARGET_MODELS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_3_0_0_1, a14_0, true);
							copyLocalizationInfos(a14_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[373]);
					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[374]);
					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[375]);
				}
				
			)
			
		)*		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[376]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[377]);
			addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[378]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[379]);
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[380]);
	}
	
	(
		(
			a15 = 'variants' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[381]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[382]);
			}
			
			(
				(
					(
						a16_0 = parse_bento_language_bentocomp_variants_Parameter						{
							if (terminateParsing) {
								throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
							}
							if (element == null) {
								element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
								startIncompleteElement(element);
							}
							if (a16_0 != null) {
								if (a16_0 != null) {
									Object value = a16_0;
									addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__FORMAL_PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_7_0_0_1_0_0_0, a16_0, true);
								copyLocalizationInfos(a16_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[383]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[384]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[385]);
					}
					
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[386]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[387]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[388]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[389]);
	}
	
	(
		a17_0 = parse_bento_language_bentocomp_flowcontrol_Composition		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
				startIncompleteElement(element);
			}
			if (a17_0 != null) {
				if (a17_0 != null) {
					Object value = a17_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__COMPOSITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_8, a17_0, true);
				copyLocalizationInfos(a17_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[390]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[391]);
	}
	
	(
		(
			a18 = 'tags' {
				if (element == null) {
					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[392]);
				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[393]);
			}
			
			(
				a19_0 = parse_bento_language_bentocomp_core_Tag				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
						startIncompleteElement(element);
					}
					if (a19_0 != null) {
						if (a19_0 != null) {
							Object value = a19_0;
							addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__TAGS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_1, a19_0, true);
						copyLocalizationInfos(a19_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[394]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[395]);
			}
			
			(
				(
					a20 = ',' {
						if (element == null) {
							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[396]);
						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[397]);
					}
					
					(
						a21_0 = parse_bento_language_bentocomp_core_Tag						{
							if (terminateParsing) {
								throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
							}
							if (element == null) {
								element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
								startIncompleteElement(element);
							}
							if (a21_0 != null) {
								if (a21_0 != null) {
									Object value = a21_0;
									addObjectToList(element, bento.language.bentocomp.core.CorePackage.COMPOSITE_COMPONENT__TAGS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_2_0_0_1, a21_0, true);
								copyLocalizationInfos(a21_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[398]);
						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[399]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[400]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[401]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[402]);
	}
	
	a22 = '}' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
	}
	{
		// expected elements (follow set)
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_bento_language_bentocomp_dsl_ComponentExecution{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_bento_language_bentocomp_core_BindingDeclaration returns [bento.language.bentocomp.core.BindingDeclaration element = null]
@init{
}
:
	a0 = 'binding' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[403]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.BINDING_DECLARATION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.BINDING_DECLARATION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[404]);
	}
	
	a2 = '=' {
		if (element == null) {
			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[405]);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.BINDING_DECLARATION__FILE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.core.CorePackage.BINDING_DECLARATION__FILE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_3, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[406]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[407]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[408]);
	}
	
;

parse_bento_language_bentocomp_flowcontrol_Composition returns [bento.language.bentocomp.flowcontrol.Composition element = null]
@init{
}
:
	a0 = 'compose' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[409]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[410]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[411]);
	}
	
	(
		a1_0 = parse_bento_language_bentocomp_flowcontrol_CompositionStep		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.COMPOSITION__STEP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[412]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[413]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[414]);
	}
	
;

parse_bento_language_bentocomp_flowcontrol_Xor returns [bento.language.bentocomp.flowcontrol.Xor element = null]
@init{
}
:
	a0 = 'xor' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[415]);
	}
	
	(
		(
			a1 = 'when' {
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[416]);
			}
			
			(
				a2_0 = parse_bento_language_bentocomp_flowcontrol_XorCond				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, bento.language.bentocomp.flowcontrol.FlowcontrolPackage.XOR__CONDITIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[417]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[418]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[419]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[420]);
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[421]);
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[422]);
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[423]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[424]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[425]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[426]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[427]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[428]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[429]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[430]);
	}
	
;

parse_bento_language_bentocomp_flowcontrol_XorCond returns [bento.language.bentocomp.flowcontrol.XorCond element = null]
@init{
}
:
	(
		a0_0 = parse_bento_language_bentocomp_flowcontrol_BooleanValue		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
				startIncompleteElement(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.XOR_COND__VALUE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[431]);
	}
	
	a1 = '->' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[432]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[433]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[434]);
	}
	
	(
		a2_0 = parse_bento_language_bentocomp_flowcontrol_CompositionStep		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.XOR_COND__STEP), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[435]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[436]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[437]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[438]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[439]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[440]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[441]);
	}
	
;

parse_bento_language_bentocomp_flowcontrol_Apply returns [bento.language.bentocomp.flowcontrol.Apply element = null]
@init{
}
:
	a0 = 'apply' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[442]);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				bento.language.bentocomp.core.Component proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
				collectHiddenTokens(element);
				registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.flowcontrol.Apply, bento.language.bentocomp.core.Component>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyComponentReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[443]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[444]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[445]);
	}
	
	(
		a3_0 = parse_bento_language_bentocomp_flowcontrol_ApplyParameter		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					addObjectToList(element, bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[446]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[447]);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[448]);
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[449]);
			}
			
			(
				a5_0 = parse_bento_language_bentocomp_flowcontrol_ApplyParameter				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_4_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[450]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[451]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[452]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[453]);
	}
	
	a6 = ')' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[454]);
	}
	
	a7 = '->' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[455]);
	}
	
	a8 = '(' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[456]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[457]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[458]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[459]);
	}
	
	(
		(
			a9_0 = parse_bento_language_bentocomp_flowcontrol_ApplyParameter			{
				if (terminateParsing) {
					throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
				}
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
					startIncompleteElement(element);
				}
				if (a9_0 != null) {
					if (a9_0 != null) {
						Object value = a9_0;
						addObjectToList(element, bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_8, a9_0, true);
					copyLocalizationInfos(a9_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[460]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[461]);
	}
	
	(
		(
			a10 = ',' {
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[462]);
				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[463]);
			}
			
			(
				a11_0 = parse_bento_language_bentocomp_flowcontrol_ApplyParameter				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
						startIncompleteElement(element);
					}
					if (a11_0 != null) {
						if (a11_0 != null) {
							Object value = a11_0;
							addObjectToList(element, bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_9_0_0_1, a11_0, true);
						copyLocalizationInfos(a11_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[464]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[465]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[466]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[467]);
	}
	
	a12 = ')' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[468]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[469]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[470]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[471]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[472]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[473]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[474]);
	}
	
;

parse_bento_language_bentocomp_flowcontrol_ApplyParameter returns [bento.language.bentocomp.flowcontrol.ApplyParameter element = null]
@init{
}
:
	(
		(
			a0 = TEXT			
			{
				if (terminateParsing) {
					throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
				}
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
					startIncompleteElement(element);
				}
				if (a0 != null) {
					bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					bento.language.bentocomp.core.Model proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_0_0, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[475]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[476]);
		}
		
		
		|		(
			a1 = TEXT			
			{
				if (terminateParsing) {
					throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
				}
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
					startIncompleteElement(element);
				}
				if (a1 != null) {
					bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					bento.language.bentocomp.core.BindingDeclaration proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
					collectHiddenTokens(element);
					registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.BindingDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_0, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[477]);
		}
		
		a2 = '(' {
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[478]);
		}
		
		(
			a3 = TEXT			
			{
				if (terminateParsing) {
					throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
				}
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
					startIncompleteElement(element);
				}
				if (a3 != null) {
					bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
					tokenResolver.setOptions(getOptions());
					bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					bento.language.bentocomp.core.Model proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
					collectHiddenTokens(element);
					registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_2, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[479]);
		}
		
		a4 = ')' {
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_3, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[480]);
			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[481]);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[482]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[483]);
	}
	
;

parse_bento_language_bentocomp_flowcontrol_Seq returns [bento.language.bentocomp.flowcontrol.Seq element = null]
@init{
}
:
	a0 = 'seq' {
		if (element == null) {
			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[484]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[485]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[486]);
	}
	
	(
		a1_0 = parse_bento_language_bentocomp_flowcontrol_CompositionStep		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					addObjectToList(element, bento.language.bentocomp.flowcontrol.FlowcontrolPackage.SEQ__STEPS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[487]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[488]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[489]);
	}
	
	(
		(
			a2_0 = parse_bento_language_bentocomp_flowcontrol_CompositionStep			{
				if (terminateParsing) {
					throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
				}
				if (element == null) {
					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						addObjectToList(element, bento.language.bentocomp.flowcontrol.FlowcontrolPackage.SEQ__STEPS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[490]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[491]);
		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[492]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[493]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[494]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[495]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[496]);
	}
	
;

parse_bento_language_bentocomp_flowcontrol_FeatureRef returns [bento.language.bentocomp.flowcontrol.FeatureRef element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createFeatureRef();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				bento.language.bentocomp.variants.Feature proxy = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createSingleFeature();
				collectHiddenTokens(element);
				registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.flowcontrol.FeatureRef, bento.language.bentocomp.variants.Feature>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFeatureRefFeatureReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[497]);
	}
	
;

parse_bento_language_bentocomp_technologies_AtlTemplate returns [bento.language.bentocomp.technologies.AtlTemplate element = null]
@init{
}
:
	a0 = 'atl' {
		if (element == null) {
			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[498]);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_TEMPLATE__TEMPLATE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_TEMPLATE__TEMPLATE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[499]);
	}
	
	a2 = 'with' {
		if (element == null) {
			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[500]);
	}
	
	(
		a3_0 = parse_bento_language_bentocomp_technologies_AtlParameter		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					addObjectToList(element, bento.language.bentocomp.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[501]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[502]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[503]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[504]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[505]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[506]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[507]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[508]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[509]);
	}
	
	(
		(
			a4 = ',' {
				if (element == null) {
					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[510]);
			}
			
			(
				a5_0 = parse_bento_language_bentocomp_technologies_AtlParameter				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, bento.language.bentocomp.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_4_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[511]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[512]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[513]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[514]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[515]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[516]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[517]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[518]);
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[519]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[520]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[521]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[522]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[523]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[524]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[525]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[526]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[527]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[528]);
	}
	
;

parse_bento_language_bentocomp_technologies_AtlParameter returns [bento.language.bentocomp.technologies.AtlParameter element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[529]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[530]);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[531]);
			}
			
			(
				a2 = TEXT				
				{
					if (terminateParsing) {
						throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
					}
					if (element == null) {
						element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
						startIncompleteElement(element);
					}
					if (a2 != null) {
						bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_METAMODEL_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_METAMODEL_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[532]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[533]);
	}
	
	a3 = '=' {
		if (element == null) {
			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[534]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				bento.language.bentocomp.core.Model proxy = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
				collectHiddenTokens(element);
				registerContextDependentProxy(new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragmentFactory<bento.language.bentocomp.technologies.AtlParameter, bento.language.bentocomp.core.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAtlParameterModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[535]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[536]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[537]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[538]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[539]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[540]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[541]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[542]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[543]);
	}
	
;

parse_bento_language_bentocomp_technologies_JavaTemplate returns [bento.language.bentocomp.technologies.JavaTemplate element = null]
@init{
}
:
	a0 = 'java' {
		if (element == null) {
			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createJavaTemplate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_20_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[544]);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createJavaTemplate();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_20_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[545]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[546]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[547]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[548]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[549]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[550]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[551]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[552]);
	}
	
;

parse_bento_language_bentocomp_technologies_SiriusTemplate returns [bento.language.bentocomp.technologies.SiriusTemplate element = null]
@init{
}
:
	a0 = 'sirius' {
		if (element == null) {
			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createSiriusTemplate();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_21_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[553]);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
			}
			if (element == null) {
				element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createSiriusTemplate();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				bento.language.bentocomp.resource.bento.IBentoTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.SIRIUS_TEMPLATE__ODESIGN_FILE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(bento.language.bentocomp.technologies.TechnologiesPackage.SIRIUS_TEMPLATE__ODESIGN_FILE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_21_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[554]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[555]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[556]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[557]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[558]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[559]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[560]);
		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[561]);
	}
	
;

parse_bento_language_bentocomp_core_Component returns [bento.language.bentocomp.core.Component element = null]
:
	c0 = parse_bento_language_bentocomp_core_TransformationComponent{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_bento_language_bentocomp_core_GraphicalEditorComponent{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_bento_language_bentocomp_dsl_ComponentExecution{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_bento_language_bentocomp_core_CompositeComponent{ element = c3; /* this is a subclass or primitive expression choice */ }
	
;

parse_bento_language_bentocomp_variants_Parameter returns [bento.language.bentocomp.variants.Parameter element = null]
:
	c0 = parse_bento_language_bentocomp_variants_SingleFeature{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_bento_language_bentocomp_variants_XorFeature{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_bento_language_bentocomp_core_Template returns [bento.language.bentocomp.core.Template element = null]
:
	c0 = parse_bento_language_bentocomp_technologies_AtlTemplate{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_bento_language_bentocomp_technologies_JavaTemplate{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_bento_language_bentocomp_technologies_SiriusTemplate{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_bento_language_bentocomp_flowcontrol_CompositionStep returns [bento.language.bentocomp.flowcontrol.CompositionStep element = null]
:
	c0 = parse_bento_language_bentocomp_flowcontrol_Xor{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_bento_language_bentocomp_flowcontrol_Apply{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_bento_language_bentocomp_flowcontrol_Seq{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_bento_language_bentocomp_flowcontrol_BooleanValue returns [bento.language.bentocomp.flowcontrol.BooleanValue element = null]
:
	c0 = parse_bento_language_bentocomp_flowcontrol_FeatureRef{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

QNAME:
	(('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9'))*('.'('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9'))*)+)
;
COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
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
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

