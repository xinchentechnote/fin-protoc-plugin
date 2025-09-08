// Generated from PacketDsl.g4 by ANTLR 4.13.1
package com.xinchentechnote.packetdsl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PacketDslParser}.
 */
public interface PacketDslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#packet}.
	 * @param ctx the parse tree
	 */
	void enterPacket(PacketDslParser.PacketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#packet}.
	 * @param ctx the parse tree
	 */
	void exitPacket(PacketDslParser.PacketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#optionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOptionDefinition(PacketDslParser.OptionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#optionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOptionDefinition(PacketDslParser.OptionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#optionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOptionDeclaration(PacketDslParser.OptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#optionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOptionDeclaration(PacketDslParser.OptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#packetDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPacketDefinition(PacketDslParser.PacketDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#packetDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPacketDefinition(PacketDslParser.PacketDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InerObjectField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInerObjectField(PacketDslParser.InerObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InerObjectField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInerObjectField(PacketDslParser.InerObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMetaField(PacketDslParser.MetaFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMetaField(PacketDslParser.MetaFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterObjectField(PacketDslParser.ObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitObjectField(PacketDslParser.ObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLengthField(PacketDslParser.LengthFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLengthField(PacketDslParser.LengthFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CheckSumField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCheckSumField(PacketDslParser.CheckSumFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CheckSumField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCheckSumField(PacketDslParser.CheckSumFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMatchField(PacketDslParser.MatchFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMatchField(PacketDslParser.MatchFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#metaDataDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMetaDataDefinition(PacketDslParser.MetaDataDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#metaDataDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMetaDataDefinition(PacketDslParser.MetaDataDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#lengthFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLengthFieldDeclaration(PacketDslParser.LengthFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#lengthFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLengthFieldDeclaration(PacketDslParser.LengthFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#checkSumFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCheckSumFieldDeclaration(PacketDslParser.CheckSumFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#checkSumFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCheckSumFieldDeclaration(PacketDslParser.CheckSumFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#metaDataDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMetaDataDeclaration(PacketDslParser.MetaDataDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#metaDataDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMetaDataDeclaration(PacketDslParser.MetaDataDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PacketDslParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PacketDslParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PacketDslParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PacketDslParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#matchFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatchFieldDeclaration(PacketDslParser.MatchFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#matchFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatchFieldDeclaration(PacketDslParser.MatchFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#matchPair}.
	 * @param ctx the parse tree
	 */
	void enterMatchPair(PacketDslParser.MatchPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#matchPair}.
	 * @param ctx the parse tree
	 */
	void exitMatchPair(PacketDslParser.MatchPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#inerObjectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInerObjectDeclaration(PacketDslParser.InerObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#inerObjectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInerObjectDeclaration(PacketDslParser.InerObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PacketDslParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(PacketDslParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PacketDslParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(PacketDslParser.ListContext ctx);
}