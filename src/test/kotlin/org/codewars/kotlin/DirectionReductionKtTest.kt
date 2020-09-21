package org.codewars.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class DirectionReductionKtTest {

    private fun assertEqualDirections(arr: Array<String>, expect: Array<String>) {
        val actual: Array<String> = dirReduc(arr)
        assertEquals(expect.contentDeepToString(), actual.contentDeepToString())
    }

    @Test
    fun `emptyDirections`() {
        assertEqualDirections(arrayOf(""), arrayOf(""))
    }

    @Test
    fun `oneDirection`() {
        assertEqualDirections(arrayOf("North"), arrayOf("North"))
    }

    @Test
    fun `twoOppositeDirections`() {
        assertEqualDirections(arrayOf("North", "South"), arrayOf(""))
        assertEqualDirections(arrayOf("north", "south"), arrayOf(""))
        assertEqualDirections(arrayOf("South", "North"), arrayOf(""))
        assertEqualDirections(arrayOf("East", "West"), arrayOf(""))
        assertEqualDirections(arrayOf("West", "East"), arrayOf(""))
    }

    @Test
    fun `twoValidDirections`() {
        assertEqualDirections(arrayOf("North", "East"), arrayOf("North", "East"))
        assertEqualDirections(arrayOf("East", "East"), arrayOf("East", "East"))
        assertEqualDirections(arrayOf("East", "North"), arrayOf("East", "North"))
    }

    @Test
    fun `integration`() {
        assertEqualDirections(
            arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"),
            arrayOf("WEST")
        )
        assertEqualDirections(
            arrayOf("NORTH", "WEST", "SOUTH", "EAST"),
            arrayOf("NORTH", "WEST", "SOUTH", "EAST")
        )
        assertEqualDirections(
            arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH"),
            arrayOf("NORTH")
        )
        assertEqualDirections(
            arrayOf(
                "NORTH",
                "EAST",
                "NORTH",
                "EAST",
                "WEST",
                "WEST",
                "EAST",
                "EAST",
                "WEST",
                "SOUTH"
            ), arrayOf("NORTH", "EAST")
        )
    }
}
