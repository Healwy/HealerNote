/*
 * Copyright 2022 Healer Corporation.
 */

plugins {
    id(GradlePlugin.application)
    id(GradlePlugin.kotlin)
    id(GradlePlugin.kotlinApt)
    id(GradlePlugin.hilt)
}

android {
    namespace = BuildConfig.nameSpace
    compileSdk = BuildConfig.compileSdk

    defaultConfig {
        applicationId = BuildConfig.applicationId
        minSdk = BuildConfig.minSdkVersion
        targetSdk = BuildConfig.targetSdkVersion
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-beta01"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Lib.ktx)
    implementation(Lib.lifecycleRuntime)
    implementation(Lib.activityCompose)
    implementation(Lib.composeUi)
    implementation(Lib.composeUiTool)
    implementation(Lib.composeNavigation)
    implementation(Lib.composeIcons)
    implementation(Lib.composeHiltNavigation)
    implementation(Lib.composeLifecycle)
    implementation(Lib.material)

    implementation(Lib.roomRuntime)
    implementation(Lib.roomKtx)
    kapt(Lib.roomComplier)

    implementation(Lib.hilt)
    kapt(Lib.hiltComplier)
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0-alpha03")

    testImplementation(Lib.junit)
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}
