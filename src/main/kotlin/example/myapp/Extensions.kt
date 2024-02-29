package example.myapp

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
    println("Does it have spaces?".hasSpaces())
}
