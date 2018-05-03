package com.silverhetch.elizabeth.database.sqlite

import com.silverhetch.elizabeth.arch.Factory
import java.sql.Connection
import java.sql.DriverManager

class SQLiteFactory(private val dbName: String = "db") : Factory<Connection> {
    override fun instance(): Connection {
        try {
            return DriverManager.getConnection("jdbc:sqlite:$dbName.db")
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}