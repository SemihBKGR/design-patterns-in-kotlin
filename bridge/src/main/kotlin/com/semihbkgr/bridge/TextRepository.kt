package com.semihbkgr.bridge

interface TextRepository {

    fun save(name: String, text: String)

    fun delete(name: String)

}