package scala.easy.solvemesecond

/**
 * https://www.hackerrank.com/challenges/solve-me-second
 */
object Solution {
  def main(args: Array[String]): Unit = {
    val testCount = readInt()
    (1 to testCount).map(_ => readLine().split(" ").map(_.toInt).sum).foreach(println(_))
  }
}