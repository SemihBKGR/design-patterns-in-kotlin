package com.semihbkgr.bridge

interface FileManager {

    fun createFile(name: String, data: ByteArray)

    fun deleteFile(name: String)

}