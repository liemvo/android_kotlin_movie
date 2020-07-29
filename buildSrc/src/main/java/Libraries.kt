object Libraries {
    const val kotlinStdlib =  "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    object Supports {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    }

    object Navigation {
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val androidJunit = "androidx.test.ext:junit:${Versions.androidxJunit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}
