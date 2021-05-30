package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        val toReturn = sadArray.toMutableList()
        var i = 1
        while (i < toReturn.size - 1) {
            if (i != 0 && toReturn[i] > toReturn[i + 1] + toReturn[i - 1]) {
                toReturn.removeAt(i)
                i--
            } else {
                i++
            }
        }
        return toReturn.toIntArray()
    }
}