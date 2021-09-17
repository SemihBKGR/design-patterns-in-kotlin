package com.semihbkgr.strategy

class TransactionLogger(private var strategy: TransactionLoggingStrategy) {

    fun logTransaction(transaction: Transaction) {
        strategy.log(transaction)
    }

    fun logAllTransactions(vararg transactions: Transaction) {
        transactions.forEach { logTransaction(it) }
    }

    fun changeStrategy(strategy: TransactionLoggingStrategy) {
        this.strategy = strategy
    }

}