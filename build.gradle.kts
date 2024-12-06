// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

//    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false

    /////////////  Hilt ///////////////////
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
    alias(libs.plugins.android.library) apply false
    /////////////  Hilt ///////////////////

    /////////////  firebase ///////////////////
    id("com.google.gms.google-services") version "4.4.2" apply false
    /////////////  firebase ///////////////////

    /////////////  ksp  ///////////////////
//    alias(libs.plugins.ksp) apply false
    /////////////  ksp  ///////////////////

    /////////////  kotlin 2.0  ///////////////////
    alias(libs.plugins.compose.compiler) apply false
    /////////////  kotlin 2.0  ///////////////////



}

