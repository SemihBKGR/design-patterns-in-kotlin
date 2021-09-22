package com.semihbkgr.composite

class Hero(var damage: Int, var speed: Int) {

    fun applyDamageEffect(effect: Effect) {
        val value = effect.getValue(damage)
        println("Applying damage effect, name: ${effect.getName()}, value: $value")
        damage += value
    }

    fun applySpeedEffect(effect: Effect) {
        val value = effect.getValue(speed)
        println("Applying speed effect, name: ${effect.getName()}, value: $value")
        speed += value
    }

    override fun toString(): String = "Hero(damage=$damage, speed=$speed)"

}