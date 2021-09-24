package com.semihbkgr.state

fun main() {

    val hero=Hero(100)
    hero.setState(FightState())
    hero.action()
    hero.printHeroInfo()
    hero.setState(RestState())
    hero.action()
    hero.action()
    hero.printHeroInfo()

}
