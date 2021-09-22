package com.semihbkgr.abstract_factory

interface GUIComponentFactory {

    fun createButton():Button

    fun createPanel():Label

}