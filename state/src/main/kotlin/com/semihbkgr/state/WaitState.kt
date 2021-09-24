package com.semihbkgr.state

class WaitState : HeroState {

    override fun apply(hero: Hero) {

    }

    override fun onEnterStatus() {
        println("Hero is waiting")
    }

}