package com.semihbkgr.bridge

class LocalFileManager : FileManager {

    override fun createFile(name: String, data: ByteArray) {
        println("Creating local file, name: $name, data: ${String(data)}")
    }

    override fun deleteFile(name: String) {
        println("Deleting local file, name: $name")
    }

}