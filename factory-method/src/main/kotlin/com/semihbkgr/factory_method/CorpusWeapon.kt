package com.semihbkgr.factory_method

class CorpusWeapon(private val blueprint: Blueprint) : Weapon {

    override fun getWeaponBlueprint() = blueprint

    override fun toString() = "Corpus $blueprint"

}