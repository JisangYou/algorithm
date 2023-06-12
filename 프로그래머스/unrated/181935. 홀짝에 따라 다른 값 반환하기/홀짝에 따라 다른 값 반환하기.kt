class Solution {
    fun solution(n: Int): Int {
        var odd: Int = 0
        var even: Int = 0
        for (i in 0..n) {
            if (n % 2 == 1 && i % 2 == 1) {
                odd += i
            } else if(n % 2 == 0 && i % 2 == 0) {
                even += i*i
            }
        }
       
        return if (n % 2 == 1) odd else even 
    }
}