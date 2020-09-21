package org.codewars.kotlin

fun find(integers: Array<Int>): Int {
    val firstEven = integers.first(Int::isEven)
    if (firstEven == integers.last(Int::isEven)) {
        return firstEven
    }
    return integers.first(Int::isOdd)
}

fun Int.isEven() = this % 2 == 0
fun Int.isOdd() = this % 2 != 0
