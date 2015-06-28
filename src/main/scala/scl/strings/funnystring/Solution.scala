package scl.strings.funnystring

/**
 * https://www.hackerrank.com/challenges/funny-string
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines()
      .drop(1)
      .map(isFunny)
      .foreach(println)
  }

  def isFunny(s: String): String = {
    val size = s.length
    for (i <- 0 to size / 2) {
      val l = Math.abs(s.charAt(i) - s.charAt(i + 1))
      val r = Math.abs(s.charAt(size - i - 1) - s.charAt(size - i - 2))
      if (l != r)
        return "Not Funny"
    }

    "Funny"
  }
}