package SpicesAbstract

fun main(args: Array<String>) {

 var spice = Curry("","")
 spice.grind()
    spice.prepareSpice()


    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy"))
    )
    spiceCabinet.forEach { println(it.label) }  // label değişmiyor
}
/*
fun prepareSpice(){
    var curry= Curry()

    println("Name: ${curry.name} Spiciness: ${curry.spiciness} Heat: ${curry.heat}")
curry.grind()

}*/