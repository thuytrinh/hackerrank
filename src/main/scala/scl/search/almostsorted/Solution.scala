package scl.search.almostsorted

/**
 * https://www.hackerrank.com/challenges/almost-sorted
 */
object Solution {
  def main(args: Array[String]) {
    readInt()
    val list = readLine().split(" ").map(_.toInt).toList
    println(canSort(list))
  }

  def canSort(list: List[Int]): String = {
    if (list.length == 2 && list.head > list.last) {
      "yes\nswap 1 2\n"
    } else {
      val unsorted = (0 until list.length - 1).map(i => {
        if (list(i) > list(i + 1)) (i, 1) else (i, 0)
      }).filter(p => p._2 == 1).toList
      unsorted.length match {
        case l if l < 2 => "no\n"
        case l if l == 2 =>
          "yes\nswap %d %d\n".format(
            unsorted.head._1 + 1,
            unsorted.last._1 + 2
          )
        case _ =>
          if ((unsorted.last._1 - (unsorted.head._1 - 1)) == unsorted.length) {
            "yes\nreverse %d %d\n".format(
              unsorted.head._1 + 1,
              unsorted.last._1 + 2
            )
          } else {
            "no\n"
          }
      }
    }
  }
}