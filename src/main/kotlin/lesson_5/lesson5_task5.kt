package org.example.lesson_5

import kotlin.random.Random

const val MIN_NUMBER: Int = 0
const val MAX_NUMBER: Int = 42
const val NUMBER_AMOUNT: Int = 3

fun main() {
    println("Угадай число и получи приз!")
    val randomNumbers = List(NUMBER_AMOUNT) { Random.nextInt(MIN_NUMBER, MAX_NUMBER) }

    println("Введите первое число от $MIN_NUMBER до $MAX_NUMBER:")
    val userFirstAnswer: Int = readln().toInt()
    println("Введите второе число от $MIN_NUMBER до $MAX_NUMBER:")
    val userSecondAnswer: Int = readln().toInt()
    println("Введите третье число от $MIN_NUMBER до $MAX_NUMBER:")
    val userThirdAnswer: Int = readln().toInt()
    val userAnswersList = listOf(userFirstAnswer, userSecondAnswer, userThirdAnswer)
    val matchNumbers = randomNumbers intersect userAnswersList

    when (matchNumbers.size) {
        3 -> println("Вы угадали все числа и выйграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа.")
    }
    println("Выйгрышные числа: $randomNumbers")
}