package com.semihbkgr.state

interface HeroState {

    fun apply(hero: Hero)

    fun onEnterStatus()

}