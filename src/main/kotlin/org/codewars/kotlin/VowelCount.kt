package org.codewars.kotlin

fun getCount(str: String): Int = str.count { it in "aeiou" }
