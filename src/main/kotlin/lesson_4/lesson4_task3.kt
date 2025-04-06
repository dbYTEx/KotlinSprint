package org.example.lesson_4

fun main() {
    val isWeatherSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isWeatherSunny == true && isAwningOpen == true && airHumidity >= 20 && timeOfYear != "зима"}")
}