package com.github.evg64.helloworldpluginfromtemplate.actions

import com.android.tools.idea.gradle.project.sync.GradleSyncInvoker
import com.android.tools.idea.gradle.project.sync.requestProjectSync
import com.google.wireless.android.sdk.stats.GradleSyncStats
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class SyncProjectAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        GradleSyncInvoker.getInstance()
            .requestProjectSync(event.project!!, GradleSyncStats.Trigger.TRIGGER_PROJECT_MODIFIED)
    }
}