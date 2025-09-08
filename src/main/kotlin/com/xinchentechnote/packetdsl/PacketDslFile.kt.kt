package com.xinchentechnote.packetdsl

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class PacketDslFile (viewProvider: FileViewProvider) :
    PsiFileBase(viewProvider, PacketDslLanguage) {
    override fun getFileType() = PacketDslFileType
    override fun toString(): String = "Packet DSL File"
}
