// Generated from PacketDsl.g4 by ANTLR 4.13.1
package com.xinchentechnote.packetdsl.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PacketDslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, UINT8=14, UINT16=15, UINT32=16, 
		UINT64=17, INT8=18, INT16=19, INT32=20, INT64=21, FLOAT32=22, FLOAT64=23, 
		DIGITS=24, STRING=25, ROOT=26, PACKET=27, REPEAT=28, METADATA=29, MATCH=30, 
		COLON=31, COMMA=32, SEMICOLON=33, IDENTIFIER=34, STRING_LITERAL=35, LINE_COMMENT=36, 
		WS=37;
	public static final int
		RULE_packet = 0, RULE_optionDefinition = 1, RULE_optionDeclaration = 2, 
		RULE_packetDefinition = 3, RULE_fieldDefinition = 4, RULE_metaDataDefinition = 5, 
		RULE_lengthFieldDeclaration = 6, RULE_checkSumFieldDeclaration = 7, RULE_metaDataDeclaration = 8, 
		RULE_value = 9, RULE_type = 10, RULE_matchFieldDeclaration = 11, RULE_matchPair = 12, 
		RULE_inerObjectDeclaration = 13, RULE_list = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"packet", "optionDefinition", "optionDeclaration", "packetDefinition", 
			"fieldDefinition", "metaDataDefinition", "lengthFieldDeclaration", "checkSumFieldDeclaration", 
			"metaDataDeclaration", "value", "type", "matchFieldDeclaration", "matchPair", 
			"inerObjectDeclaration", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'options'", "'{'", "'}'", "'='", "'@lengthOf('", "')'", "'@calculatedFrom('", 
			"'string'", "'char'", "'char['", "']'", "'as'", "'['", null, null, null, 
			null, null, null, null, null, null, null, null, null, "'root'", "'packet'", 
			"'repeat'", "'MetaData'", "'match'", "':'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "UINT8", "UINT16", "UINT32", "UINT64", "INT8", "INT16", "INT32", 
			"INT64", "FLOAT32", "FLOAT64", "DIGITS", "STRING", "ROOT", "PACKET", 
			"REPEAT", "METADATA", "MATCH", "COLON", "COMMA", "SEMICOLON", "IDENTIFIER", 
			"STRING_LITERAL", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "PacketDsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PacketDslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PacketContext extends ParserRuleContext {
		public List<PacketDefinitionContext> packetDefinition() {
			return getRuleContexts(PacketDefinitionContext.class);
		}
		public PacketDefinitionContext packetDefinition(int i) {
			return getRuleContext(PacketDefinitionContext.class,i);
		}
		public List<MetaDataDefinitionContext> metaDataDefinition() {
			return getRuleContexts(MetaDataDefinitionContext.class);
		}
		public MetaDataDefinitionContext metaDataDefinition(int i) {
			return getRuleContext(MetaDataDefinitionContext.class,i);
		}
		public List<OptionDefinitionContext> optionDefinition() {
			return getRuleContexts(OptionDefinitionContext.class);
		}
		public OptionDefinitionContext optionDefinition(int i) {
			return getRuleContext(OptionDefinitionContext.class,i);
		}
		public PacketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterPacket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitPacket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitPacket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacketContext packet() throws RecognitionException {
		PacketContext _localctx = new PacketContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_packet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 738197506L) != 0)) {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOT:
				case PACKET:
					{
					setState(30);
					packetDefinition();
					}
					break;
				case METADATA:
					{
					setState(31);
					metaDataDefinition();
					}
					break;
				case T__0:
					{
					setState(32);
					optionDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OptionDefinitionContext extends ParserRuleContext {
		public List<OptionDeclarationContext> optionDeclaration() {
			return getRuleContexts(OptionDeclarationContext.class);
		}
		public OptionDeclarationContext optionDeclaration(int i) {
			return getRuleContext(OptionDeclarationContext.class,i);
		}
		public OptionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterOptionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitOptionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitOptionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionDefinitionContext optionDefinition() throws RecognitionException {
		OptionDefinitionContext _localctx = new OptionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_optionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(T__1);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(40);
				optionDeclaration();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OptionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PacketDslParser.SEMICOLON, 0); }
		public OptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterOptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitOptionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitOptionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionDeclarationContext optionDeclaration() throws RecognitionException {
		OptionDeclarationContext _localctx = new OptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IDENTIFIER);
			setState(49);
			match(T__3);
			setState(50);
			value();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(51);
				match(SEMICOLON);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PacketDefinitionContext extends ParserRuleContext {
		public TerminalNode PACKET() { return getToken(PacketDslParser.PACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public TerminalNode ROOT() { return getToken(PacketDslParser.ROOT, 0); }
		public List<FieldDefinitionContext> fieldDefinition() {
			return getRuleContexts(FieldDefinitionContext.class);
		}
		public FieldDefinitionContext fieldDefinition(int i) {
			return getRuleContext(FieldDefinitionContext.class,i);
		}
		public PacketDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packetDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterPacketDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitPacketDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitPacketDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacketDefinitionContext packetDefinition() throws RecognitionException {
		PacketDefinitionContext _localctx = new PacketDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packetDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROOT) {
				{
				setState(54);
				match(ROOT);
				}
			}

			setState(57);
			match(PACKET);
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18538809088L) != 0)) {
				{
				{
				setState(60);
				fieldDefinition();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDefinitionContext extends ParserRuleContext {
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
	 
		public FieldDefinitionContext() { }
		public void copyFrom(FieldDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthFieldContext extends FieldDefinitionContext {
		public LengthFieldDeclarationContext lengthFieldDeclaration() {
			return getRuleContext(LengthFieldDeclarationContext.class,0);
		}
		public LengthFieldContext(FieldDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterLengthField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitLengthField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitLengthField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetaFieldContext extends FieldDefinitionContext {
		public MetaDataDeclarationContext metaDataDeclaration() {
			return getRuleContext(MetaDataDeclarationContext.class,0);
		}
		public TerminalNode REPEAT() { return getToken(PacketDslParser.REPEAT, 0); }
		public MetaFieldContext(FieldDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterMetaField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitMetaField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitMetaField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InerObjectFieldContext extends FieldDefinitionContext {
		public InerObjectDeclarationContext inerObjectDeclaration() {
			return getRuleContext(InerObjectDeclarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PacketDslParser.COMMA, 0); }
		public TerminalNode REPEAT() { return getToken(PacketDslParser.REPEAT, 0); }
		public InerObjectFieldContext(FieldDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterInerObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitInerObjectField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitInerObjectField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFieldContext extends FieldDefinitionContext {
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(PacketDslParser.COMMA, 0); }
		public TerminalNode REPEAT() { return getToken(PacketDslParser.REPEAT, 0); }
		public ObjectFieldContext(FieldDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitObjectField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitObjectField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CheckSumFieldContext extends FieldDefinitionContext {
		public CheckSumFieldDeclarationContext checkSumFieldDeclaration() {
			return getRuleContext(CheckSumFieldDeclarationContext.class,0);
		}
		public CheckSumFieldContext(FieldDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterCheckSumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitCheckSumField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitCheckSumField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatchFieldContext extends FieldDefinitionContext {
		public MatchFieldDeclarationContext matchFieldDeclaration() {
			return getRuleContext(MatchFieldDeclarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PacketDslParser.COMMA, 0); }
		public MatchFieldContext(FieldDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterMatchField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitMatchField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitMatchField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDefinition);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new InerObjectFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPEAT) {
					{
					setState(68);
					match(REPEAT);
					}
				}

				setState(71);
				inerObjectDeclaration();
				setState(72);
				match(COMMA);
				}
				break;
			case 2:
				_localctx = new MetaFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPEAT) {
					{
					setState(74);
					match(REPEAT);
					}
				}

				setState(77);
				metaDataDeclaration();
				}
				break;
			case 3:
				_localctx = new ObjectFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPEAT) {
					{
					setState(78);
					match(REPEAT);
					}
				}

				setState(81);
				match(IDENTIFIER);
				setState(82);
				match(COMMA);
				}
				break;
			case 4:
				_localctx = new LengthFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				lengthFieldDeclaration();
				}
				break;
			case 5:
				_localctx = new CheckSumFieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				checkSumFieldDeclaration();
				}
				break;
			case 6:
				_localctx = new MatchFieldContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				matchFieldDeclaration();
				setState(86);
				match(COMMA);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetaDataDefinitionContext extends ParserRuleContext {
		public TerminalNode METADATA() { return getToken(PacketDslParser.METADATA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public List<MetaDataDeclarationContext> metaDataDeclaration() {
			return getRuleContexts(MetaDataDeclarationContext.class);
		}
		public MetaDataDeclarationContext metaDataDeclaration(int i) {
			return getRuleContext(MetaDataDeclarationContext.class,i);
		}
		public MetaDataDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaDataDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterMetaDataDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitMetaDataDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitMetaDataDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaDataDefinitionContext metaDataDefinition() throws RecognitionException {
		MetaDataDefinitionContext _localctx = new MetaDataDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_metaDataDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(METADATA);
			setState(91);
			match(IDENTIFIER);
			setState(92);
			match(T__1);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17196631808L) != 0)) {
				{
				{
				setState(93);
				metaDataDeclaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LengthFieldDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token from;
		public TerminalNode COMMA() { return getToken(PacketDslParser.COMMA, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PacketDslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PacketDslParser.IDENTIFIER, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PacketDslParser.STRING_LITERAL, 0); }
		public LengthFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterLengthFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitLengthFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitLengthFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthFieldDeclarationContext lengthFieldDeclaration() throws RecognitionException {
		LengthFieldDeclarationContext _localctx = new LengthFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lengthFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(101);
				type();
				}
				break;
			}
			setState(104);
			((LengthFieldDeclarationContext)_localctx).name = match(IDENTIFIER);
			{
			setState(105);
			match(T__4);
			setState(106);
			((LengthFieldDeclarationContext)_localctx).from = match(IDENTIFIER);
			setState(107);
			match(T__5);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(109);
				match(STRING_LITERAL);
				}
			}

			setState(112);
			match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CheckSumFieldDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token from;
		public TerminalNode COMMA() { return getToken(PacketDslParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PacketDslParser.STRING, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PacketDslParser.STRING_LITERAL, 0); }
		public CheckSumFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkSumFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterCheckSumFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitCheckSumFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitCheckSumFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckSumFieldDeclarationContext checkSumFieldDeclaration() throws RecognitionException {
		CheckSumFieldDeclarationContext _localctx = new CheckSumFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_checkSumFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(114);
				type();
				}
				break;
			}
			setState(117);
			((CheckSumFieldDeclarationContext)_localctx).name = match(IDENTIFIER);
			{
			setState(118);
			match(T__6);
			setState(119);
			((CheckSumFieldDeclarationContext)_localctx).from = match(STRING);
			setState(120);
			match(T__5);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(122);
				match(STRING_LITERAL);
				}
			}

			setState(125);
			match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetaDataDeclarationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode COMMA() { return getToken(PacketDslParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(PacketDslParser.STRING_LITERAL, 0); }
		public MetaDataDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaDataDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterMetaDataDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitMetaDataDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitMetaDataDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaDataDeclarationContext metaDataDeclaration() throws RecognitionException {
		MetaDataDeclarationContext _localctx = new MetaDataDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_metaDataDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(127);
				type();
				}
				break;
			}
			setState(130);
			((MetaDataDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(131);
				match(STRING_LITERAL);
				}
			}

			setState(134);
			match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PacketDslParser.STRING, 0); }
		public TerminalNode DIGITS() { return getToken(PacketDslParser.DIGITS, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case FLOAT32:
			case FLOAT64:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				type();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(STRING);
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(DIGITS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public TerminalNode UINT8() { return getToken(PacketDslParser.UINT8, 0); }
		public TerminalNode UINT16() { return getToken(PacketDslParser.UINT16, 0); }
		public TerminalNode UINT32() { return getToken(PacketDslParser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(PacketDslParser.UINT64, 0); }
		public TerminalNode INT8() { return getToken(PacketDslParser.INT8, 0); }
		public TerminalNode INT16() { return getToken(PacketDslParser.INT16, 0); }
		public TerminalNode INT32() { return getToken(PacketDslParser.INT32, 0); }
		public TerminalNode INT64() { return getToken(PacketDslParser.INT64, 0); }
		public TerminalNode FLOAT32() { return getToken(PacketDslParser.FLOAT32, 0); }
		public TerminalNode FLOAT64() { return getToken(PacketDslParser.FLOAT64, 0); }
		public TerminalNode DIGITS() { return getToken(PacketDslParser.DIGITS, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(IDENTIFIER);
				}
				break;
			case UINT8:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(UINT8);
				}
				break;
			case UINT16:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(UINT16);
				}
				break;
			case UINT32:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(UINT32);
				}
				break;
			case UINT64:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(UINT64);
				}
				break;
			case INT8:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(INT8);
				}
				break;
			case INT16:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(INT16);
				}
				break;
			case INT32:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				match(INT32);
				}
				break;
			case INT64:
				enterOuterAlt(_localctx, 9);
				{
				setState(149);
				match(INT64);
				}
				break;
			case FLOAT32:
				enterOuterAlt(_localctx, 10);
				{
				setState(150);
				match(FLOAT32);
				}
				break;
			case FLOAT64:
				enterOuterAlt(_localctx, 11);
				{
				setState(151);
				match(FLOAT64);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 12);
				{
				setState(152);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 13);
				{
				setState(153);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 14);
				{
				setState(154);
				match(T__9);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGITS) {
					{
					setState(155);
					match(DIGITS);
					}
				}

				setState(158);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchFieldDeclarationContext extends ParserRuleContext {
		public Token matchKey;
		public Token matchName;
		public TerminalNode MATCH() { return getToken(PacketDslParser.MATCH, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PacketDslParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PacketDslParser.IDENTIFIER, i);
		}
		public List<MatchPairContext> matchPair() {
			return getRuleContexts(MatchPairContext.class);
		}
		public MatchPairContext matchPair(int i) {
			return getRuleContext(MatchPairContext.class,i);
		}
		public MatchFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterMatchFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitMatchFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitMatchFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchFieldDeclarationContext matchFieldDeclaration() throws RecognitionException {
		MatchFieldDeclarationContext _localctx = new MatchFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matchFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(MATCH);
			setState(162);
			((MatchFieldDeclarationContext)_localctx).matchKey = match(IDENTIFIER);
			setState(163);
			match(T__11);
			setState(164);
			((MatchFieldDeclarationContext)_localctx).matchName = match(IDENTIFIER);
			setState(165);
			match(T__1);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				matchPair();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 50339840L) != 0) );
			setState(171);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchPairContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PacketDslParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public TerminalNode DIGITS() { return getToken(PacketDslParser.DIGITS, 0); }
		public TerminalNode STRING() { return getToken(PacketDslParser.STRING, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PacketDslParser.COMMA, 0); }
		public MatchPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterMatchPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitMatchPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitMatchPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchPairContext matchPair() throws RecognitionException {
		MatchPairContext _localctx = new MatchPairContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matchPair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				{
				setState(173);
				match(DIGITS);
				}
				break;
			case STRING:
				{
				setState(174);
				match(STRING);
				}
				break;
			case T__12:
				{
				setState(175);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			match(COLON);
			setState(179);
			match(IDENTIFIER);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(180);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InerObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PacketDslParser.IDENTIFIER, 0); }
		public List<FieldDefinitionContext> fieldDefinition() {
			return getRuleContexts(FieldDefinitionContext.class);
		}
		public FieldDefinitionContext fieldDefinition(int i) {
			return getRuleContext(FieldDefinitionContext.class,i);
		}
		public InerObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inerObjectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterInerObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitInerObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitInerObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InerObjectDeclarationContext inerObjectDeclaration() throws RecognitionException {
		InerObjectDeclarationContext _localctx = new InerObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inerObjectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IDENTIFIER);
			{
			setState(184);
			match(T__1);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				fieldDefinition();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18538809088L) != 0) );
			setState(190);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS() { return getTokens(PacketDslParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(PacketDslParser.DIGITS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(PacketDslParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PacketDslParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PacketDslParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PacketDslParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PacketDslListener ) ((PacketDslListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacketDslVisitor ) return ((PacketDslVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__12);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				match(COMMA);
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==DIGITS || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(T__10);
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

	public static final String _serializedATN =
		"\u0004\u0001%\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00025\b\u0002\u0001\u0003\u0003\u00038\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003>\b\u0003\n\u0003\f\u0003A\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004F\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004L\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004P\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Y\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005_\b"+
		"\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006g\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0003\u0007t\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0003\b\u0081\b\b\u0001\b\u0001\b\u0003\b\u0085\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u008c\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u009d\b\n\u0001\n\u0003\n\u00a0\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u00a8\b\u000b\u000b\u000b\f\u000b\u00a9\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00b1\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00b6\b\f\u0001\r\u0001\r\u0001\r\u0004\r\u00bb\b\r\u000b\r"+
		"\f\r\u00bc\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00c5\b\u000e\n\u000e\f\u000e\u00c8\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001\u0001\u0000\u0018"+
		"\u0019\u00e8\u0000#\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000"+
		"\u00040\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\bX\u0001"+
		"\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000"+
		"\u000es\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012"+
		"\u008b\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000\u0000\u0000\u0016"+
		"\u00a1\u0001\u0000\u0000\u0000\u0018\u00b0\u0001\u0000\u0000\u0000\u001a"+
		"\u00b7\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000\u001e"+
		"\"\u0003\u0006\u0003\u0000\u001f\"\u0003\n\u0005\u0000 \"\u0003\u0002"+
		"\u0001\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'+\u0005\u0002\u0000\u0000"+
		"(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0003\u0000\u0000/\u0003"+
		"\u0001\u0000\u0000\u000001\u0005\"\u0000\u000012\u0005\u0004\u0000\u0000"+
		"24\u0003\u0012\t\u000035\u0005!\u0000\u000043\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000068\u0005\u001a"+
		"\u0000\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0005\u001b\u0000\u0000:;\u0005\"\u0000\u0000;?\u0005"+
		"\u0002\u0000\u0000<>\u0003\b\u0004\u0000=<\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\u0003\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DF\u0005\u001c\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0003\u001a\r\u0000HI\u0005 \u0000\u0000IY\u0001\u0000\u0000\u0000"+
		"JL\u0005\u001c\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MY\u0003\u0010\b\u0000NP\u0005\u001c\u0000"+
		"\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0005\"\u0000\u0000RY\u0005 \u0000\u0000SY\u0003\f\u0006"+
		"\u0000TY\u0003\u000e\u0007\u0000UV\u0003\u0016\u000b\u0000VW\u0005 \u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XE\u0001\u0000\u0000\u0000XK\u0001\u0000"+
		"\u0000\u0000XO\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XT\u0001"+
		"\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u001d\u0000\u0000[\\\u0005\"\u0000\u0000\\`\u0005\u0002\u0000"+
		"\u0000]_\u0003\u0010\b\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005\u0003\u0000\u0000d\u000b"+
		"\u0001\u0000\u0000\u0000eg\u0003\u0014\n\u0000fe\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\"\u0000\u0000"+
		"ij\u0005\u0005\u0000\u0000jk\u0005\"\u0000\u0000kl\u0005\u0006\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mo\u0005#\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005 \u0000\u0000"+
		"q\r\u0001\u0000\u0000\u0000rt\u0003\u0014\n\u0000sr\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\"\u0000"+
		"\u0000vw\u0005\u0007\u0000\u0000wx\u0005\u0019\u0000\u0000xy\u0005\u0006"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0005#\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005"+
		" \u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0081\u0003\u0014\n"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0005\"\u0000\u0000"+
		"\u0083\u0085\u0005#\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005 \u0000\u0000\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u0003\u0014\n\u0000\u0089\u008c\u0005\u0019\u0000\u0000\u008a\u008c\u0005"+
		"\u0018\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0013\u0001"+
		"\u0000\u0000\u0000\u008d\u00a0\u0005\"\u0000\u0000\u008e\u00a0\u0005\u000e"+
		"\u0000\u0000\u008f\u00a0\u0005\u000f\u0000\u0000\u0090\u00a0\u0005\u0010"+
		"\u0000\u0000\u0091\u00a0\u0005\u0011\u0000\u0000\u0092\u00a0\u0005\u0012"+
		"\u0000\u0000\u0093\u00a0\u0005\u0013\u0000\u0000\u0094\u00a0\u0005\u0014"+
		"\u0000\u0000\u0095\u00a0\u0005\u0015\u0000\u0000\u0096\u00a0\u0005\u0016"+
		"\u0000\u0000\u0097\u00a0\u0005\u0017\u0000\u0000\u0098\u00a0\u0005\b\u0000"+
		"\u0000\u0099\u00a0\u0005\t\u0000\u0000\u009a\u009c\u0005\n\u0000\u0000"+
		"\u009b\u009d\u0005\u0018\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0005\u000b\u0000\u0000\u009f\u008d\u0001\u0000\u0000\u0000"+
		"\u009f\u008e\u0001\u0000\u0000\u0000\u009f\u008f\u0001\u0000\u0000\u0000"+
		"\u009f\u0090\u0001\u0000\u0000\u0000\u009f\u0091\u0001\u0000\u0000\u0000"+
		"\u009f\u0092\u0001\u0000\u0000\u0000\u009f\u0093\u0001\u0000\u0000\u0000"+
		"\u009f\u0094\u0001\u0000\u0000\u0000\u009f\u0095\u0001\u0000\u0000\u0000"+
		"\u009f\u0096\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000\u0000\u0000"+
		"\u009f\u0098\u0001\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000"+
		"\u009f\u009a\u0001\u0000\u0000\u0000\u00a0\u0015\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005\u001e\u0000\u0000\u00a2\u00a3\u0005\"\u0000\u0000\u00a3"+
		"\u00a4\u0005\f\u0000\u0000\u00a4\u00a5\u0005\"\u0000\u0000\u00a5\u00a7"+
		"\u0005\u0002\u0000\u0000\u00a6\u00a8\u0003\u0018\f\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac\u0017\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b1\u0005\u0018\u0000\u0000\u00ae\u00b1\u0005"+
		"\u0019\u0000\u0000\u00af\u00b1\u0003\u001c\u000e\u0000\u00b0\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u001f\u0000\u0000\u00b3\u00b5\u0005\"\u0000\u0000\u00b4\u00b6\u0005 "+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u0019\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\"\u0000"+
		"\u0000\u00b8\u00ba\u0005\u0002\u0000\u0000\u00b9\u00bb\u0003\b\u0004\u0000"+
		"\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0003\u0000\u0000"+
		"\u00bf\u001b\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\r\u0000\u0000\u00c1"+
		"\u00c6\u0007\u0000\u0000\u0000\u00c2\u00c3\u0005 \u0000\u0000\u00c3\u00c5"+
		"\u0007\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u000b\u0000\u0000\u00ca\u001d"+
		"\u0001\u0000\u0000\u0000\u0019!#+47?EKOX`fns{\u0080\u0084\u008b\u009c"+
		"\u009f\u00a9\u00b0\u00b5\u00bc\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}