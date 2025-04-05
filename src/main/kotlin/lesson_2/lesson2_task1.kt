package org.example.lesson_2

fun main() {
    val firstStudent: Int = 3
    val secondStudent: Int = 4
    val thirdStudent: Int = 3
    val fourthStudent: Int = 5

    val avgGrade = ((firstStudent + secondStudent + thirdStudent + fourthStudent).toFloat()) / 4

    println(avgGrade)
}