package scl.implementation.finddigits

/**
 * https://www.hackerrank.com/challenges/find-digits
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines()
      .drop(1)
      .map(_.toLong)
      .map(digits)
      .foreach(println)
  }

  def digits(n: Long): Int = {
    var r = n
    var c = 0
    do {
      val d = r % 10
      if (d != 0 && n % d == 0)
        c += 1
      r = r / 10
    } while (r != 0)
    c
  }
}