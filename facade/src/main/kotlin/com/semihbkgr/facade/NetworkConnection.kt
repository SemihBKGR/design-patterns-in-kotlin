package com.semihbkgr.facade

class NetworkConnection {

    fun connect(ip: String): Connection {
        println("Connection to $ip")
        return Connection(ip)
    }

    class Connection(private val ip: String) {

        fun send(data: ByteArray) {
            println("Data is sending")
        }

        fun disconnect() {
            println("Disconnecting")
        }

    }

}