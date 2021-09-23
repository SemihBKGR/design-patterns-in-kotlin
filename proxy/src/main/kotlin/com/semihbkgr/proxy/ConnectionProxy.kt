package com.semihbkgr.proxy

class ConnectionProxy(val connection: Connection, val limit: Int) : Connection {

    var connectionCount: Int = 0

    override fun connect() {
        if (connectionCount < limit) {
            connectionCount++
            println("Proxy, connectionCount: $connectionCount")
            connection.connect()
        } else
            println("Proxy, Connection limit exceeded")
    }

}