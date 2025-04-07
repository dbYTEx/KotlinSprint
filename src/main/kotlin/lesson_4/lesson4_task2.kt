package org.example.lesson_4

const val MIN_WEIGHT: Int = 35
const val MAX_WEIGHT: Int = 100
const val MAX_VOLUME: Int = 100

fun main() {
    val firstCargoWeight: Int = 20
    val firstCargoVolume: Int = 80
    val secondCargoWeight: Int = 50
    val secondCargoVolume: Int = 100

    val isFirstCargoAverage: Boolean =
        (firstCargoWeight > MIN_WEIGHT) && (firstCargoWeight <= MAX_WEIGHT) && (firstCargoVolume < MAX_VOLUME)
    val isSecondCargoAverage: Boolean =
        (secondCargoWeight > MIN_WEIGHT) && (secondCargoWeight <= MAX_WEIGHT) && (secondCargoVolume < MAX_VOLUME)

    println("Груз с весом $firstCargoWeight кг и объёмом $firstCargoVolume л соответствует категории 'Average': " +
            "$isFirstCargoAverage")
    println("Груз с весом $secondCargoWeight кг и объёмом $secondCargoVolume л соответствует категории 'Average': " +
            "$isSecondCargoAverage")
}