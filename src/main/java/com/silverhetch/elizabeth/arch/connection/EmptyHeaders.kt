package com.silverhetch.elizabeth.arch.connection

class EmptyHeaders : Headers {
    override fun values(): Map<String, String> {
        return HashMap()
    }
}