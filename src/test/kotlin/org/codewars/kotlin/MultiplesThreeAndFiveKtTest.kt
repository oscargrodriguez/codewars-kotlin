package org.codewars.kotlin

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class MultiplesThreeAndFiveKtTest {

    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}
