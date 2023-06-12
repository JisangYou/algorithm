class Solution {
    fun solution(a: Int, b: Int): Int {
        val left = a.toString() + b.toString()
        val right = b.toString() + a.toString()
    return maxOf(left.toInt(), right.toInt())
    }
}