plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.seleniumhq.selenium:selenium-java:4.11.0")
    testImplementation("org.testng:testng:7.8.0")
    testImplementation("io.qameta.allure:allure-testng:2.21.0")
}
dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.12.0") // En son sürüm
    testImplementation("org.testng:testng:7.8.0") // TestNG için
}
dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.12.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.5.3")
    testImplementation("org.testng:testng:7.8.0")
}


tasks.named<Delete>("clean") {
    delete(layout.buildDirectory)
}



allure {
    version = "2.20.0"
    adapter.autoconfigure = true
}
