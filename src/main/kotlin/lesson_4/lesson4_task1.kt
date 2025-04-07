package org.example.lesson_4

const val NUMBER_OF_TABLES: Int = 13

fun main() {
    val reservedTablesToday: Int = NUMBER_OF_TABLES
    val reservedTablesTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${NUMBER_OF_TABLES > reservedTablesToday}\n" +
            "Доступность столиков на завтра: ${NUMBER_OF_TABLES > reservedTablesTomorrow}")
}