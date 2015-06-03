package scl.bitmanipulation.sansaxor

/**
 * https://www.hackerrank.com/challenges/sansa-and-xor
 */
object Solution {
  def main(args: Array[String]): Unit = {
    (0 until readInt()) foreach (_ => {
      readInt()
      println(xorSubs(readLine().split(" ").map(_.toInt)))
    })
  }

  def xorSubs(array: Array[Int]): Int = {
    if (array.length % 2 == 0)
      0
    else {
      val subCount = array.length / 2
      (0 to subCount).map(i => {
        if (i % 2 == 0)
          if (i == subCount)
            array.slice(i, array.length).foldLeft(0)((x, y) => x ^ y)
          else
            array(i)
        else
          array(i + subCount)
      }).foldLeft(0)((x, y) => x ^ y)
    }
  }
}