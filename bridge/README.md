# Bridge Design Pattern

|Name|Type|A.K.A.|
|---|---|---|
|Bridge|Structural|<ul><li>Handle/Body</li></ul>|

## Explanation

> The bridge pattern is used to separate the abstract elements of a class from the implementation details, providing the
> means to replace the implementation details without modifying the abstraction.

### Intent

> Decouple an abstraction from its implementation so that the two can vary independently.

### Wikipedia

> The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its
> implementation so that the two can vary independently", introduced by the Gang of Four. The bridge uses encapsulation,
> aggregation, and can use inheritance to separate responsibilities into different classes.

## Implementation

<img src="./src/main/resources/adapter-uml.png" width="600">

### Example

```kotlin
interface FileManager {

    fun createFile(name: String, data: ByteArray)

    fun deleteFile(name: String)

}

class LocalFileManager : FileManager {

    override fun createFile(name: String, data: ByteArray) {
        println("Creating local file, name: $name, data: ${String(data)}")
    }

    override fun deleteFile(name: String) {
        println("Deleting local file, name: $name")
    }

}

class NetworkFileManager : FileManager {

    override fun createFile(name: String, data: ByteArray) {
        println("Creating network file, name: $name, data: ${String(data)}")
    }

    override fun deleteFile(name: String) {
        println("Deleting network file, name: $name")
    }

}
```

```kotlin
interface TextRepository {

    fun save(name: String, text: String)

    fun delete(name: String)

}

class RawTextRepository(val fileManager: FileManager) : TextRepository {

    override fun save(name: String, text: String) {
        println("RawTextRepository saving text,name: $name, text: $text")
        val byteArray = text.encodeToByteArray()
        fileManager.createFile("$name.txt", byteArray)
    }

    override fun delete(name: String) {
        println("RawTextRepository deleting text, name: $name")
        fileManager.deleteFile(name)
    }

}

class EncodedTextRepository(val fileManager: FileManager) : TextRepository {

    val encoder: Base64.Encoder = Base64.getEncoder()

    override fun save(name: String, text: String) {
        println("EncodedTextRepository saving text,name: $name, text: $text")
        val byteArray = encoder.encode(text.encodeToByteArray())
        fileManager.createFile("$name.txt", byteArray)
    }

    override fun delete(name: String) {
        println("EncodedTextRepository deleting text, name: $name")
        fileManager.deleteFile(name)
    }

}
```

Main Function

```kotlin
fun main() {
    var fileManager: FileManager = LocalFileManager()
    var textRepository: TextRepository = RawTextRepository(fileManager)
    textRepository.save("users", "<user-list>")
    fileManager = NetworkFileManager()
    textRepository = EncodedTextRepository(fileManager)
    textRepository.save("passwords", "<password-list>")
}
```

Program Output

```
RawTextRepository saving text,name: users, text: <user-list>
Creating local file, name: users.txt, data: <user-list>
EncodedTextRepository saving text,name: passwords, text: <password-list>
Creating network file, name: passwords.txt, data: PHBhc3N3b3JkLWxpc3Q+
```

## Applicability

Use the Bridge pattern when

* You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for
  example, when the implementation must be selected or switched at run-time.
* Both the abstractions and their implementations should be extensible by subclassing. In this case, the Bridge pattern
  lets you combine the different abstractions and implementations and extend them independently.
* Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have
  to be recompiled.
* You have a proliferation of classes. Such a class hierarchy indicates the need for splitting an object into two parts.
  Rumbaugh uses the term "nested generalizations" to refer to such class hierarchies.
* You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be
  hidden from the client. A simple example is Coplien's String class, in which multiple objects can share the same
  string representation.

