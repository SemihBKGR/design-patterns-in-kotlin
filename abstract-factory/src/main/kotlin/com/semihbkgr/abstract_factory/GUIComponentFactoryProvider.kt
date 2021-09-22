package com.semihbkgr.abstract_factory

object GUIComponentFactoryProvider {

    fun getGUIComponentFactory():GUIComponentFactory{
        return if(System.getProperty("os.name").lowercase().contains("windows")) WindowsComponentFactory()
        else LinuxComponentFactory()
    }

}