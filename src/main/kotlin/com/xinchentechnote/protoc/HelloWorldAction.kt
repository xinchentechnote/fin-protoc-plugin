package com.xinchentechnote.protoc


import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        NativeLoader
        val input = "packet Sample { int32 id,}"
        val ptr = FinProtocLibrary.INSTANCE.FormatPacketDslExport(input)
        val formatted = ptr.getString(0)
        val project = e.project
        Messages.showMessageDialog(
            project,
            formatted,
            "Formatted DSL",
            Messages.getInformationIcon()
        )
    }
}
