class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        var arr: ArrayList<Char> = ArrayList()
        for(i in 0 until index_list.count()) {
            for ((index, character) in my_string.withIndex()) {
                if(index_list[i] == index) {
                    arr.add(character)
                }
            }
        }
        return arr.joinToString("")
        // return index_list.map { my_string[it] }.joinToString("")
    }
}