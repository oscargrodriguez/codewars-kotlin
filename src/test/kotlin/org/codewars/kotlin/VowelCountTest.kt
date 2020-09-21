package org.codewars.kotlin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VowelCountTest {

    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}
