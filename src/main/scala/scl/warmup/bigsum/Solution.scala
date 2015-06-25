package scl.warmup.bigsum

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines()
      .drop(1)
      .map(_.split(" ").map(_.toLong))
      .map(_.sum)
      .foreach(println)
  }
}