package com.semihbkgr.adapter

open class Message(val from: String, val to: String, val text: String, val timeMS: Long) {

    open fun getHead():String{
        return "$timeMS | $from -> $to"
    }

    fun getBody():String{
        return "$text"
    }

}