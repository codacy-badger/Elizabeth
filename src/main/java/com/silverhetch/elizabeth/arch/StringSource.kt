package com.silverhetch.elizabeth.arch

class StringSource(private val content: String) : Source<String> {
    override fun fetch(): String {
        return content
    }
}