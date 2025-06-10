plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.9.21" // Or compatible version
}

android {
    namespace = "org.example"
    compileSdk = 34

    defaultConfig {
        applicationId = "org.example.androidbuild"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
}
