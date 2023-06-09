fun main(args: Array<String>) {
	val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()
    val result = StringBuilder()
    for (i: Int in 0 until a) {
        result.append(s1)
    }
    print(result)
}