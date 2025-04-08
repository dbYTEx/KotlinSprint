package org.example.lesson_5

fun main() {
    val captchaTask: Int = 5 + 19

    println("Для доступа в приложение требуется решить каптчу.\nСколько будет 5 + 19?")

    val userSolution: Int = readln().toInt()

    if (captchaTask == userSolution) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}