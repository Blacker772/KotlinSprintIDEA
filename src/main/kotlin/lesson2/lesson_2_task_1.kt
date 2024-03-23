package org.example.lesson2

fun main() {

    val studentOne = 3
    val studentTwo = 4
    val studentTree = 3
    val studentFour = 5
    val numbersOfStudent = 4

    val averageRating = (studentOne + studentTwo + studentTree + studentFour) / numbersOfStudent.toFloat()
    println(String.format("%.2f", averageRating))

    val studentAverage = arrayOf(3, 4, 3, 5)
    val averageMark = studentAverage.sum() / studentAverage.size.toFloat()
    println(String.format("%.2f", averageMark))
}