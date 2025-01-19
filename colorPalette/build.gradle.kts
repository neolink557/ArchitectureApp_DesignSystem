import java.util.Properties
import java.util.UUID

val githubProperties = Properties()
val colorPaletteLibraryVersion: String by project
val incrementVersion: (String) -> String = { version ->
    val (major, minor, patch) = version.split('.')
    "${major}.${minor}.${patch.toInt() + 1}"
}
file("github.properties").inputStream().use { githubProperties.load(it) }

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    `maven-publish`
}

android {
    namespace = "com.example.colorpalette"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        version = colorPaletteLibraryVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

// Function to generate a random hash
fun generateHash(): String {
    return UUID.randomUUID().toString().replace("-", "")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("gpr") {
                from(components["release"]) // Use "release" for the release build type

                groupId = "com.example"
                artifactId = "colorpalette"
                version = project.version.toString() // Use the dynamically set version
            }
        }

        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/neolink557/ArchitectureApp_DesignSystem")
                credentials {
                    username = githubProperties.getProperty("gpr.user") ?: System.getenv("GPR_USER")
                    password = githubProperties.getProperty("gpr.token") ?: System.getenv("GPR_TOKEN")
                }
            }
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.ui.graphics.android)
    implementation(libs.androidx.runtime.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}