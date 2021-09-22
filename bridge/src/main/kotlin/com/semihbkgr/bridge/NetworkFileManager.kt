package com.semihbkgr.bridge

class NetworkFileManager : FileManager {

    override fun createFile(name: String, data: ByteArray) {
        println("Creating network file, name: $name, data: ${String(data)}")
    }

    override fun deleteFile(name: String) {
        println("Deleting network file, name: $name")
    }

}