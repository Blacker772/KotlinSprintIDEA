package org.example

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var stepNumber = 1
    var action = "[$whereFrom-$where;$stepNumber]"
    println(action)

    whereFrom = "D2"
    where = "D3"
    stepNumber += 1
    action = "[$whereFrom-$where;$stepNumber]"
    println(action)
}