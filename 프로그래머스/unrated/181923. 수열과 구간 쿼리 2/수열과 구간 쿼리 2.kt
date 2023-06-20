class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = IntArray(queries.size) { -1 }
        for (i in 0 until queries.size) {
            var minDiff = Int.MAX_VALUE
            for (j in queries[i][0] .. queries[i][1]) {
                    if (queries[i][2] < arr[j]) {
                        if (minDiff > arr[j]){
                            minDiff = arr[j]
                            println("i = " + i)
                            println("arr[j] = " + arr[j])
                            answer[i] = arr[j]
                        }
                      }
                }
            }
        return answer
    }
}