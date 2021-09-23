package com.semihbkgr.flyweight

class Balloon(val type: BalloonType, val x: Int, val y: Int) {

    fun draw() {
        println("Balloon, name: ${type.name}, colorRGB: ${type.color.rgb}, position: $x,$y")
    }

}