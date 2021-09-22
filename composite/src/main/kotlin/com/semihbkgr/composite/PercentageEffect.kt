package com.semihbkgr.composite

class PercentageEffect(private val name: String, val percentage: Float, val add: Boolean) : Effect {

    init {
        if (percentage < 0 && percentage > 1.0f)
            throw IllegalArgumentException()
    }

    override fun getName(): String = name

    override fun getValue(value: Int): Int {
        if (add)
            return value + ((value * percentage).toInt())
        return value - ((value * percentage).toInt())
    }

}