package mk.dmt.trio
import org.junit.Test
import mk.dmt.trio.Color.*
import org.junit.Assert.assertEquals

class TrioTest {

    @Test
    fun orange_orange_black() = assertEquals("33 ohms", ResistorColorTrio.text(ORANGE, ORANGE, BLACK))

    @Test
    fun orange_orange_red() = assertEquals("3.3 kiloohms", ResistorColorTrio.text(ORANGE, ORANGE, RED))

    @Test
    fun orange_orange_orange() = assertEquals("33 kiloohms", ResistorColorTrio.text(ORANGE, ORANGE, ORANGE))

    @Test
    fun orange_orange_green() = assertEquals("3.3 megaohms", ResistorColorTrio.text(ORANGE, ORANGE, GREEN))

    @Test
    fun orange_orange_grey() = assertEquals("3.3 gigaohms", ResistorColorTrio.text(ORANGE, ORANGE, GREY))

    @Test
    fun orange_orange_blue() = assertEquals("33 megaohms", ResistorColorTrio.text(ORANGE, ORANGE, BLUE))

}