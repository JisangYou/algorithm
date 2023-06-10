class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val startIndex = s
        val endIndex = s + overwrite_string.length
        val overwritten = my_string.replaceRange(startIndex, endIndex, overwrite_string)
        return overwritten
    }
}