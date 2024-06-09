package mk.dmt.checksum

object Checksum {
    fun isValid(number: String): Boolean {
        //Check if string is valid checksum
        val digitList:MutableList<Int> = mutableListOf()
        number.toCharArray().forEach { if(!it.isWhitespace()) digitList.add(it.digitToInt()) }
        var sum = 0
        for(i in digitList.size - 1 downTo 0) {
            var digit = digitList[i]
            if(i.mod(2) == 0) digit *= 2;
            if (digit  > 9) digit -= 9
            sum += digit
        }
        return sum % 10 == 0;
    }
}