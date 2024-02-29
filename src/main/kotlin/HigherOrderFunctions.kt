data class HigherOrderFunctions(val numbers: List<Int> = listOf<Int>(1,2,3,4,5,6,7,8,9,0))

 fun divide ():List<Int>{
    val div3 : MutableList<Int> = mutableListOf()

        for (number in HigherOrderFunctions().numbers)
            if (number % 3 == 0) {
                div3.add(number)
            }else {div3.remove(number)}
     println(div3)
        return div3
    }
fun main(args: Array<String>) {
    println(HigherOrderFunctions().numbers)
    divide()
}



/* Udacity answer
* fun main(args: Array,) {
    val numbers = listOf,(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.divisibleBy {
        it.rem(3)
    })
}
* */