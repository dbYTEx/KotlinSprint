package org.example.lesson_5

import kotlin.math.pow

const val CM_IN_METER: Float = 100.0f
const val MIN_IMT: Float = 18.5f
const val NORMAL_IMT: Float = 25.0f
const val EXCESS_IMT: Float = 30.0f

fun main() {
    println("Добро пожаловать в калькулятор ИМТ (индекс массы тела).")
    println("Какой у Вас вес (в кг)?")
    val userWeight: Double = readln().toDouble()
    println("Какой у Вас рост (в см)?")
    val userHeight: Float = readln().toFloat()
    val userHeightInMeters: Float = userHeight / CM_IN_METER
    val calculateIMT = userWeight / userHeightInMeters.pow(2)

    when {
        (calculateIMT < MIN_IMT) ->
            println("Ваш индекс массы тела: ${String.format("%.2f", calculateIMT)}. Недостаточная масса тела.")

        (MIN_IMT <= calculateIMT && calculateIMT < NORMAL_IMT) ->
            println("Ваш индекс массы тела: ${String.format("%.2f", calculateIMT)}. Нормальная масса тела.")

        (NORMAL_IMT <= calculateIMT && calculateIMT < EXCESS_IMT) ->
            println("Ваш индекс массы тела: ${String.format("%.2f", calculateIMT)}. Избыточная масса тела.")

        (calculateIMT >= EXCESS_IMT) ->
            println("Ваш индекс массы тела: ${String.format("%.2f", calculateIMT)}. Ожирение.")
    }
}