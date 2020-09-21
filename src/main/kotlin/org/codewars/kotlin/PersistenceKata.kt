package org.codewars.kotlin

fun persistence(num: Int): Int {
    var numTemp = num
    var numExecutions = 0
    while (greaterThan10(numTemp)) {
        numExecutions++
        numTemp = multiply(split(numTemp))
    }
    return numExecutions
}

fun split(num: Int): List<Int> {
    var result: List<Int> = listOf()
    var numTemp = num
    while (greaterThan10(numTemp)) {
        result = result.plus(rem10(numTemp))
        numTemp = div10(numTemp)
    }
    return result.plus(numTemp)
}

fun greaterThan10(num: Int) = num >= 10

fun multiply(digits: List<Int>) =
    digits.fold(1) { multiply, element -> multiply * element }

fun rem10(num: Int) = num.rem(10)

fun div10(num: Int) = num.div(10)
