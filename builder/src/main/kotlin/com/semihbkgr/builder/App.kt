package com.semihbkgr.builder

fun main() {

    val book = Book.Builder("9781400052998")
        .title("The Metamorphosis")
        .author("Franz Kafka")
        .page(102)
        .build()
    println(book)

}
