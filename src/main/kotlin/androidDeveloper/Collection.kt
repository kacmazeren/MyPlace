package androidDeveloper

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

        val solarSystemList = listOf("Mercury", "Venus", "EarthList", "MarsList", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemList.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystemList[2])
    println(solarSystemList.get(3))
    println(solarSystemList.indexOf("EarthList"))
    for (planet in solarSystemList) {
        println(planet)
    }
    val solarSystemMutList = mutableListOf("MercuryMutList", "VenusMutList", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystemMutList.add("Pluto")
    solarSystemMutList.add(3, "Theia")
    solarSystemMutList[3] = "Future Moon"
    println(solarSystemMutList[3])
    println(solarSystemMutList[9])
    println("Future Moon" in solarSystemMutList)
println()
    val solarSystemSet = mutableSetOf("MercurySet", "VenusSet", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemSet.size)
    solarSystemSet.add("Pluto")
    println(solarSystemSet.contains("Pluto"))
    println(solarSystemSet.size)
    solarSystemSet.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    println()
    val solarSystemMap = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystemMap.size)
    solarSystemMap["Pluto"] = 5
    println(solarSystemMap.size)
    println(solarSystemMap["Pluto"])
    println(solarSystemMap.get("Theia"))
    solarSystemMap.remove("Pluto")
    println(solarSystemMap.size)
    solarSystemMap["Jupiter"] = 78
    println(solarSystemMap["Jupiter"])
}