// $ANTLR 3.4

	package genericity.language.gcomponent.resource.gcomponent.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GcomponentParser extends GcomponentANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LINEBREAK", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "'+'", "','", "'-'", "'->'", "':'", "'apply'", "'atl'", "'component'", "'compose'", "'composite'", "'concept'", "'definition'", "'source'", "'tags'", "'target'", "'transformation'", "'uses'", "'variants'", "'when'", "'xor'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int COMMENT=4;
    public static final int LINEBREAK=5;
    public static final int QUOTED_34_34=6;
    public static final int TEXT=7;
    public static final int WHITESPACE=8;

    // delegates
    public GcomponentANTLRParserBase[] getDelegates() {
        return new GcomponentANTLRParserBase[] {};
    }

    // delegators


    public GcomponentParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GcomponentParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(38 + 1);
         

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
    	



    // $ANTLR start "start"
    // Gcomponent.g:538:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        genericity.language.gcomponent.dsl.DefinitionRoot c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Gcomponent.g:539:2: ( (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot ) EOF )
            // Gcomponent.g:540:2: (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[1]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Gcomponent.g:546:2: (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot )
            // Gcomponent.g:547:3: c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_dsl_DefinitionRoot_in_start82);
            c0=parse_genericity_language_gcomponent_dsl_DefinitionRoot();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_genericity_language_gcomponent_dsl_DefinitionRoot"
    // Gcomponent.g:555:1: parse_genericity_language_gcomponent_dsl_DefinitionRoot returns [genericity.language.gcomponent.dsl.DefinitionRoot element = null] : (a0_0= parse_genericity_language_gcomponent_core_Component ) ;
    public final genericity.language.gcomponent.dsl.DefinitionRoot parse_genericity_language_gcomponent_dsl_DefinitionRoot() throws RecognitionException {
        genericity.language.gcomponent.dsl.DefinitionRoot element =  null;

        int parse_genericity_language_gcomponent_dsl_DefinitionRoot_StartIndex = input.index();

        genericity.language.gcomponent.core.Component a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Gcomponent.g:558:2: ( (a0_0= parse_genericity_language_gcomponent_core_Component ) )
            // Gcomponent.g:559:2: (a0_0= parse_genericity_language_gcomponent_core_Component )
            {
            // Gcomponent.g:559:2: (a0_0= parse_genericity_language_gcomponent_core_Component )
            // Gcomponent.g:560:3: a0_0= parse_genericity_language_gcomponent_core_Component
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Component_in_parse_genericity_language_gcomponent_dsl_DefinitionRoot119);
            a0_0=parse_genericity_language_gcomponent_core_Component();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_genericity_language_gcomponent_dsl_DefinitionRoot_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_dsl_DefinitionRoot"



    // $ANTLR start "parse_genericity_language_gcomponent_core_TransformationComponent"
    // Gcomponent.g:586:1: parse_genericity_language_gcomponent_core_TransformationComponent returns [genericity.language.gcomponent.core.TransformationComponent element = null] : a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )* ( (a8= 'variants' ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? a10= 'definition' (a11_0= parse_genericity_language_gcomponent_core_Template ) a12= '}' ;
    public final genericity.language.gcomponent.core.TransformationComponent parse_genericity_language_gcomponent_core_TransformationComponent() throws RecognitionException {
        genericity.language.gcomponent.core.TransformationComponent element =  null;

        int parse_genericity_language_gcomponent_core_TransformationComponent_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        genericity.language.gcomponent.core.Concept a5_0 =null;

        genericity.language.gcomponent.core.Concept a7_0 =null;

        genericity.language.gcomponent.variants.Parameter a9_0 =null;

        genericity.language.gcomponent.core.Template a11_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Gcomponent.g:589:2: (a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )* ( (a8= 'variants' ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? a10= 'definition' (a11_0= parse_genericity_language_gcomponent_core_Template ) a12= '}' )
            // Gcomponent.g:590:2: a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )* ( (a8= 'variants' ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? a10= 'definition' (a11_0= parse_genericity_language_gcomponent_core_Template ) a12= '}'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_genericity_language_gcomponent_core_TransformationComponent152); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[2]);
            	}

            a1=(Token)match(input,18,FOLLOW_18_in_parse_genericity_language_gcomponent_core_TransformationComponent166); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[3]);
            	}

            // Gcomponent.g:618:2: (a2= TEXT )
            // Gcomponent.g:619:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_TransformationComponent184); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[4]);
            	}

            a3=(Token)match(input,31,FOLLOW_31_in_parse_genericity_language_gcomponent_core_TransformationComponent205); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[5]);
            	}

            // Gcomponent.g:668:2: ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Gcomponent.g:669:3: (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    {
            	    // Gcomponent.g:669:3: (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:670:4: a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a4=(Token)match(input,23,FOLLOW_23_in_parse_genericity_language_gcomponent_core_TransformationComponent228); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[6]);
            	    			}

            	    // Gcomponent.g:684:4: (a5_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:685:5: a5_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent254);
            	    a5_0=parse_genericity_language_gcomponent_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[7]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[8]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[9]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[10]);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[12]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[14]);
            	}

            // Gcomponent.g:723:2: ( (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Gcomponent.g:724:3: (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    {
            	    // Gcomponent.g:724:3: (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:725:4: a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a6=(Token)match(input,25,FOLLOW_25_in_parse_genericity_language_gcomponent_core_TransformationComponent304); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_5_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[15]);
            	    			}

            	    // Gcomponent.g:739:4: (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:740:5: a7_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent330);
            	    a7_0=parse_genericity_language_gcomponent_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[16]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[17]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[18]);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[19]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[21]);
            	}

            // Gcomponent.g:776:2: ( (a8= 'variants' ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Gcomponent.g:777:3: (a8= 'variants' ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    {
                    // Gcomponent.g:777:3: (a8= 'variants' ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    // Gcomponent.g:778:4: a8= 'variants' ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
                    {
                    a8=(Token)match(input,28,FOLLOW_28_in_parse_genericity_language_gcomponent_core_TransformationComponent380); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[22]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[23]);
                    			}

                    // Gcomponent.g:793:4: ( ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==11||LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Gcomponent.g:794:5: ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    {
                    	    // Gcomponent.g:794:5: ( (a9_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    // Gcomponent.g:795:6: (a9_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    {
                    	    // Gcomponent.g:795:6: (a9_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    // Gcomponent.g:796:7: a9_0= parse_genericity_language_gcomponent_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_TransformationComponent421);
                    	    a9_0=parse_genericity_language_gcomponent_variants_Parameter();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[24]);
                    	    						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[25]);
                    	    						addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[26]);
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
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[27]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[28]);
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[29]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[30]);
            	}

            a10=(Token)match(input,22,FOLLOW_22_in_parse_genericity_language_gcomponent_core_TransformationComponent495); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[31]);
            	}

            // Gcomponent.g:853:2: (a11_0= parse_genericity_language_gcomponent_core_Template )
            // Gcomponent.g:854:3: a11_0= parse_genericity_language_gcomponent_core_Template
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Template_in_parse_genericity_language_gcomponent_core_TransformationComponent513);
            a11_0=parse_genericity_language_gcomponent_core_Template();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[32]);
            	}

            a12=(Token)match(input,32,FOLLOW_32_in_parse_genericity_language_gcomponent_core_TransformationComponent531); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_genericity_language_gcomponent_core_TransformationComponent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_TransformationComponent"



    // $ANTLR start "parse_genericity_language_gcomponent_core_Concept"
    // Gcomponent.g:894:1: parse_genericity_language_gcomponent_core_Concept returns [genericity.language.gcomponent.core.Concept element = null] : a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )? ;
    public final genericity.language.gcomponent.core.Concept parse_genericity_language_gcomponent_core_Concept() throws RecognitionException {
        genericity.language.gcomponent.core.Concept element =  null;

        int parse_genericity_language_gcomponent_core_Concept_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        genericity.language.gcomponent.core.Tag a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Gcomponent.g:897:2: (a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )? )
            // Gcomponent.g:898:2: a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )?
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_genericity_language_gcomponent_core_Concept560); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[33]);
            	}

            // Gcomponent.g:912:2: (a1= TEXT )
            // Gcomponent.g:913:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Concept578); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[34]);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept599); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[35]);
            	}

            // Gcomponent.g:962:2: (a3= QUOTED_34_34 )
            // Gcomponent.g:963:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_Concept617); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
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

            // Gcomponent.g:1006:2: ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Gcomponent.g:1007:3: (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ )
                    {
                    // Gcomponent.g:1007:3: (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ )
                    // Gcomponent.g:1008:4: a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+
                    {
                    a4=(Token)match(input,24,FOLLOW_24_in_parse_genericity_language_gcomponent_core_Concept647); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[45]);
                    			}

                    a5=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept667); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_2_0_0_4_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[46]);
                    			}

                    // Gcomponent.g:1036:4: ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==TEXT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Gcomponent.g:1037:5: (a6_0= parse_genericity_language_gcomponent_core_Tag )
                    	    {
                    	    // Gcomponent.g:1037:5: (a6_0= parse_genericity_language_gcomponent_core_Tag )
                    	    // Gcomponent.g:1038:6: a6_0= parse_genericity_language_gcomponent_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Tag_in_parse_genericity_language_gcomponent_core_Concept700);
                    	    a6_0=parse_genericity_language_gcomponent_core_Tag();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_genericity_language_gcomponent_core_Concept_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_Concept"



    // $ANTLR start "parse_genericity_language_gcomponent_core_Tag"
    // Gcomponent.g:1088:1: parse_genericity_language_gcomponent_core_Tag returns [genericity.language.gcomponent.core.Tag element = null] : (a0= TEXT ) ;
    public final genericity.language.gcomponent.core.Tag parse_genericity_language_gcomponent_core_Tag() throws RecognitionException {
        genericity.language.gcomponent.core.Tag element =  null;

        int parse_genericity_language_gcomponent_core_Tag_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Gcomponent.g:1091:2: ( (a0= TEXT ) )
            // Gcomponent.g:1092:2: (a0= TEXT )
            {
            // Gcomponent.g:1092:2: (a0= TEXT )
            // Gcomponent.g:1093:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Tag772); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_genericity_language_gcomponent_core_Tag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_Tag"



    // $ANTLR start "parse_genericity_language_gcomponent_core_AtlTemplate"
    // Gcomponent.g:1138:1: parse_genericity_language_gcomponent_core_AtlTemplate returns [genericity.language.gcomponent.core.AtlTemplate element = null] : a0= 'atl' (a1= QUOTED_34_34 ) ;
    public final genericity.language.gcomponent.core.AtlTemplate parse_genericity_language_gcomponent_core_AtlTemplate() throws RecognitionException {
        genericity.language.gcomponent.core.AtlTemplate element =  null;

        int parse_genericity_language_gcomponent_core_AtlTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Gcomponent.g:1141:2: (a0= 'atl' (a1= QUOTED_34_34 ) )
            // Gcomponent.g:1142:2: a0= 'atl' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_genericity_language_gcomponent_core_AtlTemplate808); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[73]);
            	}

            // Gcomponent.g:1156:2: (a1= QUOTED_34_34 )
            // Gcomponent.g:1157:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_AtlTemplate826); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[74]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_genericity_language_gcomponent_core_AtlTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_AtlTemplate"



    // $ANTLR start "parse_genericity_language_gcomponent_variants_SingleFeature"
    // Gcomponent.g:1194:1: parse_genericity_language_gcomponent_variants_SingleFeature returns [genericity.language.gcomponent.variants.SingleFeature element = null] : a0= '-' (a1= TEXT ) ;
    public final genericity.language.gcomponent.variants.SingleFeature parse_genericity_language_gcomponent_variants_SingleFeature() throws RecognitionException {
        genericity.language.gcomponent.variants.SingleFeature element =  null;

        int parse_genericity_language_gcomponent_variants_SingleFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Gcomponent.g:1197:2: (a0= '-' (a1= TEXT ) )
            // Gcomponent.g:1198:2: a0= '-' (a1= TEXT )
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_genericity_language_gcomponent_variants_SingleFeature862); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createSingleFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[75]);
            	}

            // Gcomponent.g:1212:2: (a1= TEXT )
            // Gcomponent.g:1213:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_SingleFeature880); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[76]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[77]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[78]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[79]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_genericity_language_gcomponent_variants_SingleFeature_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_variants_SingleFeature"



    // $ANTLR start "parse_genericity_language_gcomponent_variants_XorFeature"
    // Gcomponent.g:1253:1: parse_genericity_language_gcomponent_variants_XorFeature returns [genericity.language.gcomponent.variants.XorFeature element = null] : a0= '+' (a1= TEXT ) a2= 'xor' ;
    public final genericity.language.gcomponent.variants.XorFeature parse_genericity_language_gcomponent_variants_XorFeature() throws RecognitionException {
        genericity.language.gcomponent.variants.XorFeature element =  null;

        int parse_genericity_language_gcomponent_variants_XorFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Gcomponent.g:1256:2: (a0= '+' (a1= TEXT ) a2= 'xor' )
            // Gcomponent.g:1257:2: a0= '+' (a1= TEXT ) a2= 'xor'
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_genericity_language_gcomponent_variants_XorFeature916); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createXorFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[80]);
            	}

            // Gcomponent.g:1271:2: (a1= TEXT )
            // Gcomponent.g:1272:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_XorFeature934); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[81]);
            	}

            a2=(Token)match(input,30,FOLLOW_30_in_parse_genericity_language_gcomponent_variants_XorFeature955); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.variants.VariantsFactory.eINSTANCE.createXorFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[82]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[83]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[84]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[85]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_genericity_language_gcomponent_variants_XorFeature_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_variants_XorFeature"



    // $ANTLR start "parse_genericity_language_gcomponent_core_CompositeComponent"
    // Gcomponent.g:1326:1: parse_genericity_language_gcomponent_core_CompositeComponent returns [genericity.language.gcomponent.core.CompositeComponent element = null] : a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )+ ( (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) )* ( (a10= 'variants' ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? (a12_0= parse_genericity_language_gcomponent_flowcontrol_Composition ) a13= '}' ;
    public final genericity.language.gcomponent.core.CompositeComponent parse_genericity_language_gcomponent_core_CompositeComponent() throws RecognitionException {
        genericity.language.gcomponent.core.CompositeComponent element =  null;

        int parse_genericity_language_gcomponent_core_CompositeComponent_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        Token a13=null;
        genericity.language.gcomponent.core.Concept a7_0 =null;

        genericity.language.gcomponent.core.Concept a9_0 =null;

        genericity.language.gcomponent.variants.Parameter a11_0 =null;

        genericity.language.gcomponent.flowcontrol.Composition a12_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Gcomponent.g:1329:2: (a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )+ ( (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) )* ( (a10= 'variants' ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? (a12_0= parse_genericity_language_gcomponent_flowcontrol_Composition ) a13= '}' )
            // Gcomponent.g:1330:2: a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )+ ( (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) )* ( (a10= 'variants' ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? (a12_0= parse_genericity_language_gcomponent_flowcontrol_Composition ) a13= '}'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_genericity_language_gcomponent_core_CompositeComponent984); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[86]);
            	}

            a1=(Token)match(input,18,FOLLOW_18_in_parse_genericity_language_gcomponent_core_CompositeComponent998); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[87]);
            	}

            // Gcomponent.g:1358:2: (a2= TEXT )
            // Gcomponent.g:1359:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_CompositeComponent1016); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[88]);
            	}

            a3=(Token)match(input,31,FOLLOW_31_in_parse_genericity_language_gcomponent_core_CompositeComponent1037); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[89]);
            	}

            // Gcomponent.g:1408:2: ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Gcomponent.g:1409:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    {
            	    // Gcomponent.g:1409:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    // Gcomponent.g:1410:4: a4= 'uses' (a5= QUOTED_34_34 )
            	    {
            	    a4=(Token)match(input,27,FOLLOW_27_in_parse_genericity_language_gcomponent_core_CompositeComponent1060); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[90]);
            	    			}

            	    // Gcomponent.g:1424:4: (a5= QUOTED_34_34 )
            	    // Gcomponent.g:1425:5: a5= QUOTED_34_34
            	    {
            	    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_CompositeComponent1086); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[91]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[92]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[93]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[94]);
            	}

            // Gcomponent.g:1473:2: ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Gcomponent.g:1474:3: (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    {
            	    // Gcomponent.g:1474:3: (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:1475:4: a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a6=(Token)match(input,23,FOLLOW_23_in_parse_genericity_language_gcomponent_core_CompositeComponent1141); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[95]);
            	    			}

            	    // Gcomponent.g:1489:4: (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:1490:5: a7_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1167);
            	    a7_0=parse_genericity_language_gcomponent_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[96]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[97]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[98]);
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[99]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[100]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[101]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[102]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[103]);
            	}

            // Gcomponent.g:1528:2: ( (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Gcomponent.g:1529:3: (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    {
            	    // Gcomponent.g:1529:3: (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:1530:4: a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a8=(Token)match(input,25,FOLLOW_25_in_parse_genericity_language_gcomponent_core_CompositeComponent1217); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_6_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[104]);
            	    			}

            	    // Gcomponent.g:1544:4: (a9_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:1545:5: a9_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1243);
            	    a9_0=parse_genericity_language_gcomponent_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[105]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[106]);
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[107]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[108]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[109]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[110]);
            	}

            // Gcomponent.g:1581:2: ( (a10= 'variants' ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Gcomponent.g:1582:3: (a10= 'variants' ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    {
                    // Gcomponent.g:1582:3: (a10= 'variants' ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    // Gcomponent.g:1583:4: a10= 'variants' ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
                    {
                    a10=(Token)match(input,28,FOLLOW_28_in_parse_genericity_language_gcomponent_core_CompositeComponent1293); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_7_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[111]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[112]);
                    			}

                    // Gcomponent.g:1598:4: ( ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==11||LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Gcomponent.g:1599:5: ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    {
                    	    // Gcomponent.g:1599:5: ( (a11_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    // Gcomponent.g:1600:6: (a11_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    {
                    	    // Gcomponent.g:1600:6: (a11_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    // Gcomponent.g:1601:7: a11_0= parse_genericity_language_gcomponent_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_CompositeComponent1334);
                    	    a11_0=parse_genericity_language_gcomponent_variants_Parameter();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[113]);
                    	    						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[114]);
                    	    						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[115]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[116]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[117]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[118]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[119]);
            	}

            // Gcomponent.g:1644:2: (a12_0= parse_genericity_language_gcomponent_flowcontrol_Composition )
            // Gcomponent.g:1645:3: a12_0= parse_genericity_language_gcomponent_flowcontrol_Composition
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Composition_in_parse_genericity_language_gcomponent_core_CompositeComponent1412);
            a12_0=parse_genericity_language_gcomponent_flowcontrol_Composition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[120]);
            	}

            a13=(Token)match(input,32,FOLLOW_32_in_parse_genericity_language_gcomponent_core_CompositeComponent1430); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_genericity_language_gcomponent_core_CompositeComponent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_CompositeComponent"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_Composition"
    // Gcomponent.g:1685:1: parse_genericity_language_gcomponent_flowcontrol_Composition returns [genericity.language.gcomponent.flowcontrol.Composition element = null] : a0= 'compose' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) ;
    public final genericity.language.gcomponent.flowcontrol.Composition parse_genericity_language_gcomponent_flowcontrol_Composition() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.Composition element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_Composition_StartIndex = input.index();

        Token a0=null;
        genericity.language.gcomponent.flowcontrol.CompositionStep a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Gcomponent.g:1688:2: (a0= 'compose' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )
            // Gcomponent.g:1689:2: a0= 'compose' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_genericity_language_gcomponent_flowcontrol_Composition1459); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[121]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[122]);
            	}

            // Gcomponent.g:1704:2: (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            // Gcomponent.g:1705:3: a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Composition1477);
            a1_0=parse_genericity_language_gcomponent_flowcontrol_CompositionStep();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[123]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_genericity_language_gcomponent_flowcontrol_Composition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_Composition"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_Xor"
    // Gcomponent.g:1732:1: parse_genericity_language_gcomponent_flowcontrol_Xor returns [genericity.language.gcomponent.flowcontrol.Xor element = null] : a0= 'xor' ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+ ;
    public final genericity.language.gcomponent.flowcontrol.Xor parse_genericity_language_gcomponent_flowcontrol_Xor() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.Xor element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_Xor_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        genericity.language.gcomponent.flowcontrol.XorCond a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Gcomponent.g:1735:2: (a0= 'xor' ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+ )
            // Gcomponent.g:1736:2: a0= 'xor' ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_genericity_language_gcomponent_flowcontrol_Xor1510); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[124]);
            	}

            // Gcomponent.g:1750:2: ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred12_Gcomponent()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // Gcomponent.g:1751:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
            	    {
            	    // Gcomponent.g:1751:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
            	    // Gcomponent.g:1752:4: a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
            	    {
            	    a1=(Token)match(input,29,FOLLOW_29_in_parse_genericity_language_gcomponent_flowcontrol_Xor1533); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_1_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[125]);
            	    			}

            	    // Gcomponent.g:1766:4: (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
            	    // Gcomponent.g:1767:5: a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_parse_genericity_language_gcomponent_flowcontrol_Xor1559);
            	    a2_0=parse_genericity_language_gcomponent_flowcontrol_XorCond();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[126]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[127]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[128]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[129]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_genericity_language_gcomponent_flowcontrol_Xor_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_Xor"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_XorCond"
    // Gcomponent.g:1803:1: parse_genericity_language_gcomponent_flowcontrol_XorCond returns [genericity.language.gcomponent.flowcontrol.XorCond element = null] : (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) ;
    public final genericity.language.gcomponent.flowcontrol.XorCond parse_genericity_language_gcomponent_flowcontrol_XorCond() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.XorCond element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_XorCond_StartIndex = input.index();

        Token a1=null;
        genericity.language.gcomponent.flowcontrol.BooleanValue a0_0 =null;

        genericity.language.gcomponent.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Gcomponent.g:1806:2: ( (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )
            // Gcomponent.g:1807:2: (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            {
            // Gcomponent.g:1807:2: (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue )
            // Gcomponent.g:1808:3: a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_BooleanValue_in_parse_genericity_language_gcomponent_flowcontrol_XorCond1619);
            a0_0=parse_genericity_language_gcomponent_flowcontrol_BooleanValue();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[130]);
            	}

            a1=(Token)match(input,14,FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_XorCond1637); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[131]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[132]);
            	}

            // Gcomponent.g:1848:2: (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            // Gcomponent.g:1849:3: a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_XorCond1655);
            a2_0=parse_genericity_language_gcomponent_flowcontrol_CompositionStep();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[133]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[134]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_genericity_language_gcomponent_flowcontrol_XorCond_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_XorCond"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_Apply"
    // Gcomponent.g:1877:1: parse_genericity_language_gcomponent_flowcontrol_Apply returns [genericity.language.gcomponent.flowcontrol.Apply element = null] : a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a12= ')' ;
    public final genericity.language.gcomponent.flowcontrol.Apply parse_genericity_language_gcomponent_flowcontrol_Apply() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.Apply element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_Apply_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        genericity.language.gcomponent.flowcontrol.ApplyParameter a3_0 =null;

        genericity.language.gcomponent.flowcontrol.ApplyParameter a5_0 =null;

        genericity.language.gcomponent.flowcontrol.ApplyParameter a9_0 =null;

        genericity.language.gcomponent.flowcontrol.ApplyParameter a11_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Gcomponent.g:1880:2: (a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a12= ')' )
            // Gcomponent.g:1881:2: a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a12= ')'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_genericity_language_gcomponent_flowcontrol_Apply1688); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[135]);
            	}

            // Gcomponent.g:1895:2: (a1= TEXT )
            // Gcomponent.g:1896:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_Apply1706); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[136]);
            	}

            a2=(Token)match(input,9,FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply1727); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[137]);
            	}

            // Gcomponent.g:1949:2: (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            // Gcomponent.g:1950:3: a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1745);
            a3_0=parse_genericity_language_gcomponent_flowcontrol_ApplyParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[138]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[139]);
            	}

            // Gcomponent.g:1976:2: ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Gcomponent.g:1977:3: (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    {
            	    // Gcomponent.g:1977:3: (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    // Gcomponent.g:1978:4: a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    {
            	    a4=(Token)match(input,12,FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply1772); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[140]);
            	    			}

            	    // Gcomponent.g:1992:4: (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    // Gcomponent.g:1993:5: a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1798);
            	    a5_0=parse_genericity_language_gcomponent_flowcontrol_ApplyParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[141]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[142]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[143]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[144]);
            	}

            a6=(Token)match(input,10,FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply1839); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[145]);
            	}

            a7=(Token)match(input,14,FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_Apply1853); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[146]);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply1867); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[147]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[148]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[149]);
            	}

            // Gcomponent.g:2071:2: ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TEXT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Gcomponent.g:2072:3: (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
                    {
                    // Gcomponent.g:2072:3: (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
                    // Gcomponent.g:2073:4: a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1890);
                    a9_0=parse_genericity_language_gcomponent_flowcontrol_ApplyParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[150]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[151]);
            	}

            // Gcomponent.g:2100:2: ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Gcomponent.g:2101:3: (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    {
            	    // Gcomponent.g:2101:3: (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    // Gcomponent.g:2102:4: a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    {
            	    a10=(Token)match(input,12,FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply1925); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_9_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[152]);
            	    			}

            	    // Gcomponent.g:2116:4: (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    // Gcomponent.g:2117:5: a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1951);
            	    a11_0=parse_genericity_language_gcomponent_flowcontrol_ApplyParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[153]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[154]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[155]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[156]);
            	}

            a12=(Token)match(input,10,FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply1992); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[157]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[158]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_genericity_language_gcomponent_flowcontrol_Apply_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_Apply"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_ApplyParameter"
    // Gcomponent.g:2168:1: parse_genericity_language_gcomponent_flowcontrol_ApplyParameter returns [genericity.language.gcomponent.flowcontrol.ApplyParameter element = null] : (a0= TEXT ) a1= ':' (a2= TEXT ) a3= '(' (a4= TEXT ) a5= ')' ;
    public final genericity.language.gcomponent.flowcontrol.ApplyParameter parse_genericity_language_gcomponent_flowcontrol_ApplyParameter() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.ApplyParameter element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Gcomponent.g:2171:2: ( (a0= TEXT ) a1= ':' (a2= TEXT ) a3= '(' (a4= TEXT ) a5= ')' )
            // Gcomponent.g:2172:2: (a0= TEXT ) a1= ':' (a2= TEXT ) a3= '(' (a4= TEXT ) a5= ')'
            {
            // Gcomponent.g:2172:2: (a0= TEXT )
            // Gcomponent.g:2173:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2025); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[159]);
            	}

            a1=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2046); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[160]);
            	}

            // Gcomponent.g:2222:2: (a2= TEXT )
            // Gcomponent.g:2223:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2064); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[161]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2085); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[162]);
            	}

            // Gcomponent.g:2272:2: (a4= TEXT )
            // Gcomponent.g:2273:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2103); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[163]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2124); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[164]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[165]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_ApplyParameter"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_FeatureRef"
    // Gcomponent.g:2325:1: parse_genericity_language_gcomponent_flowcontrol_FeatureRef returns [genericity.language.gcomponent.flowcontrol.FeatureRef element = null] : (a0= TEXT ) ;
    public final genericity.language.gcomponent.flowcontrol.FeatureRef parse_genericity_language_gcomponent_flowcontrol_FeatureRef() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.FeatureRef element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_FeatureRef_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Gcomponent.g:2328:2: ( (a0= TEXT ) )
            // Gcomponent.g:2329:2: (a0= TEXT )
            {
            // Gcomponent.g:2329:2: (a0= TEXT )
            // Gcomponent.g:2330:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_FeatureRef2157); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[166]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_genericity_language_gcomponent_flowcontrol_FeatureRef_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_FeatureRef"



    // $ANTLR start "parse_genericity_language_gcomponent_core_Component"
    // Gcomponent.g:2371:1: parse_genericity_language_gcomponent_core_Component returns [genericity.language.gcomponent.core.Component element = null] : (c0= parse_genericity_language_gcomponent_core_TransformationComponent |c1= parse_genericity_language_gcomponent_core_CompositeComponent );
    public final genericity.language.gcomponent.core.Component parse_genericity_language_gcomponent_core_Component() throws RecognitionException {
        genericity.language.gcomponent.core.Component element =  null;

        int parse_genericity_language_gcomponent_core_Component_StartIndex = input.index();

        genericity.language.gcomponent.core.TransformationComponent c0 =null;

        genericity.language.gcomponent.core.CompositeComponent c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Gcomponent.g:2372:2: (c0= parse_genericity_language_gcomponent_core_TransformationComponent |c1= parse_genericity_language_gcomponent_core_CompositeComponent )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==20) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Gcomponent.g:2373:2: c0= parse_genericity_language_gcomponent_core_TransformationComponent
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_TransformationComponent_in_parse_genericity_language_gcomponent_core_Component2189);
                    c0=parse_genericity_language_gcomponent_core_TransformationComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Gcomponent.g:2374:4: c1= parse_genericity_language_gcomponent_core_CompositeComponent
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_CompositeComponent_in_parse_genericity_language_gcomponent_core_Component2199);
                    c1=parse_genericity_language_gcomponent_core_CompositeComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_genericity_language_gcomponent_core_Component_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_Component"



    // $ANTLR start "parse_genericity_language_gcomponent_variants_Parameter"
    // Gcomponent.g:2378:1: parse_genericity_language_gcomponent_variants_Parameter returns [genericity.language.gcomponent.variants.Parameter element = null] : (c0= parse_genericity_language_gcomponent_variants_SingleFeature |c1= parse_genericity_language_gcomponent_variants_XorFeature );
    public final genericity.language.gcomponent.variants.Parameter parse_genericity_language_gcomponent_variants_Parameter() throws RecognitionException {
        genericity.language.gcomponent.variants.Parameter element =  null;

        int parse_genericity_language_gcomponent_variants_Parameter_StartIndex = input.index();

        genericity.language.gcomponent.variants.SingleFeature c0 =null;

        genericity.language.gcomponent.variants.XorFeature c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Gcomponent.g:2379:2: (c0= parse_genericity_language_gcomponent_variants_SingleFeature |c1= parse_genericity_language_gcomponent_variants_XorFeature )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            else if ( (LA17_0==11) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // Gcomponent.g:2380:2: c0= parse_genericity_language_gcomponent_variants_SingleFeature
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_SingleFeature_in_parse_genericity_language_gcomponent_variants_Parameter2220);
                    c0=parse_genericity_language_gcomponent_variants_SingleFeature();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Gcomponent.g:2381:4: c1= parse_genericity_language_gcomponent_variants_XorFeature
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_XorFeature_in_parse_genericity_language_gcomponent_variants_Parameter2230);
                    c1=parse_genericity_language_gcomponent_variants_XorFeature();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_genericity_language_gcomponent_variants_Parameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_variants_Parameter"



    // $ANTLR start "parse_genericity_language_gcomponent_core_Template"
    // Gcomponent.g:2385:1: parse_genericity_language_gcomponent_core_Template returns [genericity.language.gcomponent.core.Template element = null] : c0= parse_genericity_language_gcomponent_core_AtlTemplate ;
    public final genericity.language.gcomponent.core.Template parse_genericity_language_gcomponent_core_Template() throws RecognitionException {
        genericity.language.gcomponent.core.Template element =  null;

        int parse_genericity_language_gcomponent_core_Template_StartIndex = input.index();

        genericity.language.gcomponent.core.AtlTemplate c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Gcomponent.g:2386:2: (c0= parse_genericity_language_gcomponent_core_AtlTemplate )
            // Gcomponent.g:2387:2: c0= parse_genericity_language_gcomponent_core_AtlTemplate
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_AtlTemplate_in_parse_genericity_language_gcomponent_core_Template2251);
            c0=parse_genericity_language_gcomponent_core_AtlTemplate();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_genericity_language_gcomponent_core_Template_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_Template"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_CompositionStep"
    // Gcomponent.g:2391:1: parse_genericity_language_gcomponent_flowcontrol_CompositionStep returns [genericity.language.gcomponent.flowcontrol.CompositionStep element = null] : (c0= parse_genericity_language_gcomponent_flowcontrol_Xor |c1= parse_genericity_language_gcomponent_flowcontrol_Apply );
    public final genericity.language.gcomponent.flowcontrol.CompositionStep parse_genericity_language_gcomponent_flowcontrol_CompositionStep() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.CompositionStep element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_CompositionStep_StartIndex = input.index();

        genericity.language.gcomponent.flowcontrol.Xor c0 =null;

        genericity.language.gcomponent.flowcontrol.Apply c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Gcomponent.g:2392:2: (c0= parse_genericity_language_gcomponent_flowcontrol_Xor |c1= parse_genericity_language_gcomponent_flowcontrol_Apply )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==16) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Gcomponent.g:2393:2: c0= parse_genericity_language_gcomponent_flowcontrol_Xor
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Xor_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep2272);
                    c0=parse_genericity_language_gcomponent_flowcontrol_Xor();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Gcomponent.g:2394:4: c1= parse_genericity_language_gcomponent_flowcontrol_Apply
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Apply_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep2282);
                    c1=parse_genericity_language_gcomponent_flowcontrol_Apply();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_genericity_language_gcomponent_flowcontrol_CompositionStep_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_CompositionStep"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_BooleanValue"
    // Gcomponent.g:2398:1: parse_genericity_language_gcomponent_flowcontrol_BooleanValue returns [genericity.language.gcomponent.flowcontrol.BooleanValue element = null] : c0= parse_genericity_language_gcomponent_flowcontrol_FeatureRef ;
    public final genericity.language.gcomponent.flowcontrol.BooleanValue parse_genericity_language_gcomponent_flowcontrol_BooleanValue() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.BooleanValue element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_BooleanValue_StartIndex = input.index();

        genericity.language.gcomponent.flowcontrol.FeatureRef c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Gcomponent.g:2399:2: (c0= parse_genericity_language_gcomponent_flowcontrol_FeatureRef )
            // Gcomponent.g:2400:2: c0= parse_genericity_language_gcomponent_flowcontrol_FeatureRef
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_FeatureRef_in_parse_genericity_language_gcomponent_flowcontrol_BooleanValue2303);
            c0=parse_genericity_language_gcomponent_flowcontrol_FeatureRef();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_genericity_language_gcomponent_flowcontrol_BooleanValue_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_BooleanValue"

    // $ANTLR start synpred12_Gcomponent
    public final void synpred12_Gcomponent_fragment() throws RecognitionException {
        Token a1=null;
        genericity.language.gcomponent.flowcontrol.XorCond a2_0 =null;


        // Gcomponent.g:1751:3: ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )
        // Gcomponent.g:1751:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
        {
        // Gcomponent.g:1751:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
        // Gcomponent.g:1752:4: a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
        {
        a1=(Token)match(input,29,FOLLOW_29_in_synpred12_Gcomponent1533); if (state.failed) return ;

        // Gcomponent.g:1766:4: (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
        // Gcomponent.g:1767:5: a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond
        {
        pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_synpred12_Gcomponent1559);
        a2_0=parse_genericity_language_gcomponent_flowcontrol_XorCond();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred12_Gcomponent

    // Delegated rules

    public final boolean synpred12_Gcomponent() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Gcomponent_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_dsl_DefinitionRoot_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Component_in_parse_genericity_language_gcomponent_dsl_DefinitionRoot119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_genericity_language_gcomponent_core_TransformationComponent152 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_genericity_language_gcomponent_core_TransformationComponent166 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_TransformationComponent184 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_genericity_language_gcomponent_core_TransformationComponent205 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_genericity_language_gcomponent_core_TransformationComponent228 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent254 = new BitSet(new long[]{0x0000000012C00000L});
    public static final BitSet FOLLOW_25_in_parse_genericity_language_gcomponent_core_TransformationComponent304 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent330 = new BitSet(new long[]{0x0000000012400000L});
    public static final BitSet FOLLOW_28_in_parse_genericity_language_gcomponent_core_TransformationComponent380 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_TransformationComponent421 = new BitSet(new long[]{0x0000000000402800L});
    public static final BitSet FOLLOW_22_in_parse_genericity_language_gcomponent_core_TransformationComponent495 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Template_in_parse_genericity_language_gcomponent_core_TransformationComponent513 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_genericity_language_gcomponent_core_TransformationComponent531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_genericity_language_gcomponent_core_Concept560 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Concept578 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept599 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_Concept617 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_parse_genericity_language_gcomponent_core_Concept647 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept667 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Tag_in_parse_genericity_language_gcomponent_core_Concept700 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Tag772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_genericity_language_gcomponent_core_AtlTemplate808 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_AtlTemplate826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_genericity_language_gcomponent_variants_SingleFeature862 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_SingleFeature880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_genericity_language_gcomponent_variants_XorFeature916 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_XorFeature934 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_genericity_language_gcomponent_variants_XorFeature955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_genericity_language_gcomponent_core_CompositeComponent984 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_genericity_language_gcomponent_core_CompositeComponent998 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_CompositeComponent1016 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_genericity_language_gcomponent_core_CompositeComponent1037 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_genericity_language_gcomponent_core_CompositeComponent1060 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_CompositeComponent1086 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_23_in_parse_genericity_language_gcomponent_core_CompositeComponent1141 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1167 = new BitSet(new long[]{0x0000000012880000L});
    public static final BitSet FOLLOW_25_in_parse_genericity_language_gcomponent_core_CompositeComponent1217 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1243 = new BitSet(new long[]{0x0000000012080000L});
    public static final BitSet FOLLOW_28_in_parse_genericity_language_gcomponent_core_CompositeComponent1293 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_CompositeComponent1334 = new BitSet(new long[]{0x0000000000082800L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Composition_in_parse_genericity_language_gcomponent_core_CompositeComponent1412 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_genericity_language_gcomponent_core_CompositeComponent1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_genericity_language_gcomponent_flowcontrol_Composition1459 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Composition1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_genericity_language_gcomponent_flowcontrol_Xor1510 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_genericity_language_gcomponent_flowcontrol_Xor1533 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_parse_genericity_language_gcomponent_flowcontrol_Xor1559 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_BooleanValue_in_parse_genericity_language_gcomponent_flowcontrol_XorCond1619 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_XorCond1637 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_XorCond1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_genericity_language_gcomponent_flowcontrol_Apply1688 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_Apply1706 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply1727 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1745 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply1772 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1798 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply1839 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_Apply1853 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply1867 = new BitSet(new long[]{0x0000000000001480L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1890 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply1925 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply1951 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2025 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2046 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2064 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2085 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2103 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_FeatureRef2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_TransformationComponent_in_parse_genericity_language_gcomponent_core_Component2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_CompositeComponent_in_parse_genericity_language_gcomponent_core_Component2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_SingleFeature_in_parse_genericity_language_gcomponent_variants_Parameter2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_XorFeature_in_parse_genericity_language_gcomponent_variants_Parameter2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_AtlTemplate_in_parse_genericity_language_gcomponent_core_Template2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Xor_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Apply_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_FeatureRef_in_parse_genericity_language_gcomponent_flowcontrol_BooleanValue2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred12_Gcomponent1533 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_synpred12_Gcomponent1559 = new BitSet(new long[]{0x0000000000000002L});

}