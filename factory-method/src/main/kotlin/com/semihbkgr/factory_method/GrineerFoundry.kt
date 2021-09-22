package com.semihbkgr.factory_method

class GrineerFoundry : Foundry {

    override fun manufactureWeapon(blueprint: Blueprint) = GrineerWeapon(blueprint)

    override fun toString() = "Grineer foundry"

}