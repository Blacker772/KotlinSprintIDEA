package org.example

fun main(){

    val employee = 50
    val employeeSalary = 30000
    val interns = 30
    val internsSalary = 20000

    //расход на постоянных сотрудников
    val expensesEmployee = employee * employeeSalary
    println(expensesEmployee)

    //общий расход по ЗП
    val expensesInterns = interns * internsSalary
    val generalExpenses = expensesEmployee + expensesInterns
    println(generalExpenses)

    //среднее ЗП
    val averageSalary = (expensesEmployee + expensesInterns)/(employee + interns)
    println(averageSalary)
}