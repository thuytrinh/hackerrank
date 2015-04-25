package scl.warmup.maximizingxor

/**
 * https://www.hackerrank.com/challenges/maximizing-xor
 */
object Solution {
  def main(args: Array[String]) {
    println(findMaxXor(
      io.Source.stdin.getLines().take(2).map(_.toInt).toList
    ))
  }

  def findMaxXor(pair: List[Int]): Int = {
    (pair.head to pair.last).flatMap(i => {
      (i to pair.last).map(j => i ^ j)
    }).max
  }
}