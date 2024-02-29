package hackerrank

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var max: Int = 0
    var min: Int = scores[0]
    val listMax = Array<Int?>(scores.size, { null })
    val listMin = Array<Int?>(scores.size, { null })
    val listCounter = Array<Int>(2, { 0 })
    var maxCounter = 0
    var minCounter = 0
    for (i in 0..scores.size-1) {
        if (scores[i] ==0){
            maxCounter+=1
        }else if (max < scores[i]) {
            max = scores[i]
            maxCounter+=1
            listMax.set(i,max)
            listCounter.set(0, maxCounter-1)
        } else if (min > scores[i]) {
            min = scores[i]
            minCounter+=1
            listMin.set(i,min)
            listCounter.set(1, minCounter)
        }
    }
    println("maxList:" + listMax.joinToString(" "))
    println("minList:" + listMin.joinToString(" "))
    return listCounter
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}