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
            // Gbind.g:22:7: ( ':' )
            // Gbind.g:22:9: ':'
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:23:7: ( '::' )
            // Gbind.g:23:9: '::'
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:24:7: ( ';' )
            // Gbind.g:24:9: ';'
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:25:7: ( 'OclUndefined' )
            // Gbind.g:25:9: 'OclUndefined'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:26:7: ( 'binding' )
            // Gbind.g:26:9: 'binding'
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:27:7: ( 'class' )
            // Gbind.g:27:9: 'class'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:28:7: ( 'context' )
            // Gbind.g:28:9: 'context'
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:29:7: ( 'def' )
            // Gbind.g:29:9: 'def'
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:30:7: ( 'else' )
            // Gbind.g:30:9: 'else'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:31:7: ( 'endif' )
            // Gbind.g:31:9: 'endif'
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:32:7: ( 'env' )
            // Gbind.g:32:9: 'env'
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:33:7: ( 'false' )
            // Gbind.g:33:9: 'false'
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:34:7: ( 'feature' )
            // Gbind.g:34:9: 'feature'
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:35:7: ( 'for' )
            // Gbind.g:35:9: 'for'
            {
            match("for"); 



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
            // Gbind.g:36:7: ( 'helper' )
            // Gbind.g:36:9: 'helper'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:37:7: ( 'if' )
            // Gbind.g:37:9: 'if'
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:38:7: ( 'import' )
            // Gbind.g:38:9: 'import'
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:39:7: ( 'in' )
            // Gbind.g:39:9: 'in'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:40:7: ( 'is' )
            // Gbind.g:40:9: 'is'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:41:7: ( 'iterate' )
            // Gbind.g:41:9: 'iterate'
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:42:7: ( 'let' )
            // Gbind.g:42:9: 'let'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:43:7: ( 'metamodel' )
            // Gbind.g:43:9: 'metamodel'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:44:7: ( 'module' )
            // Gbind.g:44:9: 'module'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:45:7: ( 'operation' )
            // Gbind.g:45:9: 'operation'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:46:7: ( 'self' )
            // Gbind.g:46:9: 'self'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:47:7: ( 'static' )
            // Gbind.g:47:9: 'static'
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:48:7: ( 'super' )
            // Gbind.g:48:9: 'super'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:49:7: ( 'then' )
            // Gbind.g:49:9: 'then'
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:50:7: ( 'to' )
            // Gbind.g:50:9: 'to'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:51:7: ( 'true' )
            // Gbind.g:51:9: 'true'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:52:7: ( 'when' )
            // Gbind.g:52:9: 'when'
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:53:7: ( '{' )
            // Gbind.g:53:9: '{'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:54:7: ( '|' )
            // Gbind.g:54:9: '|'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:55:7: ( '}' )
            // Gbind.g:55:9: '}'
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
    // $ANTLR end "T__77"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gbind.g:13762:6: ( ( 'not' ) )
            // Gbind.g:13763:2: ( 'not' )
            {
            // Gbind.g:13763:2: ( 'not' )
            // Gbind.g:13763:2: 'not'
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
            // Gbind.g:13765:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // Gbind.g:13766:2: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // Gbind.g:13766:2: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // Gbind.g:13766:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // Gbind.g:13766:2: ( 'and' | 'or' | 'xor' | 'implies' )
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
                    // Gbind.g:13766:3: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // Gbind.g:13766:9: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 3 :
                    // Gbind.g:13766:14: 'xor'
                    {
                    match("xor"); 



                    }
                    break;
                case 4 :
                    // Gbind.g:13766:20: 'implies'
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
            // Gbind.g:13768:6: ( ( ( 'div' | 'mod' ) ) )
            // Gbind.g:13769:2: ( ( 'div' | 'mod' ) )
            {
            // Gbind.g:13769:2: ( ( 'div' | 'mod' ) )
            // Gbind.g:13769:2: ( 'div' | 'mod' )
            {
            // Gbind.g:13769:2: ( 'div' | 'mod' )
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
                    // Gbind.g:13769:3: 'div'
                    {
                    match("div"); 



                    }
                    break;
                case 2 :
                    // Gbind.g:13769:9: 'mod'
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
            // Gbind.g:13771:6: ( ( ( '>' | '<' | '>=' | '<=' ) ) )
            // Gbind.g:13772:2: ( ( '>' | '<' | '>=' | '<=' ) )
            {
            // Gbind.g:13772:2: ( ( '>' | '<' | '>=' | '<=' ) )
            // Gbind.g:13772:2: ( '>' | '<' | '>=' | '<=' )
            {
            // Gbind.g:13772:2: ( '>' | '<' | '>=' | '<=' )
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
                    // Gbind.g:13772:3: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // Gbind.g:13772:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // Gbind.g:13772:11: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // Gbind.g:13772:16: '<='
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
            // Gbind.g:13774:3: ( '=' )
            // Gbind.g:13775:1: '='
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
            // Gbind.g:13776:4: ( ( '<>' ) )
            // Gbind.g:13777:2: ( '<>' )
            {
            // Gbind.g:13777:2: ( '<>' )
            // Gbind.g:13777:2: '<>'
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
            // Gbind.g:13779:6: ( ( ( '-' | '+' ) ) )
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
            // Gbind.g:13782:6: ( ( ( '*' | '/' ) ) )
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
            // Gbind.g:13785:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Gbind.g:13786:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Gbind.g:13786:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Gbind.g:13786:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 



            // Gbind.g:13786:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
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
            // Gbind.g:13789:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // Gbind.g:13790:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // Gbind.g:13790:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // Gbind.g:13790:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // Gbind.g:13790:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Gbind.g:13790:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Gbind.g:13790:6: ( ( '0' .. '9' ) )+
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

            // Gbind.g:13790:22: ( ( '0' .. '9' ) )+
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
            // Gbind.g:13792:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // Gbind.g:13793:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Gbind.g:13793:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // Gbind.g:13793:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // Gbind.g:13793:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Gbind.g:13793:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Gbind.g:13793:6: ( ( '0' .. '9' ) )+
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
            // Gbind.g:13795:11: ( ( 'String' ) )
            // Gbind.g:13796:2: ( 'String' )
            {
            // Gbind.g:13796:2: ( 'String' )
            // Gbind.g:13796:2: 'String'
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
            // Gbind.g:13798:12: ( ( 'Boolean' ) )
            // Gbind.g:13799:2: ( 'Boolean' )
            {
            // Gbind.g:13799:2: ( 'Boolean' )
            // Gbind.g:13799:2: 'Boolean'
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
            // Gbind.g:13801:12: ( ( 'Integer' ) )
            // Gbind.g:13802:2: ( 'Integer' )
            {
            // Gbind.g:13802:2: ( 'Integer' )
            // Gbind.g:13802:2: 'Integer'
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
            // Gbind.g:13804:9: ( ( 'Real' ) )
            // Gbind.g:13805:2: ( 'Real' )
            {
            // Gbind.g:13805:2: ( 'Real' )
            // Gbind.g:13805:2: 'Real'
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
            // Gbind.g:13807:15: ( ( 'Collection' ) )
            // Gbind.g:13808:2: ( 'Collection' )
            {
            // Gbind.g:13808:2: ( 'Collection' )
            // Gbind.g:13808:2: 'Collection'
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
            // Gbind.g:13810:8: ( 'Bag' )
            // Gbind.g:13811:1: 'Bag'
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
            // Gbind.g:13812:15: ( 'OrderedSet' )
            // Gbind.g:13813:1: 'OrderedSet'
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
            // Gbind.g:13814:13: ( 'Sequence' )
            // Gbind.g:13815:1: 'Sequence'
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
            // Gbind.g:13816:8: ( 'Set' )
            // Gbind.g:13817:1: 'Set'
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
            // Gbind.g:13818:11: ( ( 'OclAny' ) )
            // Gbind.g:13819:2: ( 'OclAny' )
            {
            // Gbind.g:13819:2: ( 'OclAny' )
            // Gbind.g:13819:2: 'OclAny'
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
            // Gbind.g:13821:8: ( ( 'OclType' ) )
            // Gbind.g:13822:2: ( 'OclType' )
            {
            // Gbind.g:13822:2: ( 'OclType' )
            // Gbind.g:13822:2: 'OclType'
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
            // Gbind.g:13824:10: ( ( 'TupleType' ) )
            // Gbind.g:13825:2: ( 'TupleType' )
            {
            // Gbind.g:13825:2: ( 'TupleType' )
            // Gbind.g:13825:2: 'TupleType'
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
            // Gbind.g:13827:6: ( 'Tuple' )
            // Gbind.g:13828:1: 'Tuple'
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
            // Gbind.g:13829:8: ( 'Map' )
            // Gbind.g:13830:1: 'Map'
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
            // Gbind.g:13831:11: ( ( 'Lambda' ) )
            // Gbind.g:13832:2: ( 'Lambda' )
            {
            // Gbind.g:13832:2: ( 'Lambda' )
            // Gbind.g:13832:2: 'Lambda'
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
            // Gbind.g:13834:8: ( ( 'Env' ) )
            // Gbind.g:13835:2: ( 'Env' )
            {
            // Gbind.g:13835:2: ( 'Env' )
            // Gbind.g:13835:2: 'Env'
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
            // Gbind.g:13837:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // Gbind.g:13838:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // Gbind.g:13838:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // Gbind.g:13838:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Gbind.g:13838:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
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
            // Gbind.g:13840:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Gbind.g:13841:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Gbind.g:13841:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Gbind.g:13841:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Gbind.g:13841:2: ( '\\r\\n' | '\\'r' | '\\n' )
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
                    // Gbind.g:13841:3: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Gbind.g:13841:10: '\\'r'
                    {
                    match("'r"); 



                    }
                    break;
                case 3 :
                    // Gbind.g:13841:16: '\\n'
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
            // Gbind.g:13844:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Gbind.g:13845:2: ( ( ' ' | '\\t' | '\\f' ) )
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
            // Gbind.g:13848:16: ( ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) ) )
            // Gbind.g:13849:2: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) )
            {
            // Gbind.g:13849:2: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) )
            // Gbind.g:13849:2: ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' )
            {
            // Gbind.g:13849:2: ( '\"' )
            // Gbind.g:13849:3: '\"'
            {
            match('\"'); 

            }


            // Gbind.g:13849:7: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )*
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
            	    // Gbind.g:13849:8: ( '\\\\' '\"' )
            	    {
            	    // Gbind.g:13849:8: ( '\\\\' '\"' )
            	    // Gbind.g:13849:9: '\\\\' '\"'
            	    {
            	    match('\\'); 

            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Gbind.g:13849:18: ( '\\\\' '\\\\' )
            	    {
            	    // Gbind.g:13849:18: ( '\\\\' '\\\\' )
            	    // Gbind.g:13849:19: '\\\\' '\\\\'
            	    {
            	    match('\\'); 

            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Gbind.g:13849:29: (~ ( '\"' | '\\\\' ) )
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


            // Gbind.g:13849:44: ( '\"' )
            // Gbind.g:13849:45: '\"'
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
            // Gbind.g:13851:16: ( ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) ) )
            // Gbind.g:13852:2: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) )
            {
            // Gbind.g:13852:2: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) )
            // Gbind.g:13852:2: ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' )
            {
            // Gbind.g:13852:2: ( '\\'' )
            // Gbind.g:13852:3: '\\''
            {
            match('\''); 

            }


            // Gbind.g:13852:8: ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )*
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
            	    // Gbind.g:13852:9: ( '\\\\' '\\'' )
            	    {
            	    // Gbind.g:13852:9: ( '\\\\' '\\'' )
            	    // Gbind.g:13852:10: '\\\\' '\\''
            	    {
            	    match('\\'); 

            	    match('\''); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Gbind.g:13852:20: ( '\\\\' '\\\\' )
            	    {
            	    // Gbind.g:13852:20: ( '\\\\' '\\\\' )
            	    // Gbind.g:13852:21: '\\\\' '\\\\'
            	    {
            	    match('\\'); 

            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Gbind.g:13852:31: (~ ( '\\'' | '\\\\' ) )
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


            // Gbind.g:13852:47: ( '\\'' )
            // Gbind.g:13852:48: '\\''
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
            // Gbind.g:13854:13: ( ( ( '[' ) (~ ( ']' ) )* ( ']' ) ) )
            // Gbind.g:13855:2: ( ( '[' ) (~ ( ']' ) )* ( ']' ) )
            {
            // Gbind.g:13855:2: ( ( '[' ) (~ ( ']' ) )* ( ']' ) )
            // Gbind.g:13855:2: ( '[' ) (~ ( ']' ) )* ( ']' )
            {
            // Gbind.g:13855:2: ( '[' )
            // Gbind.g:13855:3: '['
            {
            match('['); 

            }


            // Gbind.g:13855:7: (~ ( ']' ) )*
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


            // Gbind.g:13855:16: ( ']' )
            // Gbind.g:13855:17: ']'
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
        // Gbind.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 | QUOTED_91_93 )
        int alt15=74;
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
                // Gbind.g:1:256: NOTOP
                {
                mNOTOP(); 


                }
                break;
            case 43 :
                // Gbind.g:1:262: BOOLOP
                {
                mBOOLOP(); 


                }
                break;
            case 44 :
                // Gbind.g:1:269: INTOP
                {
                mINTOP(); 


                }
                break;
            case 45 :
                // Gbind.g:1:275: RELOP
                {
                mRELOP(); 


                }
                break;
            case 46 :
                // Gbind.g:1:281: EQ
                {
                mEQ(); 


                }
                break;
            case 47 :
                // Gbind.g:1:284: NEQ
                {
                mNEQ(); 


                }
                break;
            case 48 :
                // Gbind.g:1:288: ADDOP
                {
                mADDOP(); 


                }
                break;
            case 49 :
                // Gbind.g:1:294: MULOP
                {
                mMULOP(); 


                }
                break;
            case 50 :
                // Gbind.g:1:300: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 51 :
                // Gbind.g:1:308: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 52 :
                // Gbind.g:1:314: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 53 :
                // Gbind.g:1:322: STRINGTYPE
                {
                mSTRINGTYPE(); 


                }
                break;
            case 54 :
                // Gbind.g:1:333: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 


                }
                break;
            case 55 :
                // Gbind.g:1:345: INTEGERTYPE
                {
                mINTEGERTYPE(); 


                }
                break;
            case 56 :
                // Gbind.g:1:357: REALTYPE
                {
                mREALTYPE(); 


                }
                break;
            case 57 :
                // Gbind.g:1:366: COLLECTIONTYPE
                {
                mCOLLECTIONTYPE(); 


                }
                break;
            case 58 :
                // Gbind.g:1:381: BAGTYPE
                {
                mBAGTYPE(); 


                }
                break;
            case 59 :
                // Gbind.g:1:389: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 


                }
                break;
            case 60 :
                // Gbind.g:1:404: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 


                }
                break;
            case 61 :
                // Gbind.g:1:417: SETTYPE
                {
                mSETTYPE(); 


                }
                break;
            case 62 :
                // Gbind.g:1:425: OCLANYTYPE
                {
                mOCLANYTYPE(); 


                }
                break;
            case 63 :
                // Gbind.g:1:436: OCLTYPE
                {
                mOCLTYPE(); 


                }
                break;
            case 64 :
                // Gbind.g:1:444: TUPLETYPE
                {
                mTUPLETYPE(); 


                }
                break;
            case 65 :
                // Gbind.g:1:454: TUPLE
                {
                mTUPLE(); 


                }
                break;
            case 66 :
                // Gbind.g:1:460: MAPTYPE
                {
                mMAPTYPE(); 


                }
                break;
            case 67 :
                // Gbind.g:1:468: LAMBDATYPE
                {
                mLAMBDATYPE(); 


                }
                break;
            case 68 :
                // Gbind.g:1:479: ENVTYPE
                {
                mENVTYPE(); 


                }
                break;
            case 69 :
                // Gbind.g:1:487: TEXT
                {
                mTEXT(); 


                }
                break;
            case 70 :
                // Gbind.g:1:492: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 71 :
                // Gbind.g:1:502: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 72 :
                // Gbind.g:1:513: QUOTED_34_34_92
                {
                mQUOTED_34_34_92(); 


                }
                break;
            case 73 :
                // Gbind.g:1:529: QUOTED_39_39_92
                {
                mQUOTED_39_39_92(); 


                }
                break;
            case 74 :
                // Gbind.g:1:545: QUOTED_91_93
                {
                mQUOTED_91_93(); 


                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\6\uffff\1\41\1\uffff\1\66\1\uffff\16\55\3\uffff\3\55\1\uffff\1"+
        "\36\3\uffff\1\132\11\55\12\uffff\15\55\1\166\1\55\1\170\1\171\5"+
        "\55\1\177\4\55\1\u0084\5\55\3\uffff\13\55\1\56\1\uffff\5\55\1\u009d"+
        "\1\u009e\2\55\1\u00a1\2\55\1\u00a4\1\55\1\uffff\1\55\2\uffff\1\55"+
        "\1\u00a9\1\55\1\u009e\1\55\1\uffff\4\55\1\uffff\2\55\1\u00b3\2\177"+
        "\2\55\1\u00b6\1\55\1\u00b8\4\55\1\u00bd\1\55\1\u00bf\7\55\2\uffff"+
        "\1\u00c7\1\55\1\uffff\2\55\1\uffff\4\55\1\uffff\3\55\1\u00d2\2\55"+
        "\1\u00d5\1\u00d6\1\u00d7\1\uffff\2\55\1\uffff\1\55\1\uffff\1\55"+
        "\1\u00dc\2\55\1\uffff\1\55\1\uffff\5\55\1\u00e5\1\55\1\uffff\1\u00e7"+
        "\1\u00e8\10\55\1\uffff\1\55\1\u00f2\3\uffff\4\55\1\uffff\1\55\1"+
        "\u00f9\2\55\1\u00fc\3\55\1\uffff\1\55\2\uffff\1\55\1\u0102\1\u0103"+
        "\3\55\1\u0107\1\55\1\u0109\1\uffff\1\u010a\5\55\1\uffff\1\u0110"+
        "\1\55\1\uffff\1\u0112\1\55\1\u0114\1\u0115\1\u0116\2\uffff\1\177"+
        "\1\u0117\1\55\1\uffff\1\55\2\uffff\1\55\1\u011b\1\u011c\2\55\1\uffff"+
        "\1\55\1\uffff\1\55\4\uffff\2\55\1\u0123\2\uffff\4\55\1\u0128\1\u0129"+
        "\1\uffff\1\55\1\u012b\1\55\1\u012d\2\uffff\1\u012e\1\uffff\1\55"+
        "\2\uffff\1\u0130\1\uffff";
    static final String DFA15_eofS =
        "\u0131\uffff";
    static final String DFA15_minS =
        "\1\11\5\uffff\1\55\1\uffff\1\72\1\uffff\1\143\1\151\1\154\1\145"+
        "\1\154\1\141\1\145\1\146\2\145\1\160\1\145\2\150\3\uffff\1\157\1"+
        "\156\1\157\1\uffff\1\76\3\uffff\1\56\1\145\1\141\1\156\1\145\1\157"+
        "\1\165\2\141\1\156\2\uffff\1\0\7\uffff\1\154\1\144\1\156\1\141\1"+
        "\156\1\146\1\166\1\163\1\144\1\154\1\141\1\162\1\154\1\60\1\160"+
        "\2\60\1\145\2\164\1\144\1\145\1\60\1\154\1\141\1\160\1\145\1\60"+
        "\1\165\1\145\1\164\1\144\1\162\3\uffff\1\162\1\161\1\157\1\147\1"+
        "\164\1\141\1\154\2\160\1\155\1\166\1\0\1\uffff\1\101\1\145\1\144"+
        "\1\163\1\164\2\60\1\145\1\151\1\60\1\163\1\164\1\60\1\160\1\uffff"+
        "\1\154\2\uffff\1\162\1\60\1\141\1\60\1\162\1\uffff\1\146\1\164\1"+
        "\145\1\156\1\uffff\1\145\1\156\3\60\1\151\1\165\1\60\1\154\1\60"+
        "\1\145\3\154\1\60\1\142\1\60\2\156\1\171\1\162\1\151\1\163\1\145"+
        "\2\uffff\1\60\1\146\1\uffff\1\145\1\165\1\uffff\1\145\1\162\1\151"+
        "\1\141\1\uffff\1\155\1\154\1\141\1\60\1\151\1\162\3\60\1\uffff\1"+
        "\156\1\145\1\uffff\1\145\1\uffff\1\147\1\60\2\145\1\uffff\1\144"+
        "\1\uffff\1\144\1\171\1\160\1\145\1\156\1\60\1\170\1\uffff\2\60\2"+
        "\162\1\164\1\145\1\164\1\157\1\145\1\164\1\uffff\1\143\1\60\3\uffff"+
        "\1\147\1\156\1\141\1\145\1\uffff\1\143\1\60\1\141\1\145\1\60\1\145"+
        "\1\144\1\147\1\uffff\1\164\2\uffff\1\145\2\60\1\163\1\145\1\144"+
        "\1\60\1\151\1\60\1\uffff\1\60\1\143\1\156\1\162\1\164\1\171\1\uffff"+
        "\1\60\1\146\1\uffff\1\60\1\123\3\60\2\uffff\2\60\1\145\1\uffff\1"+
        "\157\2\uffff\1\145\2\60\1\151\1\160\1\uffff\1\151\1\uffff\1\145"+
        "\4\uffff\1\154\1\156\1\60\2\uffff\1\157\1\145\1\156\1\164\2\60\1"+
        "\uffff\1\156\1\60\1\145\1\60\2\uffff\1\60\1\uffff\1\144\2\uffff"+
        "\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\175\5\uffff\1\76\1\uffff\1\72\1\uffff\1\162\1\151\1\157\1\151"+
        "\1\156\1\157\1\145\1\164\1\145\1\157\1\162\1\165\1\162\1\150\3\uffff"+
        "\1\157\1\156\1\157\1\uffff\1\76\3\uffff\1\71\1\164\1\157\1\156\1"+
        "\145\1\157\1\165\2\141\1\156\2\uffff\1\uffff\7\uffff\1\154\1\144"+
        "\1\156\1\141\1\156\1\146\1\166\1\163\1\166\1\154\1\141\1\162\1\154"+
        "\1\172\1\160\2\172\1\145\2\164\1\144\1\145\1\172\1\154\1\141\1\160"+
        "\1\145\1\172\1\165\1\145\1\164\1\144\1\162\3\uffff\1\162\1\164\1"+
        "\157\1\147\1\164\1\141\1\154\2\160\1\155\1\166\1\uffff\1\uffff\1"+
        "\125\1\145\1\144\1\163\1\164\2\172\1\145\1\151\1\172\1\163\1\164"+
        "\1\172\1\160\1\uffff\1\157\2\uffff\1\162\1\172\1\141\1\172\1\162"+
        "\1\uffff\1\146\1\164\1\145\1\156\1\uffff\1\145\1\156\3\172\1\151"+
        "\1\165\1\172\1\154\1\172\1\145\3\154\1\172\1\142\1\172\2\156\1\171"+
        "\1\162\1\151\1\163\1\145\2\uffff\1\172\1\146\1\uffff\1\145\1\165"+
        "\1\uffff\1\145\1\162\1\151\1\141\1\uffff\1\155\1\154\1\141\1\172"+
        "\1\151\1\162\3\172\1\uffff\1\156\1\145\1\uffff\1\145\1\uffff\1\147"+
        "\1\172\2\145\1\uffff\1\144\1\uffff\1\144\1\171\1\160\1\145\1\156"+
        "\1\172\1\170\1\uffff\2\172\2\162\1\164\1\145\1\164\1\157\1\145\1"+
        "\164\1\uffff\1\143\1\172\3\uffff\1\147\1\156\1\141\1\145\1\uffff"+
        "\1\143\1\172\1\141\1\145\1\172\1\145\1\144\1\147\1\uffff\1\164\2"+
        "\uffff\1\145\2\172\1\163\1\145\1\144\1\172\1\151\1\172\1\uffff\1"+
        "\172\1\143\1\156\1\162\1\164\1\171\1\uffff\1\172\1\146\1\uffff\1"+
        "\172\1\123\3\172\2\uffff\2\172\1\145\1\uffff\1\157\2\uffff\1\145"+
        "\2\172\1\151\1\160\1\uffff\1\151\1\uffff\1\145\4\uffff\1\154\1\156"+
        "\1\172\2\uffff\1\157\1\145\1\156\1\164\2\172\1\uffff\1\156\1\172"+
        "\1\145\1\172\2\uffff\1\172\1\uffff\1\144\2\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\12\16\uffff\1"+
        "\47\1\50\1\51\3\uffff\1\55\1\uffff\1\56\1\60\1\61\12\uffff\1\105"+
        "\1\106\1\uffff\1\107\1\110\1\112\1\6\1\62\1\11\1\10\41\uffff\1\57"+
        "\1\63\1\64\14\uffff\1\111\16\uffff\1\27\1\uffff\1\31\1\32\5\uffff"+
        "\1\53\4\uffff\1\44\30\uffff\1\17\1\54\2\uffff\1\22\2\uffff\1\25"+
        "\4\uffff\1\34\11\uffff\1\52\2\uffff\1\75\1\uffff\1\72\4\uffff\1"+
        "\102\1\uffff\1\104\7\uffff\1\20\12\uffff\1\40\2\uffff\1\43\1\45"+
        "\1\46\4\uffff\1\70\10\uffff\1\15\1\uffff\1\21\1\23\11\uffff\1\42"+
        "\6\uffff\1\101\2\uffff\1\76\5\uffff\1\26\1\30\3\uffff\1\36\1\uffff"+
        "\1\41\1\65\5\uffff\1\103\1\uffff\1\77\1\uffff\1\14\1\16\1\24\1\33"+
        "\3\uffff\1\66\1\67\6\uffff\1\74\4\uffff\1\35\1\37\1\uffff\1\100"+
        "\1\uffff\1\73\1\71\1\uffff\1\13";
    static final String DFA15_specialS =
        "\57\uffff\1\0\66\uffff\1\1\u00ca\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\60\1\56\1\uffff\1\60\1\56\22\uffff\1\60\1\1\1\61\1\2\3\uffff"+
            "\1\57\1\3\1\4\1\42\1\41\1\5\1\6\1\7\1\42\12\43\1\10\1\11\1\37"+
            "\1\40\1\36\2\uffff\1\55\1\45\1\50\1\55\1\54\3\55\1\46\2\55\1"+
            "\53\1\52\1\55\1\12\2\55\1\47\1\44\1\51\6\55\1\62\5\uffff\1\34"+
            "\1\13\1\14\1\15\1\16\1\17\1\55\1\20\1\21\2\55\1\22\1\23\1\33"+
            "\1\24\3\55\1\25\1\26\2\55\1\27\1\35\2\55\1\30\1\31\1\32",
            "",
            "",
            "",
            "",
            "",
            "\1\64\2\uffff\12\43\4\uffff\1\63",
            "",
            "\1\65",
            "",
            "\1\67\16\uffff\1\70",
            "\1\71",
            "\1\72\2\uffff\1\73",
            "\1\74\3\uffff\1\75",
            "\1\76\1\uffff\1\77",
            "\1\100\3\uffff\1\101\11\uffff\1\102",
            "\1\103",
            "\1\104\6\uffff\1\105\1\106\4\uffff\1\107\1\110",
            "\1\111",
            "\1\112\11\uffff\1\113",
            "\1\114\1\uffff\1\115",
            "\1\116\16\uffff\1\117\1\120",
            "\1\121\6\uffff\1\122\2\uffff\1\123",
            "\1\124",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "",
            "",
            "",
            "\1\131\1\uffff\12\43",
            "\1\134\16\uffff\1\133",
            "\1\136\15\uffff\1\135",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\162\147\1\146\uff8d\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\21\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\167",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008b\2\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\0\147",
            "",
            "\1\u0097\22\uffff\1\u0098\1\u0096",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u009f",
            "\1\u00a0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a2",
            "\1\u00a3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a5",
            "",
            "\1\u00a7\2\uffff\1\u00a6",
            "",
            "",
            "\1\u00a8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00aa",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00ab\5\55",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b4",
            "\1\u00b5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00be",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d3",
            "\1\u00d4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e6",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\12\55\7\uffff\23\55\1\u00f8\6\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fa",
            "\1\u00fb",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "",
            "",
            "\1\u0101",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0108",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0111",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0113",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0118",
            "",
            "\1\u0119",
            "",
            "",
            "\1\u011a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "",
            "\1\u0120",
            "",
            "",
            "",
            "",
            "\1\u0121",
            "\1\u0122",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u012a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u012c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u012f",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 | QUOTED_91_93 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_47 = input.LA(1);

                        s = -1;
                        if ( (LA15_47=='r') ) {s = 102;}

                        else if ( ((LA15_47 >= '\u0000' && LA15_47 <= 'q')||(LA15_47 >= 's' && LA15_47 <= '\uFFFF')) ) {s = 103;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_102 = input.LA(1);

                        s = -1;
                        if ( ((LA15_102 >= '\u0000' && LA15_102 <= '\uFFFF')) ) {s = 103;}

                        else s = 46;

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