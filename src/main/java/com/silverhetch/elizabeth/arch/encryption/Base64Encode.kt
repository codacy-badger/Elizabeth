package com.silverhetch.elizabeth.arch.encryption

import com.silverhetch.elizabeth.arch.Pipeline
import java.util.*

class Base64Encode(private val data: Pipeline<ByteArray>) : Pipeline<String> {
    override fun compute(): String {
        return Base64.getEncoder().encodeToString(data.compute())
    }
}