class Solution {
    fun solution(code: String): String {
        val strBuilder = StringBuilder()
        var mode = 0
        
      
        for (idx in 0 until code.length) {
            if (mode == 0 && code[idx] != '1' && idx % 2 == 0) {
                strBuilder.append(code[idx])
            } else if (mode == 0 && code[idx] == '1') {
                mode = 1
            } else if (mode == 1 && code[idx] != '1' && idx % 2 == 1){
                strBuilder.append(code[idx])
            } else if (mode == 1 && code[idx] == '1') {
                mode = 0
            } 
        }
        
          if (strBuilder.toString().isBlank()) {
              return "EMPTY"
            }
        return strBuilder.toString()
    }
}