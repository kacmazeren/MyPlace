package hackerrank

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here

    val itemCounts: MutableMap<Int, Int> = ar.groupingBy { it }.eachCount().toMutableMap()
    for (counts in itemCounts){
        if (counts.value > 1){
            counts.setValue(counts.value/2)
        }else{counts.setValue(0)}
    }
    val sum = itemCounts.values.sum()
    /*
    val tempArray = HashMap<Int,Int>()
    for (i in ar.indices){
        var counter = 0
        for (j in i+1 until ar.size) {
            if (ar[i] == ar[j]) {
                counter += 1
                tempArray[ar[i]] = counter

            }
        }
    }
    for (k in 0 until tempArray.size){
        val correction = tempArray.getValue(ar[k])/2
        tempArray.set(ar[k],correction)
    }

     */
    return sum
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
