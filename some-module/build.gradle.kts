plugins {
    id("com.android.library")
}

android {
    namespace = "com.example.ldl.some"
    compileSdk = 34

    lint {
        checkTestSources = false
        ignoreTestSources = true
        checkReleaseBuilds = false
        checkGeneratedSources = false
    }
}

dependencies {
    lintChecks(project(":lint-checks"))
}
