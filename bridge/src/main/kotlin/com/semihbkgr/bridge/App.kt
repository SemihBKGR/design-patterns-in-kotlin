package com.semihbkgr.bridge

fun main() {

    var fileManager: FileManager = LocalFileManager()
    var textRepository: TextRepository = RawTextRepository(fileManager)
    textRepository.save("users", "<user-list>")
    fileManager = NetworkFileManager()
    textRepository = EncodedTextRepository(fileManager)
    textRepository.save("passwords", "<password-list>")

}
