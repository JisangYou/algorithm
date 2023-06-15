class Solution {
    fun solution(num_list: IntArray): Int {
        var even = StringBuilder()
        var odd = StringBuilder()
        
        for (i in 0 until num_list.count()) {
            if (num_list[i] % 2 == 0) {
                even.append(num_list[i]) 
            } else {
                odd.append(num_list[i])
            }
        }
        
        return even.toString().toInt() + odd.toString().toInt()
    }
}