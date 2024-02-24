plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("org.jetbrains.kotlin.plugin.serialization")

}

android {
    namespace = "com.example.littlelemon1stprojectfinal"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.littlelemon1stprojectfinal"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
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
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {



    debugImplementation("androidx.compose.ui:ui-tooling:1.6.2")
    dependencies {
        implementation("androidx.compose.material3:material3:1.2.0")
        implementation("androidx.compose.material3:material3-window-size-class:1.2.0")
        implementation("androidx.compose.material3:material3-adaptive:1.0.0-alpha06")
        implementation("androidx.compose.material3:material3-adaptive-navigation-suite:1.0.0-alpha03")
        implementation("androidx.core:core-ktx:1.7.0")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
        implementation("androidx.activity:activity-compose:1.3.1")
        implementation("androidx.compose.ui:ui-android-stubs:1.6.1")
        implementation("androidx.compose.ui:ui-tooling-preview-android:1.6.1")
        implementation("androidx.compose.material:material:1.2.0")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        androidTestImplementation("androidx.compose.ui:ui-test-junit4-android:1.6.1")
        debugImplementation("androidx.compose.ui:ui-tooling-preview-android:1.6.1")
        debugImplementation("androidx.compose.ui:ui-test-manifest:1.6.1")
        implementation("androidx.navigation:navigation-compose:2.5.3")
        implementation("io.ktor:ktor-client-android:2.1.3")
        implementation("io.ktor:ktor-client-content-negotiation:2.1.3")
        implementation("io.ktor:ktor-serialization-kotlinx-json:2.1.3")
        implementation("androidx.room:room-runtime:2.5.1")
        kapt("androidx.room:room-compiler:2.5.1")
        implementation("com.github.bumptech.glide:compose:1.0.0-alpha.1")
        implementation("androidx.compose.runtime:runtime-livedata:1.3.2")
    }




}