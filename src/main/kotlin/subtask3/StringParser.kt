package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val input = inputString
        val arr = mutableListOf<String>()
        var curr = 0
        for (i in input.withIndex()) {
            if (i.value == '[' ||i.value == '<' ||  i.value == '(') {
                val end = when (i.value) {
                    '<' -> '>'
                    '[' -> ']'
                    '(' -> ')'
                    else -> ' '
                }
                for (j in i.index + 1 until input.length) {
                    if (input[j] == i.value) curr++
                    if (input[j] == end) {
                        if (curr == 0) {
                            arr.add(input.substring(i.index + 1 until j))
                        } else curr--
                    }
                }
            }
        }
        return arr.toTypedArray()
    }
}