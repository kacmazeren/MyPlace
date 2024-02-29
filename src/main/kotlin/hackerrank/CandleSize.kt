package hackerrank

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    val maxValue = candles.max()
    var count = 0
    for (candle in candles)
        if(candle == maxValue){
            count += 1
        }
return count
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}