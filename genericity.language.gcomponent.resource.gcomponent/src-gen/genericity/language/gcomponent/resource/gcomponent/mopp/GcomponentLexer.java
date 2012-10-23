// $ANTLR ${project.version} ${buildNumber}

	package genericity.language.gcomponent.resource.gcomponent.mopp;


import org.antlr.runtime3_3_0.*;

public class GcomponentLexer extends Lexer {
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

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public GcomponentLexer() {;} 
    public GcomponentLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GcomponentLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Gcomponent.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:16:6: ( 'transformation' )
            // Gcomponent.g:16:8: 'transformation'
            {
            match("transformation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:17:6: ( 'component' )
            // Gcomponent.g:17:8: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:18:7: ( '{' )
            // Gcomponent.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:19:7: ( 'source' )
            // Gcomponent.g:19:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:20:7: ( 'target' )
            // Gcomponent.g:20:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:21:7: ( '}' )
            // Gcomponent.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:22:7: ( 'concept' )
            // Gcomponent.g:22:9: 'concept'
            {
            match("concept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:23:7: ( ':' )
            // Gcomponent.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:24:7: ( 'tags' )
            // Gcomponent.g:24:9: 'tags'
            {
            match("tags"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:910:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Gcomponent.g:911:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Gcomponent.g:911:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Gcomponent.g:911:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Gcomponent.g:911:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Gcomponent.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:913:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Gcomponent.g:914:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Gcomponent.g:914:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Gcomponent.g:914:3: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:917:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Gcomponent.g:918:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Gcomponent.g:918:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Gcomponent.g:918:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Gcomponent.g:918:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Gcomponent.g:918:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Gcomponent.g:918:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Gcomponent.g:918:20: '\\n'
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
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Gcomponent.g:921:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Gcomponent.g:922:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Gcomponent.g:922:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Gcomponent.g:922:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Gcomponent.g:922:3: ( '\"' )
            // Gcomponent.g:922:4: '\"'
            {
            match('\"'); 

            }

            // Gcomponent.g:922:8: (~ ( '\"' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Gcomponent.g:922:9: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // Gcomponent.g:922:17: ( '\"' )
            // Gcomponent.g:922:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Gcomponent.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt4=13;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // Gcomponent.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // Gcomponent.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // Gcomponent.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // Gcomponent.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // Gcomponent.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // Gcomponent.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // Gcomponent.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // Gcomponent.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // Gcomponent.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // Gcomponent.g:1:62: TEXT
                {
                mTEXT(); 

                }
                break;
            case 11 :
                // Gcomponent.g:1:67: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 12 :
                // Gcomponent.g:1:78: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 13 :
                // Gcomponent.g:1:88: QUOTED_34_34
                {
                mQUOTED_34_34(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\2\7\1\uffff\1\7\6\uffff\14\7\1\35\5\7\1\uffff\4\7\1\47"+
        "\2\7\1\52\1\7\1\uffff\1\7\1\55\1\uffff\2\7\1\uffff\1\7\1\61\1\7"+
        "\1\uffff\3\7\1\66\1\uffff";
    static final String DFA4_eofS =
        "\67\uffff";
    static final String DFA4_minS =
        "\1\11\1\141\1\157\1\uffff\1\157\6\uffff\1\141\1\147\1\155\1\165"+
        "\1\156\1\147\1\163\1\160\1\143\1\162\1\163\1\145\1\55\1\157\1\145"+
        "\1\143\1\146\1\164\1\uffff\1\156\1\160\1\145\1\157\1\55\1\145\1"+
        "\164\1\55\1\162\1\uffff\1\156\1\55\1\uffff\1\155\1\164\1\uffff\1"+
        "\141\1\55\1\164\1\uffff\1\151\1\157\1\156\1\55\1\uffff";
    static final String DFA4_maxS =
        "\1\175\1\162\1\157\1\uffff\1\157\6\uffff\1\141\1\162\1\156\1\165"+
        "\1\156\1\147\1\163\1\160\1\143\1\162\1\163\1\145\1\172\1\157\1\145"+
        "\1\143\1\146\1\164\1\uffff\1\156\1\160\1\145\1\157\1\172\1\145\1"+
        "\164\1\172\1\162\1\uffff\1\156\1\172\1\uffff\1\155\1\164\1\uffff"+
        "\1\141\1\172\1\164\1\uffff\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\3\1\uffff\1\6\1\10\1\12\1\13\1\14\1\15\22\uffff\1\11"+
        "\11\uffff\1\5\2\uffff\1\4\2\uffff\1\7\3\uffff\1\2\4\uffff\1\1";
    static final String DFA4_specialS =
        "\67\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\10\1\11\1\uffff\1\10\1\11\22\uffff\1\10\1\uffff\1\12\12\uffff"+
            "\1\7\2\uffff\12\7\1\6\6\uffff\32\7\4\uffff\1\7\1\uffff\2\7\1"+
            "\2\17\7\1\4\1\1\6\7\1\3\1\uffff\1\5",
            "\1\14\20\uffff\1\13",
            "\1\15",
            "",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17",
            "\1\21\12\uffff\1\20",
            "\1\22\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\50",
            "\1\51",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\53",
            "",
            "\1\54",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\7\2\uffff\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}