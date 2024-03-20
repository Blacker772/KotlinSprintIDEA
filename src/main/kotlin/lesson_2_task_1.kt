package org.example

fun main() {
    val studentOne = 3.0
    val studentTwo = 4.0
    val studentTree = 3.0
    val studentFour = 5.0
    val numbersOfStudent = 4.0

    val averageRating = (studentOne + studentTwo + studentTree + studentFour) / numbersOfStudent
    println(String.format("%.2f", averageRating))

    val studentAverage = arrayOf(3.0, 4.0, 3.0, 5.0)
    val averageMark = studentAverage.sum() / studentAverage.size
    println(String.format("%.2f", averageMark))
}