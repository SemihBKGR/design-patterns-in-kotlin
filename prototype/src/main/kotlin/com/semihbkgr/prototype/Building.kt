package com.semihbkgr.prototype

abstract class Building(var x: Int, var y: Int, var color: String) {

    constructor(building: Building) : this(building.x, building.y, building.color)

    abstract fun clone(): Building

    override fun toString(): String = "x: $x, y: $y, color: $color"

}

