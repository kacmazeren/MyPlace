package Amazon

import com.sun.source.tree.BinaryTree
import jdk.incubator.vector.VectorOperators
import jdk.incubator.vector.VectorOperators.Binary
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion

/*
* Given a positive integer N, the task is to count the total number of set bits in binary representation of all numbers from 1 to N.

Examples:

Input: N = 3
Output:  4
Explanation: Numbers from 1 to 3: {1, 2, 3}
Binary Representation of 1: 01 -> Set bits = 1
Binary Representation of 2: 10 -> Set bits = 1
Binary Representation of 3: 11 -> Set bits = 2
Total set bits from 1 till 3 = 1 + 1 + 2 = 4

Input: N = 6
Output: 9
* */

fun makeBinary(n : Int) {

    val num = 1
    val numbers = Array<Int>(n) { 0 }
    for (i in 0 until n) {
        numbers[i] = num + i
    }
    var sum = 0
    var binNum = ""
    for (j in numbers.indices) {
            binNum = Integer.toBinaryString(numbers[j])
        for (char in binNum){
            if (char == '1'){
                sum++
            }
        }
    }
    println(sum)
}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    makeBinary(n)
}