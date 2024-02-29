package Game

class Game() {
    var path: MutableList<Directions> = mutableListOf(Directions.Start)
    var north = {Directions.North}
    var south = {Directions.South}
    var east = {Directions.East}
    var west = {Directions.West}

    fun move(where: (Directions) -> Boolean ) {

       makeMove("n")
    }
    fun makeMove(movement:String?) {
        when (movement){
            "n" -> north
            "s" -> south
            "w" -> west
            "e" -> east
            else -> Directions.End
        }
    }
}

