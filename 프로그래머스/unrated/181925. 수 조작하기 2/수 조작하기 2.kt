class Solution {
    fun solution(numLog: IntArray): String {
        var answer = StringBuilder()
        for(i in 0 until numLog.count()-1) {
            when(numLog[i+1] - numLog[i]) {
                1 -> answer.append('w')
                -1 -> answer.append('s')
                10 -> answer.append('d')
                -10 -> answer.append('a')
            }
        }
        return answer.toString()
    }
}