package com.semihbkgr.adapter

class MessageFormatter {

    fun format(message:Message):String= "[${message.getHead()} : ${message.getBody()}]";

}