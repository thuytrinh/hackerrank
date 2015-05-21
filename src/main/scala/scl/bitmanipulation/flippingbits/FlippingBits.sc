val v = 1
Integer.toBinaryString(v)

// How to convert this into an unsigned Long?
val notV = ~v
Integer.toBinaryString(notV)
Integer.toBinaryString(notV >>> 1)
val l = (notV.toLong << 32) >>> 32