package com.semihbkgr.abstract_factory

fun main() {

    val componentFactory=GUIComponentFactoryProvider.getGUIComponentFactory()
    val button=componentFactory.createButton()
    button.render()
    val label=componentFactory.createPanel()
    label.draw()

}
