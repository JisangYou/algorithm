class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = num_list.copyOf(num_list.count()+1)
        val last = num_list[num_list.count()-1]
        val preLast = num_list[num_list.count()-2]
        var newLast = 0
        if (last > preLast) {
            newLast = last - preLast
        } else {
            newLast = last * 2
        }
        answer[num_list.count()] = newLast
        return answer
    }
}