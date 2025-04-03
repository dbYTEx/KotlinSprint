package org.example.lesson_1

const val SECONDS_IN_MINUTE: Int = 60
const val MINUTES_IN_HOUR: Int = 60

fun main() {
    val secondsInSpace: Int = 6480

    val hoursInSpace: Int = secondsInSpace / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)
    val minutesInSpace: Int = secondsInSpace / SECONDS_IN_MINUTE

    val minutesInSpaceLeft: Int = minutesInSpace % (hoursInSpace * MINUTES_IN_HOUR)
    val secondsInSpaceLeft: Int = secondsInSpace % (minutesInSpace * SECONDS_IN_MINUTE)

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpaceLeft, secondsInSpaceLeft))
}