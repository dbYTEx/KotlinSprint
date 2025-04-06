package org.example.lesson_3

fun main() {
    val moveInfo: String = "D2-D4;0"

    val separateMoveInfo = moveInfo.split("-", ";").toTypedArray()

    val moveFrom: String = separateMoveInfo[0]
    val moveTo: String = separateMoveInfo[1]
    val moveNumber: Int = separateMoveInfo[2].toInt()

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}