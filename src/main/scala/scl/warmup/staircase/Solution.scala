package scl.warmup.staircase

/**
 * https://www.hackerrank.com/challenges/staircase
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines().map(_.toInt).foreach(n => {
      (1 to n).foreach(i => {
        (1 to (n - i)).foreach(_ => print(" "))
        (1 to i).foreach(_ => print("#"))
        println()
      })
    })
  }
}