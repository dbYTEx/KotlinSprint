package org.example.lesson_4

const val SHIP_DAMAGED: Boolean = false
const val MIN_TEAM_COUNT: Int = 55
const val MAX_TEAM_COUNT: Int = 70
const val MIN_FOOD_COUNT: Int = 50
const val WEATHER_IS_GOOD: Boolean = true

fun main() {
    val isShipDamaged: Boolean = true
    val teamCount: Int = 70
    val foodCount: Int = 51
    val isWeatherGood: Boolean = true

    val canShipDepart: Boolean =
        ((isShipDamaged == SHIP_DAMAGED) && (teamCount >= MIN_TEAM_COUNT) && (teamCount <= MAX_TEAM_COUNT) && (foodCount > MIN_FOOD_COUNT)) ||
                ((teamCount == MAX_TEAM_COUNT) && (isWeatherGood == WEATHER_IS_GOOD) && (foodCount >= MIN_FOOD_COUNT))

    println("Может ли корабль отправиться в плавание? $canShipDepart")
}