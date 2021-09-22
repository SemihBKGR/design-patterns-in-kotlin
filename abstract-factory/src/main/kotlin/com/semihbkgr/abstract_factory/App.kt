package com.semihbkgr.abstract_factory

fun main() {

    val componentFactory=GUIComponentFactoryProvider.getGUIComponentFactory()
    val button=componentFactory.createButton()
    button.render()
    val panel=componentFactory.createPanel()
    panel.draw()

}
