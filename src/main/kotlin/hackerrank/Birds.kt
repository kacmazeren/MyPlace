package hackerrank

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    var counter1 = 0
    var counter2 = 0
    var counter3 = 0
    var counter4 = 0
    var counter5 = 0
    for(ar in arr){
        when(ar) {
            1 -> {
                counter1 += 1
            }

            2 -> {
                counter2 += 1
            }

            3 -> {
                counter3 += 1
            }

            4 -> {
                counter4 += 1
            }

            5 -> {
                counter5 += 1
            }

            else -> break
        }
    }
    val bigCounter = mapOf<Int,Int>(1 to counter1,2 to counter2,3 to counter3,4 to counter4,5 to counter5,)

    val bigger = bigCounter.maxByOrNull { it.value } // mapten ikili çekti
    val bigerKey = bigger!!.key
    return  bigerKey
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
