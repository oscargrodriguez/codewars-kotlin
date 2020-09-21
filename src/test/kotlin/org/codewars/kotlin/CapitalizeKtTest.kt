package org.codewars.kotlin

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class CapitalizeKtTest {

    @Test
    fun basicTests() {
        assertEquals(listOf("AbCdEf", "aBcDeF"), capitalize("abcdef"))
        assertEquals(listOf("CoDeWaRs", "cOdEwArS"), capitalize("codewars"))
        assertEquals(listOf("AbRaCaDaBrA", "aBrAcAdAbRa"), capitalize("abracadabra"))
        assertEquals(listOf("CoDeWaRrIoRs", "cOdEwArRiOrS"), capitalize("codewarriors"))
    }
}
