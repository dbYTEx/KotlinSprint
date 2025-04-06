package org.example.lesson_4

const val NUMBER_IS_EVEN: Int = 2

fun main() {
    var dayOfTraining: Int = 1
    dayOfTraining = 5

    println("""
        Упражнения для рук:    ${dayOfTraining % NUMBER_IS_EVEN != 0}
        Упражнения для ног:    ${dayOfTraining % NUMBER_IS_EVEN == 0}
        Упражнения для спины:  ${dayOfTraining % NUMBER_IS_EVEN == 0}
        Упражнения для пресса: ${dayOfTraining % NUMBER_IS_EVEN != 0}
    """.trimIndent())
}