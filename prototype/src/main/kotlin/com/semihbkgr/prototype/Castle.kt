package com.semihbkgr.prototype

class Castle(x:Int,y:Int,color:String,var height:Float):Building(x,y,color) {

    constructor(tower:Castle):this(tower.x,tower.y,tower.color,tower.height)

    override fun clone(): Castle= Castle(this)

    override fun toString(): String = super.toString()+" height: $height"

}