package hackerrank

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val newGrades = Array<Int>(grades.size, { 0 })

    for (i in newGrades.indices) {
        val grade = grades[i]
        var sum = grade
            if (grade % 5 > 2 && grade>= 38) {
                sum = grade + (5 - grade % 5)
            } else sum = grade


        newGrades.set(i, sum)
    }
    return newGrades
}
fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()
    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }
    val result = gradingStudents(grades)
    println(result.joinToString("\n"))
}
