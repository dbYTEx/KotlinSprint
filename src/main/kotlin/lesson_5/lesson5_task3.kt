package org.example.lesson_5

const val WIN_NUMBER_1: Int = 7
const val WIN_NUMBER_2: Int = 31

fun main() {
    println(
        """
        |Угадай два числа от 0 до 42 и получи приз!
        |Даже за одно отгаданное число ты получишь приз!
        |
        """.trimMargin()
    )

    println("Введите первое число от 0 до 42.")
    val firstTry: Int = readln().toInt()
    val firstTryValid: Boolean = (firstTry == WIN_NUMBER_1) || (firstTry == WIN_NUMBER_2)
    println("Введите второе число от 0 до 42.")
    val secondTry: Int = readln().toInt()
    val secondTryValid: Boolean = (secondTry == WIN_NUMBER_1) || (secondTry == WIN_NUMBER_2)

    if (firstTryValid && secondTryValid) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstTryValid || secondTryValid) {
        println("Вы выиграли утешительный приз!")
        println("Нужные числа для победы: $WIN_NUMBER_1 и $WIN_NUMBER_2")
    } else {
        println("Неудача!")
        println("Нужные числа для победы: $WIN_NUMBER_1 и $WIN_NUMBER_2")
    }
}