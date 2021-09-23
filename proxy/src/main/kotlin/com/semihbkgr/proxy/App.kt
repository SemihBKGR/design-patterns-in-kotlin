package com.semihbkgr.proxy

fun main() {

    var connection=ConnectionImpl()
    var connectionProxy=ConnectionProxy(connection,1)
    connectionProxy.connect()
    connectionProxy.connect()

}
