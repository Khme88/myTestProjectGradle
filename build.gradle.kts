import org.gradle.internal.impldep.org.junit.platform.launcher.TagFilter.excludeTags

plugins {
    id("java")
    id ("io.qameta.allure") version "2.9.6"
    id("io.freefair.lombok") version "8.6"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("com.codeborne:selenide:7.5.0")

    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    testImplementation ("io.rest-assured:rest-assured:4.4.0")
    testImplementation ("com.fasterxml.jackson.core:jackson-databind:2.13.2")

    implementation ("io.qameta.allure:allure-rest-assured:2.12.1")
    implementation ("io.qameta.allure:allure-junit5:2.12.1")

}

val uiTest = tasks.register<Test>("uiTests") {
    useJUnitPlatform {
        includeTags("UI")
    }
}
val apiTest = tasks.register<Test>("apiTests") {
    useJUnitPlatform {
        includeTags("API")
    }
}

tasks.test {
    useJUnitPlatform()
}