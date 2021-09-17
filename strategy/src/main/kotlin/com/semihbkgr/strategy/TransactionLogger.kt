package com.semihbkgr.strategy

import java.text.DateFormat
import java.util.*

class TransactionLogger(private var strategy: LoggingStrategy, private var dateFormat: DateFormat) {

    fun logTransaction(transaction: Transaction) {
        strategy.log("${dateFormat.format(Date(transaction.timeMS))} - ${transaction.username}: ${transaction.description}")
    }

    fun changeStrategy(strategy: LoggingStrategy) {
        this.strategy = strategy
    }

}