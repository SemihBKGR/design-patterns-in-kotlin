package com.semihbkgr.bridge

import java.util.*

class EncodedTextRepository(val fileManager: FileManager) : TextRepository {

    val encoder: Base64.Encoder = Base64.getEncoder()

    override fun save(name: String, text: String) {
        println("EncodedTextRepository saving text,name: $name, text: $text")
        val byteArray = encoder.encode(text.encodeToByteArray())
        fileManager.createFile("$name.txt", byteArray)
    }

    override fun delete(name: String) {
        println("EncodedTextRepository deleting text, name: $name")
        fileManager.deleteFile(name)
    }

}