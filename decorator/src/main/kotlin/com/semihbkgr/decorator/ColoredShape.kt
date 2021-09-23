package com.semihbkgr.decorator

class ColoredShape(val color:String,shape:Shape):ShapeDecorator(shape) {

    override fun draw() {
        super.draw()
        fillColor()
    }

    fun fillColor(){
        println("Shape filled by '$color' color")
    }

}