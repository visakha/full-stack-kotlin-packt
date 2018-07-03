import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.repositories

allprojects {
    group = "com.fstackkotlin"
    version = "1.0"
    repositories {
        jcenter()
    }
}

plugins {
    base
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}