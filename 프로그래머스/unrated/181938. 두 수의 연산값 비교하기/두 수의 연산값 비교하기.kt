class Solution {
    fun solution(a: Int, b: Int): Int {
        val plus = a.toString() + b.toString()
        val multiple = 2 * a * b
        return maxOf(plus.toInt(), multiple)
    }
}