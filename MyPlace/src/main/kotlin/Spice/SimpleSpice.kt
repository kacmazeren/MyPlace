package Spice

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"
    var heat: Int = if (spiciness=="mild"){5}else{1}
    /*dersten örnek heat tanımı için
    * val heat: Int
        get() {return 5 }
    * */
    var heat1: Int = 1
        get() {return 5 }

    var heat2: Int = when (spiciness){
        "mild" ->5
        "spicy" ->10
        else -> 0
    }

}