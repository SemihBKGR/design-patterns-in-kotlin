package com.semihbkgr.prototype

fun main(args: Array<String>) {

    var castle = Castle(250, 170, "blue", 197.5f)
    println(castle)
    var anotherCastle = castle.clone()
    anotherCastle.x = 210
    anotherCastle.color = "green"
    println(anotherCastle)

    var tower = Tower(130, 510, "black", 100)
    println(tower)
    var anotherTower = tower.clone()
    anotherCastle.x = 270
    anotherTower.capacity = 150
    println(anotherTower)

}
