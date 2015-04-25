package scl.warmup.utopiantree

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
object Solution {
  def main(args: Array[String]): Unit = {
    val testCount = readInt()
    (1 to testCount).map(_ => {
      val n = readInt()
      var h = 1
      (0 until n).foreach(s => {
        h += (if (s % 2 == 0) h else 1)
      })
      h
    }).foreach(println)
  }
}