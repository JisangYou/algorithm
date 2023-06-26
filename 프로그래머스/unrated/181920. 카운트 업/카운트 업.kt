class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var arrayList = arrayListOf<Int>()
        for(i in start .. end){
            arrayList.add(i)
        }
        answer = arrayList.toIntArray()
        return answer
    }
}