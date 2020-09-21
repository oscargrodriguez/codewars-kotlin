package org.codewars.kotlin

/*fun solution(number: Int): Int =
    (1..number-1).filter { (it % 3  == 0 || it % 5 == 0)}.fold(0) { sum, element -> sum + element }
*/

fun solution(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()

