// $ANTLR 3.4

	package bento.language.bentocomp.resource.bento.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BentoLexer extends Lexer {
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

    public BentoLexer() {} 
    public BentoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BentoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Bento.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:15:7: ( '(' )
            // Bento.g:15:9: '('
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:16:7: ( ')' )
            // Bento.g:16:9: ')'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:17:7: ( '+' )
            // Bento.g:17:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:18:7: ( ',' )
            // Bento.g:18:9: ','
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:19:7: ( '-' )
            // Bento.g:19:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:20:7: ( '->' )
            // Bento.g:20:9: '->'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:21:7: ( ':' )
            // Bento.g:21:9: ':'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:22:7: ( '=' )
            // Bento.g:22:9: '='
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:23:7: ( 'apply' )
            // Bento.g:23:9: 'apply'
            {
            match("apply"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:24:7: ( 'atl' )
            // Bento.g:24:9: 'atl'
            {
            match("atl"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:25:7: ( 'binding' )
            // Bento.g:25:9: 'binding'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:26:7: ( 'component' )
            // Bento.g:26:9: 'component'
            {
            match("component"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:27:7: ( 'compose' )
            // Bento.g:27:9: 'compose'
            {
            match("compose"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:28:7: ( 'composite' )
            // Bento.g:28:9: 'composite'
            {
            match("composite"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:29:7: ( 'concept' )
            // Bento.g:29:9: 'concept'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:30:7: ( 'contributos' )
            // Bento.g:30:9: 'contributos'
            {
            match("contributos"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:31:7: ( 'definition' )
            // Bento.g:31:9: 'definition'
            {
            match("definition"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:32:7: ( 'execution' )
            // Bento.g:32:9: 'execution'
            {
            match("execution"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:33:7: ( 'graphical' )
            // Bento.g:33:9: 'graphical'
            {
            match("graphical"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:34:7: ( 'java' )
            // Bento.g:34:9: 'java'
            {
            match("java"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:35:7: ( 'model' )
            // Bento.g:35:9: 'model'
            {
            match("model"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:36:7: ( 'seq' )
            // Bento.g:36:9: 'seq'
            {
            match("seq"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:37:7: ( 'sirius' )
            // Bento.g:37:9: 'sirius'
            {
            match("sirius"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:38:7: ( 'source' )
            // Bento.g:38:9: 'source'
            {
            match("source"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:39:7: ( 'tags' )
            // Bento.g:39:9: 'tags'
            {
            match("tags"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:40:7: ( 'target' )
            // Bento.g:40:9: 'target'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:41:7: ( 'transformation' )
            // Bento.g:41:9: 'transformation'
            {
            match("transformation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:42:7: ( 'uses' )
            // Bento.g:42:9: 'uses'
            {
            match("uses"); 



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
            // Bento.g:43:7: ( 'variants' )
            // Bento.g:43:9: 'variants'
            {
            match("variants"); 



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
            // Bento.g:44:7: ( 'version' )
            // Bento.g:44:9: 'version'
            {
            match("version"); 



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
            // Bento.g:45:7: ( 'when' )
            // Bento.g:45:9: 'when'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:46:7: ( 'with' )
            // Bento.g:46:9: 'with'
            {
            match("with"); 



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
            // Bento.g:47:7: ( 'xor' )
            // Bento.g:47:9: 'xor'
            {
            match("xor"); 



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
            // Bento.g:48:7: ( '{' )
            // Bento.g:48:9: '{'
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:49:7: ( '}' )
            // Bento.g:49:9: '}'
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
    // $ANTLR end "T__44"

    // $ANTLR start "QNAME"
    public final void mQNAME() throws RecognitionException {
        try {
            int _type = QNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:5274:6: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '.' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )+ ) )
            // Bento.g:5275:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '.' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )+ )
            {
            // Bento.g:5275:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '.' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )+ )
            // Bento.g:5275:3: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* ( '.' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Bento.g:5275:22: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Bento.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop1;
                }
            } while (true);


            // Bento.g:5275:55: ( '.' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )* )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Bento.g:5275:56: '.' ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            	    {
            	    match('.'); 

            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // Bento.g:5275:78: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // Bento.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "QNAME"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:5277:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Bento.g:5278:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Bento.g:5278:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Bento.g:5278:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Bento.g:5278:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Bento.g:
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

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:5281:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // Bento.g:5282:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // Bento.g:5282:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // Bento.g:5282:3: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Bento.g:5282:22: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Bento.g:
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
            	    break loop5;
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
            // Bento.g:5284:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Bento.g:5285:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Bento.g:5285:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Bento.g:5285:3: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Bento.g:5285:3: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt6=1;
                }
                break;
            case '\'':
                {
                alt6=2;
                }
                break;
            case '\n':
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Bento.g:5285:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Bento.g:5285:11: '\\'r'
                    {
                    match("'r"); 



                    }
                    break;
                case 3 :
                    // Bento.g:5285:17: '\\n'
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
            // Bento.g:5288:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Bento.g:5289:2: ( ( ' ' | '\\t' | '\\f' ) )
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

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Bento.g:5292:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Bento.g:5293:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Bento.g:5293:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Bento.g:5293:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Bento.g:5293:3: ( '\"' )
            // Bento.g:5293:4: '\"'
            {
            match('\"'); 

            }


            // Bento.g:5293:8: (~ ( '\"' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Bento.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop7;
                }
            } while (true);


            // Bento.g:5293:17: ( '\"' )
            // Bento.g:5293:18: '\"'
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
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Bento.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | QNAME | COMMENT | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34 )
        int alt8=41;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // Bento.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // Bento.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // Bento.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // Bento.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // Bento.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // Bento.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // Bento.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // Bento.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // Bento.g:1:58: T__18
                {
                mT__18(); 


                }
                break;
            case 10 :
                // Bento.g:1:64: T__19
                {
                mT__19(); 


                }
                break;
            case 11 :
                // Bento.g:1:70: T__20
                {
                mT__20(); 


                }
                break;
            case 12 :
                // Bento.g:1:76: T__21
                {
                mT__21(); 


                }
                break;
            case 13 :
                // Bento.g:1:82: T__22
                {
                mT__22(); 


                }
                break;
            case 14 :
                // Bento.g:1:88: T__23
                {
                mT__23(); 


                }
                break;
            case 15 :
                // Bento.g:1:94: T__24
                {
                mT__24(); 


                }
                break;
            case 16 :
                // Bento.g:1:100: T__25
                {
                mT__25(); 


                }
                break;
            case 17 :
                // Bento.g:1:106: T__26
                {
                mT__26(); 


                }
                break;
            case 18 :
                // Bento.g:1:112: T__27
                {
                mT__27(); 


                }
                break;
            case 19 :
                // Bento.g:1:118: T__28
                {
                mT__28(); 


                }
                break;
            case 20 :
                // Bento.g:1:124: T__29
                {
                mT__29(); 


                }
                break;
            case 21 :
                // Bento.g:1:130: T__30
                {
                mT__30(); 


                }
                break;
            case 22 :
                // Bento.g:1:136: T__31
                {
                mT__31(); 


                }
                break;
            case 23 :
                // Bento.g:1:142: T__32
                {
                mT__32(); 


                }
                break;
            case 24 :
                // Bento.g:1:148: T__33
                {
                mT__33(); 


                }
                break;
            case 25 :
                // Bento.g:1:154: T__34
                {
                mT__34(); 


                }
                break;
            case 26 :
                // Bento.g:1:160: T__35
                {
                mT__35(); 


                }
                break;
            case 27 :
                // Bento.g:1:166: T__36
                {
                mT__36(); 


                }
                break;
            case 28 :
                // Bento.g:1:172: T__37
                {
                mT__37(); 


                }
                break;
            case 29 :
                // Bento.g:1:178: T__38
                {
                mT__38(); 


                }
                break;
            case 30 :
                // Bento.g:1:184: T__39
                {
                mT__39(); 


                }
                break;
            case 31 :
                // Bento.g:1:190: T__40
                {
                mT__40(); 


                }
                break;
            case 32 :
                // Bento.g:1:196: T__41
                {
                mT__41(); 


                }
                break;
            case 33 :
                // Bento.g:1:202: T__42
                {
                mT__42(); 


                }
                break;
            case 34 :
                // Bento.g:1:208: T__43
                {
                mT__43(); 


                }
                break;
            case 35 :
                // Bento.g:1:214: T__44
                {
                mT__44(); 


                }
                break;
            case 36 :
                // Bento.g:1:220: QNAME
                {
                mQNAME(); 


                }
                break;
            case 37 :
                // Bento.g:1:226: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 38 :
                // Bento.g:1:234: TEXT
                {
                mTEXT(); 


                }
                break;
            case 39 :
                // Bento.g:1:239: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 40 :
                // Bento.g:1:249: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 41 :
                // Bento.g:1:260: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\5\uffff\1\36\2\uffff\16\43\2\uffff\1\43\6\uffff\3\43\2\uffff\23"+
        "\43\1\115\10\43\1\127\12\43\1\142\1\43\1\uffff\7\43\1\153\1\43\1"+
        "\uffff\2\43\1\157\2\43\1\162\2\43\1\165\1\166\1\uffff\1\167\7\43"+
        "\1\uffff\1\u0080\2\43\1\uffff\2\43\1\uffff\2\43\3\uffff\10\43\1"+
        "\uffff\1\u0090\1\u0091\1\u0092\3\43\1\u0096\1\43\1\u0098\1\43\1"+
        "\u009a\4\43\3\uffff\2\43\1\u00a1\1\uffff\1\43\1\uffff\1\43\1\uffff"+
        "\5\43\1\u00a9\1\uffff\1\u00aa\1\u00ab\2\43\1\u00ae\1\u00af\1\43"+
        "\3\uffff\1\43\1\u00b2\2\uffff\1\43\1\u00b4\1\uffff\1\43\1\uffff"+
        "\2\43\1\u00b8\1\uffff";
    static final String DFA8_eofS =
        "\u00b9\uffff";
    static final String DFA8_minS =
        "\1\11\4\uffff\1\76\2\uffff\16\56\2\uffff\1\56\6\uffff\3\56\2\uffff"+
        "\51\56\1\uffff\11\56\1\uffff\12\56\1\uffff\10\56\1\uffff\3\56\1"+
        "\uffff\2\56\1\uffff\2\56\3\uffff\10\56\1\uffff\17\56\3\uffff\3\56"+
        "\1\uffff\1\56\1\uffff\1\56\1\uffff\6\56\1\uffff\7\56\3\uffff\2\56"+
        "\2\uffff\2\56\1\uffff\1\56\1\uffff\3\56\1\uffff";
    static final String DFA8_maxS =
        "\1\175\4\uffff\1\76\2\uffff\16\172\2\uffff\1\172\6\uffff\3\172\2"+
        "\uffff\51\172\1\uffff\11\172\1\uffff\12\172\1\uffff\10\172\1\uffff"+
        "\3\172\1\uffff\2\172\1\uffff\2\172\3\uffff\10\172\1\uffff\17\172"+
        "\3\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\6\172\1\uffff"+
        "\7\172\3\uffff\2\172\2\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1"+
        "\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\16\uffff\1\42\1\43\1\uffff"+
        "\1\45\1\47\1\50\1\51\1\6\1\5\3\uffff\1\44\1\46\51\uffff\1\12\11"+
        "\uffff\1\26\12\uffff\1\41\10\uffff\1\24\3\uffff\1\31\2\uffff\1\34"+
        "\2\uffff\1\37\1\40\1\11\10\uffff\1\25\17\uffff\1\27\1\30\1\32\3"+
        "\uffff\1\13\1\uffff\1\15\1\uffff\1\17\6\uffff\1\36\7\uffff\1\35"+
        "\1\14\1\16\2\uffff\1\22\1\23\2\uffff\1\21\1\uffff\1\20\3\uffff\1"+
        "\33";
    static final String DFA8_specialS =
        "\u00b9\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\33\1\32\1\uffff\1\33\1\32\22\uffff\1\33\1\uffff\1\34\4\uffff"+
            "\1\32\1\1\1\2\1\uffff\1\3\1\4\1\5\1\uffff\1\31\12\uffff\1\6"+
            "\2\uffff\1\7\3\uffff\32\30\6\uffff\1\10\1\11\1\12\1\13\1\14"+
            "\1\30\1\15\2\30\1\16\2\30\1\17\5\30\1\20\1\21\1\22\1\23\1\24"+
            "\1\25\2\30\1\26\1\uffff\1\27",
            "",
            "",
            "",
            "",
            "\1\35",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\17\41\1\37\3\41\1"+
            "\40\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\44\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\45\13\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\46\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\27\41\1\47\2\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\50\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\51\31\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\52\13\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\53\3\41\1"+
            "\54\5\41\1\55\13\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\56\20\41\1\57\10"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\60\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\61\3\41\1\62\25"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\7\41\1\63\1\64\21"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\65\13\41",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\17\41\1\66\12\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\13\41\1\67\16\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\70\14\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\14\41\1\71\1\72\14"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\5\41\1\73\24\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\74\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\75\31\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\25\41\1\76\4\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\3\41\1\77\26\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\20\41\1\100\11\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\101\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\24\41\1\102\5\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\6\41\1\103\12\41"+
            "\1\104\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\105\31\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\106\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\107\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\110\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\111\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\112\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\113\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\13\41\1\114\16\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\3\41\1\116\26\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\17\41\1\117\12\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\2\41\1\120\20\41"+
            "\1\121\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\122\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\2\41\1\123\27\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\17\41\1\124\12\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\125\31\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\126\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\130\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\131\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\132\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\6\41\1\133\23\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\134\14\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\135\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\136\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\137\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\140\14\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\7\41\1\141\22\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\30\41\1\143\1\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\144\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\145\13\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\146\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\147\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\150\14\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\24\41\1\151\5\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\7\41\1\152\22\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\13\41\1\154\16\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\24\41\1\155\5\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\2\41\1\156\27\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\160\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\161\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\163\31\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\164\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\170\14\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\171\4\41"+
            "\1\172\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\17\41\1\173\12\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\174\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\175\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\176\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\177\21\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\u0081\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\u0082\25\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u0083\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\5\41\1\u0084\24\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\u0085\14"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\u0086\13"+
            "\41",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\6\41\1\u0087\23\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\u0088\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\u0089\3\41"+
            "\1\u008a\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u008b\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\41\1\u008c\30\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u008d\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\u008e\21"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\2\41\1\u008f\27\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\u0093\13"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u0094\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\u0095\14"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\u0097\14"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u0099\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\24\41\1\u009b\5\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\u009c\21"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\u009d\13"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\u009e\31\41",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\21\41\1\u009f\10"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\u00a0\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u00a2\6\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\4\41\1\u00a3\25\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u00a4\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\u00a5\13"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\u00a6\14"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\13\41\1\u00a7\16"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\14\41\1\u00a8\15"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\u00ac\13"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\u00ad\14"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\1\u00b0\31\41",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\22\41\1\u00b1\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\23\41\1\u00b3\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\10\41\1\u00b5\21"+
            "\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\16\41\1\u00b6\13"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\6\uffff\15\41\1\u00b7\14"+
            "\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | QNAME | COMMENT | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34 );";
        }
    }
 

}