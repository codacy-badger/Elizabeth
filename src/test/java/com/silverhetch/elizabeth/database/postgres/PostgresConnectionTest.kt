package com.silverhetch.elizabeth.database.postgres

import com.silverhetch.elizabeth.configs.ElizabethConfig
import org.junit.Assert
import org.junit.Test

class PostgresConnectionTest {
    @Test
    fun connection() {
        PostgresConnection(ElizabethConfig()).instance().use { conn ->
            Assert.assertTrue(conn.isValid(10))
        }
    }
}