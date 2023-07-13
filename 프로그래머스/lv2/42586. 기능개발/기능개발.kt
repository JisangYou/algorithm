import java.util.*
class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val queue = LinkedList<Int>()
        val list = arrayListOf<Int>()
        var count = 1
        for(i in 0 until progresses.count()) {
            queue.add(Math.ceil((100 - progresses[i]) / speeds[i].toDouble()).toInt())
        }
        var pre = queue.pop()
        while (queue.isNotEmpty()) {
            var cur = queue.pop()
            println("pre : " + pre +", cur : " + cur +", count : "+count)
            
            if (pre < cur) {
                list.add(count)
                count = 1
                pre = cur
                
            } else {
                count++
            }
        }
        list.add(count)
        return list.toIntArray()
    }
}