package SpicesAbstract

sealed class Spice (
    open var spiciness: String,
    open var name: String) {


    var heat: Int = 0
        get() {return  when (spiciness){
            "mild" ->5
            "spicy" ->10
            "hot" -> 15
            else -> 0
        }}

}
class Curry(name:String,spiciness: String) : Spice("mild", "Curry"),Grinder,SpiceColor,PrepareSpice {
    override var name= "Curry"
    override var spiciness= "mild"
    override var color: Color = YellowSpiceColor.color

    override fun grind(){
        println("$name grinder to powder")
        println("$color is the color of spice")
    }
    override fun prepareSpice() {
        var curry= Curry("","")

        println("Name: ${curry.name} Spiciness: ${curry.spiciness} Heat: ${curry.heat}")
        curry.grind()
    }
}
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}
interface Grinder {
    fun grind()
}

data class SpiceContainer(var spice: Spice){
    var label: String = spice.name
    init {
        label = spice.name
    }
}


interface SpiceColor{
    var color: Color
}

object YellowSpiceColor: SpiceColor{
    override var color = Color.YELLOW

    }
interface PrepareSpice {
    fun prepareSpice(){
        println("Lets prepare!")
    }
}