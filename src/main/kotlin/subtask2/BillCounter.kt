package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlySplit = "bon appetit"
        val bList: MutableList<Int> = bill.toMutableList()
        bList.removeAt(k)
        return if (bList.sum() / 2 == b) {
            fairlySplit
        } else {
            (b - bList.sum() / 2).toString()
        }
    }
}

