class Solution {
    fun solution(l: Int, r: Int): IntArray {
    var answer: IntArray = intArrayOf()
        val resultArray = mutableListOf<Int>()
        for (i in l .. r) {
            val numString = i.toString()
            var containsOnly5And0 = true
            for (char in numString) {
                if (char != '0' && char != '5') {
                    containsOnly5And0 = false
                    break
                }
            }
            if (containsOnly5And0) {
                resultArray.add(i)
            }
        }
        answer = resultArray.toIntArray()
        if(answer.isEmpty()) answer = intArrayOf(-1)
        return answer
    }
}