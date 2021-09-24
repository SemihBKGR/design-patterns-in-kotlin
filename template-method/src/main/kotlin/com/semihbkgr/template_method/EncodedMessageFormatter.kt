package com.semihbkgr.template_method

import java.nio.charset.Charset
import java.util.*

class EncodedMessageFormatter : MessageFormatter() {

    val decoder = Base64.getDecoder()

    override fun decode(data: ByteArray): ByteArray = decoder.decode(data)

    override fun decodeToString(data: ByteArray): String = String(data, Charset.forName("UTF-8"))

    override fun modifyString(str: String): String = "Message: [$str]"

}