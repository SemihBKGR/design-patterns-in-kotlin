package com.semihbkgr.template_method

abstract class MessageFormatter {

    fun format(data:ByteArray):String{
        val decodedData=decode(data)
        val str= decodeToString(decodedData)
        return modifyString(str)
    }

    abstract fun decode(data:ByteArray):ByteArray

    abstract fun decodeToString(data:ByteArray):String

    abstract fun modifyString(str:String):String

}