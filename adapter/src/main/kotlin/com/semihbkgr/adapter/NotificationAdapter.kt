package com.semihbkgr.adapter

class NotificationAdapter(notification: Notification) :
    Message("System", notification.to, notification.extractText(), notification.extractTime()) {

    override fun getHead(): String {
         return "${super.timeMS} | ${super.to}"
    }



}