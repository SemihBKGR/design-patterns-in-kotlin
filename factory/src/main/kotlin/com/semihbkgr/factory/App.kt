package com.semihbkgr.factory


fun main() {

    var pngImage = Image(250, 150, ImageType.PNG)
    ImageReaderFactory.getReader(pngImage).read(pngImage)

    var jpegImage = Image(750, 550, ImageType.JPEG)
    ImageReaderFactory.getReader(jpegImage).read(jpegImage)

    var svgImage = Image(0, 0, ImageType.SVG)
    ImageReaderFactory.getReader(svgImage).read(svgImage)

}
