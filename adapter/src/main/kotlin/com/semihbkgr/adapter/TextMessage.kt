package com.semihbkgr.adapter

open class TextMessage(val from: String, val to: String, val text: String, val timeMS: Long) :Message{

    override fun getHead():String{
        return "$timeMS | $from -> $to"
    }

    override fun getBody():String{
        return "$text"
    }

}