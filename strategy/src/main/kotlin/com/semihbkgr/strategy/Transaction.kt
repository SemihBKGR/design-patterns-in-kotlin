package com.semihbkgr.strategy

data class Transaction(val username:String,val description:String) {

    val timeMS:Long=System.currentTimeMillis()

}