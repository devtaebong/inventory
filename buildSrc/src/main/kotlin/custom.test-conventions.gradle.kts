plugins {
    java
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(Testing.junit.jupiter)
    testRuntimeOnly(Testing.junit.jupiter.engine)
    testImplementation("io.kotest:kotest-runner-junit5:_")
    testImplementation("io.kotest:kotest-assertions-core:_")
    testImplementation("com.ninja-squad:springmockk:_")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
    }

    maxHeapSize = "2g"
}