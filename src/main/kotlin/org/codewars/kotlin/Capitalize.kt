package org.codewars.kotlin

fun capitalize(text: String): List<String> {
    return listOf(capitalizeOdd(text), capitalizeEven(text))
}

fun capitalizeOdd(text: String) : String{
    var result = ""
    var position = 0
    while (position< text.length)
    {
        if (position.rem(2) == 0)
        {
            result = result.plus(text[position].toUpperCase())
        }
        else
        {
            result = result.plus(text[position])
        }
        position = position+1
    }
    return result
}

fun capitalizeEven(text: String) : String{
    var result = ""
    var position = 0
    while (position< text.length)
    {
        if (position.rem(2) != 0)
        {
            result = result.plus(text[position].toUpperCase())
        }
        else
        {
            result = result.plus(text[position])
        }
        position += 1
    }
    return result
}
