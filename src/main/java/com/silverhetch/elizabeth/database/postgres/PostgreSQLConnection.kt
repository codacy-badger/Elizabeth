package com.silverhetch.elizabeth.database.postgres

import com.silverhetch.elizabeth.arch.Factory
import java.sql.Connection
import java.sql.DriverManager
import java.util.*

class PostgreSQLConnection(private val config: Config) : Factory<Connection> {
    override fun instance(): Connection{
        val url = "jdbc:postgresql://${config.host()}/${config.database()}"
        val properties = Properties()
        properties.setProperty("user", config.username())
        properties.setProperty("password", config.password())
        properties.setProperty("ssl", "false")
        return DriverManager.getConnection(url, properties)
    }
}