package org.example.lesson_5

const val USER_NAME: String = "Zaphod"
const val USER_PASSWORD: String = "PanGalactic"

fun main() {
    println(
        """
        |Добро пожаловать на Космический корабль "Heart of Gold"
        |Введите, пожалуйста, свое имя пользователя:
        """.trimMargin()
    )

    val authName: String = readln()

    if (authName == USER_NAME) {
        println("Приветствую тебя, $authName! Введи свой пароль доступа.")
        val authPassword: String = readln()
        if (authPassword == USER_PASSWORD) {
            println("Ваши данные проверены, и о, чудо, они верны... ")
        } else {
            println("Вы меня обманули! Вы лишь хотели показаться $authName. Либо вспоминайте пароль!")
        }
    } else {
        println("Пользователь с таким имененем не найден! Пройдите, пожалуйста, регистрацию.")
    }
}