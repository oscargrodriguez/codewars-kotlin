package org.codewars.kotlin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IncludeInArrTest {

    @Test
    fun `non included number in array`() {
        assertEquals(include(listOf(1, 2, 3).toIntArray(), 4), false)
    }

    @Test
    fun `included number in array`() {
        assertEquals(include(listOf(1, 2, 3).toIntArray(), 3), true)
    }
}
