plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("org.jetbrains.intellij.platform") version "2.8.0"
    id("antlr")
}

group = "com.xinchentechnote"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Configure IntelliJ Platform Gradle Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    antlr("org.antlr:antlr4:4.13.1") // ✅ ANTLR runtime + generator
    implementation("org.antlr:antlr4-runtime:4.13.1")
    intellijPlatform {
        create("IC", "2025.1")
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)
        // Add necessary plugin dependencies for compilation here, example:
        // bundledPlugin("com.intellij.java")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "251"
        }

        changeNotes = """
            Initial version
        """.trimIndent()
    }
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
}

tasks.named<AntlrTask>("generateGrammarSource") {
    maxHeapSize = "64m"
    arguments = listOf("-visitor", "-listener", "-package", "com.xinchentechnote.packetdsl.antlr")
    outputDirectory = file("src/main/gen")
}

tasks.named("compileKotlin") {
    dependsOn("generateGrammarSource")
}



sourceSets {
    main {
        java {
            srcDir("src/main/gen")
        }
    }
}


kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}
