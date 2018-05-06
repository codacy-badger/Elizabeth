package com.silverhetch.elizabeth.arch

class StaticSource(private val content: String) : Source<String> {
    override fun fetch(): String {
        return content
    }
}