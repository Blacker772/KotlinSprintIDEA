package org.example.lesson3

fun main(){

    val name = "Татьяна"
    var surname = "Андреева"
    val patronymic = "Сергеевна"
    var age = 20

    println("$surname $name $patronymic $age")

    surname = "Сидорова"
    age += 2
    println("$surname $name $patronymic $age")
}