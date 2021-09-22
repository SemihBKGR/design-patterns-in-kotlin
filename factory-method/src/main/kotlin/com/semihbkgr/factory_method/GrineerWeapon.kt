package com.semihbkgr.factory_method

class GrineerWeapon(private val blueprint: Blueprint) : Weapon {

    override fun getWeaponBlueprint() = blueprint

    override fun toString() = "Grineer $blueprint"

}