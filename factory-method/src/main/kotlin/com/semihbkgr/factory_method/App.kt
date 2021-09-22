package com.semihbkgr.factory_method

fun main() {

    var foundry: Foundry = CorpusFoundry()
    println(foundry)
    var weapon = foundry.manufactureWeapon(Blueprint.RIFLE)
    println(weapon)

    foundry = GrineerFoundry()
    println(foundry)
    weapon = foundry.manufactureWeapon(Blueprint.PISTOL)
    println(weapon)

}
