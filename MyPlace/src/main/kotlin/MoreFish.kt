import java.lang.Math.random

fun main(args: Array<String>) {

    fitMoreFish(10.0, listOf(3,3,3))
    fitMoreFish(8.0, listOf(2,2,2))
    fitMoreFish(9.0, listOf(1,1,3), 3)
    fitMoreFish(10.0, listOf(), 7, true)

    val random1 = random()
    val random2 = {random()} // aralarındaki fark random1 aynı sayıyı random2 her seferinde farklı bir sayıyı çeviriyor.
    println("$random1  --  ${random2.invoke()}")
    println("$random1  --  ${random2.invoke()}")
}

fun fitMoreFish(tankSize: Double = 20.0,
                currentFish: List<Int> = listOf<Int>(1,2,33,44,55,66) ,
                fishSize: Int = 2,
                hasDecorations : Boolean = false ): Boolean {

println("tankSize: $tankSize ,  currentFish: $currentFish , hasDecorations: $hasDecorations")

    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}
