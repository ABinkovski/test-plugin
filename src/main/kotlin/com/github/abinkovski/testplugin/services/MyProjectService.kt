package com.github.abinkovski.testplugin.services

import com.intellij.openapi.project.Project
import com.github.abinkovski.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
