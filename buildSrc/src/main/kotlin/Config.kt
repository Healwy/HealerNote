/*
 * Copyright 2022 Healer Corporation.
 */

object BuildConfig {
    const val compileSdk = 33
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 23
    const val targetSdkVersion = 33

    const val applicationId = "com.xuniyishifanchen.healernote"
    const val nameSpace = "com.xuniyishifanchen.healernote"

    const val versionCode = 1
    const val versionName = "1.0"
}

object GradlePlugin {
    const val application = "com.android.application"
    const val application_version = "7.4.0-alpha09"

    const val android = "com.android.library"
    const val android_version = "7.4.0-alpha09"

    const val kotlin = "org.jetbrains.kotlin.android"
    const val kotlin_version = "1.6.21"

    const val kotlinApt = "kotlin-kapt"
}

object Versions {
    internal const val compose = "1.3.0"
    internal const val androidxCore = "1.1.0"
    internal const val lifecycle = "2.3.1"
    internal const val room = "2.3.0"
}

object Lib {
    const val ktx = "androidx.core:core-ktx:${Versions.androidxCore}"

    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
    const val activityCompose = "androidx.activity:activity-compose:1.3.1"
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiTool = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val material = "androidx.compose.material:material:1.2.0-beta01"

    const val junit = "junit:junit:4.13.2"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomComplier = "androidx.room:room-compiler:${Versions.room}"
}
