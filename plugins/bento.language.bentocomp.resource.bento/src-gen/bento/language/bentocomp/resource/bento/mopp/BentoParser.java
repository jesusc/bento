// $ANTLR 3.4

	package bento.language.bentocomp.resource.bento.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BentoParser extends BentoANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LINEBREAK", "QNAME", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "'+'", "','", "'-'", "'->'", "':'", "'='", "'apply'", "'atl'", "'binding'", "'component'", "'compose'", "'composite'", "'concept'", "'contributos'", "'definition'", "'java'", "'model'", "'seq'", "'source'", "'tags'", "'target'", "'transformation'", "'uses'", "'variants'", "'version'", "'when'", "'with'", "'xor'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int QNAME=6;
    public static final int QUOTED_34_34=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;

    // delegates
    public BentoANTLRParserBase[] getDelegates() {
        return new BentoANTLRParserBase[] {};
    }

    // delegators


    public BentoParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public BentoParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(59 + 1);
         

    }

    public String[] getTokenNames() { return BentoParser.tokenNames; }
    public String getGrammarFileName() { return "Bento.g"; }


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
    		int followSetID = 156;
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
    	



    // $ANTLR start "start"
    // Bento.g:553:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        bento.language.bentocomp.dsl.DefinitionRoot c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Bento.g:554:2: ( (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF )
            // Bento.g:555:2: (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[1]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Bento.g:561:2: (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot )
            // Bento.g:562:3: c0= parse_bento_language_bentocomp_dsl_DefinitionRoot
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_dsl_DefinitionRoot_in_start82);
            c0=parse_bento_language_bentocomp_dsl_DefinitionRoot();

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



    // $ANTLR start "parse_bento_language_bentocomp_dsl_DefinitionRoot"
    // Bento.g:570:1: parse_bento_language_bentocomp_dsl_DefinitionRoot returns [bento.language.bentocomp.dsl.DefinitionRoot element = null] : (a0_0= parse_bento_language_bentocomp_core_Component ) ;
    public final bento.language.bentocomp.dsl.DefinitionRoot parse_bento_language_bentocomp_dsl_DefinitionRoot() throws RecognitionException {
        bento.language.bentocomp.dsl.DefinitionRoot element =  null;

        int parse_bento_language_bentocomp_dsl_DefinitionRoot_StartIndex = input.index();

        bento.language.bentocomp.core.Component a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Bento.g:573:2: ( (a0_0= parse_bento_language_bentocomp_core_Component ) )
            // Bento.g:574:2: (a0_0= parse_bento_language_bentocomp_core_Component )
            {
            // Bento.g:574:2: (a0_0= parse_bento_language_bentocomp_core_Component )
            // Bento.g:575:3: a0_0= parse_bento_language_bentocomp_core_Component
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Component_in_parse_bento_language_bentocomp_dsl_DefinitionRoot119);
            a0_0=parse_bento_language_bentocomp_core_Component();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            if ( state.backtracking>0 ) { memoize(input, 2, parse_bento_language_bentocomp_dsl_DefinitionRoot_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_dsl_DefinitionRoot"



    // $ANTLR start "parse_bento_language_bentocomp_core_TransformationComponent"
    // Bento.g:601:1: parse_bento_language_bentocomp_core_TransformationComponent returns [bento.language.bentocomp.core.TransformationComponent element = null] : a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+ ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}' ;
    public final bento.language.bentocomp.core.TransformationComponent parse_bento_language_bentocomp_core_TransformationComponent() throws RecognitionException {
        bento.language.bentocomp.core.TransformationComponent element =  null;

        int parse_bento_language_bentocomp_core_TransformationComponent_StartIndex = input.index();

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
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;
        Token a23=null;
        Token a24=null;
        Token a26=null;
        Token a28=null;
        bento.language.bentocomp.core.Concept a5_0 =null;

        bento.language.bentocomp.core.Concept a7_0 =null;

        bento.language.bentocomp.core.ParameterModel a9_0 =null;

        bento.language.bentocomp.core.ParameterModel a11_0 =null;

        bento.language.bentocomp.variants.Parameter a13_0 =null;

        bento.language.bentocomp.core.Template a15_0 =null;

        bento.language.bentocomp.core.Tag a25_0 =null;

        bento.language.bentocomp.core.Tag a27_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Bento.g:604:2: (a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+ ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}' )
            // Bento.g:605:2: a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+ ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent152); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[2]);
            	}

            a1=(Token)match(input,21,FOLLOW_21_in_parse_bento_language_bentocomp_core_TransformationComponent166); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[3]);
            	}

            // Bento.g:633:2: (a2= QNAME )
            // Bento.g:634:3: a2= QNAME
            {
            a2=(Token)match(input,QNAME,FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_TransformationComponent184); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[4]);
            	}

            a3=(Token)match(input,40,FOLLOW_40_in_parse_bento_language_bentocomp_core_TransformationComponent205); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[5]);
            	}

            // Bento.g:683:2: ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Bento.g:684:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )
            	    {
            	    // Bento.g:684:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )
            	    // Bento.g:685:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:685:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:686:5: a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a4=(Token)match(input,30,FOLLOW_30_in_parse_bento_language_bentocomp_core_TransformationComponent234); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_0_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[6]);
            	    				}

            	    // Bento.g:700:5: (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:701:6: a5_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent264);
            	    a5_0=parse_bento_language_bentocomp_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[7]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[8]);
            	    			}

            	    // Bento.g:732:4: (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:733:5: a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a6=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_core_TransformationComponent316); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_1_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[9]);
            	    				}

            	    // Bento.g:747:5: (a7_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:748:6: a7_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent346);
            	    a7_0=parse_bento_language_bentocomp_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[10]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[11]);
            	    			}

            	    // Bento.g:779:4: (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:780:5: a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a8=(Token)match(input,30,FOLLOW_30_in_parse_bento_language_bentocomp_core_TransformationComponent398); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_2_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[12]);
            	    				}

            	    // Bento.g:794:5: (a9_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:795:6: a9_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent428);
            	    a9_0=parse_bento_language_bentocomp_core_ParameterModel();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[13]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[14]);
            	    			}

            	    // Bento.g:826:4: (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:827:5: a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a10=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_core_TransformationComponent480); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_4_0_0_3_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[15]);
            	    				}

            	    // Bento.g:841:5: (a11_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:842:6: a11_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent510);
            	    a11_0=parse_bento_language_bentocomp_core_ParameterModel();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[16]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[17]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[18]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[19]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[20]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[21]);
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[24]);
            	}

            // Bento.g:886:2: ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Bento.g:887:3: (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    {
                    // Bento.g:887:3: (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    // Bento.g:888:4: a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    {
                    a12=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_core_TransformationComponent578); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[25]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[26]);
                    			}

                    // Bento.g:903:4: ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==12||LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Bento.g:904:5: ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    {
                    	    // Bento.g:904:5: ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    // Bento.g:905:6: (a13_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    {
                    	    // Bento.g:905:6: (a13_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    // Bento.g:906:7: a13_0= parse_bento_language_bentocomp_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_TransformationComponent619);
                    	    a13_0=parse_bento_language_bentocomp_variants_Parameter();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[27]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[28]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[29]);
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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[30]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[31]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[32]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[33]);
            	}

            a14=(Token)match(input,26,FOLLOW_26_in_parse_bento_language_bentocomp_core_TransformationComponent693); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[35]);
            	}

            // Bento.g:964:2: (a15_0= parse_bento_language_bentocomp_core_Template )
            // Bento.g:965:3: a15_0= parse_bento_language_bentocomp_core_Template
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Template_in_parse_bento_language_bentocomp_core_TransformationComponent711);
            a15_0=parse_bento_language_bentocomp_core_Template();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[36]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[37]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[38]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[39]);
            	}

            // Bento.g:993:2: ( (a16= 'version' (a17= QUOTED_34_34 ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Bento.g:994:3: (a16= 'version' (a17= QUOTED_34_34 ) )
                    {
                    // Bento.g:994:3: (a16= 'version' (a17= QUOTED_34_34 ) )
                    // Bento.g:995:4: a16= 'version' (a17= QUOTED_34_34 )
                    {
                    a16=(Token)match(input,36,FOLLOW_36_in_parse_bento_language_bentocomp_core_TransformationComponent738); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_8_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[40]);
                    			}

                    // Bento.g:1009:4: (a17= QUOTED_34_34 )
                    // Bento.g:1010:5: a17= QUOTED_34_34
                    {
                    a17=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent764); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[41]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[42]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[43]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[44]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[45]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[46]);
            	}

            // Bento.g:1056:2: ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Bento.g:1057:3: (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* )
                    {
                    // Bento.g:1057:3: (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* )
                    // Bento.g:1058:4: a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )*
                    {
                    a18=(Token)match(input,25,FOLLOW_25_in_parse_bento_language_bentocomp_core_TransformationComponent819); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[47]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[48]);
                    			}

                    // Bento.g:1073:4: ( (a19= TEXT ) | (a20= QUOTED_34_34 ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==TEXT) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==QUOTED_34_34) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // Bento.g:1074:5: (a19= TEXT )
                            {
                            // Bento.g:1074:5: (a19= TEXT )
                            // Bento.g:1075:6: a19= TEXT
                            {
                            a19=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent852); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[49]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[50]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[51]);
                            				}

                            }
                            break;
                        case 2 :
                            // Bento.g:1113:10: (a20= QUOTED_34_34 )
                            {
                            // Bento.g:1113:10: (a20= QUOTED_34_34 )
                            // Bento.g:1114:6: a20= QUOTED_34_34
                            {
                            a20=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent908); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[52]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[53]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[54]);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[55]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[56]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[57]);
                    			}

                    // Bento.g:1159:4: ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Bento.g:1160:5: (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) )
                    	    {
                    	    // Bento.g:1160:5: (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) )
                    	    // Bento.g:1161:6: a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) )
                    	    {
                    	    a21=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent973); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_9_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[58]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[59]);
                    	    					}

                    	    // Bento.g:1176:6: ( (a22= TEXT ) | (a23= QUOTED_34_34 ) )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==TEXT) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==QUOTED_34_34) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return element;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // Bento.g:1177:7: (a22= TEXT )
                    	            {
                    	            // Bento.g:1177:7: (a22= TEXT )
                    	            // Bento.g:1178:8: a22= TEXT
                    	            {
                    	            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent1016); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
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

                    	            }


                    	            if ( state.backtracking==0 ) {
                    	            							// expected elements (follow set)
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[60]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[61]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[62]);
                    	            						}

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Bento.g:1216:14: (a23= QUOTED_34_34 )
                    	            {
                    	            // Bento.g:1216:14: (a23= QUOTED_34_34 )
                    	            // Bento.g:1217:8: a23= QUOTED_34_34
                    	            {
                    	            a23=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent1090); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
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

                    	            }


                    	            if ( state.backtracking==0 ) {
                    	            							// expected elements (follow set)
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[63]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[64]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[65]);
                    	            						}

                    	            }
                    	            break;

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[66]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[67]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[68]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[69]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[70]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[71]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[72]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[73]);
            	}

            // Bento.g:1279:2: ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Bento.g:1280:3: (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:1280:3: (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:1281:4: a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a24=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_core_TransformationComponent1205); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[74]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[75]);
                    			}

                    // Bento.g:1296:4: (a25_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:1297:5: a25_0= parse_bento_language_bentocomp_core_Tag
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1231);
                    a25_0=parse_bento_language_bentocomp_core_Tag();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[76]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[77]);
                    			}

                    // Bento.g:1323:4: ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Bento.g:1324:5: (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:1324:5: (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:1325:6: a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag )
                    	    {
                    	    a26=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1272); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_10_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a26, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[78]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[79]);
                    	    					}

                    	    // Bento.g:1340:6: (a27_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:1341:7: a27_0= parse_bento_language_bentocomp_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1306);
                    	    a27_0=parse_bento_language_bentocomp_core_Tag();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[80]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[81]);
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[82]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[83]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[84]);
            	}

            a28=(Token)match(input,41,FOLLOW_41_in_parse_bento_language_bentocomp_core_TransformationComponent1380); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createTransformationComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_1_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a28, element);
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
            if ( state.backtracking>0 ) { memoize(input, 3, parse_bento_language_bentocomp_core_TransformationComponent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_TransformationComponent"



    // $ANTLR start "parse_bento_language_bentocomp_core_Concept"
    // Bento.g:1397:1: parse_bento_language_bentocomp_core_Concept returns [bento.language.bentocomp.core.Concept element = null] : a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? ;
    public final bento.language.bentocomp.core.Concept parse_bento_language_bentocomp_core_Concept() throws RecognitionException {
        bento.language.bentocomp.core.Concept element =  null;

        int parse_bento_language_bentocomp_core_Concept_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        bento.language.bentocomp.core.Tag a5_0 =null;

        bento.language.bentocomp.core.Tag a7_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Bento.g:1400:2: (a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? )
            // Bento.g:1401:2: a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_bento_language_bentocomp_core_Concept1409); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[85]);
            	}

            // Bento.g:1415:2: (a1= TEXT )
            // Bento.g:1416:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Concept1427); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[86]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_core_Concept1448); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[87]);
            	}

            // Bento.g:1465:2: (a3= QUOTED_34_34 )
            // Bento.g:1466:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Concept1466); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[88]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[89]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[90]);
            	}

            // Bento.g:1503:2: ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Bento.g:1504:3: (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:1504:3: (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:1505:4: a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a4=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_core_Concept1496); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[91]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[92]);
                    			}

                    // Bento.g:1520:4: (a5_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:1521:5: a5_0= parse_bento_language_bentocomp_core_Tag
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1522);
                    a5_0=parse_bento_language_bentocomp_core_Tag();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_1, a5_0, true);
                    						copyLocalizationInfos(a5_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[93]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[94]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[95]);
                    			}

                    // Bento.g:1548:4: ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Bento.g:1549:5: (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:1549:5: (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:1550:6: a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag )
                    	    {
                    	    a6=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_Concept1563); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[96]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[97]);
                    	    					}

                    	    // Bento.g:1565:6: (a7_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:1566:7: a7_0= parse_bento_language_bentocomp_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1597);
                    	    a7_0=parse_bento_language_bentocomp_core_Tag();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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
                    	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_2_0_0_1, a7_0, true);
                    	    								copyLocalizationInfos(a7_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[98]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[99]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[100]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[101]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[102]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[103]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[104]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[105]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_bento_language_bentocomp_core_Concept_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Concept"



    // $ANTLR start "parse_bento_language_bentocomp_core_ParameterModel"
    // Bento.g:1612:1: parse_bento_language_bentocomp_core_ParameterModel returns [bento.language.bentocomp.core.ParameterModel element = null] : a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? ;
    public final bento.language.bentocomp.core.ParameterModel parse_bento_language_bentocomp_core_ParameterModel() throws RecognitionException {
        bento.language.bentocomp.core.ParameterModel element =  null;

        int parse_bento_language_bentocomp_core_ParameterModel_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Bento.g:1615:2: (a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? )
            // Bento.g:1616:2: a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_bento_language_bentocomp_core_ParameterModel1686); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[106]);
            	}

            // Bento.g:1630:2: (a1= TEXT )
            // Bento.g:1631:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1704); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[107]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_core_ParameterModel1725); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[108]);
            	}

            // Bento.g:1680:2: (a3= TEXT )
            // Bento.g:1681:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1743); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[109]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[110]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[111]);
            	}

            // Bento.g:1722:2: ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Bento.g:1723:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    {
                    // Bento.g:1723:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    // Bento.g:1724:4: a4= '=' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_core_ParameterModel1773); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[112]);
                    			}

                    // Bento.g:1738:4: (a5= QUOTED_34_34 )
                    // Bento.g:1739:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_ParameterModel1799); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[113]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[114]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[115]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[116]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_bento_language_bentocomp_core_ParameterModel_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_ParameterModel"



    // $ANTLR start "parse_bento_language_bentocomp_core_Tag"
    // Bento.g:1785:1: parse_bento_language_bentocomp_core_Tag returns [bento.language.bentocomp.core.Tag element = null] : ( (a0= TEXT ) | (a1= QUOTED_34_34 ) );
    public final bento.language.bentocomp.core.Tag parse_bento_language_bentocomp_core_Tag() throws RecognitionException {
        bento.language.bentocomp.core.Tag element =  null;

        int parse_bento_language_bentocomp_core_Tag_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Bento.g:1788:2: ( (a0= TEXT ) | (a1= QUOTED_34_34 ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==TEXT) ) {
                alt14=1;
            }
            else if ( (LA14_0==QUOTED_34_34) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Bento.g:1789:2: (a0= TEXT )
                    {
                    // Bento.g:1789:2: (a0= TEXT )
                    // Bento.g:1790:3: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Tag1864); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_0, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[117]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[118]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[119]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[120]);
                    	}

                    }
                    break;
                case 2 :
                    // Bento.g:1829:4: (a1= QUOTED_34_34 )
                    {
                    // Bento.g:1829:4: (a1= QUOTED_34_34 )
                    // Bento.g:1830:3: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Tag1893); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_1_0, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[121]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[122]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[123]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[124]);
                    	}

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
            if ( state.backtracking>0 ) { memoize(input, 6, parse_bento_language_bentocomp_core_Tag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Tag"



    // $ANTLR start "parse_bento_language_bentocomp_variants_SingleFeature"
    // Bento.g:1870:1: parse_bento_language_bentocomp_variants_SingleFeature returns [bento.language.bentocomp.variants.SingleFeature element = null] : a0= '-' (a1= TEXT ) ;
    public final bento.language.bentocomp.variants.SingleFeature parse_bento_language_bentocomp_variants_SingleFeature() throws RecognitionException {
        bento.language.bentocomp.variants.SingleFeature element =  null;

        int parse_bento_language_bentocomp_variants_SingleFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Bento.g:1873:2: (a0= '-' (a1= TEXT ) )
            // Bento.g:1874:2: a0= '-' (a1= TEXT )
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_bento_language_bentocomp_variants_SingleFeature1929); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createSingleFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[125]);
            	}

            // Bento.g:1888:2: (a1= TEXT )
            // Bento.g:1889:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_SingleFeature1947); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[126]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[127]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[128]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[129]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_bento_language_bentocomp_variants_SingleFeature_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_variants_SingleFeature"



    // $ANTLR start "parse_bento_language_bentocomp_variants_XorFeature"
    // Bento.g:1929:1: parse_bento_language_bentocomp_variants_XorFeature returns [bento.language.bentocomp.variants.XorFeature element = null] : a0= '+' (a1= TEXT ) a2= 'xor' ;
    public final bento.language.bentocomp.variants.XorFeature parse_bento_language_bentocomp_variants_XorFeature() throws RecognitionException {
        bento.language.bentocomp.variants.XorFeature element =  null;

        int parse_bento_language_bentocomp_variants_XorFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Bento.g:1932:2: (a0= '+' (a1= TEXT ) a2= 'xor' )
            // Bento.g:1933:2: a0= '+' (a1= TEXT ) a2= 'xor'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_bento_language_bentocomp_variants_XorFeature1983); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createXorFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[130]);
            	}

            // Bento.g:1947:2: (a1= TEXT )
            // Bento.g:1948:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_XorFeature2001); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[131]);
            	}

            a2=(Token)match(input,39,FOLLOW_39_in_parse_bento_language_bentocomp_variants_XorFeature2022); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createXorFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[132]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[133]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[134]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[135]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_bento_language_bentocomp_variants_XorFeature_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_variants_XorFeature"



    // $ANTLR start "parse_bento_language_bentocomp_core_CompositeComponent"
    // Bento.g:2002:1: parse_bento_language_bentocomp_core_CompositeComponent returns [bento.language.bentocomp.core.CompositeComponent element = null] : a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+ ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}' ;
    public final bento.language.bentocomp.core.CompositeComponent parse_bento_language_bentocomp_core_CompositeComponent() throws RecognitionException {
        bento.language.bentocomp.core.CompositeComponent element =  null;

        int parse_bento_language_bentocomp_core_CompositeComponent_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a9=null;
        Token a11=null;
        Token a13=null;
        Token a15=null;
        Token a18=null;
        Token a20=null;
        Token a22=null;
        bento.language.bentocomp.core.BindingDeclaration a6_0 =null;

        bento.language.bentocomp.core.Concept a8_0 =null;

        bento.language.bentocomp.core.Concept a10_0 =null;

        bento.language.bentocomp.core.ParameterModel a12_0 =null;

        bento.language.bentocomp.core.ParameterModel a14_0 =null;

        bento.language.bentocomp.variants.Parameter a16_0 =null;

        bento.language.bentocomp.flowcontrol.Composition a17_0 =null;

        bento.language.bentocomp.core.Tag a19_0 =null;

        bento.language.bentocomp.core.Tag a21_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Bento.g:2005:2: (a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+ ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}' )
            // Bento.g:2006:2: a0= 'composite' a1= 'component' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+ ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_bento_language_bentocomp_core_CompositeComponent2051); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[136]);
            	}

            a1=(Token)match(input,21,FOLLOW_21_in_parse_bento_language_bentocomp_core_CompositeComponent2065); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[137]);
            	}

            // Bento.g:2034:2: (a2= TEXT )
            // Bento.g:2035:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_CompositeComponent2083); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new bento.language.bentocomp.resource.bento.mopp.BentoTerminateParsingException();
            			}
            			if (element == null) {
            				element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				bento.language.bentocomp.resource.bento.IBentoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[138]);
            	}

            a3=(Token)match(input,40,FOLLOW_40_in_parse_bento_language_bentocomp_core_CompositeComponent2104); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[139]);
            	}

            // Bento.g:2084:2: ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Bento.g:2085:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    {
            	    // Bento.g:2085:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    // Bento.g:2086:4: a4= 'uses' (a5= QUOTED_34_34 )
            	    {
            	    a4=(Token)match(input,34,FOLLOW_34_in_parse_bento_language_bentocomp_core_CompositeComponent2127); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[140]);
            	    			}

            	    // Bento.g:2100:4: (a5= QUOTED_34_34 )
            	    // Bento.g:2101:5: a5= QUOTED_34_34
            	    {
            	    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_CompositeComponent2153); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_4_0_0_1, proxy, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[141]);
            	    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[142]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[143]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[144]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[145]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[146]);
            	}

            // Bento.g:2151:2: ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Bento.g:2152:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
            	    {
            	    // Bento.g:2152:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
            	    // Bento.g:2153:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
            	    {
            	    // Bento.g:2153:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
            	    // Bento.g:2154:5: a6_0= parse_bento_language_bentocomp_core_BindingDeclaration
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_core_CompositeComponent2214);
            	    a6_0=parse_bento_language_bentocomp_core_BindingDeclaration();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_5_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[147]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[148]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[149]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[150]);
            	}

            // Bento.g:2188:2: ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Bento.g:2189:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )
            	    {
            	    // Bento.g:2189:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )
            	    // Bento.g:2190:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:2190:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:2191:5: a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a7=(Token)match(input,30,FOLLOW_30_in_parse_bento_language_bentocomp_core_CompositeComponent2270); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_0_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[151]);
            	    				}

            	    // Bento.g:2205:5: (a8_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:2206:6: a8_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent2300);
            	    a8_0=parse_bento_language_bentocomp_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_0_0_0_1, a8_0, true);
            	    							copyLocalizationInfos(a8_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[152]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[153]);
            	    			}

            	    // Bento.g:2237:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:2238:5: a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a9=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_core_CompositeComponent2352); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_1_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[154]);
            	    				}

            	    // Bento.g:2252:5: (a10_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:2253:6: a10_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent2382);
            	    a10_0=parse_bento_language_bentocomp_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_1_0_0_1, a10_0, true);
            	    							copyLocalizationInfos(a10_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[155]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[156]);
            	    			}

            	    // Bento.g:2284:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:2285:5: a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a11=(Token)match(input,30,FOLLOW_30_in_parse_bento_language_bentocomp_core_CompositeComponent2434); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_2_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[157]);
            	    				}

            	    // Bento.g:2299:5: (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:2300:6: a12_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent2464);
            	    a12_0=parse_bento_language_bentocomp_core_ParameterModel();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_2_0_0_1, a12_0, true);
            	    							copyLocalizationInfos(a12_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[158]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[159]);
            	    			}

            	    // Bento.g:2331:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:2332:5: a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a13=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_core_CompositeComponent2516); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_3_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[160]);
            	    				}

            	    // Bento.g:2346:5: (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:2347:6: a14_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent2546);
            	    a14_0=parse_bento_language_bentocomp_core_ParameterModel();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_3_0_0_1, a14_0, true);
            	    							copyLocalizationInfos(a14_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[161]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[162]);
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[163]);
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[164]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[165]);
            	    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[166]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[167]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[168]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[169]);
            	}

            // Bento.g:2391:2: ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Bento.g:2392:3: (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    {
                    // Bento.g:2392:3: (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    // Bento.g:2393:4: a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    {
                    a15=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent2614); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_7_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[170]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[171]);
                    			}

                    // Bento.g:2408:4: ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==12||LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Bento.g:2409:5: ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    {
                    	    // Bento.g:2409:5: ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    // Bento.g:2410:6: (a16_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    {
                    	    // Bento.g:2410:6: (a16_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    // Bento.g:2411:7: a16_0= parse_bento_language_bentocomp_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_CompositeComponent2655);
                    	    a16_0=parse_bento_language_bentocomp_variants_Parameter();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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
                    	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_7_0_0_1_0_0_0, a16_0, true);
                    	    								copyLocalizationInfos(a16_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[172]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[173]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[174]);
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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[175]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[176]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[177]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[178]);
            	}

            // Bento.g:2454:2: (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition )
            // Bento.g:2455:3: a17_0= parse_bento_language_bentocomp_flowcontrol_Composition
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_core_CompositeComponent2733);
            a17_0=parse_bento_language_bentocomp_flowcontrol_Composition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_8, a17_0, true);
            				copyLocalizationInfos(a17_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[179]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[180]);
            	}

            // Bento.g:2481:2: ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Bento.g:2482:3: (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:2482:3: (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:2483:4: a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a18=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_core_CompositeComponent2760); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[181]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[182]);
                    			}

                    // Bento.g:2498:4: (a19_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:2499:5: a19_0= parse_bento_language_bentocomp_core_Tag
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent2786);
                    a19_0=parse_bento_language_bentocomp_core_Tag();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_9_0_0_1, a19_0, true);
                    						copyLocalizationInfos(a19_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[183]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[184]);
                    			}

                    // Bento.g:2525:4: ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Bento.g:2526:5: (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:2526:5: (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:2527:6: a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag )
                    	    {
                    	    a20=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_CompositeComponent2827); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_9_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[185]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[186]);
                    	    					}

                    	    // Bento.g:2542:6: (a21_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:2543:7: a21_0= parse_bento_language_bentocomp_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent2861);
                    	    a21_0=parse_bento_language_bentocomp_core_Tag();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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
                    	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_9_0_0_2_0_0_1, a21_0, true);
                    	    								copyLocalizationInfos(a21_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[187]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[188]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[189]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[190]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[191]);
            	}

            a22=(Token)match(input,41,FOLLOW_41_in_parse_bento_language_bentocomp_core_CompositeComponent2935); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
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
            if ( state.backtracking>0 ) { memoize(input, 9, parse_bento_language_bentocomp_core_CompositeComponent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_CompositeComponent"



    // $ANTLR start "parse_bento_language_bentocomp_core_BindingDeclaration"
    // Bento.g:2599:1: parse_bento_language_bentocomp_core_BindingDeclaration returns [bento.language.bentocomp.core.BindingDeclaration element = null] : a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ;
    public final bento.language.bentocomp.core.BindingDeclaration parse_bento_language_bentocomp_core_BindingDeclaration() throws RecognitionException {
        bento.language.bentocomp.core.BindingDeclaration element =  null;

        int parse_bento_language_bentocomp_core_BindingDeclaration_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Bento.g:2602:2: (a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) )
            // Bento.g:2603:2: a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_bento_language_bentocomp_core_BindingDeclaration2964); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[192]);
            	}

            // Bento.g:2617:2: (a1= TEXT )
            // Bento.g:2618:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_BindingDeclaration2982); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[193]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_core_BindingDeclaration3003); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[194]);
            	}

            // Bento.g:2667:2: (a3= QUOTED_34_34 )
            // Bento.g:2668:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_BindingDeclaration3021); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[195]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[196]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_bento_language_bentocomp_core_BindingDeclaration_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_BindingDeclaration"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Composition"
    // Bento.g:2706:1: parse_bento_language_bentocomp_flowcontrol_Composition returns [bento.language.bentocomp.flowcontrol.Composition element = null] : a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ;
    public final bento.language.bentocomp.flowcontrol.Composition parse_bento_language_bentocomp_flowcontrol_Composition() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Composition element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Composition_StartIndex = input.index();

        Token a0=null;
        bento.language.bentocomp.flowcontrol.CompositionStep a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Bento.g:2709:2: (a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
            // Bento.g:2710:2: a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_bento_language_bentocomp_flowcontrol_Composition3057); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[197]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[198]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[199]);
            	}

            // Bento.g:2726:2: (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:2727:3: a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Composition3075);
            a1_0=parse_bento_language_bentocomp_flowcontrol_CompositionStep();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[200]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[201]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_bento_language_bentocomp_flowcontrol_Composition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Composition"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Xor"
    // Bento.g:2755:1: parse_bento_language_bentocomp_flowcontrol_Xor returns [bento.language.bentocomp.flowcontrol.Xor element = null] : a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+ ;
    public final bento.language.bentocomp.flowcontrol.Xor parse_bento_language_bentocomp_flowcontrol_Xor() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Xor element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Xor_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        bento.language.bentocomp.flowcontrol.XorCond a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Bento.g:2758:2: (a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+ )
            // Bento.g:2759:2: a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+
            {
            a0=(Token)match(input,39,FOLLOW_39_in_parse_bento_language_bentocomp_flowcontrol_Xor3108); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[202]);
            	}

            // Bento.g:2773:2: ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred22_Bento()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // Bento.g:2774:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
            	    {
            	    // Bento.g:2774:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
            	    // Bento.g:2775:4: a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
            	    {
            	    a1=(Token)match(input,37,FOLLOW_37_in_parse_bento_language_bentocomp_flowcontrol_Xor3131); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_1_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[203]);
            	    			}

            	    // Bento.g:2789:4: (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
            	    // Bento.g:2790:5: a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_parse_bento_language_bentocomp_flowcontrol_Xor3157);
            	    a2_0=parse_bento_language_bentocomp_flowcontrol_XorCond();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_1_0_0_1, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[204]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[205]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[206]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[207]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[208]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[209]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[210]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[211]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[212]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[213]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[214]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[215]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_bento_language_bentocomp_flowcontrol_Xor_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Xor"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_XorCond"
    // Bento.g:2834:1: parse_bento_language_bentocomp_flowcontrol_XorCond returns [bento.language.bentocomp.flowcontrol.XorCond element = null] : (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ;
    public final bento.language.bentocomp.flowcontrol.XorCond parse_bento_language_bentocomp_flowcontrol_XorCond() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.XorCond element =  null;

        int parse_bento_language_bentocomp_flowcontrol_XorCond_StartIndex = input.index();

        Token a1=null;
        bento.language.bentocomp.flowcontrol.BooleanValue a0_0 =null;

        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Bento.g:2837:2: ( (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
            // Bento.g:2838:2: (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            {
            // Bento.g:2838:2: (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue )
            // Bento.g:2839:3: a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_BooleanValue_in_parse_bento_language_bentocomp_flowcontrol_XorCond3217);
            a0_0=parse_bento_language_bentocomp_flowcontrol_BooleanValue();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[216]);
            	}

            a1=(Token)match(input,15,FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_XorCond3235); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[217]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[218]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[219]);
            	}

            // Bento.g:2880:2: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:2881:3: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_XorCond3253);
            a2_0=parse_bento_language_bentocomp_flowcontrol_CompositionStep();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[220]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[221]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[222]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[223]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[224]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[225]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_bento_language_bentocomp_flowcontrol_XorCond_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_XorCond"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Apply"
    // Bento.g:2913:1: parse_bento_language_bentocomp_flowcontrol_Apply returns [bento.language.bentocomp.flowcontrol.Apply element = null] : a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')' ;
    public final bento.language.bentocomp.flowcontrol.Apply parse_bento_language_bentocomp_flowcontrol_Apply() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Apply element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Apply_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        bento.language.bentocomp.flowcontrol.ApplyParameter a3_0 =null;

        bento.language.bentocomp.flowcontrol.ApplyParameter a5_0 =null;

        bento.language.bentocomp.flowcontrol.ApplyParameter a9_0 =null;

        bento.language.bentocomp.flowcontrol.ApplyParameter a11_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Bento.g:2916:2: (a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')' )
            // Bento.g:2917:2: a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_bento_language_bentocomp_flowcontrol_Apply3286); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[226]);
            	}

            // Bento.g:2931:2: (a1= TEXT )
            // Bento.g:2932:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_Apply3304); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_1, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[227]);
            	}

            a2=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply3325); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[228]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[229]);
            	}

            // Bento.g:2986:2: (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            // Bento.g:2987:3: a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3343);
            a3_0=parse_bento_language_bentocomp_flowcontrol_ApplyParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[230]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[231]);
            	}

            // Bento.g:3013:2: ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Bento.g:3014:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    {
            	    // Bento.g:3014:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    // Bento.g:3015:4: a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    {
            	    a4=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply3370); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[232]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[233]);
            	    			}

            	    // Bento.g:3030:4: (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    // Bento.g:3031:5: a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3396);
            	    a5_0=parse_bento_language_bentocomp_flowcontrol_ApplyParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[234]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[235]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[236]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[237]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply3437); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[238]);
            	}

            a7=(Token)match(input,15,FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_Apply3451); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[239]);
            	}

            a8=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply3465); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[240]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[241]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[242]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[243]);
            	}

            // Bento.g:3110:2: ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==TEXT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Bento.g:3111:3: (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
                    {
                    // Bento.g:3111:3: (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
                    // Bento.g:3112:4: a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3488);
                    a9_0=parse_bento_language_bentocomp_flowcontrol_ApplyParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_8, a9_0, true);
                    					copyLocalizationInfos(a9_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[244]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[245]);
            	}

            // Bento.g:3139:2: ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Bento.g:3140:3: (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    {
            	    // Bento.g:3140:3: (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    // Bento.g:3141:4: a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    {
            	    a10=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply3523); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_9_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[246]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[247]);
            	    			}

            	    // Bento.g:3156:4: (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    // Bento.g:3157:5: a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3549);
            	    a11_0=parse_bento_language_bentocomp_flowcontrol_ApplyParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_9_0_0_1, a11_0, true);
            	    						copyLocalizationInfos(a11_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[248]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[249]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[250]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[251]);
            	}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply3590); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[252]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[253]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[254]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[255]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[256]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[257]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_bento_language_bentocomp_flowcontrol_Apply_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Apply"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_ApplyParameter"
    // Bento.g:3212:1: parse_bento_language_bentocomp_flowcontrol_ApplyParameter returns [bento.language.bentocomp.flowcontrol.ApplyParameter element = null] : ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' ) ;
    public final bento.language.bentocomp.flowcontrol.ApplyParameter parse_bento_language_bentocomp_flowcontrol_ApplyParameter() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.ApplyParameter element =  null;

        int parse_bento_language_bentocomp_flowcontrol_ApplyParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Bento.g:3215:2: ( ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' ) )
            // Bento.g:3216:2: ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' )
            {
            // Bento.g:3216:2: ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==TEXT) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==EOF||LA26_1==11||LA26_1==13) ) {
                    alt26=1;
                }
                else if ( (LA26_1==10) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // Bento.g:3217:3: (a0= TEXT )
                    {
                    // Bento.g:3217:3: (a0= TEXT )
                    // Bento.g:3218:4: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3628); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_0_0, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[258]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[259]);
                    		}

                    }
                    break;
                case 2 :
                    // Bento.g:3259:6: (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')'
                    {
                    // Bento.g:3259:6: (a1= TEXT )
                    // Bento.g:3260:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3666); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_0, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[260]);
                    		}

                    a2=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3693); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_1, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[261]);
                    		}

                    // Bento.g:3313:3: (a3= TEXT )
                    // Bento.g:3314:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3715); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_2, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[262]);
                    		}

                    a4=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3742); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0_0_1_3, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[263]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[264]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[265]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[266]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_bento_language_bentocomp_flowcontrol_ApplyParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_ApplyParameter"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Seq"
    // Bento.g:3377:1: parse_bento_language_bentocomp_flowcontrol_Seq returns [bento.language.bentocomp.flowcontrol.Seq element = null] : a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+ ;
    public final bento.language.bentocomp.flowcontrol.Seq parse_bento_language_bentocomp_flowcontrol_Seq() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Seq element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Seq_StartIndex = input.index();

        Token a0=null;
        bento.language.bentocomp.flowcontrol.CompositionStep a1_0 =null;

        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Bento.g:3380:2: (a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+ )
            // Bento.g:3381:2: a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_bento_language_bentocomp_flowcontrol_Seq3781); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[267]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[268]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[269]);
            	}

            // Bento.g:3397:2: (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:3398:3: a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq3799);
            a1_0=parse_bento_language_bentocomp_flowcontrol_CompositionStep();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[270]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[271]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[272]);
            	}

            // Bento.g:3425:2: ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA27_5 = input.LA(2);

                    if ( (synpred27_Bento()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA27_6 = input.LA(2);

                    if ( (synpred27_Bento()) ) {
                        alt27=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA27_7 = input.LA(2);

                    if ( (synpred27_Bento()) ) {
                        alt27=1;
                    }


                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // Bento.g:3426:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            	    {
            	    // Bento.g:3426:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            	    // Bento.g:3427:4: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq3826);
            	    a2_0=parse_bento_language_bentocomp_flowcontrol_CompositionStep();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_2, a2_0, true);
            	    					copyLocalizationInfos(a2_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[273]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[274]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[275]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[276]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[277]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[278]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_bento_language_bentocomp_flowcontrol_Seq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Seq"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_FeatureRef"
    // Bento.g:3460:1: parse_bento_language_bentocomp_flowcontrol_FeatureRef returns [bento.language.bentocomp.flowcontrol.FeatureRef element = null] : (a0= TEXT ) ;
    public final bento.language.bentocomp.flowcontrol.FeatureRef parse_bento_language_bentocomp_flowcontrol_FeatureRef() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.FeatureRef element =  null;

        int parse_bento_language_bentocomp_flowcontrol_FeatureRef_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Bento.g:3463:2: ( (a0= TEXT ) )
            // Bento.g:3464:2: (a0= TEXT )
            {
            // Bento.g:3464:2: (a0= TEXT )
            // Bento.g:3465:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_FeatureRef3871); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[279]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_bento_language_bentocomp_flowcontrol_FeatureRef_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_FeatureRef"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_AtlTemplate"
    // Bento.g:3506:1: parse_bento_language_bentocomp_technologies_AtlTemplate returns [bento.language.bentocomp.technologies.AtlTemplate element = null] : a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )* ;
    public final bento.language.bentocomp.technologies.AtlTemplate parse_bento_language_bentocomp_technologies_AtlTemplate() throws RecognitionException {
        bento.language.bentocomp.technologies.AtlTemplate element =  null;

        int parse_bento_language_bentocomp_technologies_AtlTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        bento.language.bentocomp.technologies.AtlParameter a3_0 =null;

        bento.language.bentocomp.technologies.AtlParameter a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Bento.g:3509:2: (a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )* )
            // Bento.g:3510:2: a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )*
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_bento_language_bentocomp_technologies_AtlTemplate3907); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[280]);
            	}

            // Bento.g:3524:2: (a1= QUOTED_34_34 )
            // Bento.g:3525:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_AtlTemplate3925); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[281]);
            	}

            a2=(Token)match(input,38,FOLLOW_38_in_parse_bento_language_bentocomp_technologies_AtlTemplate3946); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[282]);
            	}

            // Bento.g:3574:2: (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            // Bento.g:3575:3: a3_0= parse_bento_language_bentocomp_technologies_AtlParameter
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate3964);
            a3_0=parse_bento_language_bentocomp_technologies_AtlParameter();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[283]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[284]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[285]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[286]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[287]);
            	}

            // Bento.g:3604:2: ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==13) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Bento.g:3605:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) )
            	    {
            	    // Bento.g:3605:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) )
            	    // Bento.g:3606:4: a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            	    {
            	    a4=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_technologies_AtlTemplate3991); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[288]);
            	    			}

            	    // Bento.g:3620:4: (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            	    // Bento.g:3621:5: a5_0= parse_bento_language_bentocomp_technologies_AtlParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate4017);
            	    a5_0=parse_bento_language_bentocomp_technologies_AtlParameter();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[289]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[290]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[291]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[292]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[293]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[294]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[295]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[296]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[297]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[298]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_bento_language_bentocomp_technologies_AtlTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_AtlTemplate"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_AtlParameter"
    // Bento.g:3663:1: parse_bento_language_bentocomp_technologies_AtlParameter returns [bento.language.bentocomp.technologies.AtlParameter element = null] : (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT ) ;
    public final bento.language.bentocomp.technologies.AtlParameter parse_bento_language_bentocomp_technologies_AtlParameter() throws RecognitionException {
        bento.language.bentocomp.technologies.AtlParameter element =  null;

        int parse_bento_language_bentocomp_technologies_AtlParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Bento.g:3666:2: ( (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT ) )
            // Bento.g:3667:2: (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT )
            {
            // Bento.g:3667:2: (a0= TEXT )
            // Bento.g:3668:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4077); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[299]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[300]);
            	}

            // Bento.g:3704:2: ( (a1= ':' (a2= TEXT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Bento.g:3705:3: (a1= ':' (a2= TEXT ) )
                    {
                    // Bento.g:3705:3: (a1= ':' (a2= TEXT ) )
                    // Bento.g:3706:4: a1= ':' (a2= TEXT )
                    {
                    a1=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_technologies_AtlParameter4107); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[301]);
                    			}

                    // Bento.g:3720:4: (a2= TEXT )
                    // Bento.g:3721:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4133); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[302]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[303]);
            	}

            a3=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_technologies_AtlParameter4179); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[304]);
            	}

            // Bento.g:3777:2: (a4= TEXT )
            // Bento.g:3778:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4197); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[305]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[306]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[307]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[308]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[309]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_bento_language_bentocomp_technologies_AtlParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_AtlParameter"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_JavaTemplate"
    // Bento.g:3823:1: parse_bento_language_bentocomp_technologies_JavaTemplate returns [bento.language.bentocomp.technologies.JavaTemplate element = null] : a0= 'java' (a1= QUOTED_34_34 ) ;
    public final bento.language.bentocomp.technologies.JavaTemplate parse_bento_language_bentocomp_technologies_JavaTemplate() throws RecognitionException {
        bento.language.bentocomp.technologies.JavaTemplate element =  null;

        int parse_bento_language_bentocomp_technologies_JavaTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Bento.g:3826:2: (a0= 'java' (a1= QUOTED_34_34 ) )
            // Bento.g:3827:2: a0= 'java' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_bento_language_bentocomp_technologies_JavaTemplate4233); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createJavaTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[310]);
            	}

            // Bento.g:3841:2: (a1= QUOTED_34_34 )
            // Bento.g:3842:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_JavaTemplate4251); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[311]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[312]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[313]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[314]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_bento_language_bentocomp_technologies_JavaTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_JavaTemplate"



    // $ANTLR start "parse_bento_language_bentocomp_core_Component"
    // Bento.g:3882:1: parse_bento_language_bentocomp_core_Component returns [bento.language.bentocomp.core.Component element = null] : (c0= parse_bento_language_bentocomp_core_TransformationComponent |c1= parse_bento_language_bentocomp_core_CompositeComponent );
    public final bento.language.bentocomp.core.Component parse_bento_language_bentocomp_core_Component() throws RecognitionException {
        bento.language.bentocomp.core.Component element =  null;

        int parse_bento_language_bentocomp_core_Component_StartIndex = input.index();

        bento.language.bentocomp.core.TransformationComponent c0 =null;

        bento.language.bentocomp.core.CompositeComponent c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Bento.g:3883:2: (c0= parse_bento_language_bentocomp_core_TransformationComponent |c1= parse_bento_language_bentocomp_core_CompositeComponent )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            else if ( (LA30_0==23) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // Bento.g:3884:2: c0= parse_bento_language_bentocomp_core_TransformationComponent
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_TransformationComponent_in_parse_bento_language_bentocomp_core_Component4283);
                    c0=parse_bento_language_bentocomp_core_TransformationComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:3885:4: c1= parse_bento_language_bentocomp_core_CompositeComponent
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_CompositeComponent_in_parse_bento_language_bentocomp_core_Component4293);
                    c1=parse_bento_language_bentocomp_core_CompositeComponent();

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
            if ( state.backtracking>0 ) { memoize(input, 21, parse_bento_language_bentocomp_core_Component_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Component"



    // $ANTLR start "parse_bento_language_bentocomp_variants_Parameter"
    // Bento.g:3889:1: parse_bento_language_bentocomp_variants_Parameter returns [bento.language.bentocomp.variants.Parameter element = null] : (c0= parse_bento_language_bentocomp_variants_SingleFeature |c1= parse_bento_language_bentocomp_variants_XorFeature );
    public final bento.language.bentocomp.variants.Parameter parse_bento_language_bentocomp_variants_Parameter() throws RecognitionException {
        bento.language.bentocomp.variants.Parameter element =  null;

        int parse_bento_language_bentocomp_variants_Parameter_StartIndex = input.index();

        bento.language.bentocomp.variants.SingleFeature c0 =null;

        bento.language.bentocomp.variants.XorFeature c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Bento.g:3890:2: (c0= parse_bento_language_bentocomp_variants_SingleFeature |c1= parse_bento_language_bentocomp_variants_XorFeature )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            else if ( (LA31_0==12) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // Bento.g:3891:2: c0= parse_bento_language_bentocomp_variants_SingleFeature
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_SingleFeature_in_parse_bento_language_bentocomp_variants_Parameter4314);
                    c0=parse_bento_language_bentocomp_variants_SingleFeature();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:3892:4: c1= parse_bento_language_bentocomp_variants_XorFeature
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_XorFeature_in_parse_bento_language_bentocomp_variants_Parameter4324);
                    c1=parse_bento_language_bentocomp_variants_XorFeature();

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
            if ( state.backtracking>0 ) { memoize(input, 22, parse_bento_language_bentocomp_variants_Parameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_variants_Parameter"



    // $ANTLR start "parse_bento_language_bentocomp_core_Template"
    // Bento.g:3896:1: parse_bento_language_bentocomp_core_Template returns [bento.language.bentocomp.core.Template element = null] : (c0= parse_bento_language_bentocomp_technologies_AtlTemplate |c1= parse_bento_language_bentocomp_technologies_JavaTemplate );
    public final bento.language.bentocomp.core.Template parse_bento_language_bentocomp_core_Template() throws RecognitionException {
        bento.language.bentocomp.core.Template element =  null;

        int parse_bento_language_bentocomp_core_Template_StartIndex = input.index();

        bento.language.bentocomp.technologies.AtlTemplate c0 =null;

        bento.language.bentocomp.technologies.JavaTemplate c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Bento.g:3897:2: (c0= parse_bento_language_bentocomp_technologies_AtlTemplate |c1= parse_bento_language_bentocomp_technologies_JavaTemplate )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            else if ( (LA32_0==27) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Bento.g:3898:2: c0= parse_bento_language_bentocomp_technologies_AtlTemplate
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlTemplate_in_parse_bento_language_bentocomp_core_Template4345);
                    c0=parse_bento_language_bentocomp_technologies_AtlTemplate();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:3899:4: c1= parse_bento_language_bentocomp_technologies_JavaTemplate
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_JavaTemplate_in_parse_bento_language_bentocomp_core_Template4355);
                    c1=parse_bento_language_bentocomp_technologies_JavaTemplate();

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
            if ( state.backtracking>0 ) { memoize(input, 23, parse_bento_language_bentocomp_core_Template_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Template"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_CompositionStep"
    // Bento.g:3903:1: parse_bento_language_bentocomp_flowcontrol_CompositionStep returns [bento.language.bentocomp.flowcontrol.CompositionStep element = null] : (c0= parse_bento_language_bentocomp_flowcontrol_Xor |c1= parse_bento_language_bentocomp_flowcontrol_Apply |c2= parse_bento_language_bentocomp_flowcontrol_Seq );
    public final bento.language.bentocomp.flowcontrol.CompositionStep parse_bento_language_bentocomp_flowcontrol_CompositionStep() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.CompositionStep element =  null;

        int parse_bento_language_bentocomp_flowcontrol_CompositionStep_StartIndex = input.index();

        bento.language.bentocomp.flowcontrol.Xor c0 =null;

        bento.language.bentocomp.flowcontrol.Apply c1 =null;

        bento.language.bentocomp.flowcontrol.Seq c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Bento.g:3904:2: (c0= parse_bento_language_bentocomp_flowcontrol_Xor |c1= parse_bento_language_bentocomp_flowcontrol_Apply |c2= parse_bento_language_bentocomp_flowcontrol_Seq )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 18:
                {
                alt33=2;
                }
                break;
            case 29:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // Bento.g:3905:2: c0= parse_bento_language_bentocomp_flowcontrol_Xor
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Xor_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep4376);
                    c0=parse_bento_language_bentocomp_flowcontrol_Xor();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:3906:4: c1= parse_bento_language_bentocomp_flowcontrol_Apply
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Apply_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep4386);
                    c1=parse_bento_language_bentocomp_flowcontrol_Apply();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Bento.g:3907:4: c2= parse_bento_language_bentocomp_flowcontrol_Seq
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Seq_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep4396);
                    c2=parse_bento_language_bentocomp_flowcontrol_Seq();

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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_bento_language_bentocomp_flowcontrol_CompositionStep_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_CompositionStep"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_BooleanValue"
    // Bento.g:3911:1: parse_bento_language_bentocomp_flowcontrol_BooleanValue returns [bento.language.bentocomp.flowcontrol.BooleanValue element = null] : c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef ;
    public final bento.language.bentocomp.flowcontrol.BooleanValue parse_bento_language_bentocomp_flowcontrol_BooleanValue() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.BooleanValue element =  null;

        int parse_bento_language_bentocomp_flowcontrol_BooleanValue_StartIndex = input.index();

        bento.language.bentocomp.flowcontrol.FeatureRef c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Bento.g:3912:2: (c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef )
            // Bento.g:3913:2: c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_FeatureRef_in_parse_bento_language_bentocomp_flowcontrol_BooleanValue4417);
            c0=parse_bento_language_bentocomp_flowcontrol_FeatureRef();

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
            if ( state.backtracking>0 ) { memoize(input, 25, parse_bento_language_bentocomp_flowcontrol_BooleanValue_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_BooleanValue"

    // $ANTLR start synpred22_Bento
    public final void synpred22_Bento_fragment() throws RecognitionException {
        Token a1=null;
        bento.language.bentocomp.flowcontrol.XorCond a2_0 =null;


        // Bento.g:2774:3: ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )
        // Bento.g:2774:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
        {
        // Bento.g:2774:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
        // Bento.g:2775:4: a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
        {
        a1=(Token)match(input,37,FOLLOW_37_in_synpred22_Bento3131); if (state.failed) return ;

        // Bento.g:2789:4: (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
        // Bento.g:2790:5: a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_synpred22_Bento3157);
        a2_0=parse_bento_language_bentocomp_flowcontrol_XorCond();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred22_Bento

    // $ANTLR start synpred27_Bento
    public final void synpred27_Bento_fragment() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;


        // Bento.g:3426:3: ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
        // Bento.g:3426:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
        {
        // Bento.g:3426:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
        // Bento.g:3427:4: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_synpred27_Bento3826);
        a2_0=parse_bento_language_bentocomp_flowcontrol_CompositionStep();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred27_Bento

    // Delegated rules

    public final boolean synpred27_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Bento_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Bento_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_bento_language_bentocomp_dsl_DefinitionRoot_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Component_in_parse_bento_language_bentocomp_dsl_DefinitionRoot119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_core_TransformationComponent166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_TransformationComponent184 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_bento_language_bentocomp_core_TransformationComponent205 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_bento_language_bentocomp_core_TransformationComponent234 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent264 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_core_TransformationComponent316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent346 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_bento_language_bentocomp_core_TransformationComponent398 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent428 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_core_TransformationComponent480 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent510 = new BitSet(new long[]{0x0000000844000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_core_TransformationComponent578 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_TransformationComponent619 = new BitSet(new long[]{0x0000000004005000L});
    public static final BitSet FOLLOW_26_in_parse_bento_language_bentocomp_core_TransformationComponent693 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Template_in_parse_bento_language_bentocomp_core_TransformationComponent711 = new BitSet(new long[]{0x0000021082000000L});
    public static final BitSet FOLLOW_36_in_parse_bento_language_bentocomp_core_TransformationComponent738 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent764 = new BitSet(new long[]{0x0000020082000000L});
    public static final BitSet FOLLOW_25_in_parse_bento_language_bentocomp_core_TransformationComponent819 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent852 = new BitSet(new long[]{0x0000020080002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent908 = new BitSet(new long[]{0x0000020080002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent973 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent1016 = new BitSet(new long[]{0x0000020080002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent1090 = new BitSet(new long[]{0x0000020080002000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_core_TransformationComponent1205 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1231 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1272 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1306 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_41_in_parse_bento_language_bentocomp_core_TransformationComponent1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_bento_language_bentocomp_core_Concept1409 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Concept1427 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_core_Concept1448 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Concept1466 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_core_Concept1496 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1522 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_Concept1563 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1597 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_28_in_parse_bento_language_bentocomp_core_ParameterModel1686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1704 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_core_ParameterModel1725 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1743 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_core_ParameterModel1773 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_ParameterModel1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Tag1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Tag1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_bento_language_bentocomp_variants_SingleFeature1929 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_SingleFeature1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_bento_language_bentocomp_variants_XorFeature1983 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_XorFeature2001 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_bento_language_bentocomp_variants_XorFeature2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_bento_language_bentocomp_core_CompositeComponent2051 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_core_CompositeComponent2065 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_CompositeComponent2083 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_bento_language_bentocomp_core_CompositeComponent2104 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_bento_language_bentocomp_core_CompositeComponent2127 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_CompositeComponent2153 = new BitSet(new long[]{0x0000000440100000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_core_CompositeComponent2214 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_30_in_parse_bento_language_bentocomp_core_CompositeComponent2270 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent2300 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_core_CompositeComponent2352 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent2382 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_bento_language_bentocomp_core_CompositeComponent2434 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent2464 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_core_CompositeComponent2516 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent2546 = new BitSet(new long[]{0x0000000840400000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent2614 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_CompositeComponent2655 = new BitSet(new long[]{0x0000000000405000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_core_CompositeComponent2733 = new BitSet(new long[]{0x0000020080000000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_core_CompositeComponent2760 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent2786 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_CompositeComponent2827 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent2861 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_41_in_parse_bento_language_bentocomp_core_CompositeComponent2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_bento_language_bentocomp_core_BindingDeclaration2964 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_BindingDeclaration2982 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_core_BindingDeclaration3003 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_BindingDeclaration3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_bento_language_bentocomp_flowcontrol_Composition3057 = new BitSet(new long[]{0x0000008020040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Composition3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_bento_language_bentocomp_flowcontrol_Xor3108 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_bento_language_bentocomp_flowcontrol_Xor3131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_parse_bento_language_bentocomp_flowcontrol_Xor3157 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_BooleanValue_in_parse_bento_language_bentocomp_flowcontrol_XorCond3217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_XorCond3235 = new BitSet(new long[]{0x0000008020040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_XorCond3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_bento_language_bentocomp_flowcontrol_Apply3286 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_Apply3304 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply3325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3343 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply3370 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3396 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply3437 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_Apply3451 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply3465 = new BitSet(new long[]{0x0000000000002900L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3488 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply3523 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply3549 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3666 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3693 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3715 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_bento_language_bentocomp_flowcontrol_Seq3781 = new BitSet(new long[]{0x0000008020040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq3799 = new BitSet(new long[]{0x0000008020040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq3826 = new BitSet(new long[]{0x0000008020040002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_FeatureRef3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_bento_language_bentocomp_technologies_AtlTemplate3907 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_AtlTemplate3925 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_bento_language_bentocomp_technologies_AtlTemplate3946 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate3964 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_technologies_AtlTemplate3991 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate4017 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4077 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_technologies_AtlParameter4107 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4133 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_technologies_AtlParameter4179 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_bento_language_bentocomp_technologies_JavaTemplate4233 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_JavaTemplate4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_TransformationComponent_in_parse_bento_language_bentocomp_core_Component4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_CompositeComponent_in_parse_bento_language_bentocomp_core_Component4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_SingleFeature_in_parse_bento_language_bentocomp_variants_Parameter4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_XorFeature_in_parse_bento_language_bentocomp_variants_Parameter4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlTemplate_in_parse_bento_language_bentocomp_core_Template4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_JavaTemplate_in_parse_bento_language_bentocomp_core_Template4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Xor_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Apply_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Seq_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_FeatureRef_in_parse_bento_language_bentocomp_flowcontrol_BooleanValue4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred22_Bento3131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_synpred22_Bento3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_synpred27_Bento3826 = new BitSet(new long[]{0x0000000000000002L});

}