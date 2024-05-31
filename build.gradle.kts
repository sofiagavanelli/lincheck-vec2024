plugins {
    id("java")
    kotlin("jvm") version "2.0.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // Lincheck dependency
    testImplementation("org.jetbrains.kotlinx:lincheck:2.32")
    // jctools dependency
    testImplementation("org.jctools:jctools-core:3.3.0")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.10.1")
    // This dependency allows you to work with kotlin.test and JUnit:
    testImplementation("junit:junit:4.13.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}