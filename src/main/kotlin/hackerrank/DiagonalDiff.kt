package hackerrank

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var leftDiagonal = 0
    for (i in 0 until arr.size-1)
        leftDiagonal += arr[i][i]
    val rightDiagonal = 0

return rightDiagonal
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })


    for (i in 0 until n-1) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        for (j in 0 until n-1) {
            print("${arr[i][j]} ")
        }
        println()
    }

}