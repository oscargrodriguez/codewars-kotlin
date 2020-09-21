package org.codewars.kotlin

/*
fun findMissingLetter(array: CharArray): Char {
    var position = 0
    while (isContinuous(array, position)) position += 1
    return array[position].plus(1)
}

fun isContinuous (array: CharArray, position : Int) =
    array[position+1].toByte().minus(array[position].toByte()).equals(1)
*/

fun findMissingLetter(array: CharArray) = (array.first()..array.last()).first { it !in array }
