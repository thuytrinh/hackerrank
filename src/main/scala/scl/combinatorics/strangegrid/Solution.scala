package scl.combinatorics.strangegrid

/**
 * https://www.hackerrank.com/challenges/strange-grid
 */
object Solution {
  def main(args: Array[String]): Unit = {
    println(findValue(readLine().split(" ").map(_.toInt)))
  }

  def findValue(cell: Array[Int]): Long = {
    val r = cell.head
    val c = cell.last

    // Even if this gets accepted, how is it related to combinatorics? Weird!
    (Math.ceil(r / 2.0).toLong - 1) * 10 + (c - 1) * 2 + (if (r % 2 == 0) 1 else 0)
  }
}