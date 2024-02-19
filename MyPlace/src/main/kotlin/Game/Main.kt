package Game

fun main(args: Array<String>) {

    val game = Game()
    println(game.path)
    game.path.add(Directions.West)
    game.path.add(Directions.East)
    game.path.add(Directions.North)
    game.path.add(Directions.South)
    println(game.path)

    game.path.add(Directions.End)
    println("Game over")
    println(game.path)
    game.path.removeAll(Directions.values().toSet())
    println(game.path)
}