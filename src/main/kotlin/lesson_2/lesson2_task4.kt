package org.example.lesson_2

fun main() {
    val crystalMineral: Int = 7
    val metallMineral: Int = 11
    val buffRatio: Float = 1.2f

    val crystalMineralBuffOnly = (crystalMineral * buffRatio) - crystalMineral
    val metallMineralBuffOnly = (metallMineral * buffRatio) - metallMineral

    println(crystalMineralBuffOnly.toInt())
    println(metallMineralBuffOnly.toInt())
}