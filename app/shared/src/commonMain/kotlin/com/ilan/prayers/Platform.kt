package com.ilan.prayers

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform