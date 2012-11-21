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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LINEBREAK", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "'+'", "','", "'-'", "'->'", "':'", "'::'", "'='", "'['", "']'", "'apply'", "'atl'", "'binding'", "'component'", "'compose'", "'composite'", "'concept'", "'definition'", "'java'", "'model'", "'seq'", "'source'", "'tags'", "'target'", "'transformation'", "'uses'", "'variants'", "'when'", "'with'", "'xor'", "'{'", "'}'"
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
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
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
        this.state.initializeRuleMemo(49 + 1);
         

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
    			if (type.getInstanceClass() == genericity.language.gcomponent.core.ParameterModel.class) {
    				return parse_genericity_language_gcomponent_core_ParameterModel();
    			}
    			if (type.getInstanceClass() == genericity.language.gcomponent.core.Tag.class) {
    				return parse_genericity_language_gcomponent_core_Tag();
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
    			if (type.getInstanceClass() == genericity.language.gcomponent.core.BindingDeclaration.class) {
    				return parse_genericity_language_gcomponent_core_BindingDeclaration();
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
    			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.Seq.class) {
    				return parse_genericity_language_gcomponent_flowcontrol_Seq();
    			}
    			if (type.getInstanceClass() == genericity.language.gcomponent.flowcontrol.FeatureRef.class) {
    				return parse_genericity_language_gcomponent_flowcontrol_FeatureRef();
    			}
    			if (type.getInstanceClass() == genericity.language.gcomponent.technologies.AtlTemplate.class) {
    				return parse_genericity_language_gcomponent_technologies_AtlTemplate();
    			}
    			if (type.getInstanceClass() == genericity.language.gcomponent.technologies.AtlParameter.class) {
    				return parse_genericity_language_gcomponent_technologies_AtlParameter();
    			}
    			if (type.getInstanceClass() == genericity.language.gcomponent.technologies.JavaTemplate.class) {
    				return parse_genericity_language_gcomponent_technologies_JavaTemplate();
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
    		int followSetID = 133;
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
    // Gcomponent.g:553:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        genericity.language.gcomponent.dsl.DefinitionRoot c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Gcomponent.g:554:2: ( (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot ) EOF )
            // Gcomponent.g:555:2: (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[1]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Gcomponent.g:561:2: (c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot )
            // Gcomponent.g:562:3: c0= parse_genericity_language_gcomponent_dsl_DefinitionRoot
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
    // Gcomponent.g:570:1: parse_genericity_language_gcomponent_dsl_DefinitionRoot returns [genericity.language.gcomponent.dsl.DefinitionRoot element = null] : (a0_0= parse_genericity_language_gcomponent_core_Component ) ;
    public final genericity.language.gcomponent.dsl.DefinitionRoot parse_genericity_language_gcomponent_dsl_DefinitionRoot() throws RecognitionException {
        genericity.language.gcomponent.dsl.DefinitionRoot element =  null;

        int parse_genericity_language_gcomponent_dsl_DefinitionRoot_StartIndex = input.index();

        genericity.language.gcomponent.core.Component a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Gcomponent.g:573:2: ( (a0_0= parse_genericity_language_gcomponent_core_Component ) )
            // Gcomponent.g:574:2: (a0_0= parse_genericity_language_gcomponent_core_Component )
            {
            // Gcomponent.g:574:2: (a0_0= parse_genericity_language_gcomponent_core_Component )
            // Gcomponent.g:575:3: a0_0= parse_genericity_language_gcomponent_core_Component
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
    // Gcomponent.g:601:1: parse_genericity_language_gcomponent_core_TransformationComponent returns [genericity.language.gcomponent.core.TransformationComponent element = null] : a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ) )+ ( (a12= 'variants' ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_genericity_language_gcomponent_core_Template ) a16= '}' ;
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
        Token a14=null;
        Token a16=null;
        genericity.language.gcomponent.core.Concept a5_0 =null;

        genericity.language.gcomponent.core.Concept a7_0 =null;

        genericity.language.gcomponent.core.ParameterModel a9_0 =null;

        genericity.language.gcomponent.core.ParameterModel a11_0 =null;

        genericity.language.gcomponent.variants.Parameter a13_0 =null;

        genericity.language.gcomponent.core.Template a15_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Gcomponent.g:604:2: (a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ) )+ ( (a12= 'variants' ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_genericity_language_gcomponent_core_Template ) a16= '}' )
            // Gcomponent.g:605:2: a0= 'transformation' a1= 'component' (a2= TEXT ) a3= '{' ( ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ) )+ ( (a12= 'variants' ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_genericity_language_gcomponent_core_Template ) a16= '}'
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_genericity_language_gcomponent_core_TransformationComponent152); if (state.failed) return element;

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

            a1=(Token)match(input,23,FOLLOW_23_in_parse_genericity_language_gcomponent_core_TransformationComponent166); if (state.failed) return element;

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

            // Gcomponent.g:633:2: (a2= TEXT )
            // Gcomponent.g:634:3: a2= TEXT
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

            a3=(Token)match(input,40,FOLLOW_40_in_parse_genericity_language_gcomponent_core_TransformationComponent205); if (state.failed) return element;

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

            // Gcomponent.g:683:2: ( ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Gcomponent.g:684:3: ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) )
            	    {
            	    // Gcomponent.g:684:3: ( (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) )
            	    // Gcomponent.g:685:4: (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) ) (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) )
            	    {
            	    // Gcomponent.g:685:4: (a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:686:5: a4= 'source' (a5_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a4=(Token)match(input,31,FOLLOW_31_in_parse_genericity_language_gcomponent_core_TransformationComponent234); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_0_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[6]);
            	    				}

            	    // Gcomponent.g:700:5: (a5_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:701:6: a5_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent264);
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
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_0_0_0_1, a5_0, true);
            	    							copyLocalizationInfos(a5_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[7]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[8]);
            	    			}

            	    // Gcomponent.g:732:4: (a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:733:5: a6= 'target' (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a6=(Token)match(input,33,FOLLOW_33_in_parse_genericity_language_gcomponent_core_TransformationComponent316); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_1_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[9]);
            	    				}

            	    // Gcomponent.g:747:5: (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:748:6: a7_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent346);
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
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_1_0_0_1, a7_0, true);
            	    							copyLocalizationInfos(a7_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[10]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[11]);
            	    			}

            	    // Gcomponent.g:779:4: (a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel ) )
            	    // Gcomponent.g:780:5: a8= 'source' (a9_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    {
            	    a8=(Token)match(input,31,FOLLOW_31_in_parse_genericity_language_gcomponent_core_TransformationComponent398); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_2_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[12]);
            	    				}

            	    // Gcomponent.g:794:5: (a9_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    // Gcomponent.g:795:6: a9_0= parse_genericity_language_gcomponent_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_TransformationComponent428);
            	    a9_0=parse_genericity_language_gcomponent_core_ParameterModel();

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
            	    								addObjectToList(element, genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE_MODELS, value);
            	    								completedElement(value, true);
            	    							}
            	    							collectHiddenTokens(element);
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_2_0_0_1, a9_0, true);
            	    							copyLocalizationInfos(a9_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[13]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[14]);
            	    			}

            	    // Gcomponent.g:826:4: (a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) )
            	    // Gcomponent.g:827:5: a10= 'target' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    {
            	    a10=(Token)match(input,33,FOLLOW_33_in_parse_genericity_language_gcomponent_core_TransformationComponent480); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_3_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[15]);
            	    				}

            	    // Gcomponent.g:841:5: (a11_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    // Gcomponent.g:842:6: a11_0= parse_genericity_language_gcomponent_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_TransformationComponent510);
            	    a11_0=parse_genericity_language_gcomponent_core_ParameterModel();

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
            	    								addObjectToList(element, genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET_MODELS, value);
            	    								completedElement(value, true);
            	    							}
            	    							collectHiddenTokens(element);
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_4_0_0_3_0_0_1, a11_0, true);
            	    							copyLocalizationInfos(a11_0, element);
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


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[19]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[20]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[21]);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[24]);
            	}

            // Gcomponent.g:886:2: ( (a12= 'variants' ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Gcomponent.g:887:3: (a12= 'variants' ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    {
                    // Gcomponent.g:887:3: (a12= 'variants' ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    // Gcomponent.g:888:4: a12= 'variants' ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
                    {
                    a12=(Token)match(input,36,FOLLOW_36_in_parse_genericity_language_gcomponent_core_TransformationComponent578); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[25]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[26]);
                    			}

                    // Gcomponent.g:903:4: ( ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==11||LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Gcomponent.g:904:5: ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    {
                    	    // Gcomponent.g:904:5: ( (a13_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    // Gcomponent.g:905:6: (a13_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    {
                    	    // Gcomponent.g:905:6: (a13_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    // Gcomponent.g:906:7: a13_0= parse_genericity_language_gcomponent_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_TransformationComponent619);
                    	    a13_0=parse_genericity_language_gcomponent_variants_Parameter();

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
                    	    							if (a13_0 != null) {
                    	    								if (a13_0 != null) {
                    	    									Object value = a13_0;
                    	    									addObjectToList(element, genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_5_0_0_1_0_0_0, a13_0, true);
                    	    								copyLocalizationInfos(a13_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[27]);
                    	    						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[28]);
                    	    						addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[29]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[30]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[31]);
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[32]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[33]);
            	}

            a14=(Token)match(input,27,FOLLOW_27_in_parse_genericity_language_gcomponent_core_TransformationComponent693); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[35]);
            	}

            // Gcomponent.g:964:2: (a15_0= parse_genericity_language_gcomponent_core_Template )
            // Gcomponent.g:965:3: a15_0= parse_genericity_language_gcomponent_core_Template
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Template_in_parse_genericity_language_gcomponent_core_TransformationComponent711);
            a15_0=parse_genericity_language_gcomponent_core_Template();

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
            			if (a15_0 != null) {
            				if (a15_0 != null) {
            					Object value = a15_0;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_7, a15_0, true);
            				copyLocalizationInfos(a15_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[36]);
            	}

            a16=(Token)match(input,41,FOLLOW_41_in_parse_genericity_language_gcomponent_core_TransformationComponent729); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_1_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
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
    // Gcomponent.g:1005:1: parse_genericity_language_gcomponent_core_Concept returns [genericity.language.gcomponent.core.Concept element = null] : a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )? ;
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

            // Gcomponent.g:1008:2: (a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )? )
            // Gcomponent.g:1009:2: a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )?
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_genericity_language_gcomponent_core_Concept758); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[37]);
            	}

            // Gcomponent.g:1023:2: (a1= TEXT )
            // Gcomponent.g:1024:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Concept776); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[38]);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept797); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[39]);
            	}

            // Gcomponent.g:1073:2: (a3= QUOTED_34_34 )
            // Gcomponent.g:1074:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_Concept815); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[40]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[41]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[42]);
            	}

            // Gcomponent.g:1111:2: ( (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Gcomponent.g:1112:3: (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ )
                    {
                    // Gcomponent.g:1112:3: (a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+ )
                    // Gcomponent.g:1113:4: a4= 'tags' a5= ':' ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+
                    {
                    a4=(Token)match(input,32,FOLLOW_32_in_parse_genericity_language_gcomponent_core_Concept845); if (state.failed) return element;

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
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[43]);
                    			}

                    a5=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept865); if (state.failed) return element;

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
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[44]);
                    			}

                    // Gcomponent.g:1141:4: ( (a6_0= parse_genericity_language_gcomponent_core_Tag ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==TEXT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Gcomponent.g:1142:5: (a6_0= parse_genericity_language_gcomponent_core_Tag )
                    	    {
                    	    // Gcomponent.g:1142:5: (a6_0= parse_genericity_language_gcomponent_core_Tag )
                    	    // Gcomponent.g:1143:6: a6_0= parse_genericity_language_gcomponent_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Tag_in_parse_genericity_language_gcomponent_core_Concept898);
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
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[45]);
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[46]);
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[47]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[48]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[49]);
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



    // $ANTLR start "parse_genericity_language_gcomponent_core_ParameterModel"
    // Gcomponent.g:1181:1: parse_genericity_language_gcomponent_core_ParameterModel returns [genericity.language.gcomponent.core.ParameterModel element = null] : a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? ;
    public final genericity.language.gcomponent.core.ParameterModel parse_genericity_language_gcomponent_core_ParameterModel() throws RecognitionException {
        genericity.language.gcomponent.core.ParameterModel element =  null;

        int parse_genericity_language_gcomponent_core_ParameterModel_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Gcomponent.g:1184:2: (a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? )
            // Gcomponent.g:1185:2: a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_genericity_language_gcomponent_core_ParameterModel966); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[50]);
            	}

            // Gcomponent.g:1199:2: (a1= TEXT )
            // Gcomponent.g:1200:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_ParameterModel984); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[51]);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_core_ParameterModel1005); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[52]);
            	}

            // Gcomponent.g:1249:2: (a3= TEXT )
            // Gcomponent.g:1250:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_ParameterModel1023); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__TYPE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				genericity.language.gcomponent.core.Concept proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.core.ParameterModel, genericity.language.gcomponent.core.Concept>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterModelTypeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__TYPE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__TYPE, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[53]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[54]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[55]);
            	}

            // Gcomponent.g:1291:2: ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Gcomponent.g:1292:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    {
                    // Gcomponent.g:1292:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    // Gcomponent.g:1293:4: a4= '=' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,17,FOLLOW_17_in_parse_genericity_language_gcomponent_core_ParameterModel1053); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[56]);
                    			}

                    // Gcomponent.g:1307:4: (a5= QUOTED_34_34 )
                    // Gcomponent.g:1308:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_ParameterModel1079); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
                    						startIncompleteElement(element);
                    					}
                    					if (a5 != null) {
                    						genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                    						tokenResolver.setOptions(getOptions());
                    						genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__RESOURCE_NAME), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__RESOURCE_NAME), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_3_0_0_4_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[57]);
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[58]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[59]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[60]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_genericity_language_gcomponent_core_ParameterModel_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_ParameterModel"



    // $ANTLR start "parse_genericity_language_gcomponent_core_Tag"
    // Gcomponent.g:1354:1: parse_genericity_language_gcomponent_core_Tag returns [genericity.language.gcomponent.core.Tag element = null] : (a0= TEXT ) ;
    public final genericity.language.gcomponent.core.Tag parse_genericity_language_gcomponent_core_Tag() throws RecognitionException {
        genericity.language.gcomponent.core.Tag element =  null;

        int parse_genericity_language_gcomponent_core_Tag_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Gcomponent.g:1357:2: ( (a0= TEXT ) )
            // Gcomponent.g:1358:2: (a0= TEXT )
            {
            // Gcomponent.g:1358:2: (a0= TEXT )
            // Gcomponent.g:1359:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Tag1144); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_4_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[61]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[63]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_genericity_language_gcomponent_core_Tag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_Tag"



    // $ANTLR start "parse_genericity_language_gcomponent_variants_SingleFeature"
    // Gcomponent.g:1398:1: parse_genericity_language_gcomponent_variants_SingleFeature returns [genericity.language.gcomponent.variants.SingleFeature element = null] : a0= '-' (a1= TEXT ) ;
    public final genericity.language.gcomponent.variants.SingleFeature parse_genericity_language_gcomponent_variants_SingleFeature() throws RecognitionException {
        genericity.language.gcomponent.variants.SingleFeature element =  null;

        int parse_genericity_language_gcomponent_variants_SingleFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Gcomponent.g:1401:2: (a0= '-' (a1= TEXT ) )
            // Gcomponent.g:1402:2: a0= '-' (a1= TEXT )
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_genericity_language_gcomponent_variants_SingleFeature1180); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[64]);
            	}

            // Gcomponent.g:1416:2: (a1= TEXT )
            // Gcomponent.g:1417:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_SingleFeature1198); if (state.failed) return element;

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
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[65]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[66]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[67]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[68]);
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
    // Gcomponent.g:1457:1: parse_genericity_language_gcomponent_variants_XorFeature returns [genericity.language.gcomponent.variants.XorFeature element = null] : a0= '+' (a1= TEXT ) a2= 'xor' ;
    public final genericity.language.gcomponent.variants.XorFeature parse_genericity_language_gcomponent_variants_XorFeature() throws RecognitionException {
        genericity.language.gcomponent.variants.XorFeature element =  null;

        int parse_genericity_language_gcomponent_variants_XorFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Gcomponent.g:1460:2: (a0= '+' (a1= TEXT ) a2= 'xor' )
            // Gcomponent.g:1461:2: a0= '+' (a1= TEXT ) a2= 'xor'
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_genericity_language_gcomponent_variants_XorFeature1234); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[69]);
            	}

            // Gcomponent.g:1475:2: (a1= TEXT )
            // Gcomponent.g:1476:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_XorFeature1252); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[70]);
            	}

            a2=(Token)match(input,39,FOLLOW_39_in_parse_genericity_language_gcomponent_variants_XorFeature1273); if (state.failed) return element;

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
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[71]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[72]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[73]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[74]);
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
    // Gcomponent.g:1530:1: parse_genericity_language_gcomponent_core_CompositeComponent returns [genericity.language.gcomponent.core.CompositeComponent element = null] : a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )? ) )+ ( (a15= 'variants' ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? (a17_0= parse_genericity_language_gcomponent_flowcontrol_Composition ) a18= '}' ;
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
        Token a12=null;
        Token a15=null;
        Token a18=null;
        genericity.language.gcomponent.core.Concept a7_0 =null;

        genericity.language.gcomponent.core.Concept a9_0 =null;

        genericity.language.gcomponent.core.ParameterModel a11_0 =null;

        genericity.language.gcomponent.core.ParameterModel a13_0 =null;

        genericity.language.gcomponent.core.BindingDeclaration a14_0 =null;

        genericity.language.gcomponent.variants.Parameter a16_0 =null;

        genericity.language.gcomponent.flowcontrol.Composition a17_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Gcomponent.g:1533:2: (a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )? ) )+ ( (a15= 'variants' ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? (a17_0= parse_genericity_language_gcomponent_flowcontrol_Composition ) a18= '}' )
            // Gcomponent.g:1534:2: a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )? ) )+ ( (a15= 'variants' ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )? (a17_0= parse_genericity_language_gcomponent_flowcontrol_Composition ) a18= '}'
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_genericity_language_gcomponent_core_CompositeComponent1302); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[75]);
            	}

            a1=(Token)match(input,23,FOLLOW_23_in_parse_genericity_language_gcomponent_core_CompositeComponent1316); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[76]);
            	}

            // Gcomponent.g:1562:2: (a2= TEXT )
            // Gcomponent.g:1563:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_CompositeComponent1334); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[77]);
            	}

            a3=(Token)match(input,40,FOLLOW_40_in_parse_genericity_language_gcomponent_core_CompositeComponent1355); if (state.failed) return element;

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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[78]);
            	}

            // Gcomponent.g:1612:2: ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Gcomponent.g:1613:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    {
            	    // Gcomponent.g:1613:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    // Gcomponent.g:1614:4: a4= 'uses' (a5= QUOTED_34_34 )
            	    {
            	    a4=(Token)match(input,35,FOLLOW_35_in_parse_genericity_language_gcomponent_core_CompositeComponent1378); if (state.failed) return element;

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
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[79]);
            	    			}

            	    // Gcomponent.g:1628:4: (a5= QUOTED_34_34 )
            	    // Gcomponent.g:1629:5: a5= QUOTED_34_34
            	    {
            	    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_CompositeComponent1404); if (state.failed) return element;

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
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[80]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[81]);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[82]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[83]);
            	}

            // Gcomponent.g:1677:2: ( ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )? ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Gcomponent.g:1678:3: ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )? )
            	    {
            	    // Gcomponent.g:1678:3: ( (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )? )
            	    // Gcomponent.g:1679:4: (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) ) (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) ) (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) ) ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )?
            	    {
            	    // Gcomponent.g:1679:4: (a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:1680:5: a6= 'source' (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a6=(Token)match(input,31,FOLLOW_31_in_parse_genericity_language_gcomponent_core_CompositeComponent1465); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_0_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[84]);
            	    				}

            	    // Gcomponent.g:1694:5: (a7_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:1695:6: a7_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1495);
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
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_0_0_0_1, a7_0, true);
            	    							copyLocalizationInfos(a7_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[85]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[86]);
            	    			}

            	    // Gcomponent.g:1726:4: (a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept ) )
            	    // Gcomponent.g:1727:5: a8= 'target' (a9_0= parse_genericity_language_gcomponent_core_Concept )
            	    {
            	    a8=(Token)match(input,33,FOLLOW_33_in_parse_genericity_language_gcomponent_core_CompositeComponent1547); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_1_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[87]);
            	    				}

            	    // Gcomponent.g:1741:5: (a9_0= parse_genericity_language_gcomponent_core_Concept )
            	    // Gcomponent.g:1742:6: a9_0= parse_genericity_language_gcomponent_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1577);
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
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_1_0_0_1, a9_0, true);
            	    							copyLocalizationInfos(a9_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[88]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[89]);
            	    			}

            	    // Gcomponent.g:1773:4: (a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel ) )
            	    // Gcomponent.g:1774:5: a10= 'source' (a11_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    {
            	    a10=(Token)match(input,31,FOLLOW_31_in_parse_genericity_language_gcomponent_core_CompositeComponent1629); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_2_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[90]);
            	    				}

            	    // Gcomponent.g:1788:5: (a11_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    // Gcomponent.g:1789:6: a11_0= parse_genericity_language_gcomponent_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_CompositeComponent1659);
            	    a11_0=parse_genericity_language_gcomponent_core_ParameterModel();

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
            	    								addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__SOURCE_MODELS, value);
            	    								completedElement(value, true);
            	    							}
            	    							collectHiddenTokens(element);
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_2_0_0_1, a11_0, true);
            	    							copyLocalizationInfos(a11_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[91]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[92]);
            	    			}

            	    // Gcomponent.g:1820:4: (a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel ) )
            	    // Gcomponent.g:1821:5: a12= 'target' (a13_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    {
            	    a12=(Token)match(input,33,FOLLOW_33_in_parse_genericity_language_gcomponent_core_CompositeComponent1711); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_3_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[93]);
            	    				}

            	    // Gcomponent.g:1835:5: (a13_0= parse_genericity_language_gcomponent_core_ParameterModel )
            	    // Gcomponent.g:1836:6: a13_0= parse_genericity_language_gcomponent_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_CompositeComponent1741);
            	    a13_0=parse_genericity_language_gcomponent_core_ParameterModel();

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
            	    						if (a13_0 != null) {
            	    							if (a13_0 != null) {
            	    								Object value = a13_0;
            	    								addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__TARGET_MODELS, value);
            	    								completedElement(value, true);
            	    							}
            	    							collectHiddenTokens(element);
            	    							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_3_0_0_1, a13_0, true);
            	    							copyLocalizationInfos(a13_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[94]);
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[95]);
            	    					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[96]);
            	    					addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[97]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[98]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[99]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[100]);
            	    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[101]);
            	    			}

            	    // Gcomponent.g:1873:4: ( ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==22) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // Gcomponent.g:1874:5: ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) )
            	            {
            	            // Gcomponent.g:1874:5: ( (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration ) )
            	            // Gcomponent.g:1875:6: (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration )
            	            {
            	            // Gcomponent.g:1875:6: (a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration )
            	            // Gcomponent.g:1876:7: a14_0= parse_genericity_language_gcomponent_core_BindingDeclaration
            	            {
            	            pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_BindingDeclaration_in_parse_genericity_language_gcomponent_core_CompositeComponent1808);
            	            a14_0=parse_genericity_language_gcomponent_core_BindingDeclaration();

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
            	            							if (a14_0 != null) {
            	            								if (a14_0 != null) {
            	            									Object value = a14_0;
            	            									addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__BINDINGS, value);
            	            									completedElement(value, true);
            	            								}
            	            								collectHiddenTokens(element);
            	            								retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_5_0_0_4_0_0_0, a14_0, true);
            	            								copyLocalizationInfos(a14_0, element);
            	            							}
            	            						}

            	            }


            	            if ( state.backtracking==0 ) {
            	            						// expected elements (follow set)
            	            						addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[102]);
            	            						addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[103]);
            	            						addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[104]);
            	            					}

            	            }


            	            }
            	            break;

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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[108]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[109]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[110]);
            	}

            // Gcomponent.g:1921:2: ( (a15= 'variants' ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Gcomponent.g:1922:3: (a15= 'variants' ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    {
                    // Gcomponent.g:1922:3: (a15= 'variants' ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+ )
                    // Gcomponent.g:1923:4: a15= 'variants' ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
                    {
                    a15=(Token)match(input,36,FOLLOW_36_in_parse_genericity_language_gcomponent_core_CompositeComponent1891); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[111]);
                    				addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[112]);
                    			}

                    // Gcomponent.g:1938:4: ( ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) ) )+
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
                    	    // Gcomponent.g:1939:5: ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    {
                    	    // Gcomponent.g:1939:5: ( (a16_0= parse_genericity_language_gcomponent_variants_Parameter ) )
                    	    // Gcomponent.g:1940:6: (a16_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    {
                    	    // Gcomponent.g:1940:6: (a16_0= parse_genericity_language_gcomponent_variants_Parameter )
                    	    // Gcomponent.g:1941:7: a16_0= parse_genericity_language_gcomponent_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_CompositeComponent1932);
                    	    a16_0=parse_genericity_language_gcomponent_variants_Parameter();

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
                    	    							if (a16_0 != null) {
                    	    								if (a16_0 != null) {
                    	    									Object value = a16_0;
                    	    									addObjectToList(element, genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__FORMAL_PARAMETERS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_6_0_0_1_0_0_0, a16_0, true);
                    	    								copyLocalizationInfos(a16_0, element);
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

            // Gcomponent.g:1984:2: (a17_0= parse_genericity_language_gcomponent_flowcontrol_Composition )
            // Gcomponent.g:1985:3: a17_0= parse_genericity_language_gcomponent_flowcontrol_Composition
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Composition_in_parse_genericity_language_gcomponent_core_CompositeComponent2010);
            a17_0=parse_genericity_language_gcomponent_flowcontrol_Composition();

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
            			if (a17_0 != null) {
            				if (a17_0 != null) {
            					Object value = a17_0;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__COMPOSITION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_7, a17_0, true);
            				copyLocalizationInfos(a17_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[120]);
            	}

            a18=(Token)match(input,41,FOLLOW_41_in_parse_genericity_language_gcomponent_core_CompositeComponent2028); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_7_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
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



    // $ANTLR start "parse_genericity_language_gcomponent_core_BindingDeclaration"
    // Gcomponent.g:2025:1: parse_genericity_language_gcomponent_core_BindingDeclaration returns [genericity.language.gcomponent.core.BindingDeclaration element = null] : a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ;
    public final genericity.language.gcomponent.core.BindingDeclaration parse_genericity_language_gcomponent_core_BindingDeclaration() throws RecognitionException {
        genericity.language.gcomponent.core.BindingDeclaration element =  null;

        int parse_genericity_language_gcomponent_core_BindingDeclaration_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Gcomponent.g:2028:2: (a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) )
            // Gcomponent.g:2029:2: a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_genericity_language_gcomponent_core_BindingDeclaration2057); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[121]);
            	}

            // Gcomponent.g:2043:2: (a1= TEXT )
            // Gcomponent.g:2044:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_BindingDeclaration2075); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[122]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_genericity_language_gcomponent_core_BindingDeclaration2096); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[123]);
            	}

            // Gcomponent.g:2093:2: (a3= QUOTED_34_34 )
            // Gcomponent.g:2094:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_BindingDeclaration2114); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__FILE_NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__FILE_NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_8_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[124]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[125]);
            		addExpectedElement(genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[126]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_genericity_language_gcomponent_core_BindingDeclaration_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_BindingDeclaration"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_Composition"
    // Gcomponent.g:2133:1: parse_genericity_language_gcomponent_flowcontrol_Composition returns [genericity.language.gcomponent.flowcontrol.Composition element = null] : a0= 'compose' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) ;
    public final genericity.language.gcomponent.flowcontrol.Composition parse_genericity_language_gcomponent_flowcontrol_Composition() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.Composition element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_Composition_StartIndex = input.index();

        Token a0=null;
        genericity.language.gcomponent.flowcontrol.CompositionStep a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Gcomponent.g:2136:2: (a0= 'compose' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )
            // Gcomponent.g:2137:2: a0= 'compose' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_genericity_language_gcomponent_flowcontrol_Composition2150); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[127]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[128]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[129]);
            	}

            // Gcomponent.g:2153:2: (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            // Gcomponent.g:2154:3: a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Composition2168);
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
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_9_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[130]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_genericity_language_gcomponent_flowcontrol_Composition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_Composition"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_Xor"
    // Gcomponent.g:2181:1: parse_genericity_language_gcomponent_flowcontrol_Xor returns [genericity.language.gcomponent.flowcontrol.Xor element = null] : a0= 'xor' ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+ ;
    public final genericity.language.gcomponent.flowcontrol.Xor parse_genericity_language_gcomponent_flowcontrol_Xor() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.Xor element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_Xor_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        genericity.language.gcomponent.flowcontrol.XorCond a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Gcomponent.g:2184:2: (a0= 'xor' ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+ )
            // Gcomponent.g:2185:2: a0= 'xor' ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+
            {
            a0=(Token)match(input,39,FOLLOW_39_in_parse_genericity_language_gcomponent_flowcontrol_Xor2201); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[131]);
            	}

            // Gcomponent.g:2199:2: ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred12_Gcomponent()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // Gcomponent.g:2200:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
            	    {
            	    // Gcomponent.g:2200:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
            	    // Gcomponent.g:2201:4: a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
            	    {
            	    a1=(Token)match(input,37,FOLLOW_37_in_parse_genericity_language_gcomponent_flowcontrol_Xor2224); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_1_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[132]);
            	    			}

            	    // Gcomponent.g:2215:4: (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
            	    // Gcomponent.g:2216:5: a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_parse_genericity_language_gcomponent_flowcontrol_Xor2250);
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
            	    						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_10_0_0_1_0_0_1, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[133]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[134]);
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[135]);
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[136]);
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[137]);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[138]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[139]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[140]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[141]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[142]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_genericity_language_gcomponent_flowcontrol_Xor_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_Xor"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_XorCond"
    // Gcomponent.g:2258:1: parse_genericity_language_gcomponent_flowcontrol_XorCond returns [genericity.language.gcomponent.flowcontrol.XorCond element = null] : (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) ;
    public final genericity.language.gcomponent.flowcontrol.XorCond parse_genericity_language_gcomponent_flowcontrol_XorCond() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.XorCond element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_XorCond_StartIndex = input.index();

        Token a1=null;
        genericity.language.gcomponent.flowcontrol.BooleanValue a0_0 =null;

        genericity.language.gcomponent.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Gcomponent.g:2261:2: ( (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )
            // Gcomponent.g:2262:2: (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            {
            // Gcomponent.g:2262:2: (a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue )
            // Gcomponent.g:2263:3: a0_0= parse_genericity_language_gcomponent_flowcontrol_BooleanValue
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_BooleanValue_in_parse_genericity_language_gcomponent_flowcontrol_XorCond2310);
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
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[143]);
            	}

            a1=(Token)match(input,14,FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_XorCond2328); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[144]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[145]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[146]);
            	}

            // Gcomponent.g:2304:2: (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            // Gcomponent.g:2305:3: a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_XorCond2346);
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
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_11_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[147]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[148]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[149]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[150]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[151]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_genericity_language_gcomponent_flowcontrol_XorCond_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_XorCond"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_Apply"
    // Gcomponent.g:2336:1: parse_genericity_language_gcomponent_flowcontrol_Apply returns [genericity.language.gcomponent.flowcontrol.Apply element = null] : a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a12= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Gcomponent.g:2339:2: (a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a12= ')' )
            // Gcomponent.g:2340:2: a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )* a12= ')'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_genericity_language_gcomponent_flowcontrol_Apply2379); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[152]);
            	}

            // Gcomponent.g:2354:2: (a1= TEXT )
            // Gcomponent.g:2355:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_Apply2397); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_1, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[153]);
            	}

            a2=(Token)match(input,9,FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply2418); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[154]);
            	}

            // Gcomponent.g:2408:2: (a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            // Gcomponent.g:2409:3: a3_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2436);
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
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[155]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[156]);
            	}

            // Gcomponent.g:2435:2: ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Gcomponent.g:2436:3: (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    {
            	    // Gcomponent.g:2436:3: (a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    // Gcomponent.g:2437:4: a4= ',' (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    {
            	    a4=(Token)match(input,12,FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply2463); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[157]);
            	    			}

            	    // Gcomponent.g:2451:4: (a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    // Gcomponent.g:2452:5: a5_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2489);
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
            	    						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[158]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[159]);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[160]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[161]);
            	}

            a6=(Token)match(input,10,FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply2530); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[162]);
            	}

            a7=(Token)match(input,14,FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_Apply2544); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[163]);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply2558); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[164]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[165]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[166]);
            	}

            // Gcomponent.g:2530:2: ( (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TEXT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Gcomponent.g:2531:3: (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
                    {
                    // Gcomponent.g:2531:3: (a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
                    // Gcomponent.g:2532:4: a9_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2581);
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
                    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_8, a9_0, true);
                    					copyLocalizationInfos(a9_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[167]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[168]);
            	}

            // Gcomponent.g:2559:2: ( (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Gcomponent.g:2560:3: (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    {
            	    // Gcomponent.g:2560:3: (a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter ) )
            	    // Gcomponent.g:2561:4: a10= ',' (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    {
            	    a10=(Token)match(input,12,FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply2616); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_9_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[169]);
            	    			}

            	    // Gcomponent.g:2575:4: (a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter )
            	    // Gcomponent.g:2576:5: a11_0= parse_genericity_language_gcomponent_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2642);
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
            	    						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_9_0_0_1, a11_0, true);
            	    						copyLocalizationInfos(a11_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[170]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[171]);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[172]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[173]);
            	}

            a12=(Token)match(input,10,FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply2683); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_12_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[174]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[175]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[176]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[177]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[178]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_genericity_language_gcomponent_flowcontrol_Apply_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_Apply"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_ApplyParameter"
    // Gcomponent.g:2630:1: parse_genericity_language_gcomponent_flowcontrol_ApplyParameter returns [genericity.language.gcomponent.flowcontrol.ApplyParameter element = null] : (a0= TEXT ) ( (a1= ':' ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' ) ) )? ;
    public final genericity.language.gcomponent.flowcontrol.ApplyParameter parse_genericity_language_gcomponent_flowcontrol_ApplyParameter() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.ApplyParameter element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Gcomponent.g:2633:2: ( (a0= TEXT ) ( (a1= ':' ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' ) ) )? )
            // Gcomponent.g:2634:2: (a0= TEXT ) ( (a1= ':' ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' ) ) )?
            {
            // Gcomponent.g:2634:2: (a0= TEXT )
            // Gcomponent.g:2635:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2716); if (state.failed) return element;

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
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				genericity.language.gcomponent.core.Model proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), value);
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
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[179]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[180]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[181]);
            	}

            // Gcomponent.g:2676:2: ( (a1= ':' ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Gcomponent.g:2677:3: (a1= ':' ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' ) )
                    {
                    // Gcomponent.g:2677:3: (a1= ':' ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' ) )
                    // Gcomponent.g:2678:4: a1= ':' ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' )
                    {
                    a1=(Token)match(input,15,FOLLOW_15_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2746); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[182]);
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[183]);
                    			}

                    // Gcomponent.g:2693:4: ( (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']' | (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==TEXT) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==16) ) {
                            alt16=1;
                        }
                        else if ( (LA16_1==18) ) {
                            alt16=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }
                    switch (alt16) {
                        case 1 :
                            // Gcomponent.g:2694:5: (a2= TEXT ) a3= '::' (a4= TEXT ) a5= '[' (a6= TEXT ) a7= ']'
                            {
                            // Gcomponent.g:2694:5: (a2= TEXT )
                            // Gcomponent.g:2695:6: a2= TEXT
                            {
                            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2779); if (state.failed) return element;

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
                            							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
                            							}
                            							String resolved = (String) resolvedObject;
                            							genericity.language.gcomponent.core.Component proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createTransformationComponent();
                            							collectHiddenTokens(element);
                            							registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Component>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBoundConceptQualifierReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER), resolved, proxy);
                            							if (proxy != null) {
                            								Object value = proxy;
                            								element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_0, proxy, true);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[184]);
                            				}

                            a3=(Token)match(input,16,FOLLOW_16_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2818); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_1, null, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                            				}

                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[185]);
                            				}

                            // Gcomponent.g:2748:5: (a4= TEXT )
                            // Gcomponent.g:2749:6: a4= TEXT
                            {
                            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2848); if (state.failed) return element;

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
                            							tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                            							}
                            							String resolved = (String) resolvedObject;
                            							genericity.language.gcomponent.core.Concept proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
                            							collectHiddenTokens(element);
                            							registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Concept>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBoundConceptReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), resolved, proxy);
                            							if (proxy != null) {
                            								Object value = proxy;
                            								element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_2, proxy, true);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[186]);
                            				}

                            a5=(Token)match(input,18,FOLLOW_18_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2887); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_3, null, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                            				}

                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[187]);
                            				}

                            // Gcomponent.g:2802:5: (a6= TEXT )
                            // Gcomponent.g:2803:6: a6= TEXT
                            {
                            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2917); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            							startIncompleteElement(element);
                            						}
                            						if (a6 != null) {
                            							genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                            							tokenResolver.setOptions(getOptions());
                            							genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
                            							}
                            							String resolved = (String) resolvedObject;
                            							genericity.language.gcomponent.core.BindingDeclaration proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createBindingDeclaration();
                            							collectHiddenTokens(element);
                            							registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.BindingDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), resolved, proxy);
                            							if (proxy != null) {
                            								Object value = proxy;
                            								element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_4, proxy, true);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, proxy);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[188]);
                            				}

                            a7=(Token)match(input,19,FOLLOW_19_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2956); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_0_5, null, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                            				}

                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[189]);
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[190]);
                            				}

                            }
                            break;
                        case 2 :
                            // Gcomponent.g:2858:10: (a8= TEXT ) a9= '[' (a10= TEXT ) a11= ']'
                            {
                            // Gcomponent.g:2858:10: (a8= TEXT )
                            // Gcomponent.g:2859:6: a8= TEXT
                            {
                            a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2996); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            							startIncompleteElement(element);
                            						}
                            						if (a8 != null) {
                            							genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                            							tokenResolver.setOptions(getOptions());
                            							genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
                            							}
                            							String resolved = (String) resolvedObject;
                            							genericity.language.gcomponent.core.Concept proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createConcept();
                            							collectHiddenTokens(element);
                            							registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Concept>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBoundConceptReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), resolved, proxy);
                            							if (proxy != null) {
                            								Object value = proxy;
                            								element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_0, proxy, true);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, proxy);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[191]);
                            				}

                            a9=(Token)match(input,18,FOLLOW_18_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter3035); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_1, null, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                            				}

                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[192]);
                            				}

                            // Gcomponent.g:2912:5: (a10= TEXT )
                            // Gcomponent.g:2913:6: a10= TEXT
                            {
                            a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter3065); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            							startIncompleteElement(element);
                            						}
                            						if (a10 != null) {
                            							genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                            							tokenResolver.setOptions(getOptions());
                            							genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
                            							}
                            							String resolved = (String) resolvedObject;
                            							genericity.language.gcomponent.core.BindingDeclaration proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createBindingDeclaration();
                            							collectHiddenTokens(element);
                            							registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.BindingDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBindingReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), resolved, proxy);
                            							if (proxy != null) {
                            								Object value = proxy;
                            								element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_2, proxy, true);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
                            							copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, proxy);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[193]);
                            				}

                            a11=(Token)match(input,19,FOLLOW_19_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter3104); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_13_0_0_1_0_0_1_0_1_3, null, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                            				}

                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[194]);
                            					addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[195]);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[196]);
                    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[197]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[198]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[199]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_ApplyParameter"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_Seq"
    // Gcomponent.g:2984:1: parse_genericity_language_gcomponent_flowcontrol_Seq returns [genericity.language.gcomponent.flowcontrol.Seq element = null] : a0= 'seq' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) ( (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )+ ;
    public final genericity.language.gcomponent.flowcontrol.Seq parse_genericity_language_gcomponent_flowcontrol_Seq() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.Seq element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_Seq_StartIndex = input.index();

        Token a0=null;
        genericity.language.gcomponent.flowcontrol.CompositionStep a1_0 =null;

        genericity.language.gcomponent.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Gcomponent.g:2987:2: (a0= 'seq' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) ( (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )+ )
            // Gcomponent.g:2988:2: a0= 'seq' (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) ( (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )+
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_genericity_language_gcomponent_flowcontrol_Seq3168); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_14_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[200]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[201]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[202]);
            	}

            // Gcomponent.g:3004:2: (a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            // Gcomponent.g:3005:3: a1_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Seq3186);
            a1_0=parse_genericity_language_gcomponent_flowcontrol_CompositionStep();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
            				startIncompleteElement(element);
            			}
            			if (a1_0 != null) {
            				if (a1_0 != null) {
            					Object value = a1_0;
            					addObjectToList(element, genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.SEQ__STEPS, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_14_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[203]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[204]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[205]);
            	}

            // Gcomponent.g:3032:2: ( (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred18_Gcomponent()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred18_Gcomponent()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA18_6 = input.LA(2);

                    if ( (synpred18_Gcomponent()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // Gcomponent.g:3033:3: (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            	    {
            	    // Gcomponent.g:3033:3: (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
            	    // Gcomponent.g:3034:4: a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Seq3213);
            	    a2_0=parse_genericity_language_gcomponent_flowcontrol_CompositionStep();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a2_0 != null) {
            	    					if (a2_0 != null) {
            	    						Object value = a2_0;
            	    						addObjectToList(element, genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.SEQ__STEPS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_14_0_0_2, a2_0, true);
            	    					copyLocalizationInfos(a2_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[206]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[207]);
            		addExpectedElement(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[208]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[209]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[210]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_genericity_language_gcomponent_flowcontrol_Seq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_Seq"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_FeatureRef"
    // Gcomponent.g:3066:1: parse_genericity_language_gcomponent_flowcontrol_FeatureRef returns [genericity.language.gcomponent.flowcontrol.FeatureRef element = null] : (a0= TEXT ) ;
    public final genericity.language.gcomponent.flowcontrol.FeatureRef parse_genericity_language_gcomponent_flowcontrol_FeatureRef() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.FeatureRef element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_FeatureRef_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Gcomponent.g:3069:2: ( (a0= TEXT ) )
            // Gcomponent.g:3070:2: (a0= TEXT )
            {
            // Gcomponent.g:3070:2: (a0= TEXT )
            // Gcomponent.g:3071:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_FeatureRef3258); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_15_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[211]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_genericity_language_gcomponent_flowcontrol_FeatureRef_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_FeatureRef"



    // $ANTLR start "parse_genericity_language_gcomponent_technologies_AtlTemplate"
    // Gcomponent.g:3112:1: parse_genericity_language_gcomponent_technologies_AtlTemplate returns [genericity.language.gcomponent.technologies.AtlTemplate element = null] : a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) ) )* ;
    public final genericity.language.gcomponent.technologies.AtlTemplate parse_genericity_language_gcomponent_technologies_AtlTemplate() throws RecognitionException {
        genericity.language.gcomponent.technologies.AtlTemplate element =  null;

        int parse_genericity_language_gcomponent_technologies_AtlTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        genericity.language.gcomponent.technologies.AtlParameter a3_0 =null;

        genericity.language.gcomponent.technologies.AtlParameter a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Gcomponent.g:3115:2: (a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) ) )* )
            // Gcomponent.g:3116:2: a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) ) )*
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3294); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[212]);
            	}

            // Gcomponent.g:3130:2: (a1= QUOTED_34_34 )
            // Gcomponent.g:3131:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3312); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__TEMPLATE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__TEMPLATE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[213]);
            	}

            a2=(Token)match(input,38,FOLLOW_38_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3333); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[214]);
            	}

            // Gcomponent.g:3180:2: (a3_0= parse_genericity_language_gcomponent_technologies_AtlParameter )
            // Gcomponent.g:3181:3: a3_0= parse_genericity_language_gcomponent_technologies_AtlParameter
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_technologies_AtlParameter_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3351);
            a3_0=parse_genericity_language_gcomponent_technologies_AtlParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            				startIncompleteElement(element);
            			}
            			if (a3_0 != null) {
            				if (a3_0 != null) {
            					Object value = a3_0;
            					addObjectToList(element, genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[215]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[216]);
            	}

            // Gcomponent.g:3207:2: ( (a4= ',' (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Gcomponent.g:3208:3: (a4= ',' (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) )
            	    {
            	    // Gcomponent.g:3208:3: (a4= ',' (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter ) )
            	    // Gcomponent.g:3209:4: a4= ',' (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter )
            	    {
            	    a4=(Token)match(input,12,FOLLOW_12_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3378); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[217]);
            	    			}

            	    // Gcomponent.g:3223:4: (a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter )
            	    // Gcomponent.g:3224:5: a5_0= parse_genericity_language_gcomponent_technologies_AtlParameter
            	    {
            	    pushFollow(FOLLOW_parse_genericity_language_gcomponent_technologies_AtlParameter_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3404);
            	    a5_0=parse_genericity_language_gcomponent_technologies_AtlParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addObjectToList(element, genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_16_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[218]);
            	    				addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[219]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[220]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[221]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_genericity_language_gcomponent_technologies_AtlTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_technologies_AtlTemplate"



    // $ANTLR start "parse_genericity_language_gcomponent_technologies_AtlParameter"
    // Gcomponent.g:3260:1: parse_genericity_language_gcomponent_technologies_AtlParameter returns [genericity.language.gcomponent.technologies.AtlParameter element = null] : (a0= TEXT ) a1= '=' (a2= TEXT ) ;
    public final genericity.language.gcomponent.technologies.AtlParameter parse_genericity_language_gcomponent_technologies_AtlParameter() throws RecognitionException {
        genericity.language.gcomponent.technologies.AtlParameter element =  null;

        int parse_genericity_language_gcomponent_technologies_AtlParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Gcomponent.g:3263:2: ( (a0= TEXT ) a1= '=' (a2= TEXT ) )
            // Gcomponent.g:3264:2: (a0= TEXT ) a1= '=' (a2= TEXT )
            {
            // Gcomponent.g:3264:2: (a0= TEXT )
            // Gcomponent.g:3265:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_technologies_AtlParameter3464); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_17_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[222]);
            	}

            a1=(Token)match(input,17,FOLLOW_17_in_parse_genericity_language_gcomponent_technologies_AtlParameter3485); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_17_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[223]);
            	}

            // Gcomponent.g:3314:2: (a2= TEXT )
            // Gcomponent.g:3315:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_genericity_language_gcomponent_technologies_AtlParameter3503); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				genericity.language.gcomponent.core.Model proxy = genericity.language.gcomponent.core.CoreFactory.eINSTANCE.createParameterModel();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragmentFactory<genericity.language.gcomponent.technologies.AtlParameter, genericity.language.gcomponent.core.Model>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAtlParameterModelReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_17_0_0_2, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[224]);
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[225]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_genericity_language_gcomponent_technologies_AtlParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_technologies_AtlParameter"



    // $ANTLR start "parse_genericity_language_gcomponent_technologies_JavaTemplate"
    // Gcomponent.g:3357:1: parse_genericity_language_gcomponent_technologies_JavaTemplate returns [genericity.language.gcomponent.technologies.JavaTemplate element = null] : a0= 'java' (a1= QUOTED_34_34 ) ;
    public final genericity.language.gcomponent.technologies.JavaTemplate parse_genericity_language_gcomponent_technologies_JavaTemplate() throws RecognitionException {
        genericity.language.gcomponent.technologies.JavaTemplate element =  null;

        int parse_genericity_language_gcomponent_technologies_JavaTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Gcomponent.g:3360:2: (a0= 'java' (a1= QUOTED_34_34 ) )
            // Gcomponent.g:3361:2: a0= 'java' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_genericity_language_gcomponent_technologies_JavaTemplate3539); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createJavaTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_18_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[226]);
            	}

            // Gcomponent.g:3375:2: (a1= QUOTED_34_34 )
            // Gcomponent.g:3376:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_technologies_JavaTemplate3557); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException();
            			}
            			if (element == null) {
            				element = genericity.language.gcomponent.technologies.TechnologiesFactory.eINSTANCE.createJavaTemplate();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentGrammarInformationProvider.GCOMPONENT_18_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectationConstants.EXPECTATIONS[227]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_genericity_language_gcomponent_technologies_JavaTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_technologies_JavaTemplate"



    // $ANTLR start "parse_genericity_language_gcomponent_core_Component"
    // Gcomponent.g:3413:1: parse_genericity_language_gcomponent_core_Component returns [genericity.language.gcomponent.core.Component element = null] : (c0= parse_genericity_language_gcomponent_core_TransformationComponent |c1= parse_genericity_language_gcomponent_core_CompositeComponent );
    public final genericity.language.gcomponent.core.Component parse_genericity_language_gcomponent_core_Component() throws RecognitionException {
        genericity.language.gcomponent.core.Component element =  null;

        int parse_genericity_language_gcomponent_core_Component_StartIndex = input.index();

        genericity.language.gcomponent.core.TransformationComponent c0 =null;

        genericity.language.gcomponent.core.CompositeComponent c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Gcomponent.g:3414:2: (c0= parse_genericity_language_gcomponent_core_TransformationComponent |c1= parse_genericity_language_gcomponent_core_CompositeComponent )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Gcomponent.g:3415:2: c0= parse_genericity_language_gcomponent_core_TransformationComponent
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_TransformationComponent_in_parse_genericity_language_gcomponent_core_Component3589);
                    c0=parse_genericity_language_gcomponent_core_TransformationComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Gcomponent.g:3416:4: c1= parse_genericity_language_gcomponent_core_CompositeComponent
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_core_CompositeComponent_in_parse_genericity_language_gcomponent_core_Component3599);
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
            if ( state.backtracking>0 ) { memoize(input, 21, parse_genericity_language_gcomponent_core_Component_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_Component"



    // $ANTLR start "parse_genericity_language_gcomponent_variants_Parameter"
    // Gcomponent.g:3420:1: parse_genericity_language_gcomponent_variants_Parameter returns [genericity.language.gcomponent.variants.Parameter element = null] : (c0= parse_genericity_language_gcomponent_variants_SingleFeature |c1= parse_genericity_language_gcomponent_variants_XorFeature );
    public final genericity.language.gcomponent.variants.Parameter parse_genericity_language_gcomponent_variants_Parameter() throws RecognitionException {
        genericity.language.gcomponent.variants.Parameter element =  null;

        int parse_genericity_language_gcomponent_variants_Parameter_StartIndex = input.index();

        genericity.language.gcomponent.variants.SingleFeature c0 =null;

        genericity.language.gcomponent.variants.XorFeature c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Gcomponent.g:3421:2: (c0= parse_genericity_language_gcomponent_variants_SingleFeature |c1= parse_genericity_language_gcomponent_variants_XorFeature )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            else if ( (LA21_0==11) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // Gcomponent.g:3422:2: c0= parse_genericity_language_gcomponent_variants_SingleFeature
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_SingleFeature_in_parse_genericity_language_gcomponent_variants_Parameter3620);
                    c0=parse_genericity_language_gcomponent_variants_SingleFeature();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Gcomponent.g:3423:4: c1= parse_genericity_language_gcomponent_variants_XorFeature
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_variants_XorFeature_in_parse_genericity_language_gcomponent_variants_Parameter3630);
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
            if ( state.backtracking>0 ) { memoize(input, 22, parse_genericity_language_gcomponent_variants_Parameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_variants_Parameter"



    // $ANTLR start "parse_genericity_language_gcomponent_core_Template"
    // Gcomponent.g:3427:1: parse_genericity_language_gcomponent_core_Template returns [genericity.language.gcomponent.core.Template element = null] : (c0= parse_genericity_language_gcomponent_technologies_AtlTemplate |c1= parse_genericity_language_gcomponent_technologies_JavaTemplate );
    public final genericity.language.gcomponent.core.Template parse_genericity_language_gcomponent_core_Template() throws RecognitionException {
        genericity.language.gcomponent.core.Template element =  null;

        int parse_genericity_language_gcomponent_core_Template_StartIndex = input.index();

        genericity.language.gcomponent.technologies.AtlTemplate c0 =null;

        genericity.language.gcomponent.technologies.JavaTemplate c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Gcomponent.g:3428:2: (c0= parse_genericity_language_gcomponent_technologies_AtlTemplate |c1= parse_genericity_language_gcomponent_technologies_JavaTemplate )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            else if ( (LA22_0==28) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Gcomponent.g:3429:2: c0= parse_genericity_language_gcomponent_technologies_AtlTemplate
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_technologies_AtlTemplate_in_parse_genericity_language_gcomponent_core_Template3651);
                    c0=parse_genericity_language_gcomponent_technologies_AtlTemplate();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Gcomponent.g:3430:4: c1= parse_genericity_language_gcomponent_technologies_JavaTemplate
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_technologies_JavaTemplate_in_parse_genericity_language_gcomponent_core_Template3661);
                    c1=parse_genericity_language_gcomponent_technologies_JavaTemplate();

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
            if ( state.backtracking>0 ) { memoize(input, 23, parse_genericity_language_gcomponent_core_Template_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_core_Template"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_CompositionStep"
    // Gcomponent.g:3434:1: parse_genericity_language_gcomponent_flowcontrol_CompositionStep returns [genericity.language.gcomponent.flowcontrol.CompositionStep element = null] : (c0= parse_genericity_language_gcomponent_flowcontrol_Xor |c1= parse_genericity_language_gcomponent_flowcontrol_Apply |c2= parse_genericity_language_gcomponent_flowcontrol_Seq );
    public final genericity.language.gcomponent.flowcontrol.CompositionStep parse_genericity_language_gcomponent_flowcontrol_CompositionStep() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.CompositionStep element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_CompositionStep_StartIndex = input.index();

        genericity.language.gcomponent.flowcontrol.Xor c0 =null;

        genericity.language.gcomponent.flowcontrol.Apply c1 =null;

        genericity.language.gcomponent.flowcontrol.Seq c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Gcomponent.g:3435:2: (c0= parse_genericity_language_gcomponent_flowcontrol_Xor |c1= parse_genericity_language_gcomponent_flowcontrol_Apply |c2= parse_genericity_language_gcomponent_flowcontrol_Seq )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt23=1;
                }
                break;
            case 20:
                {
                alt23=2;
                }
                break;
            case 30:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // Gcomponent.g:3436:2: c0= parse_genericity_language_gcomponent_flowcontrol_Xor
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Xor_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep3682);
                    c0=parse_genericity_language_gcomponent_flowcontrol_Xor();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Gcomponent.g:3437:4: c1= parse_genericity_language_gcomponent_flowcontrol_Apply
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Apply_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep3692);
                    c1=parse_genericity_language_gcomponent_flowcontrol_Apply();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Gcomponent.g:3438:4: c2= parse_genericity_language_gcomponent_flowcontrol_Seq
                    {
                    pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Seq_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep3702);
                    c2=parse_genericity_language_gcomponent_flowcontrol_Seq();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_genericity_language_gcomponent_flowcontrol_CompositionStep_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_CompositionStep"



    // $ANTLR start "parse_genericity_language_gcomponent_flowcontrol_BooleanValue"
    // Gcomponent.g:3442:1: parse_genericity_language_gcomponent_flowcontrol_BooleanValue returns [genericity.language.gcomponent.flowcontrol.BooleanValue element = null] : c0= parse_genericity_language_gcomponent_flowcontrol_FeatureRef ;
    public final genericity.language.gcomponent.flowcontrol.BooleanValue parse_genericity_language_gcomponent_flowcontrol_BooleanValue() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.BooleanValue element =  null;

        int parse_genericity_language_gcomponent_flowcontrol_BooleanValue_StartIndex = input.index();

        genericity.language.gcomponent.flowcontrol.FeatureRef c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Gcomponent.g:3443:2: (c0= parse_genericity_language_gcomponent_flowcontrol_FeatureRef )
            // Gcomponent.g:3444:2: c0= parse_genericity_language_gcomponent_flowcontrol_FeatureRef
            {
            pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_FeatureRef_in_parse_genericity_language_gcomponent_flowcontrol_BooleanValue3723);
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
            if ( state.backtracking>0 ) { memoize(input, 25, parse_genericity_language_gcomponent_flowcontrol_BooleanValue_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_genericity_language_gcomponent_flowcontrol_BooleanValue"

    // $ANTLR start synpred12_Gcomponent
    public final void synpred12_Gcomponent_fragment() throws RecognitionException {
        Token a1=null;
        genericity.language.gcomponent.flowcontrol.XorCond a2_0 =null;


        // Gcomponent.g:2200:3: ( (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) ) )
        // Gcomponent.g:2200:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
        {
        // Gcomponent.g:2200:3: (a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond ) )
        // Gcomponent.g:2201:4: a1= 'when' (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
        {
        a1=(Token)match(input,37,FOLLOW_37_in_synpred12_Gcomponent2224); if (state.failed) return ;

        // Gcomponent.g:2215:4: (a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond )
        // Gcomponent.g:2216:5: a2_0= parse_genericity_language_gcomponent_flowcontrol_XorCond
        {
        pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_synpred12_Gcomponent2250);
        a2_0=parse_genericity_language_gcomponent_flowcontrol_XorCond();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred12_Gcomponent

    // $ANTLR start synpred18_Gcomponent
    public final void synpred18_Gcomponent_fragment() throws RecognitionException {
        genericity.language.gcomponent.flowcontrol.CompositionStep a2_0 =null;


        // Gcomponent.g:3033:3: ( (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep ) )
        // Gcomponent.g:3033:3: (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
        {
        // Gcomponent.g:3033:3: (a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep )
        // Gcomponent.g:3034:4: a2_0= parse_genericity_language_gcomponent_flowcontrol_CompositionStep
        {
        pushFollow(FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_synpred18_Gcomponent3213);
        a2_0=parse_genericity_language_gcomponent_flowcontrol_CompositionStep();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred18_Gcomponent

    // Delegated rules

    public final boolean synpred18_Gcomponent() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Gcomponent_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public static final BitSet FOLLOW_34_in_parse_genericity_language_gcomponent_core_TransformationComponent152 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_genericity_language_gcomponent_core_TransformationComponent166 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_TransformationComponent184 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_genericity_language_gcomponent_core_TransformationComponent205 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_genericity_language_gcomponent_core_TransformationComponent234 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent264 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_genericity_language_gcomponent_core_TransformationComponent316 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_TransformationComponent346 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_genericity_language_gcomponent_core_TransformationComponent398 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_TransformationComponent428 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_genericity_language_gcomponent_core_TransformationComponent480 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_TransformationComponent510 = new BitSet(new long[]{0x0000001088000000L});
    public static final BitSet FOLLOW_36_in_parse_genericity_language_gcomponent_core_TransformationComponent578 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_TransformationComponent619 = new BitSet(new long[]{0x0000000008002800L});
    public static final BitSet FOLLOW_27_in_parse_genericity_language_gcomponent_core_TransformationComponent693 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Template_in_parse_genericity_language_gcomponent_core_TransformationComponent711 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_genericity_language_gcomponent_core_TransformationComponent729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_genericity_language_gcomponent_core_Concept758 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Concept776 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_Concept815 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parse_genericity_language_gcomponent_core_Concept845 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_core_Concept865 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Tag_in_parse_genericity_language_gcomponent_core_Concept898 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_29_in_parse_genericity_language_gcomponent_core_ParameterModel966 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_ParameterModel984 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_core_ParameterModel1005 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_ParameterModel1023 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_genericity_language_gcomponent_core_ParameterModel1053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_ParameterModel1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_Tag1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_genericity_language_gcomponent_variants_SingleFeature1180 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_SingleFeature1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_genericity_language_gcomponent_variants_XorFeature1234 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_variants_XorFeature1252 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_genericity_language_gcomponent_variants_XorFeature1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_genericity_language_gcomponent_core_CompositeComponent1302 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_genericity_language_gcomponent_core_CompositeComponent1316 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_CompositeComponent1334 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_genericity_language_gcomponent_core_CompositeComponent1355 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_genericity_language_gcomponent_core_CompositeComponent1378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_CompositeComponent1404 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_31_in_parse_genericity_language_gcomponent_core_CompositeComponent1465 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1495 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_genericity_language_gcomponent_core_CompositeComponent1547 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_Concept_in_parse_genericity_language_gcomponent_core_CompositeComponent1577 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_genericity_language_gcomponent_core_CompositeComponent1629 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_CompositeComponent1659 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_genericity_language_gcomponent_core_CompositeComponent1711 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_ParameterModel_in_parse_genericity_language_gcomponent_core_CompositeComponent1741 = new BitSet(new long[]{0x0000001081400000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_BindingDeclaration_in_parse_genericity_language_gcomponent_core_CompositeComponent1808 = new BitSet(new long[]{0x0000001081000000L});
    public static final BitSet FOLLOW_36_in_parse_genericity_language_gcomponent_core_CompositeComponent1891 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_Parameter_in_parse_genericity_language_gcomponent_core_CompositeComponent1932 = new BitSet(new long[]{0x0000000001002800L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Composition_in_parse_genericity_language_gcomponent_core_CompositeComponent2010 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_genericity_language_gcomponent_core_CompositeComponent2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_genericity_language_gcomponent_core_BindingDeclaration2057 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_core_BindingDeclaration2075 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_genericity_language_gcomponent_core_BindingDeclaration2096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_core_BindingDeclaration2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_genericity_language_gcomponent_flowcontrol_Composition2150 = new BitSet(new long[]{0x0000008040100000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Composition2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_genericity_language_gcomponent_flowcontrol_Xor2201 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_genericity_language_gcomponent_flowcontrol_Xor2224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_parse_genericity_language_gcomponent_flowcontrol_Xor2250 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_BooleanValue_in_parse_genericity_language_gcomponent_flowcontrol_XorCond2310 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_XorCond2328 = new BitSet(new long[]{0x0000008040100000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_XorCond2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_genericity_language_gcomponent_flowcontrol_Apply2379 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_Apply2397 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply2418 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2436 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply2463 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2489 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply2530 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_genericity_language_gcomponent_flowcontrol_Apply2544 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_genericity_language_gcomponent_flowcontrol_Apply2558 = new BitSet(new long[]{0x0000000000001480L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2581 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_12_in_parse_genericity_language_gcomponent_flowcontrol_Apply2616 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter_in_parse_genericity_language_gcomponent_flowcontrol_Apply2642 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_10_in_parse_genericity_language_gcomponent_flowcontrol_Apply2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2716 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2746 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2779 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2818 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2848 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2887 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2917 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter2996 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter3035 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter3065 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_genericity_language_gcomponent_flowcontrol_ApplyParameter3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_genericity_language_gcomponent_flowcontrol_Seq3168 = new BitSet(new long[]{0x0000008040100000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Seq3186 = new BitSet(new long[]{0x0000008040100000L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_parse_genericity_language_gcomponent_flowcontrol_Seq3213 = new BitSet(new long[]{0x0000008040100002L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_flowcontrol_FeatureRef3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3312 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3333 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_technologies_AtlParameter_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3351 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3378 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_technologies_AtlParameter_in_parse_genericity_language_gcomponent_technologies_AtlTemplate3404 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_technologies_AtlParameter3464 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_genericity_language_gcomponent_technologies_AtlParameter3485 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_genericity_language_gcomponent_technologies_AtlParameter3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_genericity_language_gcomponent_technologies_JavaTemplate3539 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_genericity_language_gcomponent_technologies_JavaTemplate3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_TransformationComponent_in_parse_genericity_language_gcomponent_core_Component3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_core_CompositeComponent_in_parse_genericity_language_gcomponent_core_Component3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_SingleFeature_in_parse_genericity_language_gcomponent_variants_Parameter3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_variants_XorFeature_in_parse_genericity_language_gcomponent_variants_Parameter3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_technologies_AtlTemplate_in_parse_genericity_language_gcomponent_core_Template3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_technologies_JavaTemplate_in_parse_genericity_language_gcomponent_core_Template3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Xor_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Apply_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_Seq_in_parse_genericity_language_gcomponent_flowcontrol_CompositionStep3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_FeatureRef_in_parse_genericity_language_gcomponent_flowcontrol_BooleanValue3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred12_Gcomponent2224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_XorCond_in_synpred12_Gcomponent2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_genericity_language_gcomponent_flowcontrol_CompositionStep_in_synpred18_Gcomponent3213 = new BitSet(new long[]{0x0000000000000002L});

}