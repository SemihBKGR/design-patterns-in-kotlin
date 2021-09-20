# Adapter Design Pattern

|Name|Type|A.K.A.|
|---|---|---|
|Adapter|Structural|<ul><li>Wrapper</li></ul>|

## Explanation

Adapter pattern lets you provide a link between two incompatible types by wrapping 'Adaptee' in a class (Adapter) that
implements the type required by the client.

### Intent

> Convert the interface of a class into another interface the clients expect. Adapter lets classes work together that
> couldn't otherwise because of incompatible interfaces.

### Wikipedia

> In software engineering, the adapter pattern is a software design pattern (also known as wrapper, an alternative naming
> shared with the decorator pattern) that allows the interface of an existing class to be used as another interface. It is
> often used to make existing classes work with others without modifying their source code.

## Implementation

<img src="./src/main/resources/uml.png">

### Example

In this example, Notification is 'Adaptee' and NotificationAdapter is 'Adapter' class. NotificationAdapter class lets
you use Notification in MessageFormatter api which work on only Message type.

```kotlin
interface Message {

    fun getHead(): String

    fun getBody(): String

}
```

TextMessage is simple implementation of Message interface

```kotlin
open class TextMessage(val from: String, val to: String, val text: String, val timeMS: Long) : Message {

    override fun getHead(): String {
        return "$timeMS | $from -> $to"
    }

    override fun getBody(): String {
        return text
    }

}
```

MessageFormatter is an API works on Message type

```kotlin
class MessageFormatter {

    fun format(message: Message): String = "[${message.getHead()} : ${message.getBody()}]";

}
```

Notification is Adaptee class that has no any relation to Message

```kotlin
class Notification(val to: String, val body: CharArray) {

    fun extractTime(): Long {
        val bodyString = String(body)
        val timeString = bodyString.substring(0, body.indexOf('-'))
        return timeString.toLong()
    }

    fun extractText(): String {
        val bodyString = String(body)
        return bodyString.substring(body.indexOf('-') + 1)
    }

}
```

NotificationAdapter is Adapter class provide a link between Notification and Message by wrapping Notification and
implementing Message interface. So we can use Notifiaciton in MessafeFormatter API

```kotlin
class NotificationAdapter(private val notification: Notification) : Message {

    override fun getHead(): String = "${notification.extractTime()} | ${notification.to}"

    override fun getBody(): String = notification.extractText()

}
```

Main Function

```kotlin
fun main() {

    val messageFormatter = MessageFormatter()

    val message = TextMessage("user1", "user2", "Hello", System.currentTimeMillis())
    println(messageFormatter.format(message))

    val notification = Notification("user1", "${System.currentTimeMillis()}-Maintenance Notification".toCharArray())
    val notificationAdapter = NotificationAdapter(notification)
    println(messageFormatter.format(notificationAdapter))

}
```

Program Output

```
[1632131949282 | user1 -> user2 : Hello]
[1632131949318 | user1 : Maintenance Notification]
```

## Applicability

Use the Adapter pattern when

* you want to use an existing class, and its interface does not match the one you need.
* you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't
  necessarily have compatible interfaces.
* (object adapter only) you need to use several existing subclasses, but it's unpractical to adapt their interface by
  subclassing every one. An object adapter can adapt the interface of its parent class.

### Known Uses

- java.util.Arrays#asList()
- java.util.Collections#list()
- java.io.InputStreamReader
- java.io.OutputStreamWriter
