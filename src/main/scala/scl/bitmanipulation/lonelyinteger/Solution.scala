package scl.bitmanipulation.lonelyinteger

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines().drop(1)
      .map(_.split(" ").map(_.toInt).foldLeft(0)((x, y) => x ^ y))
      .foreach(println)
  }
}