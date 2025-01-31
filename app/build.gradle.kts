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

        //todo Dependências AndroidX test runner
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

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

    //todo Dependências ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx.v270)

    //todo Dependências LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx.v270)

    //todo Dependências fragment KTX
    implementation(libs.androidx.fragment.ktx)

    //todo Dependências picasso
    implementation (libs.picasso)

    //todo Dependências Lifecycle
    implementation(libs.androidx.lifecycle.runtime.ktx)

    /////////////  COMPOSE ///////////////////
    // todo Dependências ViewModel Compose
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    //todo Dependências Lifecycle Compose
    implementation(libs.androidx.runtime.livedata)//observeAsState
    /////////////  COMPOSE ///////////////////

    /////////////  ROOM ///////////////////
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.media3.common)
    implementation(libs.androidx.lifecycle.livedata.core.ktx)
    implementation(libs.androidx.lifecycle.livedata.core.ktx)
    implementation(libs.androidx.lifecycle.livedata.core.ktx)
    implementation(libs.com.google.devtools.ksp.gradle.plugin)
    implementation(libs.ksp.com.google.devtools.ksp.gradle.plugin)
    implementation(libs.androidx.junit.ktx)
    implementation(libs.core)
    implementation(libs.lifecycle.viewmodel.ktx)
    kapt(libs.androidx.room.compiler)
    /////////////  ROOM ///////////////////

    /////////////  FIREBASE ///////////////////
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
    /////////////  FIREBASE ///////////////////

    /////////////  RETROFIT ///////////////////
    //todo Dependências RetroFit
    implementation (libs.retrofit)
    //todo Conversor Gson
    implementation(libs.converter.gson)
    /////////////  RETROFIT ///////////////////

    /////////////  HILT ///////////////////
    //todo Dependências Hilt
    implementation(libs.hilt.android)
    implementation(libs.androidx.activity)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    kapt(libs.hilt.android.compiler)
    /////////////  HILT ///////////////////

    /////////////  MATERIAL ///////////////////
    implementation (libs.material.v130)
    implementation (libs.material.v140)
    /////////////  MATERIAL ///////////////////

    /////////////  GALERIA  ///////////////////
    implementation (libs.androidx.activity)
    /////////////  GALERIA ///////////////////

    /////////////  TEST ///////////////////
    ///todo Dependências JUnit
    testImplementation(libs.junit)

    ///todo Dependências junit
    androidTestImplementation(libs.androidx.junit)

    ///todo Dependências junit4
    androidTestImplementation(libs.androidx.ui.test.junit4)

    ///todo Dependências androidx runner
    androidTestImplementation(libs.androidx.runner)

    ///todo Dependências androidx rules
    androidTestImplementation(libs.androidx.rules)

    ///todo Dependências RecyclerView contrib
    androidTestImplementation( libs.androidx.espresso.contrib.v330)

    ///todo Dependências Espresso
    androidTestImplementation(libs.androidx.espresso.core)

    ///todo Dependências Robolectric
    testImplementation(libs.robolectric)

    ///todo Dependências Truth
    testImplementation(libs.truth)

    ///todo Dependências Coroutines runTest
    testImplementation(libs.kotlinx.coroutines.test)

    ///todo Dependências Mockk
    testImplementation(libs.mockito.core)

    ///todo Dependências LiveData util
    testImplementation(libs.androidx.core.testing)
    /////////////  TEST ///////////////////

    //todo Dependências AndroidX core
    implementation(libs.androidx.core.ktx)

    ///todo Dependências AndroidX appcompat
    implementation(libs.androidx.appcompat)

    ///todo Dependências material
    implementation(libs.material)

    ///todo Dependências AndroidX constraintlayout
    implementation(libs.androidx.constraintlayout)

    ///todo Dependências AndroidX lifecycle livedata
    implementation(libs.androidx.lifecycle.livedata.ktx)

    ///todo Dependências AndroidX lifecycle viewmodel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    ///todo Dependências AndroidX navigation fragment
    implementation(libs.androidx.navigation.fragment.ktx)

    ///todo Dependências AndroidX navigation ui
    implementation(libs.androidx.navigation.ui.ktx)

    ///todo Dependências classes de utilidade

    ///todo Dependências classes de dados

    ///todo Dependências activity compose
    implementation(libs.androidx.activity.compose)

    ///todo Dependências compose bom
    implementation(platform(libs.androidx.compose.bom))

    ///todo Dependências compose ui
    implementation(libs.androidx.ui)

    ///todo Dependências ui graphics
    implementation(libs.androidx.ui.graphics)

    ///todo Dependências ui tooling
    implementation(libs.androidx.ui.tooling.preview)

    ///todo Dependências material 3
    implementation(libs.androidx.material3)

    ///todo Dependências coil
    implementation(libs.coil.compose)

    //todo Dependências google maps
    implementation(libs.play.services.location)
    implementation(libs.play.services.maps)
    implementation(libs.maps.ktx)//todo mapa ktx
    implementation(libs.android.maps.utils)//todo mapa cluster

    implementation(libs.play.services.maps.v1810)//todo mapa v1810
    implementation(libs.maps.compose)//todo mapa compose

}

//todo Dependências Kapt
kapt {
    correctErrorTypes = true
}


