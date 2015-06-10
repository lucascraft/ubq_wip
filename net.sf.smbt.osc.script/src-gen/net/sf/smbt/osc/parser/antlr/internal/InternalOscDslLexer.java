package net.sf.smbt.osc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOscDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=26;
    public static final int EOF=-1;
    public static final int RULE_EINTEGER=6;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_HEX=13;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int RULE_IPEXPR=10;
    public static final int T__154=154;
    public static final int RULE_DECIMAL=15;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_EBYTE=18;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int RULE_EIMPULSE=20;
    public static final int RULE_EFLOAT=7;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=23;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=8;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int RULE_HTTPADDR=16;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_EBOOLEAN=9;
    public static final int RULE_USBMAC=17;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_USBWINPORT=12;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int RULE_ETIMETAG=21;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=14;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int RULE_EBLOB=19;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=24;
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
    public static final int RULE_OSCADDR=5;
    public static final int RULE_OSCUSBLINUXMACADDR=11;
    public static final int RULE_ENULL=22;
    public static final int RULE_WS=25;

    // delegates
    // delegators

    public InternalOscDslLexer() {;} 
    public InternalOscDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOscDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:11:7: ( 'open' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:11:9: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:12:7: ( 'close' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:12:9: 'close'
            {
            match("close"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:13:7: ( 'hook' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:13:9: 'hook'
            {
            match("hook"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:14:7: ( 'unhook' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:14:9: 'unhook'
            {
            match("unhook"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:15:7: ( 'alias' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:15:9: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:16:7: ( 'status' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:16:9: 'status'
            {
            match("status"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:17:7: ( 'reset' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:17:9: 'reset'
            {
            match("reset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:18:7: ( '-v' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:18:9: '-v'
            {
            match("-v"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:19:7: ( 'help' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:19:9: 'help'
            {
            match("help"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:20:7: ( 'clear' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:20:9: 'clear'
            {
            match("clear"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:21:7: ( 'protocol' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:21:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:22:7: ( 'list' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:22:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:23:7: ( 'remove' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:23:9: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:24:7: ( '-' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:25:7: ( 'get' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:25:9: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:26:7: ( ':' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:27:7: ( 'bind' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:27:9: 'bind'
            {
            match("bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:28:7: ( '=' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:29:7: ( 'listen' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:29:9: 'listen'
            {
            match("listen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:30:7: ( '!' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:30:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:31:7: ( 'api' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:31:9: 'api'
            {
            match("api"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:32:7: ( '$' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:32:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:33:7: ( 'unlisten' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:33:9: 'unlisten'
            {
            match("unlisten"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:34:7: ( '#' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:34:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:35:7: ( 'clock' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:35:9: 'clock'
            {
            match("clock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:36:7: ( '&' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:36:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:37:7: ( 'bang' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:37:9: 'bang'
            {
            match("bang"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:38:7: ( '@' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:38:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:39:7: ( 'unforward' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:39:9: 'unforward'
            {
            match("unforward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:40:7: ( '<' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:40:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:41:7: ( '>' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:41:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:42:7: ( 'forward' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:42:9: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:43:7: ( 'set' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:43:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:44:7: ( '+' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:44:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:45:7: ( 'select' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:45:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:46:7: ( '.' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:46:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:47:7: ( 'kinematic' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:47:9: 'kinematic'
            {
            match("kinematic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:48:7: ( 'k' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:48:9: 'k'
            {
            match('k'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:49:7: ( '{' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:49:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:50:7: ( '}' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:50:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:51:7: ( 'udp://' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:51:9: 'udp://'
            {
            match("udp://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:52:7: ( 'tcp://' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:52:9: 'tcp://'
            {
            match("tcp://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:53:7: ( 'xbee://' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:53:9: 'xbee://'
            {
            match("xbee://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:54:7: ( 'http://' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:54:9: 'http://'
            {
            match("http://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:55:7: ( 'bt://' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:55:9: 'bt://'
            {
            match("bt://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:56:7: ( 'usb://' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:56:9: 'usb://'
            {
            match("usb://"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:57:7: ( '300' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:57:9: '300'
            {
            match("300"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:58:7: ( '1200' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:58:9: '1200'
            {
            match("1200"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:59:7: ( '2400' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:59:9: '2400'
            {
            match("2400"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:60:7: ( '4800' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:60:9: '4800'
            {
            match("4800"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:61:7: ( '9600' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:61:9: '9600'
            {
            match("9600"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:62:7: ( '14400' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:62:9: '14400'
            {
            match("14400"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:63:7: ( '19200' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:63:9: '19200'
            {
            match("19200"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:64:7: ( '28800' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:64:9: '28800'
            {
            match("28800"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:65:7: ( '38400' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:65:9: '38400'
            {
            match("38400"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:66:7: ( '57600' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:66:9: '57600'
            {
            match("57600"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:67:7: ( '115200' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:67:9: '115200'
            {
            match("115200"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:68:7: ( 'using' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:68:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:69:7: ( '*' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:69:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:70:7: ( 'function' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:70:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:71:7: ( '(' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:71:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:72:7: ( ',' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:72:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:73:7: ( ')' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:73:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:74:7: ( 'return' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:74:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:75:7: ( ';' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:75:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:76:7: ( 'enum' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:76:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:77:7: ( 'readonly' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:77:9: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:78:7: ( 'var' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:78:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:79:7: ( 'array' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:79:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:80:7: ( '[' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:80:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:81:7: ( ']' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:81:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:82:7: ( 'int' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:82:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:83:7: ( 'bool' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:83:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:84:8: ( 'float' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:84:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:85:8: ( 'string' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:85:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:86:8: ( 'calc' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:86:10: 'calc'
            {
            match("calc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:87:8: ( '==' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:87:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:88:8: ( '+=' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:88:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:89:8: ( '||' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:89:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:90:8: ( '&&' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:90:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:91:8: ( '!=' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:91:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:92:8: ( 'instanceof' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:92:10: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:93:8: ( '>=' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:93:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:94:8: ( '<=' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:94:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:95:8: ( '->' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:95:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:96:8: ( '..' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:96:10: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:97:8: ( '=>' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:97:10: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:98:8: ( '<>' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:98:10: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:99:8: ( '?:' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:99:10: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:100:8: ( '<=>' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:100:10: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:101:8: ( '**' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:101:10: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:102:8: ( '/' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:102:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:103:8: ( '%' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:103:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:104:8: ( 'as' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:104:10: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:105:8: ( '?.' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:105:10: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:106:8: ( '*.' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:106:10: '*.'
            {
            match("*."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:107:8: ( '|' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:107:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:108:8: ( 'if' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:108:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:109:8: ( 'else' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:109:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:110:8: ( 'switch' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:110:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:111:8: ( 'default' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:111:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:112:8: ( 'case' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:112:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:113:8: ( 'for' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:113:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:114:8: ( 'while' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:114:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:115:8: ( 'do' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:115:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:116:8: ( 'val' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:116:10: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:117:8: ( 'super' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:117:10: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:118:8: ( '::' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:118:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:119:8: ( 'new' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:119:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:120:8: ( 'false' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:120:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:121:8: ( 'true' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:121:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:122:8: ( 'null' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:122:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:123:8: ( 'typeof' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:123:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:124:8: ( 'throw' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:124:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:125:8: ( 'try' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:125:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:126:8: ( 'finally' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:126:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:127:8: ( 'catch' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:127:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:128:8: ( '?' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:128:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:129:8: ( 'extends' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:129:10: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:130:8: ( 'osc' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:130:10: 'osc'
            {
            match("osc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:131:8: ( 'midi' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:131:10: 'midi'
            {
            match("midi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:132:8: ( 'dmx' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:132:10: 'dmx'
            {
            match("dmx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:133:8: ( 'oscableton' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:133:10: 'oscableton'
            {
            match("oscableton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:134:8: ( 'oscwiimote' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:134:10: 'oscwiimote'
            {
            match("oscwiimote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:135:8: ( 'oscresolume' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:135:10: 'oscresolume'
            {
            match("oscresolume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:136:8: ( 'tuio' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:136:10: 'tuio'
            {
            match("tuio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:137:8: ( 'tuio2' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:137:10: 'tuio2'
            {
            match("tuio2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:138:8: ( 'thingm' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:138:10: 'thingm'
            {
            match("thingm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:139:8: ( 'firmata' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:139:10: 'firmata'
            {
            match("firmata"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:140:8: ( 'i2cfirmata' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:140:10: 'i2cfirmata'
            {
            match("i2cfirmata"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:141:8: ( 'pachube' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:141:10: 'pachube'
            {
            match("pachube"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:142:8: ( 'ubiquino' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:142:10: 'ubiquino'
            {
            match("ubiquino"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "RULE_OSCADDR"
    public final void mRULE_OSCADDR() throws RecognitionException {
        try {
            int _type = RULE_OSCADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9460:14: ( ( '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )+ )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9460:16: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )+
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9460:16: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9460:17: '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            	    {
            	    match('/'); 
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9460:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OSCADDR"

    // $ANTLR start "RULE_OSCUSBLINUXMACADDR"
    public final void mRULE_OSCUSBLINUXMACADDR() throws RecognitionException {
        try {
            int _type = RULE_OSCUSBLINUXMACADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9462:25: ( ( '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' )* )+ )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9462:27: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' )* )+
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9462:27: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' )* )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='/') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9462:28: '/' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' )*
            	    {
            	    match('/'); 
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9462:52: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '-' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:
            	    	    {
            	    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OSCUSBLINUXMACADDR"

    // $ANTLR start "RULE_USBWINPORT"
    public final void mRULE_USBWINPORT() throws RecognitionException {
        try {
            int _type = RULE_USBWINPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:17: ( ( 'COM0' | 'COM1' | 'COM2' | 'COM3' | 'COM4' | 'COM5' | 'COM6' | 'COM7' | 'COM8' | 'COM9' | 'COM10' | 'COM11' | 'COM12' | 'COM13' | 'COM14' | 'COM15' | 'COM16' | 'COM17' | 'COM18' | 'COM19' | 'COM20' ) )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:19: ( 'COM0' | 'COM1' | 'COM2' | 'COM3' | 'COM4' | 'COM5' | 'COM6' | 'COM7' | 'COM8' | 'COM9' | 'COM10' | 'COM11' | 'COM12' | 'COM13' | 'COM14' | 'COM15' | 'COM16' | 'COM17' | 'COM18' | 'COM19' | 'COM20' )
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:19: ( 'COM0' | 'COM1' | 'COM2' | 'COM3' | 'COM4' | 'COM5' | 'COM6' | 'COM7' | 'COM8' | 'COM9' | 'COM10' | 'COM11' | 'COM12' | 'COM13' | 'COM14' | 'COM15' | 'COM16' | 'COM17' | 'COM18' | 'COM19' | 'COM20' )
            int alt5=21;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:20: 'COM0'
                    {
                    match("COM0"); 


                    }
                    break;
                case 2 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:27: 'COM1'
                    {
                    match("COM1"); 


                    }
                    break;
                case 3 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:34: 'COM2'
                    {
                    match("COM2"); 


                    }
                    break;
                case 4 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:41: 'COM3'
                    {
                    match("COM3"); 


                    }
                    break;
                case 5 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:48: 'COM4'
                    {
                    match("COM4"); 


                    }
                    break;
                case 6 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:55: 'COM5'
                    {
                    match("COM5"); 


                    }
                    break;
                case 7 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:62: 'COM6'
                    {
                    match("COM6"); 


                    }
                    break;
                case 8 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:69: 'COM7'
                    {
                    match("COM7"); 


                    }
                    break;
                case 9 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:76: 'COM8'
                    {
                    match("COM8"); 


                    }
                    break;
                case 10 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:83: 'COM9'
                    {
                    match("COM9"); 


                    }
                    break;
                case 11 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:90: 'COM10'
                    {
                    match("COM10"); 


                    }
                    break;
                case 12 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:98: 'COM11'
                    {
                    match("COM11"); 


                    }
                    break;
                case 13 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:106: 'COM12'
                    {
                    match("COM12"); 


                    }
                    break;
                case 14 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:114: 'COM13'
                    {
                    match("COM13"); 


                    }
                    break;
                case 15 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:122: 'COM14'
                    {
                    match("COM14"); 


                    }
                    break;
                case 16 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:130: 'COM15'
                    {
                    match("COM15"); 


                    }
                    break;
                case 17 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:138: 'COM16'
                    {
                    match("COM16"); 


                    }
                    break;
                case 18 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:146: 'COM17'
                    {
                    match("COM17"); 


                    }
                    break;
                case 19 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:154: 'COM18'
                    {
                    match("COM18"); 


                    }
                    break;
                case 20 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:162: 'COM19'
                    {
                    match("COM19"); 


                    }
                    break;
                case 21 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9464:170: 'COM20'
                    {
                    match("COM20"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_USBWINPORT"

    // $ANTLR start "RULE_IPEXPR"
    public final void mRULE_IPEXPR() throws RecognitionException {
        try {
            int _type = RULE_IPEXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:13: ( ( ( '0' .. '9' | '*' | '.' )+ | 'localhost' )? ( ':' RULE_INT )? )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:15: ( ( '0' .. '9' | '*' | '.' )+ | 'localhost' )? ( ':' RULE_INT )?
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:15: ( ( '0' .. '9' | '*' | '.' )+ | 'localhost' )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='*'||LA7_0=='.'||(LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='l') ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:16: ( '0' .. '9' | '*' | '.' )+
                    {
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:16: ( '0' .. '9' | '*' | '.' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*'||LA6_0=='.'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:
                    	    {
                    	    if ( input.LA(1)=='*'||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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


                    }
                    break;
                case 2 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:36: 'localhost'
                    {
                    match("localhost"); 


                    }
                    break;

            }

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:50: ( ':' RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==':') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9466:51: ':' RULE_INT
                    {
                    match(':'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IPEXPR"

    // $ANTLR start "RULE_HTTPADDR"
    public final void mRULE_HTTPADDR() throws RecognitionException {
        try {
            int _type = RULE_HTTPADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9468:15: ( 'A' .. 'Z' '0' .. '9' ':' '.' '/' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9468:17: 'A' .. 'Z' '0' .. '9' ':' '.' '/'
            {
            matchRange('A','Z'); 
            matchRange('0','9'); 
            match(':'); 
            match('.'); 
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTTPADDR"

    // $ANTLR start "RULE_USBMAC"
    public final void mRULE_USBMAC() throws RecognitionException {
        try {
            int _type = RULE_USBMAC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9470:13: ( 'A' .. 'Z' ( 'A' .. 'Z' '0' .. '9' '-' )+ )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9470:15: 'A' .. 'Z' ( 'A' .. 'Z' '0' .. '9' '-' )+
            {
            matchRange('A','Z'); 
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9470:24: ( 'A' .. 'Z' '0' .. '9' '-' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='A' && LA9_0<='Z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9470:25: 'A' .. 'Z' '0' .. '9' '-'
            	    {
            	    matchRange('A','Z'); 
            	    matchRange('0','9'); 
            	    match('-'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_USBMAC"

    // $ANTLR start "RULE_EBYTE"
    public final void mRULE_EBYTE() throws RecognitionException {
        try {
            int _type = RULE_EBYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:12: ( ( '0x' ( '0' .. '9' | 'A' .. 'F' ) ( '0' .. '9' | 'A' .. 'F' ) | ( '0' .. '9' | '1' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) ) )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:14: ( '0x' ( '0' .. '9' | 'A' .. 'F' ) ( '0' .. '9' | 'A' .. 'F' ) | ( '0' .. '9' | '1' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) )
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:14: ( '0x' ( '0' .. '9' | 'A' .. 'F' ) ( '0' .. '9' | 'A' .. 'F' ) | ( '0' .. '9' | '1' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='0') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='x') ) {
                    alt11=1;
                }
                else {
                    alt11=2;}
            }
            else if ( ((LA11_0>='1' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:15: '0x' ( '0' .. '9' | 'A' .. 'F' ) ( '0' .. '9' | 'A' .. 'F' )
                    {
                    match("0x"); 

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:60: ( '0' .. '9' | '1' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                    {
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:60: ( '0' .. '9' | '1' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )
                    int alt10=4;
                    alt10 = dfa10.predict(input);
                    switch (alt10) {
                        case 1 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:61: '0' .. '9'
                            {
                            matchRange('0','9'); 

                            }
                            break;
                        case 2 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:70: '1' .. '9' '0' .. '9'
                            {
                            matchRange('1','9'); 
                            matchRange('0','9'); 

                            }
                            break;
                        case 3 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:88: '1' '0' .. '9' '0' .. '9'
                            {
                            match('1'); 
                            matchRange('0','9'); 
                            matchRange('0','9'); 

                            }
                            break;
                        case 4 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9472:110: '2' '0' .. '5' '0' .. '5'
                            {
                            match('2'); 
                            matchRange('0','5'); 
                            matchRange('0','5'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EBYTE"

    // $ANTLR start "RULE_EBLOB"
    public final void mRULE_EBLOB() throws RecognitionException {
        try {
            int _type = RULE_EBLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9474:12: ( 'b' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9474:14: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EBLOB"

    // $ANTLR start "RULE_EIMPULSE"
    public final void mRULE_EIMPULSE() throws RecognitionException {
        try {
            int _type = RULE_EIMPULSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9476:15: ( 'I' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9476:17: 'I'
            {
            match('I'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EIMPULSE"

    // $ANTLR start "RULE_ETIMETAG"
    public final void mRULE_ETIMETAG() throws RecognitionException {
        try {
            int _type = RULE_ETIMETAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9478:15: ( 't' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9478:17: 't'
            {
            match('t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ETIMETAG"

    // $ANTLR start "RULE_ENULL"
    public final void mRULE_ENULL() throws RecognitionException {
        try {
            int _type = RULE_ENULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9480:12: ( 'N' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9480:14: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENULL"

    // $ANTLR start "RULE_EBOOLEAN"
    public final void mRULE_EBOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_EBOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9482:15: ( ( 'T' | 'F' ) )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9482:17: ( 'T' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='T' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EBOOLEAN"

    // $ANTLR start "RULE_EFLOAT"
    public final void mRULE_EFLOAT() throws RecognitionException {
        try {
            int _type = RULE_EFLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9484:13: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ 'f' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9484:15: ( '0' .. '9' )* '.' ( '0' .. '9' )+ 'f'
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9484:15: ( '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9484:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('.'); 
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9484:31: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9484:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EFLOAT"

    // $ANTLR start "RULE_EINTEGER"
    public final void mRULE_EINTEGER() throws RecognitionException {
        try {
            int _type = RULE_EINTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9486:15: ( ( '0' .. '9' )+ 'i' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9486:17: ( '0' .. '9' )+ 'i'
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9486:17: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9486:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            match('i'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EINTEGER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9488:10: ( '$$$don\\'t use this anymore$$$' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9488:12: '$$$don\\'t use this anymore$$$'
            {
            match("$$$don't use this anymore$$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:12: ( '0x' | '0X' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='0') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='x') ) {
                    alt15=1;
                }
                else if ( (LA15_1=='X') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='f')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='#') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='B'||LA17_0=='b') ) {
                        alt17=1;
                    }
                    else if ( (LA17_0=='L'||LA17_0=='l') ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9490:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='E'||LA20_0=='e') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:36: ( '+' | '-' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='+'||LA19_0=='-') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='B'||LA21_0=='b') ) {
                alt21=1;
            }
            else if ( (LA21_0=='D'||LA21_0=='F'||LA21_0=='L'||LA21_0=='d'||LA21_0=='f'||LA21_0=='l') ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9492:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9494:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9494:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9494:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9494:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9494:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='$'||(LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\"') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\'') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9496:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9498:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9498:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9498:24: ( options {greedy=false; } : . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='*') ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1=='/') ) {
                        alt27=2;
                    }
                    else if ( ((LA27_1>='\u0000' && LA27_1<='.')||(LA27_1>='0' && LA27_1<='\uFFFF')) ) {
                        alt27=1;
                    }


                }
                else if ( ((LA27_0>='\u0000' && LA27_0<=')')||(LA27_0>='+' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9498:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:40: ( ( '\\r' )? '\\n' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:41: ( '\\r' )? '\\n'
                    {
                    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:41: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9500:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9502:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9502:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9502:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9504:16: ( . )
            // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:9504:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | RULE_OSCADDR | RULE_OSCUSBLINUXMACADDR | RULE_USBWINPORT | RULE_IPEXPR | RULE_HTTPADDR | RULE_USBMAC | RULE_EBYTE | RULE_EBLOB | RULE_EIMPULSE | RULE_ETIMETAG | RULE_ENULL | RULE_EBOOLEAN | RULE_EFLOAT | RULE_EINTEGER | RULE_INT | RULE_HEX | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=155;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:88: T__40
                {
                mT__40(); 

                }
                break;
            case 15 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:94: T__41
                {
                mT__41(); 

                }
                break;
            case 16 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:100: T__42
                {
                mT__42(); 

                }
                break;
            case 17 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:106: T__43
                {
                mT__43(); 

                }
                break;
            case 18 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:112: T__44
                {
                mT__44(); 

                }
                break;
            case 19 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:118: T__45
                {
                mT__45(); 

                }
                break;
            case 20 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:124: T__46
                {
                mT__46(); 

                }
                break;
            case 21 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:130: T__47
                {
                mT__47(); 

                }
                break;
            case 22 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:136: T__48
                {
                mT__48(); 

                }
                break;
            case 23 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:142: T__49
                {
                mT__49(); 

                }
                break;
            case 24 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:148: T__50
                {
                mT__50(); 

                }
                break;
            case 25 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:154: T__51
                {
                mT__51(); 

                }
                break;
            case 26 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:160: T__52
                {
                mT__52(); 

                }
                break;
            case 27 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:166: T__53
                {
                mT__53(); 

                }
                break;
            case 28 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:172: T__54
                {
                mT__54(); 

                }
                break;
            case 29 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:178: T__55
                {
                mT__55(); 

                }
                break;
            case 30 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:184: T__56
                {
                mT__56(); 

                }
                break;
            case 31 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:190: T__57
                {
                mT__57(); 

                }
                break;
            case 32 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:196: T__58
                {
                mT__58(); 

                }
                break;
            case 33 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:202: T__59
                {
                mT__59(); 

                }
                break;
            case 34 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:208: T__60
                {
                mT__60(); 

                }
                break;
            case 35 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:214: T__61
                {
                mT__61(); 

                }
                break;
            case 36 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:220: T__62
                {
                mT__62(); 

                }
                break;
            case 37 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:226: T__63
                {
                mT__63(); 

                }
                break;
            case 38 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:232: T__64
                {
                mT__64(); 

                }
                break;
            case 39 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:238: T__65
                {
                mT__65(); 

                }
                break;
            case 40 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:244: T__66
                {
                mT__66(); 

                }
                break;
            case 41 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:250: T__67
                {
                mT__67(); 

                }
                break;
            case 42 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:256: T__68
                {
                mT__68(); 

                }
                break;
            case 43 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:262: T__69
                {
                mT__69(); 

                }
                break;
            case 44 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:268: T__70
                {
                mT__70(); 

                }
                break;
            case 45 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:274: T__71
                {
                mT__71(); 

                }
                break;
            case 46 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:280: T__72
                {
                mT__72(); 

                }
                break;
            case 47 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:286: T__73
                {
                mT__73(); 

                }
                break;
            case 48 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:292: T__74
                {
                mT__74(); 

                }
                break;
            case 49 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:298: T__75
                {
                mT__75(); 

                }
                break;
            case 50 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:304: T__76
                {
                mT__76(); 

                }
                break;
            case 51 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:310: T__77
                {
                mT__77(); 

                }
                break;
            case 52 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:316: T__78
                {
                mT__78(); 

                }
                break;
            case 53 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:322: T__79
                {
                mT__79(); 

                }
                break;
            case 54 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:328: T__80
                {
                mT__80(); 

                }
                break;
            case 55 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:334: T__81
                {
                mT__81(); 

                }
                break;
            case 56 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:340: T__82
                {
                mT__82(); 

                }
                break;
            case 57 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:346: T__83
                {
                mT__83(); 

                }
                break;
            case 58 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:352: T__84
                {
                mT__84(); 

                }
                break;
            case 59 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:358: T__85
                {
                mT__85(); 

                }
                break;
            case 60 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:364: T__86
                {
                mT__86(); 

                }
                break;
            case 61 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:370: T__87
                {
                mT__87(); 

                }
                break;
            case 62 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:376: T__88
                {
                mT__88(); 

                }
                break;
            case 63 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:382: T__89
                {
                mT__89(); 

                }
                break;
            case 64 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:388: T__90
                {
                mT__90(); 

                }
                break;
            case 65 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:394: T__91
                {
                mT__91(); 

                }
                break;
            case 66 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:400: T__92
                {
                mT__92(); 

                }
                break;
            case 67 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:406: T__93
                {
                mT__93(); 

                }
                break;
            case 68 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:412: T__94
                {
                mT__94(); 

                }
                break;
            case 69 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:418: T__95
                {
                mT__95(); 

                }
                break;
            case 70 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:424: T__96
                {
                mT__96(); 

                }
                break;
            case 71 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:430: T__97
                {
                mT__97(); 

                }
                break;
            case 72 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:436: T__98
                {
                mT__98(); 

                }
                break;
            case 73 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:442: T__99
                {
                mT__99(); 

                }
                break;
            case 74 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:448: T__100
                {
                mT__100(); 

                }
                break;
            case 75 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:455: T__101
                {
                mT__101(); 

                }
                break;
            case 76 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:462: T__102
                {
                mT__102(); 

                }
                break;
            case 77 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:469: T__103
                {
                mT__103(); 

                }
                break;
            case 78 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:476: T__104
                {
                mT__104(); 

                }
                break;
            case 79 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:483: T__105
                {
                mT__105(); 

                }
                break;
            case 80 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:490: T__106
                {
                mT__106(); 

                }
                break;
            case 81 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:497: T__107
                {
                mT__107(); 

                }
                break;
            case 82 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:504: T__108
                {
                mT__108(); 

                }
                break;
            case 83 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:511: T__109
                {
                mT__109(); 

                }
                break;
            case 84 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:518: T__110
                {
                mT__110(); 

                }
                break;
            case 85 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:525: T__111
                {
                mT__111(); 

                }
                break;
            case 86 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:532: T__112
                {
                mT__112(); 

                }
                break;
            case 87 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:539: T__113
                {
                mT__113(); 

                }
                break;
            case 88 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:546: T__114
                {
                mT__114(); 

                }
                break;
            case 89 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:553: T__115
                {
                mT__115(); 

                }
                break;
            case 90 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:560: T__116
                {
                mT__116(); 

                }
                break;
            case 91 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:567: T__117
                {
                mT__117(); 

                }
                break;
            case 92 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:574: T__118
                {
                mT__118(); 

                }
                break;
            case 93 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:581: T__119
                {
                mT__119(); 

                }
                break;
            case 94 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:588: T__120
                {
                mT__120(); 

                }
                break;
            case 95 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:595: T__121
                {
                mT__121(); 

                }
                break;
            case 96 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:602: T__122
                {
                mT__122(); 

                }
                break;
            case 97 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:609: T__123
                {
                mT__123(); 

                }
                break;
            case 98 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:616: T__124
                {
                mT__124(); 

                }
                break;
            case 99 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:623: T__125
                {
                mT__125(); 

                }
                break;
            case 100 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:630: T__126
                {
                mT__126(); 

                }
                break;
            case 101 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:637: T__127
                {
                mT__127(); 

                }
                break;
            case 102 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:644: T__128
                {
                mT__128(); 

                }
                break;
            case 103 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:651: T__129
                {
                mT__129(); 

                }
                break;
            case 104 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:658: T__130
                {
                mT__130(); 

                }
                break;
            case 105 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:665: T__131
                {
                mT__131(); 

                }
                break;
            case 106 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:672: T__132
                {
                mT__132(); 

                }
                break;
            case 107 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:679: T__133
                {
                mT__133(); 

                }
                break;
            case 108 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:686: T__134
                {
                mT__134(); 

                }
                break;
            case 109 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:693: T__135
                {
                mT__135(); 

                }
                break;
            case 110 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:700: T__136
                {
                mT__136(); 

                }
                break;
            case 111 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:707: T__137
                {
                mT__137(); 

                }
                break;
            case 112 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:714: T__138
                {
                mT__138(); 

                }
                break;
            case 113 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:721: T__139
                {
                mT__139(); 

                }
                break;
            case 114 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:728: T__140
                {
                mT__140(); 

                }
                break;
            case 115 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:735: T__141
                {
                mT__141(); 

                }
                break;
            case 116 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:742: T__142
                {
                mT__142(); 

                }
                break;
            case 117 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:749: T__143
                {
                mT__143(); 

                }
                break;
            case 118 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:756: T__144
                {
                mT__144(); 

                }
                break;
            case 119 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:763: T__145
                {
                mT__145(); 

                }
                break;
            case 120 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:770: T__146
                {
                mT__146(); 

                }
                break;
            case 121 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:777: T__147
                {
                mT__147(); 

                }
                break;
            case 122 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:784: T__148
                {
                mT__148(); 

                }
                break;
            case 123 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:791: T__149
                {
                mT__149(); 

                }
                break;
            case 124 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:798: T__150
                {
                mT__150(); 

                }
                break;
            case 125 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:805: T__151
                {
                mT__151(); 

                }
                break;
            case 126 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:812: T__152
                {
                mT__152(); 

                }
                break;
            case 127 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:819: T__153
                {
                mT__153(); 

                }
                break;
            case 128 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:826: T__154
                {
                mT__154(); 

                }
                break;
            case 129 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:833: T__155
                {
                mT__155(); 

                }
                break;
            case 130 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:840: T__156
                {
                mT__156(); 

                }
                break;
            case 131 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:847: T__157
                {
                mT__157(); 

                }
                break;
            case 132 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:854: T__158
                {
                mT__158(); 

                }
                break;
            case 133 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:861: RULE_OSCADDR
                {
                mRULE_OSCADDR(); 

                }
                break;
            case 134 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:874: RULE_OSCUSBLINUXMACADDR
                {
                mRULE_OSCUSBLINUXMACADDR(); 

                }
                break;
            case 135 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:898: RULE_USBWINPORT
                {
                mRULE_USBWINPORT(); 

                }
                break;
            case 136 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:914: RULE_IPEXPR
                {
                mRULE_IPEXPR(); 

                }
                break;
            case 137 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:926: RULE_HTTPADDR
                {
                mRULE_HTTPADDR(); 

                }
                break;
            case 138 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:940: RULE_USBMAC
                {
                mRULE_USBMAC(); 

                }
                break;
            case 139 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:952: RULE_EBYTE
                {
                mRULE_EBYTE(); 

                }
                break;
            case 140 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:963: RULE_EBLOB
                {
                mRULE_EBLOB(); 

                }
                break;
            case 141 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:974: RULE_EIMPULSE
                {
                mRULE_EIMPULSE(); 

                }
                break;
            case 142 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:988: RULE_ETIMETAG
                {
                mRULE_ETIMETAG(); 

                }
                break;
            case 143 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1002: RULE_ENULL
                {
                mRULE_ENULL(); 

                }
                break;
            case 144 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1013: RULE_EBOOLEAN
                {
                mRULE_EBOOLEAN(); 

                }
                break;
            case 145 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1027: RULE_EFLOAT
                {
                mRULE_EFLOAT(); 

                }
                break;
            case 146 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1039: RULE_EINTEGER
                {
                mRULE_EINTEGER(); 

                }
                break;
            case 147 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1053: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 148 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1062: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 149 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1071: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 150 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1084: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 151 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1092: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 152 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1104: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 153 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1120: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 154 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1136: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 155 :
                // ../net.sf.smbt.osc.script/src-gen/net/sf/smbt/osc/parser/antlr/internal/InternalOscDsl.g:1:1144: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA5_eotS =
        "\5\uffff\1\30\1\32\24\uffff";
    static final String DFA5_eofS =
        "\33\uffff";
    static final String DFA5_minS =
        "\1\103\1\117\1\115\1\60\1\uffff\2\60\24\uffff";
    static final String DFA5_maxS =
        "\1\103\1\117\1\115\1\71\1\uffff\1\71\1\60\24\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\2\1\25\1\3";
    static final String DFA5_specialS =
        "\33\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "9464:19: ( 'COM0' | 'COM1' | 'COM2' | 'COM3' | 'COM4' | 'COM5' | 'COM6' | 'COM7' | 'COM8' | 'COM9' | 'COM10' | 'COM11' | 'COM12' | 'COM13' | 'COM14' | 'COM15' | 'COM16' | 'COM17' | 'COM18' | 'COM19' | 'COM20' )";
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\1\2\1\uffff\2\2\2\7\3\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\2\60\1\uffff\4\60\3\uffff";
    static final String DFA10_maxS =
        "\2\71\1\uffff\3\71\1\65\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\4\uffff\1\2\1\3\1\4";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\1\1\3\7\4",
            "\12\5",
            "",
            "\6\6\4\7",
            "\12\7",
            "\12\10",
            "\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "9472:60: ( '0' .. '9' | '1' .. '9' '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '5' '0' .. '5' )";
        }
    }
    static final String DFA32_eotS =
        "\1\70\7\106\1\133\3\106\1\142\1\147\1\152\1\154\1\156\1\uffff\1"+
        "\161\1\uffff\1\165\1\167\1\106\1\176\1\u0080\1\u0083\2\uffff\1\u008b"+
        "\1\106\6\70\1\u009f\4\uffff\2\106\2\uffff\1\106\1\u00ae\1\u00b1"+
        "\1\u00b5\1\uffff\5\106\1\70\1\uffff\1\u00c4\1\70\1\u00c5\1\u00c6"+
        "\1\106\1\103\1\uffff\2\103\2\uffff\2\106\1\uffff\14\106\1\u00dd"+
        "\5\106\3\uffff\5\106\2\uffff\4\106\6\uffff\1\106\5\uffff\1\u00f3"+
        "\4\uffff\5\106\2\uffff\1\u00fa\1\uffff\1\70\1\106\3\uffff\5\106"+
        "\1\uffff\1\106\4\70\1\uffff\13\70\1\u0112\1\u0113\5\uffff\4\106"+
        "\2\uffff\1\106\1\u011b\1\106\5\uffff\1\u011e\4\uffff\1\106\1\u0122"+
        "\10\106\2\uffff\1\70\5\uffff\1\106\1\u0130\20\106\1\u0142\1\106"+
        "\1\uffff\2\106\1\u0146\13\106\1\u0152\2\106\1\uffff\2\106\2\uffff"+
        "\1\u0158\5\106\2\uffff\3\106\1\u0161\5\106\1\u0167\14\70\2\uffff"+
        "\3\106\1\u0175\1\u0176\1\u0177\1\106\1\uffff\1\106\1\u011e\3\uffff"+
        "\1\106\1\uffff\1\u017b\1\106\1\u017d\4\106\1\uffff\1\u00c2\1\u018c"+
        "\3\106\1\uffff\3\106\1\u0193\1\u0194\1\106\1\u0196\1\u0197\4\106"+
        "\2\uffff\3\106\1\uffff\3\106\1\uffff\11\106\1\u01ac\1\106\1\uffff"+
        "\1\u01ae\1\u01af\1\u01b0\2\106\1\uffff\6\106\1\uffff\1\u01b9\1\uffff"+
        "\3\106\1\u01be\1\106\1\uffff\1\70\1\u01c1\3\70\1\u01c5\1\70\1\u01c7"+
        "\1\u01c8\1\70\1\u01ca\1\u01cb\1\106\3\uffff\3\106\1\uffff\1\106"+
        "\1\uffff\1\u01d1\1\u01d2\12\u01d3\1\uffff\1\u01df\1\uffff\3\106"+
        "\1\u01e3\1\u01e4\1\u01e5\2\uffff\1\u01e6\3\uffff\3\106\1\u01ea\1"+
        "\106\1\u01ec\1\u01ed\4\106\1\u01f2\1\u01f3\6\106\1\uffff\1\106\3"+
        "\uffff\3\106\1\u01fe\1\u01ff\3\106\1\uffff\1\106\1\u0204\1\106\1"+
        "\u0206\2\uffff\1\u0207\1\uffff\1\u0208\1\u0209\1\70\1\uffff\1\u020b"+
        "\2\uffff\1\u020c\2\uffff\4\106\1\u0211\3\uffff\13\u01d3\1\uffff"+
        "\3\106\4\uffff\1\u0215\2\106\1\uffff\1\106\2\uffff\1\u0219\1\u021a"+
        "\1\u021b\1\u021c\2\uffff\1\u021d\1\u021e\3\106\1\u0222\4\106\2\uffff"+
        "\3\106\1\u022a\1\uffff\1\u022b\4\uffff\1\u022c\2\uffff\4\106\1\uffff"+
        "\3\106\1\uffff\3\106\6\uffff\2\106\1\u0239\1\uffff\1\106\1\uffff"+
        "\1\u023c\1\106\1\u023e\1\u023f\1\106\3\uffff\1\u0241\2\106\1\u0244"+
        "\3\106\1\u0248\1\106\1\u024a\1\u024b\1\u024c\1\uffff\1\106\2\uffff"+
        "\1\u024f\2\uffff\1\106\1\uffff\2\106\1\uffff\3\106\1\uffff\1\u0256"+
        "\3\uffff\1\70\2\uffff\1\u0258\2\106\1\u025b\1\u025c\1\106\3\uffff"+
        "\1\u025f\1\u0260\2\uffff\1\u0261\24\uffff\1\u0273\2\uffff";
    static final String DFA32_eofS =
        "\u0275\uffff";
    static final String DFA32_minS =
        "\1\0\1\160\1\141\1\145\1\142\1\154\2\145\1\76\1\141\1\151\1\145"+
        "\2\44\2\75\1\44\1\uffff\1\46\1\uffff\2\75\1\141\1\75\1\52\1\44\2"+
        "\uffff\1\44\1\142\6\56\1\52\4\uffff\1\154\1\141\2\uffff\1\62\1\174"+
        "\1\56\1\52\1\uffff\1\145\1\150\1\145\1\151\1\60\1\56\1\uffff\1\44"+
        "\1\56\2\44\1\60\1\44\1\uffff\2\0\2\uffff\1\145\1\143\1\uffff\1\145"+
        "\1\154\1\157\1\154\1\164\1\146\1\160\1\142\3\151\1\162\1\44\1\141"+
        "\1\154\1\151\1\160\1\141\3\uffff\1\157\1\143\1\163\1\143\1\164\2"+
        "\uffff\2\156\1\72\1\157\6\uffff\1\44\5\uffff\1\76\4\uffff\1\162"+
        "\1\156\1\157\1\154\1\156\2\uffff\1\52\1\uffff\1\60\1\156\3\uffff"+
        "\1\160\1\165\1\160\2\151\1\uffff\1\145\3\56\1\60\1\uffff\13\56\2"+
        "\52\5\uffff\1\165\1\163\1\164\1\154\2\uffff\1\163\1\44\1\143\5\uffff"+
        "\1\55\4\uffff\1\146\1\44\1\170\1\151\1\167\1\154\1\144\1\60\1\72"+
        "\2\60\1\uffff\1\56\5\uffff\1\156\1\44\1\143\1\141\1\143\1\145\1"+
        "\143\1\153\2\160\1\157\1\151\1\157\2\72\1\156\1\161\1\141\1\44\1"+
        "\141\1\uffff\1\164\1\151\1\44\1\145\1\164\2\145\1\157\1\165\1\144"+
        "\1\164\1\150\1\164\1\141\1\44\1\144\1\147\1\uffff\1\154\1\144\2"+
        "\uffff\1\44\1\143\1\141\1\163\1\141\1\155\2\uffff\1\145\1\72\1\145"+
        "\1\44\1\145\1\157\1\156\1\157\1\145\1\52\14\56\2\uffff\1\155\2\145"+
        "\3\44\1\164\1\uffff\1\146\1\55\1\uffff\1\101\1\uffff\1\141\1\uffff"+
        "\1\44\1\154\1\44\1\154\1\151\1\60\1\55\1\uffff\1\60\1\44\1\142\1"+
        "\151\1\145\1\uffff\1\145\1\153\1\162\2\44\1\150\2\44\1\72\1\157"+
        "\1\163\1\162\2\uffff\1\147\1\165\1\163\1\uffff\1\171\1\165\1\156"+
        "\1\uffff\2\143\1\162\1\164\1\166\1\162\2\157\1\165\1\44\1\154\1"+
        "\uffff\3\44\1\157\1\141\1\uffff\2\164\1\145\1\154\1\141\1\155\1"+
        "\uffff\1\44\1\uffff\1\157\1\167\1\147\1\44\1\72\1\uffff\1\56\1\52"+
        "\3\56\1\52\1\56\2\52\1\56\2\44\1\156\3\uffff\1\141\1\151\1\165\1"+
        "\uffff\1\145\1\uffff\14\44\1\uffff\1\43\1\uffff\1\154\1\151\1\163"+
        "\3\44\2\uffff\1\44\3\uffff\1\153\1\164\1\167\1\44\1\151\2\44\1\163"+
        "\1\147\1\164\1\150\2\44\1\145\2\156\1\143\1\142\1\156\1\uffff\1"+
        "\150\3\uffff\1\156\1\162\1\151\2\44\1\154\1\164\1\141\1\uffff\1"+
        "\146\1\44\1\155\1\44\2\uffff\1\52\1\uffff\2\52\1\56\1\uffff\1\52"+
        "\2\uffff\1\52\2\uffff\1\144\1\156\1\162\1\154\1\44\3\uffff\13\44"+
        "\1\uffff\1\145\1\155\1\157\4\uffff\1\44\1\145\1\141\1\uffff\1\156"+
        "\2\uffff\4\44\2\uffff\2\44\1\154\1\157\1\145\1\44\1\157\1\47\1\144"+
        "\1\157\2\uffff\1\171\1\141\1\164\1\44\1\uffff\1\44\4\uffff\1\52"+
        "\2\uffff\1\163\1\143\1\155\1\164\1\uffff\1\164\1\157\1\154\1\uffff"+
        "\1\156\1\162\1\157\6\uffff\1\171\1\154\1\44\1\uffff\1\163\1\164"+
        "\1\44\1\156\2\44\1\151\3\uffff\1\44\1\145\1\141\1\44\1\157\1\164"+
        "\1\165\1\44\1\144\3\44\1\uffff\1\164\1\40\1\uffff\1\44\2\uffff\1"+
        "\143\1\uffff\1\157\1\164\1\uffff\1\156\1\145\1\155\1\uffff\1\44"+
        "\3\uffff\1\44\1\165\1\uffff\1\44\1\146\1\141\2\44\1\145\1\uffff"+
        "\1\163\1\uffff\2\44\2\uffff\1\44\1\145\3\uffff\1\40\1\164\1\150"+
        "\1\151\1\163\1\40\1\141\1\156\1\171\1\155\1\157\1\162\1\145\3\44"+
        "\1\102\2\uffff";
    static final String DFA32_maxS =
        "\1\uffff\1\163\1\154\1\164\2\163\1\167\1\145\1\166\1\162\1\157\1"+
        "\145\1\72\1\172\1\76\1\75\1\172\1\uffff\1\46\1\uffff\1\76\1\75\1"+
        "\165\1\75\1\72\1\172\2\uffff\1\172\1\142\6\151\1\72\4\uffff\1\170"+
        "\1\141\2\uffff\1\156\1\174\1\72\1\172\1\uffff\1\157\1\150\1\165"+
        "\1\151\1\132\1\170\1\uffff\1\172\1\151\2\172\1\132\1\172\1\uffff"+
        "\2\uffff\2\uffff\1\145\1\143\1\uffff\1\157\1\164\1\157\1\154\1\164"+
        "\1\154\1\160\4\151\1\162\1\172\1\162\1\164\1\151\1\160\1\164\3\uffff"+
        "\1\157\1\143\1\163\1\143\1\164\2\uffff\2\156\1\72\1\157\6\uffff"+
        "\1\44\5\uffff\1\76\4\uffff\1\162\1\156\1\157\1\154\1\162\2\uffff"+
        "\1\72\1\uffff\1\146\1\156\3\uffff\1\160\1\171\1\160\1\162\1\151"+
        "\1\uffff\1\145\3\151\1\71\1\uffff\13\151\2\72\5\uffff\1\165\1\163"+
        "\1\164\1\162\2\uffff\1\164\1\172\1\143\5\uffff\1\172\4\uffff\1\146"+
        "\1\172\1\170\1\151\1\167\1\154\1\144\1\115\1\72\1\71\1\146\1\uffff"+
        "\1\151\5\uffff\1\156\1\172\1\163\1\141\1\143\1\145\1\143\1\153\2"+
        "\160\1\157\1\151\1\157\2\72\1\156\1\161\1\141\1\172\1\141\1\uffff"+
        "\1\164\1\151\1\172\1\145\1\164\2\145\1\157\1\165\1\144\1\164\1\150"+
        "\1\164\1\141\1\172\1\144\1\147\1\uffff\1\154\1\144\2\uffff\1\172"+
        "\1\143\1\141\1\163\1\141\1\155\2\uffff\1\145\1\72\1\145\1\172\1"+
        "\145\1\157\1\156\1\157\1\145\15\151\2\uffff\1\155\2\145\3\172\1"+
        "\164\1\uffff\1\146\1\172\1\uffff\1\172\1\uffff\1\141\1\uffff\1\172"+
        "\1\154\1\172\1\154\1\151\1\71\1\55\1\uffff\1\106\1\172\1\142\1\151"+
        "\1\145\1\uffff\1\145\1\153\1\162\2\172\1\150\2\172\1\72\1\157\1"+
        "\163\1\162\2\uffff\1\147\1\165\1\163\1\uffff\1\171\1\165\1\156\1"+
        "\uffff\2\143\1\162\1\164\1\166\1\162\2\157\1\165\1\172\1\154\1\uffff"+
        "\3\172\1\157\1\141\1\uffff\2\164\1\145\1\154\1\141\1\155\1\uffff"+
        "\1\172\1\uffff\1\157\1\167\1\147\1\172\1\72\1\uffff\12\151\2\172"+
        "\1\156\3\uffff\1\141\1\151\1\165\1\uffff\1\145\1\uffff\14\172\1"+
        "\uffff\1\146\1\uffff\1\154\1\151\1\163\3\172\2\uffff\1\172\3\uffff"+
        "\1\153\1\164\1\167\1\172\1\151\2\172\1\163\1\147\1\164\1\150\2\172"+
        "\1\145\2\156\1\143\1\142\1\156\1\uffff\1\150\3\uffff\1\156\1\162"+
        "\1\151\2\172\1\154\1\164\1\141\1\uffff\1\146\1\172\1\155\1\172\2"+
        "\uffff\1\151\1\uffff\3\151\1\uffff\1\151\2\uffff\1\151\2\uffff\1"+
        "\144\1\156\1\162\1\154\1\172\3\uffff\13\172\1\uffff\1\145\1\155"+
        "\1\157\4\uffff\1\172\1\145\1\141\1\uffff\1\156\2\uffff\4\172\2\uffff"+
        "\2\172\1\154\1\157\1\145\1\172\1\157\1\47\1\144\1\157\2\uffff\1"+
        "\171\1\141\1\164\1\172\1\uffff\1\172\4\uffff\1\151\2\uffff\1\163"+
        "\1\143\1\155\1\164\1\uffff\1\164\1\157\1\154\1\uffff\1\156\1\162"+
        "\1\157\6\uffff\1\171\1\154\1\172\1\uffff\1\163\1\164\1\172\1\156"+
        "\2\172\1\151\3\uffff\1\172\1\145\1\141\1\172\1\157\1\164\1\165\1"+
        "\172\1\144\3\172\1\uffff\1\164\1\40\1\uffff\1\172\2\uffff\1\143"+
        "\1\uffff\1\157\1\164\1\uffff\1\156\1\145\1\155\1\uffff\1\172\3\uffff"+
        "\1\172\1\165\1\uffff\1\172\1\146\1\141\2\172\1\145\1\uffff\1\163"+
        "\1\uffff\2\172\2\uffff\1\172\1\145\3\uffff\1\40\1\164\1\150\1\151"+
        "\1\163\1\40\1\141\1\156\1\171\1\155\1\157\1\162\1\145\3\44\1\154"+
        "\2\uffff";
    static final String DFA32_acceptS =
        "\21\uffff\1\30\1\uffff\1\34\6\uffff\1\47\1\50\11\uffff\1\75\1\76"+
        "\1\77\1\101\2\uffff\1\106\1\107\4\uffff\1\135\6\uffff\1\u0088\6"+
        "\uffff\1\u0096\2\uffff\1\u009a\1\u009b\2\uffff\1\u0096\22\uffff"+
        "\1\10\1\125\1\16\5\uffff\1\154\1\20\4\uffff\1\u008c\1\115\1\127"+
        "\1\22\1\121\1\24\1\uffff\1\26\1\30\1\120\1\32\1\34\1\uffff\1\130"+
        "\1\36\1\123\1\37\5\uffff\1\116\1\42\1\uffff\1\44\2\uffff\1\46\1"+
        "\47\1\50\5\uffff\1\u008e\5\uffff\1\u0092\15\uffff\1\73\1\75\1\76"+
        "\1\77\1\101\4\uffff\1\106\1\107\3\uffff\1\117\1\141\1\131\1\137"+
        "\1\166\1\uffff\1\u0098\1\u0099\1\134\1\135\13\uffff\1\u0094\1\uffff"+
        "\1\u008d\1\u008f\1\u0090\1\u0097\1\u009a\24\uffff\1\136\21\uffff"+
        "\1\55\2\uffff\1\132\1\124\6\uffff\1\126\1\u0091\26\uffff\1\133\1"+
        "\140\7\uffff\1\142\2\uffff\1\u0085\1\uffff\1\u0086\1\uffff\1\151"+
        "\7\uffff\1\u0089\5\uffff\1\170\14\uffff\1\51\1\56\3\uffff\1\25\3"+
        "\uffff\1\41\13\uffff\1\17\5\uffff\1\147\6\uffff\1\52\1\uffff\1\163"+
        "\5\uffff\1\57\15\uffff\1\104\1\152\1\110\3\uffff\1\172\1\uffff\1"+
        "\155\14\uffff\1\u008a\1\uffff\1\1\6\uffff\1\114\1\146\1\uffff\1"+
        "\3\1\11\1\54\23\uffff\1\14\1\uffff\1\21\1\33\1\111\10\uffff\1\157"+
        "\4\uffff\1\176\1\53\1\uffff\1\60\3\uffff\1\61\1\uffff\1\62\1\63"+
        "\1\uffff\1\102\1\143\5\uffff\1\160\1\171\1\u0087\13\uffff\1\u008b"+
        "\3\uffff\1\2\1\31\1\12\1\165\3\uffff\1\72\1\uffff\1\5\1\105\4\uffff"+
        "\1\153\1\7\12\uffff\1\112\1\156\4\uffff\1\162\1\uffff\1\177\1\67"+
        "\1\64\1\65\1\uffff\1\66\1\70\4\uffff\1\150\3\uffff\1\4\3\uffff\1"+
        "\6\1\113\1\43\1\144\1\15\1\100\3\uffff\1\23\7\uffff\1\161\1\u0080"+
        "\1\71\14\uffff\1\u0083\2\uffff\1\40\1\uffff\1\164\1\u0081\1\uffff"+
        "\1\167\2\uffff\1\145\3\uffff\1\27\1\uffff\1\u0084\1\103\1\13\2\uffff"+
        "\1\74\6\uffff\1\35\1\uffff\1\45\2\uffff\1\173\1\174\2\uffff\1\122"+
        "\1\u0082\1\175\21\uffff\1\u0093\1\u0095";
    static final String DFA32_specialS =
        "\1\0\77\uffff\1\1\1\2\u0233\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\103\2\102\2\103\1\102\22\103\1\102\1\17\1\100\1\21\1\20"+
            "\1\61\1\22\1\101\1\45\1\47\1\44\1\27\1\46\1\10\1\30\1\60\1\67"+
            "\1\37\1\40\1\36\1\41\1\43\3\72\1\42\1\14\1\50\1\24\1\16\1\25"+
            "\1\57\1\23\2\75\1\66\2\75\1\74\2\75\1\71\4\75\1\73\5\75\1\74"+
            "\6\75\1\53\1\103\1\54\1\76\1\77\1\103\1\5\1\15\1\2\1\62\1\51"+
            "\1\26\1\13\1\3\1\55\1\77\1\31\1\12\1\65\1\64\1\1\1\11\1\77\1"+
            "\7\1\6\1\34\1\4\1\52\1\63\1\35\2\77\1\32\1\56\1\33\uff82\103",
            "\1\104\2\uffff\1\105",
            "\1\110\12\uffff\1\107",
            "\1\112\11\uffff\1\111\4\uffff\1\113",
            "\1\117\1\uffff\1\115\11\uffff\1\114\4\uffff\1\116",
            "\1\120\3\uffff\1\121\1\uffff\1\122\1\123",
            "\1\125\16\uffff\1\124\1\127\1\uffff\1\126",
            "\1\130",
            "\1\132\67\uffff\1\131",
            "\1\135\20\uffff\1\134",
            "\1\136\5\uffff\1\137",
            "\1\140",
            "\1\70\25\uffff\1\141",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\1\144\7\106\1\143\5\106\1\146\4\106\1\145\6\106",
            "\1\150\1\151",
            "\1\153",
            "\1\155\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\160",
            "",
            "\1\163\1\164",
            "\1\166",
            "\1\173\7\uffff\1\174\2\uffff\1\172\2\uffff\1\170\5\uffff\1"+
            "\171",
            "\1\175",
            "\1\70\3\uffff\1\177\1\uffff\12\u0081\1\70",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\10\106\1\u0082\21\106",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\2\106\1\u0086\4\106\1\u0089\11\106\1\u0087\2\106\1\u008a\3"+
            "\106\1\u0088\1\106",
            "\1\u008c",
            "\1\u0090\1\uffff\1\u008d\7\u008f\1\u008e\1\u008f\57\uffff\1"+
            "\u0091",
            "\1\u0090\1\uffff\1\u0096\1\u0095\1\u0092\1\u0096\1\u0093\4"+
            "\u0096\1\u0094\57\uffff\1\u0091",
            "\1\u0090\1\uffff\4\u0099\1\u0097\1\u0099\2\u008f\1\u0098\1"+
            "\u008f\57\uffff\1\u0091",
            "\1\u0090\1\uffff\10\u008f\1\u009a\1\u008f\57\uffff\1\u0091",
            "\1\u0090\1\uffff\6\u008f\1\u009b\3\u008f\57\uffff\1\u0091",
            "\1\u0090\1\uffff\7\u008f\1\u009c\2\u008f\57\uffff\1\u0091",
            "\1\u009d\3\uffff\1\u009e\1\uffff\13\70",
            "",
            "",
            "",
            "",
            "\1\u00a5\1\uffff\1\u00a4\11\uffff\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "\1\u00ac\63\uffff\1\u00ab\7\uffff\1\u00aa",
            "\1\u00ad",
            "\1\u00b0\13\uffff\1\u00af",
            "\1\u00b3\4\uffff\1\u00b4\21\uffff\32\u00b2\6\uffff\32\u00b2",
            "",
            "\1\u00b7\7\uffff\1\u00b9\1\uffff\1\u00b8",
            "\1\u00ba",
            "\1\u00bb\17\uffff\1\u00bc",
            "\1\u00bd",
            "\12\u00bf\7\uffff\16\u00c0\1\u00be\13\u00c0",
            "\1\u0090\1\uffff\12\u00c3\36\uffff\1\u00c2\20\uffff\1\u0091"+
            "\16\uffff\1\u00c1",
            "",
            "\1\106\13\uffff\12\u00bf\7\uffff\32\u00c0\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0090\1\uffff\12\u008f\57\uffff\1\u0091",
            "\1\106\13\uffff\12\u00bf\7\uffff\32\u00c0\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\u00bf\7\uffff\32\u00c0\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\12\u00bf\7\uffff\32\u00c0",
            "\1\106\34\uffff\32\106\4\uffff\1\106\1\uffff\32\106",
            "",
            "\0\u00c7",
            "\0\u00c7",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cc\11\uffff\1\u00cb",
            "\1\u00cd\6\uffff\1\u00ce\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d5\1\uffff\1\u00d3\3\uffff\1\u00d4",
            "\1\u00d6",
            "\1\u00d7\6\uffff\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u00de\20\uffff\1\u00df",
            "\1\u00e1\7\uffff\1\u00e0",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e7\13\uffff\1\u00e5\5\uffff\1\u00e4\1\u00e6",
            "",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "",
            "",
            "",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8\3\uffff\1\u00f9",
            "",
            "",
            "\1\70\3\uffff\1\70\1\uffff\13\70",
            "",
            "\12\u0081\54\uffff\1\u00fb",
            "\1\u00fc",
            "",
            "",
            "",
            "\1\u00fd",
            "\1\u00fe\3\uffff\1\u00ff",
            "\1\u0100",
            "\1\u0102\10\uffff\1\u0101",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0090\1\uffff\1\u0105\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\4\u00c3\1\u0106\5\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\12\u00c3\57\uffff\1\u0091",
            "\12\u0081",
            "",
            "\1\u0090\1\uffff\1\u0107\11\u0108\57\uffff\1\u0091",
            "\1\u0090\1\uffff\4\u0108\1\u0109\5\u0108\57\uffff\1\u0091",
            "\1\u0090\1\uffff\2\u0108\1\u010a\7\u0108\57\uffff\1\u0091",
            "\1\u0090\1\uffff\5\u0108\1\u010b\4\u0108\57\uffff\1\u0091",
            "\1\u0090\1\uffff\12\u0108\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u010c\5\u010d\4\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\10\u00c3\1\u010e\1\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\6\u010d\4\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u010f\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u0110\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\6\u00c3\1\u0111\3\u00c3\57\uffff\1\u0091",
            "\1\70\3\uffff\1\70\1\uffff\13\70",
            "\1\70\3\uffff\1\70\1\uffff\13\70",
            "",
            "",
            "",
            "",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0118\5\uffff\1\u0117",
            "",
            "",
            "\1\u011a\1\u0119",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u011c",
            "",
            "",
            "",
            "",
            "",
            "\2\u0120\1\u011f\12\u011d\7\uffff\32\u011d\6\uffff\32\u011d",
            "",
            "",
            "",
            "",
            "\1\u0121",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\u0129\23\uffff\1\u0128",
            "\1\u012a",
            "\12\u0129",
            "\12\u012b\7\uffff\6\u012b\30\uffff\1\u00c2\1\uffff\6\u00c2",
            "",
            "\1\u0090\1\uffff\12\u00c3\57\uffff\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "\1\u012c",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\1\u012d\20\106\1\u012f\4\106\1\u012e\3\106",
            "\1\u0132\17\uffff\1\u0131",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\26\106\1\u0157\3\106",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u0168\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u0169\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\12\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u016a\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u016b\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\2\u00c3\1\u016c\7\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u016d\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\12\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u016e\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u016f\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u0170\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u0171\11\u00c3\57\uffff\1\u0091",
            "",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0178",
            "",
            "\1\u0179",
            "\2\u0120\1\u011f\12\u011d\7\uffff\32\u011d\6\uffff\32\u011d",
            "",
            "\32\u00b2\6\uffff\32\u00b2",
            "",
            "\1\u017a",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u017c",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180\1\u0181\1\u0182\1\u0183\1\u0184\1\u0185\1\u0186\1"+
            "\u0187\1\u0188\1\u0189",
            "\1\u018a",
            "",
            "\12\u018b\7\uffff\6\u018b",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0195",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\4\106\1\u01ab\25\106",
            "\1\u01ad",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\106\13\uffff\2\106\1\u01bd\7\106\7\uffff\32\106\4\uffff"+
            "\1\106\1\uffff\32\106",
            "\1\u01bf",
            "",
            "\1\u0090\1\uffff\1\u01c0\11\u00c3\57\uffff\1\u0091",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u01c2\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u01c3\11\u00c3\57\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u01c4\11\u00c3\57\uffff\1\u0091",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u01c6\11\u00c3\57\uffff\1\u0091",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u01c9\11\u00c3\57\uffff\1\u0091",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01cc",
            "",
            "",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "",
            "\1\u01d0",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\1\u01d4\1\u01d5\1\u01d6\1\u01d7\1\u01d8\1\u01d9"+
            "\1\u01da\1\u01db\1\u01dc\1\u01dd\7\uffff\32\106\4\uffff\1\106"+
            "\1\uffff\32\106",
            "\1\106\13\uffff\1\u01de\11\106\7\uffff\32\106\4\uffff\1\106"+
            "\1\uffff\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u00c2\14\uffff\12\u00c2\7\uffff\6\u00c2\30\uffff\1\u00c2"+
            "\1\uffff\6\u00c2",
            "",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01eb",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "",
            "\1\u01fa",
            "",
            "",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0205",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "\1\u0090\1\uffff\1\u020a\11\u00c3\57\uffff\1\u0091",
            "",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "",
            "",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "",
            "",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "",
            "",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0216",
            "\1\u0217",
            "",
            "\1\u0218",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "",
            "",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "",
            "",
            "\1\70\3\uffff\1\u0090\1\uffff\12\u00c3\1\70\56\uffff\1\u0091",
            "",
            "",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0237",
            "\1\u0238",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u023a",
            "\1\u023b",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u023d",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0240",
            "",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0242",
            "\1\u0243",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0249",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "\1\u024d",
            "\1\u024e",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "\1\u0250",
            "",
            "\1\u0251",
            "\1\u0252",
            "",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0257",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0259",
            "\1\u025a",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u025d",
            "",
            "\1\u025e",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "",
            "",
            "\1\106\13\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\32\106",
            "\1\u0262",
            "",
            "",
            "",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0274\1\uffff\3\u0274\5\uffff\1\u0274\25\uffff\1\u0274\1"+
            "\uffff\3\u0274\5\uffff\1\u0274",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | RULE_OSCADDR | RULE_OSCUSBLINUXMACADDR | RULE_USBWINPORT | RULE_IPEXPR | RULE_HTTPADDR | RULE_USBMAC | RULE_EBYTE | RULE_EBLOB | RULE_EIMPULSE | RULE_ETIMETAG | RULE_ENULL | RULE_EBOOLEAN | RULE_EFLOAT | RULE_EINTEGER | RULE_INT | RULE_HEX | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='o') ) {s = 1;}

                        else if ( (LA32_0=='c') ) {s = 2;}

                        else if ( (LA32_0=='h') ) {s = 3;}

                        else if ( (LA32_0=='u') ) {s = 4;}

                        else if ( (LA32_0=='a') ) {s = 5;}

                        else if ( (LA32_0=='s') ) {s = 6;}

                        else if ( (LA32_0=='r') ) {s = 7;}

                        else if ( (LA32_0=='-') ) {s = 8;}

                        else if ( (LA32_0=='p') ) {s = 9;}

                        else if ( (LA32_0=='l') ) {s = 10;}

                        else if ( (LA32_0=='g') ) {s = 11;}

                        else if ( (LA32_0==':') ) {s = 12;}

                        else if ( (LA32_0=='b') ) {s = 13;}

                        else if ( (LA32_0=='=') ) {s = 14;}

                        else if ( (LA32_0=='!') ) {s = 15;}

                        else if ( (LA32_0=='$') ) {s = 16;}

                        else if ( (LA32_0=='#') ) {s = 17;}

                        else if ( (LA32_0=='&') ) {s = 18;}

                        else if ( (LA32_0=='@') ) {s = 19;}

                        else if ( (LA32_0=='<') ) {s = 20;}

                        else if ( (LA32_0=='>') ) {s = 21;}

                        else if ( (LA32_0=='f') ) {s = 22;}

                        else if ( (LA32_0=='+') ) {s = 23;}

                        else if ( (LA32_0=='.') ) {s = 24;}

                        else if ( (LA32_0=='k') ) {s = 25;}

                        else if ( (LA32_0=='{') ) {s = 26;}

                        else if ( (LA32_0=='}') ) {s = 27;}

                        else if ( (LA32_0=='t') ) {s = 28;}

                        else if ( (LA32_0=='x') ) {s = 29;}

                        else if ( (LA32_0=='3') ) {s = 30;}

                        else if ( (LA32_0=='1') ) {s = 31;}

                        else if ( (LA32_0=='2') ) {s = 32;}

                        else if ( (LA32_0=='4') ) {s = 33;}

                        else if ( (LA32_0=='9') ) {s = 34;}

                        else if ( (LA32_0=='5') ) {s = 35;}

                        else if ( (LA32_0=='*') ) {s = 36;}

                        else if ( (LA32_0=='(') ) {s = 37;}

                        else if ( (LA32_0==',') ) {s = 38;}

                        else if ( (LA32_0==')') ) {s = 39;}

                        else if ( (LA32_0==';') ) {s = 40;}

                        else if ( (LA32_0=='e') ) {s = 41;}

                        else if ( (LA32_0=='v') ) {s = 42;}

                        else if ( (LA32_0=='[') ) {s = 43;}

                        else if ( (LA32_0==']') ) {s = 44;}

                        else if ( (LA32_0=='i') ) {s = 45;}

                        else if ( (LA32_0=='|') ) {s = 46;}

                        else if ( (LA32_0=='?') ) {s = 47;}

                        else if ( (LA32_0=='/') ) {s = 48;}

                        else if ( (LA32_0=='%') ) {s = 49;}

                        else if ( (LA32_0=='d') ) {s = 50;}

                        else if ( (LA32_0=='w') ) {s = 51;}

                        else if ( (LA32_0=='n') ) {s = 52;}

                        else if ( (LA32_0=='m') ) {s = 53;}

                        else if ( (LA32_0=='C') ) {s = 54;}

                        else if ( (LA32_0=='0') ) {s = 55;}

                        else if ( (LA32_0=='I') ) {s = 57;}

                        else if ( ((LA32_0>='6' && LA32_0<='8')) ) {s = 58;}

                        else if ( (LA32_0=='N') ) {s = 59;}

                        else if ( (LA32_0=='F'||LA32_0=='T') ) {s = 60;}

                        else if ( ((LA32_0>='A' && LA32_0<='B')||(LA32_0>='D' && LA32_0<='E')||(LA32_0>='G' && LA32_0<='H')||(LA32_0>='J' && LA32_0<='M')||(LA32_0>='O' && LA32_0<='S')||(LA32_0>='U' && LA32_0<='Z')) ) {s = 61;}

                        else if ( (LA32_0=='^') ) {s = 62;}

                        else if ( (LA32_0=='_'||LA32_0=='j'||LA32_0=='q'||(LA32_0>='y' && LA32_0<='z')) ) {s = 63;}

                        else if ( (LA32_0=='\"') ) {s = 64;}

                        else if ( (LA32_0=='\'') ) {s = 65;}

                        else if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {s = 66;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\b')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='\\'||LA32_0=='`'||(LA32_0>='~' && LA32_0<='\uFFFF')) ) {s = 67;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_64 = input.LA(1);

                        s = -1;
                        if ( ((LA32_64>='\u0000' && LA32_64<='\uFFFF')) ) {s = 199;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_65 = input.LA(1);

                        s = -1;
                        if ( ((LA32_65>='\u0000' && LA32_65<='\uFFFF')) ) {s = 199;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}