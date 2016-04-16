package scl.warmup.plusminus

/**
 * https://www.hackerrank.com/challenges/plus-minus
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines()
      .drop(1)
      .map(_.split(" ").map(_.toInt))
      .flatMap(fractions)
      .map("%.3f".format(_))
      .foreach(println)
  }

  def fractions(ints: Array[Int]): Array[Float] = {
    var p = 0.0f
    var n = 0.0f
    var z = 0.0f
    ints.foreach(i => {
      if (i > 0) p = p + 1
      else if (i == 0) z = z + 1
      else n = n + 1
    })
    val total = ints.length
    Array(p / total, n / total, z / total)
  }
}