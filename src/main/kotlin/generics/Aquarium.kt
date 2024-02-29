package generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}
class FishStoreWater : WaterSupply(false)
class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

}
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R
inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T
fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")
interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}
class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) =   waterSupply.addChemicalCleaners()
}
fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

fun genericsExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    val aquarium2 = Aquarium(TapWater())
    println(aquarium2.waterSupply)
    val aquarium3 = Aquarium(LakeWater())
    if (aquarium3.waterSupply == null) {
        println("waterSupply is null")
    }
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()

    addItemTo(aquarium)
    val cleaner = TapWaterCleaner()
    val aquarium5 = Aquarium(TapWater())
    aquarium5.addWater(cleaner)
    isWaterClean<TapWater>(aquarium)
    println(aquarium.hasWaterSupplyOfType<TapWater>())
    println(aquarium.waterSupply.isOfType<TapWater>())
}

fun main() {
    genericsExample()
        }