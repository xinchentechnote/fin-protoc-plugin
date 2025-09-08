package com.xinchentechnote.packetdsl

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object PacketDslFileType : LanguageFileType(PacketDslLanguage) {
    override fun getName() = "Packet DSL File"
    override fun getDescription() = "Packet DSL language file"
    override fun getDefaultExtension() = "pdsl"
    override fun getIcon(): Icon? = null // TODO: 可以加个图标
}
