package scl.sorting.insertionsort1

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 */
object Solution {
  def main(args: Array[String]) {
    val count = readInt()
    val ints = new Array[Int](count)
    readLine().split(" ")
      .map(_.toInt)
      .copyToArray(ints)

    sort(ints, state => println(state.mkString(" ")))
  }

  def sort(ints: Array[Int], callback: Array[Int] => Unit): Unit = {
    val v = ints.last
    var p = ints.length - 1
    for (i <- ints.length - 2 to 0 by -1 if ints(i) > v) {
      ints(i + 1) = ints(i)
      callback(ints)
      p = i
    }

    if (p != ints.length - 1) {
      ints(p) = v
      callback(ints)
    }
  }
}