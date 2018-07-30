package com.plugin.test

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {

    void apply(Project project) {

        project.extensions.create('test', MyExtension)

        project.task('hello') {
            doLast {
                println project.test.message
            }
        }
    }
}
