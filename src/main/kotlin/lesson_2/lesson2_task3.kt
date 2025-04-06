package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hourOfDeparture: Int = 9
    val minuteOfDeparture: Int = 39
    val minutesInTravel: Int = 457

    val hourOfArrival: Int = hourOfDeparture + ((minuteOfDeparture + minutesInTravel) / MINUTES_IN_HOUR)
    val minuteOfArrival: Int = (minuteOfDeparture + minutesInTravel) % MINUTES_IN_HOUR

    println("Поезд прибывает в $hourOfArrival:$minuteOfArrival")
}