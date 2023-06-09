fun main(args: Array<String>) {
    val s1 = readLine()!!
    val splitStr = s1.toCharArray()
    var result = StringBuilder()
    splitStr.map {
        if (it.isUpperCase()) {
            result.append(it.lowercaseChar())
        } else {
            result.append(it.uppercaseChar())
        }
    }
    print(result)
    
}