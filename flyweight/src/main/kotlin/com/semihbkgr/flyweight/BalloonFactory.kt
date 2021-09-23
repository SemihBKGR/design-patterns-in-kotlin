package com.semihbkgr.flyweight

import java.awt.Color

object BalloonFactory {

    private val typeMap: HashMap<String, BalloonType> = HashMap<String, BalloonType>()

    fun getBalloonType(name: String, color: Color): BalloonType {
        if (typeMap.contains(name))
            return typeMap[name]!!
        val balloonType = BalloonType(name, color)
        typeMap[name] = balloonType
        return balloonType
    }

}