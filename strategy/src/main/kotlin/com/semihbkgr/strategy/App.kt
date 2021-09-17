package com.semihbkgr.strategy

fun main() {

    val transactionLogger=TransactionLogger(ConsoleLoggingStrategy)
    var transaction=Transaction("user1","sign up")
    transactionLogger.logAllTransactions(transaction)
    transactionLogger.changeStrategy(FileLoggingStrategy)
    transaction=Transaction("user1","sign in")
    transactionLogger.logAllTransactions(transaction)
    transactionLogger.changeStrategy(NoLoggingStrategy)
    transaction=Transaction("user1","change password")
    transactionLogger.logAllTransactions(transaction)



}