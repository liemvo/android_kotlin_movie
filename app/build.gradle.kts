import java.io.FileInputStream
import java.util.Properties
plugins {
    id(Config.PluginIds.android)
    id(Config.PluginIds.kotlinAndroid)
    id(Config.PluginIds.kapt)
    id(Config.PluginIds.kotlinAndroidExtensions)
    id(Config.PluginIds.kotlinter)
    id(Config.PluginIds.navigationSafeArgs)
}

val fileInputStream = FileInputStream("key.properties")
val property = Properties()
property.load(fileInputStream)

android {
    compileSdkVersion(Versions.compileSdk)

    defaultConfig {
        applicationId = Application.id
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionName = Releases.versionName
        versionCode = Releases.versionCode
        testInstrumentationRunner = Config.testRunner
        vectorDrawables.useSupportLibrary = true

        buildConfigField("String", "movieApiKey", property.getProperty("moviesKey"))
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
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(fileTree(mapOf("dir" to "../buildSrc/build/libs", "include" to listOf("*.jar"))))
    implementation(Libraries.kotlinStdlib)
    implementation(Libraries.Supports.coreKtx)
    implementation(Libraries.Supports.appcompat)
    implementation(Libraries.Supports.material)
    implementation(Libraries.Supports.constraintlayout)

    implementation(Libraries.Navigation.fragmentKtx)
    implementation(Libraries.Navigation.uiKtx)
    testImplementation(Libraries.Test.junit)
    androidTestImplementation(Libraries.Test.androidJunit)
    androidTestImplementation(Libraries.Test.espressoCore)
}
