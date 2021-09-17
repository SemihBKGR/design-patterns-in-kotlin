package com.semihbkgr.adapter

class MessageFormatter {

    fun format(message:Message):String{
        return "-----------Message-----------\n" +
                "${message.getHead()}\n${message.getBody()}\n" +
                "----------------------------"
    }

}