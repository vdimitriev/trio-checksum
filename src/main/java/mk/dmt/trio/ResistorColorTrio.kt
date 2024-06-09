package mk.dmt.trio

object ResistorColorTrio {
    fun text(vararg input: Color): String {
        //Write your code here
        val input1 = Color.valueOf(input[0].name).i.toString()
        val input2 = Color.valueOf(input[1].name).i.toString()
        val countZero = Color.valueOf(input[2].name).i
        val totalLength = ("$input1$input2" + "0".repeat(countZero)).length
        return "${findValue(input1, input2, totalLength)} ${findUnit(totalLength)}"
    }
    private fun findUnit(len: Int) = Unit.entries.first{ unit: Unit -> unit.lengths.contains(len) }.value
    private fun findValue(val1: String, val2: String, len: Int) = when(len.mod(3)) {
        1 -> "$val1.$val2"
        2 -> val1 + val2
        3 -> val1 + val2 + "0"
        else -> val1 + val2
    }
}

