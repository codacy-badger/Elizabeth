package com.silverhetch.elizabeth.database.postgres

import com.silverhetch.elizabeth.configs.ElizabethConfig
import org.junit.Assert
import org.junit.Test

class PostgresConnectionTest {
    @Test
    fun connection() {
        PostgreSQLConnection(ElizabethConfig()).instance().use { conn ->
            conn.createStatement().executeQuery("SELECT * from testing;").use{result ->
                Assert.assertEquals(0,result.fetchSize)
            }
        }
    }
}