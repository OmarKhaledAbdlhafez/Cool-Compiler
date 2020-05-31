// Generated from C:/Users/Ismail El-Toukhy/repos/Cool-Compiler/3-Address-Code/src\CoolRules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolRulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INTEGER=2, STRING=3, AT=4, COLON=5, COMMA=6, DIVIDE=7, DOT=8, 
		EQUALS=9, LARROW=10, LBRACE=11, LE=12, LPAREN=13, LT=14, MINUS=15, PLUS=16, 
		RARROW=17, RBRACE=18, RPAREN=19, SEMICOLON=20, TIMES=21, TILDE=22, TRUE=23, 
		FALSE=24, CASE=25, CLASS=26, ELSE=27, ESAC=28, FI=29, IF=30, IN=31, INHERITS=32, 
		ISVOID=33, LET=34, LOOP=35, NEW=36, NOT=37, OF=38, POOL=39, THEN=40, WHILE=41, 
		TYPE=42, IDENTIFIER=43, WS=44, ERROR=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INTEGER", "STRING", "AT", "COLON", "COMMA", "DIVIDE", "DOT", 
			"EQUALS", "LARROW", "LBRACE", "LE", "LPAREN", "LT", "MINUS", "PLUS", 
			"RARROW", "RBRACE", "RPAREN", "SEMICOLON", "TIMES", "TILDE", "TRUE", 
			"FALSE", "CASE", "CLASS", "ELSE", "ESAC", "FI", "IF", "IN", "INHERITS", 
			"ISVOID", "LET", "LOOP", "NEW", "NOT", "OF", "POOL", "THEN", "WHILE", 
			"TYPE", "IDENTIFIER", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", null, null, "'@'", "':'", "','", "'/'", "'.'", "'='", "'<-'", 
			"'{'", "'<='", "'('", "'<'", "'-'", "'+'", "'->'", "'}'", "')'", "';'", 
			"'*'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INTEGER", "STRING", "AT", "COLON", "COMMA", "DIVIDE", "DOT", 
			"EQUALS", "LARROW", "LBRACE", "LE", "LPAREN", "LT", "MINUS", "PLUS", 
			"RARROW", "RBRACE", "RPAREN", "SEMICOLON", "TIMES", "TILDE", "TRUE", 
			"FALSE", "CASE", "CLASS", "ELSE", "ESAC", "FI", "IF", "IN", "INHERITS", 
			"ISVOID", "LET", "LOOP", "NEW", "NOT", "OF", "POOL", "THEN", "WHILE", 
			"TYPE", "IDENTIFIER", "WS", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CoolRulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\3\6\3b\n\3\r\3\16\3c\3\4\3\4\7\4h\n\4\f"+
		"\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\7+\u00f7\n+\f+\16+\u00fa\13+\3,\3,\7,\u00fe\n,"+
		"\f,\16,\u0101\13,\3-\6-\u0104\n-\r-\16-\u0105\3-\3-\3.\3.\3i\2/\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\30\3\2\62;\4\2TTtt\4\2WWww\4\2GGgg"+
		"\4\2CCcc\4\2NNnn\4\2UUuu\4\2EEee\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4\2V"+
		"Vvv\4\2XXxx\4\2QQqq\4\2FFff\4\2RRrr\4\2YYyy\3\2C\\\6\2\62;C\\aac|\3\2"+
		"c|\5\2\13\f\17\17\"\"\2\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\3]\3\2\2\2\5a\3\2\2\2\7e\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2"+
		"\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27}\3\2\2\2\31\177\3"+
		"\2\2\2\33\u0082\3\2\2\2\35\u0084\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2"+
		"\2#\u008a\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u0093"+
		"\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u009c\3\2\2\2\63\u00a2\3\2\2"+
		"\2\65\u00a7\3\2\2\2\67\u00ad\3\2\2\29\u00b2\3\2\2\2;\u00b7\3\2\2\2=\u00ba"+
		"\3\2\2\2?\u00bd\3\2\2\2A\u00c0\3\2\2\2C\u00c9\3\2\2\2E\u00d0\3\2\2\2G"+
		"\u00d4\3\2\2\2I\u00d9\3\2\2\2K\u00dd\3\2\2\2M\u00e1\3\2\2\2O\u00e4\3\2"+
		"\2\2Q\u00e9\3\2\2\2S\u00ee\3\2\2\2U\u00f4\3\2\2\2W\u00fb\3\2\2\2Y\u0103"+
		"\3\2\2\2[\u0109\3\2\2\2]^\7?\2\2^_\7@\2\2_\4\3\2\2\2`b\t\2\2\2a`\3\2\2"+
		"\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\6\3\2\2\2ei\7$\2\2fh\13\2\2\2gf\3\2"+
		"\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7$\2\2m\b\3\2"+
		"\2\2no\7B\2\2o\n\3\2\2\2pq\7<\2\2q\f\3\2\2\2rs\7.\2\2s\16\3\2\2\2tu\7"+
		"\61\2\2u\20\3\2\2\2vw\7\60\2\2w\22\3\2\2\2xy\7?\2\2y\24\3\2\2\2z{\7>\2"+
		"\2{|\7/\2\2|\26\3\2\2\2}~\7}\2\2~\30\3\2\2\2\177\u0080\7>\2\2\u0080\u0081"+
		"\7?\2\2\u0081\32\3\2\2\2\u0082\u0083\7*\2\2\u0083\34\3\2\2\2\u0084\u0085"+
		"\7>\2\2\u0085\36\3\2\2\2\u0086\u0087\7/\2\2\u0087 \3\2\2\2\u0088\u0089"+
		"\7-\2\2\u0089\"\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c\7@\2\2\u008c$\3"+
		"\2\2\2\u008d\u008e\7\177\2\2\u008e&\3\2\2\2\u008f\u0090\7+\2\2\u0090("+
		"\3\2\2\2\u0091\u0092\7=\2\2\u0092*\3\2\2\2\u0093\u0094\7,\2\2\u0094,\3"+
		"\2\2\2\u0095\u0096\7\u0080\2\2\u0096.\3\2\2\2\u0097\u0098\7v\2\2\u0098"+
		"\u0099\t\3\2\2\u0099\u009a\t\4\2\2\u009a\u009b\t\5\2\2\u009b\60\3\2\2"+
		"\2\u009c\u009d\7h\2\2\u009d\u009e\t\6\2\2\u009e\u009f\t\7\2\2\u009f\u00a0"+
		"\t\b\2\2\u00a0\u00a1\t\5\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\t\t\2\2\u00a3"+
		"\u00a4\t\6\2\2\u00a4\u00a5\t\b\2\2\u00a5\u00a6\t\5\2\2\u00a6\64\3\2\2"+
		"\2\u00a7\u00a8\t\t\2\2\u00a8\u00a9\t\7\2\2\u00a9\u00aa\t\6\2\2\u00aa\u00ab"+
		"\t\b\2\2\u00ab\u00ac\t\b\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae"+
		"\u00af\t\7\2\2\u00af\u00b0\t\b\2\2\u00b0\u00b1\t\5\2\2\u00b18\3\2\2\2"+
		"\u00b2\u00b3\t\5\2\2\u00b3\u00b4\t\b\2\2\u00b4\u00b5\t\6\2\2\u00b5\u00b6"+
		"\t\t\2\2\u00b6:\3\2\2\2\u00b7\u00b8\t\n\2\2\u00b8\u00b9\t\13\2\2\u00b9"+
		"<\3\2\2\2\u00ba\u00bb\t\13\2\2\u00bb\u00bc\t\n\2\2\u00bc>\3\2\2\2\u00bd"+
		"\u00be\t\13\2\2\u00be\u00bf\t\f\2\2\u00bf@\3\2\2\2\u00c0\u00c1\t\13\2"+
		"\2\u00c1\u00c2\t\f\2\2\u00c2\u00c3\t\r\2\2\u00c3\u00c4\t\5\2\2\u00c4\u00c5"+
		"\t\3\2\2\u00c5\u00c6\t\13\2\2\u00c6\u00c7\t\16\2\2\u00c7\u00c8\t\b\2\2"+
		"\u00c8B\3\2\2\2\u00c9\u00ca\t\13\2\2\u00ca\u00cb\t\b\2\2\u00cb\u00cc\t"+
		"\17\2\2\u00cc\u00cd\t\20\2\2\u00cd\u00ce\t\13\2\2\u00ce\u00cf\t\21\2\2"+
		"\u00cfD\3\2\2\2\u00d0\u00d1\t\7\2\2\u00d1\u00d2\t\5\2\2\u00d2\u00d3\t"+
		"\16\2\2\u00d3F\3\2\2\2\u00d4\u00d5\t\7\2\2\u00d5\u00d6\t\20\2\2\u00d6"+
		"\u00d7\t\20\2\2\u00d7\u00d8\t\22\2\2\u00d8H\3\2\2\2\u00d9\u00da\t\f\2"+
		"\2\u00da\u00db\t\5\2\2\u00db\u00dc\t\23\2\2\u00dcJ\3\2\2\2\u00dd\u00de"+
		"\t\f\2\2\u00de\u00df\t\20\2\2\u00df\u00e0\t\16\2\2\u00e0L\3\2\2\2\u00e1"+
		"\u00e2\t\20\2\2\u00e2\u00e3\t\n\2\2\u00e3N\3\2\2\2\u00e4\u00e5\t\22\2"+
		"\2\u00e5\u00e6\t\20\2\2\u00e6\u00e7\t\20\2\2\u00e7\u00e8\t\7\2\2\u00e8"+
		"P\3\2\2\2\u00e9\u00ea\t\16\2\2\u00ea\u00eb\t\r\2\2\u00eb\u00ec\t\5\2\2"+
		"\u00ec\u00ed\t\f\2\2\u00edR\3\2\2\2\u00ee\u00ef\t\23\2\2\u00ef\u00f0\t"+
		"\r\2\2\u00f0\u00f1\t\13\2\2\u00f1\u00f2\t\7\2\2\u00f2\u00f3\t\5\2\2\u00f3"+
		"T\3\2\2\2\u00f4\u00f8\t\24\2\2\u00f5\u00f7\t\25\2\2\u00f6\u00f5\3\2\2"+
		"\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9V"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff\t\26\2\2\u00fc\u00fe\t\25\2\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100X\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\t\27\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b-\2\2\u0108Z\3\2\2\2\u0109\u010a"+
		"\13\2\2\2\u010a\\\3\2\2\2\b\2ci\u00f8\u00ff\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}