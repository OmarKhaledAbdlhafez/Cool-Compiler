// Generated from C:/Users/Ismail El-Toukhy/repos/Cool-Compiler/3-Address-Code/src\CoolRules.g4 by ANTLR 4.8
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
		T__0=1, INTEGER=2, STRING=3, AT=4, COLON=5, COMMA=6, DIVIDE=7, DOT=8, 
		EQUALS=9, LARROW=10, LBRACE=11, LE=12, LPAREN=13, LT=14, MINUS=15, PLUS=16, 
		RARROW=17, RBRACE=18, RPAREN=19, SEMICOLON=20, TIMES=21, TILDE=22, TRUE=23, 
		FALSE=24, CASE=25, CLASS=26, ELSE=27, ESAC=28, FI=29, IF=30, IN=31, INHERITS=32, 
		ISVOID=33, LET=34, LOOP=35, NEW=36, NOT=37, OF=38, POOL=39, THEN=40, WHILE=41, 
		TYPE=42, IDENTIFIER=43, WS=44, ERROR=45;
	public static final int
		RULE_program = 0, RULE_classDefinition = 1, RULE_body = 2, RULE_attr = 3, 
		RULE_method = 4, RULE_parameter = 5, RULE_stmt = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefinition", "body", "attr", "method", "parameter", 
			"stmt"
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				classDefinition();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(19);
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
			setState(21);
			match(CLASS);
			setState(22);
			match(TYPE);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(23);
				match(INHERITS);
				setState(24);
				match(TYPE);
				}
			}

			setState(27);
			match(LBRACE);
			setState(28);
			body();
			setState(29);
			match(RBRACE);
			setState(30);
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(32);
					method();
					}
					break;
				case 2:
					{
					setState(33);
					attr();
					}
					break;
				}
				}
				setState(38);
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
			setState(39);
			match(IDENTIFIER);
			setState(40);
			match(COLON);
			setState(41);
			match(TYPE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LARROW) {
				{
				setState(42);
				match(LARROW);
				setState(43);
				stmt(0);
				}
			}

			setState(46);
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
			setState(48);
			match(IDENTIFIER);
			setState(49);
			match(LPAREN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(50);
				parameter();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(51);
					match(COMMA);
					setState(52);
					parameter();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(60);
			match(RPAREN);
			setState(61);
			match(COLON);
			setState(62);
			match(TYPE);
			setState(63);
			match(LBRACE);
			setState(64);
			stmt(0);
			setState(65);
			match(RBRACE);
			setState(66);
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
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(COLON);
			setState(70);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewContext extends StmtContext {
		public TerminalNode NEW() { return getToken(CoolRulesParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(CoolRulesParser.TYPE, 0); }
		public NewContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(CoolRulesParser.IDENTIFIER, 0); }
		public IdentifierContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvertContext extends StmtContext {
		public TerminalNode NOT() { return getToken(CoolRulesParser.NOT, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public InvertContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterInvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitInvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitInvert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends StmtContext {
		public TerminalNode STRING() { return getToken(CoolRulesParser.STRING, 0); }
		public StringContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends StmtContext {
		public TerminalNode ISVOID() { return getToken(CoolRulesParser.ISVOID, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IsvoidContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(CoolRulesParser.WHILE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(CoolRulesParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolRulesParser.POOL, 0); }
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TildeContext extends StmtContext {
		public TerminalNode TILDE() { return getToken(CoolRulesParser.TILDE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TildeContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterTilde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitTilde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitTilde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends StmtContext {
		public TerminalNode INTEGER() { return getToken(CoolRulesParser.INTEGER, 0); }
		public IntContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodcallContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(CoolRulesParser.IDENTIFIER, 0); }
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
		public MethodcallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatemContext extends StmtContext {
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public StatemContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterStatem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitStatem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitStatem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallingContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CoolRulesParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CoolRulesParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CoolRulesParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolRulesParser.RPAREN, 0); }
		public TerminalNode AT() { return getToken(CoolRulesParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(CoolRulesParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolRulesParser.COMMA, i);
		}
		public CallingContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterCalling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitCalling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitCalling(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StmtContext {
		public TerminalNode LBRACE() { return getToken(CoolRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolRulesParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolRulesParser.SEMICOLON, i);
		}
		public BlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends StmtContext {
		public TerminalNode LET() { return getToken(CoolRulesParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolRulesParser.IN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoolRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoolRulesParser.IDENTIFIER, i);
		}
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
		public LetContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(CoolRulesParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(CoolRulesParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(CoolRulesParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolRulesParser.MINUS, 0); }
		public TerminalNode LT() { return getToken(CoolRulesParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolRulesParser.LE, 0); }
		public TerminalNode EQUALS() { return getToken(CoolRulesParser.EQUALS, 0); }
		public ExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StmtContext {
		public TerminalNode IF() { return getToken(CoolRulesParser.IF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode THEN() { return getToken(CoolRulesParser.THEN, 0); }
		public TerminalNode FI() { return getToken(CoolRulesParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(CoolRulesParser.ELSE, 0); }
		public IfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends StmtContext {
		public TerminalNode CASE() { return getToken(CoolRulesParser.CASE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode OF() { return getToken(CoolRulesParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolRulesParser.ESAC, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoolRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoolRulesParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoolRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolRulesParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(CoolRulesParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolRulesParser.TYPE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CoolRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CoolRulesParser.SEMICOLON, i);
		}
		public CaseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(CoolRulesParser.IDENTIFIER, 0); }
		public TerminalNode LARROW() { return getToken(CoolRulesParser.LARROW, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolRulesListener ) ((CoolRulesListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolRulesVisitor ) return ((CoolRulesVisitor<? extends T>)visitor).visitAssign(this);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new MethodcallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(IDENTIFIER);
				setState(74);
				match(LPAREN);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << LBRACE) | (1L << LPAREN) | (1L << TILDE) | (1L << CASE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << NEW) | (1L << NOT) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(75);
					stmt(0);
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(76);
						match(COMMA);
						setState(77);
						stmt(0);
						}
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(85);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(IF);
				setState(87);
				stmt(0);
				setState(88);
				match(THEN);
				setState(89);
				stmt(0);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(90);
					match(ELSE);
					setState(91);
					stmt(0);
					}
				}

				setState(94);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(WHILE);
				setState(97);
				stmt(0);
				setState(98);
				match(LOOP);
				setState(99);
				stmt(0);
				setState(100);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(LBRACE);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					stmt(0);
					setState(104);
					match(SEMICOLON);
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << LBRACE) | (1L << LPAREN) | (1L << TILDE) | (1L << CASE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << NEW) | (1L << NOT) | (1L << WHILE) | (1L << IDENTIFIER))) != 0) );
				setState(110);
				match(RBRACE);
				}
				break;
			case 5:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(LET);
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(IDENTIFIER);
					setState(114);
					match(COLON);
					setState(115);
					match(TYPE);
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LARROW) {
						{
						setState(116);
						match(LARROW);
						setState(117);
						stmt(0);
						}
					}

					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(124);
				match(IN);
				setState(125);
				stmt(18);
				}
				break;
			case 6:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(CASE);
				setState(127);
				stmt(0);
				setState(128);
				match(OF);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(IDENTIFIER);
					setState(130);
					match(COLON);
					setState(131);
					match(TYPE);
					setState(132);
					match(T__0);
					setState(133);
					stmt(0);
					setState(134);
					match(SEMICOLON);
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(140);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(NEW);
				setState(143);
				match(TYPE);
				}
				break;
			case 8:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(ISVOID);
				setState(145);
				stmt(15);
				}
				break;
			case 9:
				{
				_localctx = new TildeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(TILDE);
				setState(147);
				stmt(14);
				}
				break;
			case 10:
				{
				_localctx = new InvertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(NOT);
				setState(149);
				stmt(6);
				}
				break;
			case 11:
				{
				_localctx = new StatemContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(LPAREN);
				setState(151);
				stmt(0);
				setState(152);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(INTEGER);
				}
				break;
			case 14:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(STRING);
				}
				break;
			case 15:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(IDENTIFIER);
				setState(158);
				match(LARROW);
				setState(159);
				stmt(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(162);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(163);
						match(TIMES);
						setState(164);
						stmt(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(165);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(166);
						match(DIVIDE);
						setState(167);
						stmt(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(168);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(169);
						match(PLUS);
						setState(170);
						stmt(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(171);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(172);
						match(MINUS);
						setState(173);
						stmt(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						match(LT);
						setState(176);
						stmt(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						match(LE);
						setState(179);
						stmt(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						match(EQUALS);
						setState(182);
						stmt(8);
						}
						break;
					case 8:
						{
						_localctx = new CallingContext(new StmtContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(183);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(184);
							match(AT);
							setState(185);
							match(TYPE);
							}
						}

						setState(188);
						match(DOT);
						setState(189);
						match(IDENTIFIER);
						setState(190);
						match(LPAREN);
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << LBRACE) | (1L << LPAREN) | (1L << TILDE) | (1L << CASE) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << NEW) | (1L << NOT) | (1L << WHILE) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(191);
							stmt(0);
							setState(196);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(192);
								match(COMMA);
								setState(193);
								stmt(0);
								}
								}
								setState(198);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(201);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(206);
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
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2"+
		"\23\3\2\3\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4"+
		"%\n\4\f\4\16\4(\13\4\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\7\68\n\6\f\6\16\6;\13\6\5\6=\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT\13\b\5"+
		"\bV\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\6\bm\n\b\r\b\16\bn\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\by\n\b\6\b{\n\b\r\b\16\b|\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\6\b\u008b\n\b\r\b\16\b\u008c\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00bd\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c5\n"+
		"\b\f\b\16\b\u00c8\13\b\5\b\u00ca\n\b\3\b\7\b\u00cd\n\b\f\b\16\b\u00d0"+
		"\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\2\2\u00f1\2\21\3\2\2\2\4\27\3\2\2"+
		"\2\6&\3\2\2\2\b)\3\2\2\2\n\62\3\2\2\2\fF\3\2\2\2\16\u00a2\3\2\2\2\20\22"+
		"\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\25"+
		"\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\7\34\2\2\30\33\7,\2\2\31\32"+
		"\7\"\2\2\32\34\7,\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36"+
		"\7\r\2\2\36\37\5\6\4\2\37 \7\24\2\2 !\7\26\2\2!\5\3\2\2\2\"%\5\n\6\2#"+
		"%\5\b\5\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2"+
		"\2\2(&\3\2\2\2)*\7-\2\2*+\7\7\2\2+.\7,\2\2,-\7\f\2\2-/\5\16\b\2.,\3\2"+
		"\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\26\2\2\61\t\3\2\2\2\62\63\7-\2\2\63"+
		"<\7\17\2\2\649\5\f\7\2\65\66\7\b\2\2\668\5\f\7\2\67\65\3\2\2\28;\3\2\2"+
		"\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<\64\3\2\2\2<=\3\2\2\2=>\3"+
		"\2\2\2>?\7\25\2\2?@\7\7\2\2@A\7,\2\2AB\7\r\2\2BC\5\16\b\2CD\7\24\2\2D"+
		"E\7\26\2\2E\13\3\2\2\2FG\7-\2\2GH\7\7\2\2HI\7,\2\2I\r\3\2\2\2JK\b\b\1"+
		"\2KL\7-\2\2LU\7\17\2\2MR\5\16\b\2NO\7\b\2\2OQ\5\16\b\2PN\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2UV\3\2\2\2VW\3\2"+
		"\2\2W\u00a3\7\25\2\2XY\7 \2\2YZ\5\16\b\2Z[\7*\2\2[^\5\16\b\2\\]\7\35\2"+
		"\2]_\5\16\b\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\37\2\2a\u00a3\3\2\2\2"+
		"bc\7+\2\2cd\5\16\b\2de\7%\2\2ef\5\16\b\2fg\7)\2\2g\u00a3\3\2\2\2hl\7\r"+
		"\2\2ij\5\16\b\2jk\7\26\2\2km\3\2\2\2li\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2op\3\2\2\2pq\7\24\2\2q\u00a3\3\2\2\2rz\7$\2\2st\7-\2\2tu\7\7\2\2"+
		"ux\7,\2\2vw\7\f\2\2wy\5\16\b\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zs\3\2\2\2"+
		"{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7!\2\2\177\u00a3\5\16\b"+
		"\24\u0080\u0081\7\33\2\2\u0081\u0082\5\16\b\2\u0082\u008a\7(\2\2\u0083"+
		"\u0084\7-\2\2\u0084\u0085\7\7\2\2\u0085\u0086\7,\2\2\u0086\u0087\7\3\2"+
		"\2\u0087\u0088\5\16\b\2\u0088\u0089\7\26\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\36\2\2\u008f\u00a3\3\2\2\2\u0090"+
		"\u0091\7&\2\2\u0091\u00a3\7,\2\2\u0092\u0093\7#\2\2\u0093\u00a3\5\16\b"+
		"\21\u0094\u0095\7\30\2\2\u0095\u00a3\5\16\b\20\u0096\u0097\7\'\2\2\u0097"+
		"\u00a3\5\16\b\b\u0098\u0099\7\17\2\2\u0099\u009a\5\16\b\2\u009a\u009b"+
		"\7\25\2\2\u009b\u00a3\3\2\2\2\u009c\u00a3\7-\2\2\u009d\u00a3\7\4\2\2\u009e"+
		"\u00a3\7\5\2\2\u009f\u00a0\7-\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a3\5\16"+
		"\b\3\u00a2J\3\2\2\2\u00a2X\3\2\2\2\u00a2b\3\2\2\2\u00a2h\3\2\2\2\u00a2"+
		"r\3\2\2\2\u00a2\u0080\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0092\3\2\2\2"+
		"\u00a2\u0094\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009c"+
		"\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3"+
		"\u00ce\3\2\2\2\u00a4\u00a5\f\17\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00cd\5"+
		"\16\b\20\u00a7\u00a8\f\16\2\2\u00a8\u00a9\7\t\2\2\u00a9\u00cd\5\16\b\17"+
		"\u00aa\u00ab\f\r\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00cd\5\16\b\16\u00ad"+
		"\u00ae\f\f\2\2\u00ae\u00af\7\21\2\2\u00af\u00cd\5\16\b\r\u00b0\u00b1\f"+
		"\13\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00cd\5\16\b\f\u00b3\u00b4\f\n\2\2"+
		"\u00b4\u00b5\7\16\2\2\u00b5\u00cd\5\16\b\13\u00b6\u00b7\f\t\2\2\u00b7"+
		"\u00b8\7\13\2\2\u00b8\u00cd\5\16\b\n\u00b9\u00bc\f\31\2\2\u00ba\u00bb"+
		"\7\6\2\2\u00bb\u00bd\7,\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c9\7\17"+
		"\2\2\u00c1\u00c6\5\16\b\2\u00c2\u00c3\7\b\2\2\u00c3\u00c5\5\16\b\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\7\25\2\2\u00cc\u00a4\3"+
		"\2\2\2\u00cc\u00a7\3\2\2\2\u00cc\u00aa\3\2\2\2\u00cc\u00ad\3\2\2\2\u00cc"+
		"\u00b0\3\2\2\2\u00cc\u00b3\3\2\2\2\u00cc\u00b6\3\2\2\2\u00cc\u00b9\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\17\3\2\2\2\u00d0\u00ce\3\2\2\2\26\23\33$&.9<RU^nx|\u008c\u00a2\u00bc"+
		"\u00c6\u00c9\u00cc\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}