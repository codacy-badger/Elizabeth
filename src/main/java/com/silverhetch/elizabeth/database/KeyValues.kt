package com.silverhetch.elizabeth.database

interface KeyValues {
    fun save(key: String, value: String)
    fun value(key: String): String
}