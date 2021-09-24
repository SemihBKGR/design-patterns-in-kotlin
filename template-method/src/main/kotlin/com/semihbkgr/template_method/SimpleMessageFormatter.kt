package com.semihbkgr.template_method

import java.nio.charset.Charset

class SimpleMessageFormatter : MessageFormatter() {

    override fun decode(data: ByteArray): ByteArray = data

    override fun decodeToString(data: ByteArray): String = String(data, Charset.forName("UTF-8"))

    override fun modifyString(str: String): String = "Message: ($str)"

}