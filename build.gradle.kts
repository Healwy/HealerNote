/*
 * Copyright 2022 Healer Corporation.
 */

plugins {
    id(GradlePlugin.application) version GradlePlugin.application_version apply false
    id(GradlePlugin.android) version GradlePlugin.android_version apply false
    id(GradlePlugin.kotlin) version GradlePlugin.kotlin_version apply false
    id(GradlePlugin.hilt) version GradlePlugin.hilt_version apply false
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.38.1")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}