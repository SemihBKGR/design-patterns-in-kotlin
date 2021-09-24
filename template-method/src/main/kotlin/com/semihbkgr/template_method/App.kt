package com.semihbkgr.template_method

fun main() {

    val message="La tristesse durera toujours"
    val base64EncodedMessage="TGEgdHJpc3Rlc3NlIGR1cmVyYSB0b3Vqb3Vycw=="
    val simpleMessageFormatter :MessageFormatter= SimpleMessageFormatter()
    var formattedMessageStr=simpleMessageFormatter.format(message.encodeToByteArray())
    println(formattedMessageStr)
    val encodedMessageFormatter:MessageFormatter=EncodedMessageFormatter()
    formattedMessageStr= encodedMessageFormatter.format(base64EncodedMessage.encodeToByteArray())
    println(formattedMessageStr)

}
