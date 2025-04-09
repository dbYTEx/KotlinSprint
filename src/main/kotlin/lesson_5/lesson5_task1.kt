package org.example.lesson_5

const val CAPTCHA_NUM_1: Int = 5
const val CAPTCHA_NUM_2: Int = 19
const val CAPTCHA_TASK: Int = CAPTCHA_NUM_1 + CAPTCHA_NUM_2

fun main() {
    println("Для доступа в приложение требуется решить каптчу.\nСколько будет $CAPTCHA_NUM_1 + $CAPTCHA_NUM_2?")

    val userSolution: Int = readln().toInt()

    if (CAPTCHA_TASK == userSolution) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}