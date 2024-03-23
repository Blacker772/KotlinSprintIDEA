fun main() {

    val reservedTablesToDay = 13
    val reservedTablesTomorrow = 9

    val freeTablesToDay = reservedTablesToDay < TOTAL_TABLES
    val freeTablesTomorrow = reservedTablesTomorrow < TOTAL_TABLES

    println("[Доступность столиков на сегодня:$freeTablesToDay]\n" +
            "[Доступность столиков на завтра:$freeTablesTomorrow]"
    )
}
const val TOTAL_TABLES = 13