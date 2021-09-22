package com.semihbkgr.abstract_factory

class WindowsComponentFactory : GUIComponentFactory {

    override fun createButton(): Button = WindowsButton()

    override fun createPanel(): Label = WindowsLabel()

}