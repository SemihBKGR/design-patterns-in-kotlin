# Singleton Design Pattern

|Name|Type|
|---|---|
|Singleton|Creational|

### Explanation

Ensure that a class has only single instance and provides a global access point to that instance

### Wikipedia

> In software engineering, the singleton pattern is a software design pattern
> that restricts the instantiation of a class to one "single" instance.
> This is useful when exactly one object is needed to coordinate actions across the system.
> The term comes from the mathematical concept of a singleton.

### Implementation

Types modified by 'object' keyword have only singleton instance instantiated by kotlin\
To refer to the object, use its name directly.\
The initialization of an object is done on first access.\
The initialization of an object declaration is thread-safe.\

### Example

```kotlin
object AppInfo {
    init {
        println("AppInfo singleton instance is being initialized")
    }
    val name: String = "Application"
    val version: String = "1.0.0"
    val os: String by lazy {
        println("Looking for OS")
        System.getProperty("os.name")
    }
    fun getAppTitle(): String = "$name: $version"
    fun instanceAddress(): String = Integer.toHexString(this.hashCode())
}
```

Main Function
```kotlin
fun main() {
    println("AppTitle : ${AppInfo.getAppTitle()}")
    println("Singleton instance address: ${AppInfo.instanceAddress()}")
    println("Singleton instance address: ${AppInfo.instanceAddress()}")
    println("OS Name: ${AppInfo.os}")
}
```

Program Output
```
AppInfo singleton instance is being initialized
AppTitle : Application: 1.0.0
Singleton instance address: 783e6358
Singleton instance address: 783e6358
Looking for OS
OS Name: Windows 10
```

### Real World Uses

- java.lang.Runtime#getRuntime()
- java.lang.System#getSecurityManager()
