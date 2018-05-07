package com.silverhetch.elizabeth.database.postgres

interface Config {
    fun host(): String
    fun username(): String
    fun password(): String
    fun database(): String
}