package com.semihbkgr.observer

import java.lang.IllegalArgumentException

class Discount {

    val percentage : Float
    val hour: UInt

    constructor(percentage: Float,hour:UInt){
        this.percentage=percentage
        this.hour=hour
    }

}