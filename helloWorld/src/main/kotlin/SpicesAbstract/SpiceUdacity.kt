package SpicesAbstract

abstract class SpiceUdacity(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

/*class Currys: SpiceUdacity (name  : String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : SpiceUdacity(name, spiciness, color), Grinder {
    override fun grind() {
    }}*/