package org.codewars.kotlin


fun toCamelCase(str: String): String =
    str.split("-", "_").mapIndexed { i, s -> if (i == 0) s else s.capitalize() }.joinToString("")
/*
fun toCamelCase(str:String):String
{
    var result = ""
    var capitalizeNeeded = false
    for (c in str)
    {
        if (capitalizeNeeded && c.isLetter())
        {
            result = result + c.toUpperCase()
            capitalizeNeeded = false
        }
        else {
            if (!c.isLetter()) {
                capitalizeNeeded = true
            } else {
                capitalizeNeeded = false
                result = result + c
            }
        }
    }
    return result
}
*/
