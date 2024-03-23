package org.example.lesson2

fun main() {
    val timeDepartureHour = 9
    val timeDepartureMinute = 39
    val travelTime = 457
    val minutesInHour = 60
    val oneHour = 1

    var arrivalTimeHour = travelTime / minutesInHour
    var arrivalTimeMinute = travelTime % minutesInHour

    arrivalTimeHour += timeDepartureHour
    arrivalTimeMinute += timeDepartureMinute

    if (arrivalTimeMinute >= minutesInHour){
        arrivalTimeHour += oneHour
        arrivalTimeMinute -= minutesInHour
    }
    println("${String.format("%02d", arrivalTimeHour)}:${String.format("%02d", arrivalTimeMinute)}")
}