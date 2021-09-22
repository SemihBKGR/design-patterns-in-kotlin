package com.semihbkgr.composite

fun main() {

    val hero = Hero(100, 75)
    println(hero)
    val grimEffect = AdditionEffect("Grim", 70)
    hero.applyDamageEffect(grimEffect)
    println(hero)
    val cruelEffect = PercentageEffect("Cruel", 0.25f, true)
    val compositeEffect = CompositeEffect()
    compositeEffect.addEffect(cruelEffect)
    compositeEffect.addEffect(grimEffect)
    hero.applyDamageEffect(compositeEffect)
    println(hero)

}
