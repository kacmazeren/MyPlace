package hackerrank

fun numberOfItems(s: String, startIndices: Array<Int>, endIndices: Array<Int>): Array<Int> {
    // Write your code here
    var char = s.toCharArray()
    var newArray = arrayOf<Int>()
    var starCalculator = 0
    var string =""
    for(i in startIndices.toString().toInt() until endIndices.toString().toInt())
        string.plus(char[i])

    println(char.joinToString { "" })
    return newArray
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val startIndicesCount = readLine()!!.trim().toInt()

    val startIndices = Array<Int>(startIndicesCount, { 0 })
    for (i in 0 until startIndicesCount) {
        val startIndicesItem = readLine()!!.trim().toInt()
        startIndices[i] = startIndicesItem
    }

    val endIndicesCount = readLine()!!.trim().toInt()

    val endIndices = Array<Int>(endIndicesCount, { 0 })
    for (i in 0 until endIndicesCount) {
        val endIndicesItem = readLine()!!.trim().toInt()
        endIndices[i] = endIndicesItem
    }

    val result = numberOfItems(s, startIndices, endIndices)

    println(result.joinToString("\n"))
}
