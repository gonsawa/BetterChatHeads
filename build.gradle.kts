import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    kotlin("plugin.serialization") version "1.7.21"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

val minecraftMajorVersion: String by project
val minecraftMinorVersion: String by project
val paperVersion: String by project
val kotlinXSerializationVersion: String by project
val fuelVersion: String by project
val projectVersion: String by project

group = "me.goncalocruz.betterchatheads"
version = projectVersion

repositories {
    mavenCentral()
    maven { url = uri("https://repo.papermc.io/repository/maven-public/") }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.kittinunf.fuel:fuel:$fuelVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinXSerializationVersion")
    compileOnly("io.papermc.paper:paper-api:$minecraftMajorVersion.$minecraftMinorVersion-$paperVersion")
}


tasks {

    test {
        useJUnitPlatform()
    }

    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    processResources {
        eachFile {
            filter<org.apache.tools.ant.filters.ReplaceTokens>(mapOf(
                "tokens" to mapOf(
                    "version" to project.version,
                    "api-version" to minecraftMajorVersion
                )
            ))
        }
    }
}