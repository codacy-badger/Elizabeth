package com.silverhetch.elizabeth.bus.government

import com.silverhetch.elizabeth.arch.Pipeline
import com.silverhetch.elizabeth.arch.Source

class AuthString(private val config: Config, private val signature: Pipeline<String>) : Source<String> {
    override fun fetch(): String {
        return "hmac username=\"${config.appId()}\", algorithm=\"hmac-sha1\", headers=\"x-date\", signature=\"${signature.compute()}\""
    }
}