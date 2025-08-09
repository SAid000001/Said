plugins {
    id 'fabric-loom' version '1.+'
    id 'maven-publish'
}

repositories {
    mavenCentral()
    maven { url 'https://maven.fabricmc.net/' }
}

dependencies {
    implementation 'net.fabricmc:fabric-loader:0.14.+'
}

