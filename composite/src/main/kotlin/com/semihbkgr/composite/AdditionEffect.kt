package com.semihbkgr.composite

class AdditionEffect(private val name: String, private val addition: Int) : Effect {

    override fun getName(): String = name

    override fun getValue(value: Int): Int {
        return value + addition
    }

}