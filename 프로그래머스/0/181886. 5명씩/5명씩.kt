class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = names.filterIndexed { index, _ -> index % 5 == 0 }.toTypedArray()
        return answer
    }
}