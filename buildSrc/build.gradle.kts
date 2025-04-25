plugins {
    `kotlin-dsl`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
        vendor.set(JvmVendorSpec.AMAZON)
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:_")
    implementation("org.jetbrains.kotlin:kotlin-allopen:_")
    implementation("org.jetbrains.kotlin:kotlin-noarg:_")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:_")
    implementation("io.spring.gradle:dependency-management-plugin:_")
}