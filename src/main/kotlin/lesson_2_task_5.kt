package org.example

import kotlin.math.pow

fun main(){
    val clientDep = 70_000
    val interestRate = 16.7
    val period = 20

    val result = clientDep * (1 + (interestRate/100)).pow(period)
    println(String.format("%.3f", result))
}