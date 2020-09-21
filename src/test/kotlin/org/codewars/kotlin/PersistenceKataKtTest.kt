package org.codewars.kotlin

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class PersistenceKataKtTest {

    @Test
    fun `Basic Tests`() {
        assertEquals(0, persistence(4))
        assertEquals(3, persistence(39))
        assertEquals(2, persistence(25))
        assertEquals(4, persistence(999))
    }
}
