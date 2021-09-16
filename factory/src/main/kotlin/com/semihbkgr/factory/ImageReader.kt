package com.semihbkgr.factory

sealed interface ImageReader {

    fun read (image:Image): Array<ByteArray>

}

class JPEGImageReader: ImageReader{
    override fun read(image:Image): Array<ByteArray> {
        //Implementation to read jpg image
        println("Reading JPG image")
        return arrayOf(byteArrayOf(0))
    }
}

class PNGImageReader: ImageReader{
    override fun read(image:Image): Array<ByteArray> {
        //Some implementation to read png image
        println("Reading PNG image")
        return arrayOf(byteArrayOf(0))
    }
}

class SVGImageReader: ImageReader{
    override fun read(image:Image): Array<ByteArray> {
        //Some implementation to read svg image
        println("Reading SVG image")
        return arrayOf(byteArrayOf(0))
    }
}

class EmptyImageReader: ImageReader{
    override fun read(image:Image): Array<ByteArray> {
        println("Reading empty image")
        return arrayOf(byteArrayOf(0))
    }
}
