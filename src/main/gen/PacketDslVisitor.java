// Generated from PacketDsl.g4 by ANTLR 4.13.1
package com.xinchentechnote.packetdsl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PacketDslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PacketDslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#packet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacket(PacketDslParser.PacketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#optionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDefinition(PacketDslParser.OptionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#optionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionDeclaration(PacketDslParser.OptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#packetDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacketDefinition(PacketDslParser.PacketDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InerObjectField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInerObjectField(PacketDslParser.InerObjectFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MetaField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaField(PacketDslParser.MetaFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectField(PacketDslParser.ObjectFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthField(PacketDslParser.LengthFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CheckSumField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckSumField(PacketDslParser.CheckSumFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchField}
	 * labeled alternative in {@link PacketDslParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchField(PacketDslParser.MatchFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#metaDataDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaDataDefinition(PacketDslParser.MetaDataDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#lengthFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthFieldDeclaration(PacketDslParser.LengthFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#checkSumFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckSumFieldDeclaration(PacketDslParser.CheckSumFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#metaDataDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaDataDeclaration(PacketDslParser.MetaDataDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PacketDslParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PacketDslParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#matchFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchFieldDeclaration(PacketDslParser.MatchFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#matchPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchPair(PacketDslParser.MatchPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#inerObjectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInerObjectDeclaration(PacketDslParser.InerObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacketDslParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PacketDslParser.ListContext ctx);
}