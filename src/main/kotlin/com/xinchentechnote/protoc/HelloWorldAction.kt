package com.xinchentechnote.protoc


import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        Messages.showMessageDialog(
            project,
            "Hello, World from Kotlin Plugin!",
            "Greeting",
            Messages.getInformationIcon()
        )
    }
}
