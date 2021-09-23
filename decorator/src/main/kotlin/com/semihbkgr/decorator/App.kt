package com.semihbkgr.decorator

fun main() {

    val circle=Circle()
    circle.draw()
    val blueCircle=ColoredShape("blue",circle)
    blueCircle.draw()

}
