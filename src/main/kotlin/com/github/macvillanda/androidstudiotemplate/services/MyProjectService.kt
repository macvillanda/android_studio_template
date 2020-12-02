package com.github.macvillanda.androidstudiotemplate.services

import com.intellij.openapi.project.Project
import com.github.macvillanda.androidstudiotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
