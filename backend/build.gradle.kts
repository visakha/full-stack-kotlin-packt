import org.gradle.api.file.CopySpec
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.diagnostics.PositioningStrategies.UNUSED_VALUE
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {

    @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
    var kotlinVersion: String by extra
    @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
    var kotlinTestVersion: String by extra
    @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
    var springBootVersion : String by extra

    @Suppress("UNUSED_VALUE")
    kotlinVersion = "1.2.41"
    @Suppress("UNUSED_VALUE")
    kotlinTestVersion = kotlinVersion
    @Suppress("UNUSED_VALUE")
    springBootVersion = "2.0.3.RELEASE"


    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:${kotlinVersion}")
    }
}

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version embeddedKotlinVersion
    id("io.spring.dependency-management") version "1.0.5.RELEASE"
}

apply {
    plugin("org.springframework.boot")
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter")
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    testCompile("org.springframework.boot:spring-boot-starter-test")
}

val project = mapOf(
        name to "backend"
)

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = "-Xjsr305=strict".lines()
    }
}
// below from start.spring.io -- gradle DSL
//compileTestKotlin {
//    kotlinOptions {
//        freeCompilerArgs = ["-Xjsr305=strict"]
//        jvmTarget = "1.8"
//    }
//}


