class Solution {
    fun solution(number: String): Int {
        var answer: Int = 0
        return number.map {it.toString().toInt() }.sum() % 9
    }
}