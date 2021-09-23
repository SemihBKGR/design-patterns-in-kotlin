package com.semihbkgr.proxy

fun main() {

    val connection = ConnectionImpl()
    val connectionProxy = ConnectionProxy(connection, 1)
    connectionProxy.connect()
    connectionProxy.connect()

}
