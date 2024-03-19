package org.example

import java.util.Calendar

fun main(){
    val name = "Nurlan"
    val dayGreeting = "Добрый день"
    val eveningGreeting = "Добрый вечер"

    val localTime = Calendar.getInstance()
    val time = localTime.get(Calendar.HOUR_OF_DAY)

    if (time <= 18){
        println("$dayGreeting, $name")
    } else{
        println("$eveningGreeting, $name")
    }

}