package org.example.lesson_4

const val SUNNY_WEATHER: Boolean = true
const val AWNING_OPENED: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "зима"

fun main() {
    val isWeatherSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "зима"

    print("Благоприятные ли условия сейчас для роста бобовых? ")
    print(
        """
        ${
            (isWeatherSunny == SUNNY_WEATHER) && 
            (isAwningOpen == AWNING_OPENED) && 
            (airHumidity >= AIR_HUMIDITY) && 
            (timeOfYear != TIME_OF_YEAR)
        }
        """.trimIndent()
    )
}