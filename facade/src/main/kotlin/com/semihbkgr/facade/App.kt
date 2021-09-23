package com.semihbkgr.facade

fun main() {

    val dataTransmissionFacade = DataTransmissionFacade()
    dataTransmissionFacade.sendData("localhost", ByteArray(64))

}