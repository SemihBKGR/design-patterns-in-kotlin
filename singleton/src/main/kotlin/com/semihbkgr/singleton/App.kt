package com.semihbkgr.singleton

fun main() {

    println("AppTitle : ${AppInfo.getAppTitle()}")
    println("Singleton instance address: ${AppInfo.instanceAddress()}")
    println("Singleton instance address: ${AppInfo.instanceAddress()}")
    println("OS Name: ${AppInfo.os}")

}