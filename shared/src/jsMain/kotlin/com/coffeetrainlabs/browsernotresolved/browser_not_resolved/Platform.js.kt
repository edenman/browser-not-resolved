package com.coffeetrainlabs.browsernotresolved.browser_not_resolved

class JsPlatform : Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): Platform = JsPlatform()
