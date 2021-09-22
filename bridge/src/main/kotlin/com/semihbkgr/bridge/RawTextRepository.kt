package com.semihbkgr.bridge

class RawTextRepository(val fileManager: FileManager) : TextRepository {

    override fun save(name: String, text: String) {
        println("RawTextRepository saving text,name: $name, text: $text")
        val byteArray = text.encodeToByteArray()
        fileManager.createFile("$name.txt", byteArray)
    }

    override fun delete(name: String) {
        println("RawTextRepository deleting text, name: $name")
        fileManager.deleteFile(name)
    }

}