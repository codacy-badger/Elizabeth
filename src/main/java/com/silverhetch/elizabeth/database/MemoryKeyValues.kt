package com.silverhetch.elizabeth.database

class MemoryKeyValues : KeyValues {
    private val memory: MutableMap<String, String> = HashMap()

    override fun save(key: String, value: String) {
        memory[key] = value
    }

    override fun value(key: String): String {
        return memory[key]!!
    }
}