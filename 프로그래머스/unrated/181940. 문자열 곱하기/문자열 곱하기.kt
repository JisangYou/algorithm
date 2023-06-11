class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        var strBuilder: StringBuilder = StringBuilder()
        for (i in 0 until k) {
            strBuilder.append(my_string)
        }
        return strBuilder.toString()
    }
}