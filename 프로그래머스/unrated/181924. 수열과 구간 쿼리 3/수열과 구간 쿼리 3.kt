class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        queries.map { sublist ->
            answer = swapElements(arr, sublist[0], sublist[1])
        }
        return answer
    }
}
fun swapElements(array: IntArray, index1: Int, index2: Int): IntArray {
    val temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
    return array
}