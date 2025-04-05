package org.example.lesson_3

fun main() {
    var moveNumber: Int = 1
    var moveFrom: String = "E2"
    var moveTo: String = "E4"

    println("$moveFrom-$moveTo;$moveNumber")

    moveNumber++
    moveFrom = "D2"
    moveTo = "D3"

    println("$moveFrom-$moveTo;$moveNumber")
}