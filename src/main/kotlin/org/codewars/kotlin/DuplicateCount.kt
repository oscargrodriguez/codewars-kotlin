package org.codewars.kotlin

fun duplicateCount(text: String) = text.groupBy(Char::toLowerCase).count { it.value.count() > 1 }

/*
fun duplicateCount(text: String): Int {
    var strWithDuplicates = ""
    text.toList().mapIndexed { index, c ->
        if (text.lastIndexOf(c,ignoreCase=true) > index) {
            if (!strWithDuplicates.contains(c,true)) {
                strWithDuplicates = strWithDuplicates + c
            }
        }
    }
    return strWithDuplicates.length
}
*/
