package mk.dmt.checksum

import org.junit.Assert.assertEquals
import org.junit.Test

class ChecksumTest {

    @Test
    fun valid_credit_card_number() = assertEquals(true, Checksum.isValid("4539 1488 0343 6467"))

    @Test
    fun invalid_credit_card_number() = assertEquals(false, Checksum.isValid("4539 1488 0343 6567"))
}
