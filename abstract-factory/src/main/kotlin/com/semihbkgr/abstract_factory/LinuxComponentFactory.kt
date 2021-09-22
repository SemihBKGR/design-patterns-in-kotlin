package com.semihbkgr.abstract_factory

class LinuxComponentFactory : GUIComponentFactory {

    override fun createButton(): Button = LinuxButton()

    override fun createPanel(): Label = LinuxLabel()

}