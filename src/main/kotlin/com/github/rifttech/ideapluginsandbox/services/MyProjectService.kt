package com.github.rifttech.ideapluginsandbox.services

import com.github.rifttech.ideapluginsandbox.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
