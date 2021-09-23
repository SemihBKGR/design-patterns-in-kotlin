package com.semihbkgr.facade

class HostnameResolver {

    fun fetchIpAddress(hostname: String): String {
        println("Fetching ip address")
        return "127.0.0.1"
    }

}