package com.semihbkgr.singleton

object AppInfo {

    init {
        println("AppInfo singleton instance is being initialized")
    }

    val name: String = "Application"
    val version: String = "1.0.0"
    val os: String by lazy{
        println("Looking for OS")
        System.getProperty("os.name")
    }
    
    fun getAppTitle () :String = "$name: $version"

    fun instanceAddress () : String = Integer.toHexString(this.hashCode())

}