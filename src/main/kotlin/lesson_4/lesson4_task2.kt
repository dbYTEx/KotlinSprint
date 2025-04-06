package org.example.lesson_4

fun main() {
    val averageCategoryMinWeight: Int = 35
    val averageCategoryMaxWeight: Int = 100
    val averageCategoryMaxVolume: Int = 100

    println("Груз с весом 20 кг и объёмом 80 л соответствует категории 'Average': ${(20 > averageCategoryMinWeight) && (20 <= averageCategoryMaxWeight) && (80 < averageCategoryMaxVolume)}")
    println("Груз с весом 50 кг и объёмом 100 л соответствует категории 'Average': ${(50 > averageCategoryMinWeight) && (50 <= averageCategoryMaxWeight) && (100 < averageCategoryMaxVolume)}")
}