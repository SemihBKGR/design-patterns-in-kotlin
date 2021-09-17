package com.semihbkgr.strategy

import java.text.SimpleDateFormat

fun main() {

    val transactionLogger=TransactionLogger(ConsoleLoggingStrategy, SimpleDateFormat("yyyy.MM.dd HH:mm"))
    var transaction=Transaction("user1","sign up")
    transactionLogger.logTransaction(transaction)
    transactionLogger.changeStrategy(FileLoggingStrategy)
    transaction=Transaction("user1","sign in")
    transactionLogger.logTransaction(transaction)
    transactionLogger.changeStrategy(NoLoggingStrategy)
    transaction=Transaction("user1","change password")
    transactionLogger.logTransaction(transaction)

}

