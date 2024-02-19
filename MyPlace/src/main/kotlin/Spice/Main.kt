package Spice

fun main(args: Array<String>) {
    var simpleSpice = SimpleSpice()

    println("Name: ${simpleSpice.name}  and heat: ${simpleSpice.heat}")


    var spiceClass = Spice("black pepper","spicy")
    println("${spiceClass.name}  ${spiceClass.heat}")

    println("${spiceClass.spices()}")

    val spicesList = spiceClass.spices()
    println("Spices list:")
    for (spice in spicesList) {
        println("${spice.name} ${spice.heat}")
    }
}