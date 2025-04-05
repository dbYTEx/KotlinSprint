package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val enteredValue: Int = 70_000

    val depozitSize = enteredValue * (1 + 16.7 / 100).pow(20)
    println(String.format("%.3f", depozitSize))
}