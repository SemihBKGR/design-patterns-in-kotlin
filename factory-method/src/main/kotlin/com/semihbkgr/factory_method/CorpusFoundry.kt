package com.semihbkgr.factory_method

class CorpusFoundry : Foundry {

    override fun manufactureWeapon(blueprint: Blueprint) = CorpusWeapon(blueprint)

    override fun toString() = "Corpus foundry"

}