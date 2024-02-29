package hackerrank

import java.math.BigInteger

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var arraySum = BigInteger("0")
    for (ar in arr) {
        arraySum += ar.toBigInteger()
    }
    val minSum : Any = (arraySum - arr.max().toBigInteger())
    val maxSum : Any = (arraySum - arr.min().toBigInteger())
    println("$minSum $maxSum")

}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}