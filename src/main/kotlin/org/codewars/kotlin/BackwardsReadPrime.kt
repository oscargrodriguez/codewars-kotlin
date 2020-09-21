package org.codewars.kotlin

fun backwardsPrime(start: Long, end: Long): String {
    return (start .. end)
        .filter(Long::isPrime)
        .map ( Long::reversed )
        .filter(Long::isOdd)
        .filter(Long::isPrime)
        .filter(Long::isNonPalindrome)
        .map ( Long::reversed )
        .joinToString(" ")
}

fun Long.isNonPalindrome(): Boolean = this.toString().reversed() != this.toString()

fun Long.isPrime(): Boolean = (2L..this).asSequence().first { this.rem(it) == 0L } == this

fun Long.reversed(): Long = this.toString().reversed().toLong()

fun Long.isOdd() = this.rem(2L) != 0L
