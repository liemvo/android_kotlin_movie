buildscript {
    repositories {
        google()
        jcenter()
        maven { url = uri(Config.Repositories.gradleMaven) }
    }
    dependencies {
        classpath(Config.Dependencies.androidPlugin)
        classpath(kotlin(Config.Dependencies.kotlinPlugin, Versions.kotlin))
        classpath(Config.Dependencies.kotlinter)
        classpath(Config.Dependencies.navigationSafeArgs)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
