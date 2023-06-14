class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var flag = false
        if (ineq == "<" && eq == "=") {
            flag = n <= m
        } else if (ineq == "<" && eq == "!") {
            flag = n < m
        } else if (ineq == ">" && eq == "=") {
            flag = n >= m
        } else if (ineq == ">" && eq == "!") {
            flag = n > m
        }
        return if (flag) 1 else 0
    }
}