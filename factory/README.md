# Factory Design Pattern

|Name|Type|A.K.A.|
|---|---|---|
|Factory|Creational|<ul><li>Simple Factory</li><li>Static Factory Method</li></ul>|

### Explanation

Providing a static method that creates new instance without exposing any instantiation logic to the client in order to
make client code focus on usage. These methods are generally encapsulated in a class called as factory and the type of
generated object is determined at runtime.

### Wikipedia says

> In object-oriented programming (OOP), a factory is an object for creating other objects – formally a factory is a function or method that returns objects of a varying prototype or class from some method call, which is assumed to be "new".

### Implementation

### Example

ImageReaderFactory has a getReader function that instantiate and return a ImageReader object according to the given
image

```kotlin
sealed interface ImageReader {

    fun read(image: Image): Array<ByteArray>

}

class JPEGImageReader : ImageReader {
    override fun read(image: Image): Array<ByteArray> {
        //Implementation to read jpg image
        println("Reading JPG image")
        return arrayOf(byteArrayOf(0))
    }
}

class PNGImageReader : ImageReader {
    override fun read(image: Image): Array<ByteArray> {
        //Some implementation to read png image
        println("Reading PNG image")
        return arrayOf(byteArrayOf(0))
    }
}

class SVGImageReader : ImageReader {
    override fun read(image: Image): Array<ByteArray> {
        //Some implementation to read svg image
        println("Reading SVG image")
        return arrayOf(byteArrayOf(0))
    }
}

class EmptyImageReader : ImageReader {
    override fun read(image: Image): Array<ByteArray> {
        println("Reading empty image")
        return arrayOf(byteArrayOf(0))
    }
}
```

```kotlin
enum class ImageType {
    JPEG,
    PNG,
    SVG,
}
```

```kotlin
class Image(val width: Int, val height: Int, val type: ImageType)
```

```kotlin
object ImageReaderFactory {
    fun getReader(image: Image): ImageReader {
        if (image.width == 0 && image.height == 0)
            return EmptyImageReader()
        return when (image.type) {
            ImageType.JPEG -> JPEGImageReader()
            ImageType.PNG -> PNGImageReader()
            ImageType.SVG -> SVGImageReader()
        }
    }
}
```

Main Function

```kotlin
fun main() {
    val pngImage = Image(250, 150, ImageType.PNG)
    ImageReaderFactory.getReader(pngImage).read(pngImage)
    val jpegImage = Image(750, 550, ImageType.JPEG)
    ImageReaderFactory.getReader(jpegImage).read(jpegImage)
    val svgImage = Image(0, 0, ImageType.SVG)
    ImageReaderFactory.getReader(svgImage).read(svgImage)
}
```

Program output

```
Reading PNG image
Reading JPG image
Reading empty image
```

### Real World Examples

- java.text.NumberFormat#getInstance()
- java.nio.charset.Charset#forName()
