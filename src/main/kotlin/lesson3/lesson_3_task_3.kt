package org.example.lesson3

fun main() {
    val number = 9
    val arrayOfNumber = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println("$number x ${arrayOfNumber[0]} = ${number * arrayOfNumber[0]}\n" +
            "$number x ${arrayOfNumber[1]} = ${number * arrayOfNumber[1]}\n" +
            "$number x ${arrayOfNumber[2]} = ${number * arrayOfNumber[2]}\n" +
            "$number x ${arrayOfNumber[3]} = ${number * arrayOfNumber[3]}\n" +
            "$number x ${arrayOfNumber[4]} = ${number * arrayOfNumber[4]}\n" +
            "$number x ${arrayOfNumber[5]} = ${number * arrayOfNumber[5]}\n" +
            "$number x ${arrayOfNumber[6]} = ${number * arrayOfNumber[6]}\n" +
            "$number x ${arrayOfNumber[7]} = ${number * arrayOfNumber[7]}\n" +
            "$number x ${arrayOfNumber[8]} = ${number * arrayOfNumber[8]}"
    )
}