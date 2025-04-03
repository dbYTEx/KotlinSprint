package org.example.lesson_1

const val secondsInMinute: Int = 60
const val minutesInHour: Int = 60

fun main() {
    val secondsInSpace: Int = 6480

    val hoursInSpace: Int
    val minutesInSpace: Int

    minutesInSpace = secondsInSpace / secondsInMinute
    hoursInSpace = minutesInSpace / minutesInHour
    val minutesInSpaceLeft: Int = minutesInSpace - (hoursInSpace * minutesInHour)
    val secondsInSpaceLeft: Int = secondsInSpace - ((minutesInSpaceLeft * secondsInMinute) + (hoursInSpace * (minutesInHour * secondsInMinute)))

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpaceLeft, secondsInSpaceLeft))
}