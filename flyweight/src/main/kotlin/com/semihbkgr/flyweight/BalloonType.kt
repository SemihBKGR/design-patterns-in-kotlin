package com.semihbkgr.flyweight

import java.awt.Color

data class BalloonType(val name:String,val color: Color){

    init{
        println("New balloon type initialized, name:$name")
    }

}
