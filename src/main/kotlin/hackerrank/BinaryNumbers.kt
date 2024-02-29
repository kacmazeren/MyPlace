package hackerrank

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val binNum = Integer.toBinaryString(n)
    var currentStreak = 0
    var maxStreak = 0
    for (char in binNum) {
        if (char == '1') {
            currentStreak++
        } else {
            maxStreak = maxOf(maxStreak, currentStreak)
            currentStreak = 0
        }
    }

    maxStreak = maxOf(maxStreak, currentStreak)
    println(maxStreak)
}


fun binary() {
}