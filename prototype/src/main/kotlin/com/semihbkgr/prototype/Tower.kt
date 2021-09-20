package com.semihbkgr.prototype

class Tower(x: Int, y: Int, color: String, var capacity: Int) : Building(x, y, color) {

    constructor(tower: Tower) : this(tower.x, tower.y, tower.color, tower.capacity)

    override fun clone(): Tower = Tower(this)

    override fun toString(): String = "Tower: " + super.toString() + " capacity: $capacity"

}