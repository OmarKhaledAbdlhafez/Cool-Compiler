// Generated from E:/Projects/Compiler/Cool-Compiler/src\CoolRules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MULDIV=2, PLUSMIN=3, INTEGER=4, STRING=5, AT=6, COLON=7, COMMA=8, 
		DIVIDE=9, DOT=10, EQUALS=11, LARROW=12, LBRACE=13, LE=14, LPAREN=15, LT=16, 
		MINUS=17, PLUS=18, RARROW=19, RBRACE=20, RPAREN=21, SEMICOLON=22, TIMES=23, 
		TILDE=24, TRUE=25, FALSE=26, CASE=27, CLASS=28, ELSE=29, ESAC=30, FI=31, 
		IF=32, IN=33, INHERITS=34, ISVOID=35, LET=36, LOOP=37, NEW=38, NOT=39, 
		OF=40, POOL=41, THEN=42, WHILE=43, TYPE=44, IDENTIFIER=45, WS=46, ERROR=47;
	public static final int
		RULE_program = 0, RULE_classDefinition = 1, RULE_body = 2, RULE_attr = 3, 
		RULE_method = 4, RULE_parameter = 5, RULE_stmt = 6, RULE_op = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefinition", "body", "attr", "method", "parameter", 
			"stmt", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", null, null, null, null, "'@'", "':'", "','", "'/'", "'.'", 
			"'='", "'<-'", "'{'", "'<='", "'('", "'<'", "'-'", "'+'", "'->'", "'}'", 
			"')'", "';'", "'*'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MULDIV", "PLUSMIN", "INTEGER", "STRING", "AT", "COLON", 
			"COMMA", "DIVIDE", "DOT", "EQUALS", "LARROW", "LBRACE", "LE", "LPAREN", 
			"LT", "MINUS", "PLUS", "RARROW", "RBRACE", "RPAREN", "SEMICOLON", "TIMES", 
			"TILDE", "TRUE", "FALSE", "CASE", "CLASS", "ELSE", "ESAC", "FI", "IF", 
			"IN", "INHERITS", "ISVOID", "LET", "LOOP", "NEW", "NOT", "OF", "POOL", 
			"THEN", "WHILE", "TYPE", "IDENTIFIER", "WS", "ERROR"
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

	@Override
	public String getGrammarFileName() { return "CoolRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoolRulesParser.EOF, 0); }
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				classDefinition();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolRulesParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolRulesParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolRulesParser.TYPE, i);
		}
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolRulesParser.SEMICOLON, 0); }
		public TerminalNode INHERITS() { return getToken(CoolRulesParser.INHERITS, 0); }
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(CLASS);
			setState(24);
			match(TYPE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(25);
				match(INHERITS);
				setState(26);
				match(TYPE);
				}
			}

			setState(29);
			match(LBRACE);
			setState(30);
			body();
			setState(31);
			match(RBRACE);
			setState(32);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					method();
					}
					break;
				case 2:
					{
					setState(35);
					attr();
					}
					break;
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CoolRulesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CoolRulesParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CoolRulesParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolRulesParser.SEMICOLON, 0); }
		public TerminalNode LARROW() { return getToken(CoolRulesParser.LARROW, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IDENTIFIER);
			setState(42);
			match(COLON);
			setState(43);
			match(TYPE);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LARROW) {
				{
				setState(44);
				match(LARROW);
				setState(45);
				stmt(0);
				}
			}

			setState(48);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CoolRulesParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolRulesParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CoolRulesParser.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CoolRulesParser.SEMICOLON, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IDENTIFIER);
			setState(51);
			match(LPAREN);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(52);
				parameter();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(53);
					match(COMMA);
					setState(54);
					parameter();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(62);
			match(RPAREN);
			setState(63);
			match(COLON);
			setState(64);
			match(TYPE);
			setState(65);
			match(LBRACE);
			setState(66);
			stmt(0);
			setState(67);
			match(RBRACE);
			setState(68);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CoolRulesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CoolRulesParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CoolRulesParser.TYPE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(COLON);
			setState(72);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoolRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoolRulesParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public TerminalNode IF() { return getToken(CoolRulesParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolRulesParser.THEN, 0); }
		public TerminalNode FI() { return getToken(CoolRulesParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(CoolRulesParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CoolRulesParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolRulesParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolRulesParser.POOL, 0); }
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolRulesParser.SEMICOLON, i);
		}
		public TerminalNode LET() { return getToken(CoolRulesParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolRulesParser.IN, 0); }
		public List<TerminalNode> COLON() { return getTokens(CoolRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolRulesParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(CoolRulesParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolRulesParser.TYPE, i);
		}
		public List<TerminalNode> LARROW() { return getTokens(CoolRulesParser.LARROW); }
		public TerminalNode LARROW(int i) {
			return getToken(CoolRulesParser.LARROW, i);
		}
		public TerminalNode CASE() { return getToken(CoolRulesParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolRulesParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolRulesParser.ESAC, 0); }
		public TerminalNode NEW() { return getToken(CoolRulesParser.NEW, 0); }
		public TerminalNode ISVOID() { return getToken(CoolRulesParser.ISVOID, 0); }
		public TerminalNode TILDE() { return getToken(CoolRulesParser.TILDE, 0); }
		public TerminalNode NOT() { return getToken(CoolRulesParser.NOT, 0); }
		public TerminalNode INTEGER() { return getToken(CoolRulesParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CoolRulesParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(CoolRulesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolRulesParser.FALSE, 0); }
		public TerminalNode MULDIV() { return getToken(CoolRulesParser.MULDIV, 0); }
		public TerminalNode PLUSMIN() { return getToken(CoolRulesParser.PLUSMIN, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CoolRulesParser.DOT, 0); }
		public TerminalNode AT() { return getToken(CoolRulesParser.AT, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_stmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(75);
				match(IDENTIFIER);
				setState(76);
				match(LPAREN);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << LBRACE) | (1L << LPAREN) | (1L << TILDE) | (1L << TRUE) | (1L << FALSE) | (1L << CASE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << NEW) | (1L << NOT) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(77);
					stmt(0);
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(78);
						match(COMMA);
						setState(79);
						stmt(0);
						}
						}
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(87);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(88);
				match(IF);
				setState(89);
				stmt(0);
				setState(90);
				match(THEN);
				setState(91);
				stmt(0);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(92);
					match(ELSE);
					setState(93);
					stmt(0);
					}
				}

				setState(96);
				match(FI);
				}
				break;
			case 3:
				{
				setState(98);
				match(WHILE);
				setState(99);
				stmt(0);
				setState(100);
				match(LOOP);
				setState(101);
				stmt(0);
				setState(102);
				match(POOL);
				}
				break;
			case 4:
				{
				setState(104);
				match(LBRACE);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					stmt(0);
					setState(106);
					match(SEMICOLON);
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << LBRACE) | (1L << LPAREN) | (1L << TILDE) | (1L << TRUE) | (1L << FALSE) | (1L << CASE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << NEW) | (1L << NOT) | (1L << WHILE) | (1L << IDENTIFIER))) != 0) );
				setState(112);
				match(RBRACE);
				}
				break;
			case 5:
				{
				setState(114);
				match(LET);
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					match(IDENTIFIER);
					setState(116);
					match(COLON);
					setState(117);
					match(TYPE);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LARROW) {
						{
						setState(118);
						match(LARROW);
						setState(119);
						stmt(0);
						}
					}

					}
					}
					setState(124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(126);
				match(IN);
				setState(127);
				stmt(16);
				}
				break;
			case 6:
				{
				setState(128);
				match(CASE);
				setState(129);
				stmt(0);
				setState(130);
				match(OF);
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(IDENTIFIER);
					setState(132);
					match(COLON);
					setState(133);
					match(TYPE);
					setState(134);
					match(T__0);
					setState(135);
					stmt(0);
					setState(136);
					match(SEMICOLON);
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(142);
				match(ESAC);
				}
				break;
			case 7:
				{
				setState(144);
				match(NEW);
				setState(145);
				match(TYPE);
				}
				break;
			case 8:
				{
				setState(146);
				match(ISVOID);
				setState(147);
				stmt(13);
				}
				break;
			case 9:
				{
				setState(148);
				match(TILDE);
				setState(149);
				stmt(12);
				}
				break;
			case 10:
				{
				setState(150);
				match(NOT);
				setState(151);
				stmt(8);
				}
				break;
			case 11:
				{
				setState(152);
				match(LPAREN);
				setState(153);
				stmt(0);
				setState(154);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(156);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				setState(157);
				match(INTEGER);
				}
				break;
			case 14:
				{
				setState(158);
				match(STRING);
				}
				break;
			case 15:
				{
				setState(159);
				match(TRUE);
				}
				break;
			case 16:
				{
				setState(160);
				match(FALSE);
				}
				break;
			case 17:
				{
				setState(161);
				match(IDENTIFIER);
				setState(162);
				match(LARROW);
				setState(163);
				stmt(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(166);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(167);
						match(MULDIV);
						setState(168);
						stmt(12);
						}
						break;
					case 2:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(170);
						match(PLUSMIN);
						setState(171);
						stmt(11);
						}
						break;
					case 3:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(172);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(173);
						op();
						setState(174);
						stmt(10);
						}
						break;
					case 4:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(176);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(177);
							match(AT);
							setState(178);
							match(TYPE);
							}
						}

						setState(181);
						match(DOT);
						setState(182);
						match(IDENTIFIER);
						setState(183);
						match(LPAREN);
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << LBRACE) | (1L << LPAREN) | (1L << TILDE) | (1L << TRUE) | (1L << FALSE) | (1L << CASE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << NEW) | (1L << NOT) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(184);
							stmt(0);
							setState(189);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(185);
								match(COMMA);
								setState(186);
								stmt(0);
								}
								}
								setState(191);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(194);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CoolRulesParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolRulesParser.LE, 0); }
		public TerminalNode EQUALS() { return getToken(CoolRulesParser.EQUALS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LE) | (1L << LT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n"+
		"\2\r\2\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\5\6?\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bS\n\b\f"+
		"\b\16\bV\13\b\5\bX\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\bo\n\b\r\b\16\bp\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b{\n\b\6\b}\n\b\r\b\16\b~\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u008d\n\b\r\b\16\b\u008e\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00a7\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00b6\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00be\n\b\f\b\16\b\u00c1\13"+
		"\b\5\b\u00c3\n\b\3\b\7\b\u00c6\n\b\f\b\16\b\u00c9\13\b\3\t\3\t\3\t\2\3"+
		"\16\n\2\4\6\b\n\f\16\20\2\3\5\2\r\r\20\20\22\22\2\u00e9\2\23\3\2\2\2\4"+
		"\31\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n\64\3\2\2\2\fH\3\2\2\2\16\u00a6\3\2"+
		"\2\2\20\u00ca\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32"+
		"\7\36\2\2\32\35\7.\2\2\33\34\7$\2\2\34\36\7.\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36\37\3\2\2\2\37 \7\17\2\2 !\5\6\4\2!\"\7\26\2\2\"#\7\30\2\2#\5"+
		"\3\2\2\2$\'\5\n\6\2%\'\5\b\5\2&$\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2)\7\3\2\2\2*(\3\2\2\2+,\7/\2\2,-\7\t\2\2-\60\7.\2\2./\7\16"+
		"\2\2/\61\5\16\b\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\30\2"+
		"\2\63\t\3\2\2\2\64\65\7/\2\2\65>\7\21\2\2\66;\5\f\7\2\678\7\n\2\28:\5"+
		"\f\7\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>"+
		"\66\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\27\2\2AB\7\t\2\2BC\7.\2\2CD\7\17\2"+
		"\2DE\5\16\b\2EF\7\26\2\2FG\7\30\2\2G\13\3\2\2\2HI\7/\2\2IJ\7\t\2\2JK\7"+
		".\2\2K\r\3\2\2\2LM\b\b\1\2MN\7/\2\2NW\7\21\2\2OT\5\16\b\2PQ\7\n\2\2QS"+
		"\5\16\b\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"WO\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y\u00a7\7\27\2\2Z[\7\"\2\2[\\\5\16\b\2\\"+
		"]\7,\2\2]`\5\16\b\2^_\7\37\2\2_a\5\16\b\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2"+
		"\2bc\7!\2\2c\u00a7\3\2\2\2de\7-\2\2ef\5\16\b\2fg\7\'\2\2gh\5\16\b\2hi"+
		"\7+\2\2i\u00a7\3\2\2\2jn\7\17\2\2kl\5\16\b\2lm\7\30\2\2mo\3\2\2\2nk\3"+
		"\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\26\2\2s\u00a7\3\2\2"+
		"\2t|\7&\2\2uv\7/\2\2vw\7\t\2\2wz\7.\2\2xy\7\16\2\2y{\5\16\b\2zx\3\2\2"+
		"\2z{\3\2\2\2{}\3\2\2\2|u\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\7#\2\2\u0081\u00a7\5\16\b\22\u0082\u0083\7"+
		"\35\2\2\u0083\u0084\5\16\b\2\u0084\u008c\7*\2\2\u0085\u0086\7/\2\2\u0086"+
		"\u0087\7\t\2\2\u0087\u0088\7.\2\2\u0088\u0089\7\3\2\2\u0089\u008a\5\16"+
		"\b\2\u008a\u008b\7\30\2\2\u008b\u008d\3\2\2\2\u008c\u0085\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\7 \2\2\u0091\u00a7\3\2\2\2\u0092\u0093\7(\2\2\u0093\u00a7"+
		"\7.\2\2\u0094\u0095\7%\2\2\u0095\u00a7\5\16\b\17\u0096\u0097\7\32\2\2"+
		"\u0097\u00a7\5\16\b\16\u0098\u0099\7)\2\2\u0099\u00a7\5\16\b\n\u009a\u009b"+
		"\7\21\2\2\u009b\u009c\5\16\b\2\u009c\u009d\7\27\2\2\u009d\u00a7\3\2\2"+
		"\2\u009e\u00a7\7/\2\2\u009f\u00a7\7\6\2\2\u00a0\u00a7\7\7\2\2\u00a1\u00a7"+
		"\7\33\2\2\u00a2\u00a7\7\34\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7\16\2\2"+
		"\u00a5\u00a7\5\16\b\3\u00a6L\3\2\2\2\u00a6Z\3\2\2\2\u00a6d\3\2\2\2\u00a6"+
		"j\3\2\2\2\u00a6t\3\2\2\2\u00a6\u0082\3\2\2\2\u00a6\u0092\3\2\2\2\u00a6"+
		"\u0094\3\2\2\2\u00a6\u0096\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6\u009a\3\2"+
		"\2\2\u00a6\u009e\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00c7\3\2"+
		"\2\2\u00a8\u00a9\f\r\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00c6\5\16\b\16\u00ab"+
		"\u00ac\f\f\2\2\u00ac\u00ad\7\5\2\2\u00ad\u00c6\5\16\b\r\u00ae\u00af\f"+
		"\13\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\5\16\b\f\u00b1\u00c6\3\2\2\2"+
		"\u00b2\u00b5\f\27\2\2\u00b3\u00b4\7\b\2\2\u00b4\u00b6\7.\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8"+
		"\u00b9\7/\2\2\u00b9\u00c2\7\21\2\2\u00ba\u00bf\5\16\b\2\u00bb\u00bc\7"+
		"\n\2\2\u00bc\u00be\5\16\b\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\7\27\2\2\u00c5\u00a8\3\2\2\2\u00c5\u00ab\3\2\2\2\u00c5\u00ae\3"+
		"\2\2\2\u00c5\u00b2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\17\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\t\2\2"+
		"\2\u00cb\21\3\2\2\2\26\25\35&(\60;>TW`pz~\u008e\u00a6\u00b5\u00bf\u00c2"+
		"\u00c5\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}