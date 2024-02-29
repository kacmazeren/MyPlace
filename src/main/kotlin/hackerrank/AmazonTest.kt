package hackerrank

fun minimalHeaviestSetA(arr: Array<Int>): Array<Int> {
    // Write your code here
    var sum = arr.sumOf { it }
    val sortedArray  = arr.sortedArrayDescending()
    val findMax : Int = sortedArray[0]
    val findSecondMax : Int = sortedArray[1]
    val findThirdMax : Int = sortedArray[2]
    var sumA :Int = (findMax + findSecondMax)
    var sumB = sum - sumA
    var answer = arrayOf(findSecondMax,findMax)
    return answer
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = Array<Int>(arrCount, { 0 })
    for (i in 0 until arrCount) {
        val arrItem = readLine()!!.trim().toInt()
        arr[i] = arrItem
    }

    val result = minimalHeaviestSetA(arr)

    println(result.joinToString("\n"))
}