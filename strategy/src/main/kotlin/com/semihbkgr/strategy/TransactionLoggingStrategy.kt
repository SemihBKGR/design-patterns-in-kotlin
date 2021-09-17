package com.semihbkgr.strategy

sealed interface TransactionLoggingStrategy {

    fun log(transaction:Transaction)

}

object ConsoleLoggingStrategy : TransactionLoggingStrategy {

    override fun log(transaction: Transaction) {
        println("In Console: $transaction")
    }

}

object FileLoggingStrategy : TransactionLoggingStrategy {

    override fun log(transaction: Transaction) {
        println("In File: $transaction")
    }

}

object NoLoggingStrategy : TransactionLoggingStrategy {

    override fun log(transaction: Transaction) {
        println("No Logging")
    }

}
