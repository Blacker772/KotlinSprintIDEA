package org.example.lesson3

fun main() {
    val userStep = "D2-D4;0"
    val split = userStep.split("-", ";")
    val whereFrom = split[0]
    val where = split[1]
    val stepNumber = split[2]
    println(whereFrom)
    println(where)
    println(stepNumber)
}