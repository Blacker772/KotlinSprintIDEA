package org.example

fun main() {

    val bonus = 20
    val crystal = 7
    val iron = 11
    val percent = 100.0

    val bonusCrystal = (crystal / percent) * bonus
    val bonusIron = (iron / percent) * bonus

    println("Кристалов добыто: $crystal, c баффом: ${bonusCrystal.toInt()}")
    println("Железо добыто: $iron, c баффом: ${bonusIron.toInt()}")
}