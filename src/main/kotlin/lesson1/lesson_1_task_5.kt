package org.example.lesson1

fun main() {
    val totalSecondsInSpace = 6480
    val secondInHour = 3600
    val secondInMinutes = 60

    val hours = totalSecondsInSpace / secondInHour
    val minutes = (totalSecondsInSpace % secondInHour) / secondInMinutes
    val seconds = totalSecondsInSpace % secondInMinutes

    val formatTime = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(formatTime)
}