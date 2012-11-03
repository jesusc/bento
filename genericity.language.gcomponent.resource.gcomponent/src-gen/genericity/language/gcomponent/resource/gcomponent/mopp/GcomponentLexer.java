// $ANTLR 3.4

	package genericity.language.gcomponent.resource.gcomponent.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GcomponentLexer extends Lexer {
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

    public GcomponentLexer() {} 
    public GcomponentLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GcomponentLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Gcomponent.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:15:6: ( '(' )
            // Gcomponent.g:15:8: '('
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:16:7: ( ')' )
            // Gcomponent.g:16:9: ')'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:17:7: ( '+' )
            // Gcomponent.g:17:9: '+'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:18:7: ( ',' )
            // Gcomponent.g:18:9: ','
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:19:7: ( '-' )
            // Gcomponent.g:19:9: '-'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:20:7: ( '->' )
            // Gcomponent.g:20:9: '->'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:21:7: ( ':' )
            // Gcomponent.g:21:9: ':'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:22:7: ( 'apply' )
            // Gcomponent.g:22:9: 'apply'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:23:7: ( 'atl' )
            // Gcomponent.g:23:9: 'atl'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:24:7: ( 'component' )
            // Gcomponent.g:24:9: 'component'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:25:7: ( 'compose' )
            // Gcomponent.g:25:9: 'compose'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:26:7: ( 'composite' )
            // Gcomponent.g:26:9: 'composite'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:27:7: ( 'concept' )
            // Gcomponent.g:27:9: 'concept'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:28:7: ( 'definition' )
            // Gcomponent.g:28:9: 'definition'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:29:7: ( 'source' )
            // Gcomponent.g:29:9: 'source'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:30:7: ( 'tags' )
            // Gcomponent.g:30:9: 'tags'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:31:7: ( 'target' )
            // Gcomponent.g:31:9: 'target'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:32:7: ( 'transformation' )
            // Gcomponent.g:32:9: 'transformation'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:33:7: ( 'uses' )
            // Gcomponent.g:33:9: 'uses'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:34:7: ( 'variants' )
            // Gcomponent.g:34:9: 'variants'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:35:7: ( 'when' )
            // Gcomponent.g:35:9: 'when'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:36:7: ( 'xor' )
            // Gcomponent.g:36:9: 'xor'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:37:7: ( '{' )
            // Gcomponent.g:37:9: '{'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:38:7: ( '}' )
            // Gcomponent.g:38:9: '}'
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
    // $ANTLR end "T__32"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:2404:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Gcomponent.g:2405:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Gcomponent.g:2405:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Gcomponent.g:2405:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Gcomponent.g:2405:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Gcomponent.g:
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
            	    break loop1;
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
            // Gcomponent.g:2408:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Gcomponent.g:2409:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Gcomponent.g:2409:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Gcomponent.g:2409:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Gcomponent.g:2409:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Gcomponent.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:2411:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Gcomponent.g:2412:2: ( ( ' ' | '\\t' | '\\f' ) )
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

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:2415:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Gcomponent.g:2416:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Gcomponent.g:2416:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Gcomponent.g:2416:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Gcomponent.g:2416:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\n') ) {
                    alt3=1;
                }
                else {
                    alt3=2;
                }
            }
            else if ( (LA3_0=='\n') ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Gcomponent.g:2416:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Gcomponent.g:2416:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Gcomponent.g:2416:20: '\\n'
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

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:2419:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Gcomponent.g:2420:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Gcomponent.g:2420:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Gcomponent.g:2420:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Gcomponent.g:2420:3: ( '\"' )
            // Gcomponent.g:2420:4: '\"'
            {
            match('\"'); 

            }


            // Gcomponent.g:2420:8: (~ ( '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Gcomponent.g:
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
            	    break loop4;
                }
            } while (true);


            // Gcomponent.g:2420:17: ( '\"' )
            // Gcomponent.g:2420:18: '\"'
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
        // Gcomponent.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | COMMENT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt5=29;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // Gcomponent.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // Gcomponent.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // Gcomponent.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // Gcomponent.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // Gcomponent.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // Gcomponent.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // Gcomponent.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // Gcomponent.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // Gcomponent.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // Gcomponent.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // Gcomponent.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // Gcomponent.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // Gcomponent.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // Gcomponent.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // Gcomponent.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // Gcomponent.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // Gcomponent.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // Gcomponent.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // Gcomponent.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // Gcomponent.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // Gcomponent.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // Gcomponent.g:1:135: T__30
                {
                mT__30(); 


                }
                break;
            case 23 :
                // Gcomponent.g:1:141: T__31
                {
                mT__31(); 


                }
                break;
            case 24 :
                // Gcomponent.g:1:147: T__32
                {
                mT__32(); 


                }
                break;
            case 25 :
                // Gcomponent.g:1:153: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 26 :
                // Gcomponent.g:1:161: TEXT
                {
                mTEXT(); 


                }
                break;
            case 27 :
                // Gcomponent.g:1:166: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 28 :
                // Gcomponent.g:1:177: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 29 :
                // Gcomponent.g:1:187: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\5\uffff\1\30\1\uffff\11\23\11\uffff\14\23\1\62\12\23\1\75\1\23"+
        "\1\uffff\4\23\1\103\2\23\1\106\1\23\1\110\1\uffff\1\111\4\23\1\uffff"+
        "\2\23\1\uffff\1\23\2\uffff\4\23\1\127\1\130\3\23\1\134\1\23\1\136"+
        "\1\23\2\uffff\3\23\1\uffff\1\23\1\uffff\2\23\1\146\1\147\1\150\2"+
        "\23\3\uffff\1\153\1\23\1\uffff\3\23\1\160\1\uffff";
    static final String DFA5_eofS =
        "\161\uffff";
    static final String DFA5_minS =
        "\1\11\4\uffff\1\55\1\uffff\1\160\1\157\1\145\1\157\1\141\1\163\1"+
        "\141\1\150\1\157\11\uffff\1\160\1\154\1\155\1\146\1\165\1\147\1"+
        "\141\1\145\1\162\1\145\1\162\1\154\1\55\1\160\1\143\1\151\1\162"+
        "\1\163\1\147\1\156\1\163\1\151\1\156\1\55\1\171\1\uffff\1\157\1"+
        "\145\1\156\1\143\1\55\1\145\1\163\1\55\1\141\1\55\1\uffff\1\55\1"+
        "\156\1\160\1\151\1\145\1\uffff\1\164\1\146\1\uffff\1\156\2\uffff"+
        "\2\145\2\164\2\55\1\157\1\164\1\156\1\55\1\164\1\55\1\151\2\uffff"+
        "\1\162\1\163\1\164\1\uffff\1\145\1\uffff\1\157\1\155\3\55\1\156"+
        "\1\141\3\uffff\1\55\1\164\1\uffff\1\151\1\157\1\156\1\55\1\uffff";
    static final String DFA5_maxS =
        "\1\175\4\uffff\1\172\1\uffff\1\164\1\157\1\145\1\157\1\162\1\163"+
        "\1\141\1\150\1\157\11\uffff\1\160\1\154\1\156\1\146\1\165\1\162"+
        "\1\141\1\145\1\162\1\145\1\162\1\154\1\172\1\160\1\143\1\151\1\162"+
        "\1\163\1\147\1\156\1\163\1\151\1\156\1\172\1\171\1\uffff\1\157\1"+
        "\145\1\156\1\143\1\172\1\145\1\163\1\172\1\141\1\172\1\uffff\1\172"+
        "\1\163\1\160\1\151\1\145\1\uffff\1\164\1\146\1\uffff\1\156\2\uffff"+
        "\1\145\1\151\2\164\2\172\1\157\1\164\1\156\1\172\1\164\1\172\1\151"+
        "\2\uffff\1\162\1\163\1\164\1\uffff\1\145\1\uffff\1\157\1\155\3\172"+
        "\1\156\1\141\3\uffff\1\172\1\164\1\uffff\1\151\1\157\1\156\1\172"+
        "\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\11\uffff\1\27\1\30\1\31\1\32"+
        "\1\33\1\34\1\35\1\6\1\5\31\uffff\1\11\12\uffff\1\26\5\uffff\1\20"+
        "\2\uffff\1\23\1\uffff\1\25\1\10\15\uffff\1\17\1\21\3\uffff\1\13"+
        "\1\uffff\1\15\7\uffff\1\24\1\12\1\14\2\uffff\1\16\4\uffff\1\22";
    static final String DFA5_specialS =
        "\161\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\24\1\25\1\uffff\1\24\1\25\22\uffff\1\24\1\uffff\1\26\5\uffff"+
            "\1\1\1\2\1\uffff\1\3\1\4\1\5\1\uffff\1\22\12\23\1\6\6\uffff"+
            "\32\23\4\uffff\1\23\1\uffff\1\7\1\23\1\10\1\11\16\23\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\2\23\1\20\1\uffff\1\21",
            "",
            "",
            "",
            "",
            "\1\23\2\uffff\12\23\4\uffff\1\27\2\uffff\32\23\4\uffff\1\23"+
            "\1\uffff\32\23",
            "",
            "\1\31\3\uffff\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36\20\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46\1\47",
            "\1\50",
            "\1\51",
            "\1\52\12\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\104",
            "\1\105",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\107",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\112\4\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "",
            "",
            "\1\122",
            "\1\123\3\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\135",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\137",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\23\2\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | COMMENT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}