package com.semihbkgr.strategy

sealed interface LoggingStrategy {

    fun log(logMessageStr:String)

}

object ConsoleLoggingStrategy : LoggingStrategy {

    override fun log(logMessageStr:String) {
        println("In Console: $logMessageStr")
    }

}

object FileLoggingStrategy : LoggingStrategy {

    override fun log(logMessageStr:String) {
        println("In File: $logMessageStr")
    }

}

object NoLoggingStrategy : LoggingStrategy {

    override fun log(logMessageStr:String) {
        println("No Logging")
    }

}
