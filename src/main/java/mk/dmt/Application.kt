package mk.dmt

import mk.dmt.checksum.Checksum
import mk.dmt.trio.Color.*
import mk.dmt.trio.ResistorColorTrio

class Application {
}

fun main() {
    var rc = Checksum.isValid("4539 1488 0343 6467")
    println(rc)
    rc = Checksum.isValid("4556 7375 8689 9855")
    println(rc)

    var r = ResistorColorTrio.text(ORANGE, ORANGE, BLACK)
    println(r)
    r = ResistorColorTrio.text(ORANGE, ORANGE, RED)
    println(r)
    r = ResistorColorTrio.text(ORANGE, ORANGE, ORANGE)
    println(r)
    r = ResistorColorTrio.text(ORANGE, ORANGE, GREEN)
    println(r)

}