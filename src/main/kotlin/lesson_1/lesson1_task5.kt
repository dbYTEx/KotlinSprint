package org.example.lesson_1

fun main() {
    val secondsInSpace: Int = 6480 // сколько СЕКУНД Гагарин пробыл в Космосе (из задачи №4)

    val hoursInSpace: Int // сколько ЧАСОВ Гагарин пробыл в Космосе
    val minutesInSpace: Int // сколько МИНУТ Гагарин пробыл в Космосе

    minutesInSpace = secondsInSpace / 60 // вычисляем минуты в космосе деля количество секунд на 60 (кол-во секунд/мин)
    hoursInSpace = minutesInSpace / 60 // вычисляем часы в космосе деля количество минут на 60 (кол-во минут/час)
    val minutesInSpaceLeft: Int =
        minutesInSpace - (hoursInSpace * 60) // объявляем переменную и записываем в неё остаток минут за вычетом часа
    val secondsInSpaceLeft: Int =
        secondsInSpace - ((minutesInSpaceLeft * 60) + (hoursInSpace * (60 * 60))) // объявляем переменную и записываем в неё остаток секунд за вычетом часов и минут

    println("0$hoursInSpace:$minutesInSpaceLeft:0$secondsInSpaceLeft")
}