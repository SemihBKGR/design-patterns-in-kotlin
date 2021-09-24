package com.semihbkgr.state

class RestState : HeroState {

    override fun apply(hero: Hero) {
        hero.health += 5;
    }

    override fun onEnterStatus() {
        println("Hero is resting")
    }

}