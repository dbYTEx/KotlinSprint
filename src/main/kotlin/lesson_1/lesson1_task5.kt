package org.example.lesson_1

const val secondsInMinute: Int = 60
const val minutesInHour: Int = 60

fun main() {
    val secondsInSpace: Int = 6480

    val hoursInSpace: Int = secondsInSpace / (secondsInMinute * minutesInHour)
    val minutesInSpace: Int = secondsInSpace / secondsInMinute

    val minutesInSpaceLeft: Int = minutesInSpace % (hoursInSpace * minutesInHour)
    val secondsInSpaceLeft: Int = secondsInSpace % (minutesInSpace * secondsInMinute)

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpaceLeft, secondsInSpaceLeft))
}