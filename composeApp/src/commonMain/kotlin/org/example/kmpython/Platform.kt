package org.example.kmpython

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform