package org.example.lesson_3

fun main() {
    val name: String = "Татьяна"
    var surname: String = "Андреева"
    val patronymic: String = "Сергеевна"
    var age: Int = 20

    println("$surname $name $patronymic, $age")

    age += 2
    surname = "Сидорова"
    println("$surname $name $patronymic, $age")
}