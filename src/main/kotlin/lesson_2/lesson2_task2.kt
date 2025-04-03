package org.example.lesson_2

fun main() {
    val countOfEmployees: Int = 50
    val salaryOfEmployee: Int = 30_000
    val countOfInterns: Int = 30
    val salaryOfInterns: Int = 20_000

    val totalSalaryOfEmployees: Int = salaryOfEmployee * countOfEmployees
    val totalSalary: Int = salaryOfInterns * countOfInterns + totalSalaryOfEmployees
    val avgSalary: Int = totalSalary / (countOfEmployees + countOfInterns)

    println(totalSalaryOfEmployees)
    println(totalSalary)
    println(avgSalary)
}