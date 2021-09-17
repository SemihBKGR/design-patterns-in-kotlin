package com.semihbkgr.adapter

class Notification(val to:String,val body: CharArray) {

    fun extractTime():Long{
        val bodyString=String(body)
        val timeString=bodyString.substring(0,body.indexOf('-'))
        return timeString.toLong()
    }

    fun extractText():String{
        val bodyString=String(body)
        return bodyString.substring(body.indexOf('-')+1)
    }

}