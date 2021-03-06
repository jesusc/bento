// $ANTLR 3.4

	package genericity.language.gbind.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GbindLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int ADDOP=4;
    public static final int BAGTYPE=5;
    public static final int BOOLEANTYPE=6;
    public static final int BOOLOP=7;
    public static final int COLLECTIONTYPE=8;
    public static final int COMMENT=9;
    public static final int ENVTYPE=10;
    public static final int EQ=11;
    public static final int FLOAT=12;
    public static final int INTEGER=13;
    public static final int INTEGERTYPE=14;
    public static final int INTOP=15;
    public static final int LAMBDATYPE=16;
    public static final int LINEBREAK=17;
    public static final int MAPTYPE=18;
    public static final int MULOP=19;
    public static final int NEQ=20;
    public static final int NOTOP=21;
    public static final int OCLANYTYPE=22;
    public static final int OCLTYPE=23;
    public static final int ORDEREDSETTYPE=24;
    public static final int QUOTED_34_34_92=25;
    public static final int QUOTED_39_39_92=26;
    public static final int QUOTED_91_93=27;
    public static final int REALTYPE=28;
    public static final int RELOP=29;
    public static final int SEQUENCETYPE=30;
    public static final int SETTYPE=31;
    public static final int STRINGTYPE=32;
    public static final int TEXT=33;
    public static final int TUPLE=34;
    public static final int TUPLETYPE=35;
    public static final int WHITESPACE=36;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GbindLexer() {} 
    public GbindLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GbindLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Gbind.g"; }

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:15:7: ( '!' )
            // Gbind.g:15:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16:7: ( '#' )
            // Gbind.g:16:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:17:7: ( '(' )
            // Gbind.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:18:7: ( ')' )
            // Gbind.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:19:7: ( ',' )
            // Gbind.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:20:7: ( '->' )
            // Gbind.g:20:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:21:7: ( '.' )
            // Gbind.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:22:7: ( '/' )
            // Gbind.g:22:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:23:7: ( ':' )
            // Gbind.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:24:7: ( '::' )
            // Gbind.g:24:9: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:25:7: ( ';' )
            // Gbind.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:26:7: ( 'OclUndefined' )
            // Gbind.g:26:9: 'OclUndefined'
            {
            match("OclUndefined"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:27:7: ( 'att' )
            // Gbind.g:27:9: 'att'
            {
            match("att"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:28:7: ( 'binding' )
            // Gbind.g:28:9: 'binding'
            {
            match("binding"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:29:7: ( 'class' )
            // Gbind.g:29:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:30:7: ( 'concept' )
            // Gbind.g:30:9: 'concept'
            {
            match("concept"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:31:7: ( 'context' )
            // Gbind.g:31:9: 'context'
            {
            match("context"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:32:7: ( 'def' )
            // Gbind.g:32:9: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:33:7: ( 'else' )
            // Gbind.g:33:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:34:7: ( 'enable-class-merge' )
            // Gbind.g:34:9: 'enable-class-merge'
            {
            match("enable-class-merge"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:35:7: ( 'endif' )
            // Gbind.g:35:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:36:7: ( 'env' )
            // Gbind.g:36:9: 'env'
            {
            match("env"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:37:7: ( 'false' )
            // Gbind.g:37:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:38:7: ( 'feature' )
            // Gbind.g:38:9: 'feature'
            {
            match("feature"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:39:7: ( 'helper' )
            // Gbind.g:39:9: 'helper'
            {
            match("helper"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:40:7: ( 'if' )
            // Gbind.g:40:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:41:7: ( 'import' )
            // Gbind.g:41:9: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:42:7: ( 'in' )
            // Gbind.g:42:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:43:7: ( 'init' )
            // Gbind.g:43:9: 'init'
            {
            match("init"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:44:7: ( 'is' )
            // Gbind.g:44:9: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:45:7: ( 'iterate' )
            // Gbind.g:45:9: 'iterate'
            {
            match("iterate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:46:7: ( 'let' )
            // Gbind.g:46:9: 'let'
            {
            match("let"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:47:7: ( 'metamodel' )
            // Gbind.g:47:9: 'metamodel'
            {
            match("metamodel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:48:7: ( 'module' )
            // Gbind.g:48:9: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:49:7: ( 'operation' )
            // Gbind.g:49:9: 'operation'
            {
            match("operation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:50:7: ( 'ref' )
            // Gbind.g:50:9: 'ref'
            {
            match("ref"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:51:7: ( 'self' )
            // Gbind.g:51:9: 'self'
            {
            match("self"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:52:7: ( 'static' )
            // Gbind.g:52:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:53:7: ( 'super' )
            // Gbind.g:53:9: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:54:7: ( 'target' )
            // Gbind.g:54:9: 'target'
            {
            match("target"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:55:7: ( 'then' )
            // Gbind.g:55:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:56:7: ( 'to' )
            // Gbind.g:56:9: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:57:7: ( 'true' )
            // Gbind.g:57:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:58:7: ( 'virtual' )
            // Gbind.g:58:9: 'virtual'
            {
            match("virtual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:59:7: ( 'when' )
            // Gbind.g:59:9: 'when'
            {
            match("when"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:60:7: ( '{' )
            // Gbind.g:60:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:61:7: ( '|' )
            // Gbind.g:61:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:62:7: ( '}' )
            // Gbind.g:62:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16489:6: ( ( 'not' ) )
            // Gbind.g:16490:2: ( 'not' )
            {
            // Gbind.g:16490:2: ( 'not' )
            // Gbind.g:16490:2: 'not'
            {
            match("not"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTOP"

    // $ANTLR start "BOOLOP"
    public final void mBOOLOP() throws RecognitionException {
        try {
            int _type = BOOLOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16492:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // Gbind.g:16493:2: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // Gbind.g:16493:2: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // Gbind.g:16493:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // Gbind.g:16493:2: ( 'and' | 'or' | 'xor' | 'implies' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 'o':
                {
                alt1=2;
                }
                break;
            case 'x':
                {
                alt1=3;
                }
                break;
            case 'i':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // Gbind.g:16493:3: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // Gbind.g:16493:9: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 3 :
                    // Gbind.g:16493:14: 'xor'
                    {
                    match("xor"); 



                    }
                    break;
                case 4 :
                    // Gbind.g:16493:20: 'implies'
                    {
                    match("implies"); 



                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLOP"

    // $ANTLR start "INTOP"
    public final void mINTOP() throws RecognitionException {
        try {
            int _type = INTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16495:6: ( ( ( 'div' | 'mod' ) ) )
            // Gbind.g:16496:2: ( ( 'div' | 'mod' ) )
            {
            // Gbind.g:16496:2: ( ( 'div' | 'mod' ) )
            // Gbind.g:16496:2: ( 'div' | 'mod' )
            {
            // Gbind.g:16496:2: ( 'div' | 'mod' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='d') ) {
                alt2=1;
            }
            else if ( (LA2_0=='m') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Gbind.g:16496:3: 'div'
                    {
                    match("div"); 



                    }
                    break;
                case 2 :
                    // Gbind.g:16496:9: 'mod'
                    {
                    match("mod"); 



                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTOP"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16498:6: ( ( ( '>' | '<' | '>=' | '<=' ) ) )
            // Gbind.g:16499:2: ( ( '>' | '<' | '>=' | '<=' ) )
            {
            // Gbind.g:16499:2: ( ( '>' | '<' | '>=' | '<=' ) )
            // Gbind.g:16499:2: ( '>' | '<' | '>=' | '<=' )
            {
            // Gbind.g:16499:2: ( '>' | '<' | '>=' | '<=' )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='>') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=1;
                }
            }
            else if ( (LA3_0=='<') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=2;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Gbind.g:16499:3: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // Gbind.g:16499:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // Gbind.g:16499:11: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // Gbind.g:16499:16: '<='
                    {
                    match("<="); 



                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16501:3: ( '=' )
            // Gbind.g:16502:1: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16503:4: ( ( '<>' ) )
            // Gbind.g:16504:2: ( '<>' )
            {
            // Gbind.g:16504:2: ( '<>' )
            // Gbind.g:16504:2: '<>'
            {
            match("<>"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "ADDOP"
    public final void mADDOP() throws RecognitionException {
        try {
            int _type = ADDOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16506:6: ( ( ( '-' | '+' ) ) )
            // Gbind.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADDOP"

    // $ANTLR start "MULOP"
    public final void mMULOP() throws RecognitionException {
        try {
            int _type = MULOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16509:6: ( ( ( '*' | '/' ) ) )
            // Gbind.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULOP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16512:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Gbind.g:16513:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Gbind.g:16513:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Gbind.g:16513:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 



            // Gbind.g:16513:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Gbind.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16516:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // Gbind.g:16517:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // Gbind.g:16517:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // Gbind.g:16517:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // Gbind.g:16517:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Gbind.g:16517:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Gbind.g:16517:6: ( ( '0' .. '9' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Gbind.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match('.'); 

            // Gbind.g:16517:22: ( ( '0' .. '9' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Gbind.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16519:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // Gbind.g:16520:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Gbind.g:16520:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // Gbind.g:16520:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // Gbind.g:16520:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Gbind.g:16520:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Gbind.g:16520:6: ( ( '0' .. '9' ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Gbind.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "STRINGTYPE"
    public final void mSTRINGTYPE() throws RecognitionException {
        try {
            int _type = STRINGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16522:11: ( ( 'String' ) )
            // Gbind.g:16523:2: ( 'String' )
            {
            // Gbind.g:16523:2: ( 'String' )
            // Gbind.g:16523:2: 'String'
            {
            match("String"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGTYPE"

    // $ANTLR start "BOOLEANTYPE"
    public final void mBOOLEANTYPE() throws RecognitionException {
        try {
            int _type = BOOLEANTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16525:12: ( ( 'Boolean' ) )
            // Gbind.g:16526:2: ( 'Boolean' )
            {
            // Gbind.g:16526:2: ( 'Boolean' )
            // Gbind.g:16526:2: 'Boolean'
            {
            match("Boolean"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEANTYPE"

    // $ANTLR start "INTEGERTYPE"
    public final void mINTEGERTYPE() throws RecognitionException {
        try {
            int _type = INTEGERTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16528:12: ( ( 'Integer' ) )
            // Gbind.g:16529:2: ( 'Integer' )
            {
            // Gbind.g:16529:2: ( 'Integer' )
            // Gbind.g:16529:2: 'Integer'
            {
            match("Integer"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGERTYPE"

    // $ANTLR start "REALTYPE"
    public final void mREALTYPE() throws RecognitionException {
        try {
            int _type = REALTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16531:9: ( ( 'Real' ) )
            // Gbind.g:16532:2: ( 'Real' )
            {
            // Gbind.g:16532:2: ( 'Real' )
            // Gbind.g:16532:2: 'Real'
            {
            match("Real"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REALTYPE"

    // $ANTLR start "COLLECTIONTYPE"
    public final void mCOLLECTIONTYPE() throws RecognitionException {
        try {
            int _type = COLLECTIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16534:15: ( ( 'Collection' ) )
            // Gbind.g:16535:2: ( 'Collection' )
            {
            // Gbind.g:16535:2: ( 'Collection' )
            // Gbind.g:16535:2: 'Collection'
            {
            match("Collection"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLLECTIONTYPE"

    // $ANTLR start "BAGTYPE"
    public final void mBAGTYPE() throws RecognitionException {
        try {
            int _type = BAGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16537:8: ( 'Bag' )
            // Gbind.g:16538:1: 'Bag'
            {
            match("Bag"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAGTYPE"

    // $ANTLR start "ORDEREDSETTYPE"
    public final void mORDEREDSETTYPE() throws RecognitionException {
        try {
            int _type = ORDEREDSETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16539:15: ( 'OrderedSet' )
            // Gbind.g:16540:1: 'OrderedSet'
            {
            match("OrderedSet"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDEREDSETTYPE"

    // $ANTLR start "SEQUENCETYPE"
    public final void mSEQUENCETYPE() throws RecognitionException {
        try {
            int _type = SEQUENCETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16541:13: ( 'Sequence' )
            // Gbind.g:16542:1: 'Sequence'
            {
            match("Sequence"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEQUENCETYPE"

    // $ANTLR start "SETTYPE"
    public final void mSETTYPE() throws RecognitionException {
        try {
            int _type = SETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16543:8: ( 'Set' )
            // Gbind.g:16544:1: 'Set'
            {
            match("Set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SETTYPE"

    // $ANTLR start "OCLANYTYPE"
    public final void mOCLANYTYPE() throws RecognitionException {
        try {
            int _type = OCLANYTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16545:11: ( ( 'OclAny' ) )
            // Gbind.g:16546:2: ( 'OclAny' )
            {
            // Gbind.g:16546:2: ( 'OclAny' )
            // Gbind.g:16546:2: 'OclAny'
            {
            match("OclAny"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCLANYTYPE"

    // $ANTLR start "OCLTYPE"
    public final void mOCLTYPE() throws RecognitionException {
        try {
            int _type = OCLTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16548:8: ( ( 'OclType' ) )
            // Gbind.g:16549:2: ( 'OclType' )
            {
            // Gbind.g:16549:2: ( 'OclType' )
            // Gbind.g:16549:2: 'OclType'
            {
            match("OclType"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCLTYPE"

    // $ANTLR start "TUPLETYPE"
    public final void mTUPLETYPE() throws RecognitionException {
        try {
            int _type = TUPLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16551:10: ( ( 'TupleType' ) )
            // Gbind.g:16552:2: ( 'TupleType' )
            {
            // Gbind.g:16552:2: ( 'TupleType' )
            // Gbind.g:16552:2: 'TupleType'
            {
            match("TupleType"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TUPLETYPE"

    // $ANTLR start "TUPLE"
    public final void mTUPLE() throws RecognitionException {
        try {
            int _type = TUPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16554:6: ( 'Tuple' )
            // Gbind.g:16555:1: 'Tuple'
            {
            match("Tuple"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TUPLE"

    // $ANTLR start "MAPTYPE"
    public final void mMAPTYPE() throws RecognitionException {
        try {
            int _type = MAPTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16556:8: ( 'Map' )
            // Gbind.g:16557:1: 'Map'
            {
            match("Map"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAPTYPE"

    // $ANTLR start "LAMBDATYPE"
    public final void mLAMBDATYPE() throws RecognitionException {
        try {
            int _type = LAMBDATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16558:11: ( ( 'Lambda' ) )
            // Gbind.g:16559:2: ( 'Lambda' )
            {
            // Gbind.g:16559:2: ( 'Lambda' )
            // Gbind.g:16559:2: 'Lambda'
            {
            match("Lambda"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LAMBDATYPE"

    // $ANTLR start "ENVTYPE"
    public final void mENVTYPE() throws RecognitionException {
        try {
            int _type = ENVTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16561:8: ( ( 'Env' ) )
            // Gbind.g:16562:2: ( 'Env' )
            {
            // Gbind.g:16562:2: ( 'Env' )
            // Gbind.g:16562:2: 'Env'
            {
            match("Env"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENVTYPE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16564:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // Gbind.g:16565:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // Gbind.g:16565:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // Gbind.g:16565:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Gbind.g:16565:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Gbind.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16567:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Gbind.g:16568:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Gbind.g:16568:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Gbind.g:16568:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Gbind.g:16568:2: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt11=1;
                }
                break;
            case '\'':
                {
                alt11=2;
                }
                break;
            case '\n':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // Gbind.g:16568:3: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Gbind.g:16568:10: '\\'r'
                    {
                    match("'r"); 



                    }
                    break;
                case 3 :
                    // Gbind.g:16568:16: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16571:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Gbind.g:16572:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "QUOTED_34_34_92"
    public final void mQUOTED_34_34_92() throws RecognitionException {
        try {
            int _type = QUOTED_34_34_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16575:16: ( ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) ) )
            // Gbind.g:16576:2: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) )
            {
            // Gbind.g:16576:2: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) )
            // Gbind.g:16576:2: ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' )
            {
            // Gbind.g:16576:2: ( '\"' )
            // Gbind.g:16576:3: '\"'
            {
            match('\"'); 

            }


            // Gbind.g:16576:7: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2=='\"') ) {
                        alt12=1;
                    }
                    else if ( (LA12_2=='\\') ) {
                        alt12=2;
                    }


                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // Gbind.g:16576:8: ( '\\\\' '\"' )
            	    {
            	    // Gbind.g:16576:8: ( '\\\\' '\"' )
            	    // Gbind.g:16576:9: '\\\\' '\"'
            	    {
            	    match('\\'); 

            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Gbind.g:16576:18: ( '\\\\' '\\\\' )
            	    {
            	    // Gbind.g:16576:18: ( '\\\\' '\\\\' )
            	    // Gbind.g:16576:19: '\\\\' '\\\\'
            	    {
            	    match('\\'); 

            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Gbind.g:16576:29: (~ ( '\"' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // Gbind.g:16576:44: ( '\"' )
            // Gbind.g:16576:45: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34_92"

    // $ANTLR start "QUOTED_39_39_92"
    public final void mQUOTED_39_39_92() throws RecognitionException {
        try {
            int _type = QUOTED_39_39_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16578:16: ( ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) ) )
            // Gbind.g:16579:2: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) )
            {
            // Gbind.g:16579:2: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) )
            // Gbind.g:16579:2: ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' )
            {
            // Gbind.g:16579:2: ( '\\'' )
            // Gbind.g:16579:3: '\\''
            {
            match('\''); 

            }


            // Gbind.g:16579:8: ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2=='\'') ) {
                        alt13=1;
                    }
                    else if ( (LA13_2=='\\') ) {
                        alt13=2;
                    }


                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // Gbind.g:16579:9: ( '\\\\' '\\'' )
            	    {
            	    // Gbind.g:16579:9: ( '\\\\' '\\'' )
            	    // Gbind.g:16579:10: '\\\\' '\\''
            	    {
            	    match('\\'); 

            	    match('\''); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Gbind.g:16579:20: ( '\\\\' '\\\\' )
            	    {
            	    // Gbind.g:16579:20: ( '\\\\' '\\\\' )
            	    // Gbind.g:16579:21: '\\\\' '\\\\'
            	    {
            	    match('\\'); 

            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Gbind.g:16579:31: (~ ( '\\'' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // Gbind.g:16579:47: ( '\\'' )
            // Gbind.g:16579:48: '\\''
            {
            match('\''); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_39_39_92"

    // $ANTLR start "QUOTED_91_93"
    public final void mQUOTED_91_93() throws RecognitionException {
        try {
            int _type = QUOTED_91_93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:16581:13: ( ( ( '[' ) (~ ( ']' ) )* ( ']' ) ) )
            // Gbind.g:16582:2: ( ( '[' ) (~ ( ']' ) )* ( ']' ) )
            {
            // Gbind.g:16582:2: ( ( '[' ) (~ ( ']' ) )* ( ']' ) )
            // Gbind.g:16582:2: ( '[' ) (~ ( ']' ) )* ( ']' )
            {
            // Gbind.g:16582:2: ( '[' )
            // Gbind.g:16582:3: '['
            {
            match('['); 

            }


            // Gbind.g:16582:7: (~ ( ']' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\\')||(LA14_0 >= '^' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Gbind.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\\')||(input.LA(1) >= '^' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // Gbind.g:16582:16: ( ']' )
            // Gbind.g:16582:17: ']'
            {
            match(']'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_91_93"

    public void mTokens() throws RecognitionException {
        // Gbind.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 | QUOTED_91_93 )
        int alt15=81;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // Gbind.g:1:10: T__37
                {
                mT__37(); 


                }
                break;
            case 2 :
                // Gbind.g:1:16: T__38
                {
                mT__38(); 


                }
                break;
            case 3 :
                // Gbind.g:1:22: T__39
                {
                mT__39(); 


                }
                break;
            case 4 :
                // Gbind.g:1:28: T__40
                {
                mT__40(); 


                }
                break;
            case 5 :
                // Gbind.g:1:34: T__41
                {
                mT__41(); 


                }
                break;
            case 6 :
                // Gbind.g:1:40: T__42
                {
                mT__42(); 


                }
                break;
            case 7 :
                // Gbind.g:1:46: T__43
                {
                mT__43(); 


                }
                break;
            case 8 :
                // Gbind.g:1:52: T__44
                {
                mT__44(); 


                }
                break;
            case 9 :
                // Gbind.g:1:58: T__45
                {
                mT__45(); 


                }
                break;
            case 10 :
                // Gbind.g:1:64: T__46
                {
                mT__46(); 


                }
                break;
            case 11 :
                // Gbind.g:1:70: T__47
                {
                mT__47(); 


                }
                break;
            case 12 :
                // Gbind.g:1:76: T__48
                {
                mT__48(); 


                }
                break;
            case 13 :
                // Gbind.g:1:82: T__49
                {
                mT__49(); 


                }
                break;
            case 14 :
                // Gbind.g:1:88: T__50
                {
                mT__50(); 


                }
                break;
            case 15 :
                // Gbind.g:1:94: T__51
                {
                mT__51(); 


                }
                break;
            case 16 :
                // Gbind.g:1:100: T__52
                {
                mT__52(); 


                }
                break;
            case 17 :
                // Gbind.g:1:106: T__53
                {
                mT__53(); 


                }
                break;
            case 18 :
                // Gbind.g:1:112: T__54
                {
                mT__54(); 


                }
                break;
            case 19 :
                // Gbind.g:1:118: T__55
                {
                mT__55(); 


                }
                break;
            case 20 :
                // Gbind.g:1:124: T__56
                {
                mT__56(); 


                }
                break;
            case 21 :
                // Gbind.g:1:130: T__57
                {
                mT__57(); 


                }
                break;
            case 22 :
                // Gbind.g:1:136: T__58
                {
                mT__58(); 


                }
                break;
            case 23 :
                // Gbind.g:1:142: T__59
                {
                mT__59(); 


                }
                break;
            case 24 :
                // Gbind.g:1:148: T__60
                {
                mT__60(); 


                }
                break;
            case 25 :
                // Gbind.g:1:154: T__61
                {
                mT__61(); 


                }
                break;
            case 26 :
                // Gbind.g:1:160: T__62
                {
                mT__62(); 


                }
                break;
            case 27 :
                // Gbind.g:1:166: T__63
                {
                mT__63(); 


                }
                break;
            case 28 :
                // Gbind.g:1:172: T__64
                {
                mT__64(); 


                }
                break;
            case 29 :
                // Gbind.g:1:178: T__65
                {
                mT__65(); 


                }
                break;
            case 30 :
                // Gbind.g:1:184: T__66
                {
                mT__66(); 


                }
                break;
            case 31 :
                // Gbind.g:1:190: T__67
                {
                mT__67(); 


                }
                break;
            case 32 :
                // Gbind.g:1:196: T__68
                {
                mT__68(); 


                }
                break;
            case 33 :
                // Gbind.g:1:202: T__69
                {
                mT__69(); 


                }
                break;
            case 34 :
                // Gbind.g:1:208: T__70
                {
                mT__70(); 


                }
                break;
            case 35 :
                // Gbind.g:1:214: T__71
                {
                mT__71(); 


                }
                break;
            case 36 :
                // Gbind.g:1:220: T__72
                {
                mT__72(); 


                }
                break;
            case 37 :
                // Gbind.g:1:226: T__73
                {
                mT__73(); 


                }
                break;
            case 38 :
                // Gbind.g:1:232: T__74
                {
                mT__74(); 


                }
                break;
            case 39 :
                // Gbind.g:1:238: T__75
                {
                mT__75(); 


                }
                break;
            case 40 :
                // Gbind.g:1:244: T__76
                {
                mT__76(); 


                }
                break;
            case 41 :
                // Gbind.g:1:250: T__77
                {
                mT__77(); 


                }
                break;
            case 42 :
                // Gbind.g:1:256: T__78
                {
                mT__78(); 


                }
                break;
            case 43 :
                // Gbind.g:1:262: T__79
                {
                mT__79(); 


                }
                break;
            case 44 :
                // Gbind.g:1:268: T__80
                {
                mT__80(); 


                }
                break;
            case 45 :
                // Gbind.g:1:274: T__81
                {
                mT__81(); 


                }
                break;
            case 46 :
                // Gbind.g:1:280: T__82
                {
                mT__82(); 


                }
                break;
            case 47 :
                // Gbind.g:1:286: T__83
                {
                mT__83(); 


                }
                break;
            case 48 :
                // Gbind.g:1:292: T__84
                {
                mT__84(); 


                }
                break;
            case 49 :
                // Gbind.g:1:298: NOTOP
                {
                mNOTOP(); 


                }
                break;
            case 50 :
                // Gbind.g:1:304: BOOLOP
                {
                mBOOLOP(); 


                }
                break;
            case 51 :
                // Gbind.g:1:311: INTOP
                {
                mINTOP(); 


                }
                break;
            case 52 :
                // Gbind.g:1:317: RELOP
                {
                mRELOP(); 


                }
                break;
            case 53 :
                // Gbind.g:1:323: EQ
                {
                mEQ(); 


                }
                break;
            case 54 :
                // Gbind.g:1:326: NEQ
                {
                mNEQ(); 


                }
                break;
            case 55 :
                // Gbind.g:1:330: ADDOP
                {
                mADDOP(); 


                }
                break;
            case 56 :
                // Gbind.g:1:336: MULOP
                {
                mMULOP(); 


                }
                break;
            case 57 :
                // Gbind.g:1:342: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 58 :
                // Gbind.g:1:350: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 59 :
                // Gbind.g:1:356: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 60 :
                // Gbind.g:1:364: STRINGTYPE
                {
                mSTRINGTYPE(); 


                }
                break;
            case 61 :
                // Gbind.g:1:375: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 


                }
                break;
            case 62 :
                // Gbind.g:1:387: INTEGERTYPE
                {
                mINTEGERTYPE(); 


                }
                break;
            case 63 :
                // Gbind.g:1:399: REALTYPE
                {
                mREALTYPE(); 


                }
                break;
            case 64 :
                // Gbind.g:1:408: COLLECTIONTYPE
                {
                mCOLLECTIONTYPE(); 


                }
                break;
            case 65 :
                // Gbind.g:1:423: BAGTYPE
                {
                mBAGTYPE(); 


                }
                break;
            case 66 :
                // Gbind.g:1:431: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 


                }
                break;
            case 67 :
                // Gbind.g:1:446: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 


                }
                break;
            case 68 :
                // Gbind.g:1:459: SETTYPE
                {
                mSETTYPE(); 


                }
                break;
            case 69 :
                // Gbind.g:1:467: OCLANYTYPE
                {
                mOCLANYTYPE(); 


                }
                break;
            case 70 :
                // Gbind.g:1:478: OCLTYPE
                {
                mOCLTYPE(); 


                }
                break;
            case 71 :
                // Gbind.g:1:486: TUPLETYPE
                {
                mTUPLETYPE(); 


                }
                break;
            case 72 :
                // Gbind.g:1:496: TUPLE
                {
                mTUPLE(); 


                }
                break;
            case 73 :
                // Gbind.g:1:502: MAPTYPE
                {
                mMAPTYPE(); 


                }
                break;
            case 74 :
                // Gbind.g:1:510: LAMBDATYPE
                {
                mLAMBDATYPE(); 


                }
                break;
            case 75 :
                // Gbind.g:1:521: ENVTYPE
                {
                mENVTYPE(); 


                }
                break;
            case 76 :
                // Gbind.g:1:529: TEXT
                {
                mTEXT(); 


                }
                break;
            case 77 :
                // Gbind.g:1:534: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 78 :
                // Gbind.g:1:544: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 79 :
                // Gbind.g:1:555: QUOTED_34_34_92
                {
                mQUOTED_34_34_92(); 


                }
                break;
            case 80 :
                // Gbind.g:1:571: QUOTED_39_39_92
                {
                mQUOTED_39_39_92(); 


                }
                break;
            case 81 :
                // Gbind.g:1:587: QUOTED_91_93
                {
                mQUOTED_91_93(); 


                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\6\uffff\1\44\2\uffff\1\72\1\uffff\21\60\3\uffff\2\60\1\uffff\1"+
        "\41\3\uffff\1\141\11\60\13\uffff\16\60\1\177\1\60\1\u0082\1\u0083"+
        "\5\60\1\u0089\6\60\1\u0090\5\60\3\uffff\13\60\1\61\1\uffff\2\60"+
        "\1\u00a6\1\u0089\3\60\1\u00ab\1\u00ac\3\60\1\u00b0\3\60\1\uffff"+
        "\2\60\2\uffff\1\60\1\u00b8\1\60\1\u00ac\1\60\1\uffff\1\u00bc\5\60"+
        "\1\uffff\3\60\1\u00c5\1\u0089\2\60\1\u00c8\1\60\1\u00ca\4\60\1\u00cf"+
        "\1\60\1\u00d1\4\60\1\uffff\4\60\2\uffff\1\u00da\2\60\1\uffff\5\60"+
        "\1\u00e2\1\60\1\uffff\3\60\1\uffff\1\u00e7\3\60\1\u00eb\1\u00ec"+
        "\1\60\1\u00ee\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\u00f3\2\60"+
        "\1\uffff\1\60\1\uffff\5\60\1\u00fc\2\60\1\uffff\1\60\1\u0100\1\u0101"+
        "\4\60\1\uffff\4\60\1\uffff\1\60\1\u010b\1\60\2\uffff\1\60\1\uffff"+
        "\4\60\1\uffff\1\60\1\u0114\2\60\1\u0117\3\60\1\uffff\3\60\2\uffff"+
        "\1\60\1\u011f\1\u0120\3\60\1\u0124\1\60\1\u0126\1\uffff\1\u0127"+
        "\1\60\1\u0129\5\60\1\uffff\1\u012f\1\60\1\uffff\1\u0131\1\60\1\u0133"+
        "\1\u0134\1\u0135\1\uffff\1\u0136\2\uffff\1\u0089\1\u0137\1\60\1"+
        "\uffff\1\60\2\uffff\1\u013a\1\uffff\1\60\1\u013c\1\u013d\2\60\1"+
        "\uffff\1\60\1\uffff\1\60\5\uffff\2\60\1\uffff\1\u0144\2\uffff\4"+
        "\60\1\u0149\1\u014a\1\uffff\1\60\1\u014c\1\60\1\u014e\2\uffff\1"+
        "\u014f\1\uffff\1\60\2\uffff\1\u0151\1\uffff";
    static final String DFA15_eofS =
        "\u0152\uffff";
    static final String DFA15_minS =
        "\1\11\5\uffff\1\55\2\uffff\1\72\1\uffff\1\143\1\156\1\151\1\154"+
        "\1\145\1\154\1\141\1\145\1\146\2\145\1\160\2\145\1\141\1\151\1\150"+
        "\3\uffff\2\157\1\uffff\1\76\3\uffff\1\56\1\145\1\141\1\156\1\145"+
        "\1\157\1\165\2\141\1\156\2\uffff\1\0\10\uffff\1\154\1\144\1\164"+
        "\1\144\1\156\1\141\1\156\1\146\1\166\1\163\1\141\1\154\1\141\1\154"+
        "\1\60\1\160\2\60\1\145\2\164\1\144\1\145\1\60\1\146\1\154\1\141"+
        "\1\160\1\162\1\145\1\60\1\165\1\162\1\145\1\164\1\162\3\uffff\1"+
        "\162\1\161\1\157\1\147\1\164\1\141\1\154\2\160\1\155\1\166\1\0\1"+
        "\uffff\1\101\1\145\2\60\1\144\1\163\1\143\2\60\1\145\1\142\1\151"+
        "\1\60\1\163\1\164\1\160\1\uffff\1\154\1\164\2\uffff\1\162\1\60\1"+
        "\141\1\60\1\162\1\uffff\1\60\1\146\1\164\1\145\1\147\1\156\1\uffff"+
        "\1\145\1\164\1\156\2\60\1\151\1\165\1\60\1\154\1\60\1\145\3\154"+
        "\1\60\1\142\1\60\2\156\1\171\1\162\1\uffff\1\151\1\163\2\145\2\uffff"+
        "\1\60\1\154\1\146\1\uffff\1\145\1\165\1\145\1\162\1\151\1\60\1\141"+
        "\1\uffff\1\155\1\154\1\141\1\uffff\1\60\1\151\1\162\1\145\2\60\1"+
        "\165\1\60\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\147\1\60\2"+
        "\145\1\uffff\1\144\1\uffff\1\144\1\171\1\160\1\145\1\156\1\60\1"+
        "\160\1\170\1\uffff\1\145\2\60\2\162\1\164\1\145\1\uffff\1\164\1"+
        "\157\1\145\1\164\1\uffff\1\143\1\60\1\164\2\uffff\1\141\1\uffff"+
        "\1\147\1\156\1\141\1\145\1\uffff\1\143\1\60\1\141\1\145\1\60\1\145"+
        "\1\144\1\147\1\uffff\2\164\1\55\2\uffff\1\145\2\60\1\163\1\145\1"+
        "\144\1\60\1\151\1\60\1\uffff\1\60\1\154\1\60\1\143\1\156\1\162\1"+
        "\164\1\171\1\uffff\1\60\1\146\1\uffff\1\60\1\123\3\60\1\uffff\1"+
        "\60\2\uffff\2\60\1\145\1\uffff\1\157\2\uffff\1\60\1\uffff\1\145"+
        "\2\60\1\151\1\160\1\uffff\1\151\1\uffff\1\145\5\uffff\1\154\1\156"+
        "\1\uffff\1\60\2\uffff\1\157\1\145\1\156\1\164\2\60\1\uffff\1\156"+
        "\1\60\1\145\1\60\2\uffff\1\60\1\uffff\1\144\2\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\175\5\uffff\1\76\2\uffff\1\72\1\uffff\1\162\1\164\1\151\1\157"+
        "\1\151\1\156\2\145\1\164\1\145\1\157\1\162\1\145\1\165\1\162\1\151"+
        "\1\150\3\uffff\2\157\1\uffff\1\76\3\uffff\1\71\1\164\1\157\1\156"+
        "\1\145\1\157\1\165\2\141\1\156\2\uffff\1\uffff\10\uffff\1\154\1"+
        "\144\1\164\1\144\1\156\1\141\1\156\1\146\1\166\1\163\1\166\1\154"+
        "\1\141\1\154\1\172\1\160\2\172\1\145\2\164\1\144\1\145\1\172\1\146"+
        "\1\154\1\141\1\160\1\162\1\145\1\172\1\165\1\162\1\145\1\164\1\162"+
        "\3\uffff\1\162\1\164\1\157\1\147\1\164\1\141\1\154\2\160\1\155\1"+
        "\166\1\uffff\1\uffff\1\125\1\145\2\172\1\144\1\163\1\164\2\172\1"+
        "\145\1\142\1\151\1\172\1\163\1\164\1\160\1\uffff\1\157\1\164\2\uffff"+
        "\1\162\1\172\1\141\1\172\1\162\1\uffff\1\172\1\146\1\164\1\145\1"+
        "\147\1\156\1\uffff\1\145\1\164\1\156\2\172\1\151\1\165\1\172\1\154"+
        "\1\172\1\145\3\154\1\172\1\142\1\172\2\156\1\171\1\162\1\uffff\1"+
        "\151\1\163\2\145\2\uffff\1\172\1\154\1\146\1\uffff\1\145\1\165\1"+
        "\145\1\162\1\151\1\172\1\141\1\uffff\1\155\1\154\1\141\1\uffff\1"+
        "\172\1\151\1\162\1\145\2\172\1\165\1\172\1\uffff\1\156\1\145\1\uffff"+
        "\1\145\1\uffff\1\147\1\172\2\145\1\uffff\1\144\1\uffff\1\144\1\171"+
        "\1\160\1\145\1\156\1\172\1\160\1\170\1\uffff\1\145\2\172\2\162\1"+
        "\164\1\145\1\uffff\1\164\1\157\1\145\1\164\1\uffff\1\143\1\172\1"+
        "\164\2\uffff\1\141\1\uffff\1\147\1\156\1\141\1\145\1\uffff\1\143"+
        "\1\172\1\141\1\145\1\172\1\145\1\144\1\147\1\uffff\2\164\1\55\2"+
        "\uffff\1\145\2\172\1\163\1\145\1\144\1\172\1\151\1\172\1\uffff\1"+
        "\172\1\154\1\172\1\143\1\156\1\162\1\164\1\171\1\uffff\1\172\1\146"+
        "\1\uffff\1\172\1\123\3\172\1\uffff\1\172\2\uffff\2\172\1\145\1\uffff"+
        "\1\157\2\uffff\1\172\1\uffff\1\145\2\172\1\151\1\160\1\uffff\1\151"+
        "\1\uffff\1\145\5\uffff\1\154\1\156\1\uffff\1\172\2\uffff\1\157\1"+
        "\145\1\156\1\164\2\172\1\uffff\1\156\1\172\1\145\1\172\2\uffff\1"+
        "\172\1\uffff\1\144\2\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\13\21\uffff"+
        "\1\56\1\57\1\60\2\uffff\1\64\1\uffff\1\65\1\67\1\70\12\uffff\1\114"+
        "\1\115\1\uffff\1\116\1\117\1\121\1\6\1\71\1\10\1\12\1\11\44\uffff"+
        "\1\66\1\72\1\73\14\uffff\1\120\20\uffff\1\32\2\uffff\1\34\1\36\5"+
        "\uffff\1\62\6\uffff\1\52\25\uffff\1\15\4\uffff\1\22\1\63\3\uffff"+
        "\1\26\7\uffff\1\40\3\uffff\1\44\10\uffff\1\61\2\uffff\1\104\1\uffff"+
        "\1\101\4\uffff\1\111\1\uffff\1\113\10\uffff\1\23\7\uffff\1\35\4"+
        "\uffff\1\45\3\uffff\1\51\1\53\1\uffff\1\55\4\uffff\1\77\10\uffff"+
        "\1\17\3\uffff\1\25\1\27\11\uffff\1\47\10\uffff\1\110\2\uffff\1\105"+
        "\5\uffff\1\24\1\uffff\1\31\1\33\3\uffff\1\42\1\uffff\1\46\1\50\1"+
        "\uffff\1\74\5\uffff\1\112\1\uffff\1\106\1\uffff\1\16\1\20\1\21\1"+
        "\30\1\37\2\uffff\1\54\1\uffff\1\75\1\76\6\uffff\1\103\4\uffff\1"+
        "\41\1\43\1\uffff\1\107\1\uffff\1\102\1\100\1\uffff\1\14";
    static final String DFA15_specialS =
        "\62\uffff\1\0\72\uffff\1\1\u00e4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\63\1\61\1\uffff\1\63\1\61\22\uffff\1\63\1\1\1\64\1\2\3\uffff"+
            "\1\62\1\3\1\4\1\45\1\44\1\5\1\6\1\7\1\10\12\46\1\11\1\12\1\42"+
            "\1\43\1\41\2\uffff\1\60\1\50\1\53\1\60\1\57\3\60\1\51\2\60\1"+
            "\56\1\55\1\60\1\13\2\60\1\52\1\47\1\54\6\60\1\65\5\uffff\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\60\1\22\1\23\2\60\1\24\1\25\1\37"+
            "\1\26\2\60\1\27\1\30\1\31\1\60\1\32\1\33\1\40\2\60\1\34\1\35"+
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "\1\67\2\uffff\12\46\4\uffff\1\66",
            "",
            "",
            "\1\71",
            "",
            "\1\73\16\uffff\1\74",
            "\1\76\5\uffff\1\75",
            "\1\77",
            "\1\100\2\uffff\1\101",
            "\1\102\3\uffff\1\103",
            "\1\104\1\uffff\1\105",
            "\1\106\3\uffff\1\107",
            "\1\110",
            "\1\111\6\uffff\1\112\1\113\4\uffff\1\114\1\115",
            "\1\116",
            "\1\117\11\uffff\1\120",
            "\1\121\1\uffff\1\122",
            "\1\123",
            "\1\124\16\uffff\1\125\1\126",
            "\1\127\6\uffff\1\130\6\uffff\1\131\2\uffff\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "",
            "",
            "",
            "\1\140\1\uffff\12\46",
            "\1\143\16\uffff\1\142",
            "\1\145\15\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "\162\156\1\155\uff8d\156",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171\2\uffff\1\172\21\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0080",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0081\21"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097\2\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\0\156",
            "",
            "\1\u00a3\22\uffff\1\u00a4\1\u00a2",
            "\1\u00a5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\20\uffff\1\u00aa",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b5\2\uffff\1\u00b4",
            "\1\u00b6",
            "",
            "",
            "\1\u00b7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00b9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00ba\5\60",
            "\1\u00bb",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c6",
            "\1\u00c7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ed",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010c",
            "",
            "",
            "\1\u010d",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\12\60\7\uffff\23\60\1\u0113\6\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0115",
            "\1\u0116",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "\1\u011e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0125",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0128",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0130",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0132",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0138",
            "",
            "\1\u0139",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u013b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "",
            "\1\u0141",
            "",
            "",
            "",
            "",
            "",
            "\1\u0142",
            "\1\u0143",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u014b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u014d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0150",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 | QUOTED_91_93 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_50 = input.LA(1);

                        s = -1;
                        if ( (LA15_50=='r') ) {s = 109;}

                        else if ( ((LA15_50 >= '\u0000' && LA15_50 <= 'q')||(LA15_50 >= 's' && LA15_50 <= '\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_109 = input.LA(1);

                        s = -1;
                        if ( ((LA15_109 >= '\u0000' && LA15_109 <= '\uFFFF')) ) {s = 110;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}