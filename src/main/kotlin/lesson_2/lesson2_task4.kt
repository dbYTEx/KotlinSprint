package org.example.lesson_2

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val crystalMineral: Int = 7
    val metallMineral: Int = 11
    val buffRatio: Int = 20

    val crystalMineralBuffOnly: Int = crystalMineral * buffRatio / ONE_HUNDRED_PERCENT
    val metallMineralBuffOnly: Int = metallMineral * buffRatio / ONE_HUNDRED_PERCENT

    println(crystalMineralBuffOnly)
    println(metallMineralBuffOnly)
}