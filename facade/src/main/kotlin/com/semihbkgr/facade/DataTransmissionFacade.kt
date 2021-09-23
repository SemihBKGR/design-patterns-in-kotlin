package com.semihbkgr.facade

class DataTransmissionFacade {

    private val hostnameResolver=HostnameResolver()
    private val dataEncoder=DataEncoder()
    private val networkConnection=NetworkConnection()

    fun sendData(hostname:String,data:ByteArray){
        val ip=hostnameResolver.fetchIpAddress(hostname)
        val encodedData=dataEncoder.encode(data)
        val connection=networkConnection.connect(ip)
        connection.send(encodedData)
        connection.disconnect()
    }

}
