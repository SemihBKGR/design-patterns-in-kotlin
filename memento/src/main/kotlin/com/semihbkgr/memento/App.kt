package com.semihbkgr.memento

import java.util.*

fun main() {

    val stack = Stack<FileMemento>()

    val textFile = TextFile("Numbers")
    textFile.append("1,2,3")
    stack.push(textFile.getMemento())
    textFile.printFile()
    textFile.append(",4,5,6")
    stack.push(textFile.getMemento())
    textFile.printFile()
    textFile.append(",7,8,9")
    textFile.printFile()
    textFile.createMemento(stack.pop())
    println("Loading prerecorded memento")
    textFile.printFile()
    textFile.createMemento(stack.pop())
    println("Loading prerecorded memento")
    textFile.printFile()

}
