rootProject.name = "Nutrisport"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        // Add explicit repository for GitLive libraries
        maven { url = uri("https://maven.pkg.github.com/gitlive/firebase-kotlin-sdk") }
        // Add jitpack for alternative hosting
        maven { url = uri("https://jitpack.io") }
    }
}

include(":feature:auth")
include(":navigation")
include(":composeApp")
include(":shared")
