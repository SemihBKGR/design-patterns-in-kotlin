package com.semihbkgr.decorator

import java.util.*

fun main() {

    val circle = Circle()
    circle.draw()
    val blueCircle = ColoredShape("blue", circle)
    blueCircle.draw()

}
