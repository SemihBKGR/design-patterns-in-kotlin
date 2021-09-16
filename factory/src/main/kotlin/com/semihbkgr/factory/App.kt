package com.semihbkgr.factory

fun main() {

    val pngImage = Image(250, 150, ImageType.PNG)
    ImageReaderFactory.getReader(pngImage).read(pngImage)
    val jpegImage = Image(750, 550, ImageType.JPEG)
    ImageReaderFactory.getReader(jpegImage).read(jpegImage)
    val svgImage = Image(0, 0, ImageType.SVG)
    ImageReaderFactory.getReader(svgImage).read(svgImage)

}
