package example.myapp

abstract class AquariumFish : AquariumAction {
    abstract val color: String
    override fun eat() = println("yum")
}
class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus (fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

interface FishColor {
    val color: String
}
interface FishAction  {
    fun eat()
}
interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim()  {
        println("swim")
    }
}
object GoldColor : FishColor {
    override val color = "gold"
}
sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}
