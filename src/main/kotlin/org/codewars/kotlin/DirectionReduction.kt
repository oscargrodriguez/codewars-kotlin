package org.codewars.kotlin

fun dirReduc(arr: Array<String>): Array<String> {
    var directions = arr.toList()
    directions.mapIndexed { i, direction ->
        if (oppositeNext(directions, i)) {
            return dirReduc(removeOpposites(directions, i))
        }
    }
    return arr
}

private fun removeOpposites(directions: List<String>, i: Int): Array<String> {
    var previousDirections = directions.subList(0, i).toTypedArray()
    var afterDirections = directions.subList(i + 2, directions.size).toTypedArray()
    return previousDirections.plus(afterDirections)
}

fun oppositeNext(directions: List<String>, index: Int): Boolean =
    directions.size > index + 1 && isOpposite(directions.get(index).toLowerCase(), directions.get(index + 1).toLowerCase())

fun isOpposite(firstDirection: String, secondDirection: String): Boolean =
    firstDirection == "north" && secondDirection == "south" ||
            firstDirection == "south" && secondDirection == "north" ||
            firstDirection == "west" && secondDirection == "east" ||
            firstDirection == "east" && secondDirection == "west"
