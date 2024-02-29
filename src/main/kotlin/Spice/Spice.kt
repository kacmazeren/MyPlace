package Spice

class Spice (var name: String , var spiciness: String = "mild"){

    var heat: Int = 0
        get() {return  when (spiciness){
            "mild" ->5
            "spicy" ->10
            "hot" -> 15
            else -> 0
        }}
    fun spices () = listOf(Spice("curry", "mild"),
        Spice("black pepper","hot")
    )
}