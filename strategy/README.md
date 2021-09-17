# Strategy Design Pattern

|Name|Type|A.K.A.|
|---|---|---|
|Strategy|Behavioral|<ul><li>Policy</li></ul>|

### Explanation

Strategy pattern is used to choose and switch best-suited interchangeable algorithms at runtime. Strategy pattern makes
the algorithm independent from the clients that use it.

### Wikipedia

> In computer programming, the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

### Implementation


### Example

```kotlin
data class Transaction(val username: String, val description: String) {
    val timeMS: Long = System.currentTimeMillis()
}

class TransactionLogger(private var strategy: LoggingStrategy, private var dateFormat: DateFormat) {
    fun logTransaction(transaction: Transaction) {
        strategy.log("${dateFormat.format(Date(transaction.timeMS))} - ${transaction.username}: ${transaction.description}")
    }
    fun changeStrategy(strategy: LoggingStrategy) {
        this.strategy = strategy
    }
}
```

```kotlin
sealed interface LoggingStrategy {
    fun log(logMessageStr: String)
}

object ConsoleLoggingStrategy : LoggingStrategy {
    override fun log(logMessageStr: String) {
        println("In Console: $logMessageStr")
    }
}

object FileLoggingStrategy : LoggingStrategy {
    override fun log(logMessageStr: String) {
        println("In File: $logMessageStr")
    }
}

object NoLoggingStrategy : LoggingStrategy {
    override fun log(logMessageStr: String) {
        println("No Logging")
    }
}
```

Main Function

```kotlin
fun main() {
    val transactionLogger = TransactionLogger(ConsoleLoggingStrategy, SimpleDateFormat("yyyy.MM.dd HH:mm"))
    var transaction = Transaction("user1", "sign up")
    transactionLogger.logTransaction(transaction)
    transactionLogger.changeStrategy(FileLoggingStrategy)
    transaction = Transaction("user1", "sign in")
    transactionLogger.logTransaction(transaction)
    transactionLogger.changeStrategy(NoLoggingStrategy)
    transaction = Transaction("user1", "change password")
    transactionLogger.logTransaction(transaction)
}
```

Program Output

```
In Console: 2021.09.17 08:08 - user1: sign up
In File: 2021.09.17 08:08 - user1: sign in
No Logging
```

### Real World Uses

- org.springframework.security.core.context.SecurityContextHolderStrategy
