package org.example.lesson2

fun main(){
    //example 1
    val studentOne = 3
    val studentTwo = 4
    val studentTree = 3
    val studentFour = 5

    val averageRating = (studentOne + studentTwo + studentTree + studentFour)/4
    println(averageRating)

    //example 2
    val studentAverage = arrayOf(3,4,3,5)

    val averageMark = studentAverage.sum()/studentAverage.size
    println(averageMark)

}