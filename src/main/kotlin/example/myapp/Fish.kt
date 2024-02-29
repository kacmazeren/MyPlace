package example.myapp

data class Fish (var name: String)
fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase
    with (fish.name) {
        println(capitalize())
    }
    myWith (fish.name) {
        println(capitalize())
    }
    fish.run {
        name
        println(name.capitalize())
    }
    val fish2 = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish2.name)
    println(fish.let { it.name.capitalize()}
        .let{it + "fish"}
        .let{it.length}
        .let{it + 31})
    println(fish)

}
fun myWith(name: String, block: String.() -> Unit) {
    name.block()

}
fun runExample() {
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a Runnable")
        }
    }
    JavaRun.runNow(runnable)
}
fun runExample2() {
    JavaRun.runNow {
        println("Passing a lambda as a Runnable")
    }
}
fun main () {
    fishExamples()
    runExample()
    runExample2()
}