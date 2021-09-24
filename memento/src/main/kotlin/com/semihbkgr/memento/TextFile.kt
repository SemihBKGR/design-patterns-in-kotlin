package com.semihbkgr.memento

class TextFile(var name: String) {

    var text: String = ""
    var lastUpdateTime: Long = System.currentTimeMillis()

    fun rename(name: String) {
        this.name = name;
        this.lastUpdateTime = System.currentTimeMillis()
    }

    fun clear() {
        text = "";
        this.lastUpdateTime = System.currentTimeMillis()
    }

    fun append(text: String) {
        this.text += text
        this.lastUpdateTime = System.currentTimeMillis()
    }

    fun getMemento(): FileMemento = TextFileMemento(name, lastUpdateTime, text)

    fun setMemento(fileMemento: FileMemento) {
        var textFileMemento = fileMemento as TextFileMemento
        this.name = textFileMemento.name
        this.lastUpdateTime = textFileMemento.lastUpdateTime
        this.text = textFileMemento.text
    }

    fun printFile() {
        println("TextFile, name: $name, updatedAt: $lastUpdateTime text: $text")
    }

    data class TextFileMemento(val name: String, val lastUpdateTime: Long, val text: String) : FileMemento

}