class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string 
        queries.forEach { element ->
        val reversedPart = answer.substring(element[0], element[1] + 1).reversed()
        answer = answer.substring(0, element[0]) + reversedPart + answer.substring(element[1] + 1)
    }
        
        return answer
    }
}