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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "LINEBREAK", "QNAME", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "'+'", "','", "'-'", "'->'", "':'", "'='", "'apply'", "'atl'", "'binding'", "'component'", "'compose'", "'composite'", "'concept'", "'contributos'", "'definition'", "'execution'", "'graphical'", "'java'", "'model'", "'seq'", "'sirius'", "'source'", "'tags'", "'target'", "'transformation'", "'uses'", "'variants'", "'version'", "'when'", "'with'", "'xor'", "'{'", "'}'"
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
    public static final int T__43=43;
    public static final int T__44=44;
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
        this.state.initializeRuleMemo(89 + 1);
         

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
    	



    // $ANTLR start "start"
    // Bento.g:562:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        bento.language.bentocomp.dsl.DefinitionRoot c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Bento.g:563:2: ( (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF )
            // Bento.g:564:2: (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[3]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Bento.g:572:2: (c0= parse_bento_language_bentocomp_dsl_DefinitionRoot )
            // Bento.g:573:3: c0= parse_bento_language_bentocomp_dsl_DefinitionRoot
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
    // Bento.g:581:1: parse_bento_language_bentocomp_dsl_DefinitionRoot returns [bento.language.bentocomp.dsl.DefinitionRoot element = null] : (a0_0= parse_bento_language_bentocomp_core_Component ) ;
    public final bento.language.bentocomp.dsl.DefinitionRoot parse_bento_language_bentocomp_dsl_DefinitionRoot() throws RecognitionException {
        bento.language.bentocomp.dsl.DefinitionRoot element =  null;

        int parse_bento_language_bentocomp_dsl_DefinitionRoot_StartIndex = input.index();

        bento.language.bentocomp.core.Component a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Bento.g:584:2: ( (a0_0= parse_bento_language_bentocomp_core_Component ) )
            // Bento.g:585:2: (a0_0= parse_bento_language_bentocomp_core_Component )
            {
            // Bento.g:585:2: (a0_0= parse_bento_language_bentocomp_core_Component )
            // Bento.g:586:3: a0_0= parse_bento_language_bentocomp_core_Component
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
    // Bento.g:612:1: parse_bento_language_bentocomp_core_TransformationComponent returns [bento.language.bentocomp.core.TransformationComponent element = null] : a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}' ;
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

            // Bento.g:615:2: (a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}' )
            // Bento.g:616:2: a0= 'transformation' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a14= 'definition' (a15_0= parse_bento_language_bentocomp_core_Template ) ( (a16= 'version' (a17= QUOTED_34_34 ) ) )? ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )? ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a28= '}'
            {
            a0=(Token)match(input,36,FOLLOW_36_in_parse_bento_language_bentocomp_core_TransformationComponent152); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[4]);
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[5]);
            	}

            // Bento.g:644:2: (a2= QNAME )
            // Bento.g:645:3: a2= QNAME
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[6]);
            	}

            a3=(Token)match(input,43,FOLLOW_43_in_parse_bento_language_bentocomp_core_TransformationComponent205); if (state.failed) return element;

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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[7]);
            	}

            // Bento.g:694:2: ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ )
            // Bento.g:695:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            {
            // Bento.g:695:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Bento.g:696:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:696:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:697:5: a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a4=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent234); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[8]);
            	    				}

            	    // Bento.g:711:5: (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:712:6: a5_0= parse_bento_language_bentocomp_core_Concept
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[9]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[10]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[11]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[12]);
            		}

            // Bento.g:746:3: ( (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Bento.g:747:4: (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:747:4: (a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:748:5: a6= 'target' (a7_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a6=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_core_TransformationComponent326); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[13]);
            	    				}

            	    // Bento.g:762:5: (a7_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:763:6: a7_0= parse_bento_language_bentocomp_core_Concept
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[14]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[15]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[16]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[17]);
            		}

            // Bento.g:797:3: ( (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==33) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Bento.g:798:4: (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:798:4: (a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:799:5: a8= 'source' (a9_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a8=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent418); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[18]);
            	    				}

            	    // Bento.g:813:5: (a9_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:814:6: a9_0= parse_bento_language_bentocomp_core_ParameterModel
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[19]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[20]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[21]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[22]);
            		}

            // Bento.g:848:3: ( (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Bento.g:849:4: (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:849:4: (a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:850:5: a10= 'target' (a11_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a10=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_core_TransformationComponent510); if (state.failed) return element;

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
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[23]);
            	    				}

            	    // Bento.g:864:5: (a11_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:865:6: a11_0= parse_bento_language_bentocomp_core_ParameterModel
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
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[24]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[25]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[26]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[27]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[28]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[29]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[31]);
            	}

            // Bento.g:908:2: ( (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Bento.g:909:3: (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    {
                    // Bento.g:909:3: (a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    // Bento.g:910:4: a12= 'variants' ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    {
                    a12=(Token)match(input,38,FOLLOW_38_in_parse_bento_language_bentocomp_core_TransformationComponent607); if (state.failed) return element;

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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[32]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[33]);
                    			}

                    // Bento.g:925:4: ( ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
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
                    	    // Bento.g:926:5: ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    {
                    	    // Bento.g:926:5: ( (a13_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    // Bento.g:927:6: (a13_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    {
                    	    // Bento.g:927:6: (a13_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    // Bento.g:928:7: a13_0= parse_bento_language_bentocomp_variants_Parameter
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
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[34]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[35]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[36]);
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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[37]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[38]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[39]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[40]);
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
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[41]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[43]);
            	}

            // Bento.g:987:2: (a15_0= parse_bento_language_bentocomp_core_Template )
            // Bento.g:988:3: a15_0= parse_bento_language_bentocomp_core_Template
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[44]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[45]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[46]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[47]);
            	}

            // Bento.g:1016:2: ( (a16= 'version' (a17= QUOTED_34_34 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Bento.g:1017:3: (a16= 'version' (a17= QUOTED_34_34 ) )
                    {
                    // Bento.g:1017:3: (a16= 'version' (a17= QUOTED_34_34 ) )
                    // Bento.g:1018:4: a16= 'version' (a17= QUOTED_34_34 )
                    {
                    a16=(Token)match(input,39,FOLLOW_39_in_parse_bento_language_bentocomp_core_TransformationComponent767); if (state.failed) return element;

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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[48]);
                    			}

                    // Bento.g:1032:4: (a17= QUOTED_34_34 )
                    // Bento.g:1033:5: a17= QUOTED_34_34
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[49]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[50]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[51]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[52]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[53]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[54]);
            	}

            // Bento.g:1079:2: ( (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Bento.g:1080:3: (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* )
                    {
                    // Bento.g:1080:3: (a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )* )
                    // Bento.g:1081:4: a18= 'contributos' ( (a19= TEXT ) | (a20= QUOTED_34_34 ) ) ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )*
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[55]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[56]);
                    			}

                    // Bento.g:1096:4: ( (a19= TEXT ) | (a20= QUOTED_34_34 ) )
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
                            // Bento.g:1097:5: (a19= TEXT )
                            {
                            // Bento.g:1097:5: (a19= TEXT )
                            // Bento.g:1098:6: a19= TEXT
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
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[57]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[58]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[59]);
                            				}

                            }
                            break;
                        case 2 :
                            // Bento.g:1136:10: (a20= QUOTED_34_34 )
                            {
                            // Bento.g:1136:10: (a20= QUOTED_34_34 )
                            // Bento.g:1137:6: a20= QUOTED_34_34
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
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[60]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[61]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[62]);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[63]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[64]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[65]);
                    			}

                    // Bento.g:1182:4: ( (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Bento.g:1183:5: (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) )
                    	    {
                    	    // Bento.g:1183:5: (a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) ) )
                    	    // Bento.g:1184:6: a21= ',' ( (a22= TEXT ) | (a23= QUOTED_34_34 ) )
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
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[66]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[67]);
                    	    					}

                    	    // Bento.g:1199:6: ( (a22= TEXT ) | (a23= QUOTED_34_34 ) )
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
                    	            // Bento.g:1200:7: (a22= TEXT )
                    	            {
                    	            // Bento.g:1200:7: (a22= TEXT )
                    	            // Bento.g:1201:8: a22= TEXT
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
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[68]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[69]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[70]);
                    	            						}

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Bento.g:1239:14: (a23= QUOTED_34_34 )
                    	            {
                    	            // Bento.g:1239:14: (a23= QUOTED_34_34 )
                    	            // Bento.g:1240:8: a23= QUOTED_34_34
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
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[71]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[72]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[73]);
                    	            						}

                    	            }
                    	            break;

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[74]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[75]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[76]);
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[77]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[78]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[79]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[81]);
            	}

            // Bento.g:1302:2: ( (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Bento.g:1303:3: (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:1303:3: (a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:1304:4: a24= 'tags' (a25_0= parse_bento_language_bentocomp_core_Tag ) ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a24=(Token)match(input,34,FOLLOW_34_in_parse_bento_language_bentocomp_core_TransformationComponent1234); if (state.failed) return element;

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
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[82]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[83]);
                    			}

                    // Bento.g:1319:4: (a25_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:1320:5: a25_0= parse_bento_language_bentocomp_core_Tag
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[84]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[85]);
                    			}

                    // Bento.g:1346:4: ( (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Bento.g:1347:5: (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:1347:5: (a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:1348:6: a26= ',' (a27_0= parse_bento_language_bentocomp_core_Tag )
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
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[86]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[87]);
                    	    					}

                    	    // Bento.g:1363:6: (a27_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:1364:7: a27_0= parse_bento_language_bentocomp_core_Tag
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
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[88]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[89]);
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[90]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[91]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[92]);
            	}

            a28=(Token)match(input,44,FOLLOW_44_in_parse_bento_language_bentocomp_core_TransformationComponent1409); if (state.failed) return element;

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



    // $ANTLR start "parse_bento_language_bentocomp_core_GraphicalEditorComponent"
    // Bento.g:1420:1: parse_bento_language_bentocomp_core_GraphicalEditorComponent returns [bento.language.bentocomp.core.GraphicalEditorComponent element = null] : a0= 'graphical' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a8= 'variants' ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a10= 'definition' (a11_0= parse_bento_language_bentocomp_core_Template ) ( (a12= 'version' (a13= QUOTED_34_34 ) ) )? ( (a14= 'contributos' ( (a15= TEXT ) | (a16= QUOTED_34_34 ) ) ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )* ) )? ( (a20= 'tags' (a21_0= parse_bento_language_bentocomp_core_Tag ) ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a24= '}' ;
    public final bento.language.bentocomp.core.GraphicalEditorComponent parse_bento_language_bentocomp_core_GraphicalEditorComponent() throws RecognitionException {
        bento.language.bentocomp.core.GraphicalEditorComponent element =  null;

        int parse_bento_language_bentocomp_core_GraphicalEditorComponent_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a22=null;
        Token a24=null;
        bento.language.bentocomp.core.Concept a5_0 =null;

        bento.language.bentocomp.core.ParameterModel a7_0 =null;

        bento.language.bentocomp.variants.Parameter a9_0 =null;

        bento.language.bentocomp.core.Template a11_0 =null;

        bento.language.bentocomp.core.Tag a21_0 =null;

        bento.language.bentocomp.core.Tag a23_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Bento.g:1423:2: (a0= 'graphical' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a8= 'variants' ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a10= 'definition' (a11_0= parse_bento_language_bentocomp_core_Template ) ( (a12= 'version' (a13= QUOTED_34_34 ) ) )? ( (a14= 'contributos' ( (a15= TEXT ) | (a16= QUOTED_34_34 ) ) ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )* ) )? ( (a20= 'tags' (a21_0= parse_bento_language_bentocomp_core_Tag ) ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a24= '}' )
            // Bento.g:1424:2: a0= 'graphical' a1= 'component' (a2= QNAME ) a3= '{' ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) ( (a8= 'variants' ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? a10= 'definition' (a11_0= parse_bento_language_bentocomp_core_Template ) ( (a12= 'version' (a13= QUOTED_34_34 ) ) )? ( (a14= 'contributos' ( (a15= TEXT ) | (a16= QUOTED_34_34 ) ) ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )* ) )? ( (a20= 'tags' (a21_0= parse_bento_language_bentocomp_core_Tag ) ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a24= '}'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1438); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[93]);
            	}

            a1=(Token)match(input,21,FOLLOW_21_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1452); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[94]);
            	}

            // Bento.g:1452:2: (a2= QNAME )
            // Bento.g:1453:3: a2= QNAME
            {
            a2=(Token)match(input,QNAME,FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1470); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[95]);
            	}

            a3=(Token)match(input,43,FOLLOW_43_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1491); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[96]);
            	}

            // Bento.g:1502:2: ( ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ )
            // Bento.g:1503:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            {
            // Bento.g:1503:3: ( (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==24) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // Bento.g:1504:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:1504:4: (a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:1505:5: a4= 'source' (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a4=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1520); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_0_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[97]);
            	    				}

            	    // Bento.g:1519:5: (a5_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:1520:6: a5_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1550);
            	    a5_0=parse_bento_language_bentocomp_core_Concept();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[98]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[99]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[100]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[101]);
            		}

            // Bento.g:1554:3: ( (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Bento.g:1555:4: (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:1555:4: (a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:1556:5: a6= 'source' (a7_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a6=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1612); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_4_0_0_1_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[102]);
            	    				}

            	    // Bento.g:1570:5: (a7_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:1571:6: a7_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1642);
            	    a7_0=parse_bento_language_bentocomp_core_ParameterModel();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[103]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[104]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[105]);
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
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[106]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[107]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[108]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[109]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[110]);
            	}

            // Bento.g:1614:2: ( (a8= 'variants' ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Bento.g:1615:3: (a8= 'variants' ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    {
                    // Bento.g:1615:3: (a8= 'variants' ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                    // Bento.g:1616:4: a8= 'variants' ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    {
                    a8=(Token)match(input,38,FOLLOW_38_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1709); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[111]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[112]);
                    			}

                    // Bento.g:1631:4: ( ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==12||LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Bento.g:1632:5: ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    {
                    	    // Bento.g:1632:5: ( (a9_0= parse_bento_language_bentocomp_variants_Parameter ) )
                    	    // Bento.g:1633:6: (a9_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    {
                    	    // Bento.g:1633:6: (a9_0= parse_bento_language_bentocomp_variants_Parameter )
                    	    // Bento.g:1634:7: a9_0= parse_bento_language_bentocomp_variants_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1750);
                    	    a9_0=parse_bento_language_bentocomp_variants_Parameter();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[113]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[114]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[115]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[116]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[117]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[118]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[119]);
            	}

            a10=(Token)match(input,26,FOLLOW_26_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1824); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[120]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[121]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[122]);
            	}

            // Bento.g:1693:2: (a11_0= parse_bento_language_bentocomp_core_Template )
            // Bento.g:1694:3: a11_0= parse_bento_language_bentocomp_core_Template
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Template_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1842);
            a11_0=parse_bento_language_bentocomp_core_Template();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[123]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[124]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[125]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[126]);
            	}

            // Bento.g:1722:2: ( (a12= 'version' (a13= QUOTED_34_34 ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Bento.g:1723:3: (a12= 'version' (a13= QUOTED_34_34 ) )
                    {
                    // Bento.g:1723:3: (a12= 'version' (a13= QUOTED_34_34 ) )
                    // Bento.g:1724:4: a12= 'version' (a13= QUOTED_34_34 )
                    {
                    a12=(Token)match(input,39,FOLLOW_39_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1869); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_8_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[127]);
                    			}

                    // Bento.g:1738:4: (a13= QUOTED_34_34 )
                    // Bento.g:1739:5: a13= QUOTED_34_34
                    {
                    a13=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1895); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[128]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[129]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[130]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[131]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[132]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[133]);
            	}

            // Bento.g:1785:2: ( (a14= 'contributos' ( (a15= TEXT ) | (a16= QUOTED_34_34 ) ) ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )* ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Bento.g:1786:3: (a14= 'contributos' ( (a15= TEXT ) | (a16= QUOTED_34_34 ) ) ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )* )
                    {
                    // Bento.g:1786:3: (a14= 'contributos' ( (a15= TEXT ) | (a16= QUOTED_34_34 ) ) ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )* )
                    // Bento.g:1787:4: a14= 'contributos' ( (a15= TEXT ) | (a16= QUOTED_34_34 ) ) ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )*
                    {
                    a14=(Token)match(input,25,FOLLOW_25_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1950); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[134]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[135]);
                    			}

                    // Bento.g:1802:4: ( (a15= TEXT ) | (a16= QUOTED_34_34 ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TEXT) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==QUOTED_34_34) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // Bento.g:1803:5: (a15= TEXT )
                            {
                            // Bento.g:1803:5: (a15= TEXT )
                            // Bento.g:1804:6: a15= TEXT
                            {
                            a15=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1983); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[136]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[137]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[138]);
                            				}

                            }
                            break;
                        case 2 :
                            // Bento.g:1842:10: (a16= QUOTED_34_34 )
                            {
                            // Bento.g:1842:10: (a16= QUOTED_34_34 )
                            // Bento.g:1843:6: a16= QUOTED_34_34
                            {
                            a16=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2039); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[139]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[140]);
                            					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[141]);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[142]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[143]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[144]);
                    			}

                    // Bento.g:1888:4: ( (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Bento.g:1889:5: (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) )
                    	    {
                    	    // Bento.g:1889:5: (a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) ) )
                    	    // Bento.g:1890:6: a17= ',' ( (a18= TEXT ) | (a19= QUOTED_34_34 ) )
                    	    {
                    	    a17=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2104); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_9_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[145]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[146]);
                    	    					}

                    	    // Bento.g:1905:6: ( (a18= TEXT ) | (a19= QUOTED_34_34 ) )
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==TEXT) ) {
                    	        alt20=1;
                    	    }
                    	    else if ( (LA20_0==QUOTED_34_34) ) {
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
                    	            // Bento.g:1906:7: (a18= TEXT )
                    	            {
                    	            // Bento.g:1906:7: (a18= TEXT )
                    	            // Bento.g:1907:8: a18= TEXT
                    	            {
                    	            a18=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2147); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
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

                    	            }


                    	            if ( state.backtracking==0 ) {
                    	            							// expected elements (follow set)
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[147]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[148]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[149]);
                    	            						}

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Bento.g:1945:14: (a19= QUOTED_34_34 )
                    	            {
                    	            // Bento.g:1945:14: (a19= QUOTED_34_34 )
                    	            // Bento.g:1946:8: a19= QUOTED_34_34
                    	            {
                    	            a19=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2221); if (state.failed) return element;

                    	            if ( state.backtracking==0 ) {
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

                    	            }


                    	            if ( state.backtracking==0 ) {
                    	            							// expected elements (follow set)
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[150]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[151]);
                    	            							addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[152]);
                    	            						}

                    	            }
                    	            break;

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[153]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[154]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[155]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[156]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[157]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[158]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[159]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[160]);
            	}

            // Bento.g:2008:2: ( (a20= 'tags' (a21_0= parse_bento_language_bentocomp_core_Tag ) ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Bento.g:2009:3: (a20= 'tags' (a21_0= parse_bento_language_bentocomp_core_Tag ) ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:2009:3: (a20= 'tags' (a21_0= parse_bento_language_bentocomp_core_Tag ) ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:2010:4: a20= 'tags' (a21_0= parse_bento_language_bentocomp_core_Tag ) ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a20=(Token)match(input,34,FOLLOW_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2336); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_10_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[161]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[162]);
                    			}

                    // Bento.g:2025:4: (a21_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:2026:5: a21_0= parse_bento_language_bentocomp_core_Tag
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2362);
                    a21_0=parse_bento_language_bentocomp_core_Tag();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[163]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[164]);
                    			}

                    // Bento.g:2052:4: ( (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Bento.g:2053:5: (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:2053:5: (a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:2054:6: a22= ',' (a23_0= parse_bento_language_bentocomp_core_Tag )
                    	    {
                    	    a22=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2403); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_10_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[165]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getGraphicalEditorComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[166]);
                    	    					}

                    	    // Bento.g:2069:6: (a23_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:2070:7: a23_0= parse_bento_language_bentocomp_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2437);
                    	    a23_0=parse_bento_language_bentocomp_core_Tag();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[167]);
                    	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[168]);
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
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[169]);
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[170]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[171]);
            	}

            a24=(Token)match(input,44,FOLLOW_44_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2511); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createGraphicalEditorComponent();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_2_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
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
            if ( state.backtracking>0 ) { memoize(input, 4, parse_bento_language_bentocomp_core_GraphicalEditorComponent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_GraphicalEditorComponent"



    // $ANTLR start "parse_bento_language_bentocomp_core_Concept"
    // Bento.g:2126:1: parse_bento_language_bentocomp_core_Concept returns [bento.language.bentocomp.core.Concept element = null] : a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Bento.g:2129:2: (a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? )
            // Bento.g:2130:2: a0= 'concept' (a1= TEXT ) a2= ':' (a3= QUOTED_34_34 ) ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_bento_language_bentocomp_core_Concept2540); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[172]);
            	}

            // Bento.g:2144:2: (a1= TEXT )
            // Bento.g:2145:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Concept2558); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[173]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_core_Concept2579); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[174]);
            	}

            // Bento.g:2194:2: (a3= QUOTED_34_34 )
            // Bento.g:2195:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Concept2597); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
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

            // Bento.g:2239:2: ( (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Bento.g:2240:3: (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    {
                    // Bento.g:2240:3: (a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                    // Bento.g:2241:4: a4= 'tags' (a5_0= parse_bento_language_bentocomp_core_Tag ) ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    {
                    a4=(Token)match(input,34,FOLLOW_34_in_parse_bento_language_bentocomp_core_Concept2627); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[185]);
                    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[186]);
                    			}

                    // Bento.g:2256:4: (a5_0= parse_bento_language_bentocomp_core_Tag )
                    // Bento.g:2257:5: a5_0= parse_bento_language_bentocomp_core_Tag
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept2653);
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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_1, a5_0, true);
                    						copyLocalizationInfos(a5_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
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

                    // Bento.g:2291:4: ( (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==13) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Bento.g:2292:5: (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    {
                    	    // Bento.g:2292:5: (a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag ) )
                    	    // Bento.g:2293:6: a6= ',' (a7_0= parse_bento_language_bentocomp_core_Tag )
                    	    {
                    	    a6=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_Concept2694); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createConcept();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[197]);
                    	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[198]);
                    	    					}

                    	    // Bento.g:2308:6: (a7_0= parse_bento_language_bentocomp_core_Tag )
                    	    // Bento.g:2309:7: a7_0= parse_bento_language_bentocomp_core_Tag
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept2728);
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
                    	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_3_0_0_4_0_0_2_0_0_1, a7_0, true);
                    	    								copyLocalizationInfos(a7_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_bento_language_bentocomp_core_Concept_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Concept"



    // $ANTLR start "parse_bento_language_bentocomp_core_ParameterModel"
    // Bento.g:2376:1: parse_bento_language_bentocomp_core_ParameterModel returns [bento.language.bentocomp.core.ParameterModel element = null] : a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Bento.g:2379:2: (a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )? )
            // Bento.g:2380:2: a0= 'model' (a1= TEXT ) a2= ':' (a3= TEXT ) ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_bento_language_bentocomp_core_ParameterModel2817); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[228]);
            	}

            // Bento.g:2394:2: (a1= TEXT )
            // Bento.g:2395:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel2835); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[229]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_core_ParameterModel2856); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[230]);
            	}

            // Bento.g:2444:2: (a3= TEXT )
            // Bento.g:2445:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel2874); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
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

            // Bento.g:2495:2: ( (a4= '=' (a5= QUOTED_34_34 ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Bento.g:2496:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    {
                    // Bento.g:2496:3: (a4= '=' (a5= QUOTED_34_34 ) )
                    // Bento.g:2497:4: a4= '=' (a5= QUOTED_34_34 )
                    {
                    a4=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_core_ParameterModel2904); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createParameterModel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[243]);
                    			}

                    // Bento.g:2511:4: (a5= QUOTED_34_34 )
                    // Bento.g:2512:5: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_ParameterModel2930); if (state.failed) return element;

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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_4_0_0_4_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_bento_language_bentocomp_core_ParameterModel_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_ParameterModel"



    // $ANTLR start "parse_bento_language_bentocomp_core_Tag"
    // Bento.g:2576:1: parse_bento_language_bentocomp_core_Tag returns [bento.language.bentocomp.core.Tag element = null] : ( (a0= TEXT ) | (a1= QUOTED_34_34 ) );
    public final bento.language.bentocomp.core.Tag parse_bento_language_bentocomp_core_Tag() throws RecognitionException {
        bento.language.bentocomp.core.Tag element =  null;

        int parse_bento_language_bentocomp_core_Tag_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Bento.g:2579:2: ( (a0= TEXT ) | (a1= QUOTED_34_34 ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==TEXT) ) {
                alt28=1;
            }
            else if ( (LA28_0==QUOTED_34_34) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // Bento.g:2580:2: (a0= TEXT )
                    {
                    // Bento.g:2580:2: (a0= TEXT )
                    // Bento.g:2581:3: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Tag2995); if (state.failed) return element;

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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_0_0, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 2 :
                    // Bento.g:2626:4: (a1= QUOTED_34_34 )
                    {
                    // Bento.g:2626:4: (a1= QUOTED_34_34 )
                    // Bento.g:2627:3: a1= QUOTED_34_34
                    {
                    a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Tag3024); if (state.failed) return element;

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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_5_0_1_0, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
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
            if ( state.backtracking>0 ) { memoize(input, 7, parse_bento_language_bentocomp_core_Tag_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Tag"



    // $ANTLR start "parse_bento_language_bentocomp_variants_SingleFeature"
    // Bento.g:2673:1: parse_bento_language_bentocomp_variants_SingleFeature returns [bento.language.bentocomp.variants.SingleFeature element = null] : a0= '-' (a1= TEXT ) ;
    public final bento.language.bentocomp.variants.SingleFeature parse_bento_language_bentocomp_variants_SingleFeature() throws RecognitionException {
        bento.language.bentocomp.variants.SingleFeature element =  null;

        int parse_bento_language_bentocomp_variants_SingleFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Bento.g:2676:2: (a0= '-' (a1= TEXT ) )
            // Bento.g:2677:2: a0= '-' (a1= TEXT )
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_bento_language_bentocomp_variants_SingleFeature3060); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createSingleFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[286]);
            	}

            // Bento.g:2691:2: (a1= TEXT )
            // Bento.g:2692:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_SingleFeature3078); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_6_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[287]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[288]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[289]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[290]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[291]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_bento_language_bentocomp_variants_SingleFeature_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_variants_SingleFeature"



    // $ANTLR start "parse_bento_language_bentocomp_variants_XorFeature"
    // Bento.g:2733:1: parse_bento_language_bentocomp_variants_XorFeature returns [bento.language.bentocomp.variants.XorFeature element = null] : a0= '+' (a1= TEXT ) a2= 'xor' ;
    public final bento.language.bentocomp.variants.XorFeature parse_bento_language_bentocomp_variants_XorFeature() throws RecognitionException {
        bento.language.bentocomp.variants.XorFeature element =  null;

        int parse_bento_language_bentocomp_variants_XorFeature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Bento.g:2736:2: (a0= '+' (a1= TEXT ) a2= 'xor' )
            // Bento.g:2737:2: a0= '+' (a1= TEXT ) a2= 'xor'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_bento_language_bentocomp_variants_XorFeature3114); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createXorFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[292]);
            	}

            // Bento.g:2751:2: (a1= TEXT )
            // Bento.g:2752:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_XorFeature3132); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[293]);
            	}

            a2=(Token)match(input,42,FOLLOW_42_in_parse_bento_language_bentocomp_variants_XorFeature3153); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.variants.VariantsFactory.eINSTANCE.createXorFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_7_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[294]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[295]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[296]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[297]);
            		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[298]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_bento_language_bentocomp_variants_XorFeature_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_variants_XorFeature"



    // $ANTLR start "parse_bento_language_bentocomp_dsl_ComponentExecution"
    // Bento.g:2807:1: parse_bento_language_bentocomp_dsl_ComponentExecution returns [bento.language.bentocomp.dsl.ComponentExecution element = null] : a0= 'component' a1= 'execution' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition ) a16= '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Bento.g:2810:2: (a0= 'component' a1= 'execution' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition ) a16= '}' )
            // Bento.g:2811:2: a0= 'component' a1= 'execution' (a2= TEXT ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ) (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition ) a16= '}'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_bento_language_bentocomp_dsl_ComponentExecution3182); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[299]);
            	}

            a1=(Token)match(input,27,FOLLOW_27_in_parse_bento_language_bentocomp_dsl_ComponentExecution3196); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[300]);
            	}

            // Bento.g:2839:2: (a2= TEXT )
            // Bento.g:2840:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_dsl_ComponentExecution3214); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[301]);
            	}

            a3=(Token)match(input,43,FOLLOW_43_in_parse_bento_language_bentocomp_dsl_ComponentExecution3235); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[302]);
            	}

            // Bento.g:2889:2: ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Bento.g:2890:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    {
            	    // Bento.g:2890:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
            	    // Bento.g:2891:4: a4= 'uses' (a5= QUOTED_34_34 )
            	    {
            	    a4=(Token)match(input,37,FOLLOW_37_in_parse_bento_language_bentocomp_dsl_ComponentExecution3258); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[303]);
            	    			}

            	    // Bento.g:2905:4: (a5= QUOTED_34_34 )
            	    // Bento.g:2906:5: a5= QUOTED_34_34
            	    {
            	    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_dsl_ComponentExecution3284); if (state.failed) return element;

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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_4_0_0_1, proxy, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[304]);
            	    				addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[305]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[306]);
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
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[307]);
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[308]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[309]);
            	}

            // Bento.g:2956:2: ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Bento.g:2957:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
            	    {
            	    // Bento.g:2957:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
            	    // Bento.g:2958:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
            	    {
            	    // Bento.g:2958:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
            	    // Bento.g:2959:5: a6_0= parse_bento_language_bentocomp_core_BindingDeclaration
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_dsl_ComponentExecution3345);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_5_0_0_0, a6_0, true);
            	    						copyLocalizationInfos(a6_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[310]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[311]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[312]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[313]);
            	}

            // Bento.g:2993:2: ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ )
            // Bento.g:2994:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            {
            // Bento.g:2994:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Bento.g:2995:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:2995:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:2996:5: a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a7=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution3401); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_0_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[314]);
            	    				}

            	    // Bento.g:3010:5: (a8_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:3011:6: a8_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution3431);
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_0_0_0_1, a8_0, true);
            	    							copyLocalizationInfos(a8_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[315]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[316]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[317]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[318]);
            		}

            // Bento.g:3045:3: ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Bento.g:3046:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
            	    {
            	    // Bento.g:3046:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
            	    // Bento.g:3047:5: a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept )
            	    {
            	    a9=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_dsl_ComponentExecution3493); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_1_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[319]);
            	    				}

            	    // Bento.g:3061:5: (a10_0= parse_bento_language_bentocomp_core_Concept )
            	    // Bento.g:3062:6: a10_0= parse_bento_language_bentocomp_core_Concept
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution3523);
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_1_0_0_1, a10_0, true);
            	    							copyLocalizationInfos(a10_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[320]);
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[321]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[322]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[323]);
            		}

            // Bento.g:3096:3: ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==33) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Bento.g:3097:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:3097:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:3098:5: a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a11=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution3585); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_2_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[324]);
            	    				}

            	    // Bento.g:3112:5: (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:3113:6: a12_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution3615);
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_2_0_0_1, a12_0, true);
            	    							copyLocalizationInfos(a12_0, element);
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
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[327]);
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[328]);
            		}

            // Bento.g:3147:3: ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Bento.g:3148:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    {
            	    // Bento.g:3148:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
            	    // Bento.g:3149:5: a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    {
            	    a13=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_dsl_ComponentExecution3677); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (element == null) {
            	    						element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            	    						startIncompleteElement(element);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_3_0_0_0, null, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	    				}

            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[329]);
            	    				}

            	    // Bento.g:3163:5: (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
            	    // Bento.g:3164:6: a14_0= parse_bento_language_bentocomp_core_ParameterModel
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution3707);
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
            	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_6_0_0_3_0_0_1, a14_0, true);
            	    							copyLocalizationInfos(a14_0, element);
            	    						}
            	    					}

            	    }


            	    if ( state.backtracking==0 ) {
            	    					// expected elements (follow set)
            	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[330]);
            	    					addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[331]);
            	    				}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            if ( state.backtracking==0 ) {
            			// expected elements (follow set)
            			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[332]);
            			addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[333]);
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[334]);
            	}

            // Bento.g:3204:2: (a15_0= parse_bento_language_bentocomp_flowcontrol_Composition )
            // Bento.g:3205:3: a15_0= parse_bento_language_bentocomp_flowcontrol_Composition
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_dsl_ComponentExecution3769);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_7, a15_0, true);
            				copyLocalizationInfos(a15_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[335]);
            	}

            a16=(Token)match(input,44,FOLLOW_44_in_parse_bento_language_bentocomp_dsl_ComponentExecution3787); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.dsl.DslFactory.eINSTANCE.createComponentExecution();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_8_0_0_8, null, true);
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
            if ( state.backtracking>0 ) { memoize(input, 10, parse_bento_language_bentocomp_dsl_ComponentExecution_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_dsl_ComponentExecution"



    // $ANTLR start "parse_bento_language_bentocomp_core_CompositeComponent"
    // Bento.g:3245:1: parse_bento_language_bentocomp_core_CompositeComponent returns [bento.language.bentocomp.core.CompositeComponent element = null] : (a0= 'composite' a1= 'component' (a2= QNAME ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )* ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )* ) ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}' |c0= parse_bento_language_bentocomp_dsl_ComponentExecution );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Bento.g:3248:2: (a0= 'composite' a1= 'component' (a2= QNAME ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )* ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )* ) ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}' |c0= parse_bento_language_bentocomp_dsl_ComponentExecution )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            else if ( (LA45_0==21) ) {
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
                    // Bento.g:3249:2: a0= 'composite' a1= 'component' (a2= QNAME ) a3= '{' ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+ ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )* ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )* ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )* ) ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )? (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition ) ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )? a22= '}'
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_bento_language_bentocomp_core_CompositeComponent3816); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[336]);
                    	}

                    a1=(Token)match(input,21,FOLLOW_21_in_parse_bento_language_bentocomp_core_CompositeComponent3830); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_1, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[337]);
                    	}

                    // Bento.g:3277:2: (a2= QNAME )
                    // Bento.g:3278:3: a2= QNAME
                    {
                    a2=(Token)match(input,QNAME,FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_CompositeComponent3848); if (state.failed) return element;

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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_2, resolved, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[338]);
                    	}

                    a3=(Token)match(input,43,FOLLOW_43_in_parse_bento_language_bentocomp_core_CompositeComponent3869); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_3, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[339]);
                    	}

                    // Bento.g:3327:2: ( (a4= 'uses' (a5= QUOTED_34_34 ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==37) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Bento.g:3328:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
                    	    {
                    	    // Bento.g:3328:3: (a4= 'uses' (a5= QUOTED_34_34 ) )
                    	    // Bento.g:3329:4: a4= 'uses' (a5= QUOTED_34_34 )
                    	    {
                    	    a4=(Token)match(input,37,FOLLOW_37_in_parse_bento_language_bentocomp_core_CompositeComponent3892); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    				if (element == null) {
                    	    					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    					startIncompleteElement(element);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_4_0_0_0, null, true);
                    	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	    			}

                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[340]);
                    	    			}

                    	    // Bento.g:3343:4: (a5= QUOTED_34_34 )
                    	    // Bento.g:3344:5: a5= QUOTED_34_34
                    	    {
                    	    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_CompositeComponent3918); if (state.failed) return element;

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
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_4_0_0_1, proxy, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, proxy);
                    	    					}
                    	    				}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[341]);
                    	    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[342]);
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[343]);
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
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[344]);
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[345]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[346]);
                    	}

                    // Bento.g:3394:2: ( ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Bento.g:3395:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
                    	    {
                    	    // Bento.g:3395:3: ( (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration ) )
                    	    // Bento.g:3396:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
                    	    {
                    	    // Bento.g:3396:4: (a6_0= parse_bento_language_bentocomp_core_BindingDeclaration )
                    	    // Bento.g:3397:5: a6_0= parse_bento_language_bentocomp_core_BindingDeclaration
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_core_CompositeComponent3979);
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
                    	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_5_0_0_0, a6_0, true);
                    	    						copyLocalizationInfos(a6_0, element);
                    	    					}
                    	    				}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[347]);
                    	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[348]);
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
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[349]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[350]);
                    	}

                    // Bento.g:3431:2: ( ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )* ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )* )
                    // Bento.g:3432:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+ ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )* ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+ ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )*
                    {
                    // Bento.g:3432:3: ( (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==33) ) {
                            int LA37_2 = input.LA(2);

                            if ( (LA37_2==24) ) {
                                alt37=1;
                            }


                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Bento.g:3433:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    {
                    	    // Bento.g:3433:4: (a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    // Bento.g:3434:5: a7= 'source' (a8_0= parse_bento_language_bentocomp_core_Concept )
                    	    {
                    	    a7=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent4035); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_0_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[351]);
                    	    				}

                    	    // Bento.g:3448:5: (a8_0= parse_bento_language_bentocomp_core_Concept )
                    	    // Bento.g:3449:6: a8_0= parse_bento_language_bentocomp_core_Concept
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent4065);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_0_0_0_1, a8_0, true);
                    	    							copyLocalizationInfos(a8_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[352]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[353]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[354]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[355]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[356]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[357]);
                    		}

                    // Bento.g:3485:3: ( (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==35) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Bento.g:3486:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    {
                    	    // Bento.g:3486:4: (a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept ) )
                    	    // Bento.g:3487:5: a9= 'target' (a10_0= parse_bento_language_bentocomp_core_Concept )
                    	    {
                    	    a9=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent4127); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_1_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[358]);
                    	    				}

                    	    // Bento.g:3501:5: (a10_0= parse_bento_language_bentocomp_core_Concept )
                    	    // Bento.g:3502:6: a10_0= parse_bento_language_bentocomp_core_Concept
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent4157);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_1_0_0_1, a10_0, true);
                    	    							copyLocalizationInfos(a10_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[359]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[360]);
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
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[361]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[362]);
                    		}

                    // Bento.g:3536:3: ( (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==33) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Bento.g:3537:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    {
                    	    // Bento.g:3537:4: (a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    // Bento.g:3538:5: a11= 'source' (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    {
                    	    a11=(Token)match(input,33,FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent4219); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_2_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[363]);
                    	    				}

                    	    // Bento.g:3552:5: (a12_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    // Bento.g:3553:6: a12_0= parse_bento_language_bentocomp_core_ParameterModel
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent4249);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_2_0_0_1, a12_0, true);
                    	    							copyLocalizationInfos(a12_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[364]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[365]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[366]);
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[367]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[368]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[369]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[370]);
                    			addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[371]);
                    		}

                    // Bento.g:3591:3: ( (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==35) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Bento.g:3592:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    {
                    	    // Bento.g:3592:4: (a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel ) )
                    	    // Bento.g:3593:5: a13= 'target' (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    {
                    	    a13=(Token)match(input,35,FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent4311); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (element == null) {
                    	    						element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					collectHiddenTokens(element);
                    	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_3_0_0_0, null, true);
                    	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    	    				}

                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[372]);
                    	    				}

                    	    // Bento.g:3607:5: (a14_0= parse_bento_language_bentocomp_core_ParameterModel )
                    	    // Bento.g:3608:6: a14_0= parse_bento_language_bentocomp_core_ParameterModel
                    	    {
                    	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent4341);
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
                    	    							retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_6_0_0_3_0_0_1, a14_0, true);
                    	    							copyLocalizationInfos(a14_0, element);
                    	    						}
                    	    					}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    					// expected elements (follow set)
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[373]);
                    	    					addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[374]);
                    	    					addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[375]);
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[376]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[377]);
                    			addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[378]);
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[379]);
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[380]);
                    	}

                    // Bento.g:3651:2: ( (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==38) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // Bento.g:3652:3: (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                            {
                            // Bento.g:3652:3: (a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+ )
                            // Bento.g:3653:4: a15= 'variants' ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                            {
                            a15=(Token)match(input,38,FOLLOW_38_in_parse_bento_language_bentocomp_core_CompositeComponent4408); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            				if (element == null) {
                            					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                            					startIncompleteElement(element);
                            				}
                            				collectHiddenTokens(element);
                            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_7_0_0_0, null, true);
                            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                            			}

                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[381]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[382]);
                            			}

                            // Bento.g:3668:4: ( ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) ) )+
                            int cnt41=0;
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==12||LA41_0==14) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // Bento.g:3669:5: ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) )
                            	    {
                            	    // Bento.g:3669:5: ( (a16_0= parse_bento_language_bentocomp_variants_Parameter ) )
                            	    // Bento.g:3670:6: (a16_0= parse_bento_language_bentocomp_variants_Parameter )
                            	    {
                            	    // Bento.g:3670:6: (a16_0= parse_bento_language_bentocomp_variants_Parameter )
                            	    // Bento.g:3671:7: a16_0= parse_bento_language_bentocomp_variants_Parameter
                            	    {
                            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_CompositeComponent4449);
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
                            	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_7_0_0_1_0_0_0, a16_0, true);
                            	    								copyLocalizationInfos(a16_0, element);
                            	    							}
                            	    						}

                            	    }


                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[383]);
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[384]);
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[385]);
                            	    					}

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt41 >= 1 ) break loop41;
                            	    if (state.backtracking>0) {state.failed=true; return element;}
                                        EarlyExitException eee =
                                            new EarlyExitException(41, input);
                                        throw eee;
                                }
                                cnt41++;
                            } while (true);


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[386]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[387]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[388]);
                            			}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[389]);
                    	}

                    // Bento.g:3714:2: (a17_0= parse_bento_language_bentocomp_flowcontrol_Composition )
                    // Bento.g:3715:3: a17_0= parse_bento_language_bentocomp_flowcontrol_Composition
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_core_CompositeComponent4527);
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
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_8, a17_0, true);
                    				copyLocalizationInfos(a17_0, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[390]);
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[391]);
                    	}

                    // Bento.g:3741:2: ( (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==34) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Bento.g:3742:3: (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                            {
                            // Bento.g:3742:3: (a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )* )
                            // Bento.g:3743:4: a18= 'tags' (a19_0= parse_bento_language_bentocomp_core_Tag ) ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                            {
                            a18=(Token)match(input,34,FOLLOW_34_in_parse_bento_language_bentocomp_core_CompositeComponent4554); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            				if (element == null) {
                            					element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                            					startIncompleteElement(element);
                            				}
                            				collectHiddenTokens(element);
                            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_0, null, true);
                            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
                            			}

                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[392]);
                            				addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[393]);
                            			}

                            // Bento.g:3758:4: (a19_0= parse_bento_language_bentocomp_core_Tag )
                            // Bento.g:3759:5: a19_0= parse_bento_language_bentocomp_core_Tag
                            {
                            pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent4580);
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
                            						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_1, a19_0, true);
                            						copyLocalizationInfos(a19_0, element);
                            					}
                            				}

                            }


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[394]);
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[395]);
                            			}

                            // Bento.g:3785:4: ( (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==13) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // Bento.g:3786:5: (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) )
                            	    {
                            	    // Bento.g:3786:5: (a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag ) )
                            	    // Bento.g:3787:6: a20= ',' (a21_0= parse_bento_language_bentocomp_core_Tag )
                            	    {
                            	    a20=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_core_CompositeComponent4621); if (state.failed) return element;

                            	    if ( state.backtracking==0 ) {
                            	    						if (element == null) {
                            	    							element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                            	    							startIncompleteElement(element);
                            	    						}
                            	    						collectHiddenTokens(element);
                            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_2_0_0_0, null, true);
                            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
                            	    					}

                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[396]);
                            	    						addExpectedElement(bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[397]);
                            	    					}

                            	    // Bento.g:3802:6: (a21_0= parse_bento_language_bentocomp_core_Tag )
                            	    // Bento.g:3803:7: a21_0= parse_bento_language_bentocomp_core_Tag
                            	    {
                            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent4655);
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
                            	    								retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_9_0_0_2_0_0_1, a21_0, true);
                            	    								copyLocalizationInfos(a21_0, element);
                            	    							}
                            	    						}

                            	    }


                            	    if ( state.backtracking==0 ) {
                            	    						// expected elements (follow set)
                            	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[398]);
                            	    						addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[399]);
                            	    					}

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            if ( state.backtracking==0 ) {
                            				// expected elements (follow set)
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[400]);
                            				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[401]);
                            			}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[402]);
                    	}

                    a22=(Token)match(input,44,FOLLOW_44_in_parse_bento_language_bentocomp_core_CompositeComponent4729); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createCompositeComponent();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_9_0_0_10, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    	}

                    }
                    break;
                case 2 :
                    // Bento.g:3859:2: c0= parse_bento_language_bentocomp_dsl_ComponentExecution
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_CompositeComponent4748);
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
            if ( state.backtracking>0 ) { memoize(input, 11, parse_bento_language_bentocomp_core_CompositeComponent_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_CompositeComponent"



    // $ANTLR start "parse_bento_language_bentocomp_core_BindingDeclaration"
    // Bento.g:3863:1: parse_bento_language_bentocomp_core_BindingDeclaration returns [bento.language.bentocomp.core.BindingDeclaration element = null] : a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) ;
    public final bento.language.bentocomp.core.BindingDeclaration parse_bento_language_bentocomp_core_BindingDeclaration() throws RecognitionException {
        bento.language.bentocomp.core.BindingDeclaration element =  null;

        int parse_bento_language_bentocomp_core_BindingDeclaration_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Bento.g:3866:2: (a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 ) )
            // Bento.g:3867:2: a0= 'binding' (a1= TEXT ) a2= '=' (a3= QUOTED_34_34 )
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_bento_language_bentocomp_core_BindingDeclaration4773); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[403]);
            	}

            // Bento.g:3881:2: (a1= TEXT )
            // Bento.g:3882:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_BindingDeclaration4791); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[404]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_core_BindingDeclaration4812); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.core.CoreFactory.eINSTANCE.createBindingDeclaration();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[405]);
            	}

            // Bento.g:3931:2: (a3= QUOTED_34_34 )
            // Bento.g:3932:3: a3= QUOTED_34_34
            {
            a3=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_BindingDeclaration4830); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_10_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getComponentExecution(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[406]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[407]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[408]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_bento_language_bentocomp_core_BindingDeclaration_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_BindingDeclaration"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Composition"
    // Bento.g:3971:1: parse_bento_language_bentocomp_flowcontrol_Composition returns [bento.language.bentocomp.flowcontrol.Composition element = null] : a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ;
    public final bento.language.bentocomp.flowcontrol.Composition parse_bento_language_bentocomp_flowcontrol_Composition() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Composition element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Composition_StartIndex = input.index();

        Token a0=null;
        bento.language.bentocomp.flowcontrol.CompositionStep a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Bento.g:3974:2: (a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
            // Bento.g:3975:2: a0= 'compose' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_bento_language_bentocomp_flowcontrol_Composition4866); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createComposition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[409]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[410]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[411]);
            	}

            // Bento.g:3991:2: (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:3992:3: a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Composition4884);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_11_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[412]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[413]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[414]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_bento_language_bentocomp_flowcontrol_Composition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Composition"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Xor"
    // Bento.g:4021:1: parse_bento_language_bentocomp_flowcontrol_Xor returns [bento.language.bentocomp.flowcontrol.Xor element = null] : a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+ ;
    public final bento.language.bentocomp.flowcontrol.Xor parse_bento_language_bentocomp_flowcontrol_Xor() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Xor element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Xor_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        bento.language.bentocomp.flowcontrol.XorCond a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Bento.g:4024:2: (a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+ )
            // Bento.g:4025:2: a0= 'xor' ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+
            {
            a0=(Token)match(input,42,FOLLOW_42_in_parse_bento_language_bentocomp_flowcontrol_Xor4917); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[415]);
            	}

            // Bento.g:4039:2: ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==40) ) {
                    int LA46_2 = input.LA(2);

                    if ( (synpred46_Bento()) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // Bento.g:4040:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
            	    {
            	    // Bento.g:4040:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
            	    // Bento.g:4041:4: a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
            	    {
            	    a1=(Token)match(input,40,FOLLOW_40_in_parse_bento_language_bentocomp_flowcontrol_Xor4940); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXor();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_1_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[416]);
            	    			}

            	    // Bento.g:4055:4: (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
            	    // Bento.g:4056:5: a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_parse_bento_language_bentocomp_flowcontrol_Xor4966);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_12_0_0_1_0_0_1, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[417]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[418]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[419]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[420]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[421]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[422]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[423]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[424]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[425]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[426]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[427]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[428]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[429]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[430]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_bento_language_bentocomp_flowcontrol_Xor_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Xor"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_XorCond"
    // Bento.g:4102:1: parse_bento_language_bentocomp_flowcontrol_XorCond returns [bento.language.bentocomp.flowcontrol.XorCond element = null] : (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ;
    public final bento.language.bentocomp.flowcontrol.XorCond parse_bento_language_bentocomp_flowcontrol_XorCond() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.XorCond element =  null;

        int parse_bento_language_bentocomp_flowcontrol_XorCond_StartIndex = input.index();

        Token a1=null;
        bento.language.bentocomp.flowcontrol.BooleanValue a0_0 =null;

        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Bento.g:4105:2: ( (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
            // Bento.g:4106:2: (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue ) a1= '->' (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            {
            // Bento.g:4106:2: (a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue )
            // Bento.g:4107:3: a0_0= parse_bento_language_bentocomp_flowcontrol_BooleanValue
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_BooleanValue_in_parse_bento_language_bentocomp_flowcontrol_XorCond5026);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[431]);
            	}

            a1=(Token)match(input,15,FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_XorCond5044); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createXorCond();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[432]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[433]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[434]);
            	}

            // Bento.g:4148:2: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:4149:3: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_XorCond5062);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_13_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[435]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[436]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[437]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[438]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[439]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[440]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[441]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_bento_language_bentocomp_flowcontrol_XorCond_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_XorCond"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Apply"
    // Bento.g:4182:1: parse_bento_language_bentocomp_flowcontrol_Apply returns [bento.language.bentocomp.flowcontrol.Apply element = null] : a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Bento.g:4185:2: (a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')' )
            // Bento.g:4186:2: a0= 'apply' (a1= TEXT ) a2= '(' (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a6= ')' a7= '->' a8= '(' ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )? ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )* a12= ')'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_bento_language_bentocomp_flowcontrol_Apply5095); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[442]);
            	}

            // Bento.g:4200:2: (a1= TEXT )
            // Bento.g:4201:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_Apply5113); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_1, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[443]);
            	}

            a2=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply5134); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[444]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[445]);
            	}

            // Bento.g:4255:2: (a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            // Bento.g:4256:3: a3_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5152);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[446]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[447]);
            	}

            // Bento.g:4282:2: ( (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==13) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Bento.g:4283:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    {
            	    // Bento.g:4283:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    // Bento.g:4284:4: a4= ',' (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    {
            	    a4=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply5179); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[448]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[449]);
            	    			}

            	    // Bento.g:4299:4: (a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    // Bento.g:4300:5: a5_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5205);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[450]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[451]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[452]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[453]);
            	}

            a6=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply5246); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[454]);
            	}

            a7=(Token)match(input,15,FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_Apply5260); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[455]);
            	}

            a8=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply5274); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[456]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[457]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[458]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[459]);
            	}

            // Bento.g:4379:2: ( (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==TEXT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Bento.g:4380:3: (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
                    {
                    // Bento.g:4380:3: (a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
                    // Bento.g:4381:4: a9_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5297);
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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_8, a9_0, true);
                    					copyLocalizationInfos(a9_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[460]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[461]);
            	}

            // Bento.g:4408:2: ( (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==13) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Bento.g:4409:3: (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    {
            	    // Bento.g:4409:3: (a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter ) )
            	    // Bento.g:4410:4: a10= ',' (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    {
            	    a10=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply5332); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_9_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[462]);
            	    				addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[463]);
            	    			}

            	    // Bento.g:4425:4: (a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter )
            	    // Bento.g:4426:5: a11_0= parse_bento_language_bentocomp_flowcontrol_ApplyParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5358);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_9_0_0_1, a11_0, true);
            	    						copyLocalizationInfos(a11_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[464]);
            	    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[465]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[466]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[467]);
            	}

            a12=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply5399); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApply();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_14_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[468]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[469]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[470]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[471]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[472]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[473]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[474]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_bento_language_bentocomp_flowcontrol_Apply_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Apply"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_ApplyParameter"
    // Bento.g:4482:1: parse_bento_language_bentocomp_flowcontrol_ApplyParameter returns [bento.language.bentocomp.flowcontrol.ApplyParameter element = null] : ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' ) ;
    public final bento.language.bentocomp.flowcontrol.ApplyParameter parse_bento_language_bentocomp_flowcontrol_ApplyParameter() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.ApplyParameter element =  null;

        int parse_bento_language_bentocomp_flowcontrol_ApplyParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Bento.g:4485:2: ( ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' ) )
            // Bento.g:4486:2: ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' )
            {
            // Bento.g:4486:2: ( (a0= TEXT ) | (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==TEXT) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==EOF||LA50_1==11||LA50_1==13) ) {
                    alt50=1;
                }
                else if ( (LA50_1==10) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // Bento.g:4487:3: (a0= TEXT )
                    {
                    // Bento.g:4487:3: (a0= TEXT )
                    // Bento.g:4488:4: a0= TEXT
                    {
                    a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5437); if (state.failed) return element;

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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_0_0, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[475]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[476]);
                    		}

                    }
                    break;
                case 2 :
                    // Bento.g:4529:6: (a1= TEXT ) a2= '(' (a3= TEXT ) a4= ')'
                    {
                    // Bento.g:4529:6: (a1= TEXT )
                    // Bento.g:4530:4: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5475); if (state.failed) return element;

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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_0, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[477]);
                    		}

                    a2=(Token)match(input,10,FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5502); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_1, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[478]);
                    		}

                    // Bento.g:4583:3: (a3= TEXT )
                    // Bento.g:4584:4: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5524); if (state.failed) return element;

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
                    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_2, proxy, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[479]);
                    		}

                    a4=(Token)match(input,11,FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5551); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createApplyParameter();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_15_0_0_0_0_1_3, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[480]);
                    			addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[481]);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[482]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[483]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_bento_language_bentocomp_flowcontrol_ApplyParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_ApplyParameter"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_Seq"
    // Bento.g:4647:1: parse_bento_language_bentocomp_flowcontrol_Seq returns [bento.language.bentocomp.flowcontrol.Seq element = null] : a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+ ;
    public final bento.language.bentocomp.flowcontrol.Seq parse_bento_language_bentocomp_flowcontrol_Seq() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.Seq element =  null;

        int parse_bento_language_bentocomp_flowcontrol_Seq_StartIndex = input.index();

        Token a0=null;
        bento.language.bentocomp.flowcontrol.CompositionStep a1_0 =null;

        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Bento.g:4650:2: (a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+ )
            // Bento.g:4651:2: a0= 'seq' (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_bento_language_bentocomp_flowcontrol_Seq5590); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.flowcontrol.FlowcontrolFactory.eINSTANCE.createSeq();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[484]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[485]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[486]);
            	}

            // Bento.g:4667:2: (a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            // Bento.g:4668:3: a1_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq5608);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[487]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[488]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[489]);
            	}

            // Bento.g:4695:2: ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA51_5 = input.LA(2);

                    if ( (synpred51_Bento()) ) {
                        alt51=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA51_6 = input.LA(2);

                    if ( (synpred51_Bento()) ) {
                        alt51=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA51_7 = input.LA(2);

                    if ( (synpred51_Bento()) ) {
                        alt51=1;
                    }


                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // Bento.g:4696:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            	    {
            	    // Bento.g:4696:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
            	    // Bento.g:4697:4: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq5635);
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
            	    					retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_16_0_0_2, a2_0, true);
            	    					copyLocalizationInfos(a2_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[490]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[491]);
            		addExpectedElement(bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[492]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[493]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[494]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[495]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[496]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_bento_language_bentocomp_flowcontrol_Seq_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_Seq"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_FeatureRef"
    // Bento.g:4731:1: parse_bento_language_bentocomp_flowcontrol_FeatureRef returns [bento.language.bentocomp.flowcontrol.FeatureRef element = null] : (a0= TEXT ) ;
    public final bento.language.bentocomp.flowcontrol.FeatureRef parse_bento_language_bentocomp_flowcontrol_FeatureRef() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.FeatureRef element =  null;

        int parse_bento_language_bentocomp_flowcontrol_FeatureRef_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Bento.g:4734:2: ( (a0= TEXT ) )
            // Bento.g:4735:2: (a0= TEXT )
            {
            // Bento.g:4735:2: (a0= TEXT )
            // Bento.g:4736:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_FeatureRef5680); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_17_0_0_0, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[497]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_bento_language_bentocomp_flowcontrol_FeatureRef_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_FeatureRef"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_AtlTemplate"
    // Bento.g:4777:1: parse_bento_language_bentocomp_technologies_AtlTemplate returns [bento.language.bentocomp.technologies.AtlTemplate element = null] : a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Bento.g:4780:2: (a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )* )
            // Bento.g:4781:2: a0= 'atl' (a1= QUOTED_34_34 ) a2= 'with' (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )*
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_bento_language_bentocomp_technologies_AtlTemplate5716); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[498]);
            	}

            // Bento.g:4795:2: (a1= QUOTED_34_34 )
            // Bento.g:4796:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_AtlTemplate5734); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[499]);
            	}

            a2=(Token)match(input,41,FOLLOW_41_in_parse_bento_language_bentocomp_technologies_AtlTemplate5755); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[500]);
            	}

            // Bento.g:4845:2: (a3_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            // Bento.g:4846:3: a3_0= parse_bento_language_bentocomp_technologies_AtlParameter
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate5773);
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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
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

            // Bento.g:4879:2: ( (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==13) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // Bento.g:4880:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) )
            	    {
            	    // Bento.g:4880:3: (a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter ) )
            	    // Bento.g:4881:4: a4= ',' (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            	    {
            	    a4=(Token)match(input,13,FOLLOW_13_in_parse_bento_language_bentocomp_technologies_AtlTemplate5800); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlTemplate();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(), bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[510]);
            	    			}

            	    // Bento.g:4895:4: (a5_0= parse_bento_language_bentocomp_technologies_AtlParameter )
            	    // Bento.g:4896:5: a5_0= parse_bento_language_bentocomp_technologies_AtlParameter
            	    {
            	    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate5826);
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
            	    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_18_0_0_4_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_bento_language_bentocomp_technologies_AtlTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_AtlTemplate"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_AtlParameter"
    // Bento.g:4946:1: parse_bento_language_bentocomp_technologies_AtlParameter returns [bento.language.bentocomp.technologies.AtlParameter element = null] : (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT ) ;
    public final bento.language.bentocomp.technologies.AtlParameter parse_bento_language_bentocomp_technologies_AtlParameter() throws RecognitionException {
        bento.language.bentocomp.technologies.AtlParameter element =  null;

        int parse_bento_language_bentocomp_technologies_AtlParameter_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Bento.g:4949:2: ( (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT ) )
            // Bento.g:4950:2: (a0= TEXT ) ( (a1= ':' (a2= TEXT ) ) )? a3= '=' (a4= TEXT )
            {
            // Bento.g:4950:2: (a0= TEXT )
            // Bento.g:4951:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter5886); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[529]);
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[530]);
            	}

            // Bento.g:4987:2: ( (a1= ':' (a2= TEXT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==16) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Bento.g:4988:3: (a1= ':' (a2= TEXT ) )
                    {
                    // Bento.g:4988:3: (a1= ':' (a2= TEXT ) )
                    // Bento.g:4989:4: a1= ':' (a2= TEXT )
                    {
                    a1=(Token)match(input,16,FOLLOW_16_in_parse_bento_language_bentocomp_technologies_AtlParameter5916); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[531]);
                    			}

                    // Bento.g:5003:4: (a2= TEXT )
                    // Bento.g:5004:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter5942); if (state.failed) return element;

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
                    						retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[532]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[533]);
            	}

            a3=(Token)match(input,17,FOLLOW_17_in_parse_bento_language_bentocomp_technologies_AtlParameter5988); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createAtlParameter();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[534]);
            	}

            // Bento.g:5060:2: (a4= TEXT )
            // Bento.g:5061:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter6006); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_19_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parse_bento_language_bentocomp_technologies_AtlParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_AtlParameter"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_JavaTemplate"
    // Bento.g:5110:1: parse_bento_language_bentocomp_technologies_JavaTemplate returns [bento.language.bentocomp.technologies.JavaTemplate element = null] : a0= 'java' (a1= QUOTED_34_34 ) ;
    public final bento.language.bentocomp.technologies.JavaTemplate parse_bento_language_bentocomp_technologies_JavaTemplate() throws RecognitionException {
        bento.language.bentocomp.technologies.JavaTemplate element =  null;

        int parse_bento_language_bentocomp_technologies_JavaTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Bento.g:5113:2: (a0= 'java' (a1= QUOTED_34_34 ) )
            // Bento.g:5114:2: a0= 'java' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_bento_language_bentocomp_technologies_JavaTemplate6042); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createJavaTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_20_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[544]);
            	}

            // Bento.g:5128:2: (a1= QUOTED_34_34 )
            // Bento.g:5129:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_JavaTemplate6060); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_20_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, parse_bento_language_bentocomp_technologies_JavaTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_JavaTemplate"



    // $ANTLR start "parse_bento_language_bentocomp_technologies_SiriusTemplate"
    // Bento.g:5173:1: parse_bento_language_bentocomp_technologies_SiriusTemplate returns [bento.language.bentocomp.technologies.SiriusTemplate element = null] : a0= 'sirius' (a1= QUOTED_34_34 ) ;
    public final bento.language.bentocomp.technologies.SiriusTemplate parse_bento_language_bentocomp_technologies_SiriusTemplate() throws RecognitionException {
        bento.language.bentocomp.technologies.SiriusTemplate element =  null;

        int parse_bento_language_bentocomp_technologies_SiriusTemplate_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Bento.g:5176:2: (a0= 'sirius' (a1= QUOTED_34_34 ) )
            // Bento.g:5177:2: a0= 'sirius' (a1= QUOTED_34_34 )
            {
            a0=(Token)match(input,32,FOLLOW_32_in_parse_bento_language_bentocomp_technologies_SiriusTemplate6096); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = bento.language.bentocomp.technologies.TechnologiesFactory.eINSTANCE.createSiriusTemplate();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, bento.language.bentocomp.resource.bento.grammar.BentoGrammarInformationProvider.BENTO_21_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, bento.language.bentocomp.resource.bento.mopp.BentoExpectationConstants.EXPECTATIONS[553]);
            	}

            // Bento.g:5191:2: (a1= QUOTED_34_34 )
            // Bento.g:5192:3: a1= QUOTED_34_34
            {
            a1=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_SiriusTemplate6114); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, parse_bento_language_bentocomp_technologies_SiriusTemplate_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_technologies_SiriusTemplate"



    // $ANTLR start "parse_bento_language_bentocomp_core_Component"
    // Bento.g:5236:1: parse_bento_language_bentocomp_core_Component returns [bento.language.bentocomp.core.Component element = null] : (c0= parse_bento_language_bentocomp_core_TransformationComponent |c1= parse_bento_language_bentocomp_core_GraphicalEditorComponent |c2= parse_bento_language_bentocomp_dsl_ComponentExecution |c3= parse_bento_language_bentocomp_core_CompositeComponent );
    public final bento.language.bentocomp.core.Component parse_bento_language_bentocomp_core_Component() throws RecognitionException {
        bento.language.bentocomp.core.Component element =  null;

        int parse_bento_language_bentocomp_core_Component_StartIndex = input.index();

        bento.language.bentocomp.core.TransformationComponent c0 =null;

        bento.language.bentocomp.core.GraphicalEditorComponent c1 =null;

        bento.language.bentocomp.dsl.ComponentExecution c2 =null;

        bento.language.bentocomp.core.CompositeComponent c3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Bento.g:5237:2: (c0= parse_bento_language_bentocomp_core_TransformationComponent |c1= parse_bento_language_bentocomp_core_GraphicalEditorComponent |c2= parse_bento_language_bentocomp_dsl_ComponentExecution |c3= parse_bento_language_bentocomp_core_CompositeComponent )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt54=1;
                }
                break;
            case 28:
                {
                alt54=2;
                }
                break;
            case 21:
                {
                int LA54_3 = input.LA(2);

                if ( (synpred56_Bento()) ) {
                    alt54=3;
                }
                else if ( (true) ) {
                    alt54=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 3, input);

                    throw nvae;

                }
                }
                break;
            case 23:
                {
                alt54=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // Bento.g:5238:2: c0= parse_bento_language_bentocomp_core_TransformationComponent
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_TransformationComponent_in_parse_bento_language_bentocomp_core_Component6146);
                    c0=parse_bento_language_bentocomp_core_TransformationComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:5239:4: c1= parse_bento_language_bentocomp_core_GraphicalEditorComponent
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_GraphicalEditorComponent_in_parse_bento_language_bentocomp_core_Component6156);
                    c1=parse_bento_language_bentocomp_core_GraphicalEditorComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Bento.g:5240:4: c2= parse_bento_language_bentocomp_dsl_ComponentExecution
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_Component6166);
                    c2=parse_bento_language_bentocomp_dsl_ComponentExecution();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Bento.g:5241:4: c3= parse_bento_language_bentocomp_core_CompositeComponent
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_core_CompositeComponent_in_parse_bento_language_bentocomp_core_Component6176);
                    c3=parse_bento_language_bentocomp_core_CompositeComponent();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_bento_language_bentocomp_core_Component_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Component"



    // $ANTLR start "parse_bento_language_bentocomp_variants_Parameter"
    // Bento.g:5245:1: parse_bento_language_bentocomp_variants_Parameter returns [bento.language.bentocomp.variants.Parameter element = null] : (c0= parse_bento_language_bentocomp_variants_SingleFeature |c1= parse_bento_language_bentocomp_variants_XorFeature );
    public final bento.language.bentocomp.variants.Parameter parse_bento_language_bentocomp_variants_Parameter() throws RecognitionException {
        bento.language.bentocomp.variants.Parameter element =  null;

        int parse_bento_language_bentocomp_variants_Parameter_StartIndex = input.index();

        bento.language.bentocomp.variants.SingleFeature c0 =null;

        bento.language.bentocomp.variants.XorFeature c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Bento.g:5246:2: (c0= parse_bento_language_bentocomp_variants_SingleFeature |c1= parse_bento_language_bentocomp_variants_XorFeature )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==14) ) {
                alt55=1;
            }
            else if ( (LA55_0==12) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // Bento.g:5247:2: c0= parse_bento_language_bentocomp_variants_SingleFeature
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_SingleFeature_in_parse_bento_language_bentocomp_variants_Parameter6197);
                    c0=parse_bento_language_bentocomp_variants_SingleFeature();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:5248:4: c1= parse_bento_language_bentocomp_variants_XorFeature
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_variants_XorFeature_in_parse_bento_language_bentocomp_variants_Parameter6207);
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
            if ( state.backtracking>0 ) { memoize(input, 25, parse_bento_language_bentocomp_variants_Parameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_variants_Parameter"



    // $ANTLR start "parse_bento_language_bentocomp_core_Template"
    // Bento.g:5252:1: parse_bento_language_bentocomp_core_Template returns [bento.language.bentocomp.core.Template element = null] : (c0= parse_bento_language_bentocomp_technologies_AtlTemplate |c1= parse_bento_language_bentocomp_technologies_JavaTemplate |c2= parse_bento_language_bentocomp_technologies_SiriusTemplate );
    public final bento.language.bentocomp.core.Template parse_bento_language_bentocomp_core_Template() throws RecognitionException {
        bento.language.bentocomp.core.Template element =  null;

        int parse_bento_language_bentocomp_core_Template_StartIndex = input.index();

        bento.language.bentocomp.technologies.AtlTemplate c0 =null;

        bento.language.bentocomp.technologies.JavaTemplate c1 =null;

        bento.language.bentocomp.technologies.SiriusTemplate c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // Bento.g:5253:2: (c0= parse_bento_language_bentocomp_technologies_AtlTemplate |c1= parse_bento_language_bentocomp_technologies_JavaTemplate |c2= parse_bento_language_bentocomp_technologies_SiriusTemplate )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt56=1;
                }
                break;
            case 29:
                {
                alt56=2;
                }
                break;
            case 32:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // Bento.g:5254:2: c0= parse_bento_language_bentocomp_technologies_AtlTemplate
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_AtlTemplate_in_parse_bento_language_bentocomp_core_Template6228);
                    c0=parse_bento_language_bentocomp_technologies_AtlTemplate();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:5255:4: c1= parse_bento_language_bentocomp_technologies_JavaTemplate
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_JavaTemplate_in_parse_bento_language_bentocomp_core_Template6238);
                    c1=parse_bento_language_bentocomp_technologies_JavaTemplate();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Bento.g:5256:4: c2= parse_bento_language_bentocomp_technologies_SiriusTemplate
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_technologies_SiriusTemplate_in_parse_bento_language_bentocomp_core_Template6248);
                    c2=parse_bento_language_bentocomp_technologies_SiriusTemplate();

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
            if ( state.backtracking>0 ) { memoize(input, 26, parse_bento_language_bentocomp_core_Template_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_core_Template"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_CompositionStep"
    // Bento.g:5260:1: parse_bento_language_bentocomp_flowcontrol_CompositionStep returns [bento.language.bentocomp.flowcontrol.CompositionStep element = null] : (c0= parse_bento_language_bentocomp_flowcontrol_Xor |c1= parse_bento_language_bentocomp_flowcontrol_Apply |c2= parse_bento_language_bentocomp_flowcontrol_Seq );
    public final bento.language.bentocomp.flowcontrol.CompositionStep parse_bento_language_bentocomp_flowcontrol_CompositionStep() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.CompositionStep element =  null;

        int parse_bento_language_bentocomp_flowcontrol_CompositionStep_StartIndex = input.index();

        bento.language.bentocomp.flowcontrol.Xor c0 =null;

        bento.language.bentocomp.flowcontrol.Apply c1 =null;

        bento.language.bentocomp.flowcontrol.Seq c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }

            // Bento.g:5261:2: (c0= parse_bento_language_bentocomp_flowcontrol_Xor |c1= parse_bento_language_bentocomp_flowcontrol_Apply |c2= parse_bento_language_bentocomp_flowcontrol_Seq )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt57=1;
                }
                break;
            case 18:
                {
                alt57=2;
                }
                break;
            case 31:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // Bento.g:5262:2: c0= parse_bento_language_bentocomp_flowcontrol_Xor
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Xor_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep6269);
                    c0=parse_bento_language_bentocomp_flowcontrol_Xor();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Bento.g:5263:4: c1= parse_bento_language_bentocomp_flowcontrol_Apply
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Apply_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep6279);
                    c1=parse_bento_language_bentocomp_flowcontrol_Apply();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Bento.g:5264:4: c2= parse_bento_language_bentocomp_flowcontrol_Seq
                    {
                    pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_Seq_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep6289);
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
            if ( state.backtracking>0 ) { memoize(input, 27, parse_bento_language_bentocomp_flowcontrol_CompositionStep_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_CompositionStep"



    // $ANTLR start "parse_bento_language_bentocomp_flowcontrol_BooleanValue"
    // Bento.g:5268:1: parse_bento_language_bentocomp_flowcontrol_BooleanValue returns [bento.language.bentocomp.flowcontrol.BooleanValue element = null] : c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef ;
    public final bento.language.bentocomp.flowcontrol.BooleanValue parse_bento_language_bentocomp_flowcontrol_BooleanValue() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.BooleanValue element =  null;

        int parse_bento_language_bentocomp_flowcontrol_BooleanValue_StartIndex = input.index();

        bento.language.bentocomp.flowcontrol.FeatureRef c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }

            // Bento.g:5269:2: (c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef )
            // Bento.g:5270:2: c0= parse_bento_language_bentocomp_flowcontrol_FeatureRef
            {
            pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_FeatureRef_in_parse_bento_language_bentocomp_flowcontrol_BooleanValue6310);
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
            if ( state.backtracking>0 ) { memoize(input, 28, parse_bento_language_bentocomp_flowcontrol_BooleanValue_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_bento_language_bentocomp_flowcontrol_BooleanValue"

    // $ANTLR start synpred46_Bento
    public final void synpred46_Bento_fragment() throws RecognitionException {
        Token a1=null;
        bento.language.bentocomp.flowcontrol.XorCond a2_0 =null;


        // Bento.g:4040:3: ( (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) ) )
        // Bento.g:4040:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
        {
        // Bento.g:4040:3: (a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond ) )
        // Bento.g:4041:4: a1= 'when' (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
        {
        a1=(Token)match(input,40,FOLLOW_40_in_synpred46_Bento4940); if (state.failed) return ;

        // Bento.g:4055:4: (a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond )
        // Bento.g:4056:5: a2_0= parse_bento_language_bentocomp_flowcontrol_XorCond
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_synpred46_Bento4966);
        a2_0=parse_bento_language_bentocomp_flowcontrol_XorCond();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred46_Bento

    // $ANTLR start synpred51_Bento
    public final void synpred51_Bento_fragment() throws RecognitionException {
        bento.language.bentocomp.flowcontrol.CompositionStep a2_0 =null;


        // Bento.g:4696:3: ( (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep ) )
        // Bento.g:4696:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
        {
        // Bento.g:4696:3: (a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep )
        // Bento.g:4697:4: a2_0= parse_bento_language_bentocomp_flowcontrol_CompositionStep
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_synpred51_Bento5635);
        a2_0=parse_bento_language_bentocomp_flowcontrol_CompositionStep();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred51_Bento

    // $ANTLR start synpred56_Bento
    public final void synpred56_Bento_fragment() throws RecognitionException {
        bento.language.bentocomp.dsl.ComponentExecution c2 =null;


        // Bento.g:5240:4: (c2= parse_bento_language_bentocomp_dsl_ComponentExecution )
        // Bento.g:5240:4: c2= parse_bento_language_bentocomp_dsl_ComponentExecution
        {
        pushFollow(FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_synpred56_Bento6166);
        c2=parse_bento_language_bentocomp_dsl_ComponentExecution();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_Bento

    // Delegated rules

    public final boolean synpred46_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_Bento_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Bento_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Bento() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Bento_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_36_in_parse_bento_language_bentocomp_core_TransformationComponent152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_core_TransformationComponent166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_TransformationComponent184 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parse_bento_language_bentocomp_core_TransformationComponent205 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent234 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent264 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_core_TransformationComponent326 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_TransformationComponent356 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_TransformationComponent418 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent448 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_core_TransformationComponent510 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_TransformationComponent540 = new BitSet(new long[]{0x0000004804000000L});
    public static final BitSet FOLLOW_38_in_parse_bento_language_bentocomp_core_TransformationComponent607 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_TransformationComponent648 = new BitSet(new long[]{0x0000000004005000L});
    public static final BitSet FOLLOW_26_in_parse_bento_language_bentocomp_core_TransformationComponent722 = new BitSet(new long[]{0x0000000120080000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Template_in_parse_bento_language_bentocomp_core_TransformationComponent740 = new BitSet(new long[]{0x0000108402000000L});
    public static final BitSet FOLLOW_39_in_parse_bento_language_bentocomp_core_TransformationComponent767 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent793 = new BitSet(new long[]{0x0000100402000000L});
    public static final BitSet FOLLOW_25_in_parse_bento_language_bentocomp_core_TransformationComponent848 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent881 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent937 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1002 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_TransformationComponent1045 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_TransformationComponent1119 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_34_in_parse_bento_language_bentocomp_core_TransformationComponent1234 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1260 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_TransformationComponent1301 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_TransformationComponent1335 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_44_in_parse_bento_language_bentocomp_core_TransformationComponent1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1438 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1470 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1491 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1520 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1550 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1612 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1642 = new BitSet(new long[]{0x0000004204000000L});
    public static final BitSet FOLLOW_38_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1709 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1750 = new BitSet(new long[]{0x0000000004005000L});
    public static final BitSet FOLLOW_26_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1824 = new BitSet(new long[]{0x0000000120080000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Template_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1842 = new BitSet(new long[]{0x0000108402000000L});
    public static final BitSet FOLLOW_39_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1869 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1895 = new BitSet(new long[]{0x0000100402000000L});
    public static final BitSet FOLLOW_25_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1950 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent1983 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2039 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2104 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2147 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2221 = new BitSet(new long[]{0x0000100400002000L});
    public static final BitSet FOLLOW_34_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2336 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2362 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2403 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2437 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_44_in_parse_bento_language_bentocomp_core_GraphicalEditorComponent2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_bento_language_bentocomp_core_Concept2540 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Concept2558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_core_Concept2579 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Concept2597 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_parse_bento_language_bentocomp_core_Concept2627 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept2653 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_Concept2694 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_Concept2728 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_30_in_parse_bento_language_bentocomp_core_ParameterModel2817 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel2835 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_core_ParameterModel2856 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_ParameterModel2874 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_core_ParameterModel2904 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_ParameterModel2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_Tag2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_Tag3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_bento_language_bentocomp_variants_SingleFeature3060 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_SingleFeature3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_bento_language_bentocomp_variants_XorFeature3114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_variants_XorFeature3132 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_parse_bento_language_bentocomp_variants_XorFeature3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_dsl_ComponentExecution3182 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_bento_language_bentocomp_dsl_ComponentExecution3196 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_dsl_ComponentExecution3214 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parse_bento_language_bentocomp_dsl_ComponentExecution3235 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_bento_language_bentocomp_dsl_ComponentExecution3258 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_dsl_ComponentExecution3284 = new BitSet(new long[]{0x0000002200100000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_dsl_ComponentExecution3345 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution3401 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution3431 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_dsl_ComponentExecution3493 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_dsl_ComponentExecution3523 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_dsl_ComponentExecution3585 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution3615 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_dsl_ComponentExecution3677 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_dsl_ComponentExecution3707 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_dsl_ComponentExecution3769 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_bento_language_bentocomp_dsl_ComponentExecution3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_bento_language_bentocomp_core_CompositeComponent3816 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_bento_language_bentocomp_core_CompositeComponent3830 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QNAME_in_parse_bento_language_bentocomp_core_CompositeComponent3848 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parse_bento_language_bentocomp_core_CompositeComponent3869 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_bento_language_bentocomp_core_CompositeComponent3892 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_CompositeComponent3918 = new BitSet(new long[]{0x0000002200100000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_BindingDeclaration_in_parse_bento_language_bentocomp_core_CompositeComponent3979 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent4035 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent4065 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent4127 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Concept_in_parse_bento_language_bentocomp_core_CompositeComponent4157 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_33_in_parse_bento_language_bentocomp_core_CompositeComponent4219 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent4249 = new BitSet(new long[]{0x0000004A00400000L});
    public static final BitSet FOLLOW_35_in_parse_bento_language_bentocomp_core_CompositeComponent4311 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_ParameterModel_in_parse_bento_language_bentocomp_core_CompositeComponent4341 = new BitSet(new long[]{0x0000004800400000L});
    public static final BitSet FOLLOW_38_in_parse_bento_language_bentocomp_core_CompositeComponent4408 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_Parameter_in_parse_bento_language_bentocomp_core_CompositeComponent4449 = new BitSet(new long[]{0x0000000000405000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Composition_in_parse_bento_language_bentocomp_core_CompositeComponent4527 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_34_in_parse_bento_language_bentocomp_core_CompositeComponent4554 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent4580 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_core_CompositeComponent4621 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_Tag_in_parse_bento_language_bentocomp_core_CompositeComponent4655 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_44_in_parse_bento_language_bentocomp_core_CompositeComponent4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_CompositeComponent4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_bento_language_bentocomp_core_BindingDeclaration4773 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_core_BindingDeclaration4791 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_core_BindingDeclaration4812 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_core_BindingDeclaration4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_bento_language_bentocomp_flowcontrol_Composition4866 = new BitSet(new long[]{0x0000040080040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Composition4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_bento_language_bentocomp_flowcontrol_Xor4917 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_bento_language_bentocomp_flowcontrol_Xor4940 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_parse_bento_language_bentocomp_flowcontrol_Xor4966 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_BooleanValue_in_parse_bento_language_bentocomp_flowcontrol_XorCond5026 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_XorCond5044 = new BitSet(new long[]{0x0000040080040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_XorCond5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_bento_language_bentocomp_flowcontrol_Apply5095 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_Apply5113 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply5134 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5152 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply5179 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5205 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply5246 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_bento_language_bentocomp_flowcontrol_Apply5260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_Apply5274 = new BitSet(new long[]{0x0000000000002900L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5297 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_flowcontrol_Apply5332 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_ApplyParameter_in_parse_bento_language_bentocomp_flowcontrol_Apply5358 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_Apply5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5475 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5502 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5524 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_bento_language_bentocomp_flowcontrol_ApplyParameter5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_bento_language_bentocomp_flowcontrol_Seq5590 = new BitSet(new long[]{0x0000040080040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq5608 = new BitSet(new long[]{0x0000040080040000L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_parse_bento_language_bentocomp_flowcontrol_Seq5635 = new BitSet(new long[]{0x0000040080040002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_flowcontrol_FeatureRef5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_bento_language_bentocomp_technologies_AtlTemplate5716 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_AtlTemplate5734 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_bento_language_bentocomp_technologies_AtlTemplate5755 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate5773 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_parse_bento_language_bentocomp_technologies_AtlTemplate5800 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlParameter_in_parse_bento_language_bentocomp_technologies_AtlTemplate5826 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter5886 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_parse_bento_language_bentocomp_technologies_AtlParameter5916 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter5942 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_bento_language_bentocomp_technologies_AtlParameter5988 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TEXT_in_parse_bento_language_bentocomp_technologies_AtlParameter6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_bento_language_bentocomp_technologies_JavaTemplate6042 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_JavaTemplate6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_bento_language_bentocomp_technologies_SiriusTemplate6096 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_bento_language_bentocomp_technologies_SiriusTemplate6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_TransformationComponent_in_parse_bento_language_bentocomp_core_Component6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_GraphicalEditorComponent_in_parse_bento_language_bentocomp_core_Component6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_parse_bento_language_bentocomp_core_Component6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_core_CompositeComponent_in_parse_bento_language_bentocomp_core_Component6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_SingleFeature_in_parse_bento_language_bentocomp_variants_Parameter6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_variants_XorFeature_in_parse_bento_language_bentocomp_variants_Parameter6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_AtlTemplate_in_parse_bento_language_bentocomp_core_Template6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_JavaTemplate_in_parse_bento_language_bentocomp_core_Template6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_technologies_SiriusTemplate_in_parse_bento_language_bentocomp_core_Template6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Xor_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Apply_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_Seq_in_parse_bento_language_bentocomp_flowcontrol_CompositionStep6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_FeatureRef_in_parse_bento_language_bentocomp_flowcontrol_BooleanValue6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred46_Bento4940 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_XorCond_in_synpred46_Bento4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_flowcontrol_CompositionStep_in_synpred51_Bento5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_bento_language_bentocomp_dsl_ComponentExecution_in_synpred56_Bento6166 = new BitSet(new long[]{0x0000000000000002L});

}