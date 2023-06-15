class Solution {
    fun solution(num_list: IntArray): Int {
        var result1 = num_list[0]
        var result2 = num_list[0]
        for ( i in 1 until num_list.count()) {
            result1 = result1*num_list[i]
            result2 += num_list[i]
        }
        
        return if (result1<result2*result2) 1 else 0
    }
}