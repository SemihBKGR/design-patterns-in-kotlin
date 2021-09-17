package com.semihbkgr.adapter

fun main() {

    val messageFormatter = MessageFormatter()

    val message= TextMessage("user1","user2","Hello",System.currentTimeMillis())
    println(messageFormatter.format(message))

    val notification= Notification("user1","${System.currentTimeMillis()}-Maintenance Notification".toCharArray())
    val notificationAdapter=NotificationAdapter(notification)
    println(messageFormatter.format(notificationAdapter))

}
