package scala.warmup.solvemefirst

/**
 * https://www.hackerrank.com/challenges/solve-me-first
 */
object Solution {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}