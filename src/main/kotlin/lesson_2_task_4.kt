package org.example

fun main() {
    val buff = 20
    val crystal = 7
    val ironOre = 11
    val percent = 100.0

    val crystalBuff = (crystal / percent) * buff
    val ironOreBuff = (ironOre / percent) * buff

    println("Кристалов добыто: $crystal, с баффом: ${crystalBuff.toInt()}")
    println("Железной руды добыто: $ironOre, с баффом: ${ironOreBuff.toInt()}")
}