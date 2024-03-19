package org.example

fun main(){
    val buff = 20
    val crystal = 7
    val ironOre = 11

    val crystalBuff = (crystal/100.0) * buff
    val ironOreBuff = (ironOre/100.0) * buff

    println("Кристалов добыто: $crystal, с баффом: ${crystalBuff.toInt()}")
    println("Железной руды добыто: $ironOre, с баффом: ${ironOreBuff.toInt()}")
}