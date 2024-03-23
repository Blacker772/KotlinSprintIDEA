fun main() {

    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val cargoOneWeight = 20
    val cargoOneVolume = 80

    val cargoTwoWeight = 50
    val cargoTwoVolume = 100

    println(
        "Груз с весом $cargoOneWeight кг и объемом $cargoOneVolume л соответствует категории 'Average': " +
                "${cargoOneWeight in minWeight..maxWeight && cargoOneVolume <= maxVolume}\n" +
                "Груз с весом $cargoTwoWeight кг и объемом $cargoTwoVolume л соответствует категории 'Average': " +
                "${cargoTwoWeight in minWeight..maxWeight && cargoTwoVolume <= maxVolume}"
    )
}