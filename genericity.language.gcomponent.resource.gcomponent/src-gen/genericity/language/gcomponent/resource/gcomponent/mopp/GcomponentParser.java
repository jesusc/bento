// $ANTLR ${project.version} ${buildNumber}

	package genericity.language.gcomponent.resource.gcomponent.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class GcomponentParser extends GcomponentANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "QUOTED_34_34", "WHITESPACE", "LINEBREAK", "'transformation'", "'component'", "'{'", "'source'", "'target'", "'}'", "'concept'", "':'", "'tags'"
    };
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int TEXT=4;
    public static final int QUOTED_34_34=5;
    public static final int WHITESPACE=6;
    public static final int LINEBREAK=7;

    // delegates
    // delegators


        public GcomponentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GcomponentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[8+1];
             
             
        }
        

    public String[] getTokenNames() { return GcomponentParser.tokenNames; }
    public String getGrammarFileName() { return "Gcomponent.g"; }


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
    	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
    	
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
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
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
    	
    	public void addExpectedElement(genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElement = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal(terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
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
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
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
    				return new GcomponentParser(new org.antlr.runtime3_3_0.CommonTokenStream(new GcomponentLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new GcomponentParser(new org.antlr.runtime3_3_0.CommonTokenStream(new GcomponentLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public GcomponentParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((GcomponentLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((GcomponentLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == genericity.language.gcomponent.TransformationComponent.class) {
    				return parse_genericity_language_gcomponent_TransformationComponent();
    			}
    			if (type.getInstanceClass() == genericity.language.gcomponent.Concept.class) {
    				return parse_genericity_language_gcomponent_Concept();
    			}
    			if (type.getInstanceClass() == genericity.language.gcomponent.Tag.class) {
    				return parse_genericity_language_gcomponent_Tag();
    			}
    		}
    		throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
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
    		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
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
    		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
    		genericity.language.gcomponent.resource.gcomponent.IGcomponentParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
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
    		int followSetID = 21;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
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
    						java.util.Collection<genericity.language.gcomponent.resource.gcomponent.util.GcomponentPair<genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (genericity.language.gcomponent.resource.gcomponent.util.GcomponentPair<genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement newFollower = newFollowerPair.getLeft();
    							genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal newFollowTerminal = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
    			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
    			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
    			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
    			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
    			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
    			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
    			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
    			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	protected void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.pop();
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	



    // $ANTLR start "start"
    // Gcomponent.g:469:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_genericity_language_gcomponent_TransformationComponent ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        genericity.language.gcomponent.TransformationComponent c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Gcomponent.g:470:1: ( (c0= parse_genericity_language_gcomponent_TransformationComponent ) EOF )
            // Gcomponent.g:471:2: (c0= parse_genericity_language_gcomponent_TransformationComponent ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_0, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Gcomponent.g:476:2: (c0= parse_genericity_language_gcomponent_TransformationComponent )
            // Gcomponent.g:477:3: c0= parse_genericity_language_gcomponent_TransformationComponent
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_TransformationComponent_in_start82);
            c0=parse_genericity_language_gcomponent_TransformationComponent();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		retrieveLayoutInformation(element, null, null, false);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_genericity_language_gcomponent_TransformationComponent"
    // Gcomponent.g:485:1: parse_genericity_language_gcomponent_TransformationComponent returns [genericity.language.gcomponent.TransformationComponent element = null] : a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_Concept ) ) )* a8= '}' ;
    public final genericity.language.gcomponent.TransformationComponent parse_genericity_language_gcomponent_TransformationComponent() throws RecognitionException {
        genericity.language.gcomponent.TransformationComponent element =  null;
        int parse_genericity_language_gcomponent_TransformationComponent_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        genericity.language.gcomponent.Concept a5_0 = null;

        genericity.language.gcomponent.Concept a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Gcomponent.g:488:1: (a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_Concept ) ) )* a8= '}' )
            // Gcomponent.g:489:2: a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_Concept ) ) )* a8= '}'
            {
            a0=(Token)match(input,8,FOLLOW_8_in_parse_genericity_language_gcomponent_TransformationComponent115); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_1, 1);
              	
            }
            a1=(Token)match(input,9,FOLLOW_9_in_parse_genericity_language_gcomponent_TransformationComponent129); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_2, 2);
              	
            }
            // Gcomponent.g:517:2: (a2= TEXT )
            // Gcomponent.g:518:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_TransformationComponent147); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
              			}
              			if (element == null) {
              				element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
              				incompleteObjects.push(element);
              			}
              			if (a2 != null) {
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_3, 3);
              	
            }
            a3=(Token)match(input,10,FOLLOW_10_in_parse_genericity_language_gcomponent_TransformationComponent168); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_4, 4);
              	
            }
            // Gcomponent.g:567:2: ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_Concept ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Gcomponent.g:568:3: (a4= 'source' (a5_0= parse_genericity_language_gcomponent_Concept ) )
            	    {
            	    // Gcomponent.g:568:3: (a4= 'source' (a5_0= parse_genericity_language_gcomponent_Concept ) )
            	    // Gcomponent.g:569:4: a4= 'source' (a5_0= parse_genericity_language_gcomponent_Concept )
            	    {
            	    a4=(Token)match(input,11,FOLLOW_11_in_parse_genericity_language_gcomponent_TransformationComponent191); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_4_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_5, 5, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.FEATURE_0);
            	      			
            	    }
            	    // Gcomponent.g:583:4: (a5_0= parse_genericity_language_gcomponent_Concept )
            	    // Gcomponent.g:584:5: a5_0= parse_genericity_language_gcomponent_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_Concept_in_parse_genericity_language_gcomponent_TransformationComponent217);
            	    a5_0=parse_genericity_language_gcomponent_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a5_0 != null) {
            	      						if (a5_0 != null) {
            	      							Object value = a5_0;
            	      							addObjectToList(element, genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__SOURCE, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_4_0_0_1, a5_0, true);
            	      						copyLocalizationInfos(a5_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_4, 6);
            	      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 6);
            	      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 6);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_4, 7);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 7);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 7);
              	
            }
            // Gcomponent.g:620:2: ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_Concept ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Gcomponent.g:621:3: (a6= 'target' (a7_0= parse_genericity_language_gcomponent_Concept ) )
            	    {
            	    // Gcomponent.g:621:3: (a6= 'target' (a7_0= parse_genericity_language_gcomponent_Concept ) )
            	    // Gcomponent.g:622:4: a6= 'target' (a7_0= parse_genericity_language_gcomponent_Concept )
            	    {
            	    a6=(Token)match(input,12,FOLLOW_12_in_parse_genericity_language_gcomponent_TransformationComponent267); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_5_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_5, 8, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.FEATURE_1);
            	      			
            	    }
            	    // Gcomponent.g:636:4: (a7_0= parse_genericity_language_gcomponent_Concept )
            	    // Gcomponent.g:637:5: a7_0= parse_genericity_language_gcomponent_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_Concept_in_parse_genericity_language_gcomponent_TransformationComponent293);
            	    a7_0=parse_genericity_language_gcomponent_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      					if (terminateParsing) {
            	      						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            	      					}
            	      					if (element == null) {
            	      						element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
            	      						incompleteObjects.push(element);
            	      					}
            	      					if (a7_0 != null) {
            	      						if (a7_0 != null) {
            	      							Object value = a7_0;
            	      							addObjectToList(element, genericity.language.gcomponent.GcomponentPackage.TRANSFORMATION_COMPONENT__TARGET, value);
            	      							completedElement(value, true);
            	      						}
            	      						collectHiddenTokens(element);
            	      						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_5_0_0_1, a7_0, true);
            	      						copyLocalizationInfos(a7_0, element);
            	      					}
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 9);
            	      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 9);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 10);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 10);
              	
            }
            a8=(Token)match(input,13,FOLLOW_13_in_parse_genericity_language_gcomponent_TransformationComponent334); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTransformationComponent();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_0_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_genericity_language_gcomponent_TransformationComponent_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_TransformationComponent"


    // $ANTLR start "parse_genericity_language_gcomponent_Concept"
    // Gcomponent.g:686:1: parse_genericity_language_gcomponent_Concept returns [genericity.language.gcomponent.Concept element = null] : a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+ ) )? ;
    public final genericity.language.gcomponent.Concept parse_genericity_language_gcomponent_Concept() throws RecognitionException {
        genericity.language.gcomponent.Concept element =  null;
        int parse_genericity_language_gcomponent_Concept_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        genericity.language.gcomponent.Tag a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Gcomponent.g:689:1: (a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+ ) )? )
            // Gcomponent.g:690:2: a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+ ) )?
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_genericity_language_gcomponent_Concept363); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createConcept();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_8, 12);
              	
            }
            // Gcomponent.g:704:2: (a1= TEXT )
            // Gcomponent.g:705:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_Concept381); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
              			}
              			if (element == null) {
              				element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createConcept();
              				incompleteObjects.push(element);
              			}
              			if (a1 != null) {
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.CONCEPT__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.CONCEPT__NAME), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_1, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_9, 13);
              	
            }
            a2=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_Concept402); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createConcept();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_10, 14);
              	
            }
            // Gcomponent.g:754:2: (a3= QUOTED_34_34 )
            // Gcomponent.g:755:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_Concept420); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
              			}
              			if (element == null) {
              				element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createConcept();
              				incompleteObjects.push(element);
              			}
              			if (a3 != null) {
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
              				tokenResolver.setOptions(getOptions());
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.CONCEPT__URI), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.CONCEPT__URI), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_3, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_11, 15);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_4, 15);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 15);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 15);
              	
            }
            // Gcomponent.g:793:2: ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+ ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Gcomponent.g:794:3: (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+ )
                    {
                    // Gcomponent.g:794:3: (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+ )
                    // Gcomponent.g:795:4: a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+
                    {
                    a4=(Token)match(input,16,FOLLOW_16_in_parse_genericity_language_gcomponent_Concept450); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createConcept();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_12, 16);
                      			
                    }
                    a5=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_Concept470); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createConcept();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_13, 17, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.FEATURE_2);
                      			
                    }
                    // Gcomponent.g:823:4: ( (a6_0= parse_genericity_language_gcomponent_Tag ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==TEXT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Gcomponent.g:824:5: (a6_0= parse_genericity_language_gcomponent_Tag )
                    	    {
                    	    // Gcomponent.g:824:5: (a6_0= parse_genericity_language_gcomponent_Tag )
                    	    // Gcomponent.g:825:6: a6_0= parse_genericity_language_gcomponent_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_Tag_in_parse_genericity_language_gcomponent_Concept503);
                    	    a6_0=parse_genericity_language_gcomponent_Tag();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (terminateParsing) {
                    	      							throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
                    	      						}
                    	      						if (element == null) {
                    	      							element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createConcept();
                    	      							incompleteObjects.push(element);
                    	      						}
                    	      						if (a6_0 != null) {
                    	      							if (a6_0 != null) {
                    	      								Object value = a6_0;
                    	      								addObjectToList(element, genericity.language.gcomponent.GcomponentPackage.CONCEPT__TAGS, value);
                    	      								completedElement(value, true);
                    	      							}
                    	      							collectHiddenTokens(element);
                    	      							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_2, a6_0, true);
                    	      							copyLocalizationInfos(a6_0, element);
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_13, 18, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.FEATURE_2);
                      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_4, 18);
                      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 18);
                      				addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 18);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_4, 19);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 19);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 19);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_genericity_language_gcomponent_Concept_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_Concept"


    // $ANTLR start "parse_genericity_language_gcomponent_Tag"
    // Gcomponent.g:865:1: parse_genericity_language_gcomponent_Tag returns [genericity.language.gcomponent.Tag element = null] : (a0= TEXT ) ;
    public final genericity.language.gcomponent.Tag parse_genericity_language_gcomponent_Tag() throws RecognitionException {
        genericity.language.gcomponent.Tag element =  null;
        int parse_genericity_language_gcomponent_Tag_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Gcomponent.g:868:1: ( (a0= TEXT ) )
            // Gcomponent.g:869:2: (a0= TEXT )
            {
            // Gcomponent.g:869:2: (a0= TEXT )
            // Gcomponent.g:870:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_Tag575); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
              			}
              			if (element == null) {
              				element = genericity.language.gcomponent.GcomponentFactory.eINSTANCE.createTag();
              				incompleteObjects.push(element);
              			}
              			if (a0 != null) {
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TAG__VALUE), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String) resolvedObject;
              				if (resolved != null) {
              					Object value = resolved;
              					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.GcomponentPackage.TAG__VALUE), value);
              					completedElement(value, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_0, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_13, 20, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.FEATURE_2);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_4, 20);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_6, 20);
              		addExpectedElement(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFollowSetProvider.TERMINAL_7, 20);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_genericity_language_gcomponent_Tag_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_Tag"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_TransformationComponent_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_parse_genericity_language_gcomponent_TransformationComponent115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_genericity_language_gcomponent_TransformationComponent129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_TransformationComponent147 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_genericity_language_gcomponent_TransformationComponent168 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_genericity_language_gcomponent_TransformationComponent191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_Concept_in_parse_genericity_language_gcomponent_TransformationComponent217 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12_in_parse_genericity_language_gcomponent_TransformationComponent267 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_Concept_in_parse_genericity_language_gcomponent_TransformationComponent293 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_parse_genericity_language_gcomponent_TransformationComponent334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_genericity_language_gcomponent_Concept363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_Concept381 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_Concept402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_Concept420 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_parse_genericity_language_gcomponent_Concept450 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_Concept470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_Tag_in_parse_genericity_language_gcomponent_Concept503 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_Tag575 = new BitSet(new long[]{0x0000000000000002L});

}