package com.semihbkgr.state

class Hero(var health: Int) {

    private var state: HeroState = RestState()

    fun action() {
        state.apply(this)
    }

    fun setState(state: HeroState) {
        this.state = state
        state.onEnterStatus()
    }

    fun printHeroInfo() {
        println("Hero state: ${state.javaClass.simpleName}, health: $health")
    }

}