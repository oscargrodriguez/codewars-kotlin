package org.codewars.kotlin

fun main(args: Array<String>) {
    listOf("a", "aa", "aaa").map(lenAndThenTriple).forEach { println("$it") }
}

fun triple(i: Int) = i * 3

fun len(s: String) = s.length

val lenAndThenTriple = ::len.andThen(::triple)

fun <A, B, C> ((A) -> B).andThen(g: (B) -> C): (A) -> C = {t1 -> g(this(t1))}

