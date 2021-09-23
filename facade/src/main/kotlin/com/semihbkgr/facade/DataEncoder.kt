package com.semihbkgr.facade

import java.util.*

class DataEncoder {

    private val encoder: Base64.Encoder =Base64.getEncoder()

    fun encode(data:ByteArray):ByteArray{
        println("Data is encoding")
        return encoder.encode(data)
    }

}