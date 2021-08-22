package com.semihbkgr.singleton

object Singleton {

    init {
        println("Singleton instance has been initialized")
    }

    val property: String = "value".also {
        println("Property has been initialized")
    }

    val lazyProperty: String by lazy {
        println("LazyProperty has been initialized")
        "value"
    }

    override fun toString(): String {
        return "Singleton#toString()"
    }

}