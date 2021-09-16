package com.semihbkgr.factory

object ImageReaderFactory {

    fun getReader(image:Image): ImageReader{
        if(image.width == 0  && image.height == 0 )
            return EmptyImageReader()
        return when(image.type){
            ImageType.JPEG -> JPEGImageReader()
            ImageType.PNG -> PNGImageReader()
            ImageType.SVG -> SVGImageReader()
        }
    }

}