package org.codewars.kotlin

fun wave(str: String) = str.indices.map { str.take(it) + str.drop(it).capitalize() }.filter { it != str }

/*
fun wave(str: String): List<String> {
    var result: List<String> = listOf()
    var prefix = ""
    str.forEach {
        result = result + compose(prefix, it, str)
        prefix = prefix + it
    }
    return result.filter { !it.equals("") }
}


fun compose(prefix: String, character: Char, str: String): String {
    if (character.isLetter()) {
        return prefix + str.removePrefix(prefix).capitalize()
    }
    return ""
}
*/
