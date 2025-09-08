package com.xinchentechnote.packetdsl

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerBase
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

object PacketDslTokenTypes {
    val TEXT = IElementType("TEXT", PacketDslLanguage)
}

class PacketDslLexer : LexerBase() {
    private var buffer: CharSequence = ""
    private var startOffset = 0
    private var endOffset = 0
    private var done = false

    override fun start(buffer: CharSequence, startOffset: Int, endOffset: Int, initialState: Int) {
        this.buffer = buffer
        this.startOffset = startOffset
        this.endOffset = endOffset
        this.done = false
    }

    override fun getState() = 0
    override fun getTokenType(): IElementType? = if (!done) PacketDslTokenTypes.TEXT else null
    override fun getTokenStart() = startOffset
    override fun getTokenEnd() = endOffset
    override fun advance() { done = true }
    override fun getBufferSequence() = buffer
    override fun getBufferEnd() = endOffset
}

class PacketDslPsiParser : PsiParser {
    override fun parse(root: IElementType, builder: PsiBuilder): ASTNode {
        val rootMarker = builder.mark()
        while (!builder.eof()) {
            builder.advanceLexer()
        }
        rootMarker.done(root)
        return builder.treeBuilt
    }
}


class PacketDslParserDefinition : ParserDefinition {
    companion object {
        val FILE = IFileElementType(PacketDslLanguage)
    }

    override fun createLexer(p0: Project?): Lexer {
        return PacketDslLexer()
    }

    override fun createParser(p0: Project?): PsiParser {
        return PacketDslPsiParser()
    }

    override fun getFileNodeType() = FILE
    override fun getWhitespaceTokens(): TokenSet = TokenSet.EMPTY
    override fun getCommentTokens(): TokenSet = TokenSet.EMPTY
    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
    override fun createElement(node: ASTNode): PsiElement = node.psi
    override fun createFile(viewProvider: FileViewProvider) = PacketDslFile(viewProvider)
}