package org.example.lesson_5

const val CURRENT_YEAR: Int = 2025
const val AGE_OF_MAJORITY: Int = 18

fun main() {
    println("В каком году Вы родились?")

    val userYearOfBirth: Int = readln().toInt()

    if (CURRENT_YEAR - userYearOfBirth >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}