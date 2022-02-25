package com.github.zooombiee.mvvmplatform.services

import com.intellij.openapi.project.Project
import com.github.zooombiee.mvvmplatform.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
