package org.example.lesson_4

const val NUMBER_IS_EVEN: Int = 2

fun main() {
    val dayOfTraining: Int = 6

    val isEven: Boolean = dayOfTraining % NUMBER_IS_EVEN == 0

    println("""
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent())
}