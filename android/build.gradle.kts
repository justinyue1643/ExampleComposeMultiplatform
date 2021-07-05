plugins {
    id("org.jetbrains.compose") version "0.4.0"
    id("com.android.application")
    kotlin("android")
}

group = "me.jay"
version = "1.0"

repositories {
    google()
}

dependencies {
    implementation(project(":common"))

    implementation("androidx.activity:activity-compose:1.3.0-rc01")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "me.jay.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}