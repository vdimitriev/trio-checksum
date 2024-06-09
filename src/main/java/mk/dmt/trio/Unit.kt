package mk.dmt.trio

enum class Unit(val value: String, val lengths: List<Int>) {
    OHMS("ohms", listOf(1,2,3)),
    KILOOHMS("kiloohms", listOf(4,5,6)),
    MEGAOHMS("megaohms", listOf(7,8,9)),
    GIGAOHMS("gigaohms", listOf(10,11,12)),
    TERAOHMS("teraohms", listOf(13,14,15)),
    PETAOHMS("petaohms", listOf(16,17,18)),
    EXAOHMS("exaohms", listOf(19,20,21));
}