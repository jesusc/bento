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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LINEBREAK", "QNAME", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "'+'", "','", "'-'", "'->'", "':'", "'='", "'apply'", "'atl'", "'binding'", "'component'", "'compose'", "'composite'", "'concept'", "'contributos'", "'definition'", "'execution'", "'java'", "'model'", "'seq'", "'source'", "'tags'", "'target'", "'transformation'", "'uses'", "'variants'", "'version'", "'when'", "'with'", "'xor'", "'{'", "'}'"
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
    public static final int T__42=42;
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
        this.state.initializeRuleMemo(74 + 1);
         

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
    		int followSetID = 180;
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
    // Bento.g:556:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        bento.language.bentocomp.dsl.DefinitionRoot c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Bento.g:557:2: ( (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF )
            // Bento.g:558:2: (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[2]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Bento.g:565:2: (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot )
            // Bento.g:566:3: c0= parse_bento_language_bentocomp_dsl_DefinitionRoot
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
    // Bento.g:574:1: parse_bento_language_bentocomp_dsl_DefinitionRoot returns [bento.language.bentocomp.dsl.DefinitionRoot element = null] : (a0_0= parse_bento_language_bentocomp_core_Component ) ;
    public final bento.language.bentocomp.dsl.DefinitionRoot parse_bento_language_bentocomp_dsl_DefinitionRoot() throws RecognitionException {
        bento.language.bentocomp.dsl.DefinitionRoot element =  null;

        int parse_bento_language_bentocomp_dsl_DefinitionRoot_StartIndex = input.index();

        bento.language.bentocomp.core.Component a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Bento.g:577:2: ( (a0_0= parse_bento_language_bentocomp_core_Component ) )
            // Bento.g:578:2: (a0_0= parse_bento_language_bentocomp_core_Component )
            {
            // Bento.g:578:2: (a0_0= parse_bento_language_bentocomp_core_Component )
            // Bento.g:579:3: a0_0= parse_bento_language_bentocomp_core_Component
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
    // Bento.g:605:1: parse_bento_language_bentocomp_core_TransformationComponent returns [bento.language.bentocomp.core.TransformationComponent element = null] : a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}' ;
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

            // Bento.g:608:2: (a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}' )
            // Bento.g:609:2: a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}'
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_bento_language_bentocomp_core_TransformationComponent152); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[3]);
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[4]);
            	}

            // Bento.g:637:2: (a2= QNAME )
            // Bento.g:638:3: a2= QNAME
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[5]);
            	}

            a3=(Token)match(input,41,FOLLOW_41_in_parse_bento_language_bentocomp_core_TransformationComponent205); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[6]);
            	}

            // Bento.g:687:2: ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ )
            // Bento.g:688:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            {
            // Bento.g:688:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+
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
            	    // Bento.g:689:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:689:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:690:5: a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a4=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_core_TransformationComponent234); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[7]);
            	    				}

            	    // Bento.g:704:5: (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:705:6: a5_0= parse_bento_language_bentocomp_core_Concept
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[8]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[9]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[10]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[11]);
            		}

            // Bento.g:739:3: ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==33) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Bento.g:740:4: (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:740:4: (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:741:5: a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a6=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent326); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[12]);
            	    				}

            	    // Bento.g:755:5: (a7_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:756:6: a7_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent356);
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[13]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[14]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[15]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[16]);
            		}

            // Bento.g:790:3: ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Bento.g:791:4: (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:791:4: (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:792:5: a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a8=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_core_TransformationComponent418); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[17]);
            	    				}

            	    // Bento.g:806:5: (a9_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:807:6: a9_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent448);
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[18]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[19]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[20]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[21]);
            		}

            // Bento.g:841:3: ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Bento.g:842:4: (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:842:4: (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:843:5: a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a10=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent510); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[22]);
            	    				}

            	    // Bento.g:857:5: (a11_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:858:6: a11_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent540);
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[23]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[24]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[25]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[26]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[27]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[28]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[29]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[30]);
            	}

            // Bento.g:901:2: ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Bento.g:902:3: (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    {
                    // Bento.g:902:3: (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    // Bento.g:903:4: a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    {
                    a12=(Token)match(input,36,FOLLOW_36_in_parse_bento_language_bentocomp_core_TransformationComponent607); if (state.failed) return element;

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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[31]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[32]);
                    			}

                    // Bento.g:918:4: ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12||LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Bento.g:919:5: ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    {
                    	    // Bento.g:919:5: ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    // Bento.g:920:6: (a13_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    {
                    	    // Bento.g:920:6: (a13_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    // Bento.g:921:7: a13_0= parse_bento_language_bentocomp_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_TransformationComponent648);
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
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[33]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[34]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[35]);
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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[36]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[37]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[38]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[39]);
            	}

            a14=(Token)match(input,26,FOLLOW_26_in_parse_bento_language_bentocomp_core_TransformationComponent722); if (state.failed) return element;

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
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[40]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[41]);
            	}

            // Bento.g:979:2: (a15_0= parse_bento_language_bentocomp_core_Template )
            // Bento.g:980:3: a15_0= parse_bento_language_bentocomp_core_Template
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Template_in_parse_bento_language_bentocomp_core_TransformationComponent740);
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[43]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[44]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[45]);
            	}

            // Bento.g:1008:2: ( (a16= 'version' (a17= QUOTED_34_34 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Bento.g:1009:3: (a16= 'version' (a17= QUOTED_34_34 ) )
                    {
                    // Bento.g:1009:3: (a16= 'version' (a17= QUOTED_34_34 ) )
                    // Bento.g:1010:4: a16= 'version' (a17= QUOTED_34_34 )
                    {
                    a16=(Token)match(input,37,FOLLOW_37_in_parse_bento_language_bentocomp_core_TransformationComponent767); if (state.failed) return element;

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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[46]);
                    			}

                    // Bento.g:1024:4: (a17= QUOTED_34_34 )
                    // Bento.g:1025:5: a17= QUOTED_34_34
                    {
                    a17=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent793); if (state.failed) return element;

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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[47]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[48]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[49]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[50]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[51]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[52]);
            	}

            // Bento.g:1071:2: ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Bento.g:1072:3: (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* )
                    {
                    // Bento.g:1072:3: (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* )
                    // Bento.g:1073:4: a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )*
                    {
                    a18=(Token)match(input,25,FOLLOW_25_in_parse_bento_language_bentocomp_core_TransformationComponent848); if (state.failed) return element;

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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[53]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[54]);
                    			}

                    // Bento.g:1088:4: ( (a19= TEXT ) | (a20= QUOTED_34_34 ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==TEXT) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==QUOTED_34_34) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }
                    switch (alt8) {
                        case 1 :
                            // Bento.g:1089:5: (a19= TEXT )
                            {
                            // Bento.g:1089:5: (a19= TEXT )
                            // Bento.g:1090:6: a19= TEXT
                            {
                            a19=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent881); if (state.failed) return element;

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
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[55]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[56]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[57]);
                            				}

                            }
                            break;
                        case 2 :
                            // Bento.g:1128:10: (a20= QUOTED_34_34 )
                            {
                            // Bento.g:1128:10: (a20= QUOTED_34_34 )
                            // Bento.g:1129:6: a20= QUOTED_34_34
                            {
                            a20=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent937); if (state.failed) return element;

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
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[58]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[59]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[60]);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[61]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[62]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[63]);
                    			}

                    // Bento.g:1174:4: ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Bento.g:1175:5: (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) )
                    	    {
                    	    // Bento.g:1175:5: (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) )
                    	    // Bento.g:1176:6: a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) )
                    	    {
                    	    a21=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1002); if (state.failed) return element;

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
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[64]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[65]);
                    	    					}

                    	    // Bento.g:1191:6: ( (a22= TEXT ) | (a23= QUOTED_34_34 ) )
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==TEXT) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==QUOTED_34_34) ) {
                    	        alt9=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return element;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // Bento.g:1192:7: (a22= TEXT )
                    	            {
                    	            // Bento.g:1192:7: (a22= TEXT )
                    	            // Bento.g:1193:8: a22= TEXT
                    	            {
                    	            a22=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent1045); if (state.failed) return element;

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
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[66]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[67]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[68]);
                    	            						}

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Bento.g:1231:14: (a23= QUOTED_34_34 )
                    	            {
                    	            // Bento.g:1231:14: (a23= QUOTED_34_34 )
                    	            // Bento.g:1232:8: a23= QUOTED_34_34
                    	            {
                    	            a23=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent1119); if (state.failed) return element;

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
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[69]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[70]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[71]);
                    	            						}

                    	            }
                    	            break;

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[72]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[73]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[74]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[75]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[76]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[77]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[78]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[79]);
            	}

            // Bento.g:1294:2: ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Bento.g:1295:3: (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:1295:3: (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:1296:4: a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a24=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_core_TransformationComponent1234); if (state.failed) return element;

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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[80]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[81]);
                    			}

                    // Bento.g:1311:4: (a25_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:1312:5: a25_0= parse_bento_language_bentocomp_core_Tag
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1260);
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[82]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[83]);
                    			}

                    // Bento.g:1338:4: ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Bento.g:1339:5: (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:1339:5: (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:1340:6: a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag )
                    	    {
                    	    a26=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1301); if (state.failed) return element;

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
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[84]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[85]);
                    	    					}

                    	    // Bento.g:1355:6: (a27_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:1356:7: a27_0= parse_bento_language_bentocomp_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1335);
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
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[86]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[87]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[88]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[89]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[90]);
            	}

            a28=(Token)match(input,42,FOLLOW_42_in_parse_bento_language_bentocomp_core_TransformationComponent1409); if (state.failed) return element;

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
    // Bento.g:1412:1: parse_bento_language_bentocomp_core_Concept returns [bento.language.bentocomp.core.Concept element = null] : a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? ;
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

            // Bento.g:1415:2: (a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? )
            // Bento.g:1416:2: a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_bento_language_bentocomp_core_Concept1438); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[91]);
            	}

            // Bento.g:1430:2: (a1= TEXT )
            // Bento.g:1431:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Concept1456); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[92]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_core_Concept1477); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[93]);
            	}

            // Bento.g:1480:2: (a3= QUOTED_34_34 )
            // Bento.g:1481:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Concept1495); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[94]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[95]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[96]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[97]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[98]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[99]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[100]);
            	}

            // Bento.g:1522:2: ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Bento.g:1523:3: (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:1523:3: (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:1524:4: a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a4=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_core_Concept1525); if (state.failed) return element;

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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[101]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[102]);
                    			}

                    // Bento.g:1539:4: (a5_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:1540:5: a5_0= parse_bento_language_bentocomp_core_Tag
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1551);
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[103]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[104]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[105]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[106]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[107]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[108]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[109]);
                    			}

                    // Bento.g:1571:4: ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Bento.g:1572:5: (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:1572:5: (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:1573:6: a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag )
                    	    {
                    	    a6=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_Concept1592); if (state.failed) return element;

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
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[110]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[111]);
                    	    					}

                    	    // Bento.g:1588:6: (a7_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:1589:7: a7_0= parse_bento_language_bentocomp_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1626);
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
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[112]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[113]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[114]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[115]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[116]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[117]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[118]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[119]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[120]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[121]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[122]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[123]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[124]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[125]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[126]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[127]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[128]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[129]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[130]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[131]);
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
    // Bento.g:1647:1: parse_bento_language_bentocomp_core_ParameterModel returns [bento.language.bentocomp.core.ParameterModel element = null] : a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? ;
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

            // Bento.g:1650:2: (a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? )
            // Bento.g:1651:2: a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_bento_language_bentocomp_core_ParameterModel1715); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[132]);
            	}

            // Bento.g:1665:2: (a1= TEXT )
            // Bento.g:1666:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1733); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[133]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_core_ParameterModel1754); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[134]);
            	}

            // Bento.g:1715:2: (a3= TEXT )
            // Bento.g:1716:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1772); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[135]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[136]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[137]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[138]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[139]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[140]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[141]);
            	}

            // Bento.g:1761:2: ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Bento.g:1762:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    {
                    // Bento.g:1762:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    // Bento.g:1763:4: a4= '=' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_core_ParameterModel1802); if (state.failed) return element;

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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[142]);
                    			}

                    // Bento.g:1777:4: (a5= QUOTED_34_34 )
                    // Bento.g:1778:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_ParameterModel1828); if (state.failed) return element;

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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[143]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[144]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[145]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[146]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[147]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[148]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[149]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[150]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[151]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[152]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[153]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[154]);
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
    // Bento.g:1832:1: parse_bento_language_bentocomp_core_Tag returns [bento.language.bentocomp.core.Tag element = null] : ( (a0= TEXT ) | (a1= QUOTED_34_34 ) );
    public final bento.language.bentocomp.core.Tag parse_bento_language_bentocomp_core_Tag() throws RecognitionException {
        bento.language.bentocomp.core.Tag element =  null;

        int parse_bento_language_bentocomp_core_Tag_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Bento.g:1835:2: ( (a0= TEXT ) | (a1= QUOTED_34_34 ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==TEXT) ) {
                alt17=1;
            }
            else if ( (LA17_0==QUOTED_34_34) ) {
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
                    // Bento.g:1836:2: (a0= TEXT )
                    {
                    // Bento.g:1836:2: (a0= TEXT )
                    // Bento.g:1837:3: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Tag1893); if (state.failed) return element;

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
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[155]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[156]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[157]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[158]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[159]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[160]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[161]);
                    	}

                    }
                    break;
                case 2 :
                    // Bento.g:1879:4: (a1= QUOTED_34_34 )
                    {
                    // Bento.g:1879:4: (a1= QUOTED_34_34 )
                    // Bento.g:1880:3: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Tag1922); if (state.failed) return element;

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
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[162]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[163]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[164]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[165]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[166]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[167]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[168]);
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
    // Bento.g:1923:1: parse_bento_language_bentocomp_variants_SingleFeature returns [bento.language.bentocomp.variants.SingleFeature element = null] : a0= '-' (a1= TEXT ) ;
    public final bento.language.bentocomp.variants.SingleFeature parse_bento_language_bentocomp_variants_SingleFeature() throws RecognitionException {
        bento.language.bentocomp.variants.SingleFeature element =  null;

        int parse_bento_language_bentocomp_variants_SingleFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Bento.g:1926:2: (a0= '-' (a1= TEXT ) )
            // Bento.g:1927:2: a0= '-' (a1= TEXT )
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_bento_language_bentocomp_variants_SingleFeature1958); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[169]);
            	}

            // Bento.g:1941:2: (a1= TEXT )
            // Bento.g:1942:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_SingleFeature1976); if (state.failed) return element;

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
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[170]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[171]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[172]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[173]);
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
    // Bento.g:1982:1: parse_bento_language_bentocomp_variants_XorFeature returns [bento.language.bentocomp.variants.XorFeature element = null] : a0= '+' (a1= TEXT ) a2= 'xor' ;
    public final bento.language.bentocomp.variants.XorFeature parse_bento_language_bentocomp_variants_XorFeature() throws RecognitionException {
        bento.language.bentocomp.variants.XorFeature element =  null;

        int parse_bento_language_bentocomp_variants_XorFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Bento.g:1985:2: (a0= '+' (a1= TEXT ) a2= 'xor' )
            // Bento.g:1986:2: a0= '+' (a1= TEXT ) a2= 'xor'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_bento_language_bentocomp_variants_XorFeature2012); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[174]);
            	}

            // Bento.g:2000:2: (a1= TEXT )
            // Bento.g:2001:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_XorFeature2030); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[175]);
            	}

            a2=(Token)match(input,40,FOLLOW_40_in_parse_bento_language_bentocomp_variants_XorFeature2051); if (state.failed) return element;

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
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[176]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[177]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[178]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[179]);
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



    // $ANTLR start "parse_bento_language_bentocomp_dsl_ComponentExecution"
    // Bento.g:2055:1: parse_bento_language_bentocomp_dsl_ComponentExecution returns [bento.language.bentocomp.dsl.ComponentExecution element = null] : a0= 'component' a1= 'execution' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition ) a16= '}' ;
    public final bento.language.bentocomp.dsl.ComponentExecution parse_bento_language_bentocomp_dsl_ComponentExecution() throws RecognitionException {
        bento.language.bentocomp.dsl.ComponentExecution element =  null;

        int parse_bento_language_bentocomp_dsl_ComponentExecution_StartIndex = input.index();

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
        Token a16=null;
        bento.language.bentocomp.core.BindingDeclaration a6_0 =null;

        bento.language.bentocomp.core.Concept a8_0 =null;

        bento.language.bentocomp.core.Concept a10_0 =null;

        bento.language.bentocomp.core.ParameterModel a12_0 =null;

        bento.language.bentocomp.core.ParameterModel a14_0 =null;

        bento.language.bentocomp.flowcontrol.Composition a15_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Bento.g:2058:2: (a0= 'component' a1= 'execution' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition ) a16= '}' )
            // Bento.g:2059:2: a0= 'component' a1= 'execution' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition ) a16= '}'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_bento_language_bentocomp_dsl_ComponentExecution2080); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[180]);
            	}

            a1=(Token)match(input,27,FOLLOW_27_in_parse_bento_language_bentocomp_dsl_ComponentExecution2094); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[181]);
            	}

            // Bento.g:2087:2: (a2= TEXT )
            // Bento.g:2088:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_dsl_ComponentExecution2112); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[182]);
            	}

            a3=(Token)match(input,41,FOLLOW_41_in_parse_bento_language_bentocomp_dsl_ComponentExecution2133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[183]);
            	}

            // Bento.g:2137:2: ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Bento.g:2138:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    {
            	    // Bento.g:2138:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    // Bento.g:2139:4: a4= 'uses' (a5= QUOTED_34_34 )
            	    {
            	    a4=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_dsl_ComponentExecution2156); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[184]);
            	    			}

            	    // Bento.g:2153:4: (a5= QUOTED_34_34 )
            	    // Bento.g:2154:5: a5= QUOTED_34_34
            	    {
            	    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_dsl_ComponentExecution2182); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_4_0_0_1, proxy, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[185]);
            	    				addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[186]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[187]);
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[188]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[189]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[190]);
            	}

            // Bento.g:2204:2: ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Bento.g:2205:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
            	    {
            	    // Bento.g:2205:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
            	    // Bento.g:2206:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
            	    {
            	    // Bento.g:2206:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
            	    // Bento.g:2207:5: a6_0= parse_bento_language_bentocomp_core_BindingDeclaration
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_dsl_ComponentExecution2243);
            	    a6_0=parse_bento_language_bentocomp_core_BindingDeclaration();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_5_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[191]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[192]);
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
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[193]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[194]);
            	}

            // Bento.g:2241:2: ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ )
            // Bento.g:2242:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            {
            // Bento.g:2242:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Bento.g:2243:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:2243:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:2244:5: a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a7=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_dsl_ComponentExecution2299); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_0_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[195]);
            	    				}

            	    // Bento.g:2258:5: (a8_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:2259:6: a8_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution2329);
            	    a8_0=parse_bento_language_bentocomp_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_0_0_0_1, a8_0, true);
            	    							copyLocalizationInfos(a8_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[196]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[197]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[198]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[199]);
            		}

            // Bento.g:2293:3: ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Bento.g:2294:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:2294:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:2295:5: a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a9=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution2391); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_1_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[200]);
            	    				}

            	    // Bento.g:2309:5: (a10_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:2310:6: a10_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution2421);
            	    a10_0=parse_bento_language_bentocomp_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_1_0_0_1, a10_0, true);
            	    							copyLocalizationInfos(a10_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[201]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[202]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[203]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[204]);
            		}

            // Bento.g:2344:3: ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Bento.g:2345:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:2345:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:2346:5: a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a11=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_dsl_ComponentExecution2483); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_2_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[205]);
            	    				}

            	    // Bento.g:2360:5: (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:2361:6: a12_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution2513);
            	    a12_0=parse_bento_language_bentocomp_core_ParameterModel();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_2_0_0_1, a12_0, true);
            	    							copyLocalizationInfos(a12_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[206]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[207]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[208]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[209]);
            		}

            // Bento.g:2395:3: ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Bento.g:2396:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:2396:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:2397:5: a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a13=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution2575); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_3_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[210]);
            	    				}

            	    // Bento.g:2411:5: (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:2412:6: a14_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution2605);
            	    a14_0=parse_bento_language_bentocomp_core_ParameterModel();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_6_0_0_3_0_0_1, a14_0, true);
            	    							copyLocalizationInfos(a14_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[211]);
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[212]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[213]);
            			addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[214]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[215]);
            	}

            // Bento.g:2452:2: (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition )
            // Bento.g:2453:3: a15_0= parse_bento_language_bentocomp_flowcontrol_Composition
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_dsl_ComponentExecution2667);
            a15_0=parse_bento_language_bentocomp_flowcontrol_Composition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_7, a15_0, true);
            				copyLocalizationInfos(a15_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[216]);
            	}

            a16=(Token)match(input,42,FOLLOW_42_in_parse_bento_language_bentocomp_dsl_ComponentExecution2685); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_8, null, true);
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
            if ( state.backtracking>0 ) { memoize(input, 9, parse_bento_language_bentocomp_dsl_ComponentExecution_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_dsl_ComponentExecution"



    // $ANTLR start "parse_bento_language_bentocomp_core_CompositeComponent"
    // Bento.g:2493:1: parse_bento_language_bentocomp_core_CompositeComponent returns [bento.language.bentocomp.core.CompositeComponent element = null] : (a0= 'composite' a1= 'component' (a2= QNAME ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}' |c0= parse_bento_language_bentocomp_dsl_ComponentExecution );
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

        bento.language.bentocomp.dsl.ComponentExecution c0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Bento.g:2496:2: (a0= 'composite' a1= 'component' (a2= QNAME ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}' |c0= parse_bento_language_bentocomp_dsl_ComponentExecution )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            else if ( (LA34_0==21) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // Bento.g:2497:2: a0= 'composite' a1= 'component' (a2= QNAME ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}'
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_bento_language_bentocomp_core_CompositeComponent2714); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[217]);
                    	}

                    a1=(Token)match(input,21,FOLLOW_21_in_parse_bento_language_bentocomp_core_CompositeComponent2728); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_1, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[218]);
                    	}

                    // Bento.g:2525:2: (a2= QNAME )
                    // Bento.g:2526:3: a2= QNAME
                    {
                    a2=(Token)match(input,QNAME,FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_CompositeComponent2746); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_2, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[219]);
                    	}

                    a3=(Token)match(input,41,FOLLOW_41_in_parse_bento_language_bentocomp_core_CompositeComponent2767); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_3, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[220]);
                    	}

                    // Bento.g:2575:2: ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==35) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Bento.g:2576:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
                    	    {
                    	    // Bento.g:2576:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
                    	    // Bento.g:2577:4: a4= 'uses' (a5= QUOTED_34_34 )
                    	    {
                    	    a4=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent2790); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    				if (element == null) {
                    	    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    					startIncompleteElement(element);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_4_0_0_0, null, true);
                    	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	    			}

                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[221]);
                    	    			}

                    	    // Bento.g:2591:4: (a5= QUOTED_34_34 )
                    	    // Bento.g:2592:5: a5= QUOTED_34_34
                    	    {
                    	    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_CompositeComponent2816); if (state.failed) return element;

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
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_4_0_0_1, proxy, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
                    	    					}
                    	    				}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[222]);
                    	    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[223]);
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[224]);
                    	    			}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[225]);
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[226]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[227]);
                    	}

                    // Bento.g:2642:2: ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==20) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Bento.g:2643:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
                    	    {
                    	    // Bento.g:2643:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
                    	    // Bento.g:2644:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
                    	    {
                    	    // Bento.g:2644:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
                    	    // Bento.g:2645:5: a6_0= parse_bento_language_bentocomp_core_BindingDeclaration
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_core_CompositeComponent2877);
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
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_5_0_0_0, a6_0, true);
                    	    						copyLocalizationInfos(a6_0, element);
                    	    					}
                    	    				}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[228]);
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[229]);
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
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[230]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[231]);
                    	}

                    // Bento.g:2679:2: ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ )
                    // Bento.g:2680:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
                    {
                    // Bento.g:2680:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==31) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Bento.g:2681:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    {
                    	    // Bento.g:2681:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    // Bento.g:2682:5: a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept )
                    	    {
                    	    a7=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_core_CompositeComponent2933); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_0_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[232]);
                    	    				}

                    	    // Bento.g:2696:5: (a8_0= parse_bento_language_bentocomp_core_Concept )
                    	    // Bento.g:2697:6: a8_0= parse_bento_language_bentocomp_core_Concept
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent2963);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_0_0_0_1, a8_0, true);
                    	    							copyLocalizationInfos(a8_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[233]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[234]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[235]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[236]);
                    		}

                    // Bento.g:2731:3: ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==33) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Bento.g:2732:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    {
                    	    // Bento.g:2732:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    // Bento.g:2733:5: a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept )
                    	    {
                    	    a9=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent3025); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_1_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[237]);
                    	    				}

                    	    // Bento.g:2747:5: (a10_0= parse_bento_language_bentocomp_core_Concept )
                    	    // Bento.g:2748:6: a10_0= parse_bento_language_bentocomp_core_Concept
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent3055);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_1_0_0_1, a10_0, true);
                    	    							copyLocalizationInfos(a10_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[238]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[239]);
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
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[240]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[241]);
                    		}

                    // Bento.g:2782:3: ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==31) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Bento.g:2783:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    {
                    	    // Bento.g:2783:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    // Bento.g:2784:5: a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    {
                    	    a11=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_core_CompositeComponent3117); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_2_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[242]);
                    	    				}

                    	    // Bento.g:2798:5: (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    // Bento.g:2799:6: a12_0= parse_bento_language_bentocomp_core_ParameterModel
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent3147);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_2_0_0_1, a12_0, true);
                    	    							copyLocalizationInfos(a12_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[243]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[244]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[245]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[246]);
                    		}

                    // Bento.g:2833:3: ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==33) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Bento.g:2834:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    {
                    	    // Bento.g:2834:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    // Bento.g:2835:5: a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    {
                    	    a13=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent3209); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_3_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[247]);
                    	    				}

                    	    // Bento.g:2849:5: (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    // Bento.g:2850:6: a14_0= parse_bento_language_bentocomp_core_ParameterModel
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent3239);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_3_0_0_1, a14_0, true);
                    	    							copyLocalizationInfos(a14_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[248]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[249]);
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[250]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[251]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[252]);
                    			addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[253]);
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[254]);
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[255]);
                    	}

                    // Bento.g:2893:2: ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==36) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // Bento.g:2894:3: (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                            {
                            // Bento.g:2894:3: (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                            // Bento.g:2895:4: a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                            {
                            a15=(Token)match(input,36,FOLLOW_36_in_parse_bento_language_bentocomp_core_CompositeComponent3306); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            				if (element == null) {
                            					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                            					startIncompleteElement(element);
                            				}
                            				collectHiddenTokens(element);
                            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_7_0_0_0, null, true);
                            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                            			}

                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[256]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[257]);
                            			}

                            // Bento.g:2910:4: ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                            int cnt30=0;
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==12||LA30_0==14) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // Bento.g:2911:5: ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) )
                            	    {
                            	    // Bento.g:2911:5: ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) )
                            	    // Bento.g:2912:6: (a16_0= parse_bento_language_bentocomp_variants_Parameter )
                            	    {
                            	    // Bento.g:2912:6: (a16_0= parse_bento_language_bentocomp_variants_Parameter )
                            	    // Bento.g:2913:7: a16_0= parse_bento_language_bentocomp_variants_Parameter
                            	    {
                            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_CompositeComponent3347);
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
                            	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_7_0_0_1_0_0_0, a16_0, true);
                            	    								copyLocalizationInfos(a16_0, element);
                            	    							}
                            	    						}

                            	    }


                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[258]);
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[259]);
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[260]);
                            	    					}

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt30 >= 1 ) break loop30;
                            	    if (state.backtracking>0) {state.failed=true; return element;}
                                        EarlyExitException eee =
                                            new EarlyExitException(30, input);
                                        throw eee;
                                }
                                cnt30++;
                            } while (true);


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[261]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[262]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[263]);
                            			}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[264]);
                    	}

                    // Bento.g:2956:2: (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition )
                    // Bento.g:2957:3: a17_0= parse_bento_language_bentocomp_flowcontrol_Composition
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_core_CompositeComponent3425);
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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_8, a17_0, true);
                    				copyLocalizationInfos(a17_0, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[265]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[266]);
                    	}

                    // Bento.g:2983:2: ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==32) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Bento.g:2984:3: (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                            {
                            // Bento.g:2984:3: (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                            // Bento.g:2985:4: a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                            {
                            a18=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_core_CompositeComponent3452); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            				if (element == null) {
                            					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                            					startIncompleteElement(element);
                            				}
                            				collectHiddenTokens(element);
                            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_9_0_0_0, null, true);
                            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
                            			}

                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[267]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[268]);
                            			}

                            // Bento.g:3000:4: (a19_0= parse_bento_language_bentocomp_core_Tag )
                            // Bento.g:3001:5: a19_0= parse_bento_language_bentocomp_core_Tag
                            {
                            pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent3478);
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
                            						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_9_0_0_1, a19_0, true);
                            						copyLocalizationInfos(a19_0, element);
                            					}
                            				}

                            }


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[269]);
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[270]);
                            			}

                            // Bento.g:3027:4: ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==13) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // Bento.g:3028:5: (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) )
                            	    {
                            	    // Bento.g:3028:5: (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) )
                            	    // Bento.g:3029:6: a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag )
                            	    {
                            	    a20=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_CompositeComponent3519); if (state.failed) return element;

                            	    if ( state.backtracking==0 ) {
                            	    						if (element == null) {
                            	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                            	    							startIncompleteElement(element);
                            	    						}
                            	    						collectHiddenTokens(element);
                            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_9_0_0_2_0_0_0, null, true);
                            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
                            	    					}

                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[271]);
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[272]);
                            	    					}

                            	    // Bento.g:3044:6: (a21_0= parse_bento_language_bentocomp_core_Tag )
                            	    // Bento.g:3045:7: a21_0= parse_bento_language_bentocomp_core_Tag
                            	    {
                            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent3553);
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
                            	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_9_0_0_2_0_0_1, a21_0, true);
                            	    								copyLocalizationInfos(a21_0, element);
                            	    							}
                            	    						}

                            	    }


                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[273]);
                            	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[274]);
                            	    					}

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[275]);
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[276]);
                            			}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[277]);
                    	}

                    a22=(Token)match(input,42,FOLLOW_42_in_parse_bento_language_bentocomp_core_CompositeComponent3627); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_10, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    	}

                    }
                    break;
                case 2 :
                    // Bento.g:3101:2: c0= parse_bento_language_bentocomp_dsl_ComponentExecution
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_CompositeComponent3646);
                    c0=parse_bento_language_bentocomp_dsl_ComponentExecution();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 10, parse_bento_language_bentocomp_core_CompositeComponent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_CompositeComponent"



    // $ANTLR start "parse_bento_language_bentocomp_core_BindingDeclaration"
    // Bento.g:3105:1: parse_bento_language_bentocomp_core_BindingDeclaration returns [bento.language.bentocomp.core.BindingDeclaration element = null] : a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ;
    public final bento.language.bentocomp.core.BindingDeclaration parse_bento_language_bentocomp_core_BindingDeclaration() throws RecognitionException {
        bento.language.bentocomp.core.BindingDeclaration element =  null;

        int parse_bento_language_bentocomp_core_BindingDeclaration_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Bento.g:3108:2: (a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) )
            // Bento.g:3109:2: a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_bento_language_bentocomp_core_BindingDeclaration3671); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[278]);
            	}

            // Bento.g:3123:2: (a1= TEXT )
            // Bento.g:3124:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_BindingDeclaration3689); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[279]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_core_BindingDeclaration3710); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[280]);
            	}

            // Bento.g:3173:2: (a3= QUOTED_34_34 )
            // Bento.g:3174:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_BindingDeclaration3728); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[281]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[282]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[283]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_bento_language_bentocomp_core_BindingDeclaration_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_BindingDeclaration"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Composition"
    // Bento.g:3213:1: parse_bento_language_bentocomp_flowcontrol_Composition returns [bento.language.bentocomp.flowcontrol.Composition element = null] : a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ;
    public final bento.language.bentocomp.flowcontrol.Composition parse_bento_language_bentocomp_flowcontrol_Composition() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Composition element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Composition_StartIndex = input.index();

        Token a0=null;
        bento.language.bentocomp.flowcontrol.CompositionStep a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Bento.g:3216:2: (a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
            // Bento.g:3217:2: a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_bento_language_bentocomp_flowcontrol_Composition3764); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[284]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[285]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[286]);
            	}

            // Bento.g:3233:2: (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:3234:3: a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Composition3782);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[287]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[288]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[289]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_bento_language_bentocomp_flowcontrol_Composition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Composition"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Xor"
    // Bento.g:3263:1: parse_bento_language_bentocomp_flowcontrol_Xor returns [bento.language.bentocomp.flowcontrol.Xor element = null] : a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+ ;
    public final bento.language.bentocomp.flowcontrol.Xor parse_bento_language_bentocomp_flowcontrol_Xor() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Xor element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Xor_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        bento.language.bentocomp.flowcontrol.XorCond a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Bento.g:3266:2: (a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+ )
            // Bento.g:3267:2: a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+
            {
            a0=(Token)match(input,40,FOLLOW_40_in_parse_bento_language_bentocomp_flowcontrol_Xor3815); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[290]);
            	}

            // Bento.g:3281:2: ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred35_Bento()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // Bento.g:3282:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
            	    {
            	    // Bento.g:3282:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
            	    // Bento.g:3283:4: a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
            	    {
            	    a1=(Token)match(input,38,FOLLOW_38_in_parse_bento_language_bentocomp_flowcontrol_Xor3838); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_1_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[291]);
            	    			}

            	    // Bento.g:3297:4: (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
            	    // Bento.g:3298:5: a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_parse_bento_language_bentocomp_flowcontrol_Xor3864);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_1_0_0_1, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[292]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[293]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[294]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[295]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[296]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[297]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[298]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[299]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[300]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[301]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[302]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[303]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[304]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[305]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_bento_language_bentocomp_flowcontrol_Xor_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Xor"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_XorCond"
    // Bento.g:3344:1: parse_bento_language_bentocomp_flowcontrol_XorCond returns [bento.language.bentocomp.flowcontrol.XorCond element = null] : (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ;
    public final bento.language.bentocomp.flowcontrol.XorCond parse_bento_language_bentocomp_flowcontrol_XorCond() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.XorCond element =  null;

        int parse_bento_language_bentocomp_flowcontrol_XorCond_StartIndex = input.index();

        Token a1=null;
        bento.language.bentocomp.flowcontrol.BooleanValue a0_0 =null;

        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Bento.g:3347:2: ( (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
            // Bento.g:3348:2: (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            {
            // Bento.g:3348:2: (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue )
            // Bento.g:3349:3: a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_BooleanValue_in_parse_bento_language_bentocomp_flowcontrol_XorCond3924);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[306]);
            	}

            a1=(Token)match(input,15,FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_XorCond3942); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[307]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[308]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[309]);
            	}

            // Bento.g:3390:2: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:3391:3: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_XorCond3960);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[310]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[311]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[312]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[313]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[314]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[315]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[316]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_bento_language_bentocomp_flowcontrol_XorCond_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_XorCond"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Apply"
    // Bento.g:3424:1: parse_bento_language_bentocomp_flowcontrol_Apply returns [bento.language.bentocomp.flowcontrol.Apply element = null] : a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Bento.g:3427:2: (a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')' )
            // Bento.g:3428:2: a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_bento_language_bentocomp_flowcontrol_Apply3993); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[317]);
            	}

            // Bento.g:3442:2: (a1= TEXT )
            // Bento.g:3443:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_Apply4011); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_1, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[318]);
            	}

            a2=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply4032); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[319]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[320]);
            	}

            // Bento.g:3497:2: (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            // Bento.g:3498:3: a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4050);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[321]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[322]);
            	}

            // Bento.g:3524:2: ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==13) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Bento.g:3525:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    {
            	    // Bento.g:3525:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    // Bento.g:3526:4: a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    {
            	    a4=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply4077); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[323]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[324]);
            	    			}

            	    // Bento.g:3541:4: (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    // Bento.g:3542:5: a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4103);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[325]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[326]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[327]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[328]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply4144); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[329]);
            	}

            a7=(Token)match(input,15,FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_Apply4158); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[330]);
            	}

            a8=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply4172); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[331]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[332]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[333]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[334]);
            	}

            // Bento.g:3621:2: ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==TEXT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Bento.g:3622:3: (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
                    {
                    // Bento.g:3622:3: (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
                    // Bento.g:3623:4: a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4195);
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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_8, a9_0, true);
                    					copyLocalizationInfos(a9_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[335]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[336]);
            	}

            // Bento.g:3650:2: ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==13) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Bento.g:3651:3: (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    {
            	    // Bento.g:3651:3: (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    // Bento.g:3652:4: a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    {
            	    a10=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply4230); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_9_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[337]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[338]);
            	    			}

            	    // Bento.g:3667:4: (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    // Bento.g:3668:5: a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4256);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_9_0_0_1, a11_0, true);
            	    						copyLocalizationInfos(a11_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[339]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[340]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[341]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[342]);
            	}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply4297); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[343]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[344]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[345]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[346]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[347]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[348]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[349]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_bento_language_bentocomp_flowcontrol_Apply_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Apply"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_ApplyParameter"
    // Bento.g:3724:1: parse_bento_language_bentocomp_flowcontrol_ApplyParameter returns [bento.language.bentocomp.flowcontrol.ApplyParameter element = null] : ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' ) ;
    public final bento.language.bentocomp.flowcontrol.ApplyParameter parse_bento_language_bentocomp_flowcontrol_ApplyParameter() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.ApplyParameter element =  null;

        int parse_bento_language_bentocomp_flowcontrol_ApplyParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Bento.g:3727:2: ( ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' ) )
            // Bento.g:3728:2: ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' )
            {
            // Bento.g:3728:2: ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==TEXT) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==EOF||LA39_1==11||LA39_1==13) ) {
                    alt39=1;
                }
                else if ( (LA39_1==10) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Bento.g:3729:3: (a0= TEXT )
                    {
                    // Bento.g:3729:3: (a0= TEXT )
                    // Bento.g:3730:4: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4335); if (state.failed) return element;

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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0_0_0_0, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[350]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[351]);
                    		}

                    }
                    break;
                case 2 :
                    // Bento.g:3771:6: (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')'
                    {
                    // Bento.g:3771:6: (a1= TEXT )
                    // Bento.g:3772:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4373); if (state.failed) return element;

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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0_0_1_0, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[352]);
                    		}

                    a2=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4400); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0_0_1_1, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[353]);
                    		}

                    // Bento.g:3825:3: (a3= TEXT )
                    // Bento.g:3826:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4422); if (state.failed) return element;

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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0_0_1_2, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[354]);
                    		}

                    a4=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4449); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0_0_1_3, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[355]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[356]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[357]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[358]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_bento_language_bentocomp_flowcontrol_ApplyParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_ApplyParameter"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Seq"
    // Bento.g:3889:1: parse_bento_language_bentocomp_flowcontrol_Seq returns [bento.language.bentocomp.flowcontrol.Seq element = null] : a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+ ;
    public final bento.language.bentocomp.flowcontrol.Seq parse_bento_language_bentocomp_flowcontrol_Seq() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Seq element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Seq_StartIndex = input.index();

        Token a0=null;
        bento.language.bentocomp.flowcontrol.CompositionStep a1_0 =null;

        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Bento.g:3892:2: (a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+ )
            // Bento.g:3893:2: a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_bento_language_bentocomp_flowcontrol_Seq4488); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[359]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[360]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[361]);
            	}

            // Bento.g:3909:2: (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:3910:3: a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq4506);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[362]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[363]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[364]);
            	}

            // Bento.g:3937:2: ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA40_5 = input.LA(2);

                    if ( (synpred40_Bento()) ) {
                        alt40=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA40_6 = input.LA(2);

                    if ( (synpred40_Bento()) ) {
                        alt40=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA40_7 = input.LA(2);

                    if ( (synpred40_Bento()) ) {
                        alt40=1;
                    }


                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // Bento.g:3938:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            	    {
            	    // Bento.g:3938:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            	    // Bento.g:3939:4: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq4533);
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
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_2, a2_0, true);
            	    					copyLocalizationInfos(a2_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[365]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[366]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[367]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[368]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[369]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[370]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[371]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_bento_language_bentocomp_flowcontrol_Seq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Seq"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_FeatureRef"
    // Bento.g:3973:1: parse_bento_language_bentocomp_flowcontrol_FeatureRef returns [bento.language.bentocomp.flowcontrol.FeatureRef element = null] : (a0= TEXT ) ;
    public final bento.language.bentocomp.flowcontrol.FeatureRef parse_bento_language_bentocomp_flowcontrol_FeatureRef() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.FeatureRef element =  null;

        int parse_bento_language_bentocomp_flowcontrol_FeatureRef_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Bento.g:3976:2: ( (a0= TEXT ) )
            // Bento.g:3977:2: (a0= TEXT )
            {
            // Bento.g:3977:2: (a0= TEXT )
            // Bento.g:3978:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_FeatureRef4578); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[372]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_bento_language_bentocomp_flowcontrol_FeatureRef_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_FeatureRef"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_AtlTemplate"
    // Bento.g:4019:1: parse_bento_language_bentocomp_technologies_AtlTemplate returns [bento.language.bentocomp.technologies.AtlTemplate element = null] : a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Bento.g:4022:2: (a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )* )
            // Bento.g:4023:2: a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )*
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_bento_language_bentocomp_technologies_AtlTemplate4614); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[373]);
            	}

            // Bento.g:4037:2: (a1= QUOTED_34_34 )
            // Bento.g:4038:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_AtlTemplate4632); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[374]);
            	}

            a2=(Token)match(input,39,FOLLOW_39_in_parse_bento_language_bentocomp_technologies_AtlTemplate4653); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[375]);
            	}

            // Bento.g:4087:2: (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            // Bento.g:4088:3: a3_0= parse_bento_language_bentocomp_technologies_AtlParameter
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate4671);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[376]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[377]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[378]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[379]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[380]);
            	}

            // Bento.g:4117:2: ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==13) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // Bento.g:4118:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) )
            	    {
            	    // Bento.g:4118:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) )
            	    // Bento.g:4119:4: a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            	    {
            	    a4=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_technologies_AtlTemplate4698); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[381]);
            	    			}

            	    // Bento.g:4133:4: (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            	    // Bento.g:4134:5: a5_0= parse_bento_language_bentocomp_technologies_AtlParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate4724);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[382]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[383]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[384]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[385]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[386]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[387]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[388]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[389]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[390]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[391]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_bento_language_bentocomp_technologies_AtlTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_AtlTemplate"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_AtlParameter"
    // Bento.g:4176:1: parse_bento_language_bentocomp_technologies_AtlParameter returns [bento.language.bentocomp.technologies.AtlParameter element = null] : (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT ) ;
    public final bento.language.bentocomp.technologies.AtlParameter parse_bento_language_bentocomp_technologies_AtlParameter() throws RecognitionException {
        bento.language.bentocomp.technologies.AtlParameter element =  null;

        int parse_bento_language_bentocomp_technologies_AtlParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Bento.g:4179:2: ( (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT ) )
            // Bento.g:4180:2: (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT )
            {
            // Bento.g:4180:2: (a0= TEXT )
            // Bento.g:4181:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4784); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[392]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[393]);
            	}

            // Bento.g:4217:2: ( (a1= ':' (a2= TEXT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==16) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Bento.g:4218:3: (a1= ':' (a2= TEXT ) )
                    {
                    // Bento.g:4218:3: (a1= ':' (a2= TEXT ) )
                    // Bento.g:4219:4: a1= ':' (a2= TEXT )
                    {
                    a1=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_technologies_AtlParameter4814); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[394]);
                    			}

                    // Bento.g:4233:4: (a2= TEXT )
                    // Bento.g:4234:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4840); if (state.failed) return element;

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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[395]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[396]);
            	}

            a3=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_technologies_AtlParameter4886); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[397]);
            	}

            // Bento.g:4290:2: (a4= TEXT )
            // Bento.g:4291:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4904); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[398]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[399]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[400]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[401]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[402]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_bento_language_bentocomp_technologies_AtlParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_AtlParameter"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_JavaTemplate"
    // Bento.g:4336:1: parse_bento_language_bentocomp_technologies_JavaTemplate returns [bento.language.bentocomp.technologies.JavaTemplate element = null] : a0= 'java' (a1= QUOTED_34_34 ) ;
    public final bento.language.bentocomp.technologies.JavaTemplate parse_bento_language_bentocomp_technologies_JavaTemplate() throws RecognitionException {
        bento.language.bentocomp.technologies.JavaTemplate element =  null;

        int parse_bento_language_bentocomp_technologies_JavaTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Bento.g:4339:2: (a0= 'java' (a1= QUOTED_34_34 ) )
            // Bento.g:4340:2: a0= 'java' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_bento_language_bentocomp_technologies_JavaTemplate4940); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createJavaTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[403]);
            	}

            // Bento.g:4354:2: (a1= QUOTED_34_34 )
            // Bento.g:4355:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_JavaTemplate4958); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[404]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[405]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[406]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[407]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parse_bento_language_bentocomp_technologies_JavaTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_JavaTemplate"



    // $ANTLR start "parse_bento_language_bentocomp_core_Component"
    // Bento.g:4395:1: parse_bento_language_bentocomp_core_Component returns [bento.language.bentocomp.core.Component element = null] : (c0= parse_bento_language_bentocomp_core_TransformationComponent |c1= parse_bento_language_bentocomp_dsl_ComponentExecution |c2= parse_bento_language_bentocomp_core_CompositeComponent );
    public final bento.language.bentocomp.core.Component parse_bento_language_bentocomp_core_Component() throws RecognitionException {
        bento.language.bentocomp.core.Component element =  null;

        int parse_bento_language_bentocomp_core_Component_StartIndex = input.index();

        bento.language.bentocomp.core.TransformationComponent c0 =null;

        bento.language.bentocomp.dsl.ComponentExecution c1 =null;

        bento.language.bentocomp.core.CompositeComponent c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Bento.g:4396:2: (c0= parse_bento_language_bentocomp_core_TransformationComponent |c1= parse_bento_language_bentocomp_dsl_ComponentExecution |c2= parse_bento_language_bentocomp_core_CompositeComponent )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt43=1;
                }
                break;
            case 21:
                {
                int LA43_2 = input.LA(2);

                if ( (synpred44_Bento()) ) {
                    alt43=2;
                }
                else if ( (true) ) {
                    alt43=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;

                }
                }
                break;
            case 23:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // Bento.g:4397:2: c0= parse_bento_language_bentocomp_core_TransformationComponent
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_TransformationComponent_in_parse_bento_language_bentocomp_core_Component4990);
                    c0=parse_bento_language_bentocomp_core_TransformationComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:4398:4: c1= parse_bento_language_bentocomp_dsl_ComponentExecution
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_Component5000);
                    c1=parse_bento_language_bentocomp_dsl_ComponentExecution();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Bento.g:4399:4: c2= parse_bento_language_bentocomp_core_CompositeComponent
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_CompositeComponent_in_parse_bento_language_bentocomp_core_Component5010);
                    c2=parse_bento_language_bentocomp_core_CompositeComponent();

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
            if ( state.backtracking>0 ) { memoize(input, 22, parse_bento_language_bentocomp_core_Component_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Component"



    // $ANTLR start "parse_bento_language_bentocomp_variants_Parameter"
    // Bento.g:4403:1: parse_bento_language_bentocomp_variants_Parameter returns [bento.language.bentocomp.variants.Parameter element = null] : (c0= parse_bento_language_bentocomp_variants_SingleFeature |c1= parse_bento_language_bentocomp_variants_XorFeature );
    public final bento.language.bentocomp.variants.Parameter parse_bento_language_bentocomp_variants_Parameter() throws RecognitionException {
        bento.language.bentocomp.variants.Parameter element =  null;

        int parse_bento_language_bentocomp_variants_Parameter_StartIndex = input.index();

        bento.language.bentocomp.variants.SingleFeature c0 =null;

        bento.language.bentocomp.variants.XorFeature c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Bento.g:4404:2: (c0= parse_bento_language_bentocomp_variants_SingleFeature |c1= parse_bento_language_bentocomp_variants_XorFeature )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            else if ( (LA44_0==12) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // Bento.g:4405:2: c0= parse_bento_language_bentocomp_variants_SingleFeature
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_SingleFeature_in_parse_bento_language_bentocomp_variants_Parameter5031);
                    c0=parse_bento_language_bentocomp_variants_SingleFeature();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:4406:4: c1= parse_bento_language_bentocomp_variants_XorFeature
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_XorFeature_in_parse_bento_language_bentocomp_variants_Parameter5041);
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
            if ( state.backtracking>0 ) { memoize(input, 23, parse_bento_language_bentocomp_variants_Parameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_variants_Parameter"



    // $ANTLR start "parse_bento_language_bentocomp_core_Template"
    // Bento.g:4410:1: parse_bento_language_bentocomp_core_Template returns [bento.language.bentocomp.core.Template element = null] : (c0= parse_bento_language_bentocomp_technologies_AtlTemplate |c1= parse_bento_language_bentocomp_technologies_JavaTemplate );
    public final bento.language.bentocomp.core.Template parse_bento_language_bentocomp_core_Template() throws RecognitionException {
        bento.language.bentocomp.core.Template element =  null;

        int parse_bento_language_bentocomp_core_Template_StartIndex = input.index();

        bento.language.bentocomp.technologies.AtlTemplate c0 =null;

        bento.language.bentocomp.technologies.JavaTemplate c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Bento.g:4411:2: (c0= parse_bento_language_bentocomp_technologies_AtlTemplate |c1= parse_bento_language_bentocomp_technologies_JavaTemplate )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            else if ( (LA45_0==28) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // Bento.g:4412:2: c0= parse_bento_language_bentocomp_technologies_AtlTemplate
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlTemplate_in_parse_bento_language_bentocomp_core_Template5062);
                    c0=parse_bento_language_bentocomp_technologies_AtlTemplate();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:4413:4: c1= parse_bento_language_bentocomp_technologies_JavaTemplate
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_JavaTemplate_in_parse_bento_language_bentocomp_core_Template5072);
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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_bento_language_bentocomp_core_Template_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Template"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_CompositionStep"
    // Bento.g:4417:1: parse_bento_language_bentocomp_flowcontrol_CompositionStep returns [bento.language.bentocomp.flowcontrol.CompositionStep element = null] : (c0= parse_bento_language_bentocomp_flowcontrol_Xor |c1= parse_bento_language_bentocomp_flowcontrol_Apply |c2= parse_bento_language_bentocomp_flowcontrol_Seq );
    public final bento.language.bentocomp.flowcontrol.CompositionStep parse_bento_language_bentocomp_flowcontrol_CompositionStep() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.CompositionStep element =  null;

        int parse_bento_language_bentocomp_flowcontrol_CompositionStep_StartIndex = input.index();

        bento.language.bentocomp.flowcontrol.Xor c0 =null;

        bento.language.bentocomp.flowcontrol.Apply c1 =null;

        bento.language.bentocomp.flowcontrol.Seq c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Bento.g:4418:2: (c0= parse_bento_language_bentocomp_flowcontrol_Xor |c1= parse_bento_language_bentocomp_flowcontrol_Apply |c2= parse_bento_language_bentocomp_flowcontrol_Seq )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt46=1;
                }
                break;
            case 18:
                {
                alt46=2;
                }
                break;
            case 30:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // Bento.g:4419:2: c0= parse_bento_language_bentocomp_flowcontrol_Xor
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Xor_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep5093);
                    c0=parse_bento_language_bentocomp_flowcontrol_Xor();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:4420:4: c1= parse_bento_language_bentocomp_flowcontrol_Apply
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Apply_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep5103);
                    c1=parse_bento_language_bentocomp_flowcontrol_Apply();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Bento.g:4421:4: c2= parse_bento_language_bentocomp_flowcontrol_Seq
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Seq_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep5113);
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
            if ( state.backtracking>0 ) { memoize(input, 25, parse_bento_language_bentocomp_flowcontrol_CompositionStep_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_CompositionStep"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_BooleanValue"
    // Bento.g:4425:1: parse_bento_language_bentocomp_flowcontrol_BooleanValue returns [bento.language.bentocomp.flowcontrol.BooleanValue element = null] : c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef ;
    public final bento.language.bentocomp.flowcontrol.BooleanValue parse_bento_language_bentocomp_flowcontrol_BooleanValue() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.BooleanValue element =  null;

        int parse_bento_language_bentocomp_flowcontrol_BooleanValue_StartIndex = input.index();

        bento.language.bentocomp.flowcontrol.FeatureRef c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // Bento.g:4426:2: (c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef )
            // Bento.g:4427:2: c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_FeatureRef_in_parse_bento_language_bentocomp_flowcontrol_BooleanValue5134);
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
            if ( state.backtracking>0 ) { memoize(input, 26, parse_bento_language_bentocomp_flowcontrol_BooleanValue_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_BooleanValue"

    // $ANTLR start synpred35_Bento
    public final void synpred35_Bento_fragment() throws RecognitionException {
        Token a1=null;
        bento.language.bentocomp.flowcontrol.XorCond a2_0 =null;


        // Bento.g:3282:3: ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )
        // Bento.g:3282:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
        {
        // Bento.g:3282:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
        // Bento.g:3283:4: a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
        {
        a1=(Token)match(input,38,FOLLOW_38_in_synpred35_Bento3838); if (state.failed) return ;

        // Bento.g:3297:4: (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
        // Bento.g:3298:5: a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_synpred35_Bento3864);
        a2_0=parse_bento_language_bentocomp_flowcontrol_XorCond();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred35_Bento

    // $ANTLR start synpred40_Bento
    public final void synpred40_Bento_fragment() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;


        // Bento.g:3938:3: ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
        // Bento.g:3938:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
        {
        // Bento.g:3938:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
        // Bento.g:3939:4: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_synpred40_Bento4533);
        a2_0=parse_bento_language_bentocomp_flowcontrol_CompositionStep();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred40_Bento

    // $ANTLR start synpred44_Bento
    public final void synpred44_Bento_fragment() throws RecognitionException {
        bento.language.bentocomp.dsl.ComponentExecution c1 =null;


        // Bento.g:4398:4: (c1= parse_bento_language_bentocomp_dsl_ComponentExecution )
        // Bento.g:4398:4: c1= parse_bento_language_bentocomp_dsl_ComponentExecution
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_synpred44_Bento5000);
        c1=parse_bento_language_bentocomp_dsl_ComponentExecution();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred44_Bento

    // Delegated rules

    public final boolean synpred40_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Bento_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_Bento_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Bento_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_34_in_parse_bento_language_bentocomp_core_TransformationComponent152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_core_TransformationComponent166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_TransformationComponent184 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_bento_language_bentocomp_core_TransformationComponent205 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_core_TransformationComponent234 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent264 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent326 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent356 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_core_TransformationComponent418 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent448 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent510 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent540 = new BitSet(new long[]{0x0000001204000000L});
    public static final BitSet FOLLOW_36_in_parse_bento_language_bentocomp_core_TransformationComponent607 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_TransformationComponent648 = new BitSet(new long[]{0x0000000004005000L});
    public static final BitSet FOLLOW_26_in_parse_bento_language_bentocomp_core_TransformationComponent722 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Template_in_parse_bento_language_bentocomp_core_TransformationComponent740 = new BitSet(new long[]{0x0000042102000000L});
    public static final BitSet FOLLOW_37_in_parse_bento_language_bentocomp_core_TransformationComponent767 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent793 = new BitSet(new long[]{0x0000040102000000L});
    public static final BitSet FOLLOW_25_in_parse_bento_language_bentocomp_core_TransformationComponent848 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent881 = new BitSet(new long[]{0x0000040100002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent937 = new BitSet(new long[]{0x0000040100002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1002 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent1045 = new BitSet(new long[]{0x0000040100002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent1119 = new BitSet(new long[]{0x0000040100002000L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_core_TransformationComponent1234 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1260 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1301 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1335 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_42_in_parse_bento_language_bentocomp_core_TransformationComponent1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_bento_language_bentocomp_core_Concept1438 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Concept1456 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_core_Concept1477 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Concept1495 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_core_Concept1525 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1551 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_Concept1592 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept1626 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_29_in_parse_bento_language_bentocomp_core_ParameterModel1715 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1733 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_core_ParameterModel1754 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel1772 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_core_ParameterModel1802 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_ParameterModel1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Tag1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Tag1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_bento_language_bentocomp_variants_SingleFeature1958 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_SingleFeature1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_bento_language_bentocomp_variants_XorFeature2012 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_XorFeature2030 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_bento_language_bentocomp_variants_XorFeature2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_dsl_ComponentExecution2080 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_bento_language_bentocomp_dsl_ComponentExecution2094 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_dsl_ComponentExecution2112 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_bento_language_bentocomp_dsl_ComponentExecution2133 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_dsl_ComponentExecution2156 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_dsl_ComponentExecution2182 = new BitSet(new long[]{0x0000000880100000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_dsl_ComponentExecution2243 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_dsl_ComponentExecution2299 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution2329 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution2391 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution2421 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_dsl_ComponentExecution2483 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution2513 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution2575 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution2605 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_dsl_ComponentExecution2667 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_parse_bento_language_bentocomp_dsl_ComponentExecution2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_bento_language_bentocomp_core_CompositeComponent2714 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_core_CompositeComponent2728 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_CompositeComponent2746 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_bento_language_bentocomp_core_CompositeComponent2767 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent2790 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_CompositeComponent2816 = new BitSet(new long[]{0x0000000880100000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_core_CompositeComponent2877 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_core_CompositeComponent2933 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent2963 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent3025 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent3055 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_core_CompositeComponent3117 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent3147 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent3209 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent3239 = new BitSet(new long[]{0x0000001200400000L});
    public static final BitSet FOLLOW_36_in_parse_bento_language_bentocomp_core_CompositeComponent3306 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_CompositeComponent3347 = new BitSet(new long[]{0x0000000000405000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_core_CompositeComponent3425 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_core_CompositeComponent3452 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent3478 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_CompositeComponent3519 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent3553 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_42_in_parse_bento_language_bentocomp_core_CompositeComponent3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_CompositeComponent3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_bento_language_bentocomp_core_BindingDeclaration3671 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_BindingDeclaration3689 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_core_BindingDeclaration3710 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_BindingDeclaration3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_bento_language_bentocomp_flowcontrol_Composition3764 = new BitSet(new long[]{0x0000010040040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Composition3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_bento_language_bentocomp_flowcontrol_Xor3815 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_bento_language_bentocomp_flowcontrol_Xor3838 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_parse_bento_language_bentocomp_flowcontrol_Xor3864 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_BooleanValue_in_parse_bento_language_bentocomp_flowcontrol_XorCond3924 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_XorCond3942 = new BitSet(new long[]{0x0000010040040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_XorCond3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_bento_language_bentocomp_flowcontrol_Apply3993 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_Apply4011 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply4032 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4050 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply4077 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4103 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply4144 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_Apply4158 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply4172 = new BitSet(new long[]{0x0000000000002900L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4195 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply4230 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply4256 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4373 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4400 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4422 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_bento_language_bentocomp_flowcontrol_Seq4488 = new BitSet(new long[]{0x0000010040040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq4506 = new BitSet(new long[]{0x0000010040040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq4533 = new BitSet(new long[]{0x0000010040040002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_FeatureRef4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_bento_language_bentocomp_technologies_AtlTemplate4614 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_AtlTemplate4632 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_bento_language_bentocomp_technologies_AtlTemplate4653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate4671 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_technologies_AtlTemplate4698 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate4724 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4784 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_technologies_AtlParameter4814 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4840 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_technologies_AtlParameter4886 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_bento_language_bentocomp_technologies_JavaTemplate4940 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_JavaTemplate4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_TransformationComponent_in_parse_bento_language_bentocomp_core_Component4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_Component5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_CompositeComponent_in_parse_bento_language_bentocomp_core_Component5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_SingleFeature_in_parse_bento_language_bentocomp_variants_Parameter5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_XorFeature_in_parse_bento_language_bentocomp_variants_Parameter5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlTemplate_in_parse_bento_language_bentocomp_core_Template5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_JavaTemplate_in_parse_bento_language_bentocomp_core_Template5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Xor_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Apply_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Seq_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_FeatureRef_in_parse_bento_language_bentocomp_flowcontrol_BooleanValue5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred35_Bento3838 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_synpred35_Bento3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_synpred40_Bento4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_synpred44_Bento5000 = new BitSet(new long[]{0x0000000000000002L});

}