plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    /////////////  Hilt ///////////////////
    id ("kotlin-kapt")
    id ("kotlin-android")
    id("com.google.dagger.hilt.android")
    /////////////  Hilt ///////////////////

    /////////////  firebase ///////////////////
    // Add the Google services Gradle plugin
    id("com.google.gms.google-services")
    /////////////  firebase ///////////////////
}

android {
    namespace = "net.developermaster.kotlincanivetesuico"
    compileSdk = 34

    defaultConfig {
        applicationId = "net.developermaster.kotlincanivetesuico"
        minSdk = 21
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
            proguardFiles( getDefaultProguardFile("proguard-android-optimize.txt"),
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
        viewBinding = true //todo binding
        dataBinding = true
        compose = true//todo databinding
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

    /////////////  Romm ///////////////////
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.media3.common)
    implementation(libs.androidx.lifecycle.livedata.core.ktx)
    implementation(libs.androidx.lifecycle.livedata.core.ktx)
    implementation(libs.androidx.lifecycle.livedata.core.ktx)
    kapt("androidx.room:room-compiler:2.6.1")
    /////////////  Romm ///////////////////

    //todo Dependências fragment KTX
    implementation(libs.androidx.fragment.ktx)

    //todo Dependências picasso
    implementation (libs.picasso)

    //todo Dependências Lifecycle
    implementation(libs.androidx.lifecycle.runtime.ktx)

    /////////////  firebase ///////////////////
    //todo Import the Firebase BoM
    implementation ( platform ("com.google.firebase:firebase-bom:32.7.4"))

    //todo google analytics
    implementation (libs.firebase.analytics)

    //todo armazenamento
    implementation (libs.firebase.storage.ktx)

    //todo banco de dados
    implementation (libs.firebase.firestore.ktx)

    //todo autenticacao
    implementation (libs.firebase.auth.ktx)
    /////////////  firebase ///////////////////

    /////////////  retrofit ///////////////////
    //todo Dependências RetroFit
    implementation (libs.retrofit)
    //todo Conversor Gson
    implementation(libs.converter.gson)
    /////////////  retrofit ///////////////////

    //todo Dependências ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx.v270)

    //todo Dependências LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx.v270)

    /////////////  Hilt ///////////////////
    //todo Dependências Hilt
    implementation(libs.hilt.android)
    implementation(libs.androidx.activity)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    kapt(libs.hilt.android.compiler)
    /////////////  Hilt ///////////////////

    /////////////  MATERIAL ///////////////////
    implementation (libs.material.v130)
    implementation (libs.material.v140)
    /////////////  MATERIAL ///////////////////

    /////////////  GALERIA  ///////////////////
    implementation (libs.androidx.activity)
    /////////////  GALERIA ///////////////////


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(project(":core-classes_de_Utilizade_Geral"))
    implementation(project(":core-classe_de_Dados_Codigos"))
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



}

//todo Dependências Kapt
kapt {
    correctErrorTypes = true
}


