plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.ec25p5e.feature_auth2"
    compileSdk = Version.compileSdk

    defaultConfig {
        applicationId = "com.ec25p5e.feature_auth2"
        minSdk = Version.minSdk
        targetSdk = Version.compileSdk
        versionCode = Version.versionCode
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
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Deps.core)
    implementation(Deps.lifecycle)
    implementation(JetpackCompose.activity)
    implementation(platform(JetpackCompose.BOM))
    implementation(JetpackCompose.ui)
    implementation(JetpackCompose.uiGraphics)
    implementation(JetpackCompose.toolingPreview)
    implementation(JetpackCompose.material3)
    testImplementation(Junit.core)
    androidTestImplementation(Junit.ext)
    androidTestImplementation(AndroidX.espressoCore)
    androidTestImplementation(platform(JetpackCompose.BOMAndroidX))
    androidTestImplementation(Junit.junit4)
    debugImplementation(JetpackCompose.tooling)
    debugImplementation(JetpackCompose.manifest)

    // Dagger Hilt
    implementation(DaggerHilt.hiltAndroid)
    kapt(DaggerHilt.hiltCompiler)
    androidTestImplementation(DaggerHilt.hiltTesting)
    kaptAndroidTest(DaggerHilt.hiltAndroid)
    testImplementation(DaggerHilt.hiltTesting)
    kaptTest(DaggerHilt.hiltCompiler)
    implementation(DaggerHilt.hiltNavigation)

    // Coil for image loading
    implementation(Coil.core)

    // App module inside
    implementation(project(App.coreModule))
}