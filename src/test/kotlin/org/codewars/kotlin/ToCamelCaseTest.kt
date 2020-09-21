package org.codewars.kotlin

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class ToCamelCaseTest{

    @Test
    fun empty() {
        assertEquals("", toCamelCase(""))
    }

    @Test
    fun startWithLowerCase() {
        assertEquals("theStealthWarrior", toCamelCase("the_stealth_warrior"))
        assertEquals("theStealthWarrior", toCamelCase("the_stealth__warrior"))

    }

    @Test
    fun startWithUpperCase() {
        assertEquals("TheStealthWarrior", toCamelCase("The-Stealth-Warrior"))
        assertEquals("ABC", toCamelCase("A-B-C"))
    }
}
