package scl.bitmanipulation.flippingbits

/**
 * https://www.hackerrank.com/challenges/flipping-bits
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines()
      .drop(1)
      .map(_.toLong.flip)
      .foreach(println)
  }

  implicit class UInt(n: Long) {
    def flip: Long = ((~n) << 32) >>> 32
  }

}