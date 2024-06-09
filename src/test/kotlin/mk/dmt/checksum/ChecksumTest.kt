package mk.dmt.checksum

import org.junit.Assert.assertEquals
import org.junit.Test

class ChecksumTest {

    @Test
    fun validcreditcardnumber() = assertEquals(true, Checksum.isValid("4539 1488 0343 6467"))
}
