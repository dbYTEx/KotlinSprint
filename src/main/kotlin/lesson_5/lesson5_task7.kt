package org.example.lesson_5

fun main() {
    println("Давайте посчитаем сколько Вы потратите денег на топливо за поездку?")

    println("Укажите расстояние поездки (в километрах):")
    val tripRange: Float = readln().toFloat()
    println("Укажите расход топлива на 100 км (в литрах):")
    val fuelConsumption: Float = readln().toFloat()
    println("Укажите текущую цену за литр топлива:")
    val fuelPriceNow: Float = readln().toFloat()

    val fuelNeed: Float = (tripRange * fuelConsumption) / 100
    val fuelPriceTotal: Float = fuelNeed * fuelPriceNow

    println(
        """
        |Общее количество необходимого топлива: $fuelNeed
        |Итоговая стоимость поездки: ${String.format("%.2f", fuelPriceTotal)}
    """.trimMargin()
    )
}