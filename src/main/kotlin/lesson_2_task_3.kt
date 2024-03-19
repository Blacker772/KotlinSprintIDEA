package org.example

fun main(){
    val timeDepartureHour = 9
    val timeDepartureMinute = 39
    val travelTime = 457

    val arrivalTimeHour = travelTime/60
    val arrivalTimeMinute = travelTime % 60

    println("${String.format("%02d", arrivalTimeHour)}:${String.format("%02d", arrivalTimeMinute)}")
}