package com.semihbkgr.adapter

class NotificationAdapter(private val notification: Notification) : Message{

    override fun getHead(): String = "${notification.extractTime()} | ${notification.to}"

    override fun getBody(): String = notification.extractText()

}