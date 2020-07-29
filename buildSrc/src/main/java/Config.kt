object Config {
    const val testRunner = "androidx.test.runner.AndroidJUnitRunner"

    object Dependencies {
        const val kotlinPlugin = "gradle-plugin"
        const val androidPlugin = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlinter = "org.jmailen.gradle:kotlinter-gradle:${Versions.kotlinter}"
        const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    }

    object PluginIds {
        const val android = "com.android.application"
        const val androidLibrary = "com.android.library"
        const val kapt = "kotlin-kapt"
        const val kotlinAndroid = "kotlin-android"
        const val kotlinAndroidExtensions = "kotlin-android-extensions"
        const val kotlinter = "org.jmailen.kotlinter"
        const val navigationSafeArgs = "androidx.navigation.safeargs.kotlin"
    }

    object Repositories {
        const val gradleMaven = "https://plugins.gradle.org/m2/"
    }
}
