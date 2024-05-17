package com.example.ldl

import com.android.tools.lint.detector.api.Context
import com.android.tools.lint.detector.api.Detector
import com.android.tools.lint.detector.api.Implementation
import com.android.tools.lint.detector.api.Issue
import com.android.tools.lint.detector.api.Scope
import com.android.tools.lint.detector.api.XmlScanner

class SampleDetector : Detector(), XmlScanner {

    companion object {
        val ISSUE = Issue.create(
            "SampleIssue",
            briefDescription = "Sample issue",
            explanation = "Sample issue",
            Implementation(SampleDetector::class.java, Scope.MANIFEST_SCOPE)
        )
    }

    init {
        println("create instance: $this")
    }

    override fun beforeCheckRootProject(context: Context) {
        println("beforeCheckRootProject: ${context.project.name} (isMain=${context.isMainProject()})")
    }

    override fun beforeCheckEachProject(context: Context) {
        println("beforeCheckEachProject: ${context.project.name} (isMain=${context.isMainProject()})")
    }

    override fun afterCheckEachProject(context: Context) {
        println("afterCheckEachProject: ${context.project.name} (isMain=${context.isMainProject()})")
    }

    override fun afterCheckRootProject(context: Context) {
        println("afterCheckRootProject: ${context.project.name} (isMain=${context.isMainProject()})")
    }
}
