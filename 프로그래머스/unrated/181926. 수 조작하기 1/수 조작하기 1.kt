class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        control.map {
            when(it) {
                'w' ->  answer =  answer + 1 
                's' ->  answer =  answer - 1
                'd' ->  answer =  answer + 10
                'a' ->  answer =  answer - 10
            }
        }
        return answer
    }
}