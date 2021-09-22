package com.semihbkgr.composite

class CompositeEffect : Effect {

    val effects: MutableList<Effect> = mutableListOf()

    fun addEffect(effect: Effect) {
        effects.add(effect)
    }

    override fun getName(): String {
        var allName = ""
        effects.forEach { allName += " ${it.getName()}" }
        return allName
    }

    override fun getValue(value: Int): Int {
        var allValue = value
        effects.forEach { allValue += it.getValue(allValue) }
        return allValue
    }

}