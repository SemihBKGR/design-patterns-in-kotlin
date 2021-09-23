package com.semihbkgr.flyweight

import java.awt.Color

fun main() {

    for (i in 1..2) {
        val balloonType = BalloonFactory.getBalloonType("blue", Color.BLUE)
        val balloon = Balloon(balloonType, i, i)
        balloon.draw()
    }

    for (i in 1..2) {
        val balloonType = BalloonFactory.getBalloonType("green", Color.GREEN)
        val balloon = Balloon(balloonType, i, i)
        balloon.draw()
    }

}
