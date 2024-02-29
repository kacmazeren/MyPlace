package hackerrank

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var choccolate = s
    var calculator = 0
    var array = Array<Int?>(m,{null})
    var count = 0
    for (i in 0 until s.size - m + 1) {
        val segment = s.sliceArray(i until i + m)
        if (segment.sum() == d) {
            count++
        }
    }
    /*

    for (i in s.indices) {
            if ((i + 1) <= s.size -1  && s[i].plus(s[i + 1]) == d) {
                calculator += 1
            }else if (s.size == 1 && s[0] == d){
                calculator += 1
            }

    }*/
    return count
}
    fun main(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val d = first_multiple_input[0].toInt()

        val m = first_multiple_input[1].toInt()

        val result = birthday(s, d, m)

        println(result)
    }
