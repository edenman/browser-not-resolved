package com.coffeetrainlabs.browsernotresolved.browser_not_resolved

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform