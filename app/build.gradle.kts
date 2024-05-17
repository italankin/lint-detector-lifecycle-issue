plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.ldl"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ldl"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    lint {
        checkDependencies = true
        checkTestSources = false
        ignoreTestSources = true
        checkReleaseBuilds = false
        checkGeneratedSources = false
    }
}

dependencies {
    implementation(project(":some-module"))
    lintChecks(project(":lint-checks"))
}
