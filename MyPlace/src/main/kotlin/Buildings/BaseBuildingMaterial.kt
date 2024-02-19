package Buildings

open class BaseBuildingMaterial(val numberNeeded: Int = 1) {

}
class Brick:BaseBuildingMaterial(numberNeeded = 8){

}
class Wood:BaseBuildingMaterial(numberNeeded = 4){
}
class Building <T: BaseBuildingMaterial>(val buildingMaterial: T) {

    private val baseMaterialsNeeded = 200
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }

}

fun main(args: Array<String>) {
    Building(Wood()).build()
    Building(Brick()).build()
    isSmallBuilding(Building(Brick()))

}
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}



