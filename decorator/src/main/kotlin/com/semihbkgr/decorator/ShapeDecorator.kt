package com.semihbkgr.decorator

open class ShapeDecorator(protected val shape: Shape):Shape {

    override fun draw() {
        shape.draw()
    }

}