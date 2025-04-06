package org.example.lesson_4

fun main() {
    val totalNumberOfTables: Int = 13
    val reservedTablesToday: Int = totalNumberOfTables
    val reservedTablesTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${totalNumberOfTables > reservedTablesToday}\nДоступность столиков на завтра: ${totalNumberOfTables > reservedTablesTomorrow}")
}