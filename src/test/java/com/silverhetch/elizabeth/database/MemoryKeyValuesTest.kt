package com.silverhetch.elizabeth.database

import org.junit.Assert
import org.junit.Test

class MemoryKeyValuesTest {

    @Test
    fun create() {
        val keyValues = MemoryKeyValues()
        keyValues.save("key", "values")
        Assert.assertEquals("values", keyValues.value("key"))
    }

}