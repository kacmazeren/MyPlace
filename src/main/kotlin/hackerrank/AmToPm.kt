package hackerrank

import java.text.SimpleDateFormat
import java.util.*

fun timeConversion(s: String): String {
    // Write your code here
    val time12 = SimpleDateFormat("hh:mm:ssa", Locale.ENGLISH)
    val time24 = SimpleDateFormat("HH:mm:ss ", Locale.ENGLISH)
    val convertTime12 = time12.parse(s)
    val convertTime24 = time24.format(convertTime12!!)
    return convertTime24.toString()
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}