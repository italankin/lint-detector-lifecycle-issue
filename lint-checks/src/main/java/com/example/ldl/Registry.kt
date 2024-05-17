package com.example.ldl

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.client.api.Vendor
import com.android.tools.lint.detector.api.Issue

class Registry : IssueRegistry() {
    override val issues: List<Issue> = listOf(SampleDetector.ISSUE)
    override val vendor: Vendor = Vendor("sample")
}
