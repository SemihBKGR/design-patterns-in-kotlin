# Singleton Design Pattern

|Name|Type|
|---|---|
|Singleton|Creational|

### In plain words

> Ensure that a class has only single instance and, provides a global access point to that instance

### Wikipedia says [🔗](https://en.wikipedia.org/wiki/Singleton_pattern)

> In software engineering, the singleton pattern is a software design pattern
> that restricts the instantiation of a class to one "single" instance.
> This is useful when exactly one object is needed to coordinate actions across the system.
> The term comes from the mathematical concept of a singleton.

## Explanation

## Implementation

### Example:

```kotlin
object Singleton {
    //Properties and functions
}
```

```kotlin
//Access to the instance
Singleton.properties
```

### Use Case

### Real World Examples

- java.lang.Runtime#getRuntime()
- java.lang.System#getSecurityManager()

### Kotlin Docs

- https://kotlinlang.org/docs/object-declarations.html
- https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-lazy/
