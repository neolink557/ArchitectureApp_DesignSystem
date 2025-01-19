import java.util.Properties

val githubProperties = Properties()
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
        version = "1.0.1"
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

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("gpr") {
                from(components["release"]) // Use "release" for the release build type

                groupId = "com.example"
                artifactId = "colorpalette"
                version = "1.0.1"
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

publishing {
    repositories {
        maven {
            val releasesRepoUrl = layout.buildDirectory.dir("repos/releases")
            val snapshotsRepoUrl = layout.buildDirectory.dir("repos/snapshots")
            url = uri(if (project.hasProperty("release")) releasesRepoUrl else snapshotsRepoUrl)
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